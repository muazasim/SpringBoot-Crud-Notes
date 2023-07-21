package com.example.demo.controller;
import com.example.demo.entity.Notes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.example.demo.service.NotesService;
// import org.springframework.web.bind.annotation.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@org.springframework.stereotype.Controller
// @Controller
@CrossOrigin("http://localhost:3000/")
@RestController
public class NotesController {
@Autowired
private NotesService service;

@PostMapping("/saveNotes")
public Notes saveNotes(@RequestBody Notes notes)
{
  
return service.saveNotes(notes);
}

@GetMapping("/getAllNotes")
public List<Notes> getAllNotes()
{
return service.getAllNotes();
}

@PutMapping("/updateNotes")
public Notes updateNotes(@RequestBody Notes notes){
return service.updatebNotes(notes);
}
@DeleteMapping("/deleteNotes/{id}")
public String deleteNotes(@PathVariable int id )
{
    return service.deleteNotes(id);
}

}
