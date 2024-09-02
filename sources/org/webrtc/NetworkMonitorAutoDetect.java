package org.webrtc;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.LinkAddress;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.net.NetworkRequest;
import android.net.wifi.WifiInfo;
import android.net.wifi.p2p.WifiP2pGroup;
import android.net.wifi.p2p.WifiP2pManager;
import android.os.Build;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.webrtc.NetworkChangeDetector;
import org.webrtc.NetworkMonitorAutoDetect;

public class NetworkMonitorAutoDetect extends BroadcastReceiver implements NetworkChangeDetector {
    private static final long INVALID_NET_ID = -1;
    private static final String TAG = "NetworkMonitorAutoDetect";
    private final ConnectivityManager.NetworkCallback allNetworkCallback;
    private NetworkChangeDetector.ConnectionType connectionType;
    private ConnectivityManagerDelegate connectivityManagerDelegate;
    private final Context context;
    private final IntentFilter intentFilter;
    private boolean isRegistered;
    private final ConnectivityManager.NetworkCallback mobileNetworkCallback;
    private final NetworkChangeDetector.Observer observer;
    private WifiDirectManagerDelegate wifiDirectManagerDelegate;
    private WifiManagerDelegate wifiManagerDelegate;
    private String wifiSSID;

    public static class NetworkState {
        private final boolean connected;
        private final int subtype;
        private final int type;
        private final int underlyingNetworkSubtypeForVpn;
        private final int underlyingNetworkTypeForVpn;

        public NetworkState(boolean z, int i, int i2, int i3, int i4) {
            this.connected = z;
            this.type = i;
            this.subtype = i2;
            this.underlyingNetworkTypeForVpn = i3;
            this.underlyingNetworkSubtypeForVpn = i4;
        }

        public boolean isConnected() {
            return this.connected;
        }

        public int getNetworkType() {
            return this.type;
        }

        public int getNetworkSubType() {
            return this.subtype;
        }

        public int getUnderlyingNetworkTypeForVpn() {
            return this.underlyingNetworkTypeForVpn;
        }

        public int getUnderlyingNetworkSubtypeForVpn() {
            return this.underlyingNetworkSubtypeForVpn;
        }
    }

    @SuppressLint({"NewApi"})
    private class SimpleNetworkCallback extends ConnectivityManager.NetworkCallback {
        private SimpleNetworkCallback() {
        }

        @Override
        public void onAvailable(Network network) {
            Logging.d("NetworkMonitorAutoDetect", "Network becomes available: " + network.toString());
            onNetworkChanged(network);
        }

        @Override
        public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
            Logging.d("NetworkMonitorAutoDetect", "capabilities changed: " + networkCapabilities.toString());
            onNetworkChanged(network);
        }

        @Override
        public void onLinkPropertiesChanged(Network network, LinkProperties linkProperties) {
            Logging.d("NetworkMonitorAutoDetect", "link properties changed");
            onNetworkChanged(network);
        }

        @Override
        public void onLosing(Network network, int i) {
            Logging.d("NetworkMonitorAutoDetect", "Network " + network.toString() + " is about to lose in " + i + "ms");
        }

        @Override
        public void onLost(Network network) {
            Logging.d("NetworkMonitorAutoDetect", "Network " + network.toString() + " is disconnected");
            NetworkMonitorAutoDetect.this.observer.onNetworkDisconnect(NetworkMonitorAutoDetect.networkToNetId(network));
        }

        private void onNetworkChanged(Network network) {
            NetworkChangeDetector.NetworkInformation networkToInfo = NetworkMonitorAutoDetect.this.connectivityManagerDelegate.networkToInfo(network);
            if (networkToInfo != null) {
                NetworkMonitorAutoDetect.this.observer.onNetworkConnect(networkToInfo);
            }
        }
    }

    public static class ConnectivityManagerDelegate {
        private final ConnectivityManager connectivityManager;

        ConnectivityManagerDelegate(Context context) {
            this.connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        }

        ConnectivityManagerDelegate() {
            this.connectivityManager = null;
        }

        NetworkState getNetworkState() {
            ConnectivityManager connectivityManager = this.connectivityManager;
            if (connectivityManager == null) {
                return new NetworkState(false, -1, -1, -1, -1);
            }
            return getNetworkState(connectivityManager.getActiveNetworkInfo());
        }

        @SuppressLint({"NewApi"})
        NetworkState getNetworkState(Network network) {
            ConnectivityManager connectivityManager;
            NetworkInfo activeNetworkInfo;
            if (network == null || (connectivityManager = this.connectivityManager) == null) {
                return new NetworkState(false, -1, -1, -1, -1);
            }
            NetworkInfo networkInfo = connectivityManager.getNetworkInfo(network);
            if (networkInfo == null) {
                Logging.w("NetworkMonitorAutoDetect", "Couldn't retrieve information from network " + network.toString());
                return new NetworkState(false, -1, -1, -1, -1);
            }
            if (networkInfo.getType() != 17) {
                NetworkCapabilities networkCapabilities = this.connectivityManager.getNetworkCapabilities(network);
                if (networkCapabilities == null || !networkCapabilities.hasTransport(4)) {
                    return getNetworkState(networkInfo);
                }
                return new NetworkState(networkInfo.isConnected(), 17, -1, networkInfo.getType(), networkInfo.getSubtype());
            }
            if (networkInfo.getType() == 17) {
                if (Build.VERSION.SDK_INT >= 23 && network.equals(this.connectivityManager.getActiveNetwork()) && (activeNetworkInfo = this.connectivityManager.getActiveNetworkInfo()) != null && activeNetworkInfo.getType() != 17) {
                    return new NetworkState(networkInfo.isConnected(), 17, -1, activeNetworkInfo.getType(), activeNetworkInfo.getSubtype());
                }
                return new NetworkState(networkInfo.isConnected(), 17, -1, -1, -1);
            }
            return getNetworkState(networkInfo);
        }

        private NetworkState getNetworkState(NetworkInfo networkInfo) {
            if (networkInfo == null || !networkInfo.isConnected()) {
                return new NetworkState(false, -1, -1, -1, -1);
            }
            return new NetworkState(true, networkInfo.getType(), networkInfo.getSubtype(), -1, -1);
        }

        @SuppressLint({"NewApi"})
        Network[] getAllNetworks() {
            ConnectivityManager connectivityManager = this.connectivityManager;
            return connectivityManager == null ? new Network[0] : connectivityManager.getAllNetworks();
        }

        List<NetworkChangeDetector.NetworkInformation> getActiveNetworkList() {
            if (!supportNetworkCallback()) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (Network network : getAllNetworks()) {
                NetworkChangeDetector.NetworkInformation networkToInfo = networkToInfo(network);
                if (networkToInfo != null) {
                    arrayList.add(networkToInfo);
                }
            }
            return arrayList;
        }

        @SuppressLint({"NewApi"})
        long getDefaultNetId() {
            NetworkInfo activeNetworkInfo;
            NetworkInfo networkInfo;
            if (!supportNetworkCallback() || (activeNetworkInfo = this.connectivityManager.getActiveNetworkInfo()) == null) {
                return -1L;
            }
            long j = -1;
            for (Network network : getAllNetworks()) {
                if (hasInternetCapability(network) && (networkInfo = this.connectivityManager.getNetworkInfo(network)) != null && networkInfo.getType() == activeNetworkInfo.getType()) {
                    if (j == -1) {
                        j = NetworkMonitorAutoDetect.networkToNetId(network);
                    } else {
                        throw new RuntimeException("Multiple connected networks of same type are not supported.");
                    }
                }
            }
            return j;
        }

        @SuppressLint({"NewApi"})
        public NetworkChangeDetector.NetworkInformation networkToInfo(Network network) {
            ConnectivityManager connectivityManager;
            if (network == null || (connectivityManager = this.connectivityManager) == null) {
                return null;
            }
            LinkProperties linkProperties = connectivityManager.getLinkProperties(network);
            if (linkProperties == null) {
                Logging.w("NetworkMonitorAutoDetect", "Detected unknown network: " + network.toString());
                return null;
            }
            if (linkProperties.getInterfaceName() == null) {
                Logging.w("NetworkMonitorAutoDetect", "Null interface name for network " + network.toString());
                return null;
            }
            NetworkState networkState = getNetworkState(network);
            NetworkChangeDetector.ConnectionType connectionType = NetworkMonitorAutoDetect.getConnectionType(networkState);
            if (connectionType == NetworkChangeDetector.ConnectionType.CONNECTION_NONE) {
                Logging.d("NetworkMonitorAutoDetect", "Network " + network.toString() + " is disconnected");
                return null;
            }
            if (connectionType == NetworkChangeDetector.ConnectionType.CONNECTION_UNKNOWN || connectionType == NetworkChangeDetector.ConnectionType.CONNECTION_UNKNOWN_CELLULAR) {
                Logging.d("NetworkMonitorAutoDetect", "Network " + network.toString() + " connection type is " + connectionType + " because it has type " + networkState.getNetworkType() + " and subtype " + networkState.getNetworkSubType());
            }
            return new NetworkChangeDetector.NetworkInformation(linkProperties.getInterfaceName(), connectionType, NetworkMonitorAutoDetect.getUnderlyingConnectionTypeForVpn(networkState), NetworkMonitorAutoDetect.networkToNetId(network), getIPAddresses(linkProperties));
        }

        @SuppressLint({"NewApi"})
        boolean hasInternetCapability(Network network) {
            NetworkCapabilities networkCapabilities;
            ConnectivityManager connectivityManager = this.connectivityManager;
            return (connectivityManager == null || (networkCapabilities = connectivityManager.getNetworkCapabilities(network)) == null || !networkCapabilities.hasCapability(12)) ? false : true;
        }

        @SuppressLint({"NewApi"})
        public void registerNetworkCallback(ConnectivityManager.NetworkCallback networkCallback) {
            this.connectivityManager.registerNetworkCallback(new NetworkRequest.Builder().addCapability(12).build(), networkCallback);
        }

        @SuppressLint({"NewApi"})
        public void requestMobileNetwork(ConnectivityManager.NetworkCallback networkCallback) {
            NetworkRequest.Builder builder = new NetworkRequest.Builder();
            builder.addCapability(12).addTransportType(0);
            this.connectivityManager.requestNetwork(builder.build(), networkCallback);
        }

        @SuppressLint({"NewApi"})
        NetworkChangeDetector.IPAddress[] getIPAddresses(LinkProperties linkProperties) {
            NetworkChangeDetector.IPAddress[] iPAddressArr = new NetworkChangeDetector.IPAddress[linkProperties.getLinkAddresses().size()];
            Iterator<LinkAddress> it = linkProperties.getLinkAddresses().iterator();
            int i = 0;
            while (it.hasNext()) {
                iPAddressArr[i] = new NetworkChangeDetector.IPAddress(it.next().getAddress().getAddress());
                i++;
            }
            return iPAddressArr;
        }

        @SuppressLint({"NewApi"})
        public void releaseCallback(ConnectivityManager.NetworkCallback networkCallback) {
            if (supportNetworkCallback()) {
                Logging.d("NetworkMonitorAutoDetect", "Unregister network callback");
                this.connectivityManager.unregisterNetworkCallback(networkCallback);
            }
        }

        public boolean supportNetworkCallback() {
            return Build.VERSION.SDK_INT >= 21 && this.connectivityManager != null;
        }
    }

    public static class WifiManagerDelegate {
        private final Context context;

        WifiManagerDelegate(Context context) {
            this.context = context;
        }

        WifiManagerDelegate() {
            this.context = null;
        }

        String getWifiSSID() {
            WifiInfo wifiInfo;
            String ssid;
            Intent registerReceiver = this.context.registerReceiver(null, new IntentFilter("android.net.wifi.STATE_CHANGE"));
            return (registerReceiver == null || (wifiInfo = (WifiInfo) registerReceiver.getParcelableExtra("wifiInfo")) == null || (ssid = wifiInfo.getSSID()) == null) ? "" : ssid;
        }
    }

    public static class WifiDirectManagerDelegate extends BroadcastReceiver {
        private static final int WIFI_P2P_NETWORK_HANDLE = 0;
        private final Context context;
        private final NetworkChangeDetector.Observer observer;
        private NetworkChangeDetector.NetworkInformation wifiP2pNetworkInfo;

        WifiDirectManagerDelegate(NetworkChangeDetector.Observer observer, Context context) {
            this.context = context;
            this.observer = observer;
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.net.wifi.p2p.STATE_CHANGED");
            intentFilter.addAction("android.net.wifi.p2p.CONNECTION_STATE_CHANGE");
            context.registerReceiver(this, intentFilter);
            if (Build.VERSION.SDK_INT > 28) {
                WifiP2pManager wifiP2pManager = (WifiP2pManager) context.getSystemService("wifip2p");
                wifiP2pManager.requestGroupInfo(wifiP2pManager.initialize(context, context.getMainLooper(), null), new WifiP2pManager.GroupInfoListener() {
                    @Override
                    public final void onGroupInfoAvailable(WifiP2pGroup wifiP2pGroup) {
                        NetworkMonitorAutoDetect.WifiDirectManagerDelegate.this.lambda$new$0(wifiP2pGroup);
                    }
                });
            }
        }

        @Override
        @SuppressLint({"InlinedApi"})
        public void onReceive(Context context, Intent intent) {
            if ("android.net.wifi.p2p.CONNECTION_STATE_CHANGE".equals(intent.getAction())) {
                lambda$new$0((WifiP2pGroup) intent.getParcelableExtra("p2pGroupInfo"));
            } else if ("android.net.wifi.p2p.STATE_CHANGED".equals(intent.getAction())) {
                onWifiP2pStateChange(intent.getIntExtra("wifi_p2p_state", 0));
            }
        }

        public void release() {
            this.context.unregisterReceiver(this);
        }

        public List<NetworkChangeDetector.NetworkInformation> getActiveNetworkList() {
            NetworkChangeDetector.NetworkInformation networkInformation = this.wifiP2pNetworkInfo;
            if (networkInformation != null) {
                return Collections.singletonList(networkInformation);
            }
            return Collections.emptyList();
        }

        public void lambda$new$0(WifiP2pGroup wifiP2pGroup) {
            if (wifiP2pGroup == null || wifiP2pGroup.getInterface() == null) {
                return;
            }
            try {
                ArrayList list = Collections.list(NetworkInterface.getByName(wifiP2pGroup.getInterface()).getInetAddresses());
                NetworkChangeDetector.IPAddress[] iPAddressArr = new NetworkChangeDetector.IPAddress[list.size()];
                for (int i = 0; i < list.size(); i++) {
                    iPAddressArr[i] = new NetworkChangeDetector.IPAddress(((InetAddress) list.get(i)).getAddress());
                }
                NetworkChangeDetector.NetworkInformation networkInformation = new NetworkChangeDetector.NetworkInformation(wifiP2pGroup.getInterface(), NetworkChangeDetector.ConnectionType.CONNECTION_WIFI, NetworkChangeDetector.ConnectionType.CONNECTION_NONE, 0L, iPAddressArr);
                this.wifiP2pNetworkInfo = networkInformation;
                this.observer.onNetworkConnect(networkInformation);
            } catch (SocketException e) {
                Logging.e("NetworkMonitorAutoDetect", "Unable to get WifiP2p network interface", e);
            }
        }

        private void onWifiP2pStateChange(int i) {
            if (i == 1) {
                this.wifiP2pNetworkInfo = null;
                this.observer.onNetworkDisconnect(0L);
            }
        }
    }

    @SuppressLint({"NewApi"})
    public NetworkMonitorAutoDetect(NetworkChangeDetector.Observer observer, Context context) {
        this.observer = observer;
        this.context = context;
        this.connectivityManagerDelegate = new ConnectivityManagerDelegate(context);
        this.wifiManagerDelegate = new WifiManagerDelegate(context);
        NetworkState networkState = this.connectivityManagerDelegate.getNetworkState();
        this.connectionType = getConnectionType(networkState);
        this.wifiSSID = getWifiSSID(networkState);
        this.intentFilter = new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
        if (PeerConnectionFactory.fieldTrialsFindFullName("IncludeWifiDirect").equals("Enabled")) {
            this.wifiDirectManagerDelegate = new WifiDirectManagerDelegate(observer, context);
        }
        registerReceiver();
        if (this.connectivityManagerDelegate.supportNetworkCallback()) {
            ConnectivityManager.NetworkCallback networkCallback = new ConnectivityManager.NetworkCallback();
            try {
                this.connectivityManagerDelegate.requestMobileNetwork(networkCallback);
            } catch (SecurityException unused) {
                Logging.w("NetworkMonitorAutoDetect", "Unable to obtain permission to request a cellular network.");
                networkCallback = null;
            }
            this.mobileNetworkCallback = networkCallback;
            SimpleNetworkCallback simpleNetworkCallback = new SimpleNetworkCallback();
            this.allNetworkCallback = simpleNetworkCallback;
            this.connectivityManagerDelegate.registerNetworkCallback(simpleNetworkCallback);
            return;
        }
        this.mobileNetworkCallback = null;
        this.allNetworkCallback = null;
    }

    @Override
    public boolean supportNetworkCallback() {
        return this.connectivityManagerDelegate.supportNetworkCallback();
    }

    void setConnectivityManagerDelegateForTests(ConnectivityManagerDelegate connectivityManagerDelegate) {
        this.connectivityManagerDelegate = connectivityManagerDelegate;
    }

    void setWifiManagerDelegateForTests(WifiManagerDelegate wifiManagerDelegate) {
        this.wifiManagerDelegate = wifiManagerDelegate;
    }

    boolean isReceiverRegisteredForTesting() {
        return this.isRegistered;
    }

    @Override
    public List<NetworkChangeDetector.NetworkInformation> getActiveNetworkList() {
        List<NetworkChangeDetector.NetworkInformation> activeNetworkList = this.connectivityManagerDelegate.getActiveNetworkList();
        if (activeNetworkList == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(activeNetworkList);
        WifiDirectManagerDelegate wifiDirectManagerDelegate = this.wifiDirectManagerDelegate;
        if (wifiDirectManagerDelegate != null) {
            arrayList.addAll(wifiDirectManagerDelegate.getActiveNetworkList());
        }
        return arrayList;
    }

    @Override
    public void destroy() {
        ConnectivityManager.NetworkCallback networkCallback = this.allNetworkCallback;
        if (networkCallback != null) {
            this.connectivityManagerDelegate.releaseCallback(networkCallback);
        }
        ConnectivityManager.NetworkCallback networkCallback2 = this.mobileNetworkCallback;
        if (networkCallback2 != null) {
            this.connectivityManagerDelegate.releaseCallback(networkCallback2);
        }
        WifiDirectManagerDelegate wifiDirectManagerDelegate = this.wifiDirectManagerDelegate;
        if (wifiDirectManagerDelegate != null) {
            wifiDirectManagerDelegate.release();
        }
        unregisterReceiver();
    }

    private void registerReceiver() {
        if (this.isRegistered) {
            return;
        }
        this.isRegistered = true;
        this.context.registerReceiver(this, this.intentFilter);
    }

    private void unregisterReceiver() {
        if (this.isRegistered) {
            this.isRegistered = false;
            this.context.unregisterReceiver(this);
        }
    }

    public NetworkState getCurrentNetworkState() {
        return this.connectivityManagerDelegate.getNetworkState();
    }

    public long getDefaultNetId() {
        return this.connectivityManagerDelegate.getDefaultNetId();
    }

    private static NetworkChangeDetector.ConnectionType getConnectionType(boolean z, int i, int i2) {
        if (!z) {
            return NetworkChangeDetector.ConnectionType.CONNECTION_NONE;
        }
        if (i == 0) {
            switch (i2) {
                case 1:
                case 2:
                case 4:
                case 7:
                case 11:
                case 16:
                    return NetworkChangeDetector.ConnectionType.CONNECTION_2G;
                case 3:
                case 5:
                case 6:
                case 8:
                case 9:
                case 10:
                case 12:
                case 14:
                case 15:
                case 17:
                    return NetworkChangeDetector.ConnectionType.CONNECTION_3G;
                case 13:
                case 18:
                    return NetworkChangeDetector.ConnectionType.CONNECTION_4G;
                case 19:
                default:
                    return NetworkChangeDetector.ConnectionType.CONNECTION_UNKNOWN_CELLULAR;
                case 20:
                    return NetworkChangeDetector.ConnectionType.CONNECTION_5G;
            }
        }
        if (i == 1) {
            return NetworkChangeDetector.ConnectionType.CONNECTION_WIFI;
        }
        if (i == 6) {
            return NetworkChangeDetector.ConnectionType.CONNECTION_4G;
        }
        if (i == 7) {
            return NetworkChangeDetector.ConnectionType.CONNECTION_BLUETOOTH;
        }
        if (i == 9) {
            return NetworkChangeDetector.ConnectionType.CONNECTION_ETHERNET;
        }
        if (i == 17) {
            return NetworkChangeDetector.ConnectionType.CONNECTION_VPN;
        }
        return NetworkChangeDetector.ConnectionType.CONNECTION_UNKNOWN;
    }

    public static NetworkChangeDetector.ConnectionType getConnectionType(NetworkState networkState) {
        return getConnectionType(networkState.isConnected(), networkState.getNetworkType(), networkState.getNetworkSubType());
    }

    @Override
    public NetworkChangeDetector.ConnectionType getCurrentConnectionType() {
        return getConnectionType(getCurrentNetworkState());
    }

    public static NetworkChangeDetector.ConnectionType getUnderlyingConnectionTypeForVpn(NetworkState networkState) {
        if (networkState.getNetworkType() != 17) {
            return NetworkChangeDetector.ConnectionType.CONNECTION_NONE;
        }
        return getConnectionType(networkState.isConnected(), networkState.getUnderlyingNetworkTypeForVpn(), networkState.getUnderlyingNetworkSubtypeForVpn());
    }

    private String getWifiSSID(NetworkState networkState) {
        return getConnectionType(networkState) != NetworkChangeDetector.ConnectionType.CONNECTION_WIFI ? "" : this.wifiManagerDelegate.getWifiSSID();
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        NetworkState currentNetworkState = getCurrentNetworkState();
        if ("android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            connectionTypeChanged(currentNetworkState);
        }
    }

    private void connectionTypeChanged(NetworkState networkState) {
        NetworkChangeDetector.ConnectionType connectionType = getConnectionType(networkState);
        String wifiSSID = getWifiSSID(networkState);
        if (connectionType == this.connectionType && wifiSSID.equals(this.wifiSSID)) {
            return;
        }
        this.connectionType = connectionType;
        this.wifiSSID = wifiSSID;
        Logging.d("NetworkMonitorAutoDetect", "Network connectivity changed, type is: " + this.connectionType);
        this.observer.onConnectionTypeChanged(connectionType);
    }

    @SuppressLint({"NewApi"})
    public static long networkToNetId(Network network) {
        if (Build.VERSION.SDK_INT >= 23) {
            return network.getNetworkHandle();
        }
        return Integer.parseInt(network.toString());
    }
}
