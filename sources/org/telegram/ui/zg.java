package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
public final class zg implements MessagesStorage.IntCallback {
    public final int f40452a;
    public final wn f40453b;

    public zg(wn wnVar, int i10) {
        this.f40452a = i10;
        this.f40453b = wnVar;
    }

    @Override
    public final void run(int i10) {
        switch (this.f40452a) {
            case 0:
                wn wnVar = this.f40453b;
                if (wnVar.getParentActivity() != null && wnVar.fragmentView != null && i10 > 0) {
                    org.telegram.ui.Components.yc.a0(wnVar).m(org.telegram.ui.Components.xc.f30301r, i10, 0, 0, wnVar.f39454ea).j();
                    return;
                }
                return;
            case 1:
                wn wnVar2 = this.f40453b;
                if (i10 == 0) {
                    wnVar2.f39546m6 = false;
                    wnVar2.H9();
                    return;
                }
                wnVar2.F(i10, 0, 0, 0, false, true);
                return;
            default:
                wn wnVar3 = this.f40453b;
                if (i10 == 0) {
                    wnVar3.Qc(true);
                    return;
                } else {
                    wnVar3.finishFragment();
                    return;
                }
        }
    }
}
