package org.telegram.ui;

import org.telegram.messenger.MessageObject;
public final class wi implements Runnable {
    public final boolean f39235a;
    public final boolean f39236b;
    public final int f39237c;
    public final boolean d;
    public final org.telegram.ui.Components.fk0 e;
    public final float f39238f;
    public final float h;
    public final zg.p0 f39239n;
    public final MessageObject f39240r;
    public final bo f39241s;

    public wi(bo boVar, boolean z10, boolean z11, int i10, boolean z12, org.telegram.ui.Components.fk0 fk0Var, float f7, float f10, zg.p0 p0Var, MessageObject messageObject) {
        this.f39241s = boVar;
        this.f39235a = z10;
        this.f39236b = z11;
        this.f39237c = i10;
        this.d = z12;
        this.e = fk0Var;
        this.f39238f = f7;
        this.h = f10;
        this.f39239n = p0Var;
        this.f39240r = messageObject;
    }

    @Override
    public final void run() {
        if (!this.f39235a) {
            bo boVar = this.f39241s;
            if (boVar.f32257bc != null) {
                boVar.f32257bc = null;
                if (this.f39236b) {
                    boVar.h8(new vi(this, this.f39237c, this.d, this.e, this.f39238f, this.h, this.f39239n, 0));
                } else {
                    boVar.h8(new uh(4, this, this.f39240r));
                }
                boVar.A7(true);
            }
        }
    }
}
