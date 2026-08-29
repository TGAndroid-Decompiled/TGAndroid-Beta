package rf;

import org.telegram.messenger.SendMessagesHelper;
public final class m0 extends SendMessagesHelper.LocationProvider {
    public final v0 f47307a;

    public m0(v0 v0Var, l0 l0Var) {
        super(l0Var);
        this.f47307a = v0Var;
    }

    @Override
    public final void stop() {
        super.stop();
        this.f47307a.f47388v0 = null;
    }
}
