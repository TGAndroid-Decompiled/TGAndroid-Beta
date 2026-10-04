package org.telegram.ui;

import org.telegram.messenger.MessageObject;
public final class ui implements Runnable {
    public final boolean f41232a;
    public final boolean f41233b;
    public final int f41234c;
    public final boolean d;
    public final org.telegram.ui.Components.sk0 f41235e;
    public final float f41236f;
    public final float h;
    public final zg.o0 f41237n;
    public final MessageObject f41238r;
    public final yn f41239s;

    public ui(yn ynVar, boolean z10, boolean z11, int i10, boolean z12, org.telegram.ui.Components.sk0 sk0Var, float f7, float f10, zg.o0 o0Var, MessageObject messageObject) {
        this.f41239s = ynVar;
        this.f41232a = z10;
        this.f41233b = z11;
        this.f41234c = i10;
        this.d = z12;
        this.f41235e = sk0Var;
        this.f41236f = f7;
        this.h = f10;
        this.f41237n = o0Var;
        this.f41238r = messageObject;
    }

    @Override
    public final void run() {
        if (!this.f41232a) {
            yn ynVar = this.f41239s;
            if (ynVar.Zb != null) {
                ynVar.Zb = null;
                if (this.f41233b) {
                    ynVar.h8(new ti(this, this.f41234c, this.d, this.f41235e, this.f41236f, this.h, this.f41237n, 0));
                } else {
                    ynVar.h8(new oh(8, this, this.f41238r));
                }
                ynVar.A7(true);
            }
        }
    }
}
