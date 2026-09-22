package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_account;
public final class yv implements Utilities.Callback {
    public final int f39971a;
    public final uy f39972b;

    public yv(uy uyVar, int i10) {
        this.f39971a = i10;
        this.f39972b = uyVar;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f39971a) {
            case 0:
                uy uyVar = this.f39972b;
                uyVar.O1 = (Long) obj;
                uyVar.U4();
                return;
            default:
                uy.d0(this.f39972b, (TL_account.TL_birthday) obj);
                return;
        }
    }
}
