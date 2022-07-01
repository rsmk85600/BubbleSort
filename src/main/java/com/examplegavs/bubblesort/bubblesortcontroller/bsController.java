package com.examplegavs.bubblesort.bubblesortcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.examplegavs.bubblesort.bubblesortservice.bsService;

@RestController
public class bsController {

	@Autowired
	bsService bsservice;

	@GetMapping("/bubblesort")
	public int[] run(@RequestBody int[] array) {
		bsservice.bubblesort(array);
		return array;
	}
//	public int[] run(@RequestBody int[] array) {
//	bsservice.bubblesort(array);
//	return array;
//	}    

}
