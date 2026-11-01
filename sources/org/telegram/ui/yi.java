package org.telegram.ui;
public final class yi implements Runnable {
    public final boolean f43670a;
    public final boolean f43671b;
    public final int f43672c;
    public final boolean d;
    public final org.telegram.ui.Components.nj0 e;
    public final float f43673f;
    public final float h;
    public final sg.o0 f43674n;
    public final org.telegram.messenger.kj f43675r;
    public final un f43676s;

    public yi(un unVar, boolean z10, boolean z11, int i10, boolean z12, org.telegram.ui.Components.nj0 nj0Var, float f7, float f10, sg.o0 o0Var, org.telegram.messenger.kj kjVar) {
        this.f43676s = unVar;
        this.f43670a = z10;
        this.f43671b = z11;
        this.f43672c = i10;
        this.d = z12;
        this.e = nj0Var;
        this.f43673f = f7;
        this.h = f10;
        this.f43674n = o0Var;
        this.f43675r = kjVar;
    }

    @Override
    public final void run() {
        if (!this.f43670a) {
            un unVar = this.f43676s;
            if (unVar.f42302yc != null) {
                unVar.f42302yc = null;
                if (this.f43671b) {
                    unVar.t8(new xi(this, this.f43672c, this.d, this.e, this.f43673f, this.h, this.f43674n, 0));
                } else {
                    unVar.t8(new ch(9, this, this.f43675r));
                }
                unVar.M7(true);
            }
        }
    }
}
