package org.telegram.ui;

import org.telegram.ui.Components.UndoView;
public final class xl implements Runnable {
    public final int f51742a;
    public final nm f51743b;
    public final org.telegram.messenger.ij f51744c;

    public xl(nm nmVar, org.telegram.messenger.ij ijVar, int i7) {
        this.f51742a = i7;
        this.f51743b = nmVar;
        this.f51744c = ijVar;
    }

    @Override
    public final void run() {
        int i7;
        switch (this.f51742a) {
            case 0:
                nm nmVar = this.f51743b;
                cn cnVar = nmVar.f48227a;
                cnVar.g8();
                UndoView undoView = cnVar.M3;
                if (undoView != null) {
                    if (cnVar.Z.getVisibility() == 0 && cnVar.S.getVisibility() != 0) {
                        i7 = 16;
                    } else {
                        i7 = 17;
                    }
                    int i10 = i7;
                    org.telegram.messenger.ij ijVar = this.f51744c;
                    undoView.k(0L, i10, ijVar.C0(), null, null, new xl(nmVar, ijVar, 2));
                    return;
                }
                return;
            case 1:
                cn cnVar2 = this.f51743b.f48227a;
                cnVar2.Yb = this.f51744c.e1();
                cnVar2.Zb = 0;
                return;
            default:
                cn cnVar3 = this.f51743b.f48227a;
                if (cnVar3.u7()) {
                    org.telegram.messenger.ez b10 = org.telegram.messenger.ez.b(this.f51744c.C0(), cnVar3.f44545j6, cnVar3.D5, cnVar3.f44568l4, null, false, null, null, null, true, 0, 0, null, false);
                    b10.K = cnVar3.X8();
                    cnVar3.getSendMessagesHelper().r0(b10);
                    return;
                }
                return;
        }
    }
}
