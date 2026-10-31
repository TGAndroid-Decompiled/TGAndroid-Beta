package rh;

import org.telegram.messenger.bs;
public final class x implements bs {
    public final int f47672a;
    public final Object f47673b;

    public x(Object obj, int i10) {
        this.f47672a = i10;
        this.f47673b = obj;
    }

    @Override
    public final void a(int i10) {
        sf.b bVar;
        sf.b bVar2;
        sf.b bVar3;
        switch (this.f47672a) {
            case 0:
                b0 b0Var = (b0) this.f47673b;
                b0Var.getClass();
                if (i10 == 0) {
                    bVar = sf.b.f48256a;
                } else {
                    bVar = sf.b.f48257b;
                }
                b0Var.f1(sf.a.i(0L, bVar), true, false, true);
                b0Var.W1.setText("");
                return;
            case 1:
                e0 e0Var = (e0) this.f47673b;
                e0Var.getClass();
                if (i10 == 0) {
                    bVar2 = sf.b.f48256a;
                } else {
                    bVar2 = sf.b.f48257b;
                }
                e0Var.M0(sf.a.i(0L, bVar2), true, false, true);
                e0Var.f46776n1.setText("");
                return;
            default:
                g3 g3Var = (g3) this.f47673b;
                g3Var.getClass();
                if (i10 == 0) {
                    bVar3 = sf.b.f48256a;
                } else {
                    bVar3 = sf.b.f48257b;
                }
                g3Var.f46951q = bVar3;
                g3Var.a(true);
                return;
        }
    }
}
