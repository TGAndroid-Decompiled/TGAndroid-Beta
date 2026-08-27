package r5;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.BinderWrapper;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicLong;
import m.t3;
import n5.e0;

public final class w extends y5.g {

    public static final b f46816j0 = new b("CastClientImpl", null);

    public static final Object f46817k0 = new Object();

    public static final Object f46818l0 = new Object();
    public m5.d Q;
    public final CastDevice R;
    public final e0 S;
    public final HashMap T;
    public final long U;
    public final Bundle V;
    public v W;
    public String X;
    public boolean Y;
    public boolean Z;

    public boolean f46819a0;

    public double f46820b0;

    public m5.y f46821c0;

    public int f46822d0;

    public int f46823e0;

    public String f46824f0;

    public String f46825g0;

    public Bundle f46826h0;

    public final HashMap f46827i0;

    public w(Context context, Looper looper, t3 t3Var, CastDevice castDevice, long j10, e0 e0Var, Bundle bundle, com.google.android.gms.common.api.k kVar, com.google.android.gms.common.api.l lVar) {
        super(context, looper, 10, t3Var, kVar, lVar, 0);
        this.R = castDevice;
        this.S = e0Var;
        this.U = j10;
        this.V = bundle;
        this.T = new HashMap();
        new AtomicLong(0L);
        this.f46827i0 = new HashMap();
        this.f46822d0 = -1;
        this.f46823e0 = -1;
        this.Q = null;
        this.X = null;
        this.f46820b0 = 0.0d;
        I();
        this.Y = false;
        this.f46821c0 = null;
        I();
    }

    public static void G(w wVar, long j10, int i10) {
        com.google.android.gms.common.api.internal.f fVar;
        synchronized (wVar.f46827i0) {
            fVar = (com.google.android.gms.common.api.internal.f) wVar.f46827i0.remove(Long.valueOf(j10));
        }
        if (fVar != null) {
            fVar.a(new Status(i10, null, null, null));
        }
    }

    @Override
    public final void B(int i10, IBinder iBinder, Bundle bundle, int i11) {
        f46816j0.b("in onPostInitHandler; statusCode=%d", Integer.valueOf(i10));
        if (i10 == 0 || i10 == 2300) {
            this.Z = true;
            this.f46819a0 = true;
        }
        if (i10 == 2300) {
            Bundle bundle2 = new Bundle();
            this.f46826h0 = bundle2;
            bundle2.putBoolean("com.google.android.gms.cast.EXTRA_APP_NO_LONGER_RUNNING", true);
            i10 = 0;
        }
        super.B(i10, iBinder, bundle, i11);
    }

    public final void H() {
        f46816j0.b("removing all MessageReceivedCallbacks", new Object[0]);
        synchronized (this.T) {
            this.T.clear();
        }
    }

    public final void I() {
        CastDevice castDevice = this.R;
        y5.l.i(castDevice, "device should not be null");
        if (castDevice.c(2048) || !castDevice.c(4) || castDevice.c(1)) {
            return;
        }
        "Chromecast Audio".equals(castDevice.f3130e);
    }

    @Override
    public final void disconnect() {
        Object[] objArr = {this.W, Boolean.valueOf(h())};
        b bVar = f46816j0;
        bVar.b("disconnect(); ServiceListener=%s, isConnected=%b", objArr);
        v vVar = this.W;
        w wVar = null;
        this.W = null;
        if (vVar != null) {
            w wVar2 = (w) vVar.f46814b.getAndSet(null);
            if (wVar2 != null) {
                wVar2.f46822d0 = -1;
                wVar2.f46823e0 = -1;
                wVar2.Q = null;
                wVar2.X = null;
                wVar2.f46820b0 = 0.0d;
                wVar2.I();
                wVar2.Y = false;
                wVar2.f46821c0 = null;
                wVar = wVar2;
            }
            if (wVar != null) {
                H();
                try {
                    try {
                        ((f) u()).U0();
                    } finally {
                        super.disconnect();
                    }
                } catch (RemoteException | IllegalStateException e9) {
                    bVar.a(e9, "Error while disconnecting the controller interface", new Object[0]);
                }
                return;
            }
        }
        bVar.b("already disposed, so short-circuiting", new Object[0]);
    }

    @Override
    public final int k() {
        return 12800000;
    }

    @Override
    public final IInterface q(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.internal.ICastDeviceController");
        return iInterfaceQueryLocalInterface instanceof f ? (f) iInterfaceQueryLocalInterface : new f(iBinder);
    }

    @Override
    public final Bundle s() {
        Bundle bundle = this.f46826h0;
        if (bundle == null) {
            return null;
        }
        this.f46826h0 = null;
        return bundle;
    }

    @Override
    public final Bundle t() {
        Bundle bundle = new Bundle();
        f46816j0.b("getRemoteService(): mLastApplicationId=%s, mLastSessionId=%s", this.f46824f0, this.f46825g0);
        CastDevice castDevice = this.R;
        castDevice.getClass();
        bundle.putParcelable("com.google.android.gms.cast.EXTRA_CAST_DEVICE", castDevice);
        bundle.putLong("com.google.android.gms.cast.EXTRA_CAST_FLAGS", this.U);
        Bundle bundle2 = this.V;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        v vVar = new v(this);
        this.W = vVar;
        bundle.putParcelable("listener", new BinderWrapper(vVar));
        String str = this.f46824f0;
        if (str != null) {
            bundle.putString("last_application_id", str);
            String str2 = this.f46825g0;
            if (str2 != null) {
                bundle.putString("last_session_id", str2);
            }
        }
        return bundle;
    }

    @Override
    public final String v() {
        return "com.google.android.gms.cast.internal.ICastDeviceController";
    }

    @Override
    public final String w() {
        return "com.google.android.gms.cast.service.BIND_CAST_DEVICE_CONTROLLER_SERVICE";
    }

    @Override
    public final void z(v5.a aVar) {
        super.z(aVar);
        H();
    }
}
