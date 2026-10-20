package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
public final class sg implements MessagesStorage.IntCallback {
    public final int f41459a;
    public final qn f41460b;

    public sg(qn qnVar, int i10) {
        this.f41459a = i10;
        this.f41460b = qnVar;
    }

    @Override
    public final void run(int i10) {
        switch (this.f41459a) {
            case 0:
                qn qnVar = this.f41460b;
                if (qnVar.getParentActivity() != null && qnVar.fragmentView != null && i10 > 0) {
                    org.telegram.ui.Components.xc.a0(qnVar).m(org.telegram.ui.Components.wc.f32054r, i10, 0, 0, qnVar.f40673ea).j();
                    return;
                }
                return;
            case 1:
                qn qnVar2 = this.f41460b;
                if (i10 == 0) {
                    qnVar2.f40766m6 = false;
                    qnVar2.M9();
                    return;
                }
                qnVar2.j(i10, 0, false, 0, true, 0);
                return;
            default:
                qn qnVar3 = this.f41460b;
                if (i10 == 0) {
                    qnVar3.Vc(true);
                    return;
                } else {
                    qnVar3.finishFragment();
                    return;
                }
        }
    }
}
