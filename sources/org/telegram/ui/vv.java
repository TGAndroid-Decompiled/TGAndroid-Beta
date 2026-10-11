package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_account;
public final class vv implements Utilities.Callback {
    public final int f43176a;
    public final sy f43177b;

    public vv(sy syVar, int i10) {
        this.f43176a = i10;
        this.f43177b = syVar;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f43176a) {
            case 0:
                sy syVar = this.f43177b;
                syVar.O1 = (Long) obj;
                syVar.R4();
                return;
            default:
                sy.a0(this.f43177b, (TL_account.TL_birthday) obj);
                return;
        }
    }
}
