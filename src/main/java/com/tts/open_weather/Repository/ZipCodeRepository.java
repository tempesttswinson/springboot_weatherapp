package com.tts.open_weather.Repository;

import com.tts.open_weather.Model.ZipCode;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ZipCodeRepository extends JpaRepository<ZipCode, Long> {
    public ZipCode findByZip(String zipCode);

}