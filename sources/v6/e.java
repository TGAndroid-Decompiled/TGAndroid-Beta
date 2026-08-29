package v6;

import android.os.IBinder;
import android.os.IInterface;
import z5.g;
public final class e extends g {
    @Override
    public final boolean C() {
        return true;
    }

    @Override
    public final int k() {
        return 12451000;
    }

    @Override
    public final IInterface q(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService");
        if (queryLocalInterface instanceof d) {
            return (d) queryLocalInterface;
        }
        return new d(iBinder);
    }

    @Override
    public final w5.c[] r() {
        return b.f49434b;
    }

    @Override
    public final String v() {
        return "com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService";
    }

    @Override
    public final String w() {
        return "com.google.android.gms.auth.api.phone.service.SmsRetrieverApiService.START";
    }
}
