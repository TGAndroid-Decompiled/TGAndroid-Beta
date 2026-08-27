package pf;

import android.location.Location;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLRPC;

public final class k0 implements SendMessagesHelper.LocationProvider.LocationProviderDelegate {

    public final u0 f45862a;

    public k0(u0 u0Var) {
        this.f45862a = u0Var;
    }

    @Override
    public final void onLocationAcquired(Location location) {
        u0 u0Var = this.f45862a;
        TLRPC.User user = u0Var.f45944s0;
        if (user == null || !user.bot_inline_geo) {
            return;
        }
        u0Var.f45947v0 = location;
        u0Var.T(true, user, u0Var.f45937n0, "");
    }

    @Override
    public final void onUnableLocationAcquire() {
        this.f45862a.Q();
    }
}
