angular.module('main')
.service('dataService', function ($http) {
    this.helloConsole = function () {
        console.log('This is the hello console service');
    };

    this.getLeaderboard = function (callback) {
        console.log("Getting leaderboard...")
        $http.get('/leaderboardJSON').then(callback);
    }
});