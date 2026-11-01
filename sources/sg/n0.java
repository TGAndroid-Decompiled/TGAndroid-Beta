package sg;

import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class n0 extends m0 {
    public final p0 f48431g0;

    public n0(p0 p0Var, m0 m0Var, TLRPC.ReactionCount reactionCount, boolean z10) {
        super(m0Var, p0Var.f48457l, p0Var.f48467w, reactionCount, z10, p0Var.f48469y);
        this.f48431g0 = p0Var;
    }

    @Override
    public final float j() {
        return this.f48431g0.f48449a;
    }

    @Override
    public final ImageReceiver k() {
        return (ImageReceiver) this.f48431g0.E.get(this.f48422r);
    }

    @Override
    public final boolean l() {
        return this.f48431g0.f48468x.P3();
    }

    @Override
    public final boolean m() {
        p0 p0Var = this.f48431g0;
        int f12 = p0Var.f48468x.f1();
        long d12 = p0Var.f48468x.d1();
        k0 k0Var = k0.B;
        if (k0Var != null) {
            int i10 = k0Var.f48376a;
            if (i10 == 2 || i10 == 0) {
                long j10 = k0Var.f48387o;
                if (((j10 != 0 && d12 == j10) || f12 == k0Var.f48386n) && k0Var.f48388p.equals(this.f48422r)) {
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
        this.f48431g0.E.remove(this.f48422r);
    }
}
