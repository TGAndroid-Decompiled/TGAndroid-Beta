package org.telegram.ui;

import android.app.Activity;
import org.telegram.ui.Components.UndoView;
public final class ul extends org.telegram.ui.Components.o20 {
    public final xn f38968b;

    public ul(xn xnVar, Activity activity, org.telegram.ui.ActionBar.p2 p2Var) {
        super(activity, p2Var);
        this.f38968b = xnVar;
    }

    @Override
    public final void m() {
        xn xnVar = this.f38968b;
        xnVar.Q7();
        UndoView undoView = xnVar.f40209v3;
        if (undoView == null) {
            return;
        }
        undoView.j(75, 0L, null);
        xnVar.getMessagesController().removeSuggestion(xnVar.Q5, "CONVERT_GIGAGROUP");
    }

    @Override
    public final void n() {
        xn xnVar = this.f38968b;
        xnVar.getMessagesController().convertToGigaGroup(xnVar.getParentActivity(), xnVar.e, xnVar, new a1(this, 19));
    }
}
