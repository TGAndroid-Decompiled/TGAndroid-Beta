package yh;

import org.telegram.messenger.MessagesStorage;
public final class u implements MessagesStorage.IntCallback {
    public final int f53374a;
    public final Object f53375b;

    public u(Object obj, int i10) {
        this.f53374a = i10;
        this.f53375b = obj;
    }

    @Override
    public final void run(int i10) {
        zf.b bVar;
        zf.b bVar2;
        zf.b bVar3;
        switch (this.f53374a) {
            case 0:
                y yVar = (y) this.f53375b;
                yVar.getClass();
                if (i10 == 0) {
                    bVar = zf.b.f54564a;
                } else {
                    bVar = zf.b.f54565b;
                }
                yVar.V(zf.a.i(0L, bVar), true, false, true);
                yVar.f53507d0.setText("");
                return;
            case 1:
                c0 c0Var = (c0) this.f53375b;
                c0Var.getClass();
                if (i10 == 0) {
                    bVar2 = zf.b.f54564a;
                } else {
                    bVar2 = zf.b.f54565b;
                }
                c0Var.s(zf.a.i(0L, bVar2), true, false, true);
                c0Var.h.setText("");
                return;
            default:
                y2 y2Var = (y2) this.f53375b;
                y2Var.getClass();
                if (i10 == 0) {
                    bVar3 = zf.b.f54564a;
                } else {
                    bVar3 = zf.b.f54565b;
                }
                y2Var.f53544q = bVar3;
                y2Var.a(true);
                return;
        }
    }
}
