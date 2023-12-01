package com.bootcoding.medappoint.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;

import java.util.Date;

@Builder
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Appointment {
    private Long id;
    private Long doctorId;
    private Long userId;
    private String slotId;
    private Date startTime;
}
