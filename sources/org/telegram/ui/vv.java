package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_account;
public final class vv implements Utilities.Callback {
    public final int f38482a;
    public final ry f38483b;

    public vv(ry ryVar, int i10) {
        this.f38482a = i10;
        this.f38483b = ryVar;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f38482a) {
            case 0:
                ry ryVar = this.f38483b;
                ryVar.O1 = (Long) obj;
                ryVar.U4();
                return;
            default:
                ry.c0(this.f38483b, (TL_account.TL_birthday) obj);
                return;
        }
    }
}
