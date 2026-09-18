package yh;

import org.telegram.messenger.MessagesStorage;
public final class v implements MessagesStorage.IntCallback {
    public final int f47904a;
    public final Object f47905b;

    public v(Object obj, int i10) {
        this.f47904a = i10;
        this.f47905b = obj;
    }

    @Override
    public final void run(int i10) {
        zf.b bVar;
        zf.b bVar2;
        zf.b bVar3;
        switch (this.f47904a) {
            case 0:
                a0 a0Var = (a0) this.f47905b;
                a0Var.getClass();
                if (i10 == 0) {
                    bVar = zf.b.f48982a;
                } else {
                    bVar = zf.b.f48983b;
                }
                a0Var.U(zf.a.i(0L, bVar), true, false, true);
                a0Var.f46928d0.setText("");
                return;
            case 1:
                e0 e0Var = (e0) this.f47905b;
                e0Var.getClass();
                if (i10 == 0) {
                    bVar2 = zf.b.f48982a;
                } else {
                    bVar2 = zf.b.f48983b;
                }
                e0Var.q(zf.a.i(0L, bVar2), true, false, true);
                e0Var.h.setText("");
                return;
            default:
                f3 f3Var = (f3) this.f47905b;
                f3Var.getClass();
                if (i10 == 0) {
                    bVar3 = zf.b.f48982a;
                } else {
                    bVar3 = zf.b.f48983b;
                }
                f3Var.f47187q = bVar3;
                f3Var.a(true);
                return;
        }
    }
}
