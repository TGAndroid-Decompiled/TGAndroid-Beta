package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_account;
public final class zv implements Utilities.Callback {
    public final int f40639a;
    public final uy f40640b;

    public zv(uy uyVar, int i10) {
        this.f40639a = i10;
        this.f40640b = uyVar;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f40639a) {
            case 0:
                uy uyVar = this.f40640b;
                uyVar.O1 = (Long) obj;
                uyVar.U4();
                return;
            default:
                uy.d0(this.f40640b, (TL_account.TL_birthday) obj);
                return;
        }
    }
}
