package vh;

import org.telegram.messenger.is;
import org.telegram.messenger.wp;
public final class q8 implements Runnable {
    public final int f51807a;
    public final long f51808b;
    public final Object f51809c;

    public q8(Object obj, long j10, int i10) {
        this.f51807a = i10;
        this.f51809c = obj;
        this.f51808b = j10;
    }

    @Override
    public final void run() {
        switch (this.f51807a) {
            case 0:
                t8 t8Var = ((z8) this.f51809c).f52275a;
                if (t8Var != null) {
                    t8Var.j(this.f51808b, false);
                    return;
                }
                return;
            case 1:
                yh.z zVar = (yh.z) this.f51809c;
                wp.r1(zVar.f21584a).O2(this.f51808b, zVar.l1, true, false, new yh.q(zVar, 1));
                return;
            case 2:
                yh.d0 d0Var = (yh.d0) this.f51809c;
                d0Var.f54476i = null;
                d0Var.f54475g.l(this.f51808b);
                d0Var.f54479l++;
                d0Var.a();
                yh.c0 c0Var = d0Var.h;
                if (c0Var != null) {
                    c0Var.b();
                    return;
                }
                return;
            default:
                zf.z zVar2 = (zf.z) this.f51809c;
                long j10 = this.f51808b;
                zVar2.getClass();
                try {
                    is.a0(zVar2.f55722s0).f16333b.executeFast("DELETE FROM search_recent WHERE did = " + j10).stepThis().dispose();
                    return;
                } catch (Exception e) {
                    org.telegram.messenger.f8.g(e, true);
                    return;
                }
        }
    }
}
