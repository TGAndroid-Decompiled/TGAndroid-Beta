package vh;

import org.telegram.messenger.hs;
import org.telegram.messenger.vp;
public final class q8 implements Runnable {
    public final int f51792a;
    public final long f51793b;
    public final Object f51794c;

    public q8(Object obj, long j10, int i10) {
        this.f51792a = i10;
        this.f51794c = obj;
        this.f51793b = j10;
    }

    @Override
    public final void run() {
        switch (this.f51792a) {
            case 0:
                t8 t8Var = ((z8) this.f51794c).f52257a;
                if (t8Var != null) {
                    t8Var.j(this.f51793b, false);
                    return;
                }
                return;
            case 1:
                yh.a0 a0Var = (yh.a0) this.f51794c;
                vp.r1(a0Var.f21583a).O2(this.f51793b, a0Var.l1, true, false, new yh.r(a0Var, 1));
                return;
            case 2:
                yh.e0 e0Var = (yh.e0) this.f51794c;
                e0Var.f54478i = null;
                e0Var.f54477g.l(this.f51793b);
                e0Var.f54481l++;
                e0Var.a();
                yh.d0 d0Var = e0Var.h;
                if (d0Var != null) {
                    d0Var.b();
                    return;
                }
                return;
            default:
                zf.z zVar = (zf.z) this.f51794c;
                long j10 = this.f51793b;
                zVar.getClass();
                try {
                    hs.a0(zVar.f55704s0).f15940b.executeFast("DELETE FROM search_recent WHERE did = " + j10).stepThis().dispose();
                    return;
                } catch (Exception e) {
                    org.telegram.messenger.f8.g(e, true);
                    return;
                }
        }
    }
}
