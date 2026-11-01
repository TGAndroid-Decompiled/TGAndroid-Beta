package xh;

import th.r4;
public final class d0 implements Runnable {
    public final int f53742a;
    public final Object f53743b;

    public d0(Object obj, int i10) {
        this.f53742a = i10;
        this.f53743b = obj;
    }

    @Override
    public final void run() {
        switch (this.f53742a) {
            case 0:
                ((e0) this.f53743b).d();
                return;
            case 1:
                ((p0) this.f53743b).c();
                return;
            case 2:
                ((p0) this.f53743b).c();
                return;
            case 3:
                ((q0) this.f53743b).a();
                return;
            case 4:
                ((r0) this.f53743b).a();
                return;
            case 5:
                ((l2) this.f53743b).invalidate();
                return;
            case 6:
                ((e2.f) this.f53743b).e();
                return;
            case 7:
                i3 i3Var = (i3) this.f53743b;
                i3Var.Q = i3Var.f53825r;
                return;
            default:
                r4 r4Var = ((zf.b1) this.f53743b).D;
                if (r4Var != null) {
                    r4Var.p(3, true);
                    return;
                }
                return;
        }
    }
}
