package org.telegram.ui;

import org.telegram.messenger.MessageObject;
public final class ti implements Runnable {
    public final boolean f38131a;
    public final boolean f38132b;
    public final int f38133c;
    public final boolean d;
    public final org.telegram.ui.Components.qk0 e;
    public final float f38134f;
    public final float h;
    public final zg.o0 f38135n;
    public final MessageObject f38136r;
    public final wn f38137s;

    public ti(wn wnVar, boolean z10, boolean z11, int i10, boolean z12, org.telegram.ui.Components.qk0 qk0Var, float f7, float f10, zg.o0 o0Var, MessageObject messageObject) {
        this.f38137s = wnVar;
        this.f38131a = z10;
        this.f38132b = z11;
        this.f38133c = i10;
        this.d = z12;
        this.e = qk0Var;
        this.f38134f = f7;
        this.h = f10;
        this.f38135n = o0Var;
        this.f38136r = messageObject;
    }

    @Override
    public final void run() {
        if (!this.f38131a) {
            wn wnVar = this.f38137s;
            if (wnVar.f39433bc != null) {
                wnVar.f39433bc = null;
                if (this.f38132b) {
                    wnVar.h8(new si(this, this.f38133c, this.d, this.e, this.f38134f, this.h, this.f38135n, 0));
                } else {
                    wnVar.h8(new fh(9, this, this.f38136r));
                }
                wnVar.A7(true);
            }
        }
    }
}
