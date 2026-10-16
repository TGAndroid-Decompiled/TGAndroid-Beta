package zh;

import org.telegram.messenger.MessagesStorage;
public final class v implements MessagesStorage.IntCallback {
    public final int f51227a;
    public final Object f51228b;

    public v(Object obj, int i10) {
        this.f51227a = i10;
        this.f51228b = obj;
    }

    @Override
    public final void run(int i10) {
        ag.b bVar;
        ag.b bVar2;
        ag.b bVar3;
        switch (this.f51227a) {
            case 0:
                z zVar = (z) this.f51228b;
                zVar.getClass();
                if (i10 == 0) {
                    bVar = ag.b.f633a;
                } else {
                    bVar = ag.b.f634b;
                }
                zVar.V(ag.a.i(0L, bVar), true, false, true);
                zVar.f51347d0.setText("");
                return;
            case 1:
                d0 d0Var = (d0) this.f51228b;
                d0Var.getClass();
                if (i10 == 0) {
                    bVar2 = ag.b.f633a;
                } else {
                    bVar2 = ag.b.f634b;
                }
                d0Var.s(ag.a.i(0L, bVar2), true, false, true);
                d0Var.h.setText("");
                return;
            default:
                x2 x2Var = (x2) this.f51228b;
                x2Var.getClass();
                if (i10 == 0) {
                    bVar3 = ag.b.f633a;
                } else {
                    bVar3 = ag.b.f634b;
                }
                x2Var.f51305q = bVar3;
                x2Var.a(true);
                return;
        }
    }
}
