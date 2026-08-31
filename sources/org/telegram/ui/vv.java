package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_account;
public final class vv implements Utilities.Callback {
    public final int f42302a;
    public final py f42303b;

    public vv(py pyVar, int i10) {
        this.f42302a = i10;
        this.f42303b = pyVar;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f42302a) {
            case 0:
                py pyVar = this.f42303b;
                pyVar.L1 = (Long) obj;
                pyVar.U4();
                return;
            default:
                py.c0(this.f42303b, (TL_account.TL_birthday) obj);
                return;
        }
    }
}
