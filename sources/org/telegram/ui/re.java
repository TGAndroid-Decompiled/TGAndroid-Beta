package org.telegram.ui;

import android.view.View;
public final class re implements Runnable {
    public final int f51564a;
    public final bn f51565b;
    public final int f51566c;

    public re(bn bnVar, int i7, int i10) {
        this.f51564a = i10;
        this.f51565b = bnVar;
        this.f51566c = i7;
    }

    @Override
    public final void run() {
        org.telegram.ui.Cells.r1 r1Var;
        org.telegram.messenger.gj messageObject;
        switch (this.f51564a) {
            case 0:
                this.f51565b.getConnectionsManager().cancelRequest(this.f51566c, true);
                return;
            case 1:
                this.f51565b.l(this.f51566c, 0, false, 0, true, 0);
                return;
            case 2:
                this.f51565b.getConnectionsManager().cancelRequest(this.f51566c, true);
                return;
            case 3:
                bn bnVar = this.f51565b;
                bj bjVar = bnVar.A0;
                if (bjVar != null) {
                    int childCount = bjVar.getChildCount();
                    for (int i7 = 0; i7 < childCount; i7++) {
                        View childAt = bnVar.A0.getChildAt(i7);
                        if ((childAt instanceof org.telegram.ui.Cells.r1) && (messageObject = (r1Var = (org.telegram.ui.Cells.r1) childAt).getMessageObject()) != null && messageObject.T(bnVar.V3)) {
                            r1Var.I3(this.f51566c, true, true);
                        }
                    }
                }
                bnVar.V3 = null;
                return;
            case 4:
                this.f51565b.actionBar.getActionBarMenuOnItemClick().b(this.f51566c);
                return;
            case 5:
                this.f51565b.getConnectionsManager().cancelRequest(this.f51566c, true);
                return;
            case 6:
                bn.c0(this.f51565b, this.f51566c);
                return;
            case 7:
                this.f51565b.actionBar.setSubtitle(org.telegram.messenger.hd.G(this.f51566c, "messages", new Object[0]));
                return;
            case 8:
                this.f51565b.getConnectionsManager().cancelRequest(this.f51566c, true);
                return;
            case 9:
                bn.O0(this.f51565b, this.f51566c);
                return;
            default:
                bn.d1(this.f51565b, this.f51566c);
                return;
        }
    }
}
