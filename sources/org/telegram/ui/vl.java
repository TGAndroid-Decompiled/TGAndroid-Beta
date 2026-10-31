package org.telegram.ui;

import android.app.Activity;
import org.telegram.ui.Components.UndoView;
public final class vl extends org.telegram.ui.Components.t10 {
    public final un f42766j1;

    public vl(un unVar, Activity activity, org.telegram.ui.ActionBar.k2 k2Var) {
        super(activity, k2Var);
        this.f42766j1 = unVar;
    }

    @Override
    public final void I0() {
        un unVar = this.f42766j1;
        unVar.Y7();
        UndoView undoView = unVar.M3;
        if (undoView == null) {
            return;
        }
        undoView.j(75, 0L, null);
        unVar.getMessagesController().h4(unVar.f42297j6, "CONVERT_GIGAGROUP");
    }

    @Override
    public final void J0() {
        un unVar = this.f42766j1;
        unVar.getMessagesController().S(unVar.getParentActivity(), unVar.e, unVar, new y0(this, 21));
    }
}
