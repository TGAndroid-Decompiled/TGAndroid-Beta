package org.telegram.ui;

import org.telegram.ui.Components.UndoView;
public final class vl implements Runnable {
    public final int f52242a;
    public final lm f52243b;
    public final org.telegram.messenger.gj f52244c;

    public vl(lm lmVar, org.telegram.messenger.gj gjVar, int i7) {
        this.f52242a = i7;
        this.f52243b = lmVar;
        this.f52244c = gjVar;
    }

    @Override
    public final void run() {
        int i7;
        switch (this.f52242a) {
            case 0:
                lm lmVar = this.f52243b;
                an anVar = lmVar.f49001a;
                anVar.h8();
                UndoView undoView = anVar.N3;
                if (undoView != null) {
                    if (anVar.f45117a0.getVisibility() == 0 && anVar.T.getVisibility() != 0) {
                        i7 = 16;
                    } else {
                        i7 = 17;
                    }
                    int i10 = i7;
                    org.telegram.messenger.gj gjVar = this.f52244c;
                    undoView.k(0L, i10, gjVar.C0(), null, null, new vl(lmVar, gjVar, 2));
                    return;
                }
                return;
            case 1:
                an anVar2 = this.f52243b.f49001a;
                anVar2.Zb = this.f52244c.e1();
                anVar2.f45129ac = 0;
                return;
            default:
                an anVar3 = this.f52243b.f49001a;
                if (anVar3.u7()) {
                    org.telegram.messenger.cz b10 = org.telegram.messenger.cz.b(this.f52244c.C0(), anVar3.f45258k6, anVar3.E5, anVar3.f45280m4, null, false, null, null, null, true, 0, 0, null, false);
                    b10.K = anVar3.Y8();
                    anVar3.getSendMessagesHelper().r0(b10);
                    return;
                }
                return;
        }
    }
}
