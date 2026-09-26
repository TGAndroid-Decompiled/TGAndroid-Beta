package x6;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import h8.j;
import i8.g;
public final class c implements e {
    public final Bundle f45628a;
    public final j f45629b;

    public c(j jVar, Bundle bundle) {
        this.f45629b = jVar;
        this.f45628a = bundle;
    }

    @Override
    public final int a() {
        return 1;
    }

    @Override
    public final void b() {
        aa.a aVar = this.f45629b.f10132a;
        Bundle bundle = this.f45628a;
        ViewGroup viewGroup = (ViewGroup) aVar.f359b;
        g gVar = (g) aVar.f360c;
        try {
            Bundle bundle2 = new Bundle();
            i8.d.c(bundle, bundle2);
            Parcel O0 = gVar.O0();
            s7.b.b(O0, bundle2);
            gVar.S0(O0, 2);
            i8.d.c(bundle2, bundle);
            Parcel N0 = gVar.N0(gVar.O0(), 8);
            a L0 = b.L0(N0.readStrongBinder());
            N0.recycle();
            aVar.d = (View) b.M0(L0);
            viewGroup.removeAllViews();
            viewGroup.addView((View) aVar.d);
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }
}
