package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;

public final class tg implements MessagesStorage.IntCallback {

    public final int f42935a;

    public final rn f42936b;

    public tg(rn rnVar, int i10) {
        this.f42935a = i10;
        this.f42936b = rnVar;
    }

    @Override
    public final void run(int i10) {
        switch (this.f42935a) {
            case 0:
                rn rnVar = this.f42936b;
                if (rnVar.getParentActivity() != null && rnVar.fragmentView != null && i10 > 0) {
                    org.telegram.ui.Components.mc.a0(rnVar).m(org.telegram.ui.Components.lc.f30342r, i10, 0, 0, rnVar.f41983aa).j();
                    break;
                }
                break;
            case 1:
                rn rnVar2 = this.f42936b;
                if (i10 != 0) {
                    rnVar2.j(i10, 0, false, 0, true, 0);
                } else {
                    rnVar2.f42083i6 = false;
                    rnVar2.H9();
                }
                break;
            default:
                rn rnVar3 = this.f42936b;
                if (i10 != 0) {
                    rnVar3.finishFragment();
                } else {
                    rnVar3.Qc(true);
                }
                break;
        }
    }
}
