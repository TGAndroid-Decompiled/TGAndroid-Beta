package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
public final class rg implements MessagesStorage.IntCallback {
    public final int f41129a;
    public final sn f41130b;

    public rg(sn snVar, int i10) {
        this.f41129a = i10;
        this.f41130b = snVar;
    }

    @Override
    public final void run(int i10) {
        switch (this.f41129a) {
            case 0:
                sn snVar = this.f41130b;
                if (snVar.getParentActivity() != null && snVar.fragmentView != null && i10 > 0) {
                    org.telegram.ui.Components.xc.a0(snVar).m(org.telegram.ui.Components.wc.f32214r, i10, 0, 0, snVar.f41654qa).j();
                    return;
                }
                return;
            case 1:
                sn snVar2 = this.f41130b;
                if (i10 == 0) {
                    snVar2.f41756y6 = false;
                    snVar2.M9();
                    return;
                }
                snVar2.j(i10, 0, false, 0, true, 0);
                return;
            default:
                sn snVar3 = this.f41130b;
                if (i10 == 0) {
                    snVar3.Xc(true);
                    return;
                } else {
                    snVar3.finishFragment();
                    return;
                }
        }
    }
}
