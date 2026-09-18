package org.telegram.ui;

import org.telegram.messenger.MessageObject;
public final class xi implements Runnable {
    public final boolean f39650a;
    public final boolean f39651b;
    public final int f39652c;
    public final boolean d;
    public final org.telegram.ui.Components.gk0 e;
    public final float f39653f;
    public final float h;
    public final zg.p0 f39654n;
    public final MessageObject f39655r;
    public final bo f39656s;

    public xi(bo boVar, boolean z10, boolean z11, int i10, boolean z12, org.telegram.ui.Components.gk0 gk0Var, float f7, float f10, zg.p0 p0Var, MessageObject messageObject) {
        this.f39656s = boVar;
        this.f39650a = z10;
        this.f39651b = z11;
        this.f39652c = i10;
        this.d = z12;
        this.e = gk0Var;
        this.f39653f = f7;
        this.h = f10;
        this.f39654n = p0Var;
        this.f39655r = messageObject;
    }

    @Override
    public final void run() {
        if (!this.f39650a) {
            bo boVar = this.f39656s;
            if (boVar.f32243bc != null) {
                boVar.f32243bc = null;
                if (this.f39651b) {
                    boVar.h8(new wi(this, this.f39652c, this.d, this.e, this.f39653f, this.h, this.f39654n, 0));
                } else {
                    boVar.h8(new wh(4, this, this.f39655r));
                }
                boVar.A7(true);
            }
        }
    }
}
