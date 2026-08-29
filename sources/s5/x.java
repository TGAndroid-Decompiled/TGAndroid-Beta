package s5;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.cast.CastDevice;
import m.s3;
public final class x extends z5.g {
    public static final b U = new b("CastClientImplCxless", null);
    public final CastDevice Q;
    public final long R;
    public final Bundle S;
    public final String T;

    public x(Context context, Looper looper, s3 s3Var, CastDevice castDevice, long j10, Bundle bundle, String str, com.google.android.gms.common.api.k kVar, com.google.android.gms.common.api.l lVar) {
        super(context, looper, 10, s3Var, kVar, lVar, 0);
        this.Q = castDevice;
        this.R = j10;
        this.S = bundle;
        this.T = str;
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
        } catch (RemoteException | IllegalStateException e10) {
            U.a(e10, "Error while disconnecting the controller interface", new Object[0]);
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
    public final w5.c[] r() {
        return o5.y.f19350e;
    }

    @Override
    public final Bundle t() {
        Bundle bundle = new Bundle();
        U.b("getRemoteService()", new Object[0]);
        CastDevice castDevice = this.Q;
        castDevice.getClass();
        bundle.putParcelable("com.google.android.gms.cast.EXTRA_CAST_DEVICE", castDevice);
        bundle.putLong("com.google.android.gms.cast.EXTRA_CAST_FLAGS", this.R);
        bundle.putString("connectionless_client_record_id", this.T);
        Bundle bundle2 = this.S;
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
