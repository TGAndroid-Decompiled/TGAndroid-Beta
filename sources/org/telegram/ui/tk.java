package org.telegram.ui;

import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class tk extends w7.x5 {
    public final int f41659a;
    public final Object f41660b;

    public tk(Object obj, int i10) {
        this.f41659a = i10;
        this.f41660b = obj;
    }

    @Override
    public final void a(boolean z10) {
        org.telegram.messenger.kj kjVar;
        switch (this.f41659a) {
            case 0:
                un unVar = (un) this.f41660b;
                unVar.G9 = !z10;
                if (z10) {
                    if (unVar.f42210r9 != null) {
                        un.d2(unVar, 0.0f);
                        unVar.f42210r9 = null;
                    }
                    unVar.f42223s9 = false;
                    unVar.f42299y9 = false;
                    ql qlVar = unVar.A9;
                    if (qlVar != null) {
                        org.telegram.messenger.i0.r(qlVar.H);
                        qlVar.a();
                    }
                }
                unVar.Uc();
                return;
            case 1:
                org.telegram.ui.Components.ua0 ua0Var = (org.telegram.ui.Components.ua0) this.f41660b;
                org.telegram.ui.Components.oa0 oa0Var = ua0Var.e;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = ua0Var.f30919s;
                org.telegram.ui.Components.ab0 ab0Var = ua0Var.f30915c0;
                if (ab0Var.f24342s) {
                    if (!z10 && actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().f32835b > 0.0f) {
                        actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().b(true);
                        return;
                    } else if (z10) {
                        if (oa0Var.v - oa0Var.f23444u > org.telegram.messenger.wp.r1(ab0Var.f24344x).f19214p4) {
                            ua0Var.g();
                            return;
                        }
                        org.telegram.ui.Cells.r9 r9Var = oa0Var.W;
                        if (r9Var != null) {
                            kjVar = ((org.telegram.ui.Cells.q1) r9Var).getMessageObject();
                        } else {
                            kjVar = null;
                        }
                        org.telegram.messenger.kj c10 = ua0Var.c(kjVar);
                        org.telegram.messenger.oj ojVar = ab0Var.d;
                        if (ojVar.d == null) {
                            int i10 = oa0Var.f23444u;
                            ojVar.e = i10;
                            int i11 = oa0Var.v;
                            ojVar.f17454f = i11;
                            ojVar.d = kn.b(i10, i11, c10);
                            actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().e(ua0Var.I);
                            return;
                        }
                        return;
                    } else {
                        return;
                    }
                }
                return;
            default:
                th.z2 z2Var = (th.z2) this.f41660b;
                th.v2 v2Var = z2Var.f49797z1;
                boolean x10 = z2Var.f49773t0.W.x();
                th.o7 o7Var = ((th.f7) v2Var).d;
                o7Var.f49327j1 = x10;
                o7Var.d0();
                return;
        }
    }

    @Override
    public void b() {
        org.telegram.ui.ActionBar.l lVar;
        org.telegram.ui.ActionBar.l lVar2;
        switch (this.f41659a) {
            case 0:
                un unVar = (un) this.f41660b;
                lVar = ((org.telegram.ui.ActionBar.k2) unVar).actionBar;
                if (lVar != null) {
                    lVar2 = ((org.telegram.ui.ActionBar.k2) unVar).actionBar;
                    if (lVar2.u()) {
                        unVar.L7(false);
                    }
                }
                unVar.c8();
                unVar.M3.j(58, 0L, null);
                return;
            default:
                return;
        }
    }
}
