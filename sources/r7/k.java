package r7;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import m.p3;
public final class k extends n6.g {
    public final a0.l U;
    public final a0.l V;
    public final a0.l W;

    public k(Context context, Looper looper, com.google.android.gms.common.api.k kVar, com.google.android.gms.common.api.l lVar, p3 p3Var) {
        super(context, looper, 23, p3Var, kVar, lVar, 0);
        this.U = new a0.l(0);
        this.V = new a0.l(0);
        this.W = new a0.l(0);
    }

    @Override
    public final void B(int i10) {
        super.B(i10);
        synchronized (this.U) {
            this.U.clear();
        }
        synchronized (this.V) {
            this.V.clear();
        }
        synchronized (this.W) {
            this.W.clear();
        }
    }

    @Override
    public final boolean D() {
        return true;
    }

    @Override
    public final int m() {
        return 11717000;
    }

    @Override
    public final IInterface r(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        if (queryLocalInterface instanceof x) {
            return (x) queryLocalInterface;
        }
        return new a9.a(iBinder, "com.google.android.gms.location.internal.IGoogleLocationManagerService", 8);
    }

    @Override
    public final k6.c[] s() {
        return g8.i.f7464a;
    }

    @Override
    public final String w() {
        return "com.google.android.gms.location.internal.IGoogleLocationManagerService";
    }

    @Override
    public final String x() {
        return "com.google.android.location.internal.GoogleLocationManagerService.START";
    }
}
