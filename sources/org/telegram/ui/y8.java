package org.telegram.ui;

import android.view.View;
import android.widget.FrameLayout;
import org.telegram.ui.Components.UndoView;
public final class y8 implements org.telegram.ui.Components.fb {
    public final int f54053a;
    public final Object f54054b;

    public y8(Object obj, int i7) {
        this.f54053a = i7;
        this.f54054b = obj;
    }

    @Override
    public final boolean a() {
        switch (this.f54053a) {
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
        switch (this.f54053a) {
            case 0:
            case 1:
                return;
            case 2:
                org.telegram.ui.Components.lb lbVar = gcVar.f35485e;
                bn bnVar = (bn) this.f54054b;
                fh.g c10 = bnVar.L.c(lbVar, null, true);
                c10.p(c8.j0.c(bnVar.Ba));
                c10.r(org.telegram.messenger.g0.L(16.0f));
                lbVar.setCustomBackground(c10);
                return;
            case 3:
                return;
            case 4:
                cx cxVar = (cx) this.f54054b;
                UndoView undoView = cxVar.f46784z0[0];
                if (undoView != null && undoView.getVisibility() == 0) {
                    cxVar.f46784z0[0].d(2, true);
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
        switch (this.f54053a) {
            case 0:
                i9 i9Var = (i9) this.f54054b;
                i9Var.R = Math.max(0.0f, (f10 - i9Var.S) - i9Var.Q);
                i9Var.g0();
                return;
            case 1:
            case 2:
                return;
            case 3:
                ContactsActivity contactsActivity = (ContactsActivity) this.f54054b;
                contactsActivity.f43001k0 = Math.max(0.0f, (f10 - contactsActivity.f43002l0) - contactsActivity.f43000j0);
                contactsActivity.j0();
                return;
            case 4:
                cx cxVar = (cx) this.f54054b;
                UndoView undoView = cxVar.f46784z0[0];
                if (undoView == null || undoView.getVisibility() != 0) {
                    cxVar.f46768w1 = Math.max(0.0f, (f10 - cxVar.f46711k4) - cxVar.f46724n4);
                    cxVar.s5();
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
        int i7 = this.f54053a;
    }

    @Override
    public final boolean e() {
        switch (this.f54053a) {
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
                if (((ProfileActivity) this.f54054b).f43694y5 == null) {
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
        vq0 vq0Var;
        int L;
        float f10;
        int[] iArr;
        int[] iArr2;
        switch (this.f54053a) {
            case 0:
                i9 i9Var = (i9) this.f54054b;
                i10 = i9Var.S;
                i11 = i9Var.Q;
                break;
            case 1:
                return ((qc) this.f54054b).P.getMeasuredHeight();
            case 2:
                bn bnVar = (bn) this.f54054b;
                if (i7 == 1) {
                    return 0;
                }
                return Math.round(bnVar.U.getInputBubbleHeight() + org.telegram.messenger.g0.L(16.0f) + bnVar.t9(org.telegram.ui.Components.w11.f41600c) + bnVar.f46189w.d());
            case 3:
                ContactsActivity contactsActivity = (ContactsActivity) this.f54054b;
                i10 = contactsActivity.f43002l0;
                i11 = contactsActivity.f43000j0;
                break;
            case 4:
                cx cxVar = (cx) this.f54054b;
                if (cxVar.f46658a3 != 0) {
                    return org.telegram.messenger.g0.L(60.0f) + cxVar.f46711k4;
                }
                return cxVar.w3();
            case 5:
                i11 = ((le0) this.f54054b).M;
                i10 = org.telegram.messenger.g0.L(64.0f);
                break;
            case 6:
                PhotoViewer photoViewer = ((rq0) this.f54054b).f51788o0;
                int i12 = 0;
                if (photoViewer.R4) {
                    bp0 bp0Var = photoViewer.V1;
                    if (bp0Var != null) {
                        i12 = bp0Var.M.f15114l;
                        if (bp0Var.getVisibility() == 0 && ((vq0Var = photoViewer.d) == null || !vq0Var.A())) {
                            i12 = org.telegram.messenger.f3.C(12.0f, photoViewer.V1.getEditTextHeight(), i12);
                        }
                    }
                    di.n4 n4Var = photoViewer.Q0;
                    if (n4Var != null && n4Var.getVisibility() == 0) {
                        bp0 bp0Var2 = photoViewer.V1;
                        if (bp0Var2 == null || !bp0Var2.M.c()) {
                            return i12 + photoViewer.Q0.getHeight();
                        }
                        return i12;
                    }
                    return i12;
                }
                ih0 ih0Var = photoViewer.f43252j0;
                if (ih0Var != null && ih0Var.getVisibility() == 0) {
                    i12 = (int) ((photoViewer.f43252j0.getAlpha() * photoViewer.f43252j0.getHeight()) + 0);
                }
                org.telegram.ui.Components.z20 z20Var = photoViewer.f43277m1;
                if (z20Var != null && z20Var.c()) {
                    if (org.telegram.messenger.g0.Q1() || photoViewer.f43218f0.getMeasuredHeight() > photoViewer.f43218f0.getMeasuredWidth()) {
                        return (int) ((photoViewer.f43277m1.getAlpha() * photoViewer.f43277m1.getHeight()) + i12);
                    }
                    return i12;
                }
                return i12;
            case 7:
                return ((PremiumPreviewFragment) this.f54054b).f43450p0.d;
            case 8:
                ProfileActivity profileActivity = (ProfileActivity) this.f54054b;
                int i13 = 0;
                if (profileActivity.f43694y5 == null) {
                    L = profileActivity.P6 + profileActivity.O6;
                } else {
                    L = ((int) (((org.telegram.messenger.g0.L(52.0f) - profileActivity.f43694y5.getTranslationY()) - (((1.0f - profileActivity.f43701z5[1].getAlpha()) * org.telegram.messenger.g0.L(72.0f)) * profileActivity.O.r0(9, false))) - (((1.0f - profileActivity.f43701z5[0].getAlpha()) * org.telegram.messenger.g0.L(72.0f)) * profileActivity.O.r0(8, true)))) + profileActivity.P6 + profileActivity.O6;
                }
                wv0 wv0Var = profileActivity.O;
                if (wv0Var != null && wv0Var.f36568b0 != null) {
                    f10 = wv0Var.r0(14, false);
                } else {
                    f10 = 0.0f;
                }
                if (f10 > 0.0f) {
                    org.telegram.ui.Components.gq0 gq0Var = profileActivity.O.f36568b0;
                    View view = profileActivity.fragmentView;
                    FrameLayout frameLayout = gq0Var.f4154r;
                    if (view != null && frameLayout != null && frameLayout.getVisibility() == 0 && frameLayout.getAlpha() > 0.0f) {
                        view.getLocationInWindow(new int[2]);
                        frameLayout.getLocationInWindow(new int[2]);
                        i13 = Math.max(0, (int) (frameLayout.getAlpha() * ((view.getHeight() + iArr[1]) - iArr2[1])));
                    }
                    return org.telegram.messenger.g0.W1(Math.min(1.0f, f10), L, Math.max(L, i13));
                }
                return L;
            default:
                y91 y91Var = (y91) this.f54054b;
                ih0 ih0Var2 = y91Var.f54108p0;
                if (ih0Var2 != null && ih0Var2.getVisibility() == 0) {
                    return y91Var.f54108p0.getMeasuredHeight();
                }
                return 0;
        }
        return i10 + i11;
    }

    @Override
    public final boolean g(int i7) {
        switch (this.f54053a) {
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
        switch (this.f54053a) {
            case 0:
                return 0;
            case 1:
                return 0;
            case 2:
                int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + org.telegram.messenger.g0.f24004m;
                bn bnVar = (bn) this.f54054b;
                kVar = ((org.telegram.ui.ActionBar.g2) bnVar).actionBar;
                if (kVar != null) {
                    kVar2 = ((org.telegram.ui.ActionBar.g2) bnVar).actionBar;
                    int measuredHeight = kVar2.getMeasuredHeight();
                    kVar3 = ((org.telegram.ui.ActionBar.g2) bnVar).actionBar;
                    i10 = kVar3.getTop() + measuredHeight;
                } else {
                    i10 = 0;
                }
                max = Math.max(currentActionBarHeight, i10);
                max2 = (int) Math.max(0.0f, bnVar.Q9);
                break;
            case 3:
                return 0;
            case 4:
                cx cxVar = (cx) this.f54054b;
                kVar4 = ((org.telegram.ui.ActionBar.g2) cxVar).actionBar;
                int i14 = 0;
                if (kVar4 != null) {
                    kVar5 = ((org.telegram.ui.ActionBar.g2) cxVar).actionBar;
                    i11 = kVar5.getMeasuredHeight();
                } else {
                    i11 = 0;
                }
                rw rwVar = cxVar.A0;
                if (rwVar != null && rwVar.getVisibility() == 0) {
                    i12 = cxVar.A0.getMeasuredHeight();
                } else {
                    i12 = 0;
                }
                int i15 = i11 + i12;
                org.telegram.ui.Components.es esVar = cxVar.L1;
                if (esVar != null) {
                    i13 = esVar.getHeight();
                } else {
                    i13 = 0;
                }
                int i16 = i15 + i13;
                tv tvVar = cxVar.F0;
                if (tvVar != null && cxVar.H0) {
                    i14 = (int) ((1.0f - tvVar.getCollapsedProgress()) * org.telegram.messenger.g0.L(81.0f));
                }
                return org.telegram.messenger.g0.L(48.0f) + i16 + i14;
            case 5:
                return 0;
            case 6:
                return org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + org.telegram.messenger.g0.f24004m + ((int) (((rq0) this.f54054b).f51788o0.W1.getAlpha() * photoViewer.W1.getEditTextHeight()));
            case 7:
                return 0;
            case 8:
                max2 = org.telegram.messenger.g0.f24004m;
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
