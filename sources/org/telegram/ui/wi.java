package org.telegram.ui;

import org.telegram.messenger.MessageObject;
public final class wi implements Runnable {
    public final boolean f39179a;
    public final boolean f39180b;
    public final int f39181c;
    public final boolean d;
    public final org.telegram.ui.Components.sk0 e;
    public final float f39182f;
    public final float h;
    public final zg.p0 f39183n;
    public final MessageObject f39184r;
    public final zn f39185s;

    public wi(zn znVar, boolean z10, boolean z11, int i10, boolean z12, org.telegram.ui.Components.sk0 sk0Var, float f7, float f10, zg.p0 p0Var, MessageObject messageObject) {
        this.f39185s = znVar;
        this.f39179a = z10;
        this.f39180b = z11;
        this.f39181c = i10;
        this.d = z12;
        this.e = sk0Var;
        this.f39182f = f7;
        this.h = f10;
        this.f39183n = p0Var;
        this.f39184r = messageObject;
    }

    @Override
    public final void run() {
        if (!this.f39179a) {
            zn znVar = this.f39185s;
            if (znVar.f40288bc != null) {
                znVar.f40288bc = null;
                if (this.f39180b) {
                    znVar.h8(new vi(this, this.f39181c, this.d, this.e, this.f39182f, this.h, this.f39183n, 0));
                } else {
                    znVar.h8(new gh(10, this, this.f39184r));
                }
                znVar.A7(true);
            }
        }
    }
}
