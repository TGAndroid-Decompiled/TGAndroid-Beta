package org.telegram.ui;

import android.view.View;
public final class re implements Runnable {
    public final int f51560a;
    public final bn f51561b;
    public final int f51562c;

    public re(bn bnVar, int i7, int i10) {
        this.f51560a = i10;
        this.f51561b = bnVar;
        this.f51562c = i7;
    }

    @Override
    public final void run() {
        org.telegram.ui.Cells.r1 r1Var;
        org.telegram.messenger.fj messageObject;
        switch (this.f51560a) {
            case 0:
                this.f51561b.getConnectionsManager().cancelRequest(this.f51562c, true);
                return;
            case 1:
                this.f51561b.l(this.f51562c, 0, false, 0, true, 0);
                return;
            case 2:
                this.f51561b.getConnectionsManager().cancelRequest(this.f51562c, true);
                return;
            case 3:
                bn bnVar = this.f51561b;
                bj bjVar = bnVar.A0;
                if (bjVar != null) {
                    int childCount = bjVar.getChildCount();
                    for (int i7 = 0; i7 < childCount; i7++) {
                        View childAt = bnVar.A0.getChildAt(i7);
                        if ((childAt instanceof org.telegram.ui.Cells.r1) && (messageObject = (r1Var = (org.telegram.ui.Cells.r1) childAt).getMessageObject()) != null && messageObject.T(bnVar.V3)) {
                            r1Var.I3(this.f51562c, true, true);
                        }
                    }
                }
                bnVar.V3 = null;
                return;
            case 4:
                this.f51561b.actionBar.getActionBarMenuOnItemClick().b(this.f51562c);
                return;
            case 5:
                this.f51561b.getConnectionsManager().cancelRequest(this.f51562c, true);
                return;
            case 6:
                bn.c0(this.f51561b, this.f51562c);
                return;
            case 7:
                this.f51561b.actionBar.setSubtitle(org.telegram.messenger.gd.G(this.f51562c, "messages", new Object[0]));
                return;
            case 8:
                this.f51561b.getConnectionsManager().cancelRequest(this.f51562c, true);
                return;
            case 9:
                bn.O0(this.f51561b, this.f51562c);
                return;
            default:
                bn.d1(this.f51561b, this.f51562c);
                return;
        }
    }
}
