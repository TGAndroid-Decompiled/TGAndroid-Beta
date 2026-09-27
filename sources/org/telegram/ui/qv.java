package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_account;
public final class qv implements Utilities.Callback {
    public final int f36913a;
    public final ty f36914b;

    public qv(ty tyVar, int i10) {
        this.f36913a = i10;
        this.f36914b = tyVar;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f36913a) {
            case 0:
                ty tyVar = this.f36914b;
                tyVar.O1 = (Long) obj;
                tyVar.d5();
                return;
            default:
                ty.c0(this.f36914b, (TL_account.TL_birthday) obj);
                return;
        }
    }
}
