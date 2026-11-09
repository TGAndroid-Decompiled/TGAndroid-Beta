package org.telegram.ui;

import android.view.View;
import android.widget.FrameLayout;
import org.telegram.ui.Components.UndoView;
public final class y8 implements org.telegram.ui.Components.ab {
    public final int f51991a;
    public final Object f51992b;

    public y8(Object obj, int i7) {
        this.f51991a = i7;
        this.f51992b = obj;
    }

    @Override
    public final boolean a() {
        switch (this.f51991a) {
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
    public final void b(org.telegram.ui.Components.cc ccVar) {
        switch (this.f51991a) {
            case 0:
            case 1:
                return;
            case 2:
                org.telegram.ui.Components.gb gbVar = ccVar.f32623e;
                cn cnVar = (cn) this.f51992b;
                fh.g c10 = cnVar.K.c(gbVar, null, true);
                gh.e eVar = new gh.e(cnVar.f44709za);
                eVar.f13971e = new g2.c(9);
                float N = org.telegram.messenger.g0.N(0.5f);
                float N2 = org.telegram.messenger.g0.N(0.5f);
                eVar.f13972f = N;
                eVar.h = N2;
                c10.p(eVar);
                c10.r(org.telegram.messenger.g0.L(16.0f));
                gbVar.setCustomBackground(c10);
                return;
            case 3:
                return;
            case 4:
                yw ywVar = (yw) this.f51992b;
                UndoView undoView = ywVar.f52333y0[0];
                if (undoView != null && undoView.getVisibility() == 0) {
                    ywVar.f52333y0[0].d(2, true);
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
        switch (this.f51991a) {
            case 0:
                i9 i9Var = (i9) this.f51992b;
                i9Var.S = Math.max(0.0f, (f10 - i9Var.T) - i9Var.R);
                i9Var.g0();
                return;
            case 1:
            case 2:
                return;
            case 3:
                ContactsActivity contactsActivity = (ContactsActivity) this.f51992b;
                contactsActivity.f41200j0 = Math.max(0.0f, (f10 - contactsActivity.f41201k0) - contactsActivity.f41199i0);
                contactsActivity.j0();
                return;
            case 4:
                yw ywVar = (yw) this.f51992b;
                UndoView undoView = ywVar.f52333y0[0];
                if (undoView == null || undoView.getVisibility() != 0) {
                    ywVar.f52316v1 = Math.max(0.0f, (f10 - ywVar.f52246g4) - ywVar.f52260j4);
                    ywVar.k5();
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
    public final void d(org.telegram.ui.Components.cc ccVar) {
        int i7 = this.f51991a;
    }

    @Override
    public final boolean e() {
        switch (this.f51991a) {
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
                if (((ProfileActivity) this.f51992b).f41843u5 == null) {
                    return true;
                }
                return false;
            default:
                return true;
        }
    }

    @Override
    public final int f(int i7) {
        int i10;
        int i11;
        wq0 wq0Var;
        int L;
        float f10;
        int[] iArr;
        int[] iArr2;
        switch (this.f51991a) {
            case 0:
                i9 i9Var = (i9) this.f51992b;
                i10 = i9Var.T;
                i11 = i9Var.R;
                break;
            case 1:
                return ((rc) this.f51992b).O.getMeasuredHeight();
            case 2:
                cn cnVar = (cn) this.f51992b;
                if (i7 == 1) {
                    return 0;
                }
                return Math.round(cnVar.T.getInputBubbleHeight() + org.telegram.messenger.g0.L(16.0f) + cnVar.s9(org.telegram.ui.Components.j11.f34908c) + cnVar.f44661w.d());
            case 3:
                ContactsActivity contactsActivity = (ContactsActivity) this.f51992b;
                i10 = contactsActivity.f41201k0;
                i11 = contactsActivity.f41199i0;
                break;
            case 4:
                yw ywVar = (yw) this.f51992b;
                if (ywVar.Z2 != 0) {
                    return org.telegram.messenger.g0.L(60.0f) + ywVar.f52246g4;
                }
                return ywVar.w3();
            case 5:
                i11 = ((le0) this.f51992b).L;
                i10 = org.telegram.messenger.g0.L(64.0f);
                break;
            case 6:
                PhotoViewer photoViewer = ((rq0) this.f51992b).f49562n0;
                int i12 = 0;
                if (photoViewer.Q4) {
                    bp0 bp0Var = photoViewer.U1;
                    if (bp0Var != null) {
                        i12 = bp0Var.L.f12658l;
                        if (bp0Var.getVisibility() == 0 && ((wq0Var = photoViewer.d) == null || !wq0Var.A())) {
                            i12 = org.telegram.messenger.k5.C(12.0f, photoViewer.U1.getEditTextHeight(), i12);
                        }
                    }
                    bi.m5 m5Var = photoViewer.P0;
                    if (m5Var != null && m5Var.getVisibility() == 0) {
                        bp0 bp0Var2 = photoViewer.U1;
                        if (bp0Var2 == null || !bp0Var2.L.c()) {
                            return i12 + photoViewer.P0.getHeight();
                        }
                        return i12;
                    }
                    return i12;
                }
                di.b4 b4Var = photoViewer.f41427i0;
                if (b4Var != null && b4Var.getVisibility() == 0) {
                    i12 = (int) ((photoViewer.f41427i0.getAlpha() * photoViewer.f41427i0.getHeight()) + 0);
                }
                org.telegram.ui.Components.m20 m20Var = photoViewer.l1;
                if (m20Var != null && m20Var.c()) {
                    if (org.telegram.messenger.g0.Q1() || photoViewer.f41391e0.getMeasuredHeight() > photoViewer.f41391e0.getMeasuredWidth()) {
                        return (int) ((photoViewer.l1.getAlpha() * photoViewer.l1.getHeight()) + i12);
                    }
                    return i12;
                }
                return i12;
            case 7:
                return ((PremiumPreviewFragment) this.f51992b).f41631o0.d;
            case 8:
                ProfileActivity profileActivity = (ProfileActivity) this.f51992b;
                int i13 = 0;
                if (profileActivity.f41843u5 == null) {
                    L = profileActivity.L6 + profileActivity.K6;
                } else {
                    L = ((int) (((org.telegram.messenger.g0.L(52.0f) - profileActivity.f41843u5.getTranslationY()) - (((1.0f - profileActivity.f41850v5[1].getAlpha()) * org.telegram.messenger.g0.L(72.0f)) * profileActivity.N.r0(9, false))) - (((1.0f - profileActivity.f41850v5[0].getAlpha()) * org.telegram.messenger.g0.L(72.0f)) * profileActivity.N.r0(8, true)))) + profileActivity.L6 + profileActivity.K6;
                }
                xv0 xv0Var = profileActivity.N;
                if (xv0Var != null && xv0Var.f41057a0 != null) {
                    f10 = xv0Var.r0(14, false);
                } else {
                    f10 = 0.0f;
                }
                if (f10 > 0.0f) {
                    org.telegram.ui.Components.vp0 vp0Var = profileActivity.N.f41057a0;
                    View view = profileActivity.fragmentView;
                    FrameLayout frameLayout = vp0Var.f60298r;
                    if (view != null && frameLayout != null && frameLayout.getVisibility() == 0 && frameLayout.getAlpha() > 0.0f) {
                        view.getLocationInWindow(new int[2]);
                        frameLayout.getLocationInWindow(new int[2]);
                        i13 = Math.max(0, (int) (frameLayout.getAlpha() * ((view.getHeight() + iArr[1]) - iArr2[1])));
                    }
                    return org.telegram.messenger.g0.W1(Math.min(1.0f, f10), L, Math.max(L, i13));
                }
                return L;
            default:
                y91 y91Var = (y91) this.f51992b;
                uq0 uq0Var = y91Var.f52044o0;
                if (uq0Var != null && uq0Var.getVisibility() == 0) {
                    return y91Var.f52044o0.getMeasuredHeight();
                }
                return 0;
        }
        return i10 + i11;
    }

    @Override
    public final boolean g(int i7) {
        switch (this.f51991a) {
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
    public final int h(int i7) {
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
        PhotoViewer photoViewer;
        switch (this.f51991a) {
            case 0:
                return 0;
            case 1:
                return 0;
            case 2:
                int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + org.telegram.messenger.g0.f22557m;
                cn cnVar = (cn) this.f51992b;
                kVar = ((org.telegram.ui.ActionBar.f2) cnVar).actionBar;
                if (kVar != null) {
                    kVar2 = ((org.telegram.ui.ActionBar.f2) cnVar).actionBar;
                    int measuredHeight = kVar2.getMeasuredHeight();
                    kVar3 = ((org.telegram.ui.ActionBar.f2) cnVar).actionBar;
                    i10 = kVar3.getTop() + measuredHeight;
                } else {
                    i10 = 0;
                }
                max = Math.max(currentActionBarHeight, i10);
                max2 = (int) Math.max(0.0f, cnVar.O9);
                break;
            case 3:
                return 0;
            case 4:
                yw ywVar = (yw) this.f51992b;
                kVar4 = ((org.telegram.ui.ActionBar.f2) ywVar).actionBar;
                int i14 = 0;
                if (kVar4 != null) {
                    kVar5 = ((org.telegram.ui.ActionBar.f2) ywVar).actionBar;
                    i11 = kVar5.getMeasuredHeight();
                } else {
                    i11 = 0;
                }
                ow owVar = ywVar.f52337z0;
                if (owVar != null && owVar.getVisibility() == 0) {
                    i12 = ywVar.f52337z0.getMeasuredHeight();
                } else {
                    i12 = 0;
                }
                int i15 = i11 + i12;
                org.telegram.ui.Components.pr prVar = ywVar.K1;
                if (prVar != null) {
                    i13 = prVar.getHeight();
                } else {
                    i13 = 0;
                }
                int i16 = i15 + i13;
                rv rvVar = ywVar.E0;
                if (rvVar != null && ywVar.G0) {
                    i14 = (int) ((1.0f - rvVar.getCollapsedProgress()) * org.telegram.messenger.g0.L(81.0f));
                }
                return org.telegram.messenger.g0.L(48.0f) + i16 + i14;
            case 5:
                return 0;
            case 6:
                return org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + org.telegram.messenger.g0.f22557m + ((int) (((rq0) this.f51992b).f49562n0.V1.getAlpha() * photoViewer.V1.getEditTextHeight()));
            case 7:
                return 0;
            case 8:
                max2 = org.telegram.messenger.g0.f22557m;
                max = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                break;
            default:
                return 0;
        }
        return max + max2;
    }

    private final void A(org.telegram.ui.Components.cc ccVar) {
    }

    private final void B(org.telegram.ui.Components.cc ccVar) {
    }

    private final void C(org.telegram.ui.Components.cc ccVar) {
    }

    private final void D(org.telegram.ui.Components.cc ccVar) {
    }

    private final void E(org.telegram.ui.Components.cc ccVar) {
    }

    private final void F(org.telegram.ui.Components.cc ccVar) {
    }

    private final void G(org.telegram.ui.Components.cc ccVar) {
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

    private final void p(org.telegram.ui.Components.cc ccVar) {
    }

    private final void q(org.telegram.ui.Components.cc ccVar) {
    }

    private final void r(org.telegram.ui.Components.cc ccVar) {
    }

    private final void s(org.telegram.ui.Components.cc ccVar) {
    }

    private final void t(org.telegram.ui.Components.cc ccVar) {
    }

    private final void u(org.telegram.ui.Components.cc ccVar) {
    }

    private final void v(org.telegram.ui.Components.cc ccVar) {
    }

    private final void w(org.telegram.ui.Components.cc ccVar) {
    }

    private final void x(org.telegram.ui.Components.cc ccVar) {
    }

    private final void y(org.telegram.ui.Components.cc ccVar) {
    }

    private final void z(org.telegram.ui.Components.cc ccVar) {
    }
}
