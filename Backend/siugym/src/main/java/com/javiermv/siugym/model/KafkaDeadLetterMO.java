package com.javiermv.siugym.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "kafka_dead_letter")
public class KafkaDeadLetterMO {
    @Id
    @SequenceGenerator()
}
