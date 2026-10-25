package tg;

import android.content.Context;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Components.Premium.LimitPreviewView;
public final class h0 extends LimitPreviewView {
    public final i0 f48870p0;

    public h0(i0 i0Var, Context context, int i10, int i11, int i12, float f7, u6 u6Var) {
        super(context, i10, i11, i12, f7, u6Var);
        this.f48870p0 = i0Var;
    }

    @Override
    public final void invalidate() {
        if (this.f48870p0.e.f48886f0) {
            return;
        }
        super.invalidate();
    }
}
