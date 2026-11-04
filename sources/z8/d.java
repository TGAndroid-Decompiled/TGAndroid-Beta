package z8;

import a9.b1;
import a9.c0;
import a9.j;
import a9.k0;
import a9.l0;
import a9.v0;
import a9.z0;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.util.Log;
import com.google.android.gms.common.api.internal.j1;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.internal.cast.o;
import org.telegram.messenger.WearAuthListenerService;
import u9.k;
public final class d extends o {
    public volatile int f60151b;
    public final WearAuthListenerService f60152c;

    public d(WearAuthListenerService wearAuthListenerService) {
        super("com.google.android.gms.wearable.internal.IWearableListener", 4);
        this.f60152c = wearAuthListenerService;
        this.f60151b = -1;
    }

    @Override
    public final boolean K0(int i3, Parcel parcel, Parcel parcel2) {
        c0 aVar;
        c0 c0Var;
        if (i3 != 13) {
            if (i3 != 14) {
                switch (i3) {
                    case 1:
                        DataHolder dataHolder = (DataHolder) h8.a.a(parcel, DataHolder.CREATOR);
                        h8.a.b(parcel);
                        Runnable kVar = new k(9, this, dataHolder);
                        try {
                            String valueOf = String.valueOf(dataHolder);
                            int i10 = dataHolder.f6791n;
                            if (!M0(kVar, "onDataItemChanged", valueOf + ", rows=" + i10)) {
                                break;
                            }
                        } finally {
                            dataHolder.close();
                        }
                        break;
                    case 2:
                        Object obj = (k0) h8.a.a(parcel, k0.CREATOR);
                        h8.a.b(parcel);
                        M0(new k(10, this, obj), "onMessageReceived", obj);
                        break;
                    case 3:
                        l0 l0Var = (l0) h8.a.a(parcel, l0.CREATOR);
                        h8.a.b(parcel);
                        M0(new g(this, l0Var, 0), "onPeerConnected", l0Var);
                        break;
                    case 4:
                        l0 l0Var2 = (l0) h8.a.a(parcel, l0.CREATOR);
                        h8.a.b(parcel);
                        M0(new g(this, l0Var2, 1), "onPeerDisconnected", l0Var2);
                        break;
                    case 5:
                        Object createTypedArrayList = parcel.createTypedArrayList(l0.CREATOR);
                        h8.a.b(parcel);
                        M0(new k(11, this, createTypedArrayList), "onConnectedNodes", createTypedArrayList);
                        break;
                    case 6:
                        b1 b1Var = (b1) h8.a.a(parcel, b1.CREATOR);
                        h8.a.b(parcel);
                        M0(new g(this, b1Var, 3), "onNotificationReceived", b1Var);
                        break;
                    case 7:
                        Object obj2 = (a9.e) h8.a.a(parcel, a9.e.CREATOR);
                        h8.a.b(parcel);
                        M0(new k(12, this, obj2), "onChannelEvent", obj2);
                        break;
                    case 8:
                        a9.b bVar = (a9.b) h8.a.a(parcel, a9.b.CREATOR);
                        h8.a.b(parcel);
                        M0(new g(this, bVar, 2), "onConnectedCapabilityChanged", bVar);
                        break;
                    case 9:
                        v0 v0Var = (v0) h8.a.a(parcel, v0.CREATOR);
                        h8.a.b(parcel);
                        M0(new g(this, v0Var, 4), "onEntityUpdate", v0Var);
                        break;
                    default:
                        return false;
                }
            } else {
                j jVar = (j) h8.a.a(parcel, j.CREATOR);
                h8.a.b(parcel);
            }
            return true;
        }
        Object obj3 = (k0) h8.a.a(parcel, k0.CREATOR);
        IBinder readStrongBinder = parcel.readStrongBinder();
        if (readStrongBinder == null) {
            c0Var = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.wearable.internal.IRpcResponseCallback");
            if (queryLocalInterface instanceof c0) {
                c0Var = (c0) queryLocalInterface;
            } else {
                aVar = new b8.a(readStrongBinder, "com.google.android.gms.wearable.internal.IRpcResponseCallback", 5);
                h8.a.b(parcel);
                M0(new j1(this, obj3, aVar, false, 12), "onRequestReceived", obj3);
                return true;
            }
        }
        aVar = c0Var;
        h8.a.b(parcel);
        M0(new j1(this, obj3, aVar, false, 12), "onRequestReceived", obj3);
        return true;
    }

    public final boolean M0(Runnable runnable, String str, Object obj) {
        if (Log.isLoggable("WearableLS", 3)) {
            Log.d("WearableLS", String.format("%s: %s %s", str, this.f60152c.f21399a.toString(), obj));
        }
        int callingUid = Binder.getCallingUid();
        if (callingUid != this.f60151b) {
            if (z0.a(this.f60152c).b() && w6.b.g(callingUid, this.f60152c, "com.google.android.wearable.app.cn")) {
                this.f60151b = callingUid;
            } else if (w6.b.e(this.f60152c, callingUid)) {
                this.f60151b = callingUid;
            } else {
                Log.e("WearableLS", "Caller is not GooglePlayServices; caller UID: " + callingUid);
                return false;
            }
        }
        synchronized (this.f60152c.f21403f) {
            try {
                WearAuthListenerService wearAuthListenerService = this.f60152c;
                if (wearAuthListenerService.h) {
                    return false;
                }
                wearAuthListenerService.f21400b.post(runnable);
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
