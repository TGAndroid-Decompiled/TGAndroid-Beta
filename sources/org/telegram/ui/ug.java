package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
public final class ug implements MessagesStorage.IntCallback {
    public final int f41994a;
    public final sn f41995b;

    public ug(sn snVar, int i10) {
        this.f41994a = i10;
        this.f41995b = snVar;
    }

    @Override
    public final void run(int i10) {
        switch (this.f41994a) {
            case 0:
                sn snVar = this.f41995b;
                if (snVar.getParentActivity() != null && snVar.fragmentView != null && i10 > 0) {
                    org.telegram.ui.Components.xc.a0(snVar).m(org.telegram.ui.Components.wc.f32077r, i10, 0, 0, snVar.f41226ea).j();
                    return;
                }
                return;
            case 1:
                sn snVar2 = this.f41995b;
                if (i10 == 0) {
                    snVar2.f41319m6 = false;
                    snVar2.M9();
                    return;
                }
                snVar2.j(i10, 0, false, 0, true, 0);
                return;
            default:
                sn snVar3 = this.f41995b;
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
