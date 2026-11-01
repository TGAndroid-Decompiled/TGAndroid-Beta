package org.telegram.ui;
public final class tg implements org.telegram.messenger.cs {
    public final int f41640a;
    public final un f41641b;

    public tg(un unVar, int i10) {
        this.f41640a = i10;
        this.f41641b = unVar;
    }

    @Override
    public final void a(int i10) {
        switch (this.f41640a) {
            case 0:
                un unVar = this.f41641b;
                if (unVar.getParentActivity() != null && unVar.fragmentView != null && i10 > 0) {
                    org.telegram.ui.Components.cc.a0(unVar).m(org.telegram.ui.Components.bc.f24699r, i10, 0, 0, unVar.f42288xa).j();
                    return;
                }
                return;
            case 1:
                un unVar2 = this.f41641b;
                if (i10 == 0) {
                    unVar2.C6 = false;
                    unVar2.ca();
                    return;
                }
                unVar2.l(i10, 0, false, 0, true, 0);
                return;
            default:
                un unVar3 = this.f41641b;
                if (i10 == 0) {
                    unVar3.qd(true);
                    return;
                } else {
                    unVar3.finishFragment();
                    return;
                }
        }
    }
}
