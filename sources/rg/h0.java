package rg;

import android.content.Context;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.Premium.LimitPreviewView;
public final class h0 extends LimitPreviewView {
    public final i0 m0;

    public h0(i0 i0Var, Context context, int i10, int i11, int i12, float f7, f6 f6Var) {
        super(context, i10, i11, i12, f7, f6Var);
        this.m0 = i0Var;
    }

    @Override
    public final void invalidate() {
        if (this.m0.e.f42342f0) {
            return;
        }
        super.invalidate();
    }
}
