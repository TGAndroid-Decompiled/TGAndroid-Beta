package ug;

import android.content.Context;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.Premium.LimitPreviewView;
public final class i0 extends LimitPreviewView {
    public final j0 f58823q0;

    public i0(j0 j0Var, Context context, int i7, int i10, int i11, float f10, i6 i6Var) {
        super(context, i7, i10, i11, f10, i6Var);
        this.f58823q0 = j0Var;
    }

    @Override
    public final void invalidate() {
        if (this.f58823q0.f58835e.f58849b2) {
            return;
        }
        super.invalidate();
    }
}
