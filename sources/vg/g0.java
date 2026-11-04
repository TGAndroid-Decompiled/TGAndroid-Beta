package vg;

import android.content.Context;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.Components.Premium.LimitPreviewView;
public final class g0 extends LimitPreviewView {
    public final h0 f56615q0;

    public g0(h0 h0Var, Context context, int i3, int i10, int i11, float f10, e6 e6Var) {
        super(context, i3, i10, i11, f10, e6Var);
        this.f56615q0 = h0Var;
    }

    @Override
    public final void invalidate() {
        if (this.f56615q0.f56623e.Y1) {
            return;
        }
        super.invalidate();
    }
}
