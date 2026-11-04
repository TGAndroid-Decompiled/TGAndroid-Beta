package org.telegram.ui;

import org.telegram.ui.Components.UndoView;
public final class rl implements Runnable {
    public final int f49241a;
    public final hm f49242b;
    public final org.telegram.messenger.zi f49243c;

    public rl(hm hmVar, org.telegram.messenger.zi ziVar, int i3) {
        this.f49241a = i3;
        this.f49242b = hmVar;
        this.f49243c = ziVar;
    }

    @Override
    public final void run() {
        int i3;
        switch (this.f49241a) {
            case 0:
                hm hmVar = this.f49242b;
                wm wmVar = hmVar.f45934a;
                wmVar.f8();
                UndoView undoView = wmVar.N3;
                if (undoView != null) {
                    if (wmVar.f51237a0.getVisibility() == 0 && wmVar.T.getVisibility() != 0) {
                        i3 = 16;
                    } else {
                        i3 = 17;
                    }
                    int i10 = i3;
                    org.telegram.messenger.zi ziVar = this.f49243c;
                    undoView.k(0L, i10, ziVar.C0(), null, null, new rl(hmVar, ziVar, 2));
                    return;
                }
                return;
            case 1:
                wm wmVar2 = this.f49242b.f45934a;
                wmVar2.Xb = this.f49243c.f1();
                wmVar2.Yb = 0;
                return;
            default:
                wm wmVar3 = this.f49242b.f45934a;
                if (wmVar3.t7()) {
                    org.telegram.messenger.wy b10 = org.telegram.messenger.wy.b(this.f49243c.C0(), wmVar3.f51376k6, wmVar3.E5, wmVar3.f51397m4, null, false, null, null, null, true, 0, 0, null, false);
                    b10.K = wmVar3.W8();
                    wmVar3.getSendMessagesHelper().r0(b10);
                    return;
                }
                return;
        }
    }
}
