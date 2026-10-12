package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class sf0 implements Runnable {
    public final int f41916a;
    public final zf0 f41917b;
    public final int f41918c;

    public sf0(zf0 zf0Var, int i10, int i11) {
        this.f41916a = i11;
        this.f41917b = zf0Var;
        this.f41918c = i10;
    }

    @Override
    public final void run() {
        switch (this.f41916a) {
            case 0:
                AndroidUtilities.runOnUIThread(new sf0(this.f41917b, this.f41918c, 1));
                return;
            case 1:
                this.f41917b.A(this.f41918c);
                return;
            default:
                this.f41917b.f44822f.f37834f[this.f41918c].l(1.0f);
                return;
        }
    }
}
