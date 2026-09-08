package org.telegram.ui;

import org.telegram.messenger.MessageObject;
public final class wi implements Runnable {
    public final boolean f42427a;
    public final boolean f42428b;
    public final int f42429c;
    public final boolean d;
    public final org.telegram.ui.Components.fk0 f42430e;
    public final float f42431f;
    public final float h;
    public final ah.j1 f42432n;
    public final MessageObject f42433r;
    public final co f42434s;

    public wi(co coVar, boolean z10, boolean z11, int i10, boolean z12, org.telegram.ui.Components.fk0 fk0Var, float f7, float f10, ah.j1 j1Var, MessageObject messageObject) {
        this.f42434s = coVar;
        this.f42427a = z10;
        this.f42428b = z11;
        this.f42429c = i10;
        this.d = z12;
        this.f42430e = fk0Var;
        this.f42431f = f7;
        this.h = f10;
        this.f42432n = j1Var;
        this.f42433r = messageObject;
    }

    @Override
    public final void run() {
        if (!this.f42427a) {
            co coVar = this.f42434s;
            if (coVar.f35250cc != null) {
                coVar.f35250cc = null;
                if (this.f42428b) {
                    coVar.h8(new vi(this, this.f42429c, this.d, this.f42430e, this.f42431f, this.h, this.f42432n, 0));
                } else {
                    coVar.h8(new fh(10, this, this.f42433r));
                }
                coVar.A7(true);
            }
        }
    }
}
