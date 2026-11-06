package ug;

import android.content.Context;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.Premium.LimitPreviewView;
public final class g0 extends LimitPreviewView {
    public final h0 f56500p0;

    public g0(h0 h0Var, Context context, int i7, int i10, int i11, float f10, f6 f6Var) {
        super(context, i7, i10, i11, f10, f6Var);
        this.f56500p0 = h0Var;
    }

    @Override
    public final void invalidate() {
        if (this.f56500p0.f56508e.X1) {
            return;
        }
        super.invalidate();
    }
}
