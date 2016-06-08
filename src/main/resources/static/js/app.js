$(function () {
    $(".button-collapse").sideNav({edge: 'right'});
});

var mainModule = angular.module('main', [])

    .controller('MainController', function MainController($scope, dataService) {
        var me = this;
        this.hello = "Hello!";

        this.helloConsole = function () {
            console.log("Test");
        }

        dataService.getLeaderboard(function(response) {
            console.log("Getting data...");
            me.leaderboard = response.data;
        });
    })

    .component('loginForm', {
        templateUrl: 'components/login.html',
        controller: function () {
            this.login = "User1";
        }
    })

    .service('dataService', function ($http) {
        this.helloConsole = function () {
            console.log('This is the hello console service');
        };

        this.getLeaderboard = function (callback) {
            console.log("Getting leaderboard...")
            $http.get('/leaderboardJSON').then(callback);
        }
    });


