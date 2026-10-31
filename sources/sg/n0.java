package sg;

import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class n0 extends m0 {
    public final p0 f48420g0;

    public n0(p0 p0Var, m0 m0Var, TLRPC.ReactionCount reactionCount, boolean z10) {
        super(m0Var, p0Var.f48446l, p0Var.f48456w, reactionCount, z10, p0Var.f48458y);
        this.f48420g0 = p0Var;
    }

    @Override
    public final float j() {
        return this.f48420g0.f48438a;
    }

    @Override
    public final ImageReceiver k() {
        return (ImageReceiver) this.f48420g0.E.get(this.f48411r);
    }

    @Override
    public final boolean l() {
        return this.f48420g0.f48457x.P3();
    }

    @Override
    public final boolean m() {
        p0 p0Var = this.f48420g0;
        int f12 = p0Var.f48457x.f1();
        long d12 = p0Var.f48457x.d1();
        k0 k0Var = k0.B;
        if (k0Var != null) {
            int i10 = k0Var.f48365a;
            if (i10 == 2 || i10 == 0) {
                long j10 = k0Var.f48376o;
                if (((j10 != 0 && d12 == j10) || f12 == k0Var.f48375n) && k0Var.f48377p.equals(this.f48411r)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void n() {
        this.f48420g0.E.remove(this.f48411r);
    }
}
