package qi;

import org.telegram.ui.Components.m11;
public final class d0 implements Runnable {
    public final int f46682a;
    public final p0 f46683b;
    public final l0 f46684c;

    public d0(p0 p0Var, l0 l0Var, int i10, int i11) {
        this.f46682a = i11;
        this.f46683b = p0Var;
        this.f46684c = l0Var;
    }

    @Override
    public final void run() {
        switch (this.f46682a) {
            case 0:
                p0 p0Var = this.f46683b;
                l0 l0Var = this.f46684c;
                ((m11) p0Var.f46855e).c(l0Var.f46799a);
                return;
            case 1:
                p0 p0Var2 = this.f46683b;
                l0 l0Var2 = this.f46684c;
                m0 m0Var = p0Var2.f46855e;
                long j3 = l0Var2.f46799a;
                m11 m11Var = (m11) m0Var;
                synchronized (m11Var) {
                    m11Var.c(j3);
                }
                return;
            default:
                p0 p0Var3 = this.f46683b;
                l0 l0Var3 = this.f46684c;
                ((m11) p0Var3.f46855e).c(l0Var3.f46799a);
                return;
        }
    }

    public d0(p0 p0Var, l0 l0Var, Exception exc) {
        this.f46682a = 1;
        this.f46683b = p0Var;
        this.f46684c = l0Var;
    }
}
