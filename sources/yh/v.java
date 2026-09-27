package yh;

import org.telegram.messenger.MessagesStorage;
public final class v implements MessagesStorage.IntCallback {
    public final int f48178a;
    public final Object f48179b;

    public v(Object obj, int i10) {
        this.f48178a = i10;
        this.f48179b = obj;
    }

    @Override
    public final void run(int i10) {
        zf.b bVar;
        zf.b bVar2;
        zf.b bVar3;
        switch (this.f48178a) {
            case 0:
                a0 a0Var = (a0) this.f48179b;
                a0Var.getClass();
                if (i10 == 0) {
                    bVar = zf.b.f49270a;
                } else {
                    bVar = zf.b.f49271b;
                }
                a0Var.U(zf.a.i(0L, bVar), true, false, true);
                a0Var.f47224d0.setText("");
                return;
            case 1:
                e0 e0Var = (e0) this.f48179b;
                e0Var.getClass();
                if (i10 == 0) {
                    bVar2 = zf.b.f49270a;
                } else {
                    bVar2 = zf.b.f49271b;
                }
                e0Var.q(zf.a.i(0L, bVar2), true, false, true);
                e0Var.h.setText("");
                return;
            default:
                c3 c3Var = (c3) this.f48179b;
                c3Var.getClass();
                if (i10 == 0) {
                    bVar3 = zf.b.f49270a;
                } else {
                    bVar3 = zf.b.f49271b;
                }
                c3Var.f47318q = bVar3;
                c3Var.a(true);
                return;
        }
    }
}
