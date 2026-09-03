package v6;

import android.os.IBinder;
import android.os.IInterface;
import kotlin.jvm.internal.j;
public final class e extends b6.g {
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
        int i10 = c.f48950b;
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.identitycredentials.internal.IIdentityCredentialService");
        if (queryLocalInterface instanceof d) {
            return (d) queryLocalInterface;
        }
        return new b(iBinder);
    }

    @Override
    public final y5.c[] r() {
        return e7.b.f4994c;
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
