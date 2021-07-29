package com.cos.pic.web;

import java.util.List;

public class AirportDto {

    public class Body {

        private Items items;
        private Integer numOfRows;
        private Integer pageNo;
        private Integer totalCount;

        public Items getItems() {
            return items;
        }

        public void setItems(Items items) {
            this.items = items;
        }

        public Body withItems(Items items) {
            this.items = items;
            return this;
        }

        public Integer getNumOfRows() {
            return numOfRows;
        }

        public void setNumOfRows(Integer numOfRows) {
            this.numOfRows = numOfRows;
        }

        public Body withNumOfRows(Integer numOfRows) {
            this.numOfRows = numOfRows;
            return this;
        }

        public Integer getPageNo() {
            return pageNo;
        }

        public void setPageNo(Integer pageNo) {
            this.pageNo = pageNo;
        }

        public Body withPageNo(Integer pageNo) {
            this.pageNo = pageNo;
            return this;
        }

        public Integer getTotalCount() {
            return totalCount;
        }

        public void setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
        }

        public Body withTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

    }

    class Header {

        private String resultCode;
        private String resultMsg;

        public String getResultCode() {
            return resultCode;
        }

        public void setResultCode(String resultCode) {
            this.resultCode = resultCode;
        }

        public Header withResultCode(String resultCode) {
            this.resultCode = resultCode;
            return this;
        }

        public String getResultMsg() {
            return resultMsg;
        }

        public void setResultMsg(String resultMsg) {
            this.resultMsg = resultMsg;
        }

        public Header withResultMsg(String resultMsg) {
            this.resultMsg = resultMsg;
            return this;
        }

    }

    class Item {

        private String airlineNm;
        private String arrAirportNm;
        private Long arrPlandTime;
        private String depAirportNm;
        private Long depPlandTime;
        private Integer economyCharge;
        private Integer prestigeCharge;
        private String vihicleId;

        public String getAirlineNm() {
            return airlineNm;
        }

        public void setAirlineNm(String airlineNm) {
            this.airlineNm = airlineNm;
        }

        public Item withAirlineNm(String airlineNm) {
            this.airlineNm = airlineNm;
            return this;
        }

        public String getArrAirportNm() {
            return arrAirportNm;
        }

        public void setArrAirportNm(String arrAirportNm) {
            this.arrAirportNm = arrAirportNm;
        }

        public Item withArrAirportNm(String arrAirportNm) {
            this.arrAirportNm = arrAirportNm;
            return this;
        }

        public Long getArrPlandTime() {
            return arrPlandTime;
        }

        public void setArrPlandTime(Long arrPlandTime) {
            this.arrPlandTime = arrPlandTime;
        }

        public Item withArrPlandTime(Long arrPlandTime) {
            this.arrPlandTime = arrPlandTime;
            return this;
        }

        public String getDepAirportNm() {
            return depAirportNm;
        }

        public void setDepAirportNm(String depAirportNm) {
            this.depAirportNm = depAirportNm;
        }

        public Item withDepAirportNm(String depAirportNm) {
            this.depAirportNm = depAirportNm;
            return this;
        }

        public Long getDepPlandTime() {
            return depPlandTime;
        }

        public void setDepPlandTime(Long depPlandTime) {
            this.depPlandTime = depPlandTime;
        }

        public Item withDepPlandTime(Long depPlandTime) {
            this.depPlandTime = depPlandTime;
            return this;
        }

        public Integer getEconomyCharge() {
            return economyCharge;
        }

        public void setEconomyCharge(Integer economyCharge) {
            this.economyCharge = economyCharge;
        }

        public Item withEconomyCharge(Integer economyCharge) {
            this.economyCharge = economyCharge;
            return this;
        }

        public Integer getPrestigeCharge() {
            return prestigeCharge;
        }

        public void setPrestigeCharge(Integer prestigeCharge) {
            this.prestigeCharge = prestigeCharge;
        }

        public Item withPrestigeCharge(Integer prestigeCharge) {
            this.prestigeCharge = prestigeCharge;
            return this;
        }

        public String getVihicleId() {
            return vihicleId;
        }

        public void setVihicleId(String vihicleId) {
            this.vihicleId = vihicleId;
        }

        public Item withVihicleId(String vihicleId) {
            this.vihicleId = vihicleId;
            return this;
        }

    }

    class Items {

        private List<Item> item = null;

        public List<Item> getItem() {
            return item;
        }

        public void setItem(List<Item> item) {
            this.item = item;
        }

        public Items withItem(List<Item> item) {
            this.item = item;
            return this;
        }

    }

    class Pic {

        private Response response;

        public Response getResponse() {
            return response;
        }

        public void setResponse(Response response) {
            this.response = response;
        }

        public Pic withResponse(Response response) {
            this.response = response;
            return this;
        }

    }

    class Response {

        private Header header;
        private Body body;

        public Header getHeader() {
            return header;
        }

        public void setHeader(Header header) {
            this.header = header;
        }

        public Response withHeader(Header header) {
            this.header = header;
            return this;
        }

        public Body getBody() {
            return body;
        }

        public void setBody(Body body) {
            this.body = body;
        }

        public Response withBody(Body body) {
            this.body = body;
            return this;
        }

    }
}