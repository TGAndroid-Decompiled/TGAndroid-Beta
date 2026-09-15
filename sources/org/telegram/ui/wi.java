package org.telegram.ui;

import org.telegram.messenger.MessageObject;
public final class wi implements Runnable {
    public final boolean f39233a;
    public final boolean f39234b;
    public final int f39235c;
    public final boolean d;
    public final org.telegram.ui.Components.fk0 e;
    public final float f39236f;
    public final float h;
    public final zg.p0 f39237n;
    public final MessageObject f39238r;
    public final bo f39239s;

    public wi(bo boVar, boolean z10, boolean z11, int i10, boolean z12, org.telegram.ui.Components.fk0 fk0Var, float f7, float f10, zg.p0 p0Var, MessageObject messageObject) {
        this.f39239s = boVar;
        this.f39233a = z10;
        this.f39234b = z11;
        this.f39235c = i10;
        this.d = z12;
        this.e = fk0Var;
        this.f39236f = f7;
        this.h = f10;
        this.f39237n = p0Var;
        this.f39238r = messageObject;
    }

    @Override
    public final void run() {
        if (!this.f39233a) {
            bo boVar = this.f39239s;
            if (boVar.f32274cc != null) {
                boVar.f32274cc = null;
                if (this.f39234b) {
                    boVar.h8(new vi(this, this.f39235c, this.d, this.e, this.f39236f, this.h, this.f39237n, 0));
                } else {
                    boVar.h8(new uh(4, this, this.f39238r));
                }
                boVar.A7(true);
            }
        }
    }
}
