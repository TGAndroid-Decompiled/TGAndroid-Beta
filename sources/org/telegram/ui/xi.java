package org.telegram.ui;
public final class xi implements Runnable {
    public final int f43383a;
    public final yi f43384b;
    public final int f43385c;
    public final boolean d;
    public final org.telegram.ui.Components.nj0 e;
    public final float f43386f;
    public final float h;
    public final sg.o0 f43387n;

    public xi(yi yiVar, int i10, boolean z10, org.telegram.ui.Components.nj0 nj0Var, float f7, float f10, sg.o0 o0Var, int i11) {
        this.f43383a = i11;
        this.f43384b = yiVar;
        this.f43385c = i10;
        this.d = z10;
        this.e = nj0Var;
        this.f43386f = f7;
        this.h = f10;
        this.f43387n = o0Var;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f43383a) {
            case 0:
                org.telegram.messenger.i0.h3(new xi(this.f43384b, this.f43385c, this.d, this.e, this.f43386f, this.h, this.f43387n, 1), 50L);
                return;
            default:
                un unVar = this.f43384b.f43676s;
                org.telegram.ui.Cells.z E8 = unVar.E8(this.f43385c, true);
                if (this.d) {
                    i10 = ((org.telegram.ui.ActionBar.k2) unVar).currentAccount;
                    sg.k0.d(unVar, this.e, E8, null, this.f43386f, this.h, this.f43387n, i10, 1);
                    sg.k0.f();
                    return;
                }
                return;
        }
    }
}
