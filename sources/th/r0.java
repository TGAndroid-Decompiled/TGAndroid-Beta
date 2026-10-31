package th;

import org.telegram.messenger.f8;
import org.telegram.messenger.voip.Instance;
public final class r0 implements Instance.OnStateUpdatedListener {
    public final s0 f49404a;

    public r0(s0 s0Var) {
        this.f49404a = s0Var;
    }

    @Override
    public final void onStateUpdated(int i10, boolean z10) {
        s0 s0Var = this.f49404a;
        boolean m10 = s0Var.m();
        s0Var.D = i10;
        f8.b("[LivePlayer] connectionState = " + i10);
        if (m10 != s0Var.m()) {
            org.telegram.messenger.i0.g3(new sg.v(this, 4));
        }
    }
}
