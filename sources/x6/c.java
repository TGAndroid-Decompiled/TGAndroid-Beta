package x6;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import h8.j;
import i8.g;
public final class c implements e {
    public final Bundle f50776a;
    public final j f50777b;

    public c(j jVar, Bundle bundle) {
        this.f50777b = jVar;
        this.f50776a = bundle;
    }

    @Override
    public final int a() {
        return 1;
    }

    @Override
    public final void b() {
        aa.a aVar = this.f50777b.f11041a;
        Bundle bundle = this.f50776a;
        ViewGroup viewGroup = (ViewGroup) aVar.f384b;
        g gVar = (g) aVar.f385c;
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
            aVar.d = (View) b.L0(K0);
            viewGroup.removeAllViews();
            viewGroup.addView((View) aVar.d);
        } catch (RemoteException e7) {
            throw new RuntimeException(e7);
        }
    }
}
