package org.telegram.ui;

import android.app.Activity;
import org.telegram.ui.Components.UndoView;
public final class zk extends org.telegram.ui.Components.o10 {
    public final bn n1;

    public zk(bn bnVar, Activity activity, org.telegram.ui.ActionBar.h2 h2Var) {
        super(activity, h2Var);
        this.n1 = bnVar;
    }

    @Override
    public final void J0() {
        bn bnVar = this.n1;
        bnVar.h8();
        UndoView undoView = bnVar.N3;
        if (undoView == null) {
            return;
        }
        undoView.j(75, 0L, null);
        bnVar.getMessagesController().s4(bnVar.f46076l6, "CONVERT_GIGAGROUP");
    }

    @Override
    public final void K0() {
        bn bnVar = this.n1;
        bnVar.getMessagesController().S(bnVar.getParentActivity(), bnVar.f45978e, bnVar, new w0(this, 21));
    }
}
