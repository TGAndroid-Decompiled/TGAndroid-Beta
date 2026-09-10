package zh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.voip.Instance;
public final class s0 implements Instance.OnStateUpdatedListener {
    public final t0 f48857a;

    public s0(t0 t0Var) {
        this.f48857a = t0Var;
    }

    @Override
    public final void onStateUpdated(int i10, boolean z10) {
        t0 t0Var = this.f48857a;
        boolean m10 = t0Var.m();
        t0Var.f48887y = i10;
        FileLog.d("[LivePlayer] connectionState = " + i10);
        if (m10 != t0Var.m()) {
            AndroidUtilities.runOnUIThread(new xh.x(this, 20));
        }
    }
}
