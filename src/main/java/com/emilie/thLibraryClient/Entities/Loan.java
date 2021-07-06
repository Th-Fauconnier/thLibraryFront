package com.emilie.thLibraryClient.Entities;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
public class Loan {

    private Long id;
    private Date loanStartDate;
    private Date loanEndDate;
    private boolean extended;
    private Copy copy;
    private User user;
}
