package y6;

import a8.h0;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import i8.j;
import j8.g;
public final class c implements e {
    public final Bundle f52062a;
    public final j f52063b;

    public c(j jVar, Bundle bundle) {
        this.f52063b = jVar;
        this.f52062a = bundle;
    }

    @Override
    public final int a() {
        return 1;
    }

    @Override
    public final void b() {
        h0 h0Var = this.f52063b.f13893a;
        Bundle bundle = this.f52062a;
        ViewGroup viewGroup = (ViewGroup) h0Var.f511b;
        g gVar = (g) h0Var.f512c;
        try {
            Bundle bundle2 = new Bundle();
            j8.d.c(bundle, bundle2);
            Parcel N0 = gVar.N0();
            t7.b.b(N0, bundle2);
            gVar.R0(N0, 2);
            j8.d.c(bundle2, bundle);
            Parcel M0 = gVar.M0(gVar.N0(), 8);
            a K0 = b.K0(M0.readStrongBinder());
            M0.recycle();
            h0Var.d = (View) b.L0(K0);
            viewGroup.removeAllViews();
            viewGroup.addView((View) h0Var.d);
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }
}
