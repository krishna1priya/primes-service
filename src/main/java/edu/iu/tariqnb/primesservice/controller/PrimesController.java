package edu.iu.tariqnb.primesservice.controller;

import edu.iu.tariqnb.primesservice.service.IPrimesService;
import org.springframework.web.bind.annotation.*;

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
