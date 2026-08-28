package q5;

import android.os.IBinder;
import android.os.IInterface;
public final class t extends x5.g {
    @Override
    public final boolean C() {
        return true;
    }

    @Override
    public final int l() {
        return 12451000;
    }

    @Override
    public final IInterface q(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.internal.ICastService");
        if (queryLocalInterface instanceof i) {
            return (i) queryLocalInterface;
        }
        return new b7.a(iBinder, "com.google.android.gms.cast.internal.ICastService", 2);
    }

    @Override
    public final u5.c[] r() {
        return m5.y.f17491e;
    }

    @Override
    public final String v() {
        return "com.google.android.gms.cast.internal.ICastService";
    }

    @Override
    public final String w() {
        return "com.google.android.gms.cast.service.BIND_CAST_DEVICE_CONTROLLER_SERVICE";
    }
}
