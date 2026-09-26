package yh;

import org.telegram.messenger.MessagesStorage;
public final class v implements MessagesStorage.IntCallback {
    public final int f48132a;
    public final Object f48133b;

    public v(Object obj, int i10) {
        this.f48132a = i10;
        this.f48133b = obj;
    }

    @Override
    public final void run(int i10) {
        zf.b bVar;
        zf.b bVar2;
        zf.b bVar3;
        switch (this.f48132a) {
            case 0:
                a0 a0Var = (a0) this.f48133b;
                a0Var.getClass();
                if (i10 == 0) {
                    bVar = zf.b.f49226a;
                } else {
                    bVar = zf.b.f49227b;
                }
                a0Var.U(zf.a.i(0L, bVar), true, false, true);
                a0Var.f47175d0.setText("");
                return;
            case 1:
                e0 e0Var = (e0) this.f48133b;
                e0Var.getClass();
                if (i10 == 0) {
                    bVar2 = zf.b.f49226a;
                } else {
                    bVar2 = zf.b.f49227b;
                }
                e0Var.q(zf.a.i(0L, bVar2), true, false, true);
                e0Var.h.setText("");
                return;
            default:
                c3 c3Var = (c3) this.f48133b;
                c3Var.getClass();
                if (i10 == 0) {
                    bVar3 = zf.b.f49226a;
                } else {
                    bVar3 = zf.b.f49227b;
                }
                c3Var.f47266q = bVar3;
                c3Var.a(true);
                return;
        }
    }
}
