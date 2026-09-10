package xh;

import org.telegram.messenger.MessagesStorage;
public final class v implements MessagesStorage.IntCallback {
    public final int f46158a;
    public final Object f46159b;

    public v(Object obj, int i10) {
        this.f46158a = i10;
        this.f46159b = obj;
    }

    @Override
    public final void run(int i10) {
        yf.b bVar;
        yf.b bVar2;
        yf.b bVar3;
        switch (this.f46158a) {
            case 0:
                a0 a0Var = (a0) this.f46159b;
                a0Var.getClass();
                if (i10 == 0) {
                    bVar = yf.b.f46928a;
                } else {
                    bVar = yf.b.f46929b;
                }
                a0Var.U(yf.a.i(0L, bVar), true, false, true);
                a0Var.f45215d0.setText("");
                return;
            case 1:
                e0 e0Var = (e0) this.f46159b;
                e0Var.getClass();
                if (i10 == 0) {
                    bVar2 = yf.b.f46928a;
                } else {
                    bVar2 = yf.b.f46929b;
                }
                e0Var.q(yf.a.i(0L, bVar2), true, false, true);
                e0Var.h.setText("");
                return;
            default:
                c3 c3Var = (c3) this.f46159b;
                c3Var.getClass();
                if (i10 == 0) {
                    bVar3 = yf.b.f46928a;
                } else {
                    bVar3 = yf.b.f46929b;
                }
                c3Var.f45312q = bVar3;
                c3Var.a(true);
                return;
        }
    }
}
