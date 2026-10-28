package org.telegram.ui;

import android.app.Activity;
import org.telegram.ui.Components.UndoView;
public final class sl extends org.telegram.ui.Components.y20 {
    public final wn f43352b;

    public sl(wn wnVar, Activity activity, org.telegram.ui.ActionBar.r2 r2Var) {
        super(activity, r2Var);
        this.f43352b = wnVar;
    }

    @Override
    public final void m() {
        wn wnVar = this.f43352b;
        wnVar.Z7();
        UndoView undoView = wnVar.K3;
        if (undoView == null) {
            return;
        }
        undoView.j(75, 0L, null);
        wnVar.getMessagesController().removeSuggestion(wnVar.f45168j6, "CONVERT_GIGAGROUP");
    }

    @Override
    public final void n() {
        wn wnVar = this.f43352b;
        wnVar.getMessagesController().convertToGigaGroup(wnVar.getParentActivity(), wnVar.e, wnVar, new y0(this, 21));
    }
}
