package x8;

import android.content.ComponentName;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import c5.v;
import com.google.android.gms.common.data.DataHolder;
import y8.b1;
import y8.e0;
import y8.k0;
import y8.l0;
import y8.v0;
import y8.z0;
public final class m extends b8.b {
    public volatile int f49314b;
    public final k f49315c;

    public m(k kVar) {
        super("com.google.android.gms.wearable.internal.IWearableListener", 4);
        this.f49315c = kVar;
        this.f49314b = -1;
    }

    public static final void M0(e0 e0Var, boolean z10, byte[] bArr) {
        try {
            e0Var.getClass();
            Parcel obtain = Parcel.obtain();
            obtain.writeInterfaceToken(e0Var.f337c);
            int i10 = f8.a.f9441a;
            obtain.writeInt(z10 ? 1 : 0);
            obtain.writeByteArray(bArr);
            e0Var.f336b.transact(1, obtain, null, 1);
            obtain.recycle();
        } catch (RemoteException e7) {
            Log.e("WearableLS", "Failed to send a response back", e7);
        }
    }

    @Override
    public final boolean J0(int i10, Parcel parcel, Parcel parcel2) {
        a9.a aVar;
        if (i10 != 13) {
            if (i10 != 14) {
                switch (i10) {
                    case 1:
                        DataHolder dataHolder = (DataHolder) f8.a.a(parcel, DataHolder.CREATOR);
                        f8.a.b(parcel);
                        Runnable eVar = new u4.e(7, this, dataHolder);
                        try {
                            String valueOf = String.valueOf(dataHolder);
                            int i11 = dataHolder.f5190n;
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(valueOf);
                            sb2.append(", rows=");
                            sb2.append(i11);
                            return !L0(eVar, "onDataItemChanged", sb2.toString()) ? true : true;
                        } finally {
                            dataHolder.close();
                        }
                    case 2:
                        Object obj = (k0) f8.a.a(parcel, k0.CREATOR);
                        f8.a.b(parcel);
                        L0(new u4.e(8, this, obj), "onMessageReceived", obj);
                        return true;
                    case 3:
                        l0 l0Var = (l0) f8.a.a(parcel, l0.CREATOR);
                        f8.a.b(parcel);
                        L0(new q(this, l0Var, 0), "onPeerConnected", l0Var);
                        return true;
                    case 4:
                        l0 l0Var2 = (l0) f8.a.a(parcel, l0.CREATOR);
                        f8.a.b(parcel);
                        L0(new q(this, l0Var2, 1), "onPeerDisconnected", l0Var2);
                        return true;
                    case 5:
                        Object createTypedArrayList = parcel.createTypedArrayList(l0.CREATOR);
                        f8.a.b(parcel);
                        L0(new u4.e(9, this, createTypedArrayList), "onConnectedNodes", createTypedArrayList);
                        return true;
                    case 6:
                        Object obj2 = (b1) f8.a.a(parcel, b1.CREATOR);
                        f8.a.b(parcel);
                        L0(new u4.e(11, this, obj2), "onNotificationReceived", obj2);
                        return true;
                    case 7:
                        Object obj3 = (y8.e) f8.a.a(parcel, y8.e.CREATOR);
                        f8.a.b(parcel);
                        L0(new u4.e(13, this, obj3), "onChannelEvent", obj3);
                        return true;
                    case 8:
                        Object obj4 = (y8.b) f8.a.a(parcel, y8.b.CREATOR);
                        f8.a.b(parcel);
                        L0(new u4.e(10, this, obj4), "onConnectedCapabilityChanged", obj4);
                        return true;
                    case 9:
                        Object obj5 = (v0) f8.a.a(parcel, v0.CREATOR);
                        f8.a.b(parcel);
                        L0(new u4.e(12, this, obj5), "onEntityUpdate", obj5);
                        return true;
                    default:
                        return false;
                }
            }
            y8.j jVar = (y8.j) f8.a.a(parcel, y8.j.CREATOR);
            f8.a.b(parcel);
            return true;
        }
        Object obj6 = (k0) f8.a.a(parcel, k0.CREATOR);
        IBinder readStrongBinder = parcel.readStrongBinder();
        if (readStrongBinder == null) {
            aVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.wearable.internal.IRpcResponseCallback");
            if (queryLocalInterface instanceof e0) {
                aVar = (e0) queryLocalInterface;
            } else {
                aVar = new a9.a(readStrongBinder, "com.google.android.gms.wearable.internal.IRpcResponseCallback", 4);
            }
        }
        f8.a.b(parcel);
        L0(new v(this, obj6, aVar, 13), "onRequestReceived", obj6);
        return true;
    }

    public final boolean L0(Runnable runnable, String str, Object obj) {
        Object obj2;
        boolean z10;
        p pVar;
        ComponentName componentName;
        if (Log.isLoggable("WearableLS", 3)) {
            componentName = this.f49315c.zza;
            Log.d("WearableLS", String.format("%s: %s %s", str, componentName.toString(), obj));
        }
        int callingUid = Binder.getCallingUid();
        if (callingUid != this.f49314b) {
            if (z0.a(this.f49315c).b() && u6.b.g(this.f49315c, "com.google.android.wearable.app.cn", callingUid)) {
                this.f49314b = callingUid;
            } else if (u6.b.e(this.f49315c, callingUid)) {
                this.f49314b = callingUid;
            } else {
                Log.e("WearableLS", "Caller is not GooglePlayServices; caller UID: " + callingUid);
                return false;
            }
        }
        obj2 = this.f49315c.zzf;
        synchronized (obj2) {
            try {
                k kVar = this.f49315c;
                z10 = kVar.zzg;
                if (!z10) {
                    pVar = kVar.zzb;
                    pVar.post(runnable);
                    return true;
                }
                return false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
