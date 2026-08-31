package p7;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import b6.g;
import com.google.android.gms.common.api.k;
import com.google.android.gms.common.api.l;
import m.r3;
public final class a extends g {
    public final Context R;

    public a(Context context, Looper looper, k kVar, l lVar, r3 r3Var) {
        super(context, looper, 45, r3Var, kVar, lVar, 0);
        this.R = context;
    }

    @Override
    public final boolean C() {
        return true;
    }

    @Override
    public final int k() {
        return 12200000;
    }

    @Override
    public final IInterface q(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.safetynet.internal.ISafetyNetService");
        if (queryLocalInterface instanceof c) {
            return (c) queryLocalInterface;
        }
        return new c(iBinder);
    }

    @Override
    public final String v() {
        return "com.google.android.gms.safetynet.internal.ISafetyNetService";
    }

    @Override
    public final String w() {
        return "com.google.android.gms.safetynet.service.START";
    }
}
