package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class uf0 implements Runnable {
    public final int f38065a;
    public final bg0 f38066b;
    public final int f38067c;

    public uf0(bg0 bg0Var, int i10, int i11) {
        this.f38065a = i11;
        this.f38066b = bg0Var;
        this.f38067c = i10;
    }

    @Override
    public final void run() {
        switch (this.f38065a) {
            case 0:
                AndroidUtilities.runOnUIThread(new uf0(this.f38066b, this.f38067c, 1));
                return;
            case 1:
                this.f38066b.A(this.f38067c);
                return;
            default:
                this.f38066b.f32137f.f33749f[this.f38067c].l(1.0f);
                return;
        }
    }
}
