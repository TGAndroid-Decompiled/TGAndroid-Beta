package yh;

import org.telegram.messenger.MessagesStorage;
public final class u implements MessagesStorage.IntCallback {
    public final int f53489a;
    public final Object f53490b;

    public u(Object obj, int i10) {
        this.f53489a = i10;
        this.f53490b = obj;
    }

    @Override
    public final void run(int i10) {
        zf.b bVar;
        zf.b bVar2;
        zf.b bVar3;
        switch (this.f53489a) {
            case 0:
                y yVar = (y) this.f53490b;
                yVar.getClass();
                if (i10 == 0) {
                    bVar = zf.b.f54675a;
                } else {
                    bVar = zf.b.f54676b;
                }
                yVar.V(zf.a.i(0L, bVar), true, false, true);
                yVar.f53619d0.setText("");
                return;
            case 1:
                c0 c0Var = (c0) this.f53490b;
                c0Var.getClass();
                if (i10 == 0) {
                    bVar2 = zf.b.f54675a;
                } else {
                    bVar2 = zf.b.f54676b;
                }
                c0Var.s(zf.a.i(0L, bVar2), true, false, true);
                c0Var.h.setText("");
                return;
            default:
                y2 y2Var = (y2) this.f53490b;
                y2Var.getClass();
                if (i10 == 0) {
                    bVar3 = zf.b.f54675a;
                } else {
                    bVar3 = zf.b.f54676b;
                }
                y2Var.f53656q = bVar3;
                y2Var.a(true);
                return;
        }
    }
}
