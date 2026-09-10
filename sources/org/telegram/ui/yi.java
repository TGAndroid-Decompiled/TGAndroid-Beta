package org.telegram.ui;

import org.telegram.messenger.MessageObject;
public final class yi implements Runnable {
    public final boolean f39005a;
    public final boolean f39006b;
    public final int f39007c;
    public final boolean d;
    public final org.telegram.ui.Components.pk0 e;
    public final float f39008f;
    public final float h;
    public final yg.p0 f39009n;
    public final MessageObject f39010r;
    public final eo f39011s;

    public yi(eo eoVar, boolean z10, boolean z11, int i10, boolean z12, org.telegram.ui.Components.pk0 pk0Var, float f7, float f10, yg.p0 p0Var, MessageObject messageObject) {
        this.f39011s = eoVar;
        this.f39005a = z10;
        this.f39006b = z11;
        this.f39007c = i10;
        this.d = z12;
        this.e = pk0Var;
        this.f39008f = f7;
        this.h = f10;
        this.f39009n = p0Var;
        this.f39010r = messageObject;
    }

    @Override
    public final void run() {
        if (!this.f39005a) {
            eo eoVar = this.f39011s;
            if (eoVar.f32293cc != null) {
                eoVar.f32293cc = null;
                if (this.f39006b) {
                    eoVar.h8(new xi(this, this.f39007c, this.d, this.e, this.f39008f, this.h, this.f39009n, 0));
                } else {
                    eoVar.h8(new qh(7, this, this.f39010r));
                }
                eoVar.A7(true);
            }
        }
    }
}
