package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_account;
public final class wv implements Utilities.Callback {
    public final int f43804a;
    public final ty f43805b;

    public wv(ty tyVar, int i10) {
        this.f43804a = i10;
        this.f43805b = tyVar;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f43804a) {
            case 0:
                ty tyVar = this.f43805b;
                tyVar.O1 = (Long) obj;
                tyVar.R4();
                return;
            default:
                ty.a0(this.f43805b, (TL_account.TL_birthday) obj);
                return;
        }
    }
}
