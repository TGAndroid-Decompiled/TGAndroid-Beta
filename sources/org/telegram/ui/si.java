package org.telegram.ui;

import org.telegram.messenger.MessageObject;
public final class si implements Runnable {
    public final boolean f41293a;
    public final boolean f41294b;
    public final int f41295c;
    public final boolean d;
    public final org.telegram.ui.Components.rk0 f41296e;
    public final float f41297f;
    public final float h;
    public final ng.q0 f41298n;
    public final MessageObject f41299r;
    public final xn f41300s;

    public si(xn xnVar, boolean z4, boolean z10, int i10, boolean z11, org.telegram.ui.Components.rk0 rk0Var, float f10, float f11, ng.q0 q0Var, MessageObject messageObject) {
        this.f41300s = xnVar;
        this.f41293a = z4;
        this.f41294b = z10;
        this.f41295c = i10;
        this.d = z11;
        this.f41296e = rk0Var;
        this.f41297f = f10;
        this.h = f11;
        this.f41298n = q0Var;
        this.f41299r = messageObject;
    }

    @Override
    public final void run() {
        if (!this.f41293a) {
            xn xnVar = this.f41300s;
            if (xnVar.Zb != null) {
                xnVar.Zb = null;
                if (this.f41294b) {
                    xnVar.h8(new ri(this, this.f41295c, this.d, this.f41296e, this.f41297f, this.h, this.f41298n, 0));
                } else {
                    xnVar.h8(new fc(21, this, this.f41299r));
                }
                xnVar.A7(true);
            }
        }
    }
}
