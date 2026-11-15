package ug;

import android.content.Context;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.Components.Premium.LimitPreviewView;
public final class h0 extends LimitPreviewView {
    public final i0 f58115q0;

    public h0(i0 i0Var, Context context, int i7, int i10, int i11, float f10, e6 e6Var) {
        super(context, i7, i10, i11, f10, e6Var);
        this.f58115q0 = i0Var;
    }

    @Override
    public final void invalidate() {
        if (this.f58115q0.f58122e.f58131b2) {
            return;
        }
        super.invalidate();
    }
}
