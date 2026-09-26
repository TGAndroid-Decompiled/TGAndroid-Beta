package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_account;
public final class uv implements Utilities.Callback {
    public final int f38559a;
    public final qy f38560b;

    public uv(qy qyVar, int i10) {
        this.f38559a = i10;
        this.f38560b = qyVar;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f38559a) {
            case 0:
                qy qyVar = this.f38560b;
                qyVar.O1 = (Long) obj;
                qyVar.U4();
                return;
            default:
                qy.c0(this.f38560b, (TL_account.TL_birthday) obj);
                return;
        }
    }
}
