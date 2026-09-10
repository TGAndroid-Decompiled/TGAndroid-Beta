package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.UndoView;
public final class z8 implements org.telegram.ui.Components.nb {
    public final int f39227a;
    public final Object f39228b;

    public z8(Object obj, int i10) {
        this.f39227a = i10;
        this.f39228b = obj;
    }

    @Override
    public final boolean a() {
        switch (this.f39227a) {
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
    public final void b(org.telegram.ui.Components.pc pcVar) {
        switch (this.f39227a) {
            case 0:
            case 1:
                return;
            case 2:
                org.telegram.ui.Components.tb tbVar = pcVar.e;
                eo eoVar = (eo) this.f39228b;
                bh.d c10 = eoVar.J.c(tbVar, null, true);
                ch.e eVar = new ch.e(eoVar.f32316ea);
                eVar.e = new androidx.emoji2.text.w(27);
                float dpf2 = AndroidUtilities.dpf2(0.5f);
                float dpf22 = AndroidUtilities.dpf2(0.5f);
                eVar.f4691f = dpf2;
                eVar.h = dpf22;
                c10.n(eVar);
                c10.p(AndroidUtilities.dp(16.0f));
                tbVar.setCustomBackground(c10);
                return;
            case 3:
                return;
            case 4:
                wy wyVar = (wy) this.f39228b;
                UndoView undoView = wyVar.f38533y0[0];
                if (undoView != null && undoView.getVisibility() == 0) {
                    wyVar.f38533y0[0].e(2, true);
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
        switch (this.f39227a) {
            case 0:
                k9 k9Var = (k9) this.f39228b;
                k9Var.V = Math.max(0.0f, (f7 - k9Var.W) - k9Var.U);
                k9Var.g0();
                return;
            case 1:
            case 2:
                return;
            case 3:
                ContactsActivity contactsActivity = (ContactsActivity) this.f39228b;
                contactsActivity.f29866p0 = Math.max(0.0f, (f7 - contactsActivity.f29867q0) - contactsActivity.f29865o0);
                contactsActivity.i0();
                return;
            case 4:
                wy wyVar = (wy) this.f39228b;
                UndoView undoView = wyVar.f38533y0[0];
                if (undoView == null || undoView.getVisibility() != 0) {
                    wyVar.f38512u1 = Math.max(0.0f, (f7 - wyVar.f38446g4) - wyVar.f38460j4);
                    wyVar.X4();
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
    public final void d(org.telegram.ui.Components.pc pcVar) {
        int i10 = this.f39227a;
    }

    @Override
    public final boolean e() {
        switch (this.f39227a) {
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
                if (((ProfileActivity) this.f39228b).f30481s5 == null) {
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
        cv0 cv0Var;
        switch (this.f39227a) {
            case 0:
                k9 k9Var = (k9) this.f39228b;
                i11 = k9Var.W;
                i12 = k9Var.U;
                break;
            case 1:
                return ((cd) this.f39228b).O.getMeasuredHeight();
            case 2:
                eo eoVar = (eo) this.f39228b;
                if (i10 == 1) {
                    return 0;
                }
                return Math.round(eoVar.S.getInputBubbleHeight() + AndroidUtilities.dp(16.0f) + eoVar.W8(org.telegram.ui.Components.g31.f23231c) + eoVar.v.c());
            case 3:
                ContactsActivity contactsActivity = (ContactsActivity) this.f39228b;
                i11 = contactsActivity.f29867q0;
                i12 = contactsActivity.f29865o0;
                break;
            case 4:
                wy wyVar = (wy) this.f39228b;
                if (wyVar.X2 != 0) {
                    return AndroidUtilities.dp(60.0f) + wyVar.f38446g4;
                }
                return wyVar.n3();
            case 5:
                i12 = ((fh0) this.f39228b).L;
                i11 = AndroidUtilities.dp(64.0f);
                break;
            case 6:
                PhotoViewer photoViewer = ((wu0) this.f39228b).E0;
                int i13 = 0;
                if (photoViewer.R4) {
                    at0 at0Var = photoViewer.U1;
                    if (at0Var != null) {
                        i13 = at0Var.L.f2365l;
                        if (at0Var.getVisibility() == 0 && ((cv0Var = photoViewer.d) == null || !cv0Var.A())) {
                            i13 = org.telegram.messenger.a2.C(12.0f, photoViewer.U1.getEditTextHeight(), i13);
                        }
                    }
                    u5 u5Var = photoViewer.P0;
                    if (u5Var != null && u5Var.getVisibility() == 0) {
                        at0 at0Var2 = photoViewer.U1;
                        if (at0Var2 == null || !at0Var2.L.c()) {
                            return i13 + photoViewer.P0.getHeight();
                        }
                        return i13;
                    }
                    return i13;
                }
                bi.l4 l4Var = photoViewer.f30084i0;
                if (l4Var != null && l4Var.getVisibility() == 0) {
                    i13 = (int) ((photoViewer.f30084i0.getAlpha() * photoViewer.f30084i0.getHeight()) + 0);
                }
                org.telegram.ui.Components.f40 f40Var = photoViewer.l1;
                if (f40Var != null && f40Var.c()) {
                    if (AndroidUtilities.isTablet() || photoViewer.f30049e0.getMeasuredHeight() > photoViewer.f30049e0.getMeasuredWidth()) {
                        return (int) ((photoViewer.l1.getAlpha() * photoViewer.l1.getHeight()) + i13);
                    }
                    return i13;
                }
                return i13;
            case 7:
                return ((PremiumPreviewFragment) this.f39228b).f30285o0.d;
            case 8:
                ProfileActivity profileActivity = (ProfileActivity) this.f39228b;
                if (profileActivity.f30481s5 == null) {
                    return profileActivity.f30433l6 + profileActivity.f30428k6;
                }
                return profileActivity.f30433l6 + profileActivity.f30428k6 + ((int) (((AndroidUtilities.dp(52.0f) - profileActivity.f30481s5.getTranslationY()) - (profileActivity.f30488t5[1].getTranslationY() * profileActivity.O.g0(9, false))) - (profileActivity.f30488t5[0].getTranslationY() * profileActivity.O.g0(8, true))));
            default:
                ig1 ig1Var = (ig1) this.f39228b;
                m91 m91Var = ig1Var.f33711o0;
                if (m91Var != null && m91Var.getVisibility() == 0) {
                    return ig1Var.f33711o0.getMeasuredHeight();
                }
                return 0;
        }
        return i11 + i12;
    }

    @Override
    public final boolean g(int i10) {
        switch (this.f39227a) {
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
        switch (this.f39227a) {
            case 0:
                return 0;
            case 1:
                return 0;
            case 2:
                int currentActionBarHeight = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight;
                eo eoVar = (eo) this.f39228b;
                lVar = ((org.telegram.ui.ActionBar.p2) eoVar).actionBar;
                if (lVar != null) {
                    lVar2 = ((org.telegram.ui.ActionBar.p2) eoVar).actionBar;
                    int measuredHeight = lVar2.getMeasuredHeight();
                    lVar3 = ((org.telegram.ui.ActionBar.p2) eoVar).actionBar;
                    i11 = lVar3.getTop() + measuredHeight;
                } else {
                    i11 = 0;
                }
                max = Math.max(currentActionBarHeight, i11);
                max2 = (int) Math.max(0.0f, eoVar.f32500t9);
                break;
            case 3:
                return 0;
            case 4:
                wy wyVar = (wy) this.f39228b;
                lVar4 = ((org.telegram.ui.ActionBar.p2) wyVar).actionBar;
                int i15 = 0;
                if (lVar4 != null) {
                    lVar5 = ((org.telegram.ui.ActionBar.p2) wyVar).actionBar;
                    i12 = lVar5.getMeasuredHeight();
                } else {
                    i12 = 0;
                }
                uw uwVar = wyVar.f38536z0;
                if (uwVar != null && uwVar.getVisibility() == 0) {
                    i13 = wyVar.f38536z0.getMeasuredHeight();
                } else {
                    i13 = 0;
                }
                int i16 = i12 + i13;
                org.telegram.ui.Components.qs qsVar = wyVar.J1;
                if (qsVar != null) {
                    i14 = qsVar.getHeight();
                } else {
                    i14 = 0;
                }
                int i17 = i16 + i14;
                nx nxVar = wyVar.E0;
                if (nxVar != null && wyVar.G0) {
                    i15 = (int) ((1.0f - nxVar.getCollapsedProgress()) * AndroidUtilities.dp(81.0f));
                }
                return AndroidUtilities.dp(48.0f) + i17 + i15;
            case 5:
                return 0;
            case 6:
                PhotoViewer photoViewer = ((wu0) this.f39228b).E0;
                return org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight + ((int) (photoViewer.V1.getAlpha() * photoViewer.V1.getEditTextHeight()));
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

    private final void A(org.telegram.ui.Components.pc pcVar) {
    }

    private final void B(org.telegram.ui.Components.pc pcVar) {
    }

    private final void C(org.telegram.ui.Components.pc pcVar) {
    }

    private final void D(org.telegram.ui.Components.pc pcVar) {
    }

    private final void E(org.telegram.ui.Components.pc pcVar) {
    }

    private final void F(org.telegram.ui.Components.pc pcVar) {
    }

    private final void G(org.telegram.ui.Components.pc pcVar) {
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

    private final void p(org.telegram.ui.Components.pc pcVar) {
    }

    private final void q(org.telegram.ui.Components.pc pcVar) {
    }

    private final void r(org.telegram.ui.Components.pc pcVar) {
    }

    private final void s(org.telegram.ui.Components.pc pcVar) {
    }

    private final void t(org.telegram.ui.Components.pc pcVar) {
    }

    private final void u(org.telegram.ui.Components.pc pcVar) {
    }

    private final void v(org.telegram.ui.Components.pc pcVar) {
    }

    private final void w(org.telegram.ui.Components.pc pcVar) {
    }

    private final void x(org.telegram.ui.Components.pc pcVar) {
    }

    private final void y(org.telegram.ui.Components.pc pcVar) {
    }

    private final void z(org.telegram.ui.Components.pc pcVar) {
    }
}
