package x8;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.util.Log;
import c5.w;
import com.google.android.gms.common.data.DataHolder;
import org.telegram.messenger.WearAuthListenerService;
import td.z1;
import y8.c0;
import y8.i0;
import y8.j;
import y8.j0;
import y8.t0;
import y8.x0;
import y8.z0;
public final class d extends b8.b {
    public volatile int f53446b;
    public final WearAuthListenerService f53447c;

    public d(WearAuthListenerService wearAuthListenerService) {
        super("com.google.android.gms.wearable.internal.IWearableListener", 4);
        this.f53447c = wearAuthListenerService;
        this.f53446b = -1;
    }

    @Override
    public final boolean K0(int i10, Parcel parcel, Parcel parcel2) {
        a9.a aVar;
        if (i10 != 13) {
            if (i10 != 14) {
                switch (i10) {
                    case 1:
                        DataHolder dataHolder = (DataHolder) f8.a.a(parcel, DataHolder.CREATOR);
                        f8.a.b(parcel);
                        Runnable z1Var = new z1(this, dataHolder, false, 8);
                        try {
                            String valueOf = String.valueOf(dataHolder);
                            int i11 = dataHolder.f4537n;
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(valueOf);
                            sb2.append(", rows=");
                            sb2.append(i11);
                            return !M0(z1Var, "onDataItemChanged", sb2.toString()) ? true : true;
                        } finally {
                            dataHolder.close();
                        }
                    case 2:
                        Object obj = (i0) f8.a.a(parcel, i0.CREATOR);
                        f8.a.b(parcel);
                        M0(new z1(this, obj, false, 9), "onMessageReceived", obj);
                        return true;
                    case 3:
                        j0 j0Var = (j0) f8.a.a(parcel, j0.CREATOR);
                        f8.a.b(parcel);
                        M0(new g(this, j0Var, 0), "onPeerConnected", j0Var);
                        return true;
                    case 4:
                        j0 j0Var2 = (j0) f8.a.a(parcel, j0.CREATOR);
                        f8.a.b(parcel);
                        M0(new g(this, j0Var2, 1), "onPeerDisconnected", j0Var2);
                        return true;
                    case 5:
                        Object createTypedArrayList = parcel.createTypedArrayList(j0.CREATOR);
                        f8.a.b(parcel);
                        M0(new z1(this, createTypedArrayList, false, 10), "onConnectedNodes", createTypedArrayList);
                        return true;
                    case 6:
                        z0 z0Var = (z0) f8.a.a(parcel, z0.CREATOR);
                        f8.a.b(parcel);
                        M0(new g(this, z0Var, 3), "onNotificationReceived", z0Var);
                        return true;
                    case 7:
                        Object obj2 = (y8.e) f8.a.a(parcel, y8.e.CREATOR);
                        f8.a.b(parcel);
                        M0(new z1(this, obj2, false, 11), "onChannelEvent", obj2);
                        return true;
                    case 8:
                        y8.b bVar = (y8.b) f8.a.a(parcel, y8.b.CREATOR);
                        f8.a.b(parcel);
                        M0(new g(this, bVar, 2), "onConnectedCapabilityChanged", bVar);
                        return true;
                    case 9:
                        t0 t0Var = (t0) f8.a.a(parcel, t0.CREATOR);
                        f8.a.b(parcel);
                        M0(new g(this, t0Var, 4), "onEntityUpdate", t0Var);
                        return true;
                    default:
                        return false;
                }
            }
            j jVar = (j) f8.a.a(parcel, j.CREATOR);
            f8.a.b(parcel);
            return true;
        }
        Object obj3 = (i0) f8.a.a(parcel, i0.CREATOR);
        IBinder readStrongBinder = parcel.readStrongBinder();
        if (readStrongBinder == null) {
            aVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.wearable.internal.IRpcResponseCallback");
            if (queryLocalInterface instanceof c0) {
                aVar = (c0) queryLocalInterface;
            } else {
                aVar = new a9.a(readStrongBinder, "com.google.android.gms.wearable.internal.IRpcResponseCallback", 4);
            }
        }
        f8.a.b(parcel);
        M0(new w(this, obj3, aVar, 11), "onRequestReceived", obj3);
        return true;
    }

    public final boolean M0(Runnable runnable, String str, Object obj) {
        if (Log.isLoggable("WearableLS", 3)) {
            Log.d("WearableLS", String.format("%s: %s %s", str, this.f53447c.f14532a.toString(), obj));
        }
        int callingUid = Binder.getCallingUid();
        if (callingUid != this.f53446b) {
            if (x0.a(this.f53447c).b() && u6.b.g(callingUid, this.f53447c, "com.google.android.wearable.app.cn")) {
                this.f53446b = callingUid;
            } else if (u6.b.e(this.f53447c, callingUid)) {
                this.f53446b = callingUid;
            } else {
                Log.e("WearableLS", "Caller is not GooglePlayServices; caller UID: " + callingUid);
                return false;
            }
        }
        synchronized (this.f53447c.f14535f) {
            try {
                WearAuthListenerService wearAuthListenerService = this.f53447c;
                if (wearAuthListenerService.h) {
                    return false;
                }
                wearAuthListenerService.f14533b.post(runnable);
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
