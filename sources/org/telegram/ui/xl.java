package org.telegram.ui;

import android.app.Activity;
import org.telegram.ui.Components.UndoView;
public final class xl extends org.telegram.ui.Components.f30 {
    public final zn f44136b;

    public xl(zn znVar, Activity activity, org.telegram.ui.ActionBar.m2 m2Var) {
        super(activity, m2Var);
        this.f44136b = znVar;
    }

    @Override
    public final void o() {
        zn znVar = this.f44136b;
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
        zn znVar = this.f44136b;
        znVar.getMessagesController().convertToGigaGroup(znVar.getParentActivity(), znVar.f44786e, znVar, new y0(this, 19));
    }
}
