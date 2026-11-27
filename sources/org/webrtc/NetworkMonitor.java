package org.webrtc;

import android.content.Context;
import android.os.Build;
import java.util.ArrayList;
import java.util.List;
import org.webrtc.NetworkChangeDetector;
public class NetworkMonitor {
    private static final String TAG = "NetworkMonitor";
    private volatile NetworkChangeDetector.ConnectionType currentConnectionType;
    private final ArrayList<Long> nativeNetworkObservers;
    private NetworkChangeDetector networkChangeDetector;
    private NetworkChangeDetectorFactory networkChangeDetectorFactory;
    private final Object networkChangeDetectorLock;
    private final ArrayList<NetworkObserver> networkObservers;
    private int numObservers;

    public static class InstanceHolder {
        static final NetworkMonitor instance = new NetworkMonitor(0);

        private InstanceHolder() {
        }
    }

    public interface Natives {
        void notifyConnectionTypeChanged(long j);

        void notifyOfActiveNetworkList(long j, NetworkChangeDetector.NetworkInformation[] networkInformationArr);

        void notifyOfNetworkConnect(long j, NetworkChangeDetector.NetworkInformation networkInformation);

        void notifyOfNetworkDisconnect(long j, long j2);

        void notifyOfNetworkPreference(long j, NetworkChangeDetector.ConnectionType connectionType, int i);
    }

    public interface NetworkObserver {
        void onConnectionTypeChanged(NetworkChangeDetector.ConnectionType connectionType);
    }

    private NetworkMonitor() {
        this.networkChangeDetectorFactory = new NetworkChangeDetectorFactory() {
            @Override
            public NetworkChangeDetector create(NetworkChangeDetector.Observer observer, Context context) {
                return new NetworkMonitorAutoDetect(observer, context);
            }
        };
        this.networkChangeDetectorLock = new Object();
        this.nativeNetworkObservers = new ArrayList<>();
        this.networkObservers = new ArrayList<>();
        this.numObservers = 0;
        this.currentConnectionType = NetworkChangeDetector.ConnectionType.CONNECTION_UNKNOWN;
    }

    @Deprecated
    public static void addNetworkObserver(NetworkObserver networkObserver) {
        getInstance().addObserver(networkObserver);
    }

    private static int androidSdkInt() {
        return Build.VERSION.SDK_INT;
    }

    private static void assertIsTrue(boolean z) {
        if (z) {
            return;
        }
        hz6.e("Expected to be true");
    }

    public static NetworkMonitorAutoDetect createAndSetAutoDetectForTest(Context context, String str) {
        NetworkMonitor networkMonitor = getInstance();
        NetworkChangeDetector createNetworkChangeDetector = networkMonitor.createNetworkChangeDetector(context, str);
        networkMonitor.networkChangeDetector = createNetworkChangeDetector;
        return (NetworkMonitorAutoDetect) createNetworkChangeDetector;
    }

    private NetworkChangeDetector createNetworkChangeDetector(Context context, final String str) {
        return this.networkChangeDetectorFactory.create(new NetworkChangeDetector.Observer() {
            @Override
            public String getFieldTrialsString() {
                return str;
            }

            @Override
            public void onConnectionTypeChanged(NetworkChangeDetector.ConnectionType connectionType) {
                NetworkMonitor.this.updateCurrentConnectionType(connectionType);
            }

            @Override
            public void onNetworkConnect(NetworkChangeDetector.NetworkInformation networkInformation) {
                NetworkMonitor.this.notifyObserversOfNetworkConnect(networkInformation);
            }

            @Override
            public void onNetworkDisconnect(long j) {
                NetworkMonitor.this.notifyObserversOfNetworkDisconnect(j);
            }

            @Override
            public void onNetworkPreference(List<NetworkChangeDetector.ConnectionType> list, int i) {
                NetworkMonitor.this.notifyObserversOfNetworkPreference(list, i);
            }
        }, context);
    }

    private NetworkChangeDetector.ConnectionType getCurrentConnectionType() {
        return this.currentConnectionType;
    }

    public static NetworkMonitor getInstance() {
        return InstanceHolder.instance;
    }

    public static boolean isOnline() {
        if (getInstance().getCurrentConnectionType() != NetworkChangeDetector.ConnectionType.CONNECTION_NONE) {
            return true;
        }
        return false;
    }

    private boolean networkBindingSupported() {
        boolean z;
        synchronized (this.networkChangeDetectorLock) {
            NetworkChangeDetector networkChangeDetector = this.networkChangeDetector;
            if (networkChangeDetector != null && networkChangeDetector.supportNetworkCallback()) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    private void notifyObserversOfConnectionTypeChange(NetworkChangeDetector.ConnectionType connectionType) {
        int i;
        ArrayList arrayList;
        synchronized (this.nativeNetworkObservers) {
            ArrayList<Long> arrayList2 = this.nativeNetworkObservers;
            int size = arrayList2.size();
            i = 0;
            int i2 = 0;
            while (i2 < size) {
                Long l = arrayList2.get(i2);
                i2++;
                NetworkMonitorJni.get().notifyConnectionTypeChanged(l.longValue());
            }
        }
        synchronized (this.networkObservers) {
            arrayList = new ArrayList(this.networkObservers);
        }
        int size2 = arrayList.size();
        while (i < size2) {
            Object obj = arrayList.get(i);
            i++;
            ((NetworkObserver) obj).onConnectionTypeChanged(connectionType);
        }
    }

    public void notifyObserversOfNetworkConnect(NetworkChangeDetector.NetworkInformation networkInformation) {
        synchronized (this.nativeNetworkObservers) {
            ArrayList<Long> arrayList = this.nativeNetworkObservers;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Long l = arrayList.get(i);
                i++;
                NetworkMonitorJni.get().notifyOfNetworkConnect(l.longValue(), networkInformation);
            }
        }
    }

    public void notifyObserversOfNetworkDisconnect(long j) {
        synchronized (this.nativeNetworkObservers) {
            ArrayList<Long> arrayList = this.nativeNetworkObservers;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Long l = arrayList.get(i);
                i++;
                NetworkMonitorJni.get().notifyOfNetworkDisconnect(l.longValue(), j);
            }
        }
    }

    public void notifyObserversOfNetworkPreference(List<NetworkChangeDetector.ConnectionType> list, int i) {
        synchronized (this.nativeNetworkObservers) {
            for (NetworkChangeDetector.ConnectionType connectionType : list) {
                ArrayList<Long> arrayList = this.nativeNetworkObservers;
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    Long l = arrayList.get(i2);
                    i2++;
                    NetworkMonitorJni.get().notifyOfNetworkPreference(l.longValue(), connectionType, i);
                }
            }
        }
    }

    @Deprecated
    public static void removeNetworkObserver(NetworkObserver networkObserver) {
        getInstance().removeObserver(networkObserver);
    }

    private void startMonitoring(Context context, long j, String str) {
        Logging.d("NetworkMonitor", "Start monitoring with native observer " + j + " fieldTrialsString: " + str);
        if (context == null) {
            context = ContextUtils.getApplicationContext();
        }
        startMonitoring(context, str);
        synchronized (this.nativeNetworkObservers) {
            this.nativeNetworkObservers.add(Long.valueOf(j));
        }
        updateObserverActiveNetworkList(j);
        notifyObserversOfConnectionTypeChange(this.currentConnectionType);
    }

    private void stopMonitoring(long j) {
        Logging.d("NetworkMonitor", "Stop monitoring with native observer " + j);
        stopMonitoring();
        synchronized (this.nativeNetworkObservers) {
            this.nativeNetworkObservers.remove(Long.valueOf(j));
        }
    }

    public void updateCurrentConnectionType(NetworkChangeDetector.ConnectionType connectionType) {
        this.currentConnectionType = connectionType;
        notifyObserversOfConnectionTypeChange(connectionType);
    }

    private void updateObserverActiveNetworkList(long j) {
        List<NetworkChangeDetector.NetworkInformation> activeNetworkList;
        synchronized (this.networkChangeDetectorLock) {
            NetworkChangeDetector networkChangeDetector = this.networkChangeDetector;
            if (networkChangeDetector == null) {
                activeNetworkList = null;
            } else {
                activeNetworkList = networkChangeDetector.getActiveNetworkList();
            }
        }
        if (activeNetworkList == null) {
            return;
        }
        NetworkMonitorJni.get().notifyOfActiveNetworkList(j, (NetworkChangeDetector.NetworkInformation[]) activeNetworkList.toArray(new NetworkChangeDetector.NetworkInformation[activeNetworkList.size()]));
    }

    public void addObserver(NetworkObserver networkObserver) {
        synchronized (this.networkObservers) {
            this.networkObservers.add(networkObserver);
        }
    }

    public NetworkChangeDetector getNetworkChangeDetector() {
        NetworkChangeDetector networkChangeDetector;
        synchronized (this.networkChangeDetectorLock) {
            networkChangeDetector = this.networkChangeDetector;
        }
        return networkChangeDetector;
    }

    public int getNumObservers() {
        int i;
        synchronized (this.networkChangeDetectorLock) {
            i = this.numObservers;
        }
        return i;
    }

    public void removeObserver(NetworkObserver networkObserver) {
        synchronized (this.networkObservers) {
            this.networkObservers.remove(networkObserver);
        }
    }

    public void setNetworkChangeDetectorFactory(NetworkChangeDetectorFactory networkChangeDetectorFactory) {
        boolean z;
        if (this.numObservers == 0) {
            z = true;
        } else {
            z = false;
        }
        assertIsTrue(z);
        this.networkChangeDetectorFactory = networkChangeDetectorFactory;
    }

    public NetworkMonitor(int i) {
        this();
    }

    public void stopMonitoring() {
        synchronized (this.networkChangeDetectorLock) {
            int i = this.numObservers - 1;
            this.numObservers = i;
            if (i == 0) {
                this.networkChangeDetector.destroy();
                this.networkChangeDetector = null;
            }
        }
    }

    @Deprecated
    public void startMonitoring(Context context) {
        startMonitoring(context, "");
    }

    @Deprecated
    public void startMonitoring() {
        startMonitoring(ContextUtils.getApplicationContext(), "");
    }

    public void startMonitoring(Context context, String str) {
        synchronized (this.networkChangeDetectorLock) {
            this.numObservers++;
            NetworkChangeDetector networkChangeDetector = this.networkChangeDetector;
            if (networkChangeDetector == null) {
                networkChangeDetector = createNetworkChangeDetector(context, str);
                this.networkChangeDetector = networkChangeDetector;
            }
            this.currentConnectionType = networkChangeDetector.getCurrentConnectionType();
        }
    }

    @Deprecated
    public static void init(Context context) {
    }
}
