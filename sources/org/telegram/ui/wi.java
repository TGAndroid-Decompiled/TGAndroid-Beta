package org.telegram.ui;

import org.telegram.messenger.MessageObject;
public final class wi implements Runnable {
    public final boolean f43781a;
    public final boolean f43782b;
    public final int f43783c;
    public final boolean d;
    public final org.telegram.ui.Components.ml0 f43784e;
    public final float f43785f;
    public final float h;
    public final zg.n0 f43786n;
    public final MessageObject f43787r;
    public final zn f43788s;

    public wi(zn znVar, boolean z10, boolean z11, int i10, boolean z12, org.telegram.ui.Components.ml0 ml0Var, float f7, float f10, zg.n0 n0Var, MessageObject messageObject) {
        this.f43788s = znVar;
        this.f43781a = z10;
        this.f43782b = z11;
        this.f43783c = i10;
        this.d = z12;
        this.f43784e = ml0Var;
        this.f43785f = f7;
        this.h = f10;
        this.f43786n = n0Var;
        this.f43787r = messageObject;
    }

    @Override
    public final void run() {
        if (!this.f43781a) {
            zn znVar = this.f43788s;
            if (znVar.f44738cc != null) {
                znVar.f44738cc = null;
                if (this.f43782b) {
                    znVar.k8(new vi(this, this.f43783c, this.d, this.f43784e, this.f43785f, this.h, this.f43786n, 0));
                } else {
                    znVar.k8(new ug(11, this, this.f43787r));
                }
                znVar.D7(true);
            }
        }
    }
}
