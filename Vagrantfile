Vagrant.configure("2") do |config|

    config.vm.box = "hashicorp/bionic64"
    config.vm.provision "shell", inline: <<-SHELL
      apt-get install -y ansible
      git clone https://github.com/sobraljuanpa/tallerJenkins.git
      cd tallerJenkins
      ansible-playbook configureCICDServer.yml --extra-vars "ansible_become_pass=vagrant"
    SHELL
    config.vm.network :forwarded_port, guest: 8080, host: 8080
    config.vm.network :forwarded_port, guest: 7000, host: 7000
  
end
