package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.UndoView;
public final class y8 implements org.telegram.ui.Components.rb {
    public final int f44319a;
    public final Object f44320b;

    public y8(Object obj, int i10) {
        this.f44319a = i10;
        this.f44320b = obj;
    }

    @Override
    public final boolean a() {
        switch (this.f44319a) {
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
    public final void b(org.telegram.ui.Components.tc tcVar) {
        switch (this.f44319a) {
            case 0:
            case 1:
                return;
            case 2:
                org.telegram.ui.Components.xb xbVar = tcVar.f31092e;
                zn znVar = (zn) this.f44320b;
                ch.d c10 = znVar.J.c(xbVar, null, true);
                dh.e eVar = new dh.e(znVar.f44807ea);
                eVar.f8366e = new d2.c(4);
                float dpf2 = AndroidUtilities.dpf2(0.5f);
                float dpf22 = AndroidUtilities.dpf2(0.5f);
                eVar.f8367f = dpf2;
                eVar.h = dpf22;
                c10.o(eVar);
                c10.q(AndroidUtilities.dp(16.0f));
                xbVar.setCustomBackground(c10);
                return;
            case 3:
                return;
            case 4:
                ty tyVar = (ty) this.f44320b;
                UndoView undoView = tyVar.f42319y0[0];
                if (undoView != null && undoView.getVisibility() == 0) {
                    tyVar.f42319y0[0].e(2, true);
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
        switch (this.f44319a) {
            case 0:
                j9 j9Var = (j9) this.f44320b;
                j9Var.V = Math.max(0.0f, (f7 - j9Var.W) - j9Var.U);
                j9Var.g0();
                return;
            case 1:
            case 2:
                return;
            case 3:
                ContactsActivity contactsActivity = (ContactsActivity) this.f44320b;
                contactsActivity.f33749p0 = Math.max(0.0f, (f7 - contactsActivity.f33750q0) - contactsActivity.f33748o0);
                contactsActivity.i0();
                return;
            case 4:
                ty tyVar = (ty) this.f44320b;
                UndoView undoView = tyVar.f42319y0[0];
                if (undoView == null || undoView.getVisibility() != 0) {
                    tyVar.f42299u1 = Math.max(0.0f, (f7 - tyVar.f42228f4) - tyVar.f42243i4);
                    tyVar.U4();
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
    public final void d(org.telegram.ui.Components.tc tcVar) {
        int i10 = this.f44319a;
    }

    @Override
    public final boolean e() {
        switch (this.f44319a) {
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
                if (((ProfileActivity) this.f44320b).f34381s5 == null) {
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
        switch (this.f44319a) {
            case 0:
                j9 j9Var = (j9) this.f44320b;
                i11 = j9Var.W;
                i12 = j9Var.U;
                break;
            case 1:
                return ((bd) this.f44320b).O.getMeasuredHeight();
            case 2:
                zn znVar = (zn) this.f44320b;
                if (i10 == 1) {
                    return 0;
                }
                return Math.round(znVar.S.getInputBubbleHeight() + AndroidUtilities.dp(16.0f) + znVar.b9(org.telegram.ui.Components.z31.f33503c) + znVar.v.d());
            case 3:
                ContactsActivity contactsActivity = (ContactsActivity) this.f44320b;
                i11 = contactsActivity.f33750q0;
                i12 = contactsActivity.f33748o0;
                break;
            case 4:
                ty tyVar = (ty) this.f44320b;
                if (tyVar.X2 != 0) {
                    return AndroidUtilities.dp(60.0f) + tyVar.f42228f4;
                }
                return tyVar.k3();
            case 5:
                i12 = ((fh0) this.f44320b).L;
                i11 = AndroidUtilities.dp(64.0f);
                break;
            case 6:
                PhotoViewer photoViewer = ((wu0) this.f44320b).E0;
                int i13 = 0;
                if (photoViewer.R4) {
                    bt0 bt0Var = photoViewer.U1;
                    if (bt0Var != null) {
                        i13 = bt0Var.L.f5167l;
                        if (bt0Var.getVisibility() == 0 && ((cv0Var = photoViewer.d) == null || !cv0Var.A())) {
                            i13 = org.telegram.messenger.q.C(12.0f, photoViewer.U1.getEditTextHeight(), i13);
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
                ai.x5 x5Var = photoViewer.f33977i0;
                if (x5Var != null && x5Var.getVisibility() == 0) {
                    i13 = (int) ((photoViewer.f33977i0.getAlpha() * photoViewer.f33977i0.getHeight()) + 0);
                }
                org.telegram.ui.Components.n40 n40Var = photoViewer.l1;
                if (n40Var != null && n40Var.c()) {
                    if (AndroidUtilities.isTablet() || photoViewer.f33942e0.getMeasuredHeight() > photoViewer.f33942e0.getMeasuredWidth()) {
                        return (int) ((photoViewer.l1.getAlpha() * photoViewer.l1.getHeight()) + i13);
                    }
                    return i13;
                }
                return i13;
            case 7:
                return ((PremiumPreviewFragment) this.f44320b).f34182o0.d;
            case 8:
                ProfileActivity profileActivity = (ProfileActivity) this.f44320b;
                if (profileActivity.f34381s5 == null) {
                    return profileActivity.f34333l6 + profileActivity.f34328k6;
                }
                return profileActivity.f34333l6 + profileActivity.f34328k6 + ((int) (((AndroidUtilities.dp(52.0f) - profileActivity.f34381s5.getTranslationY()) - (profileActivity.f34388t5[1].getTranslationY() * profileActivity.O.g0(9, false))) - (profileActivity.f34388t5[0].getTranslationY() * profileActivity.O.g0(8, true))));
            default:
                fg1 fg1Var = (fg1) this.f44320b;
                w51 w51Var = fg1Var.f37633o0;
                if (w51Var != null && w51Var.getVisibility() == 0) {
                    return fg1Var.f37633o0.getMeasuredHeight();
                }
                return 0;
        }
        return i11 + i12;
    }

    @Override
    public final boolean g(int i10) {
        switch (this.f44319a) {
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
        switch (this.f44319a) {
            case 0:
                return 0;
            case 1:
                return 0;
            case 2:
                int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight;
                zn znVar = (zn) this.f44320b;
                kVar = ((org.telegram.ui.ActionBar.n2) znVar).actionBar;
                if (kVar != null) {
                    kVar2 = ((org.telegram.ui.ActionBar.n2) znVar).actionBar;
                    int measuredHeight = kVar2.getMeasuredHeight();
                    kVar3 = ((org.telegram.ui.ActionBar.n2) znVar).actionBar;
                    i11 = kVar3.getTop() + measuredHeight;
                } else {
                    i11 = 0;
                }
                max = Math.max(currentActionBarHeight, i11);
                max2 = (int) Math.max(0.0f, znVar.f44991t9);
                break;
            case 3:
                return 0;
            case 4:
                ty tyVar = (ty) this.f44320b;
                kVar4 = ((org.telegram.ui.ActionBar.n2) tyVar).actionBar;
                int i15 = 0;
                if (kVar4 != null) {
                    kVar5 = ((org.telegram.ui.ActionBar.n2) tyVar).actionBar;
                    i12 = kVar5.getMeasuredHeight();
                } else {
                    i12 = 0;
                }
                qw qwVar = tyVar.f42322z0;
                if (qwVar != null && qwVar.getVisibility() == 0) {
                    i13 = tyVar.f42322z0.getMeasuredHeight();
                } else {
                    i13 = 0;
                }
                int i16 = i12 + i13;
                org.telegram.ui.Components.bt btVar = tyVar.J1;
                if (btVar != null) {
                    i14 = btVar.getHeight();
                } else {
                    i14 = 0;
                }
                int i17 = i16 + i14;
                kx kxVar = tyVar.E0;
                if (kxVar != null && tyVar.G0) {
                    i15 = (int) ((1.0f - kxVar.getCollapsedProgress()) * AndroidUtilities.dp(81.0f));
                }
                return AndroidUtilities.dp(48.0f) + i17 + i15;
            case 5:
                return 0;
            case 6:
                return org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight + ((int) (((wu0) this.f44320b).E0.V1.getAlpha() * photoViewer.V1.getEditTextHeight()));
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

    private final void A(org.telegram.ui.Components.tc tcVar) {
    }

    private final void B(org.telegram.ui.Components.tc tcVar) {
    }

    private final void C(org.telegram.ui.Components.tc tcVar) {
    }

    private final void D(org.telegram.ui.Components.tc tcVar) {
    }

    private final void E(org.telegram.ui.Components.tc tcVar) {
    }

    private final void F(org.telegram.ui.Components.tc tcVar) {
    }

    private final void G(org.telegram.ui.Components.tc tcVar) {
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

    private final void p(org.telegram.ui.Components.tc tcVar) {
    }

    private final void q(org.telegram.ui.Components.tc tcVar) {
    }

    private final void r(org.telegram.ui.Components.tc tcVar) {
    }

    private final void s(org.telegram.ui.Components.tc tcVar) {
    }

    private final void t(org.telegram.ui.Components.tc tcVar) {
    }

    private final void u(org.telegram.ui.Components.tc tcVar) {
    }

    private final void v(org.telegram.ui.Components.tc tcVar) {
    }

    private final void w(org.telegram.ui.Components.tc tcVar) {
    }

    private final void x(org.telegram.ui.Components.tc tcVar) {
    }

    private final void y(org.telegram.ui.Components.tc tcVar) {
    }

    private final void z(org.telegram.ui.Components.tc tcVar) {
    }
}
