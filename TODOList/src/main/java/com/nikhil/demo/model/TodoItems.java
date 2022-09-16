package com.nikhil.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.springframework.lang.NonNull;

@Entity
public class TodoItems {
private Long id;
@NonNull
private String title;
private boolean done;

@Id
@GeneratedValue
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public boolean isDone() {
	return done;
}
public void setDone(boolean done) {
	this.done = done;
}
@Override
public String toString() {
	return "TodoItems [id=" + id + ", title=" + title + ", done=" + done + "]";
}

}
