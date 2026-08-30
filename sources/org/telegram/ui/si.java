package org.telegram.ui;

import org.telegram.messenger.MessageObject;
public final class si implements Runnable {
    public final boolean f38343a;
    public final boolean f38344b;
    public final int f38345c;
    public final boolean d;
    public final org.telegram.ui.Components.pk0 e;
    public final float f38346f;
    public final float h;
    public final mg.q0 f38347n;
    public final MessageObject f38348r;
    public final xn f38349s;

    public si(xn xnVar, boolean z4, boolean z10, int i10, boolean z11, org.telegram.ui.Components.pk0 pk0Var, float f10, float f11, mg.q0 q0Var, MessageObject messageObject) {
        this.f38349s = xnVar;
        this.f38343a = z4;
        this.f38344b = z10;
        this.f38345c = i10;
        this.d = z11;
        this.e = pk0Var;
        this.f38346f = f10;
        this.h = f11;
        this.f38347n = q0Var;
        this.f38348r = messageObject;
    }

    @Override
    public final void run() {
        if (!this.f38343a) {
            xn xnVar = this.f38349s;
            if (xnVar.Zb != null) {
                xnVar.Zb = null;
                if (this.f38344b) {
                    xnVar.h8(new ri(this, this.f38345c, this.d, this.e, this.f38346f, this.h, this.f38347n, 0));
                } else {
                    xnVar.h8(new yb(22, this, this.f38348r));
                }
                xnVar.A7(true);
            }
        }
    }
}
