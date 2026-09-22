package zg;

import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class o0 extends n0 {
    public final q0 f49441h0;

    public o0(q0 q0Var, n0 n0Var, TLRPC.ReactionCount reactionCount, boolean z10, boolean z11) {
        super(n0Var, q0Var.f49472n, q0Var.f49483z, reactionCount, z10, z11, q0Var.B);
        this.f49441h0 = q0Var;
    }

    @Override
    public final float k() {
        return this.f49441h0.f49462a;
    }

    @Override
    public final ImageReceiver l() {
        return (ImageReceiver) this.f49441h0.H.get(this.f49434s);
    }

    @Override
    public final boolean m() {
        return this.f49441h0.A.isOutOwner();
    }

    @Override
    public final boolean n() {
        q0 q0Var = this.f49441h0;
        int id2 = q0Var.A.getId();
        long groupId = q0Var.A.getGroupId();
        l0 l0Var = l0.B;
        if (l0Var != null) {
            int i10 = l0Var.f49387a;
            if (i10 == 2 || i10 == 0) {
                long j3 = l0Var.f49398o;
                if (((j3 != 0 && groupId == j3) || id2 == l0Var.f49397n) && l0Var.f49399p.equals(this.f49434s)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void o() {
        this.f49441h0.H.remove(this.f49434s);
    }
}
