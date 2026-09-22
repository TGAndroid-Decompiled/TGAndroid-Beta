package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.UndoView;
public final class z8 implements org.telegram.ui.Components.mb {
    public final int f40088a;
    public final Object f40089b;

    public z8(Object obj, int i10) {
        this.f40088a = i10;
        this.f40089b = obj;
    }

    @Override
    public final boolean a() {
        switch (this.f40088a) {
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
    public final void b(org.telegram.ui.Components.oc ocVar) {
        switch (this.f40088a) {
            case 0:
            case 1:
                return;
            case 2:
                org.telegram.ui.Components.sb sbVar = ocVar.e;
                bo boVar = (bo) this.f40089b;
                ch.d c10 = boVar.J.c(sbVar, null, true);
                dh.e eVar = new dh.e(boVar.f32293ea);
                eVar.e = new d2.c(4);
                float dpf2 = AndroidUtilities.dpf2(0.5f);
                float dpf22 = AndroidUtilities.dpf2(0.5f);
                eVar.f7739f = dpf2;
                eVar.h = dpf22;
                c10.o(eVar);
                c10.q(AndroidUtilities.dp(16.0f));
                sbVar.setCustomBackground(c10);
                return;
            case 3:
                return;
            case 4:
                uy uyVar = (uy) this.f40089b;
                UndoView undoView = uyVar.f38323y0[0];
                if (undoView != null && undoView.getVisibility() == 0) {
                    uyVar.f38323y0[0].e(2, true);
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
        switch (this.f40088a) {
            case 0:
                k9 k9Var = (k9) this.f40089b;
                k9Var.V = Math.max(0.0f, (f7 - k9Var.W) - k9Var.U);
                k9Var.g0();
                return;
            case 1:
            case 2:
                return;
            case 3:
                ContactsActivity contactsActivity = (ContactsActivity) this.f40089b;
                contactsActivity.f30750p0 = Math.max(0.0f, (f7 - contactsActivity.f30751q0) - contactsActivity.f30749o0);
                contactsActivity.i0();
                return;
            case 4:
                uy uyVar = (uy) this.f40089b;
                UndoView undoView = uyVar.f38323y0[0];
                if (undoView == null || undoView.getVisibility() != 0) {
                    uyVar.f38303u1 = Math.max(0.0f, (f7 - uyVar.f38232f4) - uyVar.f38247i4);
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
    public final void d(org.telegram.ui.Components.oc ocVar) {
        int i10 = this.f40088a;
    }

    @Override
    public final boolean e() {
        switch (this.f40088a) {
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
                if (((ProfileActivity) this.f40089b).f31366s5 == null) {
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
        bv0 bv0Var;
        switch (this.f40088a) {
            case 0:
                k9 k9Var = (k9) this.f40089b;
                i11 = k9Var.W;
                i12 = k9Var.U;
                break;
            case 1:
                return ((ad) this.f40089b).O.getMeasuredHeight();
            case 2:
                bo boVar = (bo) this.f40089b;
                if (i10 == 1) {
                    return 0;
                }
                return Math.round(boVar.S.getInputBubbleHeight() + AndroidUtilities.dp(16.0f) + boVar.W8(org.telegram.ui.Components.t21.f28041c) + boVar.v.c());
            case 3:
                ContactsActivity contactsActivity = (ContactsActivity) this.f40089b;
                i11 = contactsActivity.f30751q0;
                i12 = contactsActivity.f30749o0;
                break;
            case 4:
                uy uyVar = (uy) this.f40089b;
                if (uyVar.X2 != 0) {
                    return AndroidUtilities.dp(60.0f) + uyVar.f38232f4;
                }
                return uyVar.n3();
            case 5:
                i12 = ((eh0) this.f40089b).L;
                i11 = AndroidUtilities.dp(64.0f);
                break;
            case 6:
                PhotoViewer photoViewer = ((vu0) this.f40089b).E0;
                int i13 = 0;
                if (photoViewer.R4) {
                    bt0 bt0Var = photoViewer.U1;
                    if (bt0Var != null) {
                        i13 = bt0Var.L.f4845l;
                        if (bt0Var.getVisibility() == 0 && ((bv0Var = photoViewer.d) == null || !bv0Var.A())) {
                            i13 = org.telegram.messenger.y0.C(12.0f, photoViewer.U1.getEditTextHeight(), i13);
                        }
                    }
                    t5 t5Var = photoViewer.P0;
                    if (t5Var != null && t5Var.getVisibility() == 0) {
                        bt0 bt0Var2 = photoViewer.U1;
                        if (bt0Var2 == null || !bt0Var2.L.c()) {
                            return i13 + photoViewer.P0.getHeight();
                        }
                        return i13;
                    }
                    return i13;
                }
                ai.x5 x5Var = photoViewer.f30969i0;
                if (x5Var != null && x5Var.getVisibility() == 0) {
                    i13 = (int) ((photoViewer.f30969i0.getAlpha() * photoViewer.f30969i0.getHeight()) + 0);
                }
                org.telegram.ui.Components.v30 v30Var = photoViewer.l1;
                if (v30Var != null && v30Var.c()) {
                    if (AndroidUtilities.isTablet() || photoViewer.f30934e0.getMeasuredHeight() > photoViewer.f30934e0.getMeasuredWidth()) {
                        return (int) ((photoViewer.l1.getAlpha() * photoViewer.l1.getHeight()) + i13);
                    }
                    return i13;
                }
                return i13;
            case 7:
                return ((PremiumPreviewFragment) this.f40089b).f31170o0.d;
            case 8:
                ProfileActivity profileActivity = (ProfileActivity) this.f40089b;
                if (profileActivity.f31366s5 == null) {
                    return profileActivity.f31318l6 + profileActivity.f31313k6;
                }
                return profileActivity.f31318l6 + profileActivity.f31313k6 + ((int) (((AndroidUtilities.dp(52.0f) - profileActivity.f31366s5.getTranslationY()) - (profileActivity.f31373t5[1].getTranslationY() * profileActivity.O.g0(9, false))) - (profileActivity.f31373t5[0].getTranslationY() * profileActivity.O.g0(8, true))));
            default:
                eg1 eg1Var = (eg1) this.f40089b;
                t51 t51Var = eg1Var.f33321o0;
                if (t51Var != null && t51Var.getVisibility() == 0) {
                    return eg1Var.f33321o0.getMeasuredHeight();
                }
                return 0;
        }
        return i11 + i12;
    }

    @Override
    public final boolean g(int i10) {
        switch (this.f40088a) {
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
        switch (this.f40088a) {
            case 0:
                return 0;
            case 1:
                return 0;
            case 2:
                int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight;
                bo boVar = (bo) this.f40089b;
                kVar = ((org.telegram.ui.ActionBar.n2) boVar).actionBar;
                if (kVar != null) {
                    kVar2 = ((org.telegram.ui.ActionBar.n2) boVar).actionBar;
                    int measuredHeight = kVar2.getMeasuredHeight();
                    kVar3 = ((org.telegram.ui.ActionBar.n2) boVar).actionBar;
                    i11 = kVar3.getTop() + measuredHeight;
                } else {
                    i11 = 0;
                }
                max = Math.max(currentActionBarHeight, i11);
                max2 = (int) Math.max(0.0f, boVar.f32477t9);
                break;
            case 3:
                return 0;
            case 4:
                uy uyVar = (uy) this.f40089b;
                kVar4 = ((org.telegram.ui.ActionBar.n2) uyVar).actionBar;
                int i15 = 0;
                if (kVar4 != null) {
                    kVar5 = ((org.telegram.ui.ActionBar.n2) uyVar).actionBar;
                    i12 = kVar5.getMeasuredHeight();
                } else {
                    i12 = 0;
                }
                sw swVar = uyVar.f38326z0;
                if (swVar != null && swVar.getVisibility() == 0) {
                    i13 = uyVar.f38326z0.getMeasuredHeight();
                } else {
                    i13 = 0;
                }
                int i16 = i12 + i13;
                org.telegram.ui.Components.ks ksVar = uyVar.J1;
                if (ksVar != null) {
                    i14 = ksVar.getHeight();
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
                PhotoViewer photoViewer = ((vu0) this.f40089b).E0;
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

    private final void A(org.telegram.ui.Components.oc ocVar) {
    }

    private final void B(org.telegram.ui.Components.oc ocVar) {
    }

    private final void C(org.telegram.ui.Components.oc ocVar) {
    }

    private final void D(org.telegram.ui.Components.oc ocVar) {
    }

    private final void E(org.telegram.ui.Components.oc ocVar) {
    }

    private final void F(org.telegram.ui.Components.oc ocVar) {
    }

    private final void G(org.telegram.ui.Components.oc ocVar) {
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

    private final void p(org.telegram.ui.Components.oc ocVar) {
    }

    private final void q(org.telegram.ui.Components.oc ocVar) {
    }

    private final void r(org.telegram.ui.Components.oc ocVar) {
    }

    private final void s(org.telegram.ui.Components.oc ocVar) {
    }

    private final void t(org.telegram.ui.Components.oc ocVar) {
    }

    private final void u(org.telegram.ui.Components.oc ocVar) {
    }

    private final void v(org.telegram.ui.Components.oc ocVar) {
    }

    private final void w(org.telegram.ui.Components.oc ocVar) {
    }

    private final void x(org.telegram.ui.Components.oc ocVar) {
    }

    private final void y(org.telegram.ui.Components.oc ocVar) {
    }

    private final void z(org.telegram.ui.Components.oc ocVar) {
    }
}
