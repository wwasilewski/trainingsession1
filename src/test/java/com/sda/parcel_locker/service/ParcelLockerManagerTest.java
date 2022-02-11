package com.sda.parcel_locker.service;

import com.sda.parcel_locker.model.Address;
import com.sda.parcel_locker.model.ParcelLocker;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class ParcelLockerManagerTest {

    ParcelLockerManager parcelLockerManager = new ParcelLockerManager();

    @Test
    void addLockerTest() {
        //given
        ParcelLocker parcelLocker = new ParcelLocker("NAME1", new Address("Szczecinska", "Szczecin", "71111"));

        //when


        //then
        assertThat(parcelLocker).isEqualTo(ParcelLockerManager.addLocker(parcelLocker));
    }

    @Test
    void showLockersTest() {
    }

    @Test
    void removeLockerTest() {
    }

    @Test
    void showLockersByCityTest() {
    }

    @Test
    void updateLockerNameTest() {
    }

    @Test
    void updateLockerAddressTest() {
    }
}