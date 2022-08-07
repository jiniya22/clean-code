package me.jiniworld.clean.funcswitch;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class InvalidEmployeeType extends RuntimeException {
    public InvalidEmployeeType(EmployeeRecord.Type t) {
        super(t.name() + "타입은 지원하고 있지 않습니다");
    }
}
