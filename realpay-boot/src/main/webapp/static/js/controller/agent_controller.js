/**
 * 
 */

'use strict';
 
App.controller('AgentController', ['$scope', 'AgentService', function($scope, AgentService) {
          var self = this;
          self.agent={id:null,agentname:'',address:'',email:''};
          self.agents=[];
               
          self.fetchAllAgents = function(){
              AgentService.fetchAllAgents()
                  .then(
                               function(d) {
                                    self.agents = d;
                               },
                                function(errResponse){
                                    console.error('Error while fetching Currencies');
                                }
                       );
          };
            
          self.createAgent = function(agent){
              AgentService.createAgent(agent)
                      .then(
                      self.fetchAllAgents, 
                              function(errResponse){
                                   console.error('Error while creating Agent.');
                              } 
                  );
          };
 
         self.updateAgent = function(agent, id){
              AgentService.updateAgent(agent, id)
                      .then(
                              self.fetchAllAgents, 
                              function(errResponse){
                                   console.error('Error while updating Agent.');
                              } 
                  );
          };
 
         self.deleteAgent = function(id){
              AgentService.deleteAgent(id)
                      .then(
                              self.fetchAllAgents, 
                              function(errResponse){
                                   console.error('Error while deleting Agent.');
                              } 
                  );
          };
 
          self.fetchAllAgents();
 
          self.submit = function() {
              if(self.agent.id===null){
                  console.log('Saving New Agent', self.agent);    
                  self.createAgent(self.agent);
              }else{
                  self.updateAgent(self.agent, self.agent.id);
                  console.log('Agent updated with id ', self.agent.id);
              }
              self.reset();
          };
               
          self.edit = function(id){
              console.log('id to be edited', id);
              for(var i = 0; i < self.agents.length; i++){
                  if(self.agents[i].id === id) {
                     self.agent = angular.copy(self.agents[i]);
                     break;
                  }
              }
          };
               
          self.remove = function(id){
              console.log('id to be deleted', id);
              if(self.agent.id === id) {//clean form if the agent to be deleted is shown there.
                 self.reset();
              }
              self.deleteAgent(id);
          };
 
           
          self.reset = function(){
              self.agent={id:null,agentname:'',address:'',email:''};
              $scope.myForm.$setPristine(); //reset Form
          };
 
      }]);