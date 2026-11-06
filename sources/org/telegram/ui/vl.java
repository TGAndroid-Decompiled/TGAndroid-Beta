package org.telegram.ui;

import org.telegram.ui.Components.UndoView;
public final class vl implements Runnable {
    public final int f50743a;
    public final lm f50744b;
    public final org.telegram.messenger.ij f50745c;

    public vl(lm lmVar, org.telegram.messenger.ij ijVar, int i7) {
        this.f50743a = i7;
        this.f50744b = lmVar;
        this.f50745c = ijVar;
    }

    @Override
    public final void run() {
        int i7;
        switch (this.f50743a) {
            case 0:
                lm lmVar = this.f50744b;
                an anVar = lmVar.f47534a;
                anVar.f8();
                UndoView undoView = anVar.M3;
                if (undoView != null) {
                    if (anVar.Z.getVisibility() == 0 && anVar.S.getVisibility() != 0) {
                        i7 = 16;
                    } else {
                        i7 = 17;
                    }
                    int i10 = i7;
                    org.telegram.messenger.ij ijVar = this.f50745c;
                    undoView.k(0L, i10, ijVar.C0(), null, null, new vl(lmVar, ijVar, 2));
                    return;
                }
                return;
            case 1:
                an anVar2 = this.f50744b.f47534a;
                anVar2.Wb = this.f50745c.f1();
                anVar2.Xb = 0;
                return;
            default:
                an anVar3 = this.f50744b.f47534a;
                if (anVar3.t7()) {
                    org.telegram.messenger.ez b10 = org.telegram.messenger.ez.b(this.f50745c.C0(), anVar3.f43818j6, anVar3.D5, anVar3.f43840l4, null, false, null, null, null, true, 0, 0, null, false);
                    b10.K = anVar3.W8();
                    anVar3.getSendMessagesHelper().r0(b10);
                    return;
                }
                return;
        }
    }
}
