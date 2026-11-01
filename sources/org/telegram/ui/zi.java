package org.telegram.ui;
public final class zi implements org.telegram.messenger.vs {
    public final int f44006a;
    public final ag.g3 f44007b;
    public final un f44008c;
    public final un d;

    public zi(un unVar, int i10, ag.g3 g3Var, un unVar2) {
        this.d = unVar;
        this.f44006a = i10;
        this.f44007b = g3Var;
        this.f44008c = unVar2;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12;
        int i13 = org.telegram.messenger.at.D;
        if (i10 == i13 && ((Integer) objArr[10]).intValue() == this.f44006a) {
            this.f44007b.run();
            org.telegram.messenger.i0.h3(new i2.a0(this.f44008c, i10, i11, objArr, 10), 50L);
            i12 = ((org.telegram.ui.ActionBar.k2) this.d).currentAccount;
            org.telegram.messenger.at.f(i12).n(this, i13);
        }
    }
}
