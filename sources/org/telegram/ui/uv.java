package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_account;
public final class uv implements Utilities.Callback {
    public final int f39006a;
    public final oy f39007b;

    public uv(oy oyVar, int i10) {
        this.f39006a = i10;
        this.f39007b = oyVar;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f39006a) {
            case 0:
                oy oyVar = this.f39007b;
                oyVar.L1 = (Long) obj;
                oyVar.U4();
                return;
            default:
                oy.c0(this.f39007b, (TL_account.TL_birthday) obj);
                return;
        }
    }
}
