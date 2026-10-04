package yh;

import org.telegram.messenger.MessagesStorage;
public final class v implements MessagesStorage.IntCallback {
    public final int f52107a;
    public final Object f52108b;

    public v(Object obj, int i10) {
        this.f52107a = i10;
        this.f52108b = obj;
    }

    @Override
    public final void run(int i10) {
        zf.b bVar;
        zf.b bVar2;
        zf.b bVar3;
        switch (this.f52107a) {
            case 0:
                a0 a0Var = (a0) this.f52108b;
                a0Var.getClass();
                if (i10 == 0) {
                    bVar = zf.b.f53296a;
                } else {
                    bVar = zf.b.f53297b;
                }
                a0Var.S(zf.a.i(0L, bVar), true, false, true);
                a0Var.f51059d0.setText("");
                return;
            case 1:
                e0 e0Var = (e0) this.f52108b;
                e0Var.getClass();
                if (i10 == 0) {
                    bVar2 = zf.b.f53296a;
                } else {
                    bVar2 = zf.b.f53297b;
                }
                e0Var.q(zf.a.i(0L, bVar2), true, false, true);
                e0Var.h.setText("");
                return;
            default:
                c3 c3Var = (c3) this.f52108b;
                c3Var.getClass();
                if (i10 == 0) {
                    bVar3 = zf.b.f53296a;
                } else {
                    bVar3 = zf.b.f53297b;
                }
                c3Var.f51163q = bVar3;
                c3Var.a(true);
                return;
        }
    }
}
