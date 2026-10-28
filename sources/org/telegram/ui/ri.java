package org.telegram.ui;

import org.telegram.messenger.MessageObject;
public final class ri implements Runnable {
    public final boolean f43047a;
    public final boolean f43048b;
    public final int f43049c;
    public final boolean d;
    public final org.telegram.ui.Components.gl0 e;
    public final float f43050f;
    public final float h;
    public final bh.x0 f43051n;
    public final MessageObject f43052r;
    public final wn f43053s;

    public ri(wn wnVar, boolean z10, boolean z11, int i10, boolean z12, org.telegram.ui.Components.gl0 gl0Var, float f7, float f10, bh.x0 x0Var, MessageObject messageObject) {
        this.f43053s = wnVar;
        this.f43047a = z10;
        this.f43048b = z11;
        this.f43049c = i10;
        this.d = z12;
        this.e = gl0Var;
        this.f43050f = f7;
        this.h = f10;
        this.f43051n = x0Var;
        this.f43052r = messageObject;
    }

    @Override
    public final void run() {
        if (!this.f43047a) {
            wn wnVar = this.f43053s;
            if (wnVar.Cc != null) {
                wnVar.Cc = null;
                if (this.f43048b) {
                    wnVar.q8(new qi(this, this.f43049c, this.d, this.e, this.f43050f, this.h, this.f43051n, 0));
                } else {
                    wnVar.q8(new ed(18, this, this.f43052r));
                }
                wnVar.J7(true);
            }
        }
    }
}
