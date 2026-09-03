package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
public final class xg implements MessagesStorage.IntCallback {
    public final int f39977a;
    public final zn f39978b;

    public xg(zn znVar, int i10) {
        this.f39977a = i10;
        this.f39978b = znVar;
    }

    @Override
    public final void run(int i10) {
        switch (this.f39977a) {
            case 0:
                zn znVar = this.f39978b;
                if (znVar.getParentActivity() != null && znVar.fragmentView != null && i10 > 0) {
                    org.telegram.ui.Components.qc.a0(znVar).m(org.telegram.ui.Components.pc.f27820r, i10, 0, 0, znVar.f40534ba).j();
                    return;
                }
                return;
            case 1:
                zn znVar2 = this.f39978b;
                if (i10 == 0) {
                    znVar2.f40631j6 = false;
                    znVar2.H9();
                    return;
                }
                znVar2.j(i10, 0, false, 0, true, 0);
                return;
            default:
                zn znVar3 = this.f39978b;
                if (i10 == 0) {
                    znVar3.Qc(true);
                    return;
                } else {
                    znVar3.finishFragment();
                    return;
                }
        }
    }
}
