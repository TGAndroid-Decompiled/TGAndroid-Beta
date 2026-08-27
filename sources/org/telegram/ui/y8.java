package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.UndoView;

public final class y8 implements org.telegram.ui.Components.db {

    public final int f44725a;

    public final Object f44726b;

    public y8(Object obj, int i10) {
        this.f44725a = i10;
        this.f44726b = obj;
    }

    @Override
    public final boolean a() {
        switch (this.f44725a) {
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
    public final void b(org.telegram.ui.Components.ec ecVar) {
        switch (this.f44725a) {
            case 2:
                org.telegram.ui.Components.jb jbVar = ecVar.f28016e;
                rn rnVar = (rn) this.f44726b;
                lg.d dVarC = rnVar.F.c(jbVar, null, true);
                mg.d dVar = new mg.d(rnVar.f41983aa);
                dVar.f18050e = new ng.a(2);
                float fDpf2 = AndroidUtilities.dpf2(0.5f);
                float fDpf3 = AndroidUtilities.dpf2(0.5f);
                dVar.f18051f = fDpf2;
                dVar.h = fDpf3;
                dVarC.n(dVar);
                dVarC.p(AndroidUtilities.dp(16.0f));
                jbVar.setCustomBackground(dVarC);
                break;
            case 4:
                gy gyVar = (gy) this.f44726b;
                UndoView undoView = gyVar.f38600u0[0];
                if (undoView != null && undoView.getVisibility() == 0) {
                    gyVar.f38600u0[0].e(2, true);
                    break;
                }
                break;
        }
    }

    @Override
    public final void c(float f10) {
        switch (this.f44725a) {
            case 0:
                j9 j9Var = (j9) this.f44726b;
                j9Var.R = Math.max(0.0f, (f10 - j9Var.S) - j9Var.Q);
                j9Var.g0();
                break;
            case 3:
                ContactsActivity contactsActivity = (ContactsActivity) this.f44726b;
                contactsActivity.f35430l0 = Math.max(0.0f, (f10 - contactsActivity.m0) - contactsActivity.f35429k0);
                contactsActivity.i0();
                break;
            case 4:
                gy gyVar = (gy) this.f44726b;
                UndoView undoView = gyVar.f38600u0[0];
                if (undoView == null || undoView.getVisibility() != 0) {
                    gyVar.f38580q1 = Math.max(0.0f, (f10 - gyVar.f38512c4) - gyVar.f38529f4);
                    gyVar.X4();
                }
                break;
        }
    }

    @Override
    public final void d(org.telegram.ui.Components.ec ecVar) {
        int i10 = this.f44725a;
    }

    @Override
    public final boolean e() {
        switch (this.f44725a) {
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
                return ((ProfileActivity) this.f44726b).f36026o5 == null;
            default:
                return true;
        }
    }

    @Override
    public final int f(int i10) {
        int iDp;
        int i11;
        au0 au0Var;
        switch (this.f44725a) {
            case 0:
                j9 j9Var = (j9) this.f44726b;
                iDp = j9Var.S;
                i11 = j9Var.Q;
                break;
            case 1:
                return ((xc) this.f44726b).K.getMeasuredHeight();
            case 2:
                rn rnVar = (rn) this.f44726b;
                if (i10 == 1) {
                    return 0;
                }
                return Math.round(rnVar.O.getInputBubbleHeight() + AndroidUtilities.dp(16.0f) + rnVar.W8(org.telegram.ui.Components.z11.f35132c) + rnVar.v.c());
            case 3:
                ContactsActivity contactsActivity = (ContactsActivity) this.f44726b;
                iDp = contactsActivity.m0;
                i11 = contactsActivity.f35429k0;
                break;
            case 4:
                gy gyVar = (gy) this.f44726b;
                return gyVar.T2 != 0 ? AndroidUtilities.dp(60.0f) + gyVar.f38512c4 : gyVar.n3();
            case 5:
                i11 = ((qg0) this.f44726b).H;
                iDp = AndroidUtilities.dp(64.0f);
                break;
            case 6:
                PhotoViewer photoViewer = ((ut0) this.f44726b).A0;
                int alpha = 0;
                if (!photoViewer.N4) {
                    ag.d dVar = photoViewer.f35620e0;
                    if (dVar != null && dVar.getVisibility() == 0) {
                        alpha = (int) ((photoViewer.f35620e0.getAlpha() * photoViewer.f35620e0.getHeight()) + 0);
                    }
                    org.telegram.ui.Components.k30 k30Var = photoViewer.f35649h1;
                    if (k30Var == null || !k30Var.c()) {
                        return alpha;
                    }
                    return (AndroidUtilities.isTablet() || photoViewer.f35583a0.getMeasuredHeight() > photoViewer.f35583a0.getMeasuredWidth()) ? (int) ((photoViewer.f35649h1.getAlpha() * photoViewer.f35649h1.getHeight()) + alpha) : alpha;
                }
                zr0 zr0Var = photoViewer.Q1;
                if (zr0Var != null) {
                    alpha = zr0Var.H.f15642l;
                    if (zr0Var.getVisibility() == 0 && ((au0Var = photoViewer.d) == null || !au0Var.A())) {
                        alpha = org.telegram.messenger.y1.C(12.0f, photoViewer.Q1.getEditTextHeight(), alpha);
                    }
                }
                ag.w wVar = photoViewer.L0;
                if (wVar == null || wVar.getVisibility() != 0) {
                    return alpha;
                }
                zr0 zr0Var2 = photoViewer.Q1;
                return (zr0Var2 == null || !zr0Var2.H.c()) ? alpha + photoViewer.L0.getHeight() : alpha;
            case 7:
                return ((PremiumPreviewFragment) this.f44726b).f35857k0.d;
            case 8:
                ProfileActivity profileActivity = (ProfileActivity) this.f44726b;
                if (profileActivity.f36026o5 == null) {
                    return profileActivity.f35979h6 + profileActivity.f35972g6;
                }
                return profileActivity.f35979h6 + profileActivity.f35972g6 + ((int) (((AndroidUtilities.dp(52.0f) - profileActivity.f36026o5.getTranslationY()) - (profileActivity.f36033p5[1].getTranslationY() * profileActivity.K.g0(9, false))) - (profileActivity.f36033p5[0].getTranslationY() * profileActivity.K.g0(8, true))));
            default:
                we1 we1Var = (we1) this.f44726b;
                z71 z71Var = we1Var.f43743k0;
                if (z71Var == null || z71Var.getVisibility() != 0) {
                    return 0;
                }
                return we1Var.f43743k0.getMeasuredHeight();
        }
        return iDp + i11;
    }

    @Override
    public final boolean g(int i10) {
        switch (this.f44725a) {
        }
        return false;
    }

    @Override
    public final int h(int i10) {
        int top;
        int iMax;
        int iMax2;
        switch (this.f44725a) {
            case 0:
                return 0;
            case 1:
                return 0;
            case 2:
                int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight;
                rn rnVar = (rn) this.f44726b;
                if (((org.telegram.ui.ActionBar.n2) rnVar).actionBar != null) {
                    top = ((org.telegram.ui.ActionBar.n2) rnVar).actionBar.getTop() + ((org.telegram.ui.ActionBar.n2) rnVar).actionBar.getMeasuredHeight();
                } else {
                    top = 0;
                }
                iMax = Math.max(currentActionBarHeight, top);
                iMax2 = (int) Math.max(0.0f, rnVar.p9);
                break;
            case 3:
                return 0;
            case 4:
                gy gyVar = (gy) this.f44726b;
                int collapsedProgress = 0;
                int measuredHeight = ((org.telegram.ui.ActionBar.n2) gyVar).actionBar != null ? ((org.telegram.ui.ActionBar.n2) gyVar).actionBar.getMeasuredHeight() : 0;
                fw fwVar = gyVar.f38604v0;
                int measuredHeight2 = measuredHeight + ((fwVar == null || fwVar.getVisibility() != 0) ? 0 : gyVar.f38604v0.getMeasuredHeight());
                org.telegram.ui.Components.zr zrVar = gyVar.F1;
                int height = measuredHeight2 + (zrVar != null ? zrVar.getHeight() : 0);
                yw ywVar = gyVar.A0;
                if (ywVar != null && gyVar.C0) {
                    collapsedProgress = (int) ((1.0f - ywVar.getCollapsedProgress()) * AndroidUtilities.dp(81.0f));
                }
                return AndroidUtilities.dp(48.0f) + height + collapsedProgress;
            case 5:
                return 0;
            case 6:
                PhotoViewer photoViewer = ((ut0) this.f44726b).A0;
                return org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight + ((int) (photoViewer.R1.getAlpha() * photoViewer.R1.getEditTextHeight()));
            case 7:
                return 0;
            case 8:
                iMax2 = AndroidUtilities.statusBarHeight;
                iMax = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                break;
            default:
                return 0;
        }
        return iMax + iMax2;
    }

    private final void A(org.telegram.ui.Components.ec ecVar) {
    }

    private final void B(org.telegram.ui.Components.ec ecVar) {
    }

    private final void C(org.telegram.ui.Components.ec ecVar) {
    }

    private final void D(org.telegram.ui.Components.ec ecVar) {
    }

    private final void E(org.telegram.ui.Components.ec ecVar) {
    }

    private final void F(org.telegram.ui.Components.ec ecVar) {
    }

    private final void G(org.telegram.ui.Components.ec ecVar) {
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

    private final void p(org.telegram.ui.Components.ec ecVar) {
    }

    private final void q(org.telegram.ui.Components.ec ecVar) {
    }

    private final void r(org.telegram.ui.Components.ec ecVar) {
    }

    private final void s(org.telegram.ui.Components.ec ecVar) {
    }

    private final void t(org.telegram.ui.Components.ec ecVar) {
    }

    private final void u(org.telegram.ui.Components.ec ecVar) {
    }

    private final void v(org.telegram.ui.Components.ec ecVar) {
    }

    private final void w(org.telegram.ui.Components.ec ecVar) {
    }

    private final void x(org.telegram.ui.Components.ec ecVar) {
    }

    private final void y(org.telegram.ui.Components.ec ecVar) {
    }

    private final void z(org.telegram.ui.Components.ec ecVar) {
    }
}
