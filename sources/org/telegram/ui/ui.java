package org.telegram.ui;

import org.telegram.messenger.MessageObject;
public final class ui implements Runnable {
    public final boolean f38818a;
    public final boolean f38819b;
    public final int f38820c;
    public final boolean d;
    public final org.telegram.ui.Components.pk0 e;
    public final float f38821f;
    public final float h;
    public final mg.q0 f38822n;
    public final MessageObject f38823r;
    public final zn f38824s;

    public ui(zn znVar, boolean z4, boolean z10, int i10, boolean z11, org.telegram.ui.Components.pk0 pk0Var, float f10, float f11, mg.q0 q0Var, MessageObject messageObject) {
        this.f38824s = znVar;
        this.f38818a = z4;
        this.f38819b = z10;
        this.f38820c = i10;
        this.d = z11;
        this.e = pk0Var;
        this.f38821f = f10;
        this.h = f11;
        this.f38822n = q0Var;
        this.f38823r = messageObject;
    }

    @Override
    public final void run() {
        if (!this.f38818a) {
            zn znVar = this.f38824s;
            if (znVar.Zb != null) {
                znVar.Zb = null;
                if (this.f38819b) {
                    znVar.h8(new ti(this, this.f38820c, this.d, this.e, this.f38821f, this.h, this.f38822n, 0));
                } else {
                    znVar.h8(new hc(21, this, this.f38823r));
                }
                znVar.A7(true);
            }
        }
    }
}
