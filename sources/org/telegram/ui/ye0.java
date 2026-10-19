package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class ye0 implements Runnable {
    public final int f43463a;
    public final gf0 f43464b;
    public final int f43465c;

    public ye0(gf0 gf0Var, int i10, int i11) {
        this.f43463a = i11;
        this.f43464b = gf0Var;
        this.f43465c = i10;
    }

    @Override
    public final void run() {
        switch (this.f43463a) {
            case 0:
                AndroidUtilities.runOnUIThread(new ye0(this.f43464b, this.f43465c, 1));
                return;
            case 1:
                this.f43464b.A(this.f43465c);
                return;
            default:
                this.f43464b.f37319f.f40961f[this.f43465c].l(1.0f);
                return;
        }
    }
}
