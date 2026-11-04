package t7;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import m.o3;
public final class k extends p6.h {
    public final a0.l F;
    public final a0.l G;
    public final a0.l H;

    public k(Context context, Looper looper, com.google.android.gms.common.api.k kVar, com.google.android.gms.common.api.l lVar, o3 o3Var) {
        super(context, looper, 23, o3Var, kVar, lVar, 0);
        this.F = new a0.l(0);
        this.G = new a0.l(0);
        this.H = new a0.l(0);
    }

    @Override
    public final int d() {
        return 11717000;
    }

    @Override
    public final IInterface g(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        if (queryLocalInterface instanceof x) {
            return (x) queryLocalInterface;
        }
        return new b8.a(iBinder, "com.google.android.gms.location.internal.IGoogleLocationManagerService", 9);
    }

    @Override
    public final m6.c[] i() {
        return i8.h.f14710a;
    }

    @Override
    public final String n() {
        return "com.google.android.gms.location.internal.IGoogleLocationManagerService";
    }

    @Override
    public final String o() {
        return "com.google.android.location.internal.GoogleLocationManagerService.START";
    }

    @Override
    public final void u(int i3) {
        super.u(i3);
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
    public final boolean w() {
        return true;
    }
}
