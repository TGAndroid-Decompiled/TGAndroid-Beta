package ug;

import android.content.Context;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.Premium.LimitPreviewView;
public final class i0 extends LimitPreviewView {
    public final j0 f58739q0;

    public i0(j0 j0Var, Context context, int i7, int i10, int i11, float f10, h6 h6Var) {
        super(context, i7, i10, i11, f10, h6Var);
        this.f58739q0 = j0Var;
    }

    @Override
    public final void invalidate() {
        if (this.f58739q0.f58751e.f58765b2) {
            return;
        }
        super.invalidate();
    }
}
