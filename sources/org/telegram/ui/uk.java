package org.telegram.ui;

import android.app.Activity;
import org.telegram.ui.Components.UndoView;
public final class uk extends org.telegram.ui.Components.a10 {
    public final wm k1;

    public uk(wm wmVar, Activity activity, org.telegram.ui.ActionBar.d2 d2Var) {
        super(activity, d2Var);
        this.k1 = wmVar;
    }

    @Override
    public final void I0() {
        wm wmVar = this.k1;
        wmVar.f8();
        UndoView undoView = wmVar.N3;
        if (undoView == null) {
            return;
        }
        undoView.j(75, 0L, null);
        wmVar.getMessagesController().k4(wmVar.f51376k6, "CONVERT_GIGAGROUP");
    }

    @Override
    public final void J0() {
        wm wmVar = this.k1;
        wmVar.getMessagesController().S(wmVar.getParentActivity(), wmVar.f51292e, wmVar, new x0(this, 21));
    }
}
