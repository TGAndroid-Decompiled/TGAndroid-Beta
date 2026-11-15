package zi;

import org.telegram.ui.Components.jy0;
public final class i0 implements Runnable {
    public final int f61533a;
    public final v0 f61534b;
    public final r0 f61535c;

    public i0(v0 v0Var, r0 r0Var, int i7, int i10) {
        this.f61533a = i10;
        this.f61534b = v0Var;
        this.f61535c = r0Var;
    }

    @Override
    public final void run() {
        switch (this.f61533a) {
            case 0:
                v0 v0Var = this.f61534b;
                r0 r0Var = this.f61535c;
                ((jy0) v0Var.f61749e).c(r0Var.f61679a);
                return;
            case 1:
                v0 v0Var2 = this.f61534b;
                r0 r0Var2 = this.f61535c;
                s0 s0Var = v0Var2.f61749e;
                long j3 = r0Var2.f61679a;
                jy0 jy0Var = (jy0) s0Var;
                synchronized (jy0Var) {
                    jy0Var.c(j3);
                }
                return;
            default:
                v0 v0Var3 = this.f61534b;
                r0 r0Var3 = this.f61535c;
                ((jy0) v0Var3.f61749e).c(r0Var3.f61679a);
                return;
        }
    }

    public i0(v0 v0Var, r0 r0Var, Exception exc) {
        this.f61533a = 1;
        this.f61534b = v0Var;
        this.f61535c = r0Var;
    }
}
