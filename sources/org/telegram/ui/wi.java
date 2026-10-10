package org.telegram.ui;

import org.telegram.messenger.MessageObject;
public final class wi implements Runnable {
    public final boolean f43661a;
    public final boolean f43662b;
    public final int f43663c;
    public final boolean d;
    public final org.telegram.ui.Components.ll0 f43664e;
    public final float f43665f;
    public final float h;
    public final zg.n0 f43666n;
    public final MessageObject f43667r;
    public final zn f43668s;

    public wi(zn znVar, boolean z10, boolean z11, int i10, boolean z12, org.telegram.ui.Components.ll0 ll0Var, float f7, float f10, zg.n0 n0Var, MessageObject messageObject) {
        this.f43668s = znVar;
        this.f43661a = z10;
        this.f43662b = z11;
        this.f43663c = i10;
        this.d = z12;
        this.f43664e = ll0Var;
        this.f43665f = f7;
        this.h = f10;
        this.f43666n = n0Var;
        this.f43667r = messageObject;
    }

    @Override
    public final void run() {
        if (!this.f43661a) {
            zn znVar = this.f43668s;
            if (znVar.f44783cc != null) {
                znVar.f44783cc = null;
                if (this.f43662b) {
                    znVar.k8(new vi(this, this.f43663c, this.d, this.f43664e, this.f43665f, this.h, this.f43666n, 0));
                } else {
                    znVar.k8(new sg(12, this, this.f43667r));
                }
                znVar.D7(true);
            }
        }
    }
}
