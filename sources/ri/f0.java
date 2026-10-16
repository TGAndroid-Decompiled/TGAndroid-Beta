package ri;

import org.telegram.ui.Components.d11;
public final class f0 implements Runnable {
    public final int f44520a;
    public final r0 f44521b;
    public final n0 f44522c;

    public f0(r0 r0Var, n0 n0Var, int i10, int i11) {
        this.f44520a = i11;
        this.f44521b = r0Var;
        this.f44522c = n0Var;
    }

    @Override
    public final void run() {
        switch (this.f44520a) {
            case 0:
                r0 r0Var = this.f44521b;
                n0 n0Var = this.f44522c;
                ((d11) r0Var.e).c(n0Var.f44657a);
                return;
            case 1:
                r0 r0Var2 = this.f44521b;
                n0 n0Var2 = this.f44522c;
                o0 o0Var = r0Var2.e;
                long j10 = n0Var2.f44657a;
                d11 d11Var = (d11) o0Var;
                synchronized (d11Var) {
                    d11Var.c(j10);
                }
                return;
            default:
                r0 r0Var3 = this.f44521b;
                n0 n0Var3 = this.f44522c;
                ((d11) r0Var3.e).c(n0Var3.f44657a);
                return;
        }
    }

    public f0(r0 r0Var, n0 n0Var, Exception exc) {
        this.f44520a = 1;
        this.f44521b = r0Var;
        this.f44522c = n0Var;
    }
}
