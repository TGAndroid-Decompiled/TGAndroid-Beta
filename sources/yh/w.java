package yh;

import org.telegram.messenger.MessagesStorage;
public final class w implements MessagesStorage.IntCallback {
    public final int f52180a;
    public final Object f52181b;

    public w(Object obj, int i10) {
        this.f52180a = i10;
        this.f52181b = obj;
    }

    @Override
    public final void run(int i10) {
        zf.b bVar;
        zf.b bVar2;
        zf.b bVar3;
        switch (this.f52180a) {
            case 0:
                b0 b0Var = (b0) this.f52181b;
                b0Var.getClass();
                if (i10 == 0) {
                    bVar = zf.b.f53323a;
                } else {
                    bVar = zf.b.f53324b;
                }
                b0Var.S(zf.a.i(0L, bVar), true, false, true);
                b0Var.f51122d0.setText("");
                return;
            case 1:
                f0 f0Var = (f0) this.f52181b;
                f0Var.getClass();
                if (i10 == 0) {
                    bVar2 = zf.b.f53323a;
                } else {
                    bVar2 = zf.b.f53324b;
                }
                f0Var.q(zf.a.i(0L, bVar2), true, false, true);
                f0Var.h.setText("");
                return;
            default:
                d3 d3Var = (d3) this.f52181b;
                d3Var.getClass();
                if (i10 == 0) {
                    bVar3 = zf.b.f53323a;
                } else {
                    bVar3 = zf.b.f53324b;
                }
                d3Var.f51226q = bVar3;
                d3Var.a(true);
                return;
        }
    }
}
