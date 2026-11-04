package org.telegram.ui;
public final class yh implements Runnable {
    public final int f52276a;
    public final zh f52277b;
    public final int f52278c;
    public final boolean d;
    public final org.telegram.ui.Components.li0 f52279e;
    public final float f52280f;
    public final float h;
    public final dh.n0 f52281n;

    public yh(zh zhVar, int i3, boolean z10, org.telegram.ui.Components.li0 li0Var, float f10, float f11, dh.n0 n0Var, int i10) {
        this.f52276a = i10;
        this.f52277b = zhVar;
        this.f52278c = i3;
        this.d = z10;
        this.f52279e = li0Var;
        this.f52280f = f10;
        this.h = f11;
        this.f52281n = n0Var;
    }

    @Override
    public final void run() {
        int i3;
        switch (this.f52276a) {
            case 0:
                org.telegram.messenger.g0.i3(new yh(this.f52277b, this.f52278c, this.d, this.f52279e, this.f52280f, this.h, this.f52281n, 1), 50L);
                return;
            default:
                wm wmVar = this.f52277b.f52682s;
                org.telegram.ui.Cells.z H8 = wmVar.H8(this.f52278c, true);
                if (this.d) {
                    i3 = ((org.telegram.ui.ActionBar.d2) wmVar).currentAccount;
                    dh.j0.d(wmVar, this.f52279e, H8, null, this.f52280f, this.h, this.f52281n, i3, 1);
                    dh.j0.f();
                    return;
                }
                return;
        }
    }
}
