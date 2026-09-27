package org.telegram.ui;

import android.app.Activity;
import org.telegram.ui.Components.UndoView;
public final class ul extends org.telegram.ui.Components.q20 {
    public final xn f38275b;

    public ul(xn xnVar, Activity activity, org.telegram.ui.ActionBar.o2 o2Var) {
        super(activity, o2Var);
        this.f38275b = xnVar;
    }

    @Override
    public final void m() {
        xn xnVar = this.f38275b;
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
        xn xnVar = this.f38275b;
        xnVar.getMessagesController().convertToGigaGroup(xnVar.getParentActivity(), xnVar.e, xnVar, new a1(this, 21));
    }
}
