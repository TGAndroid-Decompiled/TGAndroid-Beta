package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
public final class tg implements MessagesStorage.IntCallback {
    public final int f43831a;
    public final un f43832b;

    public tg(un unVar, int i10) {
        this.f43831a = i10;
        this.f43832b = unVar;
    }

    @Override
    public final void run(int i10) {
        switch (this.f43831a) {
            case 0:
                un unVar = this.f43832b;
                if (unVar.getParentActivity() != null && unVar.fragmentView != null && i10 > 0) {
                    org.telegram.ui.Components.wc.b0(unVar).m(org.telegram.ui.Components.vc.f33627r, i10, 0, 0, unVar.f44385qa).j();
                    return;
                }
                return;
            case 1:
                un unVar2 = this.f43832b;
                if (i10 == 0) {
                    unVar2.f44486y6 = false;
                    unVar2.R9();
                    return;
                }
                unVar2.j(i10, 0, false, 0, true, 0);
                return;
            default:
                un unVar3 = this.f43832b;
                if (i10 == 0) {
                    unVar3.dd(true);
                    return;
                } else {
                    unVar3.finishFragment();
                    return;
                }
        }
    }
}
