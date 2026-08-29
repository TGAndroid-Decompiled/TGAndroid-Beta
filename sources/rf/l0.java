package rf;

import android.location.Location;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLRPC;
public final class l0 implements SendMessagesHelper.LocationProvider.LocationProviderDelegate {
    public final v0 f47303a;

    public l0(v0 v0Var) {
        this.f47303a = v0Var;
    }

    @Override
    public final void onLocationAcquired(Location location) {
        v0 v0Var = this.f47303a;
        TLRPC.User user = v0Var.f47385s0;
        if (user != null && user.bot_inline_geo) {
            v0Var.f47388v0 = location;
            v0Var.T(true, user, v0Var.f47378n0, "");
        }
    }

    @Override
    public final void onUnableLocationAcquire() {
        this.f47303a.Q();
    }
}
