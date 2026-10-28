package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class qz implements org.telegram.ui.Components.cm0, org.telegram.ui.ActionBar.b2 {
    public final int f42817a;
    public final q00 f42818b;

    public qz(q00 q00Var, int i10) {
        this.f42817a = i10;
        this.f42818b = q00Var;
    }

    @Override
    public boolean c(int i10, View view) {
        q00 q00Var = this.f42818b;
        h00 h00Var = (h00) q00Var.P.get(i10);
        if (h00Var != null && (view instanceof org.telegram.ui.Cells.ab)) {
            org.telegram.ui.Cells.ab abVar = (org.telegram.ui.Cells.ab) view;
            q00Var.x0(h00Var, abVar.getName(), abVar.getCurrentObject(), h00Var.f39739g);
            return true;
        }
        return false;
    }

    @Override
    public void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        switch (this.f42817a) {
            case 1:
                q00 q00Var = this.f42818b;
                org.telegram.ui.ActionBar.e2 e2Var2 = null;
                if (q00Var.getParentActivity() != null) {
                    org.telegram.ui.ActionBar.e2 e2Var3 = new org.telegram.ui.ActionBar.e2(q00Var.getParentActivity(), 3, null);
                    e2Var3.f22576i0 = false;
                    e2Var3.show();
                    e2Var2 = e2Var3;
                }
                TLRPC.TL_messages_updateDialogFilter tL_messages_updateDialogFilter = new TLRPC.TL_messages_updateDialogFilter();
                tL_messages_updateDialogFilter.f22153id = q00Var.f42560r.f19548id;
                q00Var.getConnectionsManager().sendRequest(tL_messages_updateDialogFilter, new z7(28, q00Var, e2Var2));
                return;
            case 2:
                this.f42818b.s0();
                return;
            case 3:
                this.f42818b.s0();
                return;
            default:
                this.f42818b.finishFragment();
                return;
        }
    }
}
