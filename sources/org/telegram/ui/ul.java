package org.telegram.ui;

import android.app.Activity;
import org.telegram.ui.Components.UndoView;
public final class ul extends org.telegram.ui.Components.p20 {
    public final xn f41869b;

    public ul(xn xnVar, Activity activity, org.telegram.ui.ActionBar.p2 p2Var) {
        super(activity, p2Var);
        this.f41869b = xnVar;
    }

    @Override
    public final void m() {
        xn xnVar = this.f41869b;
        xnVar.Q7();
        UndoView undoView = xnVar.f43356v3;
        if (undoView == null) {
            return;
        }
        undoView.j(75, 0L, null);
        xnVar.getMessagesController().removeSuggestion(xnVar.Q5, "CONVERT_GIGAGROUP");
    }

    @Override
    public final void n() {
        xn xnVar = this.f41869b;
        xnVar.getMessagesController().convertToGigaGroup(xnVar.getParentActivity(), xnVar.f43143e, xnVar, new a1(this, 19));
    }
}
