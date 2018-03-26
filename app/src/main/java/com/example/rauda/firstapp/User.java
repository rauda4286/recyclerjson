package com.example.rauda.firstapp;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by rauda on 03-22-18.
 */

public class User {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("min_total")
    @Expose
    private Integer minTotal;
    @SerializedName("max_total")
    @Expose
    private Integer maxTotal;
    @SerializedName("mileage")
    @Expose
    private Object mileage;
    @SerializedName("created_at")
    @Expose
    private String createdAt;
    @SerializedName("store")
    @Expose
    private User store;
    @SerializedName("vehicle")
    @Expose
    private Vehicle vehicle;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getMinTotal() {
        return minTotal;
    }

    public void setMinTotal(Integer minTotal) {
        this.minTotal = minTotal;
    }

    public Integer getMaxTotal() {
        return maxTotal;
    }

    public void setMaxTotal(Integer maxTotal) {
        this.maxTotal = maxTotal;
    }

    public Object getMileage() {
        return mileage;
    }

    public void setMileage(Object mileage) {
        this.mileage = mileage;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public User getStore() {
        return store;
    }

    public void setStore(User store) {
        this.store = store;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }


    public class Vehicle {


        @SerializedName("id")
        @Expose
        private Integer id;
        @SerializedName("vin")
        @Expose
        private Object vin;
        @SerializedName("make")
        @Expose
        private Object make;
        @SerializedName("model")
        @Expose
        private Object model;
        @SerializedName("year")
        @Expose
        private Integer year;
        @SerializedName("engine_size")
        @Expose
        private Object engineSize;
        @SerializedName("user_id")
        @Expose
        private Integer userId;
        @SerializedName("name")
        @Expose
        private String name;
        @SerializedName("state")
        @Expose
        private Object state;
        @SerializedName("country")
        @Expose
        private Object country;
        @SerializedName("description")
        @Expose
        private Object description;
        @SerializedName("status")
        @Expose
        private Object status;
        @SerializedName("min_brake_thickness")
        @Expose
        private Object minBrakeThickness;
        @SerializedName("num_doors")
        @Expose
        private Object numDoors;
        @SerializedName("drivetrain")
        @Expose
        private Object drivetrain;
        @SerializedName("customer_signature_url")
        @Expose
        private Object customerSignatureUrl;
        @SerializedName("technician_signature_url")
        @Expose
        private Object technicianSignatureUrl;
        @SerializedName("license")
        @Expose
        private Object license;
        @SerializedName("license_plate_state")
        @Expose
        private Object licensePlateState;
        @SerializedName("license_expiration_date")
        @Expose
        private Object licenseExpirationDate;

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public Object getVin() {
            return vin;
        }

        public void setVin(Object vin) {
            this.vin = vin;
        }

        public Object getMake() {
            return make;
        }

        public void setMake(Object make) {
            this.make = make;
        }

        public Object getModel() {
            return model;
        }

        public void setModel(Object model) {
            this.model = model;
        }

        public Integer getYear() {
            return year;
        }

        public void setYear(Integer year) {
            this.year = year;
        }

        public Object getEngineSize() {
            return engineSize;
        }

        public void setEngineSize(Object engineSize) {
            this.engineSize = engineSize;
        }

        public Integer getUserId() {
            return userId;
        }

        public void setUserId(Integer userId) {
            this.userId = userId;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Object getState() {
            return state;
        }

        public void setState(Object state) {
            this.state = state;
        }

        public Object getCountry() {
            return country;
        }

        public void setCountry(Object country) {
            this.country = country;
        }

        public Object getDescription() {
            return description;
        }

        public void setDescription(Object description) {
            this.description = description;
        }

        public Object getStatus() {
            return status;
        }

        public void setStatus(Object status) {
            this.status = status;
        }

        public Object getMinBrakeThickness() {
            return minBrakeThickness;
        }

        public void setMinBrakeThickness(Object minBrakeThickness) {
            this.minBrakeThickness = minBrakeThickness;
        }

        public Object getNumDoors() {
            return numDoors;
        }

        public void setNumDoors(Object numDoors) {
            this.numDoors = numDoors;
        }

        public Object getDrivetrain() {
            return drivetrain;
        }

        public void setDrivetrain(Object drivetrain) {
            this.drivetrain = drivetrain;
        }

        public Object getCustomerSignatureUrl() {
            return customerSignatureUrl;
        }

        public void setCustomerSignatureUrl(Object customerSignatureUrl) {
            this.customerSignatureUrl = customerSignatureUrl;
        }

        public Object getTechnicianSignatureUrl() {
            return technicianSignatureUrl;
        }

        public void setTechnicianSignatureUrl(Object technicianSignatureUrl) {
            this.technicianSignatureUrl = technicianSignatureUrl;
        }

        public Object getLicense() {
            return license;
        }

        public void setLicense(Object license) {
            this.license = license;
        }

        public Object getLicensePlateState() {
            return licensePlateState;
        }

        public void setLicensePlateState(Object licensePlateState) {
            this.licensePlateState = licensePlateState;
        }

        public Object getLicenseExpirationDate() {
            return licenseExpirationDate;
        }

        public void setLicenseExpirationDate(Object licenseExpirationDate) {
            this.licenseExpirationDate = licenseExpirationDate;
        }

        public class Store {
            @SerializedName("id")
            @Expose
            private Integer id;
            @SerializedName("name")
            @Expose
            private String name;
            @SerializedName("status")
            @Expose
            private Boolean status;

            public Integer getId() {
                return id;
            }

            public void setId(Integer id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public Boolean getStatus() {
                return status;
            }

            public void setStatus(Boolean status) {
                this.status = status;


            }
        }
    }
}




