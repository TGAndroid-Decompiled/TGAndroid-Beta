package org.telegram.ui;

import org.telegram.messenger.MessageObject;
public final class wi implements Runnable {
    public final boolean f43615a;
    public final boolean f43616b;
    public final int f43617c;
    public final boolean d;
    public final org.telegram.ui.Components.kl0 f43618e;
    public final float f43619f;
    public final float h;
    public final zg.n0 f43620n;
    public final MessageObject f43621r;
    public final zn f43622s;

    public wi(zn znVar, boolean z10, boolean z11, int i10, boolean z12, org.telegram.ui.Components.kl0 kl0Var, float f7, float f10, zg.n0 n0Var, MessageObject messageObject) {
        this.f43622s = znVar;
        this.f43615a = z10;
        this.f43616b = z11;
        this.f43617c = i10;
        this.d = z12;
        this.f43618e = kl0Var;
        this.f43619f = f7;
        this.h = f10;
        this.f43620n = n0Var;
        this.f43621r = messageObject;
    }

    @Override
    public final void run() {
        if (!this.f43615a) {
            zn znVar = this.f43622s;
            if (znVar.f44737cc != null) {
                znVar.f44737cc = null;
                if (this.f43616b) {
                    znVar.k8(new vi(this, this.f43617c, this.d, this.f43618e, this.f43619f, this.h, this.f43620n, 0));
                } else {
                    znVar.k8(new sg(12, this, this.f43621r));
                }
                znVar.D7(true);
            }
        }
    }
}
