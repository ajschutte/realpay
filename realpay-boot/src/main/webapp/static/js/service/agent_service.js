/**
 * 
 */

'use strict'

App.factory('AgentService', ['$http', '$q', function($http, $q){
	
	return {
		fetchAllAgents: function() {
			return $http.get('http://localhost:8080/Realpay/agent/')
					.then (
							function(response){
									return response.data;
							},
							function(errResponse){
								console.error('Error while fetching agents');
								return $q.reject(errorResponse);
							}
						);
		},
		
        createAgent: function(user){
            return $http.post('http://localhost:8080/Realpay/agent/', agent)
                    .then(
                            function(response){
                                return response.data;
                            }, 
                            function(errResponse){
                                console.error('Error while creating agent');
                                return $q.reject(errResponse);
                            }
                    );
        },
        
        updateAgent: function(user, id){
            return $http.put('http://localhost:8080/Realpay/agent/'+id, agent)
                    .then(
                            function(response){
                                return response.data;
                            }, 
                            function(errResponse){
                                console.error('Error while updating agent');
                                return $q.reject(errResponse);
                            }
                    );
        },

        deleteAgent: function(id){
            return $http.delete('http://localhost:8080/Realpay/agent/'+id)
                    .then(
                            function(response){
                                return response.data;
                            }, 
                            function(errResponse){
                                console.error('Error while deleting agent');
                                return $q.reject(errResponse);
                            }
                    );
        }
 
	};
	
}]);