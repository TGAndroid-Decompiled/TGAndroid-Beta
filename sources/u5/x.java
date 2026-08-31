package u5;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.cast.CastDevice;
import m.r3;
public final class x extends b6.g {
    public static final b V = new b("CastClientImplCxless", null);
    public final CastDevice R;
    public final long S;
    public final Bundle T;
    public final String U;

    public x(Context context, Looper looper, r3 r3Var, CastDevice castDevice, long j10, Bundle bundle, String str, com.google.android.gms.common.api.k kVar, com.google.android.gms.common.api.l lVar) {
        super(context, looper, 10, r3Var, kVar, lVar, 0);
        this.R = castDevice;
        this.S = j10;
        this.T = bundle;
        this.U = str;
    }

    @Override
    public final boolean C() {
        return true;
    }

    @Override
    public final void disconnect() {
        try {
            try {
                ((f) u()).U0();
            } finally {
                super.disconnect();
            }
        } catch (RemoteException | IllegalStateException e6) {
            V.a(e6, "Error while disconnecting the controller interface", new Object[0]);
        }
    }

    @Override
    public final int k() {
        return 19390000;
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
    public final y5.c[] r() {
        return q5.y.f44641e;
    }

    @Override
    public final Bundle t() {
        Bundle bundle = new Bundle();
        V.b("getRemoteService()", new Object[0]);
        CastDevice castDevice = this.R;
        castDevice.getClass();
        bundle.putParcelable("com.google.android.gms.cast.EXTRA_CAST_DEVICE", castDevice);
        bundle.putLong("com.google.android.gms.cast.EXTRA_CAST_FLAGS", this.S);
        bundle.putString("connectionless_client_record_id", this.U);
        Bundle bundle2 = this.T;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
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
}
