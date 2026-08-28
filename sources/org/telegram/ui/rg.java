package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
public final class rg implements MessagesStorage.IntCallback {
    public final int f42416a;
    public final qn f42417b;

    public rg(qn qnVar, int i9) {
        this.f42416a = i9;
        this.f42417b = qnVar;
    }

    @Override
    public final void run(int i9) {
        switch (this.f42416a) {
            case 0:
                qn qnVar = this.f42417b;
                if (qnVar.getParentActivity() != null && qnVar.fragmentView != null && i9 > 0) {
                    org.telegram.ui.Components.oc.a0(qnVar).m(org.telegram.ui.Components.nc.f31067r, i9, 0, 0, qnVar.f41848aa).j();
                    return;
                }
                return;
            case 1:
                qn qnVar2 = this.f42417b;
                if (i9 == 0) {
                    qnVar2.f41948i6 = false;
                    qnVar2.H9();
                    return;
                }
                qnVar2.j(i9, 0, false, 0, true, 0);
                return;
            default:
                qn qnVar3 = this.f42417b;
                if (i9 == 0) {
                    qnVar3.Qc(true);
                    return;
                } else {
                    qnVar3.finishFragment();
                    return;
                }
        }
    }
}
