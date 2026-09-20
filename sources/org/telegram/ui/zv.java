package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_account;
public final class zv implements Utilities.Callback {
    public final int f40618a;
    public final uy f40619b;

    public zv(uy uyVar, int i10) {
        this.f40618a = i10;
        this.f40619b = uyVar;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f40618a) {
            case 0:
                uy uyVar = this.f40619b;
                uyVar.O1 = (Long) obj;
                uyVar.U4();
                return;
            default:
                uy.d0(this.f40619b, (TL_account.TL_birthday) obj);
                return;
        }
    }
}
