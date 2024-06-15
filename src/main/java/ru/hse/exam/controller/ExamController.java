package ru.hse.exam.controller;

import java.net.http.WebSocket;
import java.util.Random;

import javax.swing.Spring;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import ru.hse.exam.api.ExamApi;

@Controller
public class ExamController implements ExamApi {

    private final String[] firstQuestion = new String[] {
            "Что такое WebSocket и как он отличается от HTTP? В каких случаях целесообразно использовать WebSocket? Опишите процесс установления WebSocket соединения и его закрытия.",
            "Что такое STOMP и как он работает поверх WebSocket? Каковы преимущества использования STOMP? Какие основные команды STOMP вы знаете и для чего они используются?",
            "Дайте определение GraphQL. Какие проблемы он решает по сравнению с RESTful API? Опишите основные типы запросов в GraphQL и приведите примеры каждого из них.",
            "Какие недостатки и вызовы могут возникнуть при использовании GraphQL? В каких случаях вы бы рекомендовали использовать REST API вместо GraphQL и почему?",
            "Протоколы прикладного уровня: HTTP/1.1 и HTTP/2",
            "Протоколы транспортного уровня: TCP, UDP"

    };

    private final String[] secondQuestion = new String[] {
            "Что такое unit-тестирование и какова его цель? ",
            "Как создать и запустить простой unit-тест с использованием JUnit? Что такое аннотация @Test? Какие аннотации JUnit можно использовать при написании тестов? Приведите примеры.",
            "Какие проблемы решает Mockito при написании тестов? Как использовать Mockito для создания mock-объектов? Приведите примеры.",
            "В чем разница между @Mock и @InjectMocks аннотациями в Mockito? Какие основные методы Mockito используются для задания поведения mock-объектов? ",
            "Что такое интеграционное тестирование? Объясните разницу между unit-тестами и интеграционными тестами.",
            "Инструменты для написания тестов: JUnit и Mockito"
    };

    private final String[] thirdQuestion = new String[] {
            "Дайте определение понятиям идентификации, аутентификации и авторизации. В чем различие между ними?",
            "Что такое password-based authentication и какие у нее есть преимущества и недостатки? Объясните, как работает протокол HTTP Basic Authentication.",
            "Что такое аутентификация по токенам? Приведите пример flow такого способа аутентификации.",
            "Объясните, что такое Single Sign-On (SSO) и в чем его преимущества.",
            "Что такое JSON Web Token? Из каких основных частей формируется данный токен?",
            "Объясните разницу между access-токенами и refresh-токенами (и id-токеном?). Как происходит обновление access-токена с использованием refresh-токена?",
            "Объясните, как работают фильтры безопасности (security filters) в Spring Security и приведите примеры их использования. Как настроить аутентификацию с использованием JWT в Spring Security?"
    };

    private final Random random = new Random();

    @Override
    @GetMapping
    public String getRandom(Model model) {
        model.addAttribute("q1", firstQuestion[random.nextInt(firstQuestion.length)]);
        model.addAttribute("q2", secondQuestion[random.nextInt(secondQuestion.length)]);
        model.addAttribute("q3", thirdQuestion[random.nextInt(thirdQuestion.length)]);

        return "random.html";
    }

}
