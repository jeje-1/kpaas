package mz.farmer.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Embeddable
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Address {
    @Column(name = "address_basic", nullable = false)
    private String addressBasic;   // 기본 주소

    @Column(name = "address_detail", nullable = false)
    private String addressDetail;  // 상세 주소

    @Column(name = "address_zipcode", nullable = false)
    private String addressZipcode; // 우편 번호
}
