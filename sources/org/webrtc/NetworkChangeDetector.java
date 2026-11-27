package org.webrtc;

import java.util.List;
public interface NetworkChangeDetector {

    public enum ConnectionType {
        CONNECTION_UNKNOWN,
        CONNECTION_ETHERNET,
        CONNECTION_WIFI,
        CONNECTION_5G,
        CONNECTION_4G,
        CONNECTION_3G,
        CONNECTION_2G,
        CONNECTION_UNKNOWN_CELLULAR,
        CONNECTION_BLUETOOTH,
        CONNECTION_VPN,
        CONNECTION_NONE
    }

    public static class IPAddress {
        public final byte[] address;

        public IPAddress(byte[] bArr) {
            this.address = bArr;
        }

        private byte[] getAddress() {
            return this.address;
        }
    }

    public static class NetworkInformation {
        public final long handle;
        public final IPAddress[] ipAddresses;
        public final String name;
        public final NetworkSlice slice;
        public final ConnectionType type;
        public final ConnectionType underlyingTypeForVpn;

        public NetworkInformation(String str, ConnectionType connectionType, ConnectionType connectionType2, long j, IPAddress[] iPAddressArr, NetworkSlice networkSlice) {
            this.name = str;
            this.type = connectionType;
            this.underlyingTypeForVpn = connectionType2;
            this.handle = j;
            this.ipAddresses = iPAddressArr;
            this.slice = networkSlice;
        }

        private ConnectionType getConnectionType() {
            return this.type;
        }

        private long getHandle() {
            return this.handle;
        }

        private IPAddress[] getIpAddresses() {
            return this.ipAddresses;
        }

        private String getName() {
            return this.name;
        }

        private int getSliceAsInt() {
            return this.slice.code;
        }

        private ConnectionType getUnderlyingConnectionTypeForVpn() {
            return this.underlyingTypeForVpn;
        }
    }

    public enum NetworkSlice {
        NO_SLICE(0),
        UNIFIED_COMMUNICATIONS(1);
        
        public final int code;

        NetworkSlice(int i) {
            this.code = i;
        }
    }

    public static abstract class Observer {
        public String getFieldTrialsString() {
            return "";
        }

        public abstract void onConnectionTypeChanged(ConnectionType connectionType);

        public abstract void onNetworkConnect(NetworkInformation networkInformation);

        public abstract void onNetworkDisconnect(long j);

        public abstract void onNetworkPreference(List<ConnectionType> list, int i);
    }

    void destroy();

    List<NetworkInformation> getActiveNetworkList();

    ConnectionType getCurrentConnectionType();

    boolean supportNetworkCallback();
}
