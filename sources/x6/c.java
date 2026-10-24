package x6;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import h8.j;
import i8.g;
public final class c implements e {
    public final Bundle f49757a;
    public final j f49758b;

    public c(j jVar, Bundle bundle) {
        this.f49758b = jVar;
        this.f49757a = bundle;
    }

    @Override
    public final int a() {
        return 1;
    }

    @Override
    public final void b() {
        androidx.biometric.e eVar = this.f49758b.f11719a;
        Bundle bundle = this.f49757a;
        ViewGroup viewGroup = (ViewGroup) eVar.f2822b;
        g gVar = (g) eVar.f2823c;
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
