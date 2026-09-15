package yh;

import org.telegram.messenger.MessagesStorage;
public final class v implements MessagesStorage.IntCallback {
    public final int f47876a;
    public final Object f47877b;

    public v(Object obj, int i10) {
        this.f47876a = i10;
        this.f47877b = obj;
    }

    @Override
    public final void run(int i10) {
        zf.b bVar;
        zf.b bVar2;
        zf.b bVar3;
        switch (this.f47876a) {
            case 0:
                a0 a0Var = (a0) this.f47877b;
                a0Var.getClass();
                if (i10 == 0) {
                    bVar = zf.b.f48954a;
                } else {
                    bVar = zf.b.f48955b;
                }
                a0Var.U(zf.a.i(0L, bVar), true, false, true);
                a0Var.f46900d0.setText("");
                return;
            case 1:
                e0 e0Var = (e0) this.f47877b;
                e0Var.getClass();
                if (i10 == 0) {
                    bVar2 = zf.b.f48954a;
                } else {
                    bVar2 = zf.b.f48955b;
                }
                e0Var.q(zf.a.i(0L, bVar2), true, false, true);
                e0Var.h.setText("");
                return;
            default:
                f3 f3Var = (f3) this.f47877b;
                f3Var.getClass();
                if (i10 == 0) {
                    bVar3 = zf.b.f48954a;
                } else {
                    bVar3 = zf.b.f48955b;
                }
                f3Var.f47159q = bVar3;
                f3Var.a(true);
                return;
        }
    }
}
