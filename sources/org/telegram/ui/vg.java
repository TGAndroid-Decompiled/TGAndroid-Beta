package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
public final class vg implements MessagesStorage.IntCallback {
    public final int f39165a;
    public final xn f39166b;

    public vg(xn xnVar, int i10) {
        this.f39165a = i10;
        this.f39166b = xnVar;
    }

    @Override
    public final void run(int i10) {
        switch (this.f39165a) {
            case 0:
                xn xnVar = this.f39166b;
                if (xnVar.getParentActivity() != null && xnVar.fragmentView != null && i10 > 0) {
                    org.telegram.ui.Components.qc.a0(xnVar).m(org.telegram.ui.Components.pc.f27813r, i10, 0, 0, xnVar.f39968ba).j();
                    return;
                }
                return;
            case 1:
                xn xnVar2 = this.f39166b;
                if (i10 == 0) {
                    xnVar2.f40065j6 = false;
                    xnVar2.H9();
                    return;
                }
                xnVar2.j(i10, 0, false, 0, true, 0);
                return;
            default:
                xn xnVar3 = this.f39166b;
                if (i10 == 0) {
                    xnVar3.Qc(true);
                    return;
                } else {
                    xnVar3.finishFragment();
                    return;
                }
        }
    }
}
