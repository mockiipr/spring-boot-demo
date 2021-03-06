package com.mockii.dao;

/**
 * Created by Chouhan on 12/4/16.
 */

import com.mockii.entity.Topic;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.transaction.Transactional;

@Transactional
public interface TopicDAO extends JpaRepository<Topic, Long> {

    /**
     * Return the Topic having the passed name or null if no topic is found.
     *
     * @param topic
     */
    Topic findByTopic(String topic);
    Topic findByTopicId(int ind);
}