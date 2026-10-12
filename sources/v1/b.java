package v1;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import androidx.lifecycle.m0;
import androidx.lifecycle.p0;
import androidx.lifecycle.s0;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.s;
import com.google.android.gms.tasks.TaskCompletionSource;
import e8.i;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeoutException;
import v7.h5;
import v8.e;
import x9.k;
import x9.n;
import x9.x;
public final class b implements s0, s {
    public Object f46477a;

    public b(Object obj) {
        this.f46477a = obj;
    }

    @Override
    public p0 W0(Class cls, c cVar) {
        m0 m0Var = null;
        for (d dVar : (d[]) this.f46477a) {
            if (dVar.f46478a.equals(cls)) {
                m0Var = new m0();
            }
        }
        if (m0Var != null) {
            return m0Var;
        }
        throw new IllegalArgumentException("No initializer set for given class ".concat(cls.getName()));
    }

    public void a(ea.b bVar, Thread thread, Throwable th2) {
        n nVar = (n) this.f46477a;
        synchronized (nVar) {
            String str = "Handling uncaught exception \"" + th2 + "\" from thread " + thread.getName();
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", str, null);
            }
            try {
                try {
                    x.a(nVar.e.w(new k(nVar, System.currentTimeMillis(), th2, thread, bVar)));
                } catch (TimeoutException unused) {
                    Log.e("FirebaseCrashlytics", "Cannot send reports. Timed out while fetching settings.", null);
                }
            } catch (Exception e) {
                Log.e("FirebaseCrashlytics", "Error handling uncaught exception", e);
            }
        }
    }

    @Override
    public void accept(Object obj, Object obj2) {
        e eVar = (e) this.f46477a;
        e8.b bVar = (e8.b) obj;
        bVar.getClass();
        e8.a aVar = new e8.a(1, (TaskCompletionSource) obj2);
        try {
            i iVar = (i) bVar.u();
            Bundle G = bVar.G();
            Parcel obtain = Parcel.obtain();
            obtain.writeInterfaceToken("com.google.android.gms.wallet.internal.IOwService");
            int i10 = e8.c.f8515a;
            obtain.writeInt(1);
            eVar.writeToParcel(obtain, 0);
            obtain.writeInt(1);
            G.writeToParcel(obtain, 0);
            obtain.writeStrongBinder(aVar);
            iVar.f8523a.transact(14, obtain, null, 1);
            obtain.recycle();
        } catch (RemoteException e) {
            Log.e("WalletClientImpl", "RemoteException during isReadyToPay", e);
            Bundle bundle = Bundle.EMPTY;
            h5.a(Status.h, Boolean.FALSE, aVar.f8514b);
        }
    }

    public void b(IBinder iBinder) {
        synchronized (((HashMap) this.f46477a)) {
            if (iBinder != null) {
                try {
                    iBinder.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableService");
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            new y8.a();
            for (Map.Entry entry : ((HashMap) this.f46477a).entrySet()) {
                if (entry.getValue() == null) {
                    try {
                        throw null;
                        break;
                    } catch (RemoteException unused) {
                        String valueOf = String.valueOf(entry.getKey());
                        Log.w("WearableClient", "onPostInitHandler: Didn't add: " + valueOf + "/null");
                    }
                } else {
                    throw new ClassCastException();
                }
            }
        }
    }

    @Override
    public p0 e(Class cls) {
        throw new UnsupportedOperationException("Factory.create(String) is unsupported.  This Factory requires `CreationExtras` to be passed into `create` method.");
    }

    public b() {
        this.f46477a = new HashMap();
    }
}
