package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class sf0 implements Runnable {
    public final int f40462a;
    public final zf0 f40463b;
    public final int f40464c;

    public sf0(zf0 zf0Var, int i10, int i11) {
        this.f40462a = i11;
        this.f40463b = zf0Var;
        this.f40464c = i10;
    }

    @Override
    public final void run() {
        switch (this.f40462a) {
            case 0:
                AndroidUtilities.runOnUIThread(new sf0(this.f40463b, this.f40464c, 1));
                return;
            case 1:
                this.f40463b.A(this.f40464c);
                return;
            default:
                this.f40463b.f43433f.f36191f[this.f40464c].l(1.0f);
                return;
        }
    }
}
