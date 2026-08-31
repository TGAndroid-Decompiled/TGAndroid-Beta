package rg;

import j3.w;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
public final class d implements a {
    public final g6 f46808a;
    public c f46809b;
    public c f46810c;
    public c d;
    public c f46811e;
    public float f46812f;
    public float h;
    public float f46813n;
    public float f46814r;

    public d(g6 g6Var) {
        this.f46808a = g6Var;
        float dpf2 = AndroidUtilities.dpf2(1.0f);
        float dpf22 = AndroidUtilities.dpf2(0.33333334f);
        this.f46813n = dpf2;
        this.f46814r = dpf22;
        float dpf23 = AndroidUtilities.dpf2(1.0f);
        float dpf24 = AndroidUtilities.dpf2(0.6666667f);
        this.f46812f = dpf23;
        this.h = dpf24;
    }

    @Override
    public final int I() {
        return a(this.f46809b);
    }

    @Override
    public final int U() {
        return a(this.f46811e);
    }

    public final int a(c cVar) {
        boolean a2;
        if (cVar != null) {
            g6 g6Var = this.f46808a;
            if (!(g6Var instanceof oh.b) && g6Var == null) {
                a2 = k6.I.q();
            } else {
                a2 = g6Var.a();
            }
            return cVar.g(g6Var, a2);
        }
        return 0;
    }

    public final void b(int i10, int i11) {
        this.f46809b = new w(i11, i10, 2);
    }

    public final void c(int i10, int i11) {
        this.d = new w(i11, i10, 2);
    }

    public final void d(int i10, int i11) {
        this.f46810c = new w(i11, i10, 2);
    }

    @Override
    public final int k() {
        return a(this.f46810c);
    }

    @Override
    public final int x() {
        return a(this.d);
    }
}
