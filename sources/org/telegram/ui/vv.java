package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_account;
public final class vv implements Utilities.Callback {
    public final int f42214a;
    public final py f42215b;

    public vv(py pyVar, int i10) {
        this.f42214a = i10;
        this.f42215b = pyVar;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f42214a) {
            case 0:
                py pyVar = this.f42215b;
                pyVar.L1 = (Long) obj;
                pyVar.U4();
                return;
            default:
                py.c0(this.f42215b, (TL_account.TL_birthday) obj);
                return;
        }
    }
}
