package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_account;
public final class yv implements Utilities.Callback {
    public final int f44565a;
    public final vy f44566b;

    public yv(vy vyVar, int i10) {
        this.f44565a = i10;
        this.f44566b = vyVar;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f44565a) {
            case 0:
                vy vyVar = this.f44566b;
                vyVar.O1 = (Long) obj;
                vyVar.R4();
                return;
            default:
                vy.a0(this.f44566b, (TL_account.TL_birthday) obj);
                return;
        }
    }
}
