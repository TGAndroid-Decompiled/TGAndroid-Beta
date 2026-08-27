package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;

public final class qz implements org.telegram.ui.Components.rk0, org.telegram.ui.ActionBar.a2 {

    public final int f41769a;

    public final q00 f41770b;

    public qz(q00 q00Var, int i10) {
        this.f41769a = i10;
        this.f41770b = q00Var;
    }

    @Override
    public boolean a(int i10, View view) {
        q00 q00Var = this.f41770b;
        h00 h00Var = (h00) q00Var.L.get(i10);
        if (h00Var == null || !(view instanceof org.telegram.ui.Cells.sa)) {
            return false;
        }
        org.telegram.ui.Cells.sa saVar = (org.telegram.ui.Cells.sa) view;
        q00Var.v0(h00Var, saVar.getName(), saVar.getCurrentObject(), h00Var.f38646g);
        return true;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f41769a) {
            case 1:
                q00 q00Var = this.f41770b;
                org.telegram.ui.ActionBar.b2 b2Var2 = null;
                if (q00Var.getParentActivity() != null) {
                    org.telegram.ui.ActionBar.b2 b2Var3 = new org.telegram.ui.ActionBar.b2(q00Var.getParentActivity(), 3, null);
                    b2Var3.f22747c0 = false;
                    b2Var3.show();
                    b2Var2 = b2Var3;
                }
                TLRPC.TL_messages_updateDialogFilter tL_messages_updateDialogFilter = new TLRPC.TL_messages_updateDialogFilter();
                tL_messages_updateDialogFilter.f22503id = q00Var.f41477r.f19622id;
                q00Var.getConnectionsManager().sendRequest(tL_messages_updateDialogFilter, new gg(24, q00Var, b2Var2));
                break;
            case 2:
                this.f41770b.q0();
                break;
            case 3:
                this.f41770b.q0();
                break;
            default:
                this.f41770b.finishFragment();
                break;
        }
    }
}
