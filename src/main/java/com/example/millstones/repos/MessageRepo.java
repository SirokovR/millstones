package com.example.millstones.repos;

import com.example.millstones.domain.Message;
import org.springframework.data.repository.CrudRepository;

public interface MessageRepo extends CrudRepository<Message, Long>{

}
