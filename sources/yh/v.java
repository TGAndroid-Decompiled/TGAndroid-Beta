package yh;

import org.telegram.messenger.MessagesStorage;
public final class v implements MessagesStorage.IntCallback {
    public final int f48140a;
    public final Object f48141b;

    public v(Object obj, int i10) {
        this.f48140a = i10;
        this.f48141b = obj;
    }

    @Override
    public final void run(int i10) {
        zf.b bVar;
        zf.b bVar2;
        zf.b bVar3;
        switch (this.f48140a) {
            case 0:
                a0 a0Var = (a0) this.f48141b;
                a0Var.getClass();
                if (i10 == 0) {
                    bVar = zf.b.f49254a;
                } else {
                    bVar = zf.b.f49255b;
                }
                a0Var.U(zf.a.i(0L, bVar), true, false, true);
                a0Var.f47202d0.setText("");
                return;
            case 1:
                e0 e0Var = (e0) this.f48141b;
                e0Var.getClass();
                if (i10 == 0) {
                    bVar2 = zf.b.f49254a;
                } else {
                    bVar2 = zf.b.f49255b;
                }
                e0Var.q(zf.a.i(0L, bVar2), true, false, true);
                e0Var.h.setText("");
                return;
            default:
                d3 d3Var = (d3) this.f48141b;
                d3Var.getClass();
                if (i10 == 0) {
                    bVar3 = zf.b.f49254a;
                } else {
                    bVar3 = zf.b.f49255b;
                }
                d3Var.f47337q = bVar3;
                d3Var.a(true);
                return;
        }
    }
}
