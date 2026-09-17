package org.telegram.ui;

import org.telegram.messenger.MessageObject;
public final class wi implements Runnable {
    public final boolean f42428a;
    public final boolean f42429b;
    public final int f42430c;
    public final boolean d;
    public final org.telegram.ui.Components.fk0 f42431e;
    public final float f42432f;
    public final float h;
    public final ah.j1 f42433n;
    public final MessageObject f42434r;
    public final co f42435s;

    public wi(co coVar, boolean z10, boolean z11, int i10, boolean z12, org.telegram.ui.Components.fk0 fk0Var, float f7, float f10, ah.j1 j1Var, MessageObject messageObject) {
        this.f42435s = coVar;
        this.f42428a = z10;
        this.f42429b = z11;
        this.f42430c = i10;
        this.d = z12;
        this.f42431e = fk0Var;
        this.f42432f = f7;
        this.h = f10;
        this.f42433n = j1Var;
        this.f42434r = messageObject;
    }

    @Override
    public final void run() {
        if (!this.f42428a) {
            co coVar = this.f42435s;
            if (coVar.f35251cc != null) {
                coVar.f35251cc = null;
                if (this.f42429b) {
                    coVar.h8(new vi(this, this.f42430c, this.d, this.f42431e, this.f42432f, this.h, this.f42433n, 0));
                } else {
                    coVar.h8(new fh(10, this, this.f42434r));
                }
                coVar.A7(true);
            }
        }
    }
}
