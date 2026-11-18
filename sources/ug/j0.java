package ug;

import android.content.Context;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.Premium.LimitPreviewView;
public final class j0 extends LimitPreviewView {
    public final k0 f58709q0;

    public j0(k0 k0Var, Context context, int i7, int i10, int i11, float f10, i6 i6Var) {
        super(context, i7, i10, i11, f10, i6Var);
        this.f58709q0 = k0Var;
    }

    @Override
    public final void invalidate() {
        if (this.f58709q0.f58726e.f58730b2) {
            return;
        }
        super.invalidate();
    }
}
