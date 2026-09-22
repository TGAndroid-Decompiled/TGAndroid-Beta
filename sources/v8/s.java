package v8;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.io.IOException;
import java.util.ConcurrentModificationException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import org.telegram.ui.f71;
import v7.g5;
public final class s implements com.google.android.gms.common.api.internal.s, w2.d, Continuation, y2.h, f71 {
    public Object f44261a;

    public s(Object obj) {
        this.f44261a = obj;
    }

    public void a(IBinder iBinder) {
        synchronized (((HashMap) this.f44261a)) {
            if (iBinder != null) {
                try {
                    iBinder.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableService");
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            new y8.a();
            for (Map.Entry entry : ((HashMap) this.f44261a).entrySet()) {
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
    public void accept(Object obj, Object obj2) {
        e eVar = (e) this.f44261a;
        e8.b bVar = (e8.b) obj;
        bVar.getClass();
        e8.a aVar = new e8.a(1, (TaskCompletionSource) obj2);
        try {
            e8.i iVar = (e8.i) bVar.u();
            Bundle G = bVar.G();
            Parcel obtain = Parcel.obtain();
            obtain.writeInterfaceToken("com.google.android.gms.wallet.internal.IOwService");
            int i10 = e8.c.f8040a;
            obtain.writeInt(1);
            eVar.writeToParcel(obtain, 0);
            obtain.writeInt(1);
            G.writeToParcel(obtain, 0);
            obtain.writeStrongBinder(aVar);
            iVar.f8048a.transact(14, obtain, null, 1);
            obtain.recycle();
        } catch (RemoteException e) {
            Log.e("WalletClientImpl", "RemoteException during isReadyToPay", e);
            Bundle bundle = Bundle.EMPTY;
            g5.a(Status.h, Boolean.FALSE, aVar.f8039b);
        }
    }

    @Override
    public k4.d n(y2.j jVar, long j3, long j10, IOException iOException, int i10) {
        ((l2.d) this.f44261a).f13814a.x(iOException);
        return y2.m.e;
    }

    @Override
    public void q(y2.j jVar, long j3, long j10) {
        boolean z10;
        l2.d dVar = (l2.d) this.f44261a;
        synchronized (z2.b.f48070b) {
            z10 = z2.b.f48071c;
        }
        if (!z10) {
            dVar.f13814a.x(new IOException(new ConcurrentModificationException()));
            return;
        }
        dVar.a();
    }

    @Override
    public Object then(Task task) {
        return ((Callable) this.f44261a).call();
    }

    public s(int i10) {
        switch (i10) {
            case 4:
                this.f44261a = new HashMap();
                return;
            default:
                this.f44261a = new qb.b(28);
                return;
        }
    }

    @Override
    public void V(y2.j jVar, long j3, long j10, boolean z10) {
    }

    @Override
    public void o(y2.j jVar, long j3, long j10, int i10) {
    }
}
