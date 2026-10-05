package org.telegram.ui;

import org.telegram.messenger.MessageObject;
public final class ui implements Runnable {
    public final boolean f41276a;
    public final boolean f41277b;
    public final int f41278c;
    public final boolean d;
    public final org.telegram.ui.Components.sk0 f41279e;
    public final float f41280f;
    public final float h;
    public final zg.m0 f41281n;
    public final MessageObject f41282r;
    public final yn f41283s;

    public ui(yn ynVar, boolean z10, boolean z11, int i10, boolean z12, org.telegram.ui.Components.sk0 sk0Var, float f7, float f10, zg.m0 m0Var, MessageObject messageObject) {
        this.f41283s = ynVar;
        this.f41276a = z10;
        this.f41277b = z11;
        this.f41278c = i10;
        this.d = z12;
        this.f41279e = sk0Var;
        this.f41280f = f7;
        this.h = f10;
        this.f41281n = m0Var;
        this.f41282r = messageObject;
    }

    @Override
    public final void run() {
        if (!this.f41276a) {
            yn ynVar = this.f41283s;
            if (ynVar.Zb != null) {
                ynVar.Zb = null;
                if (this.f41277b) {
                    ynVar.h8(new ti(this, this.f41278c, this.d, this.f41279e, this.f41280f, this.h, this.f41281n, 0));
                } else {
                    ynVar.h8(new oh(8, this, this.f41282r));
                }
                ynVar.A7(true);
            }
        }
    }
}
