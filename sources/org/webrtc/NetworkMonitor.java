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
        static final NetworkMonitor instance = new NetworkMonitor();

        private InstanceHolder() {
        }
    }

    public interface NetworkObserver {
        void onConnectionTypeChanged(NetworkChangeDetector.ConnectionType connectionType);
    }

    @Deprecated
    public static void addNetworkObserver(NetworkObserver networkObserver) {
        getInstance().addObserver(networkObserver);
    }

    private static int androidSdkInt() {
        return Build.VERSION.SDK_INT;
    }

    private static void assertIsTrue(boolean z9) {
        if (z9) {
            return;
        }
        throw new AssertionError("Expected to be true");
    }

    public static NetworkMonitorAutoDetect createAndSetAutoDetectForTest(Context context, String str) {
        NetworkMonitor networkMonitor = getInstance();
        NetworkChangeDetector createNetworkChangeDetector = networkMonitor.createNetworkChangeDetector(context, str);
        networkMonitor.networkChangeDetector = createNetworkChangeDetector;
        return (NetworkMonitorAutoDetect) createNetworkChangeDetector;
    }

    private NetworkChangeDetector createNetworkChangeDetector(Context context, String str) {
        return this.networkChangeDetectorFactory.create(new NetworkChangeDetector.Observer() {
            @Override
            public void onConnectionTypeChanged(NetworkChangeDetector.ConnectionType connectionType) {
                NetworkMonitor.this.updateCurrentConnectionType(connectionType);
            }

            @Override
            public void onNetworkConnect(NetworkChangeDetector.NetworkInformation networkInformation) {
                NetworkMonitor.this.notifyObserversOfNetworkConnect(networkInformation);
            }

            @Override
            public void onNetworkDisconnect(long j3) {
                NetworkMonitor.this.notifyObserversOfNetworkDisconnect(j3);
            }

            @Override
            public void onNetworkPreference(List<NetworkChangeDetector.ConnectionType> list, int i7) {
                NetworkMonitor.this.notifyObserversOfNetworkPreference(list, i7);
            }
        }, context);
    }

    private NetworkChangeDetector.ConnectionType getCurrentConnectionType() {
        return this.currentConnectionType;
    }

    public static NetworkMonitor getInstance() {
        return InstanceHolder.instance;
    }

    private List<Long> getNativeNetworkObserversSync() {
        ArrayList arrayList;
        synchronized (this.nativeNetworkObservers) {
            arrayList = new ArrayList(this.nativeNetworkObservers);
        }
        return arrayList;
    }

    public static boolean isOnline() {
        if (getInstance().getCurrentConnectionType() != NetworkChangeDetector.ConnectionType.CONNECTION_NONE) {
            return true;
        }
        return false;
    }

    private native void nativeNotifyConnectionTypeChanged(long j3);

    private native void nativeNotifyOfActiveNetworkList(long j3, NetworkChangeDetector.NetworkInformation[] networkInformationArr);

    private native void nativeNotifyOfNetworkConnect(long j3, NetworkChangeDetector.NetworkInformation networkInformation);

    private native void nativeNotifyOfNetworkDisconnect(long j3, long j10);

    private native void nativeNotifyOfNetworkPreference(long j3, NetworkChangeDetector.ConnectionType connectionType, int i7);

    private boolean networkBindingSupported() {
        boolean z9;
        synchronized (this.networkChangeDetectorLock) {
            try {
                NetworkChangeDetector networkChangeDetector = this.networkChangeDetector;
                if (networkChangeDetector != null && networkChangeDetector.supportNetworkCallback()) {
                    z9 = true;
                } else {
                    z9 = false;
                }
            } finally {
            }
        }
        return z9;
    }

    private void notifyObserversOfConnectionTypeChange(NetworkChangeDetector.ConnectionType connectionType) {
        ArrayList arrayList;
        for (Long l10 : getNativeNetworkObserversSync()) {
            nativeNotifyConnectionTypeChanged(l10.longValue());
        }
        synchronized (this.networkObservers) {
            arrayList = new ArrayList(this.networkObservers);
        }
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            ((NetworkObserver) obj).onConnectionTypeChanged(connectionType);
        }
    }

    public void notifyObserversOfNetworkConnect(NetworkChangeDetector.NetworkInformation networkInformation) {
        for (Long l10 : getNativeNetworkObserversSync()) {
            nativeNotifyOfNetworkConnect(l10.longValue(), networkInformation);
        }
    }

    public void notifyObserversOfNetworkDisconnect(long j3) {
        for (Long l10 : getNativeNetworkObserversSync()) {
            nativeNotifyOfNetworkDisconnect(l10.longValue(), j3);
        }
    }

    public void notifyObserversOfNetworkPreference(List<NetworkChangeDetector.ConnectionType> list, int i7) {
        List<Long> nativeNetworkObserversSync = getNativeNetworkObserversSync();
        for (NetworkChangeDetector.ConnectionType connectionType : list) {
            for (Long l10 : nativeNetworkObserversSync) {
                nativeNotifyOfNetworkPreference(l10.longValue(), connectionType, i7);
            }
        }
    }

    @Deprecated
    public static void removeNetworkObserver(NetworkObserver networkObserver) {
        getInstance().removeObserver(networkObserver);
    }

    public void updateCurrentConnectionType(NetworkChangeDetector.ConnectionType connectionType) {
        this.currentConnectionType = connectionType;
        notifyObserversOfConnectionTypeChange(connectionType);
    }

    private void updateObserverActiveNetworkList(long j3) {
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
        nativeNotifyOfActiveNetworkList(j3, (NetworkChangeDetector.NetworkInformation[]) activeNetworkList.toArray(new NetworkChangeDetector.NetworkInformation[activeNetworkList.size()]));
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
        int i7;
        synchronized (this.networkChangeDetectorLock) {
            i7 = this.numObservers;
        }
        return i7;
    }

    public void removeObserver(NetworkObserver networkObserver) {
        synchronized (this.networkObservers) {
            this.networkObservers.remove(networkObserver);
        }
    }

    public void setNetworkChangeDetectorFactory(NetworkChangeDetectorFactory networkChangeDetectorFactory) {
        boolean z9;
        if (this.numObservers == 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        assertIsTrue(z9);
        this.networkChangeDetectorFactory = networkChangeDetectorFactory;
    }

    public void startMonitoring(Context context, String str) {
        synchronized (this.networkChangeDetectorLock) {
            try {
                this.numObservers++;
                if (this.networkChangeDetector == null) {
                    this.networkChangeDetector = createNetworkChangeDetector(context, str);
                }
                this.currentConnectionType = this.networkChangeDetector.getCurrentConnectionType();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void stopMonitoring() {
        synchronized (this.networkChangeDetectorLock) {
            try {
                int i7 = this.numObservers - 1;
                this.numObservers = i7;
                if (i7 == 0) {
                    this.networkChangeDetector.destroy();
                    this.networkChangeDetector = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
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

    private void stopMonitoring(long j3) {
        Logging.d("NetworkMonitor", "Stop monitoring with native observer " + j3);
        stopMonitoring();
        synchronized (this.nativeNetworkObservers) {
            this.nativeNetworkObservers.remove(Long.valueOf(j3));
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

    private void startMonitoring(Context context, long j3, String str) {
        Logging.d("NetworkMonitor", "Start monitoring with native observer " + j3 + " fieldTrialsString: " + str);
        if (context == null) {
            context = ContextUtils.getApplicationContext();
        }
        startMonitoring(context, str);
        synchronized (this.nativeNetworkObservers) {
            this.nativeNetworkObservers.add(Long.valueOf(j3));
        }
        updateObserverActiveNetworkList(j3);
        notifyObserversOfConnectionTypeChange(this.currentConnectionType);
    }

    @Deprecated
    public static void init(Context context) {
    }
}
