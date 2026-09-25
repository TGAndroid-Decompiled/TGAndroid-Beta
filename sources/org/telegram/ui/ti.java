package org.telegram.ui;

import org.telegram.messenger.MessageObject;
public final class ti implements Runnable {
    public final boolean f38132a;
    public final boolean f38133b;
    public final int f38134c;
    public final boolean d;
    public final org.telegram.ui.Components.qk0 e;
    public final float f38135f;
    public final float h;
    public final zg.o0 f38136n;
    public final MessageObject f38137r;
    public final wn f38138s;

    public ti(wn wnVar, boolean z10, boolean z11, int i10, boolean z12, org.telegram.ui.Components.qk0 qk0Var, float f7, float f10, zg.o0 o0Var, MessageObject messageObject) {
        this.f38138s = wnVar;
        this.f38132a = z10;
        this.f38133b = z11;
        this.f38134c = i10;
        this.d = z12;
        this.e = qk0Var;
        this.f38135f = f7;
        this.h = f10;
        this.f38136n = o0Var;
        this.f38137r = messageObject;
    }

    @Override
    public final void run() {
        if (!this.f38132a) {
            wn wnVar = this.f38138s;
            if (wnVar.f39434bc != null) {
                wnVar.f39434bc = null;
                if (this.f38133b) {
                    wnVar.h8(new si(this, this.f38134c, this.d, this.e, this.f38135f, this.h, this.f38136n, 0));
                } else {
                    wnVar.h8(new fh(9, this, this.f38137r));
                }
                wnVar.A7(true);
            }
        }
    }
}
