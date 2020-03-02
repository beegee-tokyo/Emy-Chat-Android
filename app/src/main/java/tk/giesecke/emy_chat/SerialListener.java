package tk.giesecke.emy_chat;

/**
 * Interface for the BLE UART listener
 */
interface SerialListener {
    void onSerialConnect      ();
    void onSerialConnectError (Exception e);
    void onSerialRead         (byte[] data);
    void onSerialIoError      (Exception e);
}
