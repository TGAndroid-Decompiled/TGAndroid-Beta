package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
public final class rg implements MessagesStorage.IntCallback {
    public final int f42984a;
    public final wn f42985b;

    public rg(wn wnVar, int i10) {
        this.f42984a = i10;
        this.f42985b = wnVar;
    }

    @Override
    public final void run(int i10) {
        switch (this.f42984a) {
            case 0:
                wn wnVar = this.f42985b;
                if (wnVar.getParentActivity() != null && wnVar.fragmentView != null && i10 > 0) {
                    org.telegram.ui.Components.wc.b0(wnVar).m(org.telegram.ui.Components.vc.f33667r, i10, 0, 0, wnVar.f45309ua).j();
                    return;
                }
                return;
            case 1:
                wn wnVar2 = this.f42985b;
                if (i10 == 0) {
                    wnVar2.C6 = false;
                    wnVar2.U9();
                    return;
                }
                wnVar2.j(i10, 0, false, 0, true, 0);
                return;
            default:
                wn wnVar3 = this.f42985b;
                if (i10 == 0) {
                    wnVar3.hd(true);
                    return;
                } else {
                    wnVar3.finishFragment();
                    return;
                }
        }
    }
}
