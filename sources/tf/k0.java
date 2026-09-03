package tf;

import android.location.Location;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLRPC;
public final class k0 implements SendMessagesHelper.LocationProvider.LocationProviderDelegate {
    public final u0 f44843a;

    public k0(u0 u0Var) {
        this.f44843a = u0Var;
    }

    @Override
    public final void onLocationAcquired(Location location) {
        u0 u0Var = this.f44843a;
        TLRPC.User user = u0Var.f44922t0;
        if (user != null && user.bot_inline_geo) {
            u0Var.f44926w0 = location;
            u0Var.T(true, user, u0Var.f44915o0, "");
        }
    }

    @Override
    public final void onUnableLocationAcquire() {
        this.f44843a.Q();
    }
}
