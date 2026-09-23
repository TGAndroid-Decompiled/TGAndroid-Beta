package yh;

import org.telegram.messenger.MessagesStorage;
public final class v implements MessagesStorage.IntCallback {
    public final int f47789a;
    public final Object f47790b;

    public v(Object obj, int i10) {
        this.f47789a = i10;
        this.f47790b = obj;
    }

    @Override
    public final void run(int i10) {
        zf.b bVar;
        zf.b bVar2;
        zf.b bVar3;
        switch (this.f47789a) {
            case 0:
                a0 a0Var = (a0) this.f47790b;
                a0Var.getClass();
                if (i10 == 0) {
                    bVar = zf.b.f48898a;
                } else {
                    bVar = zf.b.f48899b;
                }
                a0Var.U(zf.a.i(0L, bVar), true, false, true);
                a0Var.f46851d0.setText("");
                return;
            case 1:
                e0 e0Var = (e0) this.f47790b;
                e0Var.getClass();
                if (i10 == 0) {
                    bVar2 = zf.b.f48898a;
                } else {
                    bVar2 = zf.b.f48899b;
                }
                e0Var.q(zf.a.i(0L, bVar2), true, false, true);
                e0Var.h.setText("");
                return;
            default:
                d3 d3Var = (d3) this.f47790b;
                d3Var.getClass();
                if (i10 == 0) {
                    bVar3 = zf.b.f48898a;
                } else {
                    bVar3 = zf.b.f48899b;
                }
                d3Var.f46984q = bVar3;
                d3Var.a(true);
                return;
        }
    }
}
