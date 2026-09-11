package sg;

import android.content.Context;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.Premium.LimitPreviewView;
public final class i0 extends LimitPreviewView {
    public final j0 m0;

    public i0(j0 j0Var, Context context, int i10, int i11, int i12, float f7, f6 f6Var) {
        super(context, i10, i11, i12, f7, f6Var);
        this.m0 = j0Var;
    }

    @Override
    public final void invalidate() {
        if (this.m0.f46123e.f46135f0) {
            return;
        }
        super.invalidate();
    }
}
