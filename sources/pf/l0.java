package pf;

import org.telegram.messenger.SendMessagesHelper;

public final class l0 extends SendMessagesHelper.LocationProvider {

    public final u0 f45866a;

    public l0(u0 u0Var, k0 k0Var) {
        super(k0Var);
        this.f45866a = u0Var;
    }

    @Override
    public final void stop() {
        super.stop();
        this.f45866a.f45947v0 = null;
    }
}
