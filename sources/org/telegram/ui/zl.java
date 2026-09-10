package org.telegram.ui;

import android.app.Activity;
import org.telegram.ui.Components.UndoView;
public final class zl extends org.telegram.ui.Components.w20 {
    public final eo f39409b;

    public zl(eo eoVar, Activity activity, org.telegram.ui.ActionBar.p2 p2Var) {
        super(activity, p2Var);
        this.f39409b = eoVar;
    }

    @Override
    public final void m() {
        eo eoVar = this.f39409b;
        eoVar.Q7();
        UndoView undoView = eoVar.y3;
        if (undoView == null) {
            return;
        }
        undoView.j(75, 0L, null);
        eoVar.getMessagesController().removeSuggestion(eoVar.T5, "CONVERT_GIGAGROUP");
    }

    @Override
    public final void n() {
        eo eoVar = this.f39409b;
        eoVar.getMessagesController().convertToGigaGroup(eoVar.getParentActivity(), eoVar.e, eoVar, new a1(this, 19));
    }
}
