package org.telegram.ui;

import org.telegram.ui.Components.UndoView;
public final class wl implements Runnable {
    public final int f53452a;
    public final mm f53453b;
    public final org.telegram.messenger.gj f53454c;

    public wl(mm mmVar, org.telegram.messenger.gj gjVar, int i7) {
        this.f53452a = i7;
        this.f53453b = mmVar;
        this.f53454c = gjVar;
    }

    @Override
    public final void run() {
        int i7;
        switch (this.f53452a) {
            case 0:
                mm mmVar = this.f53453b;
                bn bnVar = mmVar.f49941a;
                bnVar.h8();
                UndoView undoView = bnVar.N3;
                if (undoView != null) {
                    if (bnVar.f45950a0.getVisibility() == 0 && bnVar.T.getVisibility() != 0) {
                        i7 = 16;
                    } else {
                        i7 = 17;
                    }
                    int i10 = i7;
                    org.telegram.messenger.gj gjVar = this.f53454c;
                    undoView.k(0L, i10, gjVar.C0(), null, null, new wl(mmVar, gjVar, 2));
                    return;
                }
                return;
            case 1:
                bn bnVar2 = this.f53453b.f49941a;
                bnVar2.f45962ac = this.f53454c.e1();
                bnVar2.f45977bc = 0;
                return;
            default:
                bn bnVar3 = this.f53453b.f49941a;
                if (bnVar3.u7()) {
                    org.telegram.messenger.yy b10 = org.telegram.messenger.yy.b(this.f53454c.C0(), bnVar3.f46103l6, bnVar3.F5, bnVar3.f46114m4, null, false, null, null, null, true, 0, 0, null, false);
                    b10.K = bnVar3.Y8();
                    bnVar3.getSendMessagesHelper().r0(b10);
                    return;
                }
                return;
        }
    }
}
