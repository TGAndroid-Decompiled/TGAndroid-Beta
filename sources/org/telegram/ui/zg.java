package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
public final class zg implements MessagesStorage.IntCallback {
    public final int f40469a;
    public final wn f40470b;

    public zg(wn wnVar, int i10) {
        this.f40469a = i10;
        this.f40470b = wnVar;
    }

    @Override
    public final void run(int i10) {
        switch (this.f40469a) {
            case 0:
                wn wnVar = this.f40470b;
                if (wnVar.getParentActivity() != null && wnVar.fragmentView != null && i10 > 0) {
                    org.telegram.ui.Components.xc.a0(wnVar).m(org.telegram.ui.Components.wc.f29961r, i10, 0, 0, wnVar.f39470ea).j();
                    return;
                }
                return;
            case 1:
                wn wnVar2 = this.f40470b;
                if (i10 == 0) {
                    wnVar2.f39562m6 = false;
                    wnVar2.H9();
                    return;
                }
                wnVar2.F(i10, 0, 0, 0, false, true);
                return;
            default:
                wn wnVar3 = this.f40470b;
                if (i10 == 0) {
                    wnVar3.Qc(true);
                    return;
                } else {
                    wnVar3.finishFragment();
                    return;
                }
        }
    }
}
