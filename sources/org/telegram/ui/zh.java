package org.telegram.ui;
public final class zh implements Runnable {
    public final boolean f52675a;
    public final boolean f52676b;
    public final int f52677c;
    public final boolean d;
    public final org.telegram.ui.Components.li0 f52678e;
    public final float f52679f;
    public final float h;
    public final dh.n0 f52680n;
    public final org.telegram.messenger.zi f52681r;
    public final wm f52682s;

    public zh(wm wmVar, boolean z10, boolean z11, int i3, boolean z12, org.telegram.ui.Components.li0 li0Var, float f10, float f11, dh.n0 n0Var, org.telegram.messenger.zi ziVar) {
        this.f52682s = wmVar;
        this.f52675a = z10;
        this.f52676b = z11;
        this.f52677c = i3;
        this.d = z12;
        this.f52678e = li0Var;
        this.f52679f = f10;
        this.h = f11;
        this.f52680n = n0Var;
        this.f52681r = ziVar;
    }

    @Override
    public final void run() {
        if (!this.f52675a) {
            wm wmVar = this.f52682s;
            if (wmVar.Gc != null) {
                wmVar.Gc = null;
                if (this.f52676b) {
                    wmVar.w8(new yh(this, this.f52677c, this.d, this.f52678e, this.f52679f, this.h, this.f52680n, 0));
                } else {
                    wmVar.w8(new sc(20, this, this.f52681r));
                }
                wmVar.O7(true);
            }
        }
    }
}
