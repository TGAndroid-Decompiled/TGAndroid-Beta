package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_account;
public final class uv implements Utilities.Callback {
    public final int f38561a;
    public final qy f38562b;

    public uv(qy qyVar, int i10) {
        this.f38561a = i10;
        this.f38562b = qyVar;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f38561a) {
            case 0:
                qy qyVar = this.f38562b;
                qyVar.O1 = (Long) obj;
                qyVar.U4();
                return;
            default:
                qy.c0(this.f38562b, (TL_account.TL_birthday) obj);
                return;
        }
    }
}
