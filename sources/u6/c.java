package u6;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.k;
import com.google.android.gms.common.api.l;
import m.s3;
public final class c extends z5.g {
    public final Bundle Q;

    public c(Context context, Looper looper, k kVar, l lVar, s3 s3Var) {
        super(context, looper, 212, s3Var, kVar, lVar, 0);
        this.Q = new Bundle();
    }

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
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.identity.internal.ISignInService");
        if (queryLocalInterface instanceof i) {
            return (i) queryLocalInterface;
        }
        return new com.google.android.gms.internal.cast.a(iBinder, "com.google.android.gms.auth.api.identity.internal.ISignInService", 9);
    }

    @Override
    public final w5.c[] r() {
        return d.f49119b;
    }

    @Override
    public final Bundle t() {
        return this.Q;
    }

    @Override
    public final String v() {
        return "com.google.android.gms.auth.api.identity.internal.ISignInService";
    }

    @Override
    public final String w() {
        return "com.google.android.gms.auth.api.identity.service.signin.START";
    }

    @Override
    public final boolean y() {
        return true;
    }
}
