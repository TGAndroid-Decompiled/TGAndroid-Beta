package org.telegram.ui;

import android.app.Activity;
import org.telegram.ui.Components.UndoView;
public final class yk extends org.telegram.ui.Components.h10 {
    public final an n1;

    public yk(an anVar, Activity activity, org.telegram.ui.ActionBar.e2 e2Var) {
        super(activity, e2Var);
        this.n1 = anVar;
    }

    @Override
    public final void I0() {
        an anVar = this.n1;
        anVar.h8();
        UndoView undoView = anVar.N3;
        if (undoView == null) {
            return;
        }
        undoView.j(75, 0L, null);
        anVar.getMessagesController().k4(anVar.f45258k6, "CONVERT_GIGAGROUP");
    }

    @Override
    public final void J0() {
        an anVar = this.n1;
        anVar.getMessagesController().S(anVar.getParentActivity(), anVar.f45172e, anVar, new w0(this, 21));
    }
}
