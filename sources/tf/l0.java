package tf;

import org.telegram.messenger.SendMessagesHelper;
public final class l0 extends SendMessagesHelper.LocationProvider {
    public final u0 f44849a;

    public l0(u0 u0Var, k0 k0Var) {
        super(k0Var);
        this.f44849a = u0Var;
    }

    @Override
    public final void stop() {
        super.stop();
        this.f44849a.f44926w0 = null;
    }
}
