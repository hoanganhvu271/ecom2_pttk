package com.ecom.ecom2.dao.shipment_dao;

import com.ecom.ecom2.model.shipment_model.Shipment;

public interface ShipmentDAO {
    public void createShipment(Shipment shipmentOld);
    public void updateShipment(Shipment shipment);
    public void deleteShipment(Shipment shipment);
    public void selectShipment(int shipmentId);
}
