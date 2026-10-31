package rh;

import org.telegram.messenger.jj;
import org.telegram.messenger.zs;
import org.telegram.ui.Components.wb;
public final class a6 implements Runnable {
    public final int f46636a;
    public final c6 f46637b;

    public a6(c6 c6Var, int i10) {
        this.f46636a = i10;
        this.f46637b = c6Var;
    }

    @Override
    public final void run() {
        int i10 = this.f46636a;
        c6 c6Var = this.f46637b;
        switch (i10) {
            case 0:
                c6Var.b();
                return;
            case 1:
                c6Var.a();
                return;
            default:
                wb wbVar = c6Var.d;
                e6 e6Var = c6Var.f46729q;
                a6 a6Var = c6Var.f46728p;
                jj jjVar = c6Var.f46717b;
                if (!c6Var.f46724l) {
                    c6Var.f46724l = true;
                    jjVar.f((int) c6Var.f46723k, c6Var.c(), true);
                    long j10 = e6Var.f46853g;
                    int i11 = e6Var.f46849a;
                    e6Var.f46853g = j10 + c6Var.f46723k;
                    zs.f(i11).k(221, new Object[0]);
                    c6Var.f46723k = 0L;
                    zs.f(i11).k(103, Long.valueOf(jj.B0(jjVar.f16337k)), Integer.valueOf(jjVar.f1()), jjVar.f16337k.reactions);
                }
                if (!c6Var.f46725m) {
                    c6Var.f46725m = true;
                    c6Var.f46719f.f29331b = 5000L;
                    org.telegram.messenger.i0.r(a6Var);
                    org.telegram.messenger.i0.h3(a6Var, 5000L);
                    wbVar.k(true);
                    wbVar.v = a6Var;
                }
                c6Var.e.f29623b.setText(c6Var.d());
                return;
        }
    }
}
