package org.telegram.ui;
public final class yi implements Runnable {
    public final boolean f43839a;
    public final boolean f43840b;
    public final int f43841c;
    public final boolean d;
    public final org.telegram.ui.Components.mj0 e;
    public final float f43842f;
    public final float h;
    public final sg.o0 f43843n;
    public final org.telegram.messenger.jj f43844r;
    public final un f43845s;

    public yi(un unVar, boolean z10, boolean z11, int i10, boolean z12, org.telegram.ui.Components.mj0 mj0Var, float f7, float f10, sg.o0 o0Var, org.telegram.messenger.jj jjVar) {
        this.f43845s = unVar;
        this.f43839a = z10;
        this.f43840b = z11;
        this.f43841c = i10;
        this.d = z12;
        this.e = mj0Var;
        this.f43842f = f7;
        this.h = f10;
        this.f43843n = o0Var;
        this.f43844r = jjVar;
    }

    @Override
    public final void run() {
        if (!this.f43839a) {
            un unVar = this.f43845s;
            if (unVar.f42478xc != null) {
                unVar.f42478xc = null;
                if (this.f43840b) {
                    unVar.p8(new xi(this, this.f43841c, this.d, this.e, this.f43842f, this.h, this.f43843n, 0));
                } else {
                    unVar.p8(new zg(9, this, this.f43844r));
                }
                unVar.I7(true);
            }
        }
    }
}
