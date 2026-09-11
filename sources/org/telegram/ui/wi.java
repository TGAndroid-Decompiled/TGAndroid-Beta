package org.telegram.ui;

import org.telegram.messenger.MessageObject;
public final class wi implements Runnable {
    public final boolean f42400a;
    public final boolean f42401b;
    public final int f42402c;
    public final boolean d;
    public final org.telegram.ui.Components.fk0 f42403e;
    public final float f42404f;
    public final float h;
    public final ah.j1 f42405n;
    public final MessageObject f42406r;
    public final co f42407s;

    public wi(co coVar, boolean z10, boolean z11, int i10, boolean z12, org.telegram.ui.Components.fk0 fk0Var, float f7, float f10, ah.j1 j1Var, MessageObject messageObject) {
        this.f42407s = coVar;
        this.f42400a = z10;
        this.f42401b = z11;
        this.f42402c = i10;
        this.d = z12;
        this.f42403e = fk0Var;
        this.f42404f = f7;
        this.h = f10;
        this.f42405n = j1Var;
        this.f42406r = messageObject;
    }

    @Override
    public final void run() {
        if (!this.f42400a) {
            co coVar = this.f42407s;
            if (coVar.f35223cc != null) {
                coVar.f35223cc = null;
                if (this.f42401b) {
                    coVar.h8(new vi(this, this.f42402c, this.d, this.f42403e, this.f42404f, this.h, this.f42405n, 0));
                } else {
                    coVar.h8(new fh(10, this, this.f42406r));
                }
                coVar.A7(true);
            }
        }
    }
}
