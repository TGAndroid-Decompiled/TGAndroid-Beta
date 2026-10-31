package org.telegram.ui;

import android.view.View;
import android.widget.FrameLayout;
import org.telegram.ui.Components.UndoView;
public final class z8 implements org.telegram.ui.Components.ua {
    public final int f44047a;
    public final Object f44048b;

    public z8(Object obj, int i10) {
        this.f44047a = i10;
        this.f44048b = obj;
    }

    @Override
    public final boolean a() {
        switch (this.f44047a) {
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
    public final void b(org.telegram.ui.Components.wb wbVar) {
        switch (this.f44047a) {
            case 0:
            case 1:
                return;
            case 2:
                org.telegram.ui.Components.bb bbVar = wbVar.e;
                un unVar = (un) this.f44048b;
                vg.f c10 = unVar.K.c(bbVar, null, true);
                wg.d dVar = new wg.d(unVar.f42477xa);
                dVar.e = new xg.a(0);
                float N = org.telegram.messenger.i0.N(0.5f);
                float N2 = org.telegram.messenger.i0.N(0.5f);
                dVar.f52848f = N;
                dVar.h = N2;
                c10.o(dVar);
                c10.q(org.telegram.messenger.i0.L(16.0f));
                bbVar.setCustomBackground(c10);
                return;
            case 3:
                return;
            case 4:
                ay ayVar = (ay) this.f44048b;
                UndoView undoView = ayVar.f35897y0[0];
                if (undoView != null && undoView.getVisibility() == 0) {
                    ayVar.f35897y0[0].d(2, true);
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
        switch (this.f44047a) {
            case 0:
                j9 j9Var = (j9) this.f44048b;
                j9Var.S = Math.max(0.0f, (f7 - j9Var.T) - j9Var.R);
                j9Var.f0();
                return;
            case 1:
            case 2:
                return;
            case 3:
                ContactsActivity contactsActivity = (ContactsActivity) this.f44048b;
                contactsActivity.f33291j0 = Math.max(0.0f, (f7 - contactsActivity.f33292k0) - contactsActivity.f33290i0);
                contactsActivity.i0();
                return;
            case 4:
                ay ayVar = (ay) this.f44048b;
                UndoView undoView = ayVar.f35897y0[0];
                if (undoView == null || undoView.getVisibility() != 0) {
                    ayVar.f35876u1 = Math.max(0.0f, (f7 - ayVar.f35804f4) - ayVar.f35819i4);
                    ayVar.j5();
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
    public final void d(org.telegram.ui.Components.wb wbVar) {
        int i10 = this.f44047a;
    }

    @Override
    public final boolean e() {
        switch (this.f44047a) {
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
                if (((ProfileActivity) this.f44048b).f33904s5 == null) {
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
        es0 es0Var;
        int L;
        float f7;
        int[] iArr;
        int[] iArr2;
        switch (this.f44047a) {
            case 0:
                j9 j9Var = (j9) this.f44048b;
                i11 = j9Var.T;
                i12 = j9Var.R;
                break;
            case 1:
                return ((zc) this.f44048b).O.getMeasuredHeight();
            case 2:
                un unVar = (un) this.f44048b;
                if (i10 == 1) {
                    return 0;
                }
                return Math.round(unVar.T.getInputBubbleHeight() + org.telegram.messenger.i0.L(16.0f) + unVar.j9(org.telegram.ui.Components.k21.f27624c) + unVar.f42453w.d());
            case 3:
                ContactsActivity contactsActivity = (ContactsActivity) this.f44048b;
                i11 = contactsActivity.f33292k0;
                i12 = contactsActivity.f33290i0;
                break;
            case 4:
                ay ayVar = (ay) this.f44048b;
                if (ayVar.Y2 != 0) {
                    return org.telegram.messenger.i0.L(60.0f) + ayVar.f35804f4;
                }
                return ayVar.v3();
            case 5:
                i12 = ((pf0) this.f44048b).L;
                i11 = org.telegram.messenger.i0.L(64.0f);
                break;
            case 6:
                PhotoViewer photoViewer = ((as0) this.f44048b).f35706n0;
                int i13 = 0;
                if (photoViewer.R4) {
                    jq0 jq0Var = photoViewer.U1;
                    if (jq0Var != null) {
                        i13 = jq0Var.L.f51847l;
                        if (jq0Var.getVisibility() == 0 && ((es0Var = photoViewer.d) == null || !es0Var.A())) {
                            i13 = org.telegram.messenger.m5.C(12.0f, photoViewer.U1.getEditTextHeight(), i13);
                        }
                    }
                    jg.b1 b1Var = photoViewer.P0;
                    if (b1Var != null && b1Var.getVisibility() == 0) {
                        jq0 jq0Var2 = photoViewer.U1;
                        if (jq0Var2 == null || !jq0Var2.L.c()) {
                            return i13 + photoViewer.P0.getHeight();
                        }
                        return i13;
                    }
                    return i13;
                }
                dg0 dg0Var = photoViewer.f33505i0;
                if (dg0Var != null && dg0Var.getVisibility() == 0) {
                    i13 = (int) ((photoViewer.f33505i0.getAlpha() * photoViewer.f33505i0.getHeight()) + 0);
                }
                org.telegram.ui.Components.d30 d30Var = photoViewer.l1;
                if (d30Var != null && d30Var.c()) {
                    if (org.telegram.messenger.i0.Q1() || photoViewer.f33470e0.getMeasuredHeight() > photoViewer.f33470e0.getMeasuredWidth()) {
                        return (int) ((photoViewer.l1.getAlpha() * photoViewer.l1.getHeight()) + i13);
                    }
                    return i13;
                }
                return i13;
            case 7:
                return ((PremiumPreviewFragment) this.f44048b).f33707o0.d;
            case 8:
                ProfileActivity profileActivity = (ProfileActivity) this.f44048b;
                int i14 = 0;
                if (profileActivity.f33904s5 == null) {
                    L = profileActivity.H6 + profileActivity.G6;
                } else {
                    L = ((int) (((org.telegram.messenger.i0.L(52.0f) - profileActivity.f33904s5.getTranslationY()) - (((1.0f - profileActivity.f33911t5[1].getAlpha()) * org.telegram.messenger.i0.L(72.0f)) * profileActivity.N.p0(9, false))) - (((1.0f - profileActivity.f33911t5[0].getAlpha()) * org.telegram.messenger.i0.L(72.0f)) * profileActivity.N.p0(8, true)))) + profileActivity.H6 + profileActivity.G6;
                }
                ix0 ix0Var = profileActivity.N;
                if (ix0Var != null && ix0Var.f33170a0 != null) {
                    f7 = ix0Var.p0(14, false);
                } else {
                    f7 = 0.0f;
                }
                if (f7 > 0.0f) {
                    org.telegram.ui.Components.vq0 vq0Var = profileActivity.N.f33170a0;
                    View view = profileActivity.fragmentView;
                    FrameLayout frameLayout = vq0Var.f45133r;
                    if (view != null && frameLayout != null && frameLayout.getVisibility() == 0 && frameLayout.getAlpha() > 0.0f) {
                        view.getLocationInWindow(new int[2]);
                        frameLayout.getLocationInWindow(new int[2]);
                        i14 = Math.max(0, (int) (frameLayout.getAlpha() * ((view.getHeight() + iArr[1]) - iArr2[1])));
                    }
                    return org.telegram.messenger.i0.W1(Math.min(1.0f, f7), L, Math.max(L, i14));
                }
                return L;
            default:
                pb1 pb1Var = (pb1) this.f44048b;
                dg0 dg0Var2 = pb1Var.f40597o0;
                if (dg0Var2 != null && dg0Var2.getVisibility() == 0) {
                    return pb1Var.f40597o0.getMeasuredHeight();
                }
                return 0;
        }
        return i11 + i12;
    }

    @Override
    public final boolean g(int i10) {
        switch (this.f44047a) {
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
        PhotoViewer photoViewer;
        switch (this.f44047a) {
            case 0:
                return 0;
            case 1:
                return 0;
            case 2:
                int currentActionBarHeight = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + org.telegram.messenger.i0.f16020m;
                un unVar = (un) this.f44048b;
                lVar = ((org.telegram.ui.ActionBar.k2) unVar).actionBar;
                if (lVar != null) {
                    lVar2 = ((org.telegram.ui.ActionBar.k2) unVar).actionBar;
                    int measuredHeight = lVar2.getMeasuredHeight();
                    lVar3 = ((org.telegram.ui.ActionBar.k2) unVar).actionBar;
                    i11 = lVar3.getTop() + measuredHeight;
                } else {
                    i11 = 0;
                }
                max = Math.max(currentActionBarHeight, i11);
                max2 = (int) Math.max(0.0f, unVar.M9);
                break;
            case 3:
                return 0;
            case 4:
                ay ayVar = (ay) this.f44048b;
                lVar4 = ((org.telegram.ui.ActionBar.k2) ayVar).actionBar;
                int i15 = 0;
                if (lVar4 != null) {
                    lVar5 = ((org.telegram.ui.ActionBar.k2) ayVar).actionBar;
                    i12 = lVar5.getMeasuredHeight();
                } else {
                    i12 = 0;
                }
                qx qxVar = ayVar.f35900z0;
                if (qxVar != null && qxVar.getVisibility() == 0) {
                    i13 = ayVar.f35900z0.getMeasuredHeight();
                } else {
                    i13 = 0;
                }
                int i16 = i12 + i13;
                org.telegram.ui.Components.zr zrVar = ayVar.J1;
                if (zrVar != null) {
                    i14 = zrVar.getHeight();
                } else {
                    i14 = 0;
                }
                int i17 = i16 + i14;
                uw uwVar = ayVar.E0;
                if (uwVar != null && ayVar.G0) {
                    i15 = (int) ((1.0f - uwVar.getCollapsedProgress()) * org.telegram.messenger.i0.L(81.0f));
                }
                return org.telegram.messenger.i0.L(48.0f) + i17 + i15;
            case 5:
                return 0;
            case 6:
                return org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + org.telegram.messenger.i0.f16020m + ((int) (((as0) this.f44048b).f35706n0.V1.getAlpha() * photoViewer.V1.getEditTextHeight()));
            case 7:
                return 0;
            case 8:
                max2 = org.telegram.messenger.i0.f16020m;
                max = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
                break;
            default:
                return 0;
        }
        return max + max2;
    }

    private final void A(org.telegram.ui.Components.wb wbVar) {
    }

    private final void B(org.telegram.ui.Components.wb wbVar) {
    }

    private final void C(org.telegram.ui.Components.wb wbVar) {
    }

    private final void D(org.telegram.ui.Components.wb wbVar) {
    }

    private final void E(org.telegram.ui.Components.wb wbVar) {
    }

    private final void F(org.telegram.ui.Components.wb wbVar) {
    }

    private final void G(org.telegram.ui.Components.wb wbVar) {
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

    private final void p(org.telegram.ui.Components.wb wbVar) {
    }

    private final void q(org.telegram.ui.Components.wb wbVar) {
    }

    private final void r(org.telegram.ui.Components.wb wbVar) {
    }

    private final void s(org.telegram.ui.Components.wb wbVar) {
    }

    private final void t(org.telegram.ui.Components.wb wbVar) {
    }

    private final void u(org.telegram.ui.Components.wb wbVar) {
    }

    private final void v(org.telegram.ui.Components.wb wbVar) {
    }

    private final void w(org.telegram.ui.Components.wb wbVar) {
    }

    private final void x(org.telegram.ui.Components.wb wbVar) {
    }

    private final void y(org.telegram.ui.Components.wb wbVar) {
    }

    private final void z(org.telegram.ui.Components.wb wbVar) {
    }
}
