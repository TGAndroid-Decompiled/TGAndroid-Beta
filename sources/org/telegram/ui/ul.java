package org.telegram.ui;

import android.app.Activity;
import org.telegram.ui.Components.UndoView;
public final class ul extends org.telegram.ui.Components.o20 {
    public final xn f38128b;

    public ul(xn xnVar, Activity activity, org.telegram.ui.ActionBar.n2 n2Var) {
        super(activity, n2Var);
        this.f38128b = xnVar;
    }

    @Override
    public final void m() {
        xn xnVar = this.f38128b;
        xnVar.Q7();
        UndoView undoView = xnVar.y3;
        if (undoView == null) {
            return;
        }
        undoView.j(75, 0L, null);
        xnVar.getMessagesController().removeSuggestion(xnVar.T5, "CONVERT_GIGAGROUP");
    }

    @Override
    public final void n() {
        xn xnVar = this.f38128b;
        xnVar.getMessagesController().convertToGigaGroup(xnVar.getParentActivity(), xnVar.e, xnVar, new z0(this, 19));
    }
}
