package org.telegram.ui;

import android.view.View;
import android.widget.FrameLayout;
import org.telegram.ui.Components.UndoView;
public final class z8 implements org.telegram.ui.Components.ua {
    public final int f43845a;
    public final Object f43846b;

    public z8(Object obj, int i10) {
        this.f43845a = i10;
        this.f43846b = obj;
    }

    @Override
    public final boolean a() {
        switch (this.f43845a) {
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
        switch (this.f43845a) {
            case 0:
            case 1:
                return;
            case 2:
                org.telegram.ui.Components.bb bbVar = wbVar.e;
                un unVar = (un) this.f43846b;
                vg.f c10 = unVar.K.c(bbVar, null, true);
                wg.d dVar = new wg.d(unVar.f42288xa);
                dVar.e = new xg.a(0);
                float N = org.telegram.messenger.i0.N(0.5f);
                float N2 = org.telegram.messenger.i0.N(0.5f);
                dVar.f52866f = N;
                dVar.h = N2;
                c10.o(dVar);
                c10.q(org.telegram.messenger.i0.L(16.0f));
                bbVar.setCustomBackground(c10);
                return;
            case 3:
                return;
            case 4:
                zx zxVar = (zx) this.f43846b;
                UndoView undoView = zxVar.f44240y0[0];
                if (undoView != null && undoView.getVisibility() == 0) {
                    zxVar.f44240y0[0].d(2, true);
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
        switch (this.f43845a) {
            case 0:
                j9 j9Var = (j9) this.f43846b;
                j9Var.S = Math.max(0.0f, (f7 - j9Var.T) - j9Var.R);
                j9Var.g0();
                return;
            case 1:
            case 2:
                return;
            case 3:
                ContactsActivity contactsActivity = (ContactsActivity) this.f43846b;
                contactsActivity.f33298j0 = Math.max(0.0f, (f7 - contactsActivity.f33299k0) - contactsActivity.f33297i0);
                contactsActivity.j0();
                return;
            case 4:
                zx zxVar = (zx) this.f43846b;
                UndoView undoView = zxVar.f44240y0[0];
                if (undoView == null || undoView.getVisibility() != 0) {
                    zxVar.f44219u1 = Math.max(0.0f, (f7 - zxVar.f44147f4) - zxVar.f44162i4);
                    zxVar.k5();
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
        int i10 = this.f43845a;
    }

    @Override
    public final boolean e() {
        switch (this.f43845a) {
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
                if (((ProfileActivity) this.f43846b).f33911s5 == null) {
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
        ds0 ds0Var;
        int L;
        float f7;
        int[] iArr;
        int[] iArr2;
        switch (this.f43845a) {
            case 0:
                j9 j9Var = (j9) this.f43846b;
                i11 = j9Var.T;
                i12 = j9Var.R;
                break;
            case 1:
                return ((zc) this.f43846b).O.getMeasuredHeight();
            case 2:
                un unVar = (un) this.f43846b;
                if (i10 == 1) {
                    return 0;
                }
                return Math.round(unVar.T.getInputBubbleHeight() + org.telegram.messenger.i0.L(16.0f) + unVar.o9(org.telegram.ui.Components.l21.f28037c) + unVar.f42264w.d());
            case 3:
                ContactsActivity contactsActivity = (ContactsActivity) this.f43846b;
                i11 = contactsActivity.f33299k0;
                i12 = contactsActivity.f33297i0;
                break;
            case 4:
                zx zxVar = (zx) this.f43846b;
                if (zxVar.Y2 != 0) {
                    return org.telegram.messenger.i0.L(60.0f) + zxVar.f44147f4;
                }
                return zxVar.w3();
            case 5:
                i12 = ((of0) this.f43846b).L;
                i11 = org.telegram.messenger.i0.L(64.0f);
                break;
            case 6:
                PhotoViewer photoViewer = ((zr0) this.f43846b).f44049n0;
                int i13 = 0;
                if (photoViewer.R4) {
                    hq0 hq0Var = photoViewer.U1;
                    if (hq0Var != null) {
                        i13 = hq0Var.L.f51832l;
                        if (hq0Var.getVisibility() == 0 && ((ds0Var = photoViewer.d) == null || !ds0Var.A())) {
                            i13 = org.telegram.messenger.m5.C(12.0f, photoViewer.U1.getEditTextHeight(), i13);
                        }
                    }
                    jg.b1 b1Var = photoViewer.P0;
                    if (b1Var != null && b1Var.getVisibility() == 0) {
                        hq0 hq0Var2 = photoViewer.U1;
                        if (hq0Var2 == null || !hq0Var2.L.c()) {
                            return i13 + photoViewer.P0.getHeight();
                        }
                        return i13;
                    }
                    return i13;
                }
                bg0 bg0Var = photoViewer.f33512i0;
                if (bg0Var != null && bg0Var.getVisibility() == 0) {
                    i13 = (int) ((photoViewer.f33512i0.getAlpha() * photoViewer.f33512i0.getHeight()) + 0);
                }
                org.telegram.ui.Components.d30 d30Var = photoViewer.l1;
                if (d30Var != null && d30Var.c()) {
                    if (org.telegram.messenger.i0.Q1() || photoViewer.f33477e0.getMeasuredHeight() > photoViewer.f33477e0.getMeasuredWidth()) {
                        return (int) ((photoViewer.l1.getAlpha() * photoViewer.l1.getHeight()) + i13);
                    }
                    return i13;
                }
                return i13;
            case 7:
                return ((PremiumPreviewFragment) this.f43846b).f33714o0.d;
            case 8:
                ProfileActivity profileActivity = (ProfileActivity) this.f43846b;
                int i14 = 0;
                if (profileActivity.f33911s5 == null) {
                    L = profileActivity.I6 + profileActivity.H6;
                } else {
                    L = ((int) (((org.telegram.messenger.i0.L(52.0f) - profileActivity.f33911s5.getTranslationY()) - (((1.0f - profileActivity.f33918t5[1].getAlpha()) * org.telegram.messenger.i0.L(72.0f)) * profileActivity.N.q0(9, false))) - (((1.0f - profileActivity.f33918t5[0].getAlpha()) * org.telegram.messenger.i0.L(72.0f)) * profileActivity.N.q0(8, true)))) + profileActivity.I6 + profileActivity.H6;
                }
                hx0 hx0Var = profileActivity.N;
                if (hx0Var != null && hx0Var.f24498a0 != null) {
                    f7 = hx0Var.q0(14, false);
                } else {
                    f7 = 0.0f;
                }
                if (f7 > 0.0f) {
                    org.telegram.ui.Components.wq0 wq0Var = profileActivity.N.f24498a0;
                    View view = profileActivity.fragmentView;
                    FrameLayout frameLayout = wq0Var.f45144r;
                    if (view != null && frameLayout != null && frameLayout.getVisibility() == 0 && frameLayout.getAlpha() > 0.0f) {
                        view.getLocationInWindow(new int[2]);
                        frameLayout.getLocationInWindow(new int[2]);
                        i14 = Math.max(0, (int) (frameLayout.getAlpha() * ((view.getHeight() + iArr[1]) - iArr2[1])));
                    }
                    return org.telegram.messenger.i0.W1(Math.min(1.0f, f7), L, Math.max(L, i14));
                }
                return L;
            default:
                nb1 nb1Var = (nb1) this.f43846b;
                bg0 bg0Var2 = nb1Var.f39828o0;
                if (bg0Var2 != null && bg0Var2.getVisibility() == 0) {
                    return nb1Var.f39828o0.getMeasuredHeight();
                }
                return 0;
        }
        return i11 + i12;
    }

    @Override
    public final boolean g(int i10) {
        switch (this.f43845a) {
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
        switch (this.f43845a) {
            case 0:
                return 0;
            case 1:
                return 0;
            case 2:
                int currentActionBarHeight = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + org.telegram.messenger.i0.f16166m;
                un unVar = (un) this.f43846b;
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
                zx zxVar = (zx) this.f43846b;
                lVar4 = ((org.telegram.ui.ActionBar.k2) zxVar).actionBar;
                int i15 = 0;
                if (lVar4 != null) {
                    lVar5 = ((org.telegram.ui.ActionBar.k2) zxVar).actionBar;
                    i12 = lVar5.getMeasuredHeight();
                } else {
                    i12 = 0;
                }
                px pxVar = zxVar.f44243z0;
                if (pxVar != null && pxVar.getVisibility() == 0) {
                    i13 = zxVar.f44243z0.getMeasuredHeight();
                } else {
                    i13 = 0;
                }
                int i16 = i12 + i13;
                org.telegram.ui.Components.zr zrVar = zxVar.J1;
                if (zrVar != null) {
                    i14 = zrVar.getHeight();
                } else {
                    i14 = 0;
                }
                int i17 = i16 + i14;
                tw twVar = zxVar.E0;
                if (twVar != null && zxVar.G0) {
                    i15 = (int) ((1.0f - twVar.getCollapsedProgress()) * org.telegram.messenger.i0.L(81.0f));
                }
                return org.telegram.messenger.i0.L(48.0f) + i17 + i15;
            case 5:
                return 0;
            case 6:
                return org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + org.telegram.messenger.i0.f16166m + ((int) (((zr0) this.f43846b).f44049n0.V1.getAlpha() * photoViewer.V1.getEditTextHeight()));
            case 7:
                return 0;
            case 8:
                max2 = org.telegram.messenger.i0.f16166m;
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
