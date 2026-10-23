package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class ye0 implements Runnable {
    public final int f43477a;
    public final hf0 f43478b;
    public final int f43479c;

    public ye0(hf0 hf0Var, int i10, int i11) {
        this.f43477a = i11;
        this.f43478b = hf0Var;
        this.f43479c = i10;
    }

    @Override
    public final void run() {
        switch (this.f43477a) {
            case 0:
                AndroidUtilities.runOnUIThread(new ye0(this.f43478b, this.f43479c, 1));
                return;
            case 1:
                this.f43478b.A(this.f43479c);
                return;
            default:
                this.f43478b.f37605f.f40963f[this.f43479c].l(1.0f);
                return;
        }
    }
}
