package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class uf0 implements Runnable {
    public final int f38070a;
    public final bg0 f38071b;
    public final int f38072c;

    public uf0(bg0 bg0Var, int i10, int i11) {
        this.f38070a = i11;
        this.f38071b = bg0Var;
        this.f38072c = i10;
    }

    @Override
    public final void run() {
        switch (this.f38070a) {
            case 0:
                AndroidUtilities.runOnUIThread(new uf0(this.f38071b, this.f38072c, 1));
                return;
            case 1:
                this.f38071b.A(this.f38072c);
                return;
            default:
                this.f38071b.f32141f.f33753f[this.f38072c].l(1.0f);
                return;
        }
    }
}
