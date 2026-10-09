package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class rf0 implements Runnable {
    public final int f41408a;
    public final zf0 f41409b;
    public final int f41410c;

    public rf0(zf0 zf0Var, int i10, int i11) {
        this.f41408a = i11;
        this.f41409b = zf0Var;
        this.f41410c = i10;
    }

    @Override
    public final void run() {
        switch (this.f41408a) {
            case 0:
                AndroidUtilities.runOnUIThread(new rf0(this.f41409b, this.f41410c, 1));
                return;
            case 1:
                this.f41409b.A(this.f41410c);
                return;
            default:
                this.f41409b.f44596f.f36734f[this.f41410c].l(1.0f);
                return;
        }
    }
}
