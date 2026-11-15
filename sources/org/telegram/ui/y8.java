package org.telegram.ui;

import android.view.View;
import android.widget.FrameLayout;
import org.telegram.ui.Components.UndoView;
public final class y8 implements org.telegram.ui.Components.wa {
    public final int f53471a;
    public final Object f53472b;

    public y8(Object obj, int i7) {
        this.f53471a = i7;
        this.f53472b = obj;
    }

    @Override
    public final boolean a() {
        switch (this.f53471a) {
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
    public final void b(org.telegram.ui.Components.xb xbVar) {
        switch (this.f53471a) {
            case 0:
            case 1:
                return;
            case 2:
                org.telegram.ui.Components.cb cbVar = xbVar.f41631e;
                an anVar = (an) this.f53472b;
                fh.g c10 = anVar.L.c(cbVar, null, true);
                gh.e eVar = new gh.e(anVar.Aa);
                eVar.f13313e = new g0.e(11);
                float N = org.telegram.messenger.g0.N(0.5f);
                float N2 = org.telegram.messenger.g0.N(0.5f);
                eVar.f13314f = N;
                eVar.h = N2;
                c10.p(eVar);
                c10.r(org.telegram.messenger.g0.L(16.0f));
                cbVar.setCustomBackground(c10);
                return;
            case 3:
                return;
            case 4:
                yw ywVar = (yw) this.f53472b;
                UndoView undoView = ywVar.f53739z0[0];
                if (undoView != null && undoView.getVisibility() == 0) {
                    ywVar.f53739z0[0].d(2, true);
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
        switch (this.f53471a) {
            case 0:
                i9 i9Var = (i9) this.f53472b;
                i9Var.T = Math.max(0.0f, (f10 - i9Var.U) - i9Var.S);
                i9Var.g0();
                return;
            case 1:
            case 2:
                return;
            case 3:
                ContactsActivity contactsActivity = (ContactsActivity) this.f53472b;
                contactsActivity.f42547k0 = Math.max(0.0f, (f10 - contactsActivity.f42548l0) - contactsActivity.f42546j0);
                contactsActivity.j0();
                return;
            case 4:
                yw ywVar = (yw) this.f53472b;
                UndoView undoView = ywVar.f53739z0[0];
                if (undoView == null || undoView.getVisibility() != 0) {
                    ywVar.f53723w1 = Math.max(0.0f, (f10 - ywVar.f53652h4) - ywVar.f53666k4);
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
    public final void d(org.telegram.ui.Components.xb xbVar) {
        int i7 = this.f53471a;
    }

    @Override
    public final boolean e() {
        switch (this.f53471a) {
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
                if (((ProfileActivity) this.f53472b).f43222w5 == null) {
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
        sq0 sq0Var;
        int L;
        float f10;
        int[] iArr;
        int[] iArr2;
        switch (this.f53471a) {
            case 0:
                i9 i9Var = (i9) this.f53472b;
                i10 = i9Var.U;
                i11 = i9Var.S;
                break;
            case 1:
                return ((qc) this.f53472b).P.getMeasuredHeight();
            case 2:
                an anVar = (an) this.f53472b;
                if (i7 == 1) {
                    return 0;
                }
                return Math.round(anVar.U.getInputBubbleHeight() + org.telegram.messenger.g0.L(16.0f) + anVar.t9(org.telegram.ui.Components.l11.f36690c) + anVar.f45402w.d());
            case 3:
                ContactsActivity contactsActivity = (ContactsActivity) this.f53472b;
                i10 = contactsActivity.f42548l0;
                i11 = contactsActivity.f42546j0;
                break;
            case 4:
                yw ywVar = (yw) this.f53472b;
                if (ywVar.f53613a3 != 0) {
                    return org.telegram.messenger.g0.L(60.0f) + ywVar.f53652h4;
                }
                return ywVar.w3();
            case 5:
                i11 = ((je0) this.f53472b).M;
                i10 = org.telegram.messenger.g0.L(64.0f);
                break;
            case 6:
                PhotoViewer photoViewer = ((oq0) this.f53472b).f50026o0;
                int i12 = 0;
                if (photoViewer.R4) {
                    xo0 xo0Var = photoViewer.V1;
                    if (xo0Var != null) {
                        i12 = xo0Var.M.f14851l;
                        if (xo0Var.getVisibility() == 0 && ((sq0Var = photoViewer.d) == null || !sq0Var.A())) {
                            i12 = org.telegram.messenger.k5.C(12.0f, photoViewer.V1.getEditTextHeight(), i12);
                        }
                    }
                    di.k4 k4Var = photoViewer.Q0;
                    if (k4Var != null && k4Var.getVisibility() == 0) {
                        xo0 xo0Var2 = photoViewer.V1;
                        if (xo0Var2 == null || !xo0Var2.M.c()) {
                            return i12 + photoViewer.Q0.getHeight();
                        }
                        return i12;
                    }
                    return i12;
                }
                eh0 eh0Var = photoViewer.f42797j0;
                if (eh0Var != null && eh0Var.getVisibility() == 0) {
                    i12 = (int) ((photoViewer.f42797j0.getAlpha() * photoViewer.f42797j0.getHeight()) + 0);
                }
                org.telegram.ui.Components.o20 o20Var = photoViewer.f42822m1;
                if (o20Var != null && o20Var.c()) {
                    if (org.telegram.messenger.g0.Q1() || photoViewer.f42763f0.getMeasuredHeight() > photoViewer.f42763f0.getMeasuredWidth()) {
                        return (int) ((photoViewer.f42822m1.getAlpha() * photoViewer.f42822m1.getHeight()) + i12);
                    }
                    return i12;
                }
                return i12;
            case 7:
                return ((PremiumPreviewFragment) this.f53472b).f42995p0.d;
            case 8:
                ProfileActivity profileActivity = (ProfileActivity) this.f53472b;
                int i13 = 0;
                if (profileActivity.f43222w5 == null) {
                    L = profileActivity.N6 + profileActivity.M6;
                } else {
                    L = ((int) (((org.telegram.messenger.g0.L(52.0f) - profileActivity.f43222w5.getTranslationY()) - (((1.0f - profileActivity.f43230x5[1].getAlpha()) * org.telegram.messenger.g0.L(72.0f)) * profileActivity.O.r0(9, false))) - (((1.0f - profileActivity.f43230x5[0].getAlpha()) * org.telegram.messenger.g0.L(72.0f)) * profileActivity.O.r0(8, true)))) + profileActivity.N6 + profileActivity.M6;
                }
                uv0 uv0Var = profileActivity.O;
                if (uv0Var != null && uv0Var.f42082b0 != null) {
                    f10 = uv0Var.r0(14, false);
                } else {
                    f10 = 0.0f;
                }
                if (f10 > 0.0f) {
                    org.telegram.ui.Components.wp0 wp0Var = profileActivity.O.f42082b0;
                    View view = profileActivity.fragmentView;
                    FrameLayout frameLayout = wp0Var.f3616r;
                    if (view != null && frameLayout != null && frameLayout.getVisibility() == 0 && frameLayout.getAlpha() > 0.0f) {
                        view.getLocationInWindow(new int[2]);
                        frameLayout.getLocationInWindow(new int[2]);
                        i13 = Math.max(0, (int) (frameLayout.getAlpha() * ((view.getHeight() + iArr[1]) - iArr2[1])));
                    }
                    return org.telegram.messenger.g0.W1(Math.min(1.0f, f10), L, Math.max(L, i13));
                }
                return L;
            default:
                u91 u91Var = (u91) this.f53472b;
                eh0 eh0Var2 = u91Var.f51868p0;
                if (eh0Var2 != null && eh0Var2.getVisibility() == 0) {
                    return u91Var.f51868p0.getMeasuredHeight();
                }
                return 0;
        }
        return i10 + i11;
    }

    @Override
    public final boolean g(int i7) {
        switch (this.f53471a) {
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
        switch (this.f53471a) {
            case 0:
                return 0;
            case 1:
                return 0;
            case 2:
                int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + org.telegram.messenger.g0.f23605m;
                an anVar = (an) this.f53472b;
                kVar = ((org.telegram.ui.ActionBar.e2) anVar).actionBar;
                if (kVar != null) {
                    kVar2 = ((org.telegram.ui.ActionBar.e2) anVar).actionBar;
                    int measuredHeight = kVar2.getMeasuredHeight();
                    kVar3 = ((org.telegram.ui.ActionBar.e2) anVar).actionBar;
                    i10 = kVar3.getTop() + measuredHeight;
                } else {
                    i10 = 0;
                }
                max = Math.max(currentActionBarHeight, i10);
                max2 = (int) Math.max(0.0f, anVar.P9);
                break;
            case 3:
                return 0;
            case 4:
                yw ywVar = (yw) this.f53472b;
                kVar4 = ((org.telegram.ui.ActionBar.e2) ywVar).actionBar;
                int i14 = 0;
                if (kVar4 != null) {
                    kVar5 = ((org.telegram.ui.ActionBar.e2) ywVar).actionBar;
                    i11 = kVar5.getMeasuredHeight();
                } else {
                    i11 = 0;
                }
                ow owVar = ywVar.A0;
                if (owVar != null && owVar.getVisibility() == 0) {
                    i12 = ywVar.A0.getMeasuredHeight();
                } else {
                    i12 = 0;
                }
                int i15 = i11 + i12;
                org.telegram.ui.Components.vr vrVar = ywVar.L1;
                if (vrVar != null) {
                    i13 = vrVar.getHeight();
                } else {
                    i13 = 0;
                }
                int i16 = i15 + i13;
                qv qvVar = ywVar.F0;
                if (qvVar != null && ywVar.H0) {
                    i14 = (int) ((1.0f - qvVar.getCollapsedProgress()) * org.telegram.messenger.g0.L(81.0f));
                }
                return org.telegram.messenger.g0.L(48.0f) + i16 + i14;
            case 5:
                return 0;
            case 6:
                return org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + org.telegram.messenger.g0.f23605m + ((int) (((oq0) this.f53472b).f50026o0.W1.getAlpha() * photoViewer.W1.getEditTextHeight()));
            case 7:
                return 0;
            case 8:
                max2 = org.telegram.messenger.g0.f23605m;
                max = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                break;
            default:
                return 0;
        }
        return max + max2;
    }

    private final void A(org.telegram.ui.Components.xb xbVar) {
    }

    private final void B(org.telegram.ui.Components.xb xbVar) {
    }

    private final void C(org.telegram.ui.Components.xb xbVar) {
    }

    private final void D(org.telegram.ui.Components.xb xbVar) {
    }

    private final void E(org.telegram.ui.Components.xb xbVar) {
    }

    private final void F(org.telegram.ui.Components.xb xbVar) {
    }

    private final void G(org.telegram.ui.Components.xb xbVar) {
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

    private final void p(org.telegram.ui.Components.xb xbVar) {
    }

    private final void q(org.telegram.ui.Components.xb xbVar) {
    }

    private final void r(org.telegram.ui.Components.xb xbVar) {
    }

    private final void s(org.telegram.ui.Components.xb xbVar) {
    }

    private final void t(org.telegram.ui.Components.xb xbVar) {
    }

    private final void u(org.telegram.ui.Components.xb xbVar) {
    }

    private final void v(org.telegram.ui.Components.xb xbVar) {
    }

    private final void w(org.telegram.ui.Components.xb xbVar) {
    }

    private final void x(org.telegram.ui.Components.xb xbVar) {
    }

    private final void y(org.telegram.ui.Components.xb xbVar) {
    }

    private final void z(org.telegram.ui.Components.xb xbVar) {
    }
}
