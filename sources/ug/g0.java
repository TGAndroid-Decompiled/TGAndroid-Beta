package ug;

import android.content.Context;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.Premium.LimitPreviewView;
public final class g0 extends LimitPreviewView {
    public final h0 f56603p0;

    public g0(h0 h0Var, Context context, int i7, int i10, int i11, float f10, h6 h6Var) {
        super(context, i7, i10, i11, f10, h6Var);
        this.f56603p0 = h0Var;
    }

    @Override
    public final void invalidate() {
        if (this.f56603p0.f56611e.f56615a2) {
            return;
        }
        super.invalidate();
    }
}
