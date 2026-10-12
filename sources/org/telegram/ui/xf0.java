package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class xf0 implements Runnable {
    public final int f41850a;
    public final eg0 f41851b;
    public final int f41852c;

    public xf0(eg0 eg0Var, int i10, int i11) {
        this.f41850a = i11;
        this.f41851b = eg0Var;
        this.f41852c = i10;
    }

    @Override
    public final void run() {
        switch (this.f41850a) {
            case 0:
                AndroidUtilities.runOnUIThread(new xf0(this.f41851b, this.f41852c, 1));
                return;
            case 1:
                this.f41851b.A(this.f41852c);
                return;
            default:
                this.f41851b.f35550f.f36949f[this.f41852c].l(1.0f);
                return;
        }
    }
}
