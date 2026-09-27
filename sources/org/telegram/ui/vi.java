package org.telegram.ui;

import org.telegram.messenger.MessageObject;
public final class vi implements Runnable {
    public final boolean f38613a;
    public final boolean f38614b;
    public final int f38615c;
    public final boolean d;
    public final org.telegram.ui.Components.sk0 e;
    public final float f38616f;
    public final float h;
    public final zg.p0 f38617n;
    public final MessageObject f38618r;
    public final xn f38619s;

    public vi(xn xnVar, boolean z10, boolean z11, int i10, boolean z12, org.telegram.ui.Components.sk0 sk0Var, float f7, float f10, zg.p0 p0Var, MessageObject messageObject) {
        this.f38619s = xnVar;
        this.f38613a = z10;
        this.f38614b = z11;
        this.f38615c = i10;
        this.d = z12;
        this.e = sk0Var;
        this.f38616f = f7;
        this.h = f10;
        this.f38617n = p0Var;
        this.f38618r = messageObject;
    }

    @Override
    public final void run() {
        if (!this.f38613a) {
            xn xnVar = this.f38619s;
            if (xnVar.f39714bc != null) {
                xnVar.f39714bc = null;
                if (this.f38614b) {
                    xnVar.h8(new ui(this, this.f38615c, this.d, this.e, this.f38616f, this.h, this.f38617n, 0));
                } else {
                    xnVar.h8(new qh(7, this, this.f38618r));
                }
                xnVar.A7(true);
            }
        }
    }
}
