package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class uf0 implements Runnable {
    public final int f38082a;
    public final bg0 f38083b;
    public final int f38084c;

    public uf0(bg0 bg0Var, int i10, int i11) {
        this.f38082a = i11;
        this.f38083b = bg0Var;
        this.f38084c = i10;
    }

    @Override
    public final void run() {
        switch (this.f38082a) {
            case 0:
                AndroidUtilities.runOnUIThread(new uf0(this.f38083b, this.f38084c, 1));
                return;
            case 1:
                this.f38083b.A(this.f38084c);
                return;
            default:
                this.f38083b.f32438f.f33145f[this.f38084c].l(1.0f);
                return;
        }
    }
}
