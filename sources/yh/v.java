package yh;

import org.telegram.messenger.MessagesStorage;
public final class v implements MessagesStorage.IntCallback {
    public final int f47899a;
    public final Object f47900b;

    public v(Object obj, int i10) {
        this.f47899a = i10;
        this.f47900b = obj;
    }

    @Override
    public final void run(int i10) {
        zf.b bVar;
        zf.b bVar2;
        zf.b bVar3;
        switch (this.f47899a) {
            case 0:
                a0 a0Var = (a0) this.f47900b;
                a0Var.getClass();
                if (i10 == 0) {
                    bVar = zf.b.f48977a;
                } else {
                    bVar = zf.b.f48978b;
                }
                a0Var.U(zf.a.i(0L, bVar), true, false, true);
                a0Var.f46923d0.setText("");
                return;
            case 1:
                e0 e0Var = (e0) this.f47900b;
                e0Var.getClass();
                if (i10 == 0) {
                    bVar2 = zf.b.f48977a;
                } else {
                    bVar2 = zf.b.f48978b;
                }
                e0Var.q(zf.a.i(0L, bVar2), true, false, true);
                e0Var.h.setText("");
                return;
            default:
                f3 f3Var = (f3) this.f47900b;
                f3Var.getClass();
                if (i10 == 0) {
                    bVar3 = zf.b.f48977a;
                } else {
                    bVar3 = zf.b.f48978b;
                }
                f3Var.f47182q = bVar3;
                f3Var.a(true);
                return;
        }
    }
}
