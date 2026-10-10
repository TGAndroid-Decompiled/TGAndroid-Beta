package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class rf0 implements Runnable {
    public final int f41452a;
    public final zf0 f41453b;
    public final int f41454c;

    public rf0(zf0 zf0Var, int i10, int i11) {
        this.f41452a = i11;
        this.f41453b = zf0Var;
        this.f41454c = i10;
    }

    @Override
    public final void run() {
        switch (this.f41452a) {
            case 0:
                AndroidUtilities.runOnUIThread(new rf0(this.f41453b, this.f41454c, 1));
                return;
            case 1:
                this.f41453b.A(this.f41454c);
                return;
            default:
                this.f41453b.f44640f.f36778f[this.f41454c].l(1.0f);
                return;
        }
    }
}
