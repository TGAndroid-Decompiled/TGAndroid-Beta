package org.telegram.ui;

import android.app.Activity;
import org.telegram.ui.Components.UndoView;
public final class yk extends org.telegram.ui.Components.d10 {
    public final an f52239j1;

    public yk(an anVar, Activity activity, org.telegram.ui.ActionBar.f2 f2Var) {
        super(activity, f2Var);
        this.f52239j1 = anVar;
    }

    @Override
    public final void I0() {
        an anVar = this.f52239j1;
        anVar.f8();
        UndoView undoView = anVar.M3;
        if (undoView == null) {
            return;
        }
        undoView.j(75, 0L, null);
        anVar.getMessagesController().k4(anVar.f43818j6, "CONVERT_GIGAGROUP");
    }

    @Override
    public final void J0() {
        an anVar = this.f52239j1;
        anVar.getMessagesController().S(anVar.getParentActivity(), anVar.f43747e, anVar, new w0(this, 21));
    }
}
