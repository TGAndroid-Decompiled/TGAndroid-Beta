package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.UndoView;
public final class x8 implements org.telegram.ui.Components.fb {
    public final int f44391a;
    public final Object f44392b;

    public x8(Object obj, int i9) {
        this.f44391a = i9;
        this.f44392b = obj;
    }

    @Override
    public final boolean a() {
        switch (this.f44391a) {
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
    public final void b(org.telegram.ui.Components.gc gcVar) {
        switch (this.f44391a) {
            case 0:
            case 1:
                return;
            case 2:
                org.telegram.ui.Components.lb lbVar = gcVar.f28733e;
                qn qnVar = (qn) this.f44392b;
                kg.d c10 = qnVar.F.c(lbVar, null, true);
                lg.d dVar = new lg.d(qnVar.f41848aa);
                dVar.f16866e = new i3.i(25);
                float dpf2 = AndroidUtilities.dpf2(0.5f);
                float dpf22 = AndroidUtilities.dpf2(0.5f);
                dVar.f16867f = dpf2;
                dVar.h = dpf22;
                c10.n(dVar);
                c10.p(AndroidUtilities.dp(16.0f));
                lbVar.setCustomBackground(c10);
                return;
            case 3:
                return;
            case 4:
                dy dyVar = (dy) this.f44392b;
                UndoView undoView = dyVar.f37731u0[0];
                if (undoView != null && undoView.getVisibility() == 0) {
                    dyVar.f37731u0[0].e(2, true);
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
    public final void c(float f10) {
        switch (this.f44391a) {
            case 0:
                i9 i9Var = (i9) this.f44392b;
                i9Var.R = Math.max(0.0f, (f10 - i9Var.S) - i9Var.Q);
                i9Var.f0();
                return;
            case 1:
            case 2:
                return;
            case 3:
                ContactsActivity contactsActivity = (ContactsActivity) this.f44392b;
                contactsActivity.f35427l0 = Math.max(0.0f, (f10 - contactsActivity.m0) - contactsActivity.f35426k0);
                contactsActivity.h0();
                return;
            case 4:
                dy dyVar = (dy) this.f44392b;
                UndoView undoView = dyVar.f37731u0[0];
                if (undoView == null || undoView.getVisibility() != 0) {
                    dyVar.f37711q1 = Math.max(0.0f, (f10 - dyVar.f37643c4) - dyVar.f37660f4);
                    dyVar.X4();
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
    public final void d(org.telegram.ui.Components.gc gcVar) {
        int i9 = this.f44391a;
    }

    @Override
    public final boolean e() {
        switch (this.f44391a) {
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
                if (((ProfileActivity) this.f44392b).f36023o5 == null) {
                    return true;
                }
                return false;
            default:
                return true;
        }
    }

    @Override
    public final int f(int i9) {
        int i10;
        int i11;
        zt0 zt0Var;
        switch (this.f44391a) {
            case 0:
                i9 i9Var = (i9) this.f44392b;
                i10 = i9Var.S;
                i11 = i9Var.Q;
                break;
            case 1:
                return ((xc) this.f44392b).K.getMeasuredHeight();
            case 2:
                qn qnVar = (qn) this.f44392b;
                if (i9 == 1) {
                    return 0;
                }
                return Math.round(qnVar.O.getInputBubbleHeight() + AndroidUtilities.dp(16.0f) + qnVar.W8(org.telegram.ui.Components.w11.f34073c) + qnVar.v.c());
            case 3:
                ContactsActivity contactsActivity = (ContactsActivity) this.f44392b;
                i10 = contactsActivity.m0;
                i11 = contactsActivity.f35426k0;
                break;
            case 4:
                dy dyVar = (dy) this.f44392b;
                if (dyVar.T2 != 0) {
                    return AndroidUtilities.dp(60.0f) + dyVar.f37643c4;
                }
                return dyVar.n3();
            case 5:
                i11 = ((ng0) this.f44392b).H;
                i10 = AndroidUtilities.dp(64.0f);
                break;
            case 6:
                PhotoViewer photoViewer = ((tt0) this.f44392b).A0;
                int i12 = 0;
                if (photoViewer.N4) {
                    yr0 yr0Var = photoViewer.Q1;
                    if (yr0Var != null) {
                        i12 = yr0Var.H.f14999l;
                        if (yr0Var.getVisibility() == 0 && ((zt0Var = photoViewer.d) == null || !zt0Var.A())) {
                            i12 = org.telegram.messenger.l0.C(12.0f, photoViewer.Q1.getEditTextHeight(), i12);
                        }
                    }
                    bh.g gVar = photoViewer.L0;
                    if (gVar != null && gVar.getVisibility() == 0) {
                        yr0 yr0Var2 = photoViewer.Q1;
                        if (yr0Var2 == null || !yr0Var2.H.c()) {
                            return i12 + photoViewer.L0.getHeight();
                        }
                        return i12;
                    }
                    return i12;
                }
                dh.g gVar2 = photoViewer.f35617e0;
                if (gVar2 != null && gVar2.getVisibility() == 0) {
                    i12 = (int) ((photoViewer.f35617e0.getAlpha() * photoViewer.f35617e0.getHeight()) + 0);
                }
                org.telegram.ui.Components.f30 f30Var = photoViewer.f35646h1;
                if (f30Var != null && f30Var.c()) {
                    if (AndroidUtilities.isTablet() || photoViewer.f35580a0.getMeasuredHeight() > photoViewer.f35580a0.getMeasuredWidth()) {
                        return (int) ((photoViewer.f35646h1.getAlpha() * photoViewer.f35646h1.getHeight()) + i12);
                    }
                    return i12;
                }
                return i12;
            case 7:
                return ((PremiumPreviewFragment) this.f44392b).f35854k0.d;
            case 8:
                ProfileActivity profileActivity = (ProfileActivity) this.f44392b;
                if (profileActivity.f36023o5 == null) {
                    return profileActivity.f35976h6 + profileActivity.f35969g6;
                }
                return profileActivity.f35976h6 + profileActivity.f35969g6 + ((int) (((AndroidUtilities.dp(52.0f) - profileActivity.f36023o5.getTranslationY()) - (profileActivity.f36029p5[1].getTranslationY() * profileActivity.K.g0(9, false))) - (profileActivity.f36029p5[0].getTranslationY() * profileActivity.K.g0(8, true))));
            default:
                we1 we1Var = (we1) this.f44392b;
                b81 b81Var = we1Var.f43765k0;
                if (b81Var != null && b81Var.getVisibility() == 0) {
                    return we1Var.f43765k0.getMeasuredHeight();
                }
                return 0;
        }
        return i10 + i11;
    }

    @Override
    public final boolean g(int i9) {
        switch (this.f44391a) {
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
    public final int h(int i9) {
        org.telegram.ui.ActionBar.k kVar;
        int i10;
        int max;
        int max2;
        org.telegram.ui.ActionBar.k kVar2;
        org.telegram.ui.ActionBar.k kVar3;
        org.telegram.ui.ActionBar.k kVar4;
        int i11;
        int i12;
        int i13;
        org.telegram.ui.ActionBar.k kVar5;
        switch (this.f44391a) {
            case 0:
                return 0;
            case 1:
                return 0;
            case 2:
                int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight;
                qn qnVar = (qn) this.f44392b;
                kVar = ((org.telegram.ui.ActionBar.o2) qnVar).actionBar;
                if (kVar != null) {
                    kVar2 = ((org.telegram.ui.ActionBar.o2) qnVar).actionBar;
                    int measuredHeight = kVar2.getMeasuredHeight();
                    kVar3 = ((org.telegram.ui.ActionBar.o2) qnVar).actionBar;
                    i10 = kVar3.getTop() + measuredHeight;
                } else {
                    i10 = 0;
                }
                max = Math.max(currentActionBarHeight, i10);
                max2 = (int) Math.max(0.0f, qnVar.p9);
                break;
            case 3:
                return 0;
            case 4:
                dy dyVar = (dy) this.f44392b;
                kVar4 = ((org.telegram.ui.ActionBar.o2) dyVar).actionBar;
                int i14 = 0;
                if (kVar4 != null) {
                    kVar5 = ((org.telegram.ui.ActionBar.o2) dyVar).actionBar;
                    i11 = kVar5.getMeasuredHeight();
                } else {
                    i11 = 0;
                }
                cw cwVar = dyVar.f37735v0;
                if (cwVar != null && cwVar.getVisibility() == 0) {
                    i12 = dyVar.f37735v0.getMeasuredHeight();
                } else {
                    i12 = 0;
                }
                int i15 = i11 + i12;
                org.telegram.ui.Components.bs bsVar = dyVar.F1;
                if (bsVar != null) {
                    i13 = bsVar.getHeight();
                } else {
                    i13 = 0;
                }
                int i16 = i15 + i13;
                vw vwVar = dyVar.A0;
                if (vwVar != null && dyVar.C0) {
                    i14 = (int) ((1.0f - vwVar.getCollapsedProgress()) * AndroidUtilities.dp(81.0f));
                }
                return AndroidUtilities.dp(48.0f) + i16 + i14;
            case 5:
                return 0;
            case 6:
                PhotoViewer photoViewer = ((tt0) this.f44392b).A0;
                return org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight + ((int) (photoViewer.R1.getAlpha() * photoViewer.R1.getEditTextHeight()));
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

    private final void A(org.telegram.ui.Components.gc gcVar) {
    }

    private final void B(org.telegram.ui.Components.gc gcVar) {
    }

    private final void C(org.telegram.ui.Components.gc gcVar) {
    }

    private final void D(org.telegram.ui.Components.gc gcVar) {
    }

    private final void E(org.telegram.ui.Components.gc gcVar) {
    }

    private final void F(org.telegram.ui.Components.gc gcVar) {
    }

    private final void G(org.telegram.ui.Components.gc gcVar) {
    }

    private final void i(float f10) {
    }

    private final void j(float f10) {
    }

    private final void k(float f10) {
    }

    private final void l(float f10) {
    }

    private final void m(float f10) {
    }

    private final void n(float f10) {
    }

    private final void o(float f10) {
    }

    private final void p(org.telegram.ui.Components.gc gcVar) {
    }

    private final void q(org.telegram.ui.Components.gc gcVar) {
    }

    private final void r(org.telegram.ui.Components.gc gcVar) {
    }

    private final void s(org.telegram.ui.Components.gc gcVar) {
    }

    private final void t(org.telegram.ui.Components.gc gcVar) {
    }

    private final void u(org.telegram.ui.Components.gc gcVar) {
    }

    private final void v(org.telegram.ui.Components.gc gcVar) {
    }

    private final void w(org.telegram.ui.Components.gc gcVar) {
    }

    private final void x(org.telegram.ui.Components.gc gcVar) {
    }

    private final void y(org.telegram.ui.Components.gc gcVar) {
    }

    private final void z(org.telegram.ui.Components.gc gcVar) {
    }
}
