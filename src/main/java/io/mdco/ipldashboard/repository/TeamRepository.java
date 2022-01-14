package io.mdco.ipldashboard.repository;

import org.springframework.data.repository.CrudRepository;

import io.mdco.ipldashboard.model.Team;

public interface TeamRepository extends CrudRepository<Team, Long> {

    Team findByTeamName(String teamName);

}
