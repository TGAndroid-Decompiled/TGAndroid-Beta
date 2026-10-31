package org.telegram.ui;
public final class xi implements Runnable {
    public final int f43583a;
    public final yi f43584b;
    public final int f43585c;
    public final boolean d;
    public final org.telegram.ui.Components.mj0 e;
    public final float f43586f;
    public final float h;
    public final sg.o0 f43587n;

    public xi(yi yiVar, int i10, boolean z10, org.telegram.ui.Components.mj0 mj0Var, float f7, float f10, sg.o0 o0Var, int i11) {
        this.f43583a = i11;
        this.f43584b = yiVar;
        this.f43585c = i10;
        this.d = z10;
        this.e = mj0Var;
        this.f43586f = f7;
        this.h = f10;
        this.f43587n = o0Var;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f43583a) {
            case 0:
                org.telegram.messenger.i0.h3(new xi(this.f43584b, this.f43585c, this.d, this.e, this.f43586f, this.h, this.f43587n, 1), 50L);
                return;
            default:
                un unVar = this.f43584b.f43845s;
                org.telegram.ui.Cells.z A8 = unVar.A8(this.f43585c, true);
                if (this.d) {
                    i10 = ((org.telegram.ui.ActionBar.k2) unVar).currentAccount;
                    sg.k0.d(unVar, this.e, A8, null, this.f43586f, this.h, this.f43587n, i10, 1);
                    sg.k0.f();
                    return;
                }
                return;
        }
    }
}
