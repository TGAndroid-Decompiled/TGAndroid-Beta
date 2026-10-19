package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class ye0 implements Runnable {
    public final int f43467a;
    public final hf0 f43468b;
    public final int f43469c;

    public ye0(hf0 hf0Var, int i10, int i11) {
        this.f43467a = i11;
        this.f43468b = hf0Var;
        this.f43469c = i10;
    }

    @Override
    public final void run() {
        switch (this.f43467a) {
            case 0:
                AndroidUtilities.runOnUIThread(new ye0(this.f43468b, this.f43469c, 1));
                return;
            case 1:
                this.f43468b.A(this.f43469c);
                return;
            default:
                this.f43468b.f37594f.f40953f[this.f43469c].l(1.0f);
                return;
        }
    }
}
