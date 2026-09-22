package yh;

import org.telegram.messenger.MessagesStorage;
public final class v implements MessagesStorage.IntCallback {
    public final int f47829a;
    public final Object f47830b;

    public v(Object obj, int i10) {
        this.f47829a = i10;
        this.f47830b = obj;
    }

    @Override
    public final void run(int i10) {
        zf.b bVar;
        zf.b bVar2;
        zf.b bVar3;
        switch (this.f47829a) {
            case 0:
                a0 a0Var = (a0) this.f47830b;
                a0Var.getClass();
                if (i10 == 0) {
                    bVar = zf.b.f48947a;
                } else {
                    bVar = zf.b.f48948b;
                }
                a0Var.U(zf.a.i(0L, bVar), true, false, true);
                a0Var.f46893d0.setText("");
                return;
            case 1:
                e0 e0Var = (e0) this.f47830b;
                e0Var.getClass();
                if (i10 == 0) {
                    bVar2 = zf.b.f48947a;
                } else {
                    bVar2 = zf.b.f48948b;
                }
                e0Var.q(zf.a.i(0L, bVar2), true, false, true);
                e0Var.h.setText("");
                return;
            default:
                e3 e3Var = (e3) this.f47830b;
                e3Var.getClass();
                if (i10 == 0) {
                    bVar3 = zf.b.f48947a;
                } else {
                    bVar3 = zf.b.f48948b;
                }
                e3Var.f47057q = bVar3;
                e3Var.a(true);
                return;
        }
    }
}
