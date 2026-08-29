package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.UndoView;
public final class w8 implements org.telegram.ui.Components.kb {
    public final int f43865a;
    public final Object f43866b;

    public w8(Object obj, int i10) {
        this.f43865a = i10;
        this.f43866b = obj;
    }

    @Override
    public final boolean a() {
        switch (this.f43865a) {
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
    public final void b(org.telegram.ui.Components.mc mcVar) {
        switch (this.f43865a) {
            case 0:
            case 1:
                return;
            case 2:
                org.telegram.ui.Components.rb rbVar = mcVar.f30648e;
                tn tnVar = (tn) this.f43866b;
                ng.d c3 = tnVar.F.c(rbVar, null, true);
                og.d dVar = new og.d(tnVar.f42746aa);
                dVar.f19560e = new xx0(11);
                float dpf2 = AndroidUtilities.dpf2(0.5f);
                float dpf22 = AndroidUtilities.dpf2(0.5f);
                dVar.f19561f = dpf2;
                dVar.h = dpf22;
                c3.n(dVar);
                c3.p(AndroidUtilities.dp(16.0f));
                rbVar.setCustomBackground(c3);
                return;
            case 3:
                return;
            case 4:
                fy fyVar = (fy) this.f43866b;
                UndoView undoView = fyVar.f38358u0[0];
                if (undoView != null && undoView.getVisibility() == 0) {
                    fyVar.f38358u0[0].e(2, true);
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
    public final void c(float f9) {
        switch (this.f43865a) {
            case 0:
                h9 h9Var = (h9) this.f43866b;
                h9Var.R = Math.max(0.0f, (f9 - h9Var.S) - h9Var.Q);
                h9Var.g0();
                return;
            case 1:
            case 2:
                return;
            case 3:
                ContactsActivity contactsActivity = (ContactsActivity) this.f43866b;
                contactsActivity.f35494l0 = Math.max(0.0f, (f9 - contactsActivity.m0) - contactsActivity.f35493k0);
                contactsActivity.i0();
                return;
            case 4:
                fy fyVar = (fy) this.f43866b;
                UndoView undoView = fyVar.f38358u0[0];
                if (undoView == null || undoView.getVisibility() != 0) {
                    fyVar.f38338q1 = Math.max(0.0f, (f9 - fyVar.f38270c4) - fyVar.f38287f4);
                    fyVar.X4();
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
    public final void d(org.telegram.ui.Components.mc mcVar) {
        int i10 = this.f43865a;
    }

    @Override
    public final boolean e() {
        switch (this.f43865a) {
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
                if (((ProfileActivity) this.f43866b).f36088o5 == null) {
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
        xt0 xt0Var;
        switch (this.f43865a) {
            case 0:
                h9 h9Var = (h9) this.f43866b;
                i11 = h9Var.S;
                i12 = h9Var.Q;
                break;
            case 1:
                return ((vc) this.f43866b).K.getMeasuredHeight();
            case 2:
                tn tnVar = (tn) this.f43866b;
                if (i10 == 1) {
                    return 0;
                }
                return Math.round(tnVar.O.getInputBubbleHeight() + AndroidUtilities.dp(16.0f) + tnVar.W8(org.telegram.ui.Components.i21.f29305c) + tnVar.v.c());
            case 3:
                ContactsActivity contactsActivity = (ContactsActivity) this.f43866b;
                i11 = contactsActivity.m0;
                i12 = contactsActivity.f35493k0;
                break;
            case 4:
                fy fyVar = (fy) this.f43866b;
                if (fyVar.T2 != 0) {
                    return AndroidUtilities.dp(60.0f) + fyVar.f38270c4;
                }
                return fyVar.n3();
            case 5:
                i12 = ((ng0) this.f43866b).H;
                i11 = AndroidUtilities.dp(64.0f);
                break;
            case 6:
                PhotoViewer photoViewer = ((rt0) this.f43866b).A0;
                int i13 = 0;
                if (photoViewer.N4) {
                    xr0 xr0Var = photoViewer.Q1;
                    if (xr0Var != null) {
                        i13 = xr0Var.H.f18786l;
                        if (xr0Var.getVisibility() == 0 && ((xt0Var = photoViewer.d) == null || !xt0Var.A())) {
                            i13 = org.telegram.messenger.x3.C(12.0f, photoViewer.Q1.getEditTextHeight(), i13);
                        }
                    }
                    bg.u1 u1Var = photoViewer.L0;
                    if (u1Var != null && u1Var.getVisibility() == 0) {
                        xr0 xr0Var2 = photoViewer.Q1;
                        if (xr0Var2 == null || !xr0Var2.H.c()) {
                            return i13 + photoViewer.L0.getHeight();
                        }
                        return i13;
                    }
                    return i13;
                }
                bh.d dVar = photoViewer.f35683e0;
                if (dVar != null && dVar.getVisibility() == 0) {
                    i13 = (int) ((photoViewer.f35683e0.getAlpha() * photoViewer.f35683e0.getHeight()) + 0);
                }
                org.telegram.ui.Components.t30 t30Var = photoViewer.f35712h1;
                if (t30Var != null && t30Var.c()) {
                    if (AndroidUtilities.isTablet() || photoViewer.f35647a0.getMeasuredHeight() > photoViewer.f35647a0.getMeasuredWidth()) {
                        return (int) ((photoViewer.f35712h1.getAlpha() * photoViewer.f35712h1.getHeight()) + i13);
                    }
                    return i13;
                }
                return i13;
            case 7:
                return ((PremiumPreviewFragment) this.f43866b).f35920k0.d;
            case 8:
                ProfileActivity profileActivity = (ProfileActivity) this.f43866b;
                if (profileActivity.f36088o5 == null) {
                    return profileActivity.f36041h6 + profileActivity.f36034g6;
                }
                return profileActivity.f36041h6 + profileActivity.f36034g6 + ((int) (((AndroidUtilities.dp(52.0f) - profileActivity.f36088o5.getTranslationY()) - (profileActivity.f36095p5[1].getTranslationY() * profileActivity.K.g0(9, false))) - (profileActivity.f36095p5[0].getTranslationY() * profileActivity.K.g0(8, true))));
            default:
                ze1 ze1Var = (ze1) this.f43866b;
                n31 n31Var = ze1Var.f45179k0;
                if (n31Var != null && n31Var.getVisibility() == 0) {
                    return ze1Var.f45179k0.getMeasuredHeight();
                }
                return 0;
        }
        return i11 + i12;
    }

    @Override
    public final boolean g(int i10) {
        switch (this.f43865a) {
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
        org.telegram.ui.ActionBar.l lVar;
        int i11;
        int max;
        int max2;
        org.telegram.ui.ActionBar.l lVar2;
        org.telegram.ui.ActionBar.l lVar3;
        org.telegram.ui.ActionBar.l lVar4;
        int i12;
        int i13;
        int i14;
        org.telegram.ui.ActionBar.l lVar5;
        switch (this.f43865a) {
            case 0:
                return 0;
            case 1:
                return 0;
            case 2:
                int currentActionBarHeight = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight;
                tn tnVar = (tn) this.f43866b;
                lVar = ((org.telegram.ui.ActionBar.o2) tnVar).actionBar;
                if (lVar != null) {
                    lVar2 = ((org.telegram.ui.ActionBar.o2) tnVar).actionBar;
                    int measuredHeight = lVar2.getMeasuredHeight();
                    lVar3 = ((org.telegram.ui.ActionBar.o2) tnVar).actionBar;
                    i11 = lVar3.getTop() + measuredHeight;
                } else {
                    i11 = 0;
                }
                max = Math.max(currentActionBarHeight, i11);
                max2 = (int) Math.max(0.0f, tnVar.f42933p9);
                break;
            case 3:
                return 0;
            case 4:
                fy fyVar = (fy) this.f43866b;
                lVar4 = ((org.telegram.ui.ActionBar.o2) fyVar).actionBar;
                int i15 = 0;
                if (lVar4 != null) {
                    lVar5 = ((org.telegram.ui.ActionBar.o2) fyVar).actionBar;
                    i12 = lVar5.getMeasuredHeight();
                } else {
                    i12 = 0;
                }
                ew ewVar = fyVar.f38362v0;
                if (ewVar != null && ewVar.getVisibility() == 0) {
                    i13 = fyVar.f38362v0.getMeasuredHeight();
                } else {
                    i13 = 0;
                }
                int i16 = i12 + i13;
                org.telegram.ui.Components.fs fsVar = fyVar.F1;
                if (fsVar != null) {
                    i14 = fsVar.getHeight();
                } else {
                    i14 = 0;
                }
                int i17 = i16 + i14;
                xw xwVar = fyVar.A0;
                if (xwVar != null && fyVar.C0) {
                    i15 = (int) ((1.0f - xwVar.getCollapsedProgress()) * AndroidUtilities.dp(81.0f));
                }
                return AndroidUtilities.dp(48.0f) + i17 + i15;
            case 5:
                return 0;
            case 6:
                PhotoViewer photoViewer = ((rt0) this.f43866b).A0;
                return org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight + ((int) (photoViewer.R1.getAlpha() * photoViewer.R1.getEditTextHeight()));
            case 7:
                return 0;
            case 8:
                max2 = AndroidUtilities.statusBarHeight;
                max = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
                break;
            default:
                return 0;
        }
        return max + max2;
    }

    private final void A(org.telegram.ui.Components.mc mcVar) {
    }

    private final void B(org.telegram.ui.Components.mc mcVar) {
    }

    private final void C(org.telegram.ui.Components.mc mcVar) {
    }

    private final void D(org.telegram.ui.Components.mc mcVar) {
    }

    private final void E(org.telegram.ui.Components.mc mcVar) {
    }

    private final void F(org.telegram.ui.Components.mc mcVar) {
    }

    private final void G(org.telegram.ui.Components.mc mcVar) {
    }

    private final void i(float f9) {
    }

    private final void j(float f9) {
    }

    private final void k(float f9) {
    }

    private final void l(float f9) {
    }

    private final void m(float f9) {
    }

    private final void n(float f9) {
    }

    private final void o(float f9) {
    }

    private final void p(org.telegram.ui.Components.mc mcVar) {
    }

    private final void q(org.telegram.ui.Components.mc mcVar) {
    }

    private final void r(org.telegram.ui.Components.mc mcVar) {
    }

    private final void s(org.telegram.ui.Components.mc mcVar) {
    }

    private final void t(org.telegram.ui.Components.mc mcVar) {
    }

    private final void u(org.telegram.ui.Components.mc mcVar) {
    }

    private final void v(org.telegram.ui.Components.mc mcVar) {
    }

    private final void w(org.telegram.ui.Components.mc mcVar) {
    }

    private final void x(org.telegram.ui.Components.mc mcVar) {
    }

    private final void y(org.telegram.ui.Components.mc mcVar) {
    }

    private final void z(org.telegram.ui.Components.mc mcVar) {
    }
}
