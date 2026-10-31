package org.telegram.ui;
public final class zi implements org.telegram.messenger.us {
    public final int f44161a;
    public final ag.g3 f44162b;
    public final un f44163c;
    public final un d;

    public zi(un unVar, int i10, ag.g3 g3Var, un unVar2) {
        this.d = unVar;
        this.f44161a = i10;
        this.f44162b = g3Var;
        this.f44163c = unVar2;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12;
        int i13 = org.telegram.messenger.zs.D;
        if (i10 == i13 && ((Integer) objArr[10]).intValue() == this.f44161a) {
            this.f44162b.run();
            org.telegram.messenger.i0.h3(new i2.a0(this.f44163c, i10, i11, objArr, 10), 50L);
            i12 = ((org.telegram.ui.ActionBar.k2) this.d).currentAccount;
            org.telegram.messenger.zs.f(i12).n(this, i13);
        }
    }
}
