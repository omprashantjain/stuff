# This file is used by Rack-based servers to start the application.

require 'active_support/all'
require ::File.expand_path('../config/environment',  __FILE__)
run JibberJabber::Application
