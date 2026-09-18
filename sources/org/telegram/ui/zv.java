package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_account;
public final class zv implements Utilities.Callback {
    public final int f40574a;
    public final uy f40575b;

    public zv(uy uyVar, int i10) {
        this.f40574a = i10;
        this.f40575b = uyVar;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f40574a) {
            case 0:
                uy uyVar = this.f40575b;
                uyVar.O1 = (Long) obj;
                uyVar.U4();
                return;
            default:
                uy.d0(this.f40575b, (TL_account.TL_birthday) obj);
                return;
        }
    }
}
