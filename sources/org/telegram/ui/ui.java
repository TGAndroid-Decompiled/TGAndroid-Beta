package org.telegram.ui;

import org.telegram.messenger.MessageObject;
public final class ui implements Runnable {
    public final boolean f41231a;
    public final boolean f41232b;
    public final int f41233c;
    public final boolean d;
    public final org.telegram.ui.Components.sk0 f41234e;
    public final float f41235f;
    public final float h;
    public final zg.o0 f41236n;
    public final MessageObject f41237r;
    public final yn f41238s;

    public ui(yn ynVar, boolean z10, boolean z11, int i10, boolean z12, org.telegram.ui.Components.sk0 sk0Var, float f7, float f10, zg.o0 o0Var, MessageObject messageObject) {
        this.f41238s = ynVar;
        this.f41231a = z10;
        this.f41232b = z11;
        this.f41233c = i10;
        this.d = z12;
        this.f41234e = sk0Var;
        this.f41235f = f7;
        this.h = f10;
        this.f41236n = o0Var;
        this.f41237r = messageObject;
    }

    @Override
    public final void run() {
        if (!this.f41231a) {
            yn ynVar = this.f41238s;
            if (ynVar.Zb != null) {
                ynVar.Zb = null;
                if (this.f41232b) {
                    ynVar.h8(new ti(this, this.f41233c, this.d, this.f41234e, this.f41235f, this.h, this.f41236n, 0));
                } else {
                    ynVar.h8(new oh(8, this, this.f41237r));
                }
                ynVar.A7(true);
            }
        }
    }
}
