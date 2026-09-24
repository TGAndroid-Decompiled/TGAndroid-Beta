package org.telegram.ui;

import android.app.Activity;
import org.telegram.ui.Components.UndoView;
public final class tl extends org.telegram.ui.Components.o20 {
    public final wn f38131b;

    public tl(wn wnVar, Activity activity, org.telegram.ui.ActionBar.m2 m2Var) {
        super(activity, m2Var);
        this.f38131b = wnVar;
    }

    @Override
    public final void m() {
        wn wnVar = this.f38131b;
        wnVar.Q7();
        UndoView undoView = wnVar.y3;
        if (undoView == null) {
            return;
        }
        undoView.j(75, 0L, null);
        wnVar.getMessagesController().removeSuggestion(wnVar.T5, "CONVERT_GIGAGROUP");
    }

    @Override
    public final void n() {
        wn wnVar = this.f38131b;
        wnVar.getMessagesController().convertToGigaGroup(wnVar.getParentActivity(), wnVar.e, wnVar, new z0(this, 19));
    }
}
