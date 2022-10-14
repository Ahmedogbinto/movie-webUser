package com.mycompany.dvdstore.moviewebUser.form;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class MovieForm {
    @NotBlank(message = "Veuillez entrez un titre")
    @Size(max=20, message = "Entrez un titre de 20 caractères ou plus")
    private String title;
    @NotBlank(message = "Veuillez choisir un genre")
    private String genre;
    private Long id;
    @NotBlank
    @Size(max=255, message = "Entrez une description de 255 caractères ou plus")
    private String description;

    @NotBlank(message = "Veuillez entrer le prémnom")
    @Size(max=20, message = "Entrez un prénom de 20 maximum")
    private String firstName;
    @NotBlank(message = "Veuillez entrer le nom")
    @Size(max=20, message = "Entrez un nom de 20 maximum")
    private String lastName;



    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getGenre() {
        return genre;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
