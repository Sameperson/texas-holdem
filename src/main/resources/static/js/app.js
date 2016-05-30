$(function () {
    $(".button-collapse").sideNav({edge: 'right'});
});

var mainModule = angular.module('main', []);

mainModule.controller('MainController', function MainController() {
    this.hello = "Hello!";
    this.louder = function () {
        this.hello += "!";
    };
});

mainModule.component('loginForm', {
    templateUrl : 'components/login.html',
    controller : function () {
        this.login = "User1";
    }
});