package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class sf0 implements Runnable {
    public final int f41912a;
    public final zf0 f41913b;
    public final int f41914c;

    public sf0(zf0 zf0Var, int i10, int i11) {
        this.f41912a = i11;
        this.f41913b = zf0Var;
        this.f41914c = i10;
    }

    @Override
    public final void run() {
        switch (this.f41912a) {
            case 0:
                AndroidUtilities.runOnUIThread(new sf0(this.f41913b, this.f41914c, 1));
                return;
            case 1:
                this.f41913b.A(this.f41914c);
                return;
            default:
                this.f41913b.f44817f.f37837f[this.f41914c].l(1.0f);
                return;
        }
    }
}
