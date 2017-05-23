#require 'httparty'
class Recipe
  include HTTParty

  default_options.update(verify: false) # Turn off SSL verification
  key_value = ENV['FOOD2FORK_KEY']
  ENV["FOOD2FORK_KEY"] = "35266a74b902afca9b63150995cdcd0e"
  hostport = ENV['FOOD2FORK_SERVER_AND_PORT'] || 'www.food2fork.com'
  base_uri "http://#{hostport}/api"
  default_params key: ENV["FOOD2FORK_KEY"]
  format :json

  def self.for (keyword)
    get("/search", query: {q: keyword})["recipes"]
  end
end