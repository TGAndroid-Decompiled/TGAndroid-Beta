package org.telegram.ui;

import org.telegram.messenger.MessageObject;
public final class vi implements Runnable {
    public final boolean f38561a;
    public final boolean f38562b;
    public final int f38563c;
    public final boolean d;
    public final org.telegram.ui.Components.qk0 e;
    public final float f38564f;
    public final float h;
    public final zg.o0 f38565n;
    public final MessageObject f38566r;
    public final zn f38567s;

    public vi(zn znVar, boolean z10, boolean z11, int i10, boolean z12, org.telegram.ui.Components.qk0 qk0Var, float f7, float f10, zg.o0 o0Var, MessageObject messageObject) {
        this.f38567s = znVar;
        this.f38561a = z10;
        this.f38562b = z11;
        this.f38563c = i10;
        this.d = z12;
        this.e = qk0Var;
        this.f38564f = f7;
        this.h = f10;
        this.f38565n = o0Var;
        this.f38566r = messageObject;
    }

    @Override
    public final void run() {
        if (!this.f38561a) {
            zn znVar = this.f38567s;
            if (znVar.f40225bc != null) {
                znVar.f40225bc = null;
                if (this.f38562b) {
                    znVar.h8(new ui(this, this.f38563c, this.d, this.e, this.f38564f, this.h, this.f38565n, 0));
                } else {
                    znVar.h8(new qh(8, this, this.f38566r));
                }
                znVar.A7(true);
            }
        }
    }
}
