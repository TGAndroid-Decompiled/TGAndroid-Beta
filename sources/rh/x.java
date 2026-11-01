package rh;

import org.telegram.messenger.cs;
public final class x implements cs {
    public final int f47682a;
    public final Object f47683b;

    public x(Object obj, int i10) {
        this.f47682a = i10;
        this.f47683b = obj;
    }

    @Override
    public final void a(int i10) {
        sf.b bVar;
        sf.b bVar2;
        sf.b bVar3;
        switch (this.f47682a) {
            case 0:
                b0 b0Var = (b0) this.f47683b;
                b0Var.getClass();
                if (i10 == 0) {
                    bVar = sf.b.f48267a;
                } else {
                    bVar = sf.b.f48268b;
                }
                b0Var.f1(sf.a.i(0L, bVar), true, false, true);
                b0Var.W1.setText("");
                return;
            case 1:
                e0 e0Var = (e0) this.f47683b;
                e0Var.getClass();
                if (i10 == 0) {
                    bVar2 = sf.b.f48267a;
                } else {
                    bVar2 = sf.b.f48268b;
                }
                e0Var.M0(sf.a.i(0L, bVar2), true, false, true);
                e0Var.f46790n1.setText("");
                return;
            default:
                g3 g3Var = (g3) this.f47683b;
                g3Var.getClass();
                if (i10 == 0) {
                    bVar3 = sf.b.f48267a;
                } else {
                    bVar3 = sf.b.f48268b;
                }
                g3Var.f46965q = bVar3;
                g3Var.a(true);
                return;
        }
    }
}
