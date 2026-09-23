package org.telegram.ui;

import org.telegram.messenger.MessageObject;
public final class ti implements Runnable {
    public final boolean f37691a;
    public final boolean f37692b;
    public final int f37693c;
    public final boolean d;
    public final org.telegram.ui.Components.gk0 e;
    public final float f37694f;
    public final float h;
    public final zg.p0 f37695n;
    public final MessageObject f37696r;
    public final xn f37697s;

    public ti(xn xnVar, boolean z10, boolean z11, int i10, boolean z12, org.telegram.ui.Components.gk0 gk0Var, float f7, float f10, zg.p0 p0Var, MessageObject messageObject) {
        this.f37697s = xnVar;
        this.f37691a = z10;
        this.f37692b = z11;
        this.f37693c = i10;
        this.d = z12;
        this.e = gk0Var;
        this.f37694f = f7;
        this.h = f10;
        this.f37695n = p0Var;
        this.f37696r = messageObject;
    }

    @Override
    public final void run() {
        if (!this.f37691a) {
            xn xnVar = this.f37697s;
            if (xnVar.f39334bc != null) {
                xnVar.f39334bc = null;
                if (this.f37692b) {
                    xnVar.h8(new si(this, this.f37693c, this.d, this.e, this.f37694f, this.h, this.f37695n, 0));
                } else {
                    xnVar.h8(new rh(4, this, this.f37696r));
                }
                xnVar.A7(true);
            }
        }
    }
}
