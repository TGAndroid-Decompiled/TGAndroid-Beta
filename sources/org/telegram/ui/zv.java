package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_account;
public final class zv implements Utilities.Callback {
    public final int f43553a;
    public final uy f43554b;

    public zv(uy uyVar, int i10) {
        this.f43553a = i10;
        this.f43554b = uyVar;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f43553a) {
            case 0:
                uy uyVar = this.f43554b;
                uyVar.O1 = (Long) obj;
                uyVar.U4();
                return;
            default:
                uy.d0(this.f43554b, (TL_account.TL_birthday) obj);
                return;
        }
    }
}
