package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.UndoView;
public final class z8 implements org.telegram.ui.Components.ob {
    public final int f40069a;
    public final Object f40070b;

    public z8(Object obj, int i10) {
        this.f40069a = i10;
        this.f40070b = obj;
    }

    @Override
    public final boolean a() {
        switch (this.f40069a) {
            case 0:
                return true;
            case 1:
                return true;
            case 2:
                return false;
            case 3:
                return true;
            case 4:
                return true;
            case 5:
                return true;
            case 6:
                return true;
            case 7:
                return true;
            case 8:
                return true;
            default:
                return true;
        }
    }

    @Override
    public final void b(org.telegram.ui.Components.qc qcVar) {
        switch (this.f40069a) {
            case 0:
            case 1:
                return;
            case 2:
                org.telegram.ui.Components.ub ubVar = qcVar.e;
                xn xnVar = (xn) this.f40070b;
                ch.d c10 = xnVar.J.c(ubVar, null, true);
                dh.e eVar = new dh.e(xnVar.f39370ea);
                eVar.e = new d2.c(4);
                float dpf2 = AndroidUtilities.dpf2(0.5f);
                float dpf22 = AndroidUtilities.dpf2(0.5f);
                eVar.f7725f = dpf2;
                eVar.h = dpf22;
                c10.o(eVar);
                c10.q(AndroidUtilities.dp(16.0f));
                ubVar.setCustomBackground(c10);
                return;
            case 3:
                return;
            case 4:
                ry ryVar = (ry) this.f40070b;
                UndoView undoView = ryVar.f37079y0[0];
                if (undoView != null && undoView.getVisibility() == 0) {
                    ryVar.f37079y0[0].e(2, true);
                    return;
                }
                return;
            case 5:
            case 6:
            case 7:
            case 8:
            default:
                return;
        }
    }

    @Override
    public final void c(float f7) {
        switch (this.f40069a) {
            case 0:
                k9 k9Var = (k9) this.f40070b;
                k9Var.V = Math.max(0.0f, (f7 - k9Var.W) - k9Var.U);
                k9Var.g0();
                return;
            case 1:
            case 2:
                return;
            case 3:
                ContactsActivity contactsActivity = (ContactsActivity) this.f40070b;
                contactsActivity.f30724p0 = Math.max(0.0f, (f7 - contactsActivity.f30725q0) - contactsActivity.f30723o0);
                contactsActivity.i0();
                return;
            case 4:
                ry ryVar = (ry) this.f40070b;
                UndoView undoView = ryVar.f37079y0[0];
                if (undoView == null || undoView.getVisibility() != 0) {
                    ryVar.f37059u1 = Math.max(0.0f, (f7 - ryVar.f36988f4) - ryVar.f37003i4);
                    ryVar.X4();
                    return;
                }
                return;
            case 5:
            case 6:
            case 7:
            case 8:
            default:
                return;
        }
    }

    @Override
    public final void d(org.telegram.ui.Components.qc qcVar) {
        int i10 = this.f40069a;
    }

    @Override
    public final boolean e() {
        switch (this.f40069a) {
            case 0:
                return true;
            case 1:
                return true;
            case 2:
                return true;
            case 3:
                return true;
            case 4:
                return true;
            case 5:
                return true;
            case 6:
                return true;
            case 7:
                return true;
            case 8:
                if (((ProfileActivity) this.f40070b).f31340s5 == null) {
                    return true;
                }
                return false;
            default:
                return true;
        }
    }

    @Override
    public final int f(int i10) {
        int i11;
        int i12;
        uu0 uu0Var;
        switch (this.f40069a) {
            case 0:
                k9 k9Var = (k9) this.f40070b;
                i11 = k9Var.W;
                i12 = k9Var.U;
                break;
            case 1:
                return ((ad) this.f40070b).O.getMeasuredHeight();
            case 2:
                xn xnVar = (xn) this.f40070b;
                if (i10 == 1) {
                    return 0;
                }
                return Math.round(xnVar.S.getInputBubbleHeight() + AndroidUtilities.dp(16.0f) + xnVar.W8(org.telegram.ui.Components.s21.f27802c) + xnVar.v.c());
            case 3:
                ContactsActivity contactsActivity = (ContactsActivity) this.f40070b;
                i11 = contactsActivity.f30725q0;
                i12 = contactsActivity.f30723o0;
                break;
            case 4:
                ry ryVar = (ry) this.f40070b;
                if (ryVar.X2 != 0) {
                    return AndroidUtilities.dp(60.0f) + ryVar.f36988f4;
                }
                return ryVar.n3();
            case 5:
                i12 = ((zg0) this.f40070b).L;
                i11 = AndroidUtilities.dp(64.0f);
                break;
            case 6:
                PhotoViewer photoViewer = ((ou0) this.f40070b).E0;
                int i13 = 0;
                if (photoViewer.R4) {
                    us0 us0Var = photoViewer.U1;
                    if (us0Var != null) {
                        i13 = us0Var.L.f4782l;
                        if (us0Var.getVisibility() == 0 && ((uu0Var = photoViewer.d) == null || !uu0Var.A())) {
                            i13 = org.telegram.messenger.z0.C(12.0f, photoViewer.U1.getEditTextHeight(), i13);
                        }
                    }
                    u5 u5Var = photoViewer.P0;
                    if (u5Var != null && u5Var.getVisibility() == 0) {
                        us0 us0Var2 = photoViewer.U1;
                        if (us0Var2 == null || !us0Var2.L.c()) {
                            return i13 + photoViewer.P0.getHeight();
                        }
                        return i13;
                    }
                    return i13;
                }
                ai.w5 w5Var = photoViewer.f30943i0;
                if (w5Var != null && w5Var.getVisibility() == 0) {
                    i13 = (int) ((photoViewer.f30943i0.getAlpha() * photoViewer.f30943i0.getHeight()) + 0);
                }
                org.telegram.ui.Components.w30 w30Var = photoViewer.l1;
                if (w30Var != null && w30Var.c()) {
                    if (AndroidUtilities.isTablet() || photoViewer.f30908e0.getMeasuredHeight() > photoViewer.f30908e0.getMeasuredWidth()) {
                        return (int) ((photoViewer.l1.getAlpha() * photoViewer.l1.getHeight()) + i13);
                    }
                    return i13;
                }
                return i13;
            case 7:
                return ((PremiumPreviewFragment) this.f40070b).f31144o0.d;
            case 8:
                ProfileActivity profileActivity = (ProfileActivity) this.f40070b;
                if (profileActivity.f31340s5 == null) {
                    return profileActivity.f31292l6 + profileActivity.f31287k6;
                }
                return profileActivity.f31292l6 + profileActivity.f31287k6 + ((int) (((AndroidUtilities.dp(52.0f) - profileActivity.f31340s5.getTranslationY()) - (profileActivity.f31347t5[1].getTranslationY() * profileActivity.O.g0(9, false))) - (profileActivity.f31347t5[0].getTranslationY() * profileActivity.O.g0(8, true))));
            default:
                wf1 wf1Var = (wf1) this.f40070b;
                l51 l51Var = wf1Var.f38966o0;
                if (l51Var != null && l51Var.getVisibility() == 0) {
                    return wf1Var.f38966o0.getMeasuredHeight();
                }
                return 0;
        }
        return i11 + i12;
    }

    @Override
    public final boolean g(int i10) {
        switch (this.f40069a) {
            case 0:
                return false;
            case 1:
                return false;
            case 2:
                return false;
            case 3:
                return false;
            case 4:
                return false;
            case 5:
                return false;
            case 6:
                return false;
            case 7:
                return false;
            case 8:
                return false;
            default:
                return false;
        }
    }

    @Override
    public final int h(int i10) {
        org.telegram.ui.ActionBar.k kVar;
        int i11;
        int max;
        int max2;
        org.telegram.ui.ActionBar.k kVar2;
        org.telegram.ui.ActionBar.k kVar3;
        org.telegram.ui.ActionBar.k kVar4;
        int i12;
        int i13;
        int i14;
        org.telegram.ui.ActionBar.k kVar5;
        switch (this.f40069a) {
            case 0:
                return 0;
            case 1:
                return 0;
            case 2:
                int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight;
                xn xnVar = (xn) this.f40070b;
                kVar = ((org.telegram.ui.ActionBar.n2) xnVar).actionBar;
                if (kVar != null) {
                    kVar2 = ((org.telegram.ui.ActionBar.n2) xnVar).actionBar;
                    int measuredHeight = kVar2.getMeasuredHeight();
                    kVar3 = ((org.telegram.ui.ActionBar.n2) xnVar).actionBar;
                    i11 = kVar3.getTop() + measuredHeight;
                } else {
                    i11 = 0;
                }
                max = Math.max(currentActionBarHeight, i11);
                max2 = (int) Math.max(0.0f, xnVar.f39554t9);
                break;
            case 3:
                return 0;
            case 4:
                ry ryVar = (ry) this.f40070b;
                kVar4 = ((org.telegram.ui.ActionBar.n2) ryVar).actionBar;
                int i15 = 0;
                if (kVar4 != null) {
                    kVar5 = ((org.telegram.ui.ActionBar.n2) ryVar).actionBar;
                    i12 = kVar5.getMeasuredHeight();
                } else {
                    i12 = 0;
                }
                pw pwVar = ryVar.f37082z0;
                if (pwVar != null && pwVar.getVisibility() == 0) {
                    i13 = ryVar.f37082z0.getMeasuredHeight();
                } else {
                    i13 = 0;
                }
                int i16 = i12 + i13;
                org.telegram.ui.Components.ls lsVar = ryVar.J1;
                if (lsVar != null) {
                    i14 = lsVar.getHeight();
                } else {
                    i14 = 0;
                }
                int i17 = i16 + i14;
                ix ixVar = ryVar.E0;
                if (ixVar != null && ryVar.G0) {
                    i15 = (int) ((1.0f - ixVar.getCollapsedProgress()) * AndroidUtilities.dp(81.0f));
                }
                return AndroidUtilities.dp(48.0f) + i17 + i15;
            case 5:
                return 0;
            case 6:
                PhotoViewer photoViewer = ((ou0) this.f40070b).E0;
                return org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight + ((int) (photoViewer.V1.getAlpha() * photoViewer.V1.getEditTextHeight()));
            case 7:
                return 0;
            case 8:
                max2 = AndroidUtilities.statusBarHeight;
                max = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                break;
            default:
                return 0;
        }
        return max + max2;
    }

    private final void A(org.telegram.ui.Components.qc qcVar) {
    }

    private final void B(org.telegram.ui.Components.qc qcVar) {
    }

    private final void C(org.telegram.ui.Components.qc qcVar) {
    }

    private final void D(org.telegram.ui.Components.qc qcVar) {
    }

    private final void E(org.telegram.ui.Components.qc qcVar) {
    }

    private final void F(org.telegram.ui.Components.qc qcVar) {
    }

    private final void G(org.telegram.ui.Components.qc qcVar) {
    }

    private final void i(float f7) {
    }

    private final void j(float f7) {
    }

    private final void k(float f7) {
    }

    private final void l(float f7) {
    }

    private final void m(float f7) {
    }

    private final void n(float f7) {
    }

    private final void o(float f7) {
    }

    private final void p(org.telegram.ui.Components.qc qcVar) {
    }

    private final void q(org.telegram.ui.Components.qc qcVar) {
    }

    private final void r(org.telegram.ui.Components.qc qcVar) {
    }

    private final void s(org.telegram.ui.Components.qc qcVar) {
    }

    private final void t(org.telegram.ui.Components.qc qcVar) {
    }

    private final void u(org.telegram.ui.Components.qc qcVar) {
    }

    private final void v(org.telegram.ui.Components.qc qcVar) {
    }

    private final void w(org.telegram.ui.Components.qc qcVar) {
    }

    private final void x(org.telegram.ui.Components.qc qcVar) {
    }

    private final void y(org.telegram.ui.Components.qc qcVar) {
    }

    private final void z(org.telegram.ui.Components.qc qcVar) {
    }
}
