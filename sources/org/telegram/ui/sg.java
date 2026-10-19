package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
public final class sg implements MessagesStorage.IntCallback {
    public final int f41453a;
    public final qn f41454b;

    public sg(qn qnVar, int i10) {
        this.f41453a = i10;
        this.f41454b = qnVar;
    }

    @Override
    public final void run(int i10) {
        switch (this.f41453a) {
            case 0:
                qn qnVar = this.f41454b;
                if (qnVar.getParentActivity() != null && qnVar.fragmentView != null && i10 > 0) {
                    org.telegram.ui.Components.xc.a0(qnVar).m(org.telegram.ui.Components.wc.f32067r, i10, 0, 0, qnVar.f40667ea).j();
                    return;
                }
                return;
            case 1:
                qn qnVar2 = this.f41454b;
                if (i10 == 0) {
                    qnVar2.f40760m6 = false;
                    qnVar2.M9();
                    return;
                }
                qnVar2.j(i10, 0, false, 0, true, 0);
                return;
            default:
                qn qnVar3 = this.f41454b;
                if (i10 == 0) {
                    qnVar3.Uc(true);
                    return;
                } else {
                    qnVar3.finishFragment();
                    return;
                }
        }
    }
}
