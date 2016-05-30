var gulp = require("gulp"),
    util = require("gulp-util")
    // rename = require('gulp-rename'),
    log = util.log;

gulp.task("default", ["angular-handling"]);

gulp.task("angular-handling", function () {
    log("Getting angular " + (new Date()).toString());
    gulp.src("node_modules/angular/*")
        .pipe(gulp.dest("src/main/resources/static/vendor/angular"));
});