package zg;

import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class n0 extends m0 {
    public final p0 f49500h0;

    public n0(p0 p0Var, m0 m0Var, TLRPC.ReactionCount reactionCount, boolean z10, boolean z11) {
        super(m0Var, p0Var.f49521n, p0Var.f49532z, reactionCount, z10, z11, p0Var.B);
        this.f49500h0 = p0Var;
    }

    @Override
    public final float k() {
        return this.f49500h0.f49511a;
    }

    @Override
    public final ImageReceiver l() {
        return (ImageReceiver) this.f49500h0.H.get(this.f49492s);
    }

    @Override
    public final boolean m() {
        return this.f49500h0.A.isOutOwner();
    }

    @Override
    public final boolean n() {
        p0 p0Var = this.f49500h0;
        int id2 = p0Var.A.getId();
        long groupId = p0Var.A.getGroupId();
        k0 k0Var = k0.B;
        if (k0Var != null) {
            int i10 = k0Var.f49444a;
            if (i10 == 2 || i10 == 0) {
                long j3 = k0Var.f49455o;
                if (((j3 != 0 && groupId == j3) || id2 == k0Var.f49454n) && k0Var.f49456p.equals(this.f49492s)) {
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
        this.f49500h0.H.remove(this.f49492s);
    }
}
