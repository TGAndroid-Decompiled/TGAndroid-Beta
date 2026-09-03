package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_account;
public final class wv implements Utilities.Callback {
    public final int f39774a;
    public final qy f39775b;

    public wv(qy qyVar, int i10) {
        this.f39774a = i10;
        this.f39775b = qyVar;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f39774a) {
            case 0:
                qy qyVar = this.f39775b;
                qyVar.L1 = (Long) obj;
                qyVar.U4();
                return;
            default:
                qy.c0(this.f39775b, (TL_account.TL_birthday) obj);
                return;
        }
    }
}
