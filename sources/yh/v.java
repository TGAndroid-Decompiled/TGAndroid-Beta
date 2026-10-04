package yh;

import org.telegram.messenger.MessagesStorage;
public final class v implements MessagesStorage.IntCallback {
    public final int f52108a;
    public final Object f52109b;

    public v(Object obj, int i10) {
        this.f52108a = i10;
        this.f52109b = obj;
    }

    @Override
    public final void run(int i10) {
        zf.b bVar;
        zf.b bVar2;
        zf.b bVar3;
        switch (this.f52108a) {
            case 0:
                a0 a0Var = (a0) this.f52109b;
                a0Var.getClass();
                if (i10 == 0) {
                    bVar = zf.b.f53297a;
                } else {
                    bVar = zf.b.f53298b;
                }
                a0Var.S(zf.a.i(0L, bVar), true, false, true);
                a0Var.f51060d0.setText("");
                return;
            case 1:
                e0 e0Var = (e0) this.f52109b;
                e0Var.getClass();
                if (i10 == 0) {
                    bVar2 = zf.b.f53297a;
                } else {
                    bVar2 = zf.b.f53298b;
                }
                e0Var.q(zf.a.i(0L, bVar2), true, false, true);
                e0Var.h.setText("");
                return;
            default:
                c3 c3Var = (c3) this.f52109b;
                c3Var.getClass();
                if (i10 == 0) {
                    bVar3 = zf.b.f53297a;
                } else {
                    bVar3 = zf.b.f53298b;
                }
                c3Var.f51164q = bVar3;
                c3Var.a(true);
                return;
        }
    }
}
