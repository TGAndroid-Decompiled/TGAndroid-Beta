package yh;

import org.telegram.messenger.MessagesStorage;
public final class v implements MessagesStorage.IntCallback {
    public final int f52113a;
    public final Object f52114b;

    public v(Object obj, int i10) {
        this.f52113a = i10;
        this.f52114b = obj;
    }

    @Override
    public final void run(int i10) {
        zf.b bVar;
        zf.b bVar2;
        zf.b bVar3;
        switch (this.f52113a) {
            case 0:
                a0 a0Var = (a0) this.f52114b;
                a0Var.getClass();
                if (i10 == 0) {
                    bVar = zf.b.f53302a;
                } else {
                    bVar = zf.b.f53303b;
                }
                a0Var.S(zf.a.i(0L, bVar), true, false, true);
                a0Var.f51066d0.setText("");
                return;
            case 1:
                e0 e0Var = (e0) this.f52114b;
                e0Var.getClass();
                if (i10 == 0) {
                    bVar2 = zf.b.f53302a;
                } else {
                    bVar2 = zf.b.f53303b;
                }
                e0Var.q(zf.a.i(0L, bVar2), true, false, true);
                e0Var.h.setText("");
                return;
            default:
                c3 c3Var = (c3) this.f52114b;
                c3Var.getClass();
                if (i10 == 0) {
                    bVar3 = zf.b.f53302a;
                } else {
                    bVar3 = zf.b.f53303b;
                }
                c3Var.f51170q = bVar3;
                c3Var.a(true);
                return;
        }
    }
}
