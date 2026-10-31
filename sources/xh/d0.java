package xh;

import th.r4;
public final class d0 implements Runnable {
    public final int f53724a;
    public final Object f53725b;

    public d0(Object obj, int i10) {
        this.f53724a = i10;
        this.f53725b = obj;
    }

    @Override
    public final void run() {
        switch (this.f53724a) {
            case 0:
                ((e0) this.f53725b).d();
                return;
            case 1:
                ((p0) this.f53725b).c();
                return;
            case 2:
                ((p0) this.f53725b).c();
                return;
            case 3:
                ((q0) this.f53725b).a();
                return;
            case 4:
                ((r0) this.f53725b).a();
                return;
            case 5:
                ((l2) this.f53725b).invalidate();
                return;
            case 6:
                ((e2.f) this.f53725b).e();
                return;
            case 7:
                h3 h3Var = (h3) this.f53725b;
                h3Var.Q = h3Var.f53791r;
                return;
            default:
                r4 r4Var = ((zf.b1) this.f53725b).D;
                if (r4Var != null) {
                    r4Var.p(3, true);
                    return;
                }
                return;
        }
    }
}
