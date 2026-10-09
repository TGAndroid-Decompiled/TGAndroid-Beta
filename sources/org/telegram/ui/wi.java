package org.telegram.ui;

import org.telegram.messenger.MessageObject;
public final class wi implements Runnable {
    public final boolean f43617a;
    public final boolean f43618b;
    public final int f43619c;
    public final boolean d;
    public final org.telegram.ui.Components.kl0 f43620e;
    public final float f43621f;
    public final float h;
    public final zg.n0 f43622n;
    public final MessageObject f43623r;
    public final zn f43624s;

    public wi(zn znVar, boolean z10, boolean z11, int i10, boolean z12, org.telegram.ui.Components.kl0 kl0Var, float f7, float f10, zg.n0 n0Var, MessageObject messageObject) {
        this.f43624s = znVar;
        this.f43617a = z10;
        this.f43618b = z11;
        this.f43619c = i10;
        this.d = z12;
        this.f43620e = kl0Var;
        this.f43621f = f7;
        this.h = f10;
        this.f43622n = n0Var;
        this.f43623r = messageObject;
    }

    @Override
    public final void run() {
        if (!this.f43617a) {
            zn znVar = this.f43624s;
            if (znVar.f44739cc != null) {
                znVar.f44739cc = null;
                if (this.f43618b) {
                    znVar.k8(new vi(this, this.f43619c, this.d, this.f43620e, this.f43621f, this.h, this.f43622n, 0));
                } else {
                    znVar.k8(new sg(12, this, this.f43623r));
                }
                znVar.D7(true);
            }
        }
    }
}
