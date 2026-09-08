package sg;

import android.content.Context;
import org.telegram.ui.ActionBar.f6;
public final class a0 extends r0 {
    public final k0 P;

    public a0(k0 k0Var, Context context, f6 f6Var) {
        super(context, f6Var, true);
        this.P = k0Var;
    }

    @Override
    public final void invalidate() {
        if (this.P.f46163f0) {
            return;
        }
        super.invalidate();
    }
}
