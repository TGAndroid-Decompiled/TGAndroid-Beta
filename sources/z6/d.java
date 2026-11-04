package z6;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.support.v4.media.session.a0;
import android.view.View;
import android.view.ViewGroup;
import j$.util.Objects;
import k8.f;
import m.o3;
public final class d {
    public final int f59792a;
    public final o3 f59793b;

    public d(o3 o3Var, int i3) {
        this.f59792a = i3;
        switch (i3) {
            case 1:
                Objects.requireNonNull(o3Var);
                this.f59793b = o3Var;
                return;
            default:
                Objects.requireNonNull(o3Var);
                this.f59793b = o3Var;
                return;
        }
    }

    public final int a() {
        switch (this.f59792a) {
            case 0:
                return 1;
            default:
                return 5;
        }
    }

    public final void b() {
        switch (this.f59792a) {
            case 0:
                a0 a0Var = (a0) this.f59793b.f18683b;
                ViewGroup viewGroup = (ViewGroup) a0Var.f1186b;
                f fVar = (f) a0Var.f1187c;
                try {
                    Bundle bundle = new Bundle();
                    Parcel P0 = fVar.P0();
                    u7.b.b(P0, bundle);
                    fVar.T0(P0, 2);
                    k8.c.c(bundle, null);
                    Parcel O0 = fVar.O0(fVar.P0(), 8);
                    a M0 = b.M0(O0.readStrongBinder());
                    O0.recycle();
                    a0Var.d = (View) b.N0(M0);
                    viewGroup.removeAllViews();
                    viewGroup.addView((View) a0Var.d);
                    return;
                } catch (RemoteException e10) {
                    throw new RuntimeException(e10);
                }
            default:
                a0 a0Var2 = (a0) this.f59793b.f18683b;
                a0Var2.getClass();
                try {
                    f fVar2 = (f) a0Var2.f1187c;
                    fVar2.T0(fVar2.P0(), 3);
                    return;
                } catch (RemoteException e11) {
                    throw new RuntimeException(e11);
                }
        }
    }
}
