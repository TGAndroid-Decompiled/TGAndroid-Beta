package org.telegram.ui;

import android.app.Activity;
public final class ri extends org.telegram.ui.Cells.w0 {
    public final wn f37329l2;

    public ri(Activity activity, org.telegram.ui.ActionBar.d6 d6Var, wn wnVar) {
        super(activity, d6Var, false);
        this.f37329l2 = wnVar;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        float y3 = getY();
        wn wnVar = this.f37329l2;
        W(wnVar.R0.getY() + y3, wnVar.X0.getBackgroundSizeY());
    }
}
