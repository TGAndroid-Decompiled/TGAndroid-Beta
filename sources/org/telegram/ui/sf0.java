package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class sf0 implements Runnable {
    public final int f37387a;
    public final zf0 f37388b;
    public final int f37389c;

    public sf0(zf0 zf0Var, int i10, int i11) {
        this.f37387a = i11;
        this.f37388b = zf0Var;
        this.f37389c = i10;
    }

    @Override
    public final void run() {
        switch (this.f37387a) {
            case 0:
                AndroidUtilities.runOnUIThread(new sf0(this.f37388b, this.f37389c, 1));
                return;
            case 1:
                this.f37388b.A(this.f37389c);
                return;
            default:
                this.f37388b.f40175f.f33081f[this.f37389c].l(1.0f);
                return;
        }
    }
}
