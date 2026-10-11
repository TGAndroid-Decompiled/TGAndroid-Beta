package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.UndoView;
public final class x8 implements org.telegram.ui.Components.qb {
    public final int f44035a;
    public final Object f44036b;

    public x8(Object obj, int i10) {
        this.f44035a = i10;
        this.f44036b = obj;
    }

    @Override
    public final boolean a() {
        switch (this.f44035a) {
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
    public final void b(org.telegram.ui.Components.sc scVar) {
        switch (this.f44035a) {
            case 0:
            case 1:
                return;
            case 2:
                org.telegram.ui.Components.wb wbVar = scVar.f30829e;
                zn znVar = (zn) this.f44036b;
                ch.d c10 = znVar.J.c(wbVar, null, true);
                dh.e eVar = new dh.e(znVar.f44796ea);
                eVar.f8365e = new d2.c(4);
                float dpf2 = AndroidUtilities.dpf2(0.5f);
                float dpf22 = AndroidUtilities.dpf2(0.5f);
                eVar.f8366f = dpf2;
                eVar.h = dpf22;
                c10.o(eVar);
                c10.q(AndroidUtilities.dp(16.0f));
                wbVar.setCustomBackground(c10);
                return;
            case 3:
                return;
            case 4:
                sy syVar = (sy) this.f44036b;
                UndoView undoView = syVar.f42042y0[0];
                if (undoView != null && undoView.getVisibility() == 0) {
                    syVar.f42042y0[0].e(2, true);
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
        switch (this.f44035a) {
            case 0:
                i9 i9Var = (i9) this.f44036b;
                i9Var.V = Math.max(0.0f, (f7 - i9Var.W) - i9Var.U);
                i9Var.g0();
                return;
            case 1:
            case 2:
                return;
            case 3:
                ContactsActivity contactsActivity = (ContactsActivity) this.f44036b;
                contactsActivity.f33773p0 = Math.max(0.0f, (f7 - contactsActivity.f33774q0) - contactsActivity.f33772o0);
                contactsActivity.i0();
                return;
            case 4:
                sy syVar = (sy) this.f44036b;
                UndoView undoView = syVar.f42042y0[0];
                if (undoView == null || undoView.getVisibility() != 0) {
                    syVar.f42022u1 = Math.max(0.0f, (f7 - syVar.f41951f4) - syVar.f41966i4);
                    syVar.U4();
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
    public final void d(org.telegram.ui.Components.sc scVar) {
        int i10 = this.f44035a;
    }

    @Override
    public final boolean e() {
        switch (this.f44035a) {
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
                if (((ProfileActivity) this.f44036b).f34405s5 == null) {
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
        switch (this.f44035a) {
            case 0:
                i9 i9Var = (i9) this.f44036b;
                i11 = i9Var.W;
                i12 = i9Var.U;
                break;
            case 1:
                return ((ad) this.f44036b).O.getMeasuredHeight();
            case 2:
                zn znVar = (zn) this.f44036b;
                if (i10 == 1) {
                    return 0;
                }
                return Math.round(znVar.S.getInputBubbleHeight() + AndroidUtilities.dp(16.0f) + znVar.b9(org.telegram.ui.Components.z31.f33557c) + znVar.v.d());
            case 3:
                ContactsActivity contactsActivity = (ContactsActivity) this.f44036b;
                i11 = contactsActivity.f33774q0;
                i12 = contactsActivity.f33772o0;
                break;
            case 4:
                sy syVar = (sy) this.f44036b;
                if (syVar.X2 != 0) {
                    return AndroidUtilities.dp(60.0f) + syVar.f41951f4;
                }
                return syVar.k3();
            case 5:
                i12 = ((eh0) this.f44036b).L;
                i11 = AndroidUtilities.dp(64.0f);
                break;
            case 6:
                PhotoViewer photoViewer = ((vu0) this.f44036b).E0;
                int i13 = 0;
                if (photoViewer.R4) {
                    at0 at0Var = photoViewer.U1;
                    if (at0Var != null) {
                        i13 = at0Var.L.f5166l;
                        if (at0Var.getVisibility() == 0 && ((bv0Var = photoViewer.d) == null || !bv0Var.A())) {
                            i13 = org.telegram.messenger.q.C(12.0f, photoViewer.U1.getEditTextHeight(), i13);
                        }
                    }
                    s5 s5Var = photoViewer.P0;
                    if (s5Var != null && s5Var.getVisibility() == 0) {
                        at0 at0Var2 = photoViewer.U1;
                        if (at0Var2 == null || !at0Var2.L.c()) {
                            return i13 + photoViewer.P0.getHeight();
                        }
                        return i13;
                    }
                    return i13;
                }
                ai.x5 x5Var = photoViewer.f34001i0;
                if (x5Var != null && x5Var.getVisibility() == 0) {
                    i13 = (int) ((photoViewer.f34001i0.getAlpha() * photoViewer.f34001i0.getHeight()) + 0);
                }
                org.telegram.ui.Components.n40 n40Var = photoViewer.l1;
                if (n40Var != null && n40Var.c()) {
                    if (AndroidUtilities.isTablet() || photoViewer.f33966e0.getMeasuredHeight() > photoViewer.f33966e0.getMeasuredWidth()) {
                        return (int) ((photoViewer.l1.getAlpha() * photoViewer.l1.getHeight()) + i13);
                    }
                    return i13;
                }
                return i13;
            case 7:
                return ((PremiumPreviewFragment) this.f44036b).f34206o0.d;
            case 8:
                ProfileActivity profileActivity = (ProfileActivity) this.f44036b;
                if (profileActivity.f34405s5 == null) {
                    return profileActivity.f34357l6 + profileActivity.f34352k6;
                }
                return profileActivity.f34357l6 + profileActivity.f34352k6 + ((int) (((AndroidUtilities.dp(52.0f) - profileActivity.f34405s5.getTranslationY()) - (profileActivity.f34412t5[1].getTranslationY() * profileActivity.O.g0(9, false))) - (profileActivity.f34412t5[0].getTranslationY() * profileActivity.O.g0(8, true))));
            default:
                eg1 eg1Var = (eg1) this.f44036b;
                v51 v51Var = eg1Var.f37376o0;
                if (v51Var != null && v51Var.getVisibility() == 0) {
                    return eg1Var.f37376o0.getMeasuredHeight();
                }
                return 0;
        }
        return i11 + i12;
    }

    @Override
    public final boolean g(int i10) {
        switch (this.f44035a) {
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
        PhotoViewer photoViewer;
        switch (this.f44035a) {
            case 0:
                return 0;
            case 1:
                return 0;
            case 2:
                int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight;
                zn znVar = (zn) this.f44036b;
                kVar = ((org.telegram.ui.ActionBar.m2) znVar).actionBar;
                if (kVar != null) {
                    kVar2 = ((org.telegram.ui.ActionBar.m2) znVar).actionBar;
                    int measuredHeight = kVar2.getMeasuredHeight();
                    kVar3 = ((org.telegram.ui.ActionBar.m2) znVar).actionBar;
                    i11 = kVar3.getTop() + measuredHeight;
                } else {
                    i11 = 0;
                }
                max = Math.max(currentActionBarHeight, i11);
                max2 = (int) Math.max(0.0f, znVar.f44980t9);
                break;
            case 3:
                return 0;
            case 4:
                sy syVar = (sy) this.f44036b;
                kVar4 = ((org.telegram.ui.ActionBar.m2) syVar).actionBar;
                int i15 = 0;
                if (kVar4 != null) {
                    kVar5 = ((org.telegram.ui.ActionBar.m2) syVar).actionBar;
                    i12 = kVar5.getMeasuredHeight();
                } else {
                    i12 = 0;
                }
                qw qwVar = syVar.f42045z0;
                if (qwVar != null && qwVar.getVisibility() == 0) {
                    i13 = syVar.f42045z0.getMeasuredHeight();
                } else {
                    i13 = 0;
                }
                int i16 = i12 + i13;
                org.telegram.ui.Components.bt btVar = syVar.J1;
                if (btVar != null) {
                    i14 = btVar.getHeight();
                } else {
                    i14 = 0;
                }
                int i17 = i16 + i14;
                jx jxVar = syVar.E0;
                if (jxVar != null && syVar.G0) {
                    i15 = (int) ((1.0f - jxVar.getCollapsedProgress()) * AndroidUtilities.dp(81.0f));
                }
                return AndroidUtilities.dp(48.0f) + i17 + i15;
            case 5:
                return 0;
            case 6:
                return org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight + ((int) (((vu0) this.f44036b).E0.V1.getAlpha() * photoViewer.V1.getEditTextHeight()));
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

    private final void A(org.telegram.ui.Components.sc scVar) {
    }

    private final void B(org.telegram.ui.Components.sc scVar) {
    }

    private final void C(org.telegram.ui.Components.sc scVar) {
    }

    private final void D(org.telegram.ui.Components.sc scVar) {
    }

    private final void E(org.telegram.ui.Components.sc scVar) {
    }

    private final void F(org.telegram.ui.Components.sc scVar) {
    }

    private final void G(org.telegram.ui.Components.sc scVar) {
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

    private final void p(org.telegram.ui.Components.sc scVar) {
    }

    private final void q(org.telegram.ui.Components.sc scVar) {
    }

    private final void r(org.telegram.ui.Components.sc scVar) {
    }

    private final void s(org.telegram.ui.Components.sc scVar) {
    }

    private final void t(org.telegram.ui.Components.sc scVar) {
    }

    private final void u(org.telegram.ui.Components.sc scVar) {
    }

    private final void v(org.telegram.ui.Components.sc scVar) {
    }

    private final void w(org.telegram.ui.Components.sc scVar) {
    }

    private final void x(org.telegram.ui.Components.sc scVar) {
    }

    private final void y(org.telegram.ui.Components.sc scVar) {
    }

    private final void z(org.telegram.ui.Components.sc scVar) {
    }
}
