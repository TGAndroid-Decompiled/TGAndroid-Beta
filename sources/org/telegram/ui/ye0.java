package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class ye0 implements Runnable {
    public final int f43473a;
    public final hf0 f43474b;
    public final int f43475c;

    public ye0(hf0 hf0Var, int i10, int i11) {
        this.f43473a = i11;
        this.f43474b = hf0Var;
        this.f43475c = i10;
    }

    @Override
    public final void run() {
        switch (this.f43473a) {
            case 0:
                AndroidUtilities.runOnUIThread(new ye0(this.f43474b, this.f43475c, 1));
                return;
            case 1:
                this.f43474b.A(this.f43475c);
                return;
            default:
                this.f43474b.f37600f.f40959f[this.f43475c].l(1.0f);
                return;
        }
    }
}
