package org.telegram.ui;

import org.telegram.messenger.MessageObject;
public final class si implements Runnable {
    public final boolean f41246a;
    public final boolean f41247b;
    public final int f41248c;
    public final boolean d;
    public final org.telegram.ui.Components.qk0 f41249e;
    public final float f41250f;
    public final float h;
    public final ng.q0 f41251n;
    public final MessageObject f41252r;
    public final xn f41253s;

    public si(xn xnVar, boolean z4, boolean z10, int i10, boolean z11, org.telegram.ui.Components.qk0 qk0Var, float f10, float f11, ng.q0 q0Var, MessageObject messageObject) {
        this.f41253s = xnVar;
        this.f41246a = z4;
        this.f41247b = z10;
        this.f41248c = i10;
        this.d = z11;
        this.f41249e = qk0Var;
        this.f41250f = f10;
        this.h = f11;
        this.f41251n = q0Var;
        this.f41252r = messageObject;
    }

    @Override
    public final void run() {
        if (!this.f41246a) {
            xn xnVar = this.f41253s;
            if (xnVar.Zb != null) {
                xnVar.Zb = null;
                if (this.f41247b) {
                    xnVar.h8(new ri(this, this.f41248c, this.d, this.f41249e, this.f41250f, this.h, this.f41251n, 0));
                } else {
                    xnVar.h8(new xc(20, this, this.f41252r));
                }
                xnVar.A7(true);
            }
        }
    }
}
