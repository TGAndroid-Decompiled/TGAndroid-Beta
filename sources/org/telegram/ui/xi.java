package org.telegram.ui;

import org.telegram.messenger.MessageObject;
public final class xi implements Runnable {
    public final boolean f39645a;
    public final boolean f39646b;
    public final int f39647c;
    public final boolean d;
    public final org.telegram.ui.Components.gk0 e;
    public final float f39648f;
    public final float h;
    public final zg.p0 f39649n;
    public final MessageObject f39650r;
    public final bo f39651s;

    public xi(bo boVar, boolean z10, boolean z11, int i10, boolean z12, org.telegram.ui.Components.gk0 gk0Var, float f7, float f10, zg.p0 p0Var, MessageObject messageObject) {
        this.f39651s = boVar;
        this.f39645a = z10;
        this.f39646b = z11;
        this.f39647c = i10;
        this.d = z12;
        this.e = gk0Var;
        this.f39648f = f7;
        this.h = f10;
        this.f39649n = p0Var;
        this.f39650r = messageObject;
    }

    @Override
    public final void run() {
        if (!this.f39645a) {
            bo boVar = this.f39651s;
            if (boVar.f32252cc != null) {
                boVar.f32252cc = null;
                if (this.f39646b) {
                    boVar.h8(new wi(this, this.f39647c, this.d, this.e, this.f39648f, this.h, this.f39649n, 0));
                } else {
                    boVar.h8(new wh(4, this, this.f39650r));
                }
                boVar.A7(true);
            }
        }
    }
}
