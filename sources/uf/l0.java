package uf;

import org.telegram.messenger.SendMessagesHelper;
public final class l0 extends SendMessagesHelper.LocationProvider {
    public final u0 f48637a;

    public l0(u0 u0Var, k0 k0Var) {
        super(k0Var);
        this.f48637a = u0Var;
    }

    @Override
    public final void stop() {
        super.stop();
        this.f48637a.f48721w0 = null;
    }
}
