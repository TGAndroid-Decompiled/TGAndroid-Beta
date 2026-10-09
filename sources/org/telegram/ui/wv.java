package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_account;
public final class wv implements Utilities.Callback {
    public final int f43758a;
    public final ty f43759b;

    public wv(ty tyVar, int i10) {
        this.f43758a = i10;
        this.f43759b = tyVar;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f43758a) {
            case 0:
                ty tyVar = this.f43759b;
                tyVar.O1 = (Long) obj;
                tyVar.R4();
                return;
            default:
                ty.a0(this.f43759b, (TL_account.TL_birthday) obj);
                return;
        }
    }
}
