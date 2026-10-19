package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
public final class sg implements MessagesStorage.IntCallback {
    public final int f41455a;
    public final qn f41456b;

    public sg(qn qnVar, int i10) {
        this.f41455a = i10;
        this.f41456b = qnVar;
    }

    @Override
    public final void run(int i10) {
        switch (this.f41455a) {
            case 0:
                qn qnVar = this.f41456b;
                if (qnVar.getParentActivity() != null && qnVar.fragmentView != null && i10 > 0) {
                    org.telegram.ui.Components.xc.a0(qnVar).m(org.telegram.ui.Components.wc.f32069r, i10, 0, 0, qnVar.f40675ea).j();
                    return;
                }
                return;
            case 1:
                qn qnVar2 = this.f41456b;
                if (i10 == 0) {
                    qnVar2.f40768m6 = false;
                    qnVar2.M9();
                    return;
                }
                qnVar2.j(i10, 0, false, 0, true, 0);
                return;
            default:
                qn qnVar3 = this.f41456b;
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
