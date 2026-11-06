package q7;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
public final class l1 extends q6.h {
    @Override
    public final int d() {
        return 13000000;
    }

    @Override
    public final IInterface i(IBinder iBinder) {
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
    public final n6.c[] k() {
        return new n6.c[]{c7.a.f5365b, c7.a.f5364a};
    }

    @Override
    public final Bundle m() {
        Bundle bundle = new Bundle();
        bundle.putString("FIDO2_ACTION_START_SERVICE", "com.google.android.gms.fido.fido2.regular.START");
        return bundle;
    }

    @Override
    public final String o() {
        return "com.google.android.gms.fido.fido2.internal.regular.IFido2AppService";
    }

    @Override
    public final String p() {
        return "com.google.android.gms.fido.fido2.regular.START";
    }

    @Override
    public final boolean x() {
        return true;
    }
}
