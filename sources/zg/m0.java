package zg;

import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class m0 extends l0 {
    public final o0 f54655h0;

    public m0(o0 o0Var, l0 l0Var, TLRPC.ReactionCount reactionCount, boolean z10, boolean z11) {
        super(l0Var, o0Var.f54677n, o0Var.f54688z, reactionCount, z10, z11, o0Var.B);
        this.f54655h0 = o0Var;
    }

    @Override
    public final float k() {
        return this.f54655h0.f54666a;
    }

    @Override
    public final ImageReceiver l() {
        return (ImageReceiver) this.f54655h0.H.get(this.f54647s);
    }

    @Override
    public final boolean m() {
        return this.f54655h0.A.isOutOwner();
    }

    @Override
    public final boolean n() {
        o0 o0Var = this.f54655h0;
        int id2 = o0Var.A.getId();
        long groupId = o0Var.A.getGroupId();
        j0 j0Var = j0.B;
        if (j0Var != null) {
            int i10 = j0Var.f54596a;
            if (i10 == 2 || i10 == 0) {
                long j3 = j0Var.f54608o;
                if (((j3 != 0 && groupId == j3) || id2 == j0Var.f54607n) && j0Var.f54609p.equals(this.f54647s)) {
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
        this.f54655h0.H.remove(this.f54647s);
    }
}
