package org.telegram.ui;

import org.telegram.messenger.MessageObject;
public final class ui implements Runnable {
    public final boolean f41239a;
    public final boolean f41240b;
    public final int f41241c;
    public final boolean d;
    public final org.telegram.ui.Components.sk0 f41242e;
    public final float f41243f;
    public final float h;
    public final zg.o0 f41244n;
    public final MessageObject f41245r;
    public final yn f41246s;

    public ui(yn ynVar, boolean z10, boolean z11, int i10, boolean z12, org.telegram.ui.Components.sk0 sk0Var, float f7, float f10, zg.o0 o0Var, MessageObject messageObject) {
        this.f41246s = ynVar;
        this.f41239a = z10;
        this.f41240b = z11;
        this.f41241c = i10;
        this.d = z12;
        this.f41242e = sk0Var;
        this.f41243f = f7;
        this.h = f10;
        this.f41244n = o0Var;
        this.f41245r = messageObject;
    }

    @Override
    public final void run() {
        if (!this.f41239a) {
            yn ynVar = this.f41246s;
            if (ynVar.Zb != null) {
                ynVar.Zb = null;
                if (this.f41240b) {
                    ynVar.h8(new ti(this, this.f41241c, this.d, this.f41242e, this.f41243f, this.h, this.f41244n, 0));
                } else {
                    ynVar.h8(new oh(8, this, this.f41245r));
                }
                ynVar.A7(true);
            }
        }
    }
}
