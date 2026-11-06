package org.telegram.ui;

import org.telegram.ui.Components.UndoView;
public final class vl implements Runnable {
    public final int f50752a;
    public final lm f50753b;
    public final org.telegram.messenger.ij f50754c;

    public vl(lm lmVar, org.telegram.messenger.ij ijVar, int i7) {
        this.f50752a = i7;
        this.f50753b = lmVar;
        this.f50754c = ijVar;
    }

    @Override
    public final void run() {
        int i7;
        switch (this.f50752a) {
            case 0:
                lm lmVar = this.f50753b;
                an anVar = lmVar.f47560a;
                anVar.f8();
                UndoView undoView = anVar.M3;
                if (undoView != null) {
                    if (anVar.Z.getVisibility() == 0 && anVar.S.getVisibility() != 0) {
                        i7 = 16;
                    } else {
                        i7 = 17;
                    }
                    int i10 = i7;
                    org.telegram.messenger.ij ijVar = this.f50754c;
                    undoView.k(0L, i10, ijVar.C0(), null, null, new vl(lmVar, ijVar, 2));
                    return;
                }
                return;
            case 1:
                an anVar2 = this.f50753b.f47560a;
                anVar2.Wb = this.f50754c.f1();
                anVar2.Xb = 0;
                return;
            default:
                an anVar3 = this.f50753b.f47560a;
                if (anVar3.t7()) {
                    org.telegram.messenger.ez b10 = org.telegram.messenger.ez.b(this.f50754c.C0(), anVar3.f43842j6, anVar3.D5, anVar3.f43864l4, null, false, null, null, null, true, 0, 0, null, false);
                    b10.K = anVar3.W8();
                    anVar3.getSendMessagesHelper().r0(b10);
                    return;
                }
                return;
        }
    }
}
