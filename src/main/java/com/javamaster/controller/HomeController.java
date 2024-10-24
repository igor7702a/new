package com.javamaster.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Validated
@RestController
@Tag(name = "Обрацец для тестовых заданий", description = "Набор необходимых компонент")
public class HomeController {

    @GetMapping("/home")
    @Operation(summary = "Первый контроллер", description = "Логин и модель")
    public String home(
            @RequestParam(required = false) @Parameter(description = "Идентификатор пользователя") String login,
            @Parameter(description = "Модель") Model model)
    {
        System.out.println("login is: " + login);
        model.addAttribute("login", login);
        return "home_page";
    }
}
