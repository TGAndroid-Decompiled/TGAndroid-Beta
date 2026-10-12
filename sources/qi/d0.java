package qi;

import org.telegram.ui.Components.m11;
public final class d0 implements Runnable {
    public final int f46690a;
    public final p0 f46691b;
    public final l0 f46692c;

    public d0(p0 p0Var, l0 l0Var, int i10, int i11) {
        this.f46690a = i11;
        this.f46691b = p0Var;
        this.f46692c = l0Var;
    }

    @Override
    public final void run() {
        switch (this.f46690a) {
            case 0:
                p0 p0Var = this.f46691b;
                l0 l0Var = this.f46692c;
                ((m11) p0Var.f46863e).c(l0Var.f46807a);
                return;
            case 1:
                p0 p0Var2 = this.f46691b;
                l0 l0Var2 = this.f46692c;
                m0 m0Var = p0Var2.f46863e;
                long j3 = l0Var2.f46807a;
                m11 m11Var = (m11) m0Var;
                synchronized (m11Var) {
                    m11Var.c(j3);
                }
                return;
            default:
                p0 p0Var3 = this.f46691b;
                l0 l0Var3 = this.f46692c;
                ((m11) p0Var3.f46863e).c(l0Var3.f46807a);
                return;
        }
    }

    public d0(p0 p0Var, l0 l0Var, Exception exc) {
        this.f46690a = 1;
        this.f46691b = p0Var;
        this.f46692c = l0Var;
    }
}
