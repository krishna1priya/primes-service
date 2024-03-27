package edu.iu.krishna1priya.primesservice.controller;

import org.springframework.web.bind.annotation.*;

import edu.iu.krishna1priya.primesservice.service.IPrimesService;

@RestController
@CrossOrigin
@RequestMapping("/primes")
public class PrimesController {
    IPrimesService primesService;
    public PrimesController(IPrimesService primesService){
        this.primesService = primesService;
    }
        @GetMapping("/{n}")
    public boolean isPrimes(@PathVariable int n){
        return primesService.isPrime(n);
        }
}
