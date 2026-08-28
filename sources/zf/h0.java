package zf;

import android.content.Context;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.Components.Premium.LimitPreviewView;
public final class h0 extends LimitPreviewView {
    public final i0 f50517i0;

    public h0(i0 i0Var, Context context, int i9, int i10, int i11, float f10, b6 b6Var) {
        super(context, i9, i10, i11, f10, b6Var);
        this.f50517i0 = i0Var;
    }

    @Override
    public final void invalidate() {
        if (this.f50517i0.f50527e.f50533b0) {
            return;
        }
        super.invalidate();
    }
}
