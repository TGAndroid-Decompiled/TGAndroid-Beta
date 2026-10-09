package org.telegram.ui;

import android.app.Activity;
import org.telegram.ui.Components.UndoView;
public final class xl extends org.telegram.ui.Components.e30 {
    public final zn f44060b;

    public xl(zn znVar, Activity activity, org.telegram.ui.ActionBar.n2 n2Var) {
        super(activity, n2Var);
        this.f44060b = znVar;
    }

    @Override
    public final void o() {
        zn znVar = this.f44060b;
        znVar.T7();
        UndoView undoView = znVar.y3;
        if (undoView == null) {
            return;
        }
        undoView.j(75, 0L, null);
        znVar.getMessagesController().removeSuggestion(znVar.T5, "CONVERT_GIGAGROUP");
    }

    @Override
    public final void p() {
        zn znVar = this.f44060b;
        znVar.getMessagesController().convertToGigaGroup(znVar.getParentActivity(), znVar.f44753e, znVar, new z0(this, 19));
    }
}
