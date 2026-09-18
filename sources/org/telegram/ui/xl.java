package org.telegram.ui;

import android.app.Activity;
import org.telegram.ui.Components.UndoView;
public final class xl extends org.telegram.ui.Components.n20 {
    public final bo f39666b;

    public xl(bo boVar, Activity activity, org.telegram.ui.ActionBar.o2 o2Var) {
        super(activity, o2Var);
        this.f39666b = boVar;
    }

    @Override
    public final void m() {
        bo boVar = this.f39666b;
        boVar.Q7();
        UndoView undoView = boVar.y3;
        if (undoView == null) {
            return;
        }
        undoView.j(75, 0L, null);
        boVar.getMessagesController().removeSuggestion(boVar.T5, "CONVERT_GIGAGROUP");
    }

    @Override
    public final void n() {
        bo boVar = this.f39666b;
        boVar.getMessagesController().convertToGigaGroup(boVar.getParentActivity(), boVar.e, boVar, new y0(this, 20));
    }
}
