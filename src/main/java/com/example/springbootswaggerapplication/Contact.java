package com.example.springbootswaggerapplication;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

@ApiModel(description = "Details about the contact")
public class Contact {

    @ApiModelProperty(notes = "The unique id of the contact")
    private Integer id;
    @ApiModelProperty(notes = "The person's name")
    private String name;
    @ApiModelProperty(notes = "The person's phone number")
    private String phone;
}
