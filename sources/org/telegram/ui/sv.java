package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_account;
public final class sv implements Utilities.Callback {
    public final int f40625a;
    public final uy f40626b;

    public sv(uy uyVar, int i10) {
        this.f40625a = i10;
        this.f40626b = uyVar;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f40625a) {
            case 0:
                uy uyVar = this.f40626b;
                uyVar.O1 = (Long) obj;
                uyVar.d5();
                return;
            default:
                uy.c0(this.f40626b, (TL_account.TL_birthday) obj);
                return;
        }
    }
}
