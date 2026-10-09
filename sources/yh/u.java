package yh;

import org.telegram.messenger.MessagesStorage;
public final class u implements MessagesStorage.IntCallback {
    public final int f53253a;
    public final Object f53254b;

    public u(Object obj, int i10) {
        this.f53253a = i10;
        this.f53254b = obj;
    }

    @Override
    public final void run(int i10) {
        zf.b bVar;
        zf.b bVar2;
        zf.b bVar3;
        switch (this.f53253a) {
            case 0:
                y yVar = (y) this.f53254b;
                yVar.getClass();
                if (i10 == 0) {
                    bVar = zf.b.f54443a;
                } else {
                    bVar = zf.b.f54444b;
                }
                yVar.V(zf.a.i(0L, bVar), true, false, true);
                yVar.f53386d0.setText("");
                return;
            case 1:
                c0 c0Var = (c0) this.f53254b;
                c0Var.getClass();
                if (i10 == 0) {
                    bVar2 = zf.b.f54443a;
                } else {
                    bVar2 = zf.b.f54444b;
                }
                c0Var.s(zf.a.i(0L, bVar2), true, false, true);
                c0Var.h.setText("");
                return;
            default:
                y2 y2Var = (y2) this.f53254b;
                y2Var.getClass();
                if (i10 == 0) {
                    bVar3 = zf.b.f54443a;
                } else {
                    bVar3 = zf.b.f54444b;
                }
                y2Var.f53423q = bVar3;
                y2Var.a(true);
                return;
        }
    }
}
