package org.telegram.ui;

import org.telegram.messenger.MessageObject;
public final class ti implements Runnable {
    public final boolean f38114a;
    public final boolean f38115b;
    public final int f38116c;
    public final boolean d;
    public final org.telegram.ui.Components.qk0 e;
    public final float f38117f;
    public final float h;
    public final zg.o0 f38118n;
    public final MessageObject f38119r;
    public final wn f38120s;

    public ti(wn wnVar, boolean z10, boolean z11, int i10, boolean z12, org.telegram.ui.Components.qk0 qk0Var, float f7, float f10, zg.o0 o0Var, MessageObject messageObject) {
        this.f38120s = wnVar;
        this.f38114a = z10;
        this.f38115b = z11;
        this.f38116c = i10;
        this.d = z12;
        this.e = qk0Var;
        this.f38117f = f7;
        this.h = f10;
        this.f38118n = o0Var;
        this.f38119r = messageObject;
    }

    @Override
    public final void run() {
        if (!this.f38114a) {
            wn wnVar = this.f38120s;
            if (wnVar.f39418bc != null) {
                wnVar.f39418bc = null;
                if (this.f38115b) {
                    wnVar.h8(new si(this, this.f38116c, this.d, this.e, this.f38117f, this.h, this.f38118n, 0));
                } else {
                    wnVar.h8(new dh(10, this, this.f38119r));
                }
                wnVar.A7(true);
            }
        }
    }
}
