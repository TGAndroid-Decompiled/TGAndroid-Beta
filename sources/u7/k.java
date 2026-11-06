package u7;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import m.q3;
public final class k extends q6.h {
    public final a0.l F;
    public final a0.l G;
    public final a0.l H;

    public k(Context context, Looper looper, com.google.android.gms.common.api.k kVar, com.google.android.gms.common.api.l lVar, q3 q3Var) {
        super(context, looper, 23, q3Var, kVar, lVar, 0);
        this.F = new a0.l(0);
        this.G = new a0.l(0);
        this.H = new a0.l(0);
    }

    @Override
    public final int d() {
        return 11717000;
    }

    @Override
    public final IInterface i(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        if (queryLocalInterface instanceof x) {
            return (x) queryLocalInterface;
        }
        return new a8.a(iBinder, "com.google.android.gms.location.internal.IGoogleLocationManagerService", 10);
    }

    @Override
    public final n6.c[] k() {
        return j8.h.f16595a;
    }

    @Override
    public final String o() {
        return "com.google.android.gms.location.internal.IGoogleLocationManagerService";
    }

    @Override
    public final String p() {
        return "com.google.android.location.internal.GoogleLocationManagerService.START";
    }

    @Override
    public final void v(int i7) {
        super.v(i7);
        synchronized (this.F) {
            this.F.clear();
        }
        synchronized (this.G) {
            this.G.clear();
        }
        synchronized (this.H) {
            this.H.clear();
        }
    }

    @Override
    public final boolean x() {
        return true;
    }
}
