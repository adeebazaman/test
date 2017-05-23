class RecipesController < ApplicationController
  def index
  	if !params[:search].nil?
  	else
  		params[:search] = "salad"
  	end
  	@recipes = Recipe.for(params[:search])
  end
end