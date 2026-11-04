package p7;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
public final class m1 extends p6.h {
    @Override
    public final int d() {
        return 13000000;
    }

    @Override
    public final IInterface g(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fido.fido2.internal.regular.IFido2AppService");
        if (queryLocalInterface instanceof n1) {
            return (n1) queryLocalInterface;
        }
        return new n1(iBinder, "com.google.android.gms.fido.fido2.internal.regular.IFido2AppService");
    }

    @Override
    public final m6.c[] i() {
        return new m6.c[]{b7.a.f2454b, b7.a.f2453a};
    }

    @Override
    public final Bundle k() {
        Bundle bundle = new Bundle();
        bundle.putString("FIDO2_ACTION_START_SERVICE", "com.google.android.gms.fido.fido2.regular.START");
        return bundle;
    }

    @Override
    public final String n() {
        return "com.google.android.gms.fido.fido2.internal.regular.IFido2AppService";
    }

    @Override
    public final String o() {
        return "com.google.android.gms.fido.fido2.regular.START";
    }

    @Override
    public final boolean w() {
        return true;
    }
}
