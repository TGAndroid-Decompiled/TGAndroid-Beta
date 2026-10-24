package sg;

import android.content.Context;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.Premium.LimitPreviewView;
public final class h0 extends LimitPreviewView {
    public final i0 f46694p0;

    public h0(i0 i0Var, Context context, int i10, int i11, int i12, float f7, g6 g6Var) {
        super(context, i10, i11, i12, f7, g6Var);
        this.f46694p0 = i0Var;
    }

    @Override
    public final void invalidate() {
        if (this.f46694p0.e.f46710f0) {
            return;
        }
        super.invalidate();
    }
}
