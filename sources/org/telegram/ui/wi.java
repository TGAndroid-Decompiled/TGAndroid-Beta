package org.telegram.ui;

import org.telegram.messenger.MessageObject;
public final class wi implements Runnable {
    public final boolean f43815a;
    public final boolean f43816b;
    public final int f43817c;
    public final boolean d;
    public final org.telegram.ui.Components.ll0 f43818e;
    public final float f43819f;
    public final float h;
    public final zg.n0 f43820n;
    public final MessageObject f43821r;
    public final zn f43822s;

    public wi(zn znVar, boolean z10, boolean z11, int i10, boolean z12, org.telegram.ui.Components.ll0 ll0Var, float f7, float f10, zg.n0 n0Var, MessageObject messageObject) {
        this.f43822s = znVar;
        this.f43815a = z10;
        this.f43816b = z11;
        this.f43817c = i10;
        this.d = z12;
        this.f43818e = ll0Var;
        this.f43819f = f7;
        this.h = f10;
        this.f43820n = n0Var;
        this.f43821r = messageObject;
    }

    @Override
    public final void run() {
        if (!this.f43815a) {
            zn znVar = this.f43822s;
            if (znVar.f44772cc != null) {
                znVar.f44772cc = null;
                if (this.f43816b) {
                    znVar.k8(new vi(this, this.f43817c, this.d, this.f43818e, this.f43819f, this.h, this.f43820n, 0));
                } else {
                    znVar.k8(new ug(11, this, this.f43821r));
                }
                znVar.D7(true);
            }
        }
    }
}
