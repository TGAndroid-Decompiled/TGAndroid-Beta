package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class sf0 implements Runnable {
    public final int f40434a;
    public final zf0 f40435b;
    public final int f40436c;

    public sf0(zf0 zf0Var, int i10, int i11) {
        this.f40434a = i11;
        this.f40435b = zf0Var;
        this.f40436c = i10;
    }

    @Override
    public final void run() {
        switch (this.f40434a) {
            case 0:
                AndroidUtilities.runOnUIThread(new sf0(this.f40435b, this.f40436c, 1));
                return;
            case 1:
                this.f40435b.A(this.f40436c);
                return;
            default:
                this.f40435b.f43405f.f36163f[this.f40436c].l(1.0f);
                return;
        }
    }
}
