package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class tf0 implements Runnable {
    public final int f37712a;
    public final ag0 f37713b;
    public final int f37714c;

    public tf0(ag0 ag0Var, int i10, int i11) {
        this.f37712a = i11;
        this.f37713b = ag0Var;
        this.f37714c = i10;
    }

    @Override
    public final void run() {
        switch (this.f37712a) {
            case 0:
                AndroidUtilities.runOnUIThread(new tf0(this.f37713b, this.f37714c, 1));
                return;
            case 1:
                this.f37713b.A(this.f37714c);
                return;
            default:
                this.f37713b.f32038f.f33074f[this.f37714c].l(1.0f);
                return;
        }
    }
}
