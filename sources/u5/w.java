package u5;

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
import m.r3;
import r5.e0;
public final class w extends b6.g {
    public static final b f48433k0 = new b("CastClientImpl", null);
    public static final Object f48434l0 = new Object();
    public static final Object m0 = new Object();
    public q5.d R;
    public final CastDevice S;
    public final e0 T;
    public final HashMap U;
    public final long V;
    public final Bundle W;
    public v X;
    public String Y;
    public boolean Z;
    public boolean f48435a0;
    public boolean f48436b0;
    public double f48437c0;
    public q5.x f48438d0;
    public int f48439e0;
    public int f48440f0;
    public String f48441g0;
    public String f48442h0;
    public Bundle f48443i0;
    public final HashMap f48444j0;

    public w(Context context, Looper looper, r3 r3Var, CastDevice castDevice, long j10, e0 e0Var, Bundle bundle, com.google.android.gms.common.api.k kVar, com.google.android.gms.common.api.l lVar) {
        super(context, looper, 10, r3Var, kVar, lVar, 0);
        this.S = castDevice;
        this.T = e0Var;
        this.V = j10;
        this.W = bundle;
        this.U = new HashMap();
        new AtomicLong(0L);
        this.f48444j0 = new HashMap();
        this.f48439e0 = -1;
        this.f48440f0 = -1;
        this.R = null;
        this.Y = null;
        this.f48437c0 = 0.0d;
        I();
        this.Z = false;
        this.f48438d0 = null;
        I();
    }

    public static void G(w wVar, long j10, int i10) {
        com.google.android.gms.common.api.internal.f fVar;
        synchronized (wVar.f48444j0) {
            fVar = (com.google.android.gms.common.api.internal.f) wVar.f48444j0.remove(Long.valueOf(j10));
        }
        if (fVar != null) {
            fVar.a(new Status(i10, null, null, null));
        }
    }

    @Override
    public final void B(int i10, IBinder iBinder, Bundle bundle, int i11) {
        f48433k0.b("in onPostInitHandler; statusCode=%d", Integer.valueOf(i10));
        if (i10 == 0 || i10 == 2300) {
            this.f48435a0 = true;
            this.f48436b0 = true;
        }
        if (i10 == 2300) {
            Bundle bundle2 = new Bundle();
            this.f48443i0 = bundle2;
            bundle2.putBoolean("com.google.android.gms.cast.EXTRA_APP_NO_LONGER_RUNNING", true);
            i10 = 0;
        }
        super.B(i10, iBinder, bundle, i11);
    }

    public final void H() {
        f48433k0.b("removing all MessageReceivedCallbacks", new Object[0]);
        synchronized (this.U) {
            this.U.clear();
        }
    }

    public final void I() {
        CastDevice castDevice = this.S;
        b6.m.i(castDevice, "device should not be null");
        if (!castDevice.f(2048) && castDevice.f(4) && !castDevice.f(1)) {
            "Chromecast Audio".equals(castDevice.f2598e);
        }
    }

    @Override
    public final void disconnect() {
        Object[] objArr = {this.X, Boolean.valueOf(h())};
        b bVar = f48433k0;
        bVar.b("disconnect(); ServiceListener=%s, isConnected=%b", objArr);
        v vVar = this.X;
        w wVar = null;
        this.X = null;
        if (vVar != null) {
            w wVar2 = (w) vVar.f48431b.getAndSet(null);
            if (wVar2 != null) {
                wVar2.f48439e0 = -1;
                wVar2.f48440f0 = -1;
                wVar2.R = null;
                wVar2.Y = null;
                wVar2.f48437c0 = 0.0d;
                wVar2.I();
                wVar2.Z = false;
                wVar2.f48438d0 = null;
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
                } catch (RemoteException | IllegalStateException e6) {
                    bVar.a(e6, "Error while disconnecting the controller interface", new Object[0]);
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
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.internal.ICastDeviceController");
        if (queryLocalInterface instanceof f) {
            return (f) queryLocalInterface;
        }
        return new f(iBinder);
    }

    @Override
    public final Bundle s() {
        Bundle bundle = this.f48443i0;
        if (bundle == null) {
            return null;
        }
        this.f48443i0 = null;
        return bundle;
    }

    @Override
    public final Bundle t() {
        Bundle bundle = new Bundle();
        f48433k0.b("getRemoteService(): mLastApplicationId=%s, mLastSessionId=%s", this.f48441g0, this.f48442h0);
        CastDevice castDevice = this.S;
        castDevice.getClass();
        bundle.putParcelable("com.google.android.gms.cast.EXTRA_CAST_DEVICE", castDevice);
        bundle.putLong("com.google.android.gms.cast.EXTRA_CAST_FLAGS", this.V);
        Bundle bundle2 = this.W;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        v vVar = new v(this);
        this.X = vVar;
        bundle.putParcelable("listener", new BinderWrapper(vVar));
        String str = this.f48441g0;
        if (str != null) {
            bundle.putString("last_application_id", str);
            String str2 = this.f48442h0;
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
    public final void z(y5.a aVar) {
        super.z(aVar);
        H();
    }
}
