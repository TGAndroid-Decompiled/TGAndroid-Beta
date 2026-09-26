package org.telegram.ui;

import org.telegram.messenger.MessageObject;
public final class ti implements Runnable {
    public final boolean f38130a;
    public final boolean f38131b;
    public final int f38132c;
    public final boolean d;
    public final org.telegram.ui.Components.rk0 e;
    public final float f38133f;
    public final float h;
    public final zg.o0 f38134n;
    public final MessageObject f38135r;
    public final wn f38136s;

    public ti(wn wnVar, boolean z10, boolean z11, int i10, boolean z12, org.telegram.ui.Components.rk0 rk0Var, float f7, float f10, zg.o0 o0Var, MessageObject messageObject) {
        this.f38136s = wnVar;
        this.f38130a = z10;
        this.f38131b = z11;
        this.f38132c = i10;
        this.d = z12;
        this.e = rk0Var;
        this.f38133f = f7;
        this.h = f10;
        this.f38134n = o0Var;
        this.f38135r = messageObject;
    }

    @Override
    public final void run() {
        if (!this.f38130a) {
            wn wnVar = this.f38136s;
            if (wnVar.f39432bc != null) {
                wnVar.f39432bc = null;
                if (this.f38131b) {
                    wnVar.h8(new si(this, this.f38132c, this.d, this.e, this.f38133f, this.h, this.f38134n, 0));
                } else {
                    wnVar.h8(new fh(9, this, this.f38135r));
                }
                wnVar.A7(true);
            }
        }
    }
}
