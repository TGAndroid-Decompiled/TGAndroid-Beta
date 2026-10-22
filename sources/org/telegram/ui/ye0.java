package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class ye0 implements Runnable {
    public final int f43476a;
    public final hf0 f43477b;
    public final int f43478c;

    public ye0(hf0 hf0Var, int i10, int i11) {
        this.f43476a = i11;
        this.f43477b = hf0Var;
        this.f43478c = i10;
    }

    @Override
    public final void run() {
        switch (this.f43476a) {
            case 0:
                AndroidUtilities.runOnUIThread(new ye0(this.f43477b, this.f43478c, 1));
                return;
            case 1:
                this.f43477b.A(this.f43478c);
                return;
            default:
                this.f43477b.f37604f.f40962f[this.f43478c].l(1.0f);
                return;
        }
    }
}
