package y8;

import android.content.ComponentName;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.internal.q1;
import com.google.android.gms.common.data.DataHolder;
import z8.a1;
import z8.c1;
import z8.f0;
import z8.l0;
import z8.m0;
import z8.w0;
public final class m extends c8.b {
    public volatile int f52398b;
    public final k f52399c;

    public m(k kVar) {
        super("com.google.android.gms.wearable.internal.IWearableListener", 4);
        this.f52399c = kVar;
        this.f52398b = -1;
    }

    public static final void L0(f0 f0Var, boolean z10, byte[] bArr) {
        try {
            f0Var.getClass();
            Parcel obtain = Parcel.obtain();
            obtain.writeInterfaceToken(f0Var.f344c);
            int i10 = g8.a.f12396a;
            obtain.writeInt(z10 ? 1 : 0);
            obtain.writeByteArray(bArr);
            f0Var.f343b.transact(1, obtain, null, 1);
            obtain.recycle();
        } catch (RemoteException e) {
            Log.e("WearableLS", "Failed to send a response back", e);
        }
    }

    @Override
    public final boolean I0(int i10, Parcel parcel, Parcel parcel2) {
        f0 aVar;
        f0 f0Var;
        if (i10 != 13) {
            if (i10 != 14) {
                switch (i10) {
                    case 1:
                        DataHolder dataHolder = (DataHolder) g8.a.a(parcel, DataHolder.CREATOR);
                        g8.a.b(parcel);
                        Runnable iVar = new t9.i(7, this, dataHolder);
                        try {
                            String valueOf = String.valueOf(dataHolder);
                            int i11 = dataHolder.f6668n;
                            if (!K0(iVar, "onDataItemChanged", valueOf + ", rows=" + i11)) {
                                break;
                            }
                        } finally {
                            dataHolder.close();
                        }
                        break;
                    case 2:
                        Object obj = (l0) g8.a.a(parcel, l0.CREATOR);
                        g8.a.b(parcel);
                        K0(new t9.i(8, this, obj), "onMessageReceived", obj);
                        break;
                    case 3:
                        m0 m0Var = (m0) g8.a.a(parcel, m0.CREATOR);
                        g8.a.b(parcel);
                        K0(new r(this, m0Var, 0), "onPeerConnected", m0Var);
                        break;
                    case 4:
                        m0 m0Var2 = (m0) g8.a.a(parcel, m0.CREATOR);
                        g8.a.b(parcel);
                        K0(new r(this, m0Var2, 1), "onPeerDisconnected", m0Var2);
                        break;
                    case 5:
                        Object createTypedArrayList = parcel.createTypedArrayList(m0.CREATOR);
                        g8.a.b(parcel);
                        K0(new t9.i(9, this, createTypedArrayList), "onConnectedNodes", createTypedArrayList);
                        break;
                    case 6:
                        Object obj2 = (c1) g8.a.a(parcel, c1.CREATOR);
                        g8.a.b(parcel);
                        K0(new t9.i(11, this, obj2), "onNotificationReceived", obj2);
                        break;
                    case 7:
                        Object obj3 = (z8.f) g8.a.a(parcel, z8.f.CREATOR);
                        g8.a.b(parcel);
                        K0(new t9.i(13, this, obj3), "onChannelEvent", obj3);
                        break;
                    case 8:
                        Object obj4 = (z8.c) g8.a.a(parcel, z8.c.CREATOR);
                        g8.a.b(parcel);
                        K0(new t9.i(10, this, obj4), "onConnectedCapabilityChanged", obj4);
                        break;
                    case 9:
                        Object obj5 = (w0) g8.a.a(parcel, w0.CREATOR);
                        g8.a.b(parcel);
                        K0(new t9.i(12, this, obj5), "onEntityUpdate", obj5);
                        break;
                    default:
                        return false;
                }
            } else {
                z8.k kVar = (z8.k) g8.a.a(parcel, z8.k.CREATOR);
                g8.a.b(parcel);
            }
            return true;
        }
        Object obj6 = (l0) g8.a.a(parcel, l0.CREATOR);
        IBinder readStrongBinder = parcel.readStrongBinder();
        if (readStrongBinder == null) {
            f0Var = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.wearable.internal.IRpcResponseCallback");
            if (queryLocalInterface instanceof f0) {
                f0Var = (f0) queryLocalInterface;
            } else {
                aVar = new a8.a(readStrongBinder, "com.google.android.gms.wearable.internal.IRpcResponseCallback", 5);
                g8.a.b(parcel);
                K0(new q1(this, obj6, aVar, false, 12), "onRequestReceived", obj6);
                return true;
            }
        }
        aVar = f0Var;
        g8.a.b(parcel);
        K0(new q1(this, obj6, aVar, false, 12), "onRequestReceived", obj6);
        return true;
    }

    public final boolean K0(Runnable runnable, String str, Object obj) {
        Object obj2;
        boolean z10;
        q qVar;
        ComponentName componentName;
        if (Log.isLoggable("WearableLS", 3)) {
            componentName = this.f52399c.zza;
            Log.d("WearableLS", String.format("%s: %s %s", str, componentName.toString(), obj));
        }
        int callingUid = Binder.getCallingUid();
        if (callingUid != this.f52398b) {
            if (a1.a(this.f52399c).b() && v6.b.g(this.f52399c, "com.google.android.wearable.app.cn", callingUid)) {
                this.f52398b = callingUid;
            } else if (v6.b.e(this.f52399c, callingUid)) {
                this.f52398b = callingUid;
            } else {
                Log.e("WearableLS", "Caller is not GooglePlayServices; caller UID: " + callingUid);
                return false;
            }
        }
        obj2 = this.f52399c.zzf;
        synchronized (obj2) {
            try {
                k kVar = this.f52399c;
                z10 = kVar.zzg;
                if (!z10) {
                    qVar = kVar.zzb;
                    qVar.post(runnable);
                    return true;
                }
                return false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
