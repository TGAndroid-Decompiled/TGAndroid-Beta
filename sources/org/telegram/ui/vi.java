package org.telegram.ui;

import org.telegram.messenger.MessageObject;
public final class vi implements Runnable {
    public final boolean f38558a;
    public final boolean f38559b;
    public final int f38560c;
    public final boolean d;
    public final org.telegram.ui.Components.pk0 e;
    public final float f38561f;
    public final float h;
    public final zg.o0 f38562n;
    public final MessageObject f38563r;
    public final zn f38564s;

    public vi(zn znVar, boolean z10, boolean z11, int i10, boolean z12, org.telegram.ui.Components.pk0 pk0Var, float f7, float f10, zg.o0 o0Var, MessageObject messageObject) {
        this.f38564s = znVar;
        this.f38558a = z10;
        this.f38559b = z11;
        this.f38560c = i10;
        this.d = z12;
        this.e = pk0Var;
        this.f38561f = f7;
        this.h = f10;
        this.f38562n = o0Var;
        this.f38563r = messageObject;
    }

    @Override
    public final void run() {
        if (!this.f38558a) {
            zn znVar = this.f38564s;
            if (znVar.f40267bc != null) {
                znVar.f40267bc = null;
                if (this.f38559b) {
                    znVar.h8(new ui(this, this.f38560c, this.d, this.e, this.f38561f, this.h, this.f38562n, 0));
                } else {
                    znVar.h8(new gh(10, this, this.f38563r));
                }
                znVar.A7(true);
            }
        }
    }
}
