package zf;

import android.location.Location;
import org.telegram.messenger.mz;
import org.telegram.tgnet.TLRPC;
public final class n0 implements mz {
    public final x0 f55594a;

    public n0(x0 x0Var) {
        this.f55594a = x0Var;
    }

    @Override
    public final void E() {
        this.f55594a.Q();
    }

    @Override
    public final void F(Location location) {
        x0 x0Var = this.f55594a;
        TLRPC.User user = x0Var.f55672w0;
        if (user != null && user.bot_inline_geo) {
            x0Var.f55677z0 = location;
            x0Var.T(true, user, x0Var.f55665r0, "");
        }
    }
}
