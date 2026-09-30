package org.telegram.ui;

import org.telegram.messenger.MessageObject;
public final class ti implements Runnable {
    public final boolean f38241a;
    public final boolean f38242b;
    public final int f38243c;
    public final boolean d;
    public final org.telegram.ui.Components.tk0 e;
    public final float f38244f;
    public final float h;
    public final zg.o0 f38245n;
    public final MessageObject f38246r;
    public final wn f38247s;

    public ti(wn wnVar, boolean z10, boolean z11, int i10, boolean z12, org.telegram.ui.Components.tk0 tk0Var, float f7, float f10, zg.o0 o0Var, MessageObject messageObject) {
        this.f38247s = wnVar;
        this.f38241a = z10;
        this.f38242b = z11;
        this.f38243c = i10;
        this.d = z12;
        this.e = tk0Var;
        this.f38244f = f7;
        this.h = f10;
        this.f38245n = o0Var;
        this.f38246r = messageObject;
    }

    @Override
    public final void run() {
        if (!this.f38241a) {
            wn wnVar = this.f38247s;
            if (wnVar.f39526bc != null) {
                wnVar.f39526bc = null;
                if (this.f38242b) {
                    wnVar.h8(new si(this, this.f38243c, this.d, this.e, this.f38244f, this.h, this.f38245n, 0));
                } else {
                    wnVar.h8(new fh(9, this, this.f38246r));
                }
                wnVar.A7(true);
            }
        }
    }
}
