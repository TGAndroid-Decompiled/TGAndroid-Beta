package x6;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import h8.j;
import i8.g;
public final class c implements e {
    public final Bundle f49312a;
    public final j f49313b;

    public c(j jVar, Bundle bundle) {
        this.f49313b = jVar;
        this.f49312a = bundle;
    }

    @Override
    public final int a() {
        return 1;
    }

    @Override
    public final void b() {
        androidx.biometric.e eVar = this.f49313b.f11692a;
        Bundle bundle = this.f49312a;
        ViewGroup viewGroup = (ViewGroup) eVar.f2815b;
        g gVar = (g) eVar.f2816c;
        try {
            Bundle bundle2 = new Bundle();
            i8.d.c(bundle, bundle2);
            Parcel N0 = gVar.N0();
            s7.b.b(N0, bundle2);
            gVar.R0(N0, 2);
            i8.d.c(bundle2, bundle);
            Parcel M0 = gVar.M0(gVar.N0(), 8);
            a K0 = b.K0(M0.readStrongBinder());
            M0.recycle();
            eVar.d = (View) b.L0(K0);
            viewGroup.removeAllViews();
            viewGroup.addView((View) eVar.d);
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }
}
