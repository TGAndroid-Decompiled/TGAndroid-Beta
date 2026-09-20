package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class uf0 implements Runnable {
    public final int f38081a;
    public final bg0 f38082b;
    public final int f38083c;

    public uf0(bg0 bg0Var, int i10, int i11) {
        this.f38081a = i11;
        this.f38082b = bg0Var;
        this.f38083c = i10;
    }

    @Override
    public final void run() {
        switch (this.f38081a) {
            case 0:
                AndroidUtilities.runOnUIThread(new uf0(this.f38082b, this.f38083c, 1));
                return;
            case 1:
                this.f38082b.A(this.f38083c);
                return;
            default:
                this.f38082b.f32420f.f33125f[this.f38083c].l(1.0f);
                return;
        }
    }
}
