package z6;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
public final class l1 extends z5.g {
    @Override
    public final boolean C() {
        return true;
    }

    @Override
    public final int k() {
        return 13000000;
    }

    @Override
    public final IInterface q(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fido.fido2.internal.regular.IFido2AppService");
        if (queryLocalInterface instanceof m1) {
            return (m1) queryLocalInterface;
        }
        return new m1(iBinder, "com.google.android.gms.fido.fido2.internal.regular.IFido2AppService");
    }

    @Override
    public final w5.c[] r() {
        return new w5.c[]{l6.a.f14489b, l6.a.f14488a};
    }

    @Override
    public final Bundle t() {
        Bundle bundle = new Bundle();
        bundle.putString("FIDO2_ACTION_START_SERVICE", "com.google.android.gms.fido.fido2.regular.START");
        return bundle;
    }

    @Override
    public final String v() {
        return "com.google.android.gms.fido.fido2.internal.regular.IFido2AppService";
    }

    @Override
    public final String w() {
        return "com.google.android.gms.fido.fido2.regular.START";
    }
}
