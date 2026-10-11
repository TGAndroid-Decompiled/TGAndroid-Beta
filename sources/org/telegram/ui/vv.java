package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_account;
public final class vv implements Utilities.Callback {
    public final int f43142a;
    public final sy f43143b;

    public vv(sy syVar, int i10) {
        this.f43142a = i10;
        this.f43143b = syVar;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f43142a) {
            case 0:
                sy syVar = this.f43143b;
                syVar.O1 = (Long) obj;
                syVar.R4();
                return;
            default:
                sy.a0(this.f43143b, (TL_account.TL_birthday) obj);
                return;
        }
    }
}
