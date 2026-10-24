package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class qz implements org.telegram.ui.Components.bm0, org.telegram.ui.ActionBar.z1 {
    public final int f40961a;
    public final q00 f40962b;

    public qz(q00 q00Var, int i10) {
        this.f40961a = i10;
        this.f40962b = q00Var;
    }

    @Override
    public boolean d(int i10, View view) {
        q00 q00Var = this.f40962b;
        h00 h00Var = (h00) q00Var.P.get(i10);
        if (h00Var != null && (view instanceof org.telegram.ui.Cells.wa)) {
            org.telegram.ui.Cells.wa waVar = (org.telegram.ui.Cells.wa) view;
            q00Var.v0(h00Var, waVar.getName(), waVar.getCurrentObject(), h00Var.f37702g);
            return true;
        }
        return false;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.f40961a) {
            case 1:
                q00 q00Var = this.f40962b;
                org.telegram.ui.ActionBar.c2 c2Var2 = null;
                if (q00Var.getParentActivity() != null) {
                    org.telegram.ui.ActionBar.c2 c2Var3 = new org.telegram.ui.ActionBar.c2(q00Var.getParentActivity(), 3, null);
                    c2Var3.f20763i0 = false;
                    c2Var3.show();
                    c2Var2 = c2Var3;
                }
                TLRPC.TL_messages_updateDialogFilter tL_messages_updateDialogFilter = new TLRPC.TL_messages_updateDialogFilter();
                tL_messages_updateDialogFilter.f20467id = q00Var.f40676r.f17862id;
                q00Var.getConnectionsManager().sendRequest(tL_messages_updateDialogFilter, new vc(27, q00Var, c2Var2));
                return;
            case 2:
                this.f40962b.q0();
                return;
            case 3:
                this.f40962b.q0();
                return;
            default:
                this.f40962b.finishFragment();
                return;
        }
    }
}
