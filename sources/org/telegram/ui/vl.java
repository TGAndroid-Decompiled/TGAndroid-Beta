package org.telegram.ui;

import android.app.Activity;
import org.telegram.ui.Components.UndoView;
public final class vl extends org.telegram.ui.Components.n20 {
    public final zn f38594b;

    public vl(zn znVar, Activity activity, org.telegram.ui.ActionBar.n2 n2Var) {
        super(activity, n2Var);
        this.f38594b = znVar;
    }

    @Override
    public final void m() {
        zn znVar = this.f38594b;
        znVar.Q7();
        UndoView undoView = znVar.y3;
        if (undoView == null) {
            return;
        }
        undoView.j(75, 0L, null);
        znVar.getMessagesController().removeSuggestion(znVar.T5, "CONVERT_GIGAGROUP");
    }

    @Override
    public final void n() {
        zn znVar = this.f38594b;
        znVar.getMessagesController().convertToGigaGroup(znVar.getParentActivity(), znVar.e, znVar, new y0(this, 20));
    }
}
