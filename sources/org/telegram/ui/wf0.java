package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class wf0 implements Runnable {
    public final int f41275a;
    public final dg0 f41276b;
    public final int f41277c;

    public wf0(dg0 dg0Var, int i10, int i11) {
        this.f41275a = i11;
        this.f41276b = dg0Var;
        this.f41277c = i10;
    }

    @Override
    public final void run() {
        switch (this.f41275a) {
            case 0:
                AndroidUtilities.runOnUIThread(new wf0(this.f41276b, this.f41277c, 1));
                return;
            case 1:
                this.f41276b.A(this.f41277c);
                return;
            default:
                this.f41276b.f34994f.f36645f[this.f41277c].l(1.0f);
                return;
        }
    }
}
