package org.telegram.ui;

import android.view.View;
import android.widget.FrameLayout;
import org.telegram.ui.Components.UndoView;
public final class x8 implements org.telegram.ui.Components.za {
    public final int f51885a;
    public final Object f51886b;

    public x8(Object obj, int i3) {
        this.f51885a = i3;
        this.f51886b = obj;
    }

    @Override
    public final boolean a() {
        switch (this.f51885a) {
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
    public final void b(org.telegram.ui.Components.ac acVar) {
        switch (this.f51885a) {
            case 0:
            case 1:
                return;
            case 2:
                org.telegram.ui.Components.fb fbVar = acVar.f31788e;
                wm wmVar = (wm) this.f51886b;
                gh.g c2 = wmVar.L.c(fbVar, null, true);
                hh.e eVar = new hh.e(wmVar.f51557ya);
                eVar.f14417e = new gi.i8(9);
                float N = org.telegram.messenger.g0.N(0.5f);
                float N2 = org.telegram.messenger.g0.N(0.5f);
                eVar.f14418f = N;
                eVar.h = N2;
                c2.p(eVar);
                c2.r(org.telegram.messenger.g0.L(16.0f));
                fbVar.setCustomBackground(c2);
                return;
            case 3:
                return;
            case 4:
                uw uwVar = (uw) this.f51886b;
                UndoView undoView = uwVar.f50330z0[0];
                if (undoView != null && undoView.getVisibility() == 0) {
                    uwVar.f50330z0[0].d(2, true);
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
        switch (this.f51885a) {
            case 0:
                h9 h9Var = (h9) this.f51886b;
                h9Var.T = Math.max(0.0f, (f10 - h9Var.U) - h9Var.S);
                h9Var.g0();
                return;
            case 1:
            case 2:
                return;
            case 3:
                ContactsActivity contactsActivity = (ContactsActivity) this.f51886b;
                contactsActivity.f41222k0 = Math.max(0.0f, (f10 - contactsActivity.f41223l0) - contactsActivity.f41221j0);
                contactsActivity.j0();
                return;
            case 4:
                uw uwVar = (uw) this.f51886b;
                UndoView undoView = uwVar.f50330z0[0];
                if (undoView == null || undoView.getVisibility() != 0) {
                    uwVar.f50309v1 = Math.max(0.0f, (f10 - uwVar.f50239g4) - uwVar.f50253j4);
                    uwVar.k5();
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
    public final void d(org.telegram.ui.Components.ac acVar) {
        int i3 = this.f51885a;
    }

    @Override
    public final boolean e() {
        switch (this.f51885a) {
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
                if (((ProfileActivity) this.f51886b).f41857t5 == null) {
                    return true;
                }
                return false;
            default:
                return true;
        }
    }

    @Override
    public final int f(int i3) {
        int i10;
        int i11;
        kq0 kq0Var;
        int L;
        float f10;
        int[] iArr;
        int[] iArr2;
        switch (this.f51885a) {
            case 0:
                h9 h9Var = (h9) this.f51886b;
                i10 = h9Var.U;
                i11 = h9Var.S;
                break;
            case 1:
                return ((pc) this.f51886b).P.getMeasuredHeight();
            case 2:
                wm wmVar = (wm) this.f51886b;
                if (i3 == 1) {
                    return 0;
                }
                return Math.round(wmVar.U.getInputBubbleHeight() + org.telegram.messenger.g0.L(16.0f) + wmVar.r9(org.telegram.ui.Components.c11.f32503c) + wmVar.f51520w.d());
            case 3:
                ContactsActivity contactsActivity = (ContactsActivity) this.f51886b;
                i10 = contactsActivity.f41223l0;
                i11 = contactsActivity.f41221j0;
                break;
            case 4:
                uw uwVar = (uw) this.f51886b;
                if (uwVar.Z2 != 0) {
                    return org.telegram.messenger.g0.L(60.0f) + uwVar.f50239g4;
                }
                return uwVar.w3();
            case 5:
                i11 = ((ee0) this.f51886b).M;
                i10 = org.telegram.messenger.g0.L(64.0f);
                break;
            case 6:
                PhotoViewer photoViewer = ((gq0) this.f51886b).f45705o0;
                int i12 = 0;
                if (photoViewer.S4) {
                    qo0 qo0Var = photoViewer.V1;
                    if (qo0Var != null) {
                        i12 = qo0Var.M.f13367l;
                        if (qo0Var.getVisibility() == 0 && ((kq0Var = photoViewer.d) == null || !kq0Var.A())) {
                            i12 = org.telegram.messenger.k5.C(12.0f, photoViewer.V1.getEditTextHeight(), i12);
                        }
                    }
                    ci.t4 t4Var = photoViewer.Q0;
                    if (t4Var != null && t4Var.getVisibility() == 0) {
                        qo0 qo0Var2 = photoViewer.V1;
                        if (qo0Var2 == null || !qo0Var2.M.c()) {
                            return i12 + photoViewer.Q0.getHeight();
                        }
                        return i12;
                    }
                    return i12;
                }
                yg0 yg0Var = photoViewer.f41453j0;
                if (yg0Var != null && yg0Var.getVisibility() == 0) {
                    i12 = (int) ((photoViewer.f41453j0.getAlpha() * photoViewer.f41453j0.getHeight()) + 0);
                }
                org.telegram.ui.Components.h20 h20Var = photoViewer.m1;
                if (h20Var != null && h20Var.c()) {
                    if (org.telegram.messenger.g0.Q1() || photoViewer.f41420f0.getMeasuredHeight() > photoViewer.f41420f0.getMeasuredWidth()) {
                        return (int) ((photoViewer.m1.getAlpha() * photoViewer.m1.getHeight()) + i12);
                    }
                    return i12;
                }
                return i12;
            case 7:
                return ((PremiumPreviewFragment) this.f51886b).f41652p0.d;
            case 8:
                ProfileActivity profileActivity = (ProfileActivity) this.f51886b;
                int i13 = 0;
                if (profileActivity.f41857t5 == null) {
                    L = profileActivity.J6 + profileActivity.I6;
                } else {
                    L = ((int) (((org.telegram.messenger.g0.L(52.0f) - profileActivity.f41857t5.getTranslationY()) - (((1.0f - profileActivity.f41864u5[1].getAlpha()) * org.telegram.messenger.g0.L(72.0f)) * profileActivity.O.r0(9, false))) - (((1.0f - profileActivity.f41864u5[0].getAlpha()) * org.telegram.messenger.g0.L(72.0f)) * profileActivity.O.r0(8, true)))) + profileActivity.J6 + profileActivity.I6;
                }
                mv0 mv0Var = profileActivity.O;
                if (mv0Var != null && mv0Var.f40072b0 != null) {
                    f10 = mv0Var.r0(14, false);
                } else {
                    f10 = 0.0f;
                }
                if (f10 > 0.0f) {
                    org.telegram.ui.Components.vp0 vp0Var = profileActivity.O.f40072b0;
                    View view = profileActivity.fragmentView;
                    FrameLayout frameLayout = vp0Var.f1016r;
                    if (view != null && frameLayout != null && frameLayout.getVisibility() == 0 && frameLayout.getAlpha() > 0.0f) {
                        view.getLocationInWindow(new int[2]);
                        frameLayout.getLocationInWindow(new int[2]);
                        i13 = Math.max(0, (int) (frameLayout.getAlpha() * ((view.getHeight() + iArr[1]) - iArr2[1])));
                    }
                    return org.telegram.messenger.g0.W1(Math.min(1.0f, f10), L, Math.max(L, i13));
                }
                return L;
            default:
                m91 m91Var = (m91) this.f51886b;
                yg0 yg0Var2 = m91Var.f47608p0;
                if (yg0Var2 != null && yg0Var2.getVisibility() == 0) {
                    return m91Var.f47608p0.getMeasuredHeight();
                }
                return 0;
        }
        return i10 + i11;
    }

    @Override
    public final boolean g(int i3) {
        switch (this.f51885a) {
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
    public final int h(int i3) {
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
        switch (this.f51885a) {
            case 0:
                return 0;
            case 1:
                return 0;
            case 2:
                int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + org.telegram.messenger.g0.f22602m;
                wm wmVar = (wm) this.f51886b;
                kVar = ((org.telegram.ui.ActionBar.d2) wmVar).actionBar;
                if (kVar != null) {
                    kVar2 = ((org.telegram.ui.ActionBar.d2) wmVar).actionBar;
                    int measuredHeight = kVar2.getMeasuredHeight();
                    kVar3 = ((org.telegram.ui.ActionBar.d2) wmVar).actionBar;
                    i10 = kVar3.getTop() + measuredHeight;
                } else {
                    i10 = 0;
                }
                max = Math.max(currentActionBarHeight, i10);
                max2 = (int) Math.max(0.0f, wmVar.N9);
                break;
            case 3:
                return 0;
            case 4:
                uw uwVar = (uw) this.f51886b;
                kVar4 = ((org.telegram.ui.ActionBar.d2) uwVar).actionBar;
                int i14 = 0;
                if (kVar4 != null) {
                    kVar5 = ((org.telegram.ui.ActionBar.d2) uwVar).actionBar;
                    i11 = kVar5.getMeasuredHeight();
                } else {
                    i11 = 0;
                }
                jw jwVar = uwVar.A0;
                if (jwVar != null && jwVar.getVisibility() == 0) {
                    i12 = uwVar.A0.getMeasuredHeight();
                } else {
                    i12 = 0;
                }
                int i15 = i11 + i12;
                org.telegram.ui.Components.pr prVar = uwVar.K1;
                if (prVar != null) {
                    i13 = prVar.getHeight();
                } else {
                    i13 = 0;
                }
                int i16 = i15 + i13;
                mv mvVar = uwVar.F0;
                if (mvVar != null && uwVar.H0) {
                    i14 = (int) ((1.0f - mvVar.getCollapsedProgress()) * org.telegram.messenger.g0.L(81.0f));
                }
                return org.telegram.messenger.g0.L(48.0f) + i16 + i14;
            case 5:
                return 0;
            case 6:
                return org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + org.telegram.messenger.g0.f22602m + ((int) (((gq0) this.f51886b).f45705o0.W1.getAlpha() * photoViewer.W1.getEditTextHeight()));
            case 7:
                return 0;
            case 8:
                max2 = org.telegram.messenger.g0.f22602m;
                max = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                break;
            default:
                return 0;
        }
        return max + max2;
    }

    private final void A(org.telegram.ui.Components.ac acVar) {
    }

    private final void B(org.telegram.ui.Components.ac acVar) {
    }

    private final void C(org.telegram.ui.Components.ac acVar) {
    }

    private final void D(org.telegram.ui.Components.ac acVar) {
    }

    private final void E(org.telegram.ui.Components.ac acVar) {
    }

    private final void F(org.telegram.ui.Components.ac acVar) {
    }

    private final void G(org.telegram.ui.Components.ac acVar) {
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

    private final void p(org.telegram.ui.Components.ac acVar) {
    }

    private final void q(org.telegram.ui.Components.ac acVar) {
    }

    private final void r(org.telegram.ui.Components.ac acVar) {
    }

    private final void s(org.telegram.ui.Components.ac acVar) {
    }

    private final void t(org.telegram.ui.Components.ac acVar) {
    }

    private final void u(org.telegram.ui.Components.ac acVar) {
    }

    private final void v(org.telegram.ui.Components.ac acVar) {
    }

    private final void w(org.telegram.ui.Components.ac acVar) {
    }

    private final void x(org.telegram.ui.Components.ac acVar) {
    }

    private final void y(org.telegram.ui.Components.ac acVar) {
    }

    private final void z(org.telegram.ui.Components.ac acVar) {
    }
}
