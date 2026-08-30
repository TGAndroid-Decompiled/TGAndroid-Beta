package tf;

import org.telegram.messenger.SendMessagesHelper;
public final class l0 extends SendMessagesHelper.LocationProvider {
    public final u0 f44787a;

    public l0(u0 u0Var, k0 k0Var) {
        super(k0Var);
        this.f44787a = u0Var;
    }

    @Override
    public final void stop() {
        super.stop();
        this.f44787a.f44864w0 = null;
    }
}
