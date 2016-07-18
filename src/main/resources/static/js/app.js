'use strict';

$(function () {
    $(".button-collapse").sideNav({edge: 'right'});
});

var mainModule = angular.module('main', [])

    .config(function($routeProvider) {
        $routeProvider
            .when("/leaderboard", {
                template : '<leaderboard></leaderboard>'
            })

    })


    .controller('MainController', function MainController($scope, dataService) {
        var app = this;
        this.hello = "Hello!";

        this.helloConsole = function () {
            console.log("Test");
        }

        this.getLeaderboard = function() {
            dataService.getLeaderboard(function(response) {
                console.log("Getting data...");
                app.leaderboard = response.data;
            });
        }
    })

    .component('loginForm', {
        templateUrl: 'components/login.html',
        controller: function () {
            this.login = "User1";
        }
    });


