package tf;

import android.location.Location;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLRPC;
public final class k0 implements SendMessagesHelper.LocationProvider.LocationProviderDelegate {
    public final u0 f44768a;

    public k0(u0 u0Var) {
        this.f44768a = u0Var;
    }

    @Override
    public final void onLocationAcquired(Location location) {
        u0 u0Var = this.f44768a;
        TLRPC.User user = u0Var.f44860t0;
        if (user != null && user.bot_inline_geo) {
            u0Var.f44864w0 = location;
            u0Var.T(true, user, u0Var.f44853o0, "");
        }
    }

    @Override
    public final void onUnableLocationAcquire() {
        this.f44768a.Q();
    }
}
