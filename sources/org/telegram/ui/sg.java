package org.telegram.ui;
public final class sg implements org.telegram.messenger.bs {
    public final int f41506a;
    public final un f41507b;

    public sg(un unVar, int i10) {
        this.f41506a = i10;
        this.f41507b = unVar;
    }

    @Override
    public final void a(int i10) {
        switch (this.f41506a) {
            case 0:
                un unVar = this.f41507b;
                if (unVar.getParentActivity() != null && unVar.fragmentView != null && i10 > 0) {
                    org.telegram.ui.Components.cc.a0(unVar).m(org.telegram.ui.Components.bc.f24599r, i10, 0, 0, unVar.f42477xa).j();
                    return;
                }
                return;
            case 1:
                un unVar2 = this.f41507b;
                if (i10 == 0) {
                    unVar2.C6 = false;
                    unVar2.X9();
                    return;
                }
                unVar2.k(i10, 0, false, 0, true, 0);
                return;
            default:
                un unVar3 = this.f41507b;
                if (i10 == 0) {
                    unVar3.ld(true);
                    return;
                } else {
                    unVar3.finishFragment();
                    return;
                }
        }
    }
}
