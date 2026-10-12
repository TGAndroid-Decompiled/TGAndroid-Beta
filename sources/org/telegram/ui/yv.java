package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_account;
public final class yv implements Utilities.Callback {
    public final int f44560a;
    public final vy f44561b;

    public yv(vy vyVar, int i10) {
        this.f44560a = i10;
        this.f44561b = vyVar;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f44560a) {
            case 0:
                vy vyVar = this.f44561b;
                vyVar.O1 = (Long) obj;
                vyVar.R4();
                return;
            default:
                vy.a0(this.f44561b, (TL_account.TL_birthday) obj);
                return;
        }
    }
}
