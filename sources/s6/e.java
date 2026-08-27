package s6;

import android.os.IBinder;
import android.os.IInterface;
import kotlin.jvm.internal.j;

public final class e extends y5.g {
    @Override
    public final boolean C() {
        return true;
    }

    @Override
    public final int k() {
        return 17895000;
    }

    @Override
    public final IInterface q(IBinder iBinder) {
        j.e(iBinder, "iBinder");
        int i10 = c.f47799b;
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.identitycredentials.internal.IIdentityCredentialService");
        return iInterfaceQueryLocalInterface instanceof d ? (d) iInterfaceQueryLocalInterface : new b(iBinder);
    }

    @Override
    public final v5.c[] r() {
        return b7.c.f2039c;
    }

    @Override
    public final String v() {
        return "com.google.android.gms.identitycredentials.internal.IIdentityCredentialService";
    }

    @Override
    public final String w() {
        return "com.google.android.gms.identitycredentials.service.START";
    }

    @Override
    public final boolean y() {
        return true;
    }
}
