package org.telegram.ui;

import org.telegram.ui.Components.UndoView;
public final class wl implements Runnable {
    public final int f53414a;
    public final mm f53415b;
    public final org.telegram.messenger.gj f53416c;

    public wl(mm mmVar, org.telegram.messenger.gj gjVar, int i7) {
        this.f53414a = i7;
        this.f53415b = mmVar;
        this.f53416c = gjVar;
    }

    @Override
    public final void run() {
        int i7;
        switch (this.f53414a) {
            case 0:
                mm mmVar = this.f53415b;
                bn bnVar = mmVar.f49910a;
                bnVar.h8();
                UndoView undoView = bnVar.N3;
                if (undoView != null) {
                    if (bnVar.f45903a0.getVisibility() == 0 && bnVar.T.getVisibility() != 0) {
                        i7 = 16;
                    } else {
                        i7 = 17;
                    }
                    int i10 = i7;
                    org.telegram.messenger.gj gjVar = this.f53416c;
                    undoView.k(0L, i10, gjVar.C0(), null, null, new wl(mmVar, gjVar, 2));
                    return;
                }
                return;
            case 1:
                bn bnVar2 = this.f53415b.f49910a;
                bnVar2.f45915ac = this.f53416c.e1();
                bnVar2.f45930bc = 0;
                return;
            default:
                bn bnVar3 = this.f53415b.f49910a;
                if (bnVar3.u7()) {
                    org.telegram.messenger.yy b10 = org.telegram.messenger.yy.b(this.f53416c.C0(), bnVar3.f46056l6, bnVar3.F5, bnVar3.f46067m4, null, false, null, null, null, true, 0, 0, null, false);
                    b10.K = bnVar3.Y8();
                    bnVar3.getSendMessagesHelper().r0(b10);
                    return;
                }
                return;
        }
    }
}
