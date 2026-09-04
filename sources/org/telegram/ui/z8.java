package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.UndoView;
public final class z8 implements org.telegram.ui.Components.ob {
    public final int f43333a;
    public final Object f43334b;

    public z8(Object obj, int i10) {
        this.f43333a = i10;
        this.f43334b = obj;
    }

    @Override
    public final boolean a() {
        switch (this.f43333a) {
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
        switch (this.f43333a) {
            case 0:
            case 1:
                return;
            case 2:
                org.telegram.ui.Components.ub ubVar = qcVar.f29675e;
                co coVar = (co) this.f43334b;
                dh.d c10 = coVar.J.c(ubVar, null, true);
                eh.e eVar = new eh.e(coVar.f35247ea);
                eVar.f9113e = new di.w9(5);
                float dpf2 = AndroidUtilities.dpf2(0.5f);
                float dpf22 = AndroidUtilities.dpf2(0.5f);
                eVar.f9114f = dpf2;
                eVar.h = dpf22;
                c10.n(eVar);
                c10.p(AndroidUtilities.dp(16.0f));
                ubVar.setCustomBackground(c10);
                return;
            case 3:
                return;
            case 4:
                uy uyVar = (uy) this.f43334b;
                UndoView undoView = uyVar.f41361y0[0];
                if (undoView != null && undoView.getVisibility() == 0) {
                    uyVar.f41361y0[0].e(2, true);
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
        switch (this.f43333a) {
            case 0:
                k9 k9Var = (k9) this.f43334b;
                k9Var.V = Math.max(0.0f, (f7 - k9Var.W) - k9Var.U);
                k9Var.g0();
                return;
            case 1:
            case 2:
                return;
            case 3:
                ContactsActivity contactsActivity = (ContactsActivity) this.f43334b;
                contactsActivity.f33357p0 = Math.max(0.0f, (f7 - contactsActivity.f33358q0) - contactsActivity.f33356o0);
                contactsActivity.i0();
                return;
            case 4:
                uy uyVar = (uy) this.f43334b;
                UndoView undoView = uyVar.f41361y0[0];
                if (undoView == null || undoView.getVisibility() != 0) {
                    uyVar.f41340u1 = Math.max(0.0f, (f7 - uyVar.f41274g4) - uyVar.f41288j4);
                    uyVar.X4();
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
        int i10 = this.f43333a;
    }

    @Override
    public final boolean e() {
        switch (this.f43333a) {
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
                if (((ProfileActivity) this.f43334b).f33988s5 == null) {
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
        av0 av0Var;
        switch (this.f43333a) {
            case 0:
                k9 k9Var = (k9) this.f43334b;
                i11 = k9Var.W;
                i12 = k9Var.U;
                break;
            case 1:
                return ((bd) this.f43334b).O.getMeasuredHeight();
            case 2:
                co coVar = (co) this.f43334b;
                if (i10 == 1) {
                    return 0;
                }
                return Math.round(coVar.S.getInputBubbleHeight() + AndroidUtilities.dp(16.0f) + coVar.W8(org.telegram.ui.Components.s21.f30178c) + coVar.v.c());
            case 3:
                ContactsActivity contactsActivity = (ContactsActivity) this.f43334b;
                i11 = contactsActivity.f33358q0;
                i12 = contactsActivity.f33356o0;
                break;
            case 4:
                uy uyVar = (uy) this.f43334b;
                if (uyVar.X2 != 0) {
                    return AndroidUtilities.dp(60.0f) + uyVar.f41274g4;
                }
                return uyVar.n3();
            case 5:
                i12 = ((eh0) this.f43334b).L;
                i11 = AndroidUtilities.dp(64.0f);
                break;
            case 6:
                PhotoViewer photoViewer = ((uu0) this.f43334b).E0;
                int i13 = 0;
                if (photoViewer.R4) {
                    at0 at0Var = photoViewer.U1;
                    if (at0Var != null) {
                        i13 = at0Var.L.f7435l;
                        if (at0Var.getVisibility() == 0 && ((av0Var = photoViewer.d) == null || !av0Var.A())) {
                            i13 = org.telegram.messenger.w1.C(12.0f, photoViewer.U1.getEditTextHeight(), i13);
                        }
                    }
                    t5 t5Var = photoViewer.P0;
                    if (t5Var != null && t5Var.getVisibility() == 0) {
                        at0 at0Var2 = photoViewer.U1;
                        if (at0Var2 == null || !at0Var2.L.c()) {
                            return i13 + photoViewer.P0.getHeight();
                        }
                        return i13;
                    }
                    return i13;
                }
                bi.g5 g5Var = photoViewer.f33584i0;
                if (g5Var != null && g5Var.getVisibility() == 0) {
                    i13 = (int) ((photoViewer.f33584i0.getAlpha() * photoViewer.f33584i0.getHeight()) + 0);
                }
                org.telegram.ui.Components.v30 v30Var = photoViewer.l1;
                if (v30Var != null && v30Var.c()) {
                    if (AndroidUtilities.isTablet() || photoViewer.f33549e0.getMeasuredHeight() > photoViewer.f33549e0.getMeasuredWidth()) {
                        return (int) ((photoViewer.l1.getAlpha() * photoViewer.l1.getHeight()) + i13);
                    }
                    return i13;
                }
                return i13;
            case 7:
                return ((PremiumPreviewFragment) this.f43334b).f33789o0.d;
            case 8:
                ProfileActivity profileActivity = (ProfileActivity) this.f43334b;
                if (profileActivity.f33988s5 == null) {
                    return profileActivity.f33940l6 + profileActivity.f33935k6;
                }
                return profileActivity.f33940l6 + profileActivity.f33935k6 + ((int) (((AndroidUtilities.dp(52.0f) - profileActivity.f33988s5.getTranslationY()) - (profileActivity.f33995t5[1].getTranslationY() * profileActivity.O.g0(9, false))) - (profileActivity.f33995t5[0].getTranslationY() * profileActivity.O.g0(8, true))));
            default:
                eg1 eg1Var = (eg1) this.f43334b;
                v51 v51Var = eg1Var.f36056o0;
                if (v51Var != null && v51Var.getVisibility() == 0) {
                    return eg1Var.f36056o0.getMeasuredHeight();
                }
                return 0;
        }
        return i11 + i12;
    }

    @Override
    public final boolean g(int i10) {
        switch (this.f43333a) {
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
        switch (this.f43333a) {
            case 0:
                return 0;
            case 1:
                return 0;
            case 2:
                int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight;
                co coVar = (co) this.f43334b;
                kVar = ((org.telegram.ui.ActionBar.n2) coVar).actionBar;
                if (kVar != null) {
                    kVar2 = ((org.telegram.ui.ActionBar.n2) coVar).actionBar;
                    int measuredHeight = kVar2.getMeasuredHeight();
                    kVar3 = ((org.telegram.ui.ActionBar.n2) coVar).actionBar;
                    i11 = kVar3.getTop() + measuredHeight;
                } else {
                    i11 = 0;
                }
                max = Math.max(currentActionBarHeight, i11);
                max2 = (int) Math.max(0.0f, coVar.f35431t9);
                break;
            case 3:
                return 0;
            case 4:
                uy uyVar = (uy) this.f43334b;
                kVar4 = ((org.telegram.ui.ActionBar.n2) uyVar).actionBar;
                int i15 = 0;
                if (kVar4 != null) {
                    kVar5 = ((org.telegram.ui.ActionBar.n2) uyVar).actionBar;
                    i12 = kVar5.getMeasuredHeight();
                } else {
                    i12 = 0;
                }
                sw swVar = uyVar.f41364z0;
                if (swVar != null && swVar.getVisibility() == 0) {
                    i13 = uyVar.f41364z0.getMeasuredHeight();
                } else {
                    i13 = 0;
                }
                int i16 = i12 + i13;
                org.telegram.ui.Components.js jsVar = uyVar.J1;
                if (jsVar != null) {
                    i14 = jsVar.getHeight();
                } else {
                    i14 = 0;
                }
                int i17 = i16 + i14;
                lx lxVar = uyVar.E0;
                if (lxVar != null && uyVar.G0) {
                    i15 = (int) ((1.0f - lxVar.getCollapsedProgress()) * AndroidUtilities.dp(81.0f));
                }
                return AndroidUtilities.dp(48.0f) + i17 + i15;
            case 5:
                return 0;
            case 6:
                PhotoViewer photoViewer = ((uu0) this.f43334b).E0;
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
