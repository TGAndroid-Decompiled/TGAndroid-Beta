package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class rf0 implements Runnable {
    public final int f41406a;
    public final zf0 f41407b;
    public final int f41408c;

    public rf0(zf0 zf0Var, int i10, int i11) {
        this.f41406a = i11;
        this.f41407b = zf0Var;
        this.f41408c = i10;
    }

    @Override
    public final void run() {
        switch (this.f41406a) {
            case 0:
                AndroidUtilities.runOnUIThread(new rf0(this.f41407b, this.f41408c, 1));
                return;
            case 1:
                this.f41407b.A(this.f41408c);
                return;
            default:
                this.f41407b.f44594f.f36732f[this.f41408c].l(1.0f);
                return;
        }
    }
}
