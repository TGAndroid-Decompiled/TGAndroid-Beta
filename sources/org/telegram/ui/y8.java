package org.telegram.ui;

import android.view.View;
import android.widget.FrameLayout;
import org.telegram.ui.Components.UndoView;
public final class y8 implements org.telegram.ui.Components.ab {
    public final int f52166a;
    public final Object f52167b;

    public y8(Object obj, int i7) {
        this.f52166a = i7;
        this.f52167b = obj;
    }

    @Override
    public final boolean a() {
        switch (this.f52166a) {
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
        switch (this.f52166a) {
            case 0:
            case 1:
                return;
            case 2:
                org.telegram.ui.Components.gb gbVar = ccVar.f32541e;
                an anVar = (an) this.f52167b;
                fh.g c10 = anVar.K.c(gbVar, null, true);
                gh.e eVar = new gh.e(anVar.f44028xa);
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
                ww wwVar = (ww) this.f52167b;
                UndoView undoView = wwVar.f51657y0[0];
                if (undoView != null && undoView.getVisibility() == 0) {
                    wwVar.f51657y0[0].d(2, true);
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
        switch (this.f52166a) {
            case 0:
                i9 i9Var = (i9) this.f52167b;
                i9Var.S = Math.max(0.0f, (f10 - i9Var.T) - i9Var.R);
                i9Var.g0();
                return;
            case 1:
            case 2:
                return;
            case 3:
                ContactsActivity contactsActivity = (ContactsActivity) this.f52167b;
                contactsActivity.f41193j0 = Math.max(0.0f, (f10 - contactsActivity.f41194k0) - contactsActivity.f41192i0);
                contactsActivity.j0();
                return;
            case 4:
                ww wwVar = (ww) this.f52167b;
                UndoView undoView = wwVar.f51657y0[0];
                if (undoView == null || undoView.getVisibility() != 0) {
                    wwVar.f51636u1 = Math.max(0.0f, (f10 - wwVar.f51566f4) - wwVar.f51581i4);
                    wwVar.k5();
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
        int i7 = this.f52166a;
    }

    @Override
    public final boolean e() {
        switch (this.f52166a) {
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
                if (((ProfileActivity) this.f52167b).s5 == null) {
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
        uq0 uq0Var;
        int L;
        float f10;
        int[] iArr;
        int[] iArr2;
        switch (this.f52166a) {
            case 0:
                i9 i9Var = (i9) this.f52167b;
                i10 = i9Var.T;
                i11 = i9Var.R;
                break;
            case 1:
                return ((rc) this.f52167b).O.getMeasuredHeight();
            case 2:
                an anVar = (an) this.f52167b;
                if (i7 == 1) {
                    return 0;
                }
                return Math.round(anVar.T.getInputBubbleHeight() + org.telegram.messenger.g0.L(16.0f) + anVar.r9(org.telegram.ui.Components.i11.f34506c) + anVar.f44004w.d());
            case 3:
                ContactsActivity contactsActivity = (ContactsActivity) this.f52167b;
                i10 = contactsActivity.f41194k0;
                i11 = contactsActivity.f41192i0;
                break;
            case 4:
                ww wwVar = (ww) this.f52167b;
                if (wwVar.Y2 != 0) {
                    return org.telegram.messenger.g0.L(60.0f) + wwVar.f51566f4;
                }
                return wwVar.w3();
            case 5:
                i11 = ((je0) this.f52167b).L;
                i10 = org.telegram.messenger.g0.L(64.0f);
                break;
            case 6:
                PhotoViewer photoViewer = ((pq0) this.f52167b).f48912n0;
                int i12 = 0;
                if (photoViewer.Q4) {
                    zo0 zo0Var = photoViewer.U1;
                    if (zo0Var != null) {
                        i12 = zo0Var.L.f12658l;
                        if (zo0Var.getVisibility() == 0 && ((uq0Var = photoViewer.d) == null || !uq0Var.A())) {
                            i12 = org.telegram.messenger.k5.C(12.0f, photoViewer.U1.getEditTextHeight(), i12);
                        }
                    }
                    bi.m5 m5Var = photoViewer.P0;
                    if (m5Var != null && m5Var.getVisibility() == 0) {
                        zo0 zo0Var2 = photoViewer.U1;
                        if (zo0Var2 == null || !zo0Var2.L.c()) {
                            return i12 + photoViewer.P0.getHeight();
                        }
                        return i12;
                    }
                    return i12;
                }
                di.a4 a4Var = photoViewer.f41420i0;
                if (a4Var != null && a4Var.getVisibility() == 0) {
                    i12 = (int) ((photoViewer.f41420i0.getAlpha() * photoViewer.f41420i0.getHeight()) + 0);
                }
                org.telegram.ui.Components.l20 l20Var = photoViewer.l1;
                if (l20Var != null && l20Var.c()) {
                    if (org.telegram.messenger.g0.Q1() || photoViewer.f41384e0.getMeasuredHeight() > photoViewer.f41384e0.getMeasuredWidth()) {
                        return (int) ((photoViewer.l1.getAlpha() * photoViewer.l1.getHeight()) + i12);
                    }
                    return i12;
                }
                return i12;
            case 7:
                return ((PremiumPreviewFragment) this.f52167b).f41624o0.d;
            case 8:
                ProfileActivity profileActivity = (ProfileActivity) this.f52167b;
                int i13 = 0;
                if (profileActivity.s5 == null) {
                    L = profileActivity.I6 + profileActivity.H6;
                } else {
                    L = ((int) (((org.telegram.messenger.g0.L(52.0f) - profileActivity.s5.getTranslationY()) - (((1.0f - profileActivity.f41830t5[1].getAlpha()) * org.telegram.messenger.g0.L(72.0f)) * profileActivity.N.r0(9, false))) - (((1.0f - profileActivity.f41830t5[0].getAlpha()) * org.telegram.messenger.g0.L(72.0f)) * profileActivity.N.r0(8, true)))) + profileActivity.I6 + profileActivity.H6;
                }
                vv0 vv0Var = profileActivity.N;
                if (vv0Var != null && vv0Var.f40391a0 != null) {
                    f10 = vv0Var.r0(14, false);
                } else {
                    f10 = 0.0f;
                }
                if (f10 > 0.0f) {
                    org.telegram.ui.Components.up0 up0Var = profileActivity.N.f40391a0;
                    View view = profileActivity.fragmentView;
                    FrameLayout frameLayout = up0Var.f60288r;
                    if (view != null && frameLayout != null && frameLayout.getVisibility() == 0 && frameLayout.getAlpha() > 0.0f) {
                        view.getLocationInWindow(new int[2]);
                        frameLayout.getLocationInWindow(new int[2]);
                        i13 = Math.max(0, (int) (frameLayout.getAlpha() * ((view.getHeight() + iArr[1]) - iArr2[1])));
                    }
                    return org.telegram.messenger.g0.W1(Math.min(1.0f, f10), L, Math.max(L, i13));
                }
                return L;
            default:
                w91 w91Var = (w91) this.f52167b;
                sq0 sq0Var = w91Var.f51023o0;
                if (sq0Var != null && sq0Var.getVisibility() == 0) {
                    return w91Var.f51023o0.getMeasuredHeight();
                }
                return 0;
        }
        return i10 + i11;
    }

    @Override
    public final boolean g(int i7) {
        switch (this.f52166a) {
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
        switch (this.f52166a) {
            case 0:
                return 0;
            case 1:
                return 0;
            case 2:
                int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + org.telegram.messenger.g0.f22557m;
                an anVar = (an) this.f52167b;
                kVar = ((org.telegram.ui.ActionBar.f2) anVar).actionBar;
                if (kVar != null) {
                    kVar2 = ((org.telegram.ui.ActionBar.f2) anVar).actionBar;
                    int measuredHeight = kVar2.getMeasuredHeight();
                    kVar3 = ((org.telegram.ui.ActionBar.f2) anVar).actionBar;
                    i10 = kVar3.getTop() + measuredHeight;
                } else {
                    i10 = 0;
                }
                max = Math.max(currentActionBarHeight, i10);
                max2 = (int) Math.max(0.0f, anVar.M9);
                break;
            case 3:
                return 0;
            case 4:
                ww wwVar = (ww) this.f52167b;
                kVar4 = ((org.telegram.ui.ActionBar.f2) wwVar).actionBar;
                int i14 = 0;
                if (kVar4 != null) {
                    kVar5 = ((org.telegram.ui.ActionBar.f2) wwVar).actionBar;
                    i11 = kVar5.getMeasuredHeight();
                } else {
                    i11 = 0;
                }
                mw mwVar = wwVar.f51661z0;
                if (mwVar != null && mwVar.getVisibility() == 0) {
                    i12 = wwVar.f51661z0.getMeasuredHeight();
                } else {
                    i12 = 0;
                }
                int i15 = i11 + i12;
                org.telegram.ui.Components.pr prVar = wwVar.J1;
                if (prVar != null) {
                    i13 = prVar.getHeight();
                } else {
                    i13 = 0;
                }
                int i16 = i15 + i13;
                pv pvVar = wwVar.E0;
                if (pvVar != null && wwVar.G0) {
                    i14 = (int) ((1.0f - pvVar.getCollapsedProgress()) * org.telegram.messenger.g0.L(81.0f));
                }
                return org.telegram.messenger.g0.L(48.0f) + i16 + i14;
            case 5:
                return 0;
            case 6:
                return org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + org.telegram.messenger.g0.f22557m + ((int) (((pq0) this.f52167b).f48912n0.V1.getAlpha() * photoViewer.V1.getEditTextHeight()));
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
