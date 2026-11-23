package org.telegram.ui;

import android.app.Activity;
import org.telegram.ui.Components.UndoView;
public final class zk extends org.telegram.ui.Components.r10 {
    public final bn n1;

    public zk(bn bnVar, Activity activity, org.telegram.ui.ActionBar.g2 g2Var) {
        super(activity, g2Var);
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
        bnVar.getMessagesController().s4(bnVar.f46056l6, "CONVERT_GIGAGROUP");
    }

    @Override
    public final void K0() {
        bn bnVar = this.n1;
        bnVar.getMessagesController().S(bnVar.getParentActivity(), bnVar.f45958e, bnVar, new w0(this, 21));
    }
}
