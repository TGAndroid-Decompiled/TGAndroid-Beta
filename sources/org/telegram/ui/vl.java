package org.telegram.ui;

import org.telegram.ui.Components.UndoView;
public final class vl implements Runnable {
    public final int f52243a;
    public final lm f52244b;
    public final org.telegram.messenger.gj f52245c;

    public vl(lm lmVar, org.telegram.messenger.gj gjVar, int i7) {
        this.f52243a = i7;
        this.f52244b = lmVar;
        this.f52245c = gjVar;
    }

    @Override
    public final void run() {
        int i7;
        switch (this.f52243a) {
            case 0:
                lm lmVar = this.f52244b;
                an anVar = lmVar.f49005a;
                anVar.h8();
                UndoView undoView = anVar.N3;
                if (undoView != null) {
                    if (anVar.f45118a0.getVisibility() == 0 && anVar.T.getVisibility() != 0) {
                        i7 = 16;
                    } else {
                        i7 = 17;
                    }
                    int i10 = i7;
                    org.telegram.messenger.gj gjVar = this.f52245c;
                    undoView.k(0L, i10, gjVar.C0(), null, null, new vl(lmVar, gjVar, 2));
                    return;
                }
                return;
            case 1:
                an anVar2 = this.f52244b.f49005a;
                anVar2.Zb = this.f52245c.e1();
                anVar2.f45130ac = 0;
                return;
            default:
                an anVar3 = this.f52244b.f49005a;
                if (anVar3.u7()) {
                    org.telegram.messenger.cz b10 = org.telegram.messenger.cz.b(this.f52245c.C0(), anVar3.f45259k6, anVar3.E5, anVar3.f45281m4, null, false, null, null, null, true, 0, 0, null, false);
                    b10.K = anVar3.Y8();
                    anVar3.getSendMessagesHelper().r0(b10);
                    return;
                }
                return;
        }
    }
}
