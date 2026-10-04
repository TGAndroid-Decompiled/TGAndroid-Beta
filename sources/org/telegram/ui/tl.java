package org.telegram.ui;

import android.app.Activity;
import org.telegram.ui.Components.UndoView;
public final class tl extends org.telegram.ui.Components.r20 {
    public final yn f40870b;

    public tl(yn ynVar, Activity activity, org.telegram.ui.ActionBar.n2 n2Var) {
        super(activity, n2Var);
        this.f40870b = ynVar;
    }

    @Override
    public final void m() {
        yn ynVar = this.f40870b;
        ynVar.Q7();
        UndoView undoView = ynVar.f43542w3;
        if (undoView == null) {
            return;
        }
        undoView.j(75, 0L, null);
        ynVar.getMessagesController().removeSuggestion(ynVar.R5, "CONVERT_GIGAGROUP");
    }

    @Override
    public final void n() {
        yn ynVar = this.f40870b;
        ynVar.getMessagesController().convertToGigaGroup(ynVar.getParentActivity(), ynVar.f43315e, ynVar, new z0(this, 21));
    }
}
