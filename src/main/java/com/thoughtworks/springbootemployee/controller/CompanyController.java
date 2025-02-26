package com.thoughtworks.springbootemployee.controller;

import com.thoughtworks.springbootemployee.model.Company;
import com.thoughtworks.springbootemployee.model.Employee;
import com.thoughtworks.springbootemployee.repository.CompanyRepository;
import com.thoughtworks.springbootemployee.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping(path = "/companies")
@RestController
public class CompanyController {

    //TODO: should have service layer for the company service
    @Autowired
    private CompanyRepository companyRepository;
    @Autowired
    EmployeeRepository employeeRepository;

    @GetMapping
    public List<Company> listAllCompanies() {
        return companyRepository.listAll();
    }

    @GetMapping("/{id}")
    public Company findCompaniesById(@PathVariable Long id){
        return companyRepository.findCompanyById(id);
    }
    @GetMapping("/{id}/employees")
    public List<Employee>getEmployeeByCompanyId(@PathVariable Long id){
        return employeeRepository.findEmployeeByCompanyId(id);
    }

    @GetMapping(params = {"pageNumber","pageSize"})
    public List<Company> listCompaniesByPage(@RequestParam Long pageNumber, @RequestParam Long pageSize){
        return companyRepository.listCompanyByPage(pageNumber,pageSize);
    }


    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/addCompany")
    public Company addCompany(@RequestBody Company company) {
        return companyRepository.saveCompany(company);
    }

    @PutMapping("/updateCompanies/{id}")
    public Company updateCompany(@PathVariable Long id, @RequestBody Company updatedCompany) {
        Company existingCompany = companyRepository.findCompanyById(id);

        existingCompany.setCompanyName(updatedCompany.getCompanyName());

        return existingCompany;
    }
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping ("/deleteCompanies/{id}")
    public String deleteCompany(@PathVariable Long id) {
        companyRepository.deleteCompany(id);
        return "Company " + id + " has been deleted.";
    }

}
