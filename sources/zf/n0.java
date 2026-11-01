package zf;

import android.location.Location;
import org.telegram.messenger.nz;
import org.telegram.tgnet.TLRPC;
public final class n0 implements nz {
    public final x0 f55612a;

    public n0(x0 x0Var) {
        this.f55612a = x0Var;
    }

    @Override
    public final void E() {
        this.f55612a.Q();
    }

    @Override
    public final void F(Location location) {
        x0 x0Var = this.f55612a;
        TLRPC.User user = x0Var.f55690w0;
        if (user != null && user.bot_inline_geo) {
            x0Var.f55695z0 = location;
            x0Var.T(true, user, x0Var.f55683r0, "");
        }
    }
}
