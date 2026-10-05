package zg;

import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class l0 extends k0 {
    public final n0 f53464h0;

    public l0(n0 n0Var, k0 k0Var, TLRPC.ReactionCount reactionCount, boolean z10, boolean z11) {
        super(k0Var, n0Var.f53488n, n0Var.f53499z, reactionCount, z10, z11, n0Var.B);
        this.f53464h0 = n0Var;
    }

    @Override
    public final float k() {
        return this.f53464h0.f53477a;
    }

    @Override
    public final ImageReceiver l() {
        return (ImageReceiver) this.f53464h0.H.get(this.f53457s);
    }

    @Override
    public final boolean m() {
        return this.f53464h0.A.isOutOwner();
    }

    @Override
    public final boolean n() {
        n0 n0Var = this.f53464h0;
        int id2 = n0Var.A.getId();
        long groupId = n0Var.A.getGroupId();
        i0 i0Var = i0.B;
        if (i0Var != null) {
            int i10 = i0Var.f53407a;
            if (i10 == 2 || i10 == 0) {
                long j3 = i0Var.f53419o;
                if (((j3 != 0 && groupId == j3) || id2 == i0Var.f53418n) && i0Var.f53420p.equals(this.f53457s)) {
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
        this.f53464h0.H.remove(this.f53457s);
    }
}
