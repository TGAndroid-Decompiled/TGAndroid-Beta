package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_account;
public final class sv implements Utilities.Callback {
    public final int f40619a;
    public final uy f40620b;

    public sv(uy uyVar, int i10) {
        this.f40619a = i10;
        this.f40620b = uyVar;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f40619a) {
            case 0:
                uy uyVar = this.f40620b;
                uyVar.O1 = (Long) obj;
                uyVar.d5();
                return;
            default:
                uy.c0(this.f40620b, (TL_account.TL_birthday) obj);
                return;
        }
    }
}
