app.controller('petsController',['$scope','apiService',function ($scope,apiService) {

	$scope.hihi = "never mind";
	
	test();

	function test(){
		apiService.getAPI("persons")
        .then(function(d) {
        	$scope.porsen = d;
        },
        function(errResponse){
            console.error('Error while fetching Users');
        }
    );
	}

	console.log ($scope.porsen);

}]);