package org.telegram.ui;

import android.app.Activity;
import org.telegram.ui.Components.UndoView;
public final class xl extends org.telegram.ui.Components.n20 {
    public final co f42752b;

    public xl(co coVar, Activity activity, org.telegram.ui.ActionBar.n2 n2Var) {
        super(activity, n2Var);
        this.f42752b = coVar;
    }

    @Override
    public final void m() {
        co coVar = this.f42752b;
        coVar.Q7();
        UndoView undoView = coVar.y3;
        if (undoView == null) {
            return;
        }
        undoView.j(75, 0L, null);
        coVar.getMessagesController().removeSuggestion(coVar.T5, "CONVERT_GIGAGROUP");
    }

    @Override
    public final void n() {
        co coVar = this.f42752b;
        coVar.getMessagesController().convertToGigaGroup(coVar.getParentActivity(), coVar.f35237e, coVar, new z0(this, 19));
    }
}
