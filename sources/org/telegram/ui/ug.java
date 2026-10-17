package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
public final class ug implements MessagesStorage.IntCallback {
    public final int f41979a;
    public final sn f41980b;

    public ug(sn snVar, int i10) {
        this.f41979a = i10;
        this.f41980b = snVar;
    }

    @Override
    public final void run(int i10) {
        switch (this.f41979a) {
            case 0:
                sn snVar = this.f41980b;
                if (snVar.getParentActivity() != null && snVar.fragmentView != null && i10 > 0) {
                    org.telegram.ui.Components.xc.a0(snVar).m(org.telegram.ui.Components.wc.f32070r, i10, 0, 0, snVar.f41205ea).j();
                    return;
                }
                return;
            case 1:
                sn snVar2 = this.f41980b;
                if (i10 == 0) {
                    snVar2.f41298m6 = false;
                    snVar2.M9();
                    return;
                }
                snVar2.j(i10, 0, false, 0, true, 0);
                return;
            default:
                sn snVar3 = this.f41980b;
                if (i10 == 0) {
                    snVar3.Uc(true);
                    return;
                } else {
                    snVar3.finishFragment();
                    return;
                }
        }
    }
}
