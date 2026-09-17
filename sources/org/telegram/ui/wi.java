package org.telegram.ui;

import org.telegram.messenger.MessageObject;
public final class wi implements Runnable {
    public final boolean f42401a;
    public final boolean f42402b;
    public final int f42403c;
    public final boolean d;
    public final org.telegram.ui.Components.fk0 f42404e;
    public final float f42405f;
    public final float h;
    public final ah.j1 f42406n;
    public final MessageObject f42407r;
    public final co f42408s;

    public wi(co coVar, boolean z10, boolean z11, int i10, boolean z12, org.telegram.ui.Components.fk0 fk0Var, float f7, float f10, ah.j1 j1Var, MessageObject messageObject) {
        this.f42408s = coVar;
        this.f42401a = z10;
        this.f42402b = z11;
        this.f42403c = i10;
        this.d = z12;
        this.f42404e = fk0Var;
        this.f42405f = f7;
        this.h = f10;
        this.f42406n = j1Var;
        this.f42407r = messageObject;
    }

    @Override
    public final void run() {
        if (!this.f42401a) {
            co coVar = this.f42408s;
            if (coVar.f35224cc != null) {
                coVar.f35224cc = null;
                if (this.f42402b) {
                    coVar.h8(new vi(this, this.f42403c, this.d, this.f42404e, this.f42405f, this.h, this.f42406n, 0));
                } else {
                    coVar.h8(new fh(10, this, this.f42407r));
                }
                coVar.A7(true);
            }
        }
    }
}
