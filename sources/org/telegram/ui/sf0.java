package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class sf0 implements Runnable {
    public final int f37381a;
    public final zf0 f37382b;
    public final int f37383c;

    public sf0(zf0 zf0Var, int i10, int i11) {
        this.f37381a = i11;
        this.f37382b = zf0Var;
        this.f37383c = i10;
    }

    @Override
    public final void run() {
        switch (this.f37381a) {
            case 0:
                AndroidUtilities.runOnUIThread(new sf0(this.f37382b, this.f37383c, 1));
                return;
            case 1:
                this.f37382b.A(this.f37383c);
                return;
            default:
                this.f37382b.f40169f.f33120f[this.f37383c].l(1.0f);
                return;
        }
    }
}
