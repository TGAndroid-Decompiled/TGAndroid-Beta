package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class sf0 implements Runnable {
    public final int f36669a;
    public final zf0 f36670b;
    public final int f36671c;

    public sf0(zf0 zf0Var, int i10, int i11) {
        this.f36669a = i11;
        this.f36670b = zf0Var;
        this.f36671c = i10;
    }

    @Override
    public final void run() {
        switch (this.f36669a) {
            case 0:
                AndroidUtilities.runOnUIThread(new sf0(this.f36670b, this.f36671c, 1));
                return;
            case 1:
                this.f36670b.A(this.f36671c);
                return;
            default:
                this.f36670b.f39289f.f32906f[this.f36671c].l(1.0f);
                return;
        }
    }
}
