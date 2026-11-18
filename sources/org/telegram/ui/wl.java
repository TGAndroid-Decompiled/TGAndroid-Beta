package org.telegram.ui;

import org.telegram.ui.Components.UndoView;
public final class wl implements Runnable {
    public final int f53402a;
    public final mm f53403b;
    public final org.telegram.messenger.fj f53404c;

    public wl(mm mmVar, org.telegram.messenger.fj fjVar, int i7) {
        this.f53402a = i7;
        this.f53403b = mmVar;
        this.f53404c = fjVar;
    }

    @Override
    public final void run() {
        int i7;
        switch (this.f53402a) {
            case 0:
                mm mmVar = this.f53403b;
                bn bnVar = mmVar.f49896a;
                bnVar.h8();
                UndoView undoView = bnVar.N3;
                if (undoView != null) {
                    if (bnVar.f45923a0.getVisibility() == 0 && bnVar.T.getVisibility() != 0) {
                        i7 = 16;
                    } else {
                        i7 = 17;
                    }
                    int i10 = i7;
                    org.telegram.messenger.fj fjVar = this.f53404c;
                    undoView.k(0L, i10, fjVar.C0(), null, null, new wl(mmVar, fjVar, 2));
                    return;
                }
                return;
            case 1:
                bn bnVar2 = this.f53403b.f49896a;
                bnVar2.f45935ac = this.f53404c.e1();
                bnVar2.f45950bc = 0;
                return;
            default:
                bn bnVar3 = this.f53403b.f49896a;
                if (bnVar3.u7()) {
                    org.telegram.messenger.xy b10 = org.telegram.messenger.xy.b(this.f53404c.C0(), bnVar3.f46076l6, bnVar3.F5, bnVar3.f46087m4, null, false, null, null, null, true, 0, 0, null, false);
                    b10.K = bnVar3.Y8();
                    bnVar3.getSendMessagesHelper().r0(b10);
                    return;
                }
                return;
        }
    }
}
