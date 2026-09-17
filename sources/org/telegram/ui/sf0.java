package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class sf0 implements Runnable {
    public final int f40435a;
    public final zf0 f40436b;
    public final int f40437c;

    public sf0(zf0 zf0Var, int i10, int i11) {
        this.f40435a = i11;
        this.f40436b = zf0Var;
        this.f40437c = i10;
    }

    @Override
    public final void run() {
        switch (this.f40435a) {
            case 0:
                AndroidUtilities.runOnUIThread(new sf0(this.f40436b, this.f40437c, 1));
                return;
            case 1:
                this.f40436b.A(this.f40437c);
                return;
            default:
                this.f40436b.f43406f.f36164f[this.f40437c].l(1.0f);
                return;
        }
    }
}
