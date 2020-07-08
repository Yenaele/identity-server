package com.cwj.identity.controller;

import com.cwj.identity.model.Organization;
import com.cwj.identity.service.OrganizationService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author cwj
 */
@RestController
@RequestMapping("/organization")
public class OrganizationController {

    private final OrganizationService organizationService;

    public OrganizationController(OrganizationService organizationService) {
        this.organizationService = organizationService;
    }

    @GetMapping("/child/{parentId}")
    public List<Organization> getChild(@PathVariable("parentId") String parentId) {
        return organizationService.getChild(parentId);
    }
}
