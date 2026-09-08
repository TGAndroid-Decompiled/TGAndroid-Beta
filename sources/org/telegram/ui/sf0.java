package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class sf0 implements Runnable {
    public final int f40461a;
    public final zf0 f40462b;
    public final int f40463c;

    public sf0(zf0 zf0Var, int i10, int i11) {
        this.f40461a = i11;
        this.f40462b = zf0Var;
        this.f40463c = i10;
    }

    @Override
    public final void run() {
        switch (this.f40461a) {
            case 0:
                AndroidUtilities.runOnUIThread(new sf0(this.f40462b, this.f40463c, 1));
                return;
            case 1:
                this.f40462b.A(this.f40463c);
                return;
            default:
                this.f40462b.f43432f.f36190f[this.f40463c].l(1.0f);
                return;
        }
    }
}
