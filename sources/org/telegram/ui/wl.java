package org.telegram.ui;

import android.app.Activity;
import org.telegram.ui.Components.UndoView;
public final class wl extends org.telegram.ui.Components.p20 {
    public final zn f39727b;

    public wl(zn znVar, Activity activity, org.telegram.ui.ActionBar.p2 p2Var) {
        super(activity, p2Var);
        this.f39727b = znVar;
    }

    @Override
    public final void m() {
        zn znVar = this.f39727b;
        znVar.Q7();
        UndoView undoView = znVar.f40775v3;
        if (undoView == null) {
            return;
        }
        undoView.j(75, 0L, null);
        znVar.getMessagesController().removeSuggestion(znVar.Q5, "CONVERT_GIGAGROUP");
    }

    @Override
    public final void n() {
        zn znVar = this.f39727b;
        znVar.getMessagesController().convertToGigaGroup(znVar.getParentActivity(), znVar.e, znVar, new c1(this, 19));
    }
}
