package com;


import javax.swing.*;

public interface IObserverAdmin {
    void replenishStockWarning(JLabel notifier);

    void updateOnDelivery();

}
