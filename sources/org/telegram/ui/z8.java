package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.UndoView;
public final class z8 implements org.telegram.ui.Components.ob {
    public final int f40403a;
    public final Object f40404b;

    public z8(Object obj, int i10) {
        this.f40403a = i10;
        this.f40404b = obj;
    }

    @Override
    public final boolean a() {
        switch (this.f40403a) {
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
    public final void b(org.telegram.ui.Components.qc qcVar) {
        switch (this.f40403a) {
            case 0:
            case 1:
                return;
            case 2:
                org.telegram.ui.Components.ub ubVar = qcVar.e;
                wn wnVar = (wn) this.f40404b;
                ch.d c10 = wnVar.J.c(ubVar, null, true);
                dh.e eVar = new dh.e(wnVar.f39468ea);
                eVar.e = new d2.c(4);
                float dpf2 = AndroidUtilities.dpf2(0.5f);
                float dpf22 = AndroidUtilities.dpf2(0.5f);
                eVar.f7724f = dpf2;
                eVar.h = dpf22;
                c10.o(eVar);
                c10.q(AndroidUtilities.dp(16.0f));
                ubVar.setCustomBackground(c10);
                return;
            case 3:
                return;
            case 4:
                qy qyVar = (qy) this.f40404b;
                UndoView undoView = qyVar.f37133y0[0];
                if (undoView != null && undoView.getVisibility() == 0) {
                    qyVar.f37133y0[0].e(2, true);
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
        switch (this.f40403a) {
            case 0:
                k9 k9Var = (k9) this.f40404b;
                k9Var.V = Math.max(0.0f, (f7 - k9Var.W) - k9Var.U);
                k9Var.g0();
                return;
            case 1:
            case 2:
                return;
            case 3:
                ContactsActivity contactsActivity = (ContactsActivity) this.f40404b;
                contactsActivity.f31038p0 = Math.max(0.0f, (f7 - contactsActivity.f31039q0) - contactsActivity.f31037o0);
                contactsActivity.i0();
                return;
            case 4:
                qy qyVar = (qy) this.f40404b;
                UndoView undoView = qyVar.f37133y0[0];
                if (undoView == null || undoView.getVisibility() != 0) {
                    qyVar.f37113u1 = Math.max(0.0f, (f7 - qyVar.f37042f4) - qyVar.f37057i4);
                    qyVar.X4();
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
    public final void d(org.telegram.ui.Components.qc qcVar) {
        int i10 = this.f40403a;
    }

    @Override
    public final boolean e() {
        switch (this.f40403a) {
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
                if (((ProfileActivity) this.f40404b).f31654s5 == null) {
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
        tu0 tu0Var;
        switch (this.f40403a) {
            case 0:
                k9 k9Var = (k9) this.f40404b;
                i11 = k9Var.W;
                i12 = k9Var.U;
                break;
            case 1:
                return ((ad) this.f40404b).O.getMeasuredHeight();
            case 2:
                wn wnVar = (wn) this.f40404b;
                if (i10 == 1) {
                    return 0;
                }
                return Math.round(wnVar.S.getInputBubbleHeight() + AndroidUtilities.dp(16.0f) + wnVar.W8(org.telegram.ui.Components.h31.f24664c) + wnVar.v.c());
            case 3:
                ContactsActivity contactsActivity = (ContactsActivity) this.f40404b;
                i11 = contactsActivity.f31039q0;
                i12 = contactsActivity.f31037o0;
                break;
            case 4:
                qy qyVar = (qy) this.f40404b;
                if (qyVar.X2 != 0) {
                    return AndroidUtilities.dp(60.0f) + qyVar.f37042f4;
                }
                return qyVar.n3();
            case 5:
                i12 = ((yg0) this.f40404b).L;
                i11 = AndroidUtilities.dp(64.0f);
                break;
            case 6:
                PhotoViewer photoViewer = ((nu0) this.f40404b).E0;
                int i13 = 0;
                if (photoViewer.R4) {
                    ts0 ts0Var = photoViewer.U1;
                    if (ts0Var != null) {
                        i13 = ts0Var.L.f4782l;
                        if (ts0Var.getVisibility() == 0 && ((tu0Var = photoViewer.d) == null || !tu0Var.A())) {
                            i13 = org.telegram.messenger.f0.C(12.0f, photoViewer.U1.getEditTextHeight(), i13);
                        }
                    }
                    t5 t5Var = photoViewer.P0;
                    if (t5Var != null && t5Var.getVisibility() == 0) {
                        ts0 ts0Var2 = photoViewer.U1;
                        if (ts0Var2 == null || !ts0Var2.L.c()) {
                            return i13 + photoViewer.P0.getHeight();
                        }
                        return i13;
                    }
                    return i13;
                }
                ai.w5 w5Var = photoViewer.f31257i0;
                if (w5Var != null && w5Var.getVisibility() == 0) {
                    i13 = (int) ((photoViewer.f31257i0.getAlpha() * photoViewer.f31257i0.getHeight()) + 0);
                }
                org.telegram.ui.Components.x30 x30Var = photoViewer.l1;
                if (x30Var != null && x30Var.c()) {
                    if (AndroidUtilities.isTablet() || photoViewer.f31222e0.getMeasuredHeight() > photoViewer.f31222e0.getMeasuredWidth()) {
                        return (int) ((photoViewer.l1.getAlpha() * photoViewer.l1.getHeight()) + i13);
                    }
                    return i13;
                }
                return i13;
            case 7:
                return ((PremiumPreviewFragment) this.f40404b).f31458o0.d;
            case 8:
                ProfileActivity profileActivity = (ProfileActivity) this.f40404b;
                if (profileActivity.f31654s5 == null) {
                    return profileActivity.f31606l6 + profileActivity.f31601k6;
                }
                return profileActivity.f31606l6 + profileActivity.f31601k6 + ((int) (((AndroidUtilities.dp(52.0f) - profileActivity.f31654s5.getTranslationY()) - (profileActivity.f31661t5[1].getTranslationY() * profileActivity.O.g0(9, false))) - (profileActivity.f31661t5[0].getTranslationY() * profileActivity.O.g0(8, true))));
            default:
                wf1 wf1Var = (wf1) this.f40404b;
                m51 m51Var = wf1Var.f39337o0;
                if (m51Var != null && m51Var.getVisibility() == 0) {
                    return wf1Var.f39337o0.getMeasuredHeight();
                }
                return 0;
        }
        return i11 + i12;
    }

    @Override
    public final boolean g(int i10) {
        switch (this.f40403a) {
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
        switch (this.f40403a) {
            case 0:
                return 0;
            case 1:
                return 0;
            case 2:
                int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight;
                wn wnVar = (wn) this.f40404b;
                kVar = ((org.telegram.ui.ActionBar.m2) wnVar).actionBar;
                if (kVar != null) {
                    kVar2 = ((org.telegram.ui.ActionBar.m2) wnVar).actionBar;
                    int measuredHeight = kVar2.getMeasuredHeight();
                    kVar3 = ((org.telegram.ui.ActionBar.m2) wnVar).actionBar;
                    i11 = kVar3.getTop() + measuredHeight;
                } else {
                    i11 = 0;
                }
                max = Math.max(currentActionBarHeight, i11);
                max2 = (int) Math.max(0.0f, wnVar.f39652t9);
                break;
            case 3:
                return 0;
            case 4:
                qy qyVar = (qy) this.f40404b;
                kVar4 = ((org.telegram.ui.ActionBar.m2) qyVar).actionBar;
                int i15 = 0;
                if (kVar4 != null) {
                    kVar5 = ((org.telegram.ui.ActionBar.m2) qyVar).actionBar;
                    i12 = kVar5.getMeasuredHeight();
                } else {
                    i12 = 0;
                }
                nw nwVar = qyVar.f37136z0;
                if (nwVar != null && nwVar.getVisibility() == 0) {
                    i13 = qyVar.f37136z0.getMeasuredHeight();
                } else {
                    i13 = 0;
                }
                int i16 = i12 + i13;
                org.telegram.ui.Components.ms msVar = qyVar.J1;
                if (msVar != null) {
                    i14 = msVar.getHeight();
                } else {
                    i14 = 0;
                }
                int i17 = i16 + i14;
                hx hxVar = qyVar.E0;
                if (hxVar != null && qyVar.G0) {
                    i15 = (int) ((1.0f - hxVar.getCollapsedProgress()) * AndroidUtilities.dp(81.0f));
                }
                return AndroidUtilities.dp(48.0f) + i17 + i15;
            case 5:
                return 0;
            case 6:
                PhotoViewer photoViewer = ((nu0) this.f40404b).E0;
                return org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight + ((int) (photoViewer.V1.getAlpha() * photoViewer.V1.getEditTextHeight()));
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

    private final void A(org.telegram.ui.Components.qc qcVar) {
    }

    private final void B(org.telegram.ui.Components.qc qcVar) {
    }

    private final void C(org.telegram.ui.Components.qc qcVar) {
    }

    private final void D(org.telegram.ui.Components.qc qcVar) {
    }

    private final void E(org.telegram.ui.Components.qc qcVar) {
    }

    private final void F(org.telegram.ui.Components.qc qcVar) {
    }

    private final void G(org.telegram.ui.Components.qc qcVar) {
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

    private final void p(org.telegram.ui.Components.qc qcVar) {
    }

    private final void q(org.telegram.ui.Components.qc qcVar) {
    }

    private final void r(org.telegram.ui.Components.qc qcVar) {
    }

    private final void s(org.telegram.ui.Components.qc qcVar) {
    }

    private final void t(org.telegram.ui.Components.qc qcVar) {
    }

    private final void u(org.telegram.ui.Components.qc qcVar) {
    }

    private final void v(org.telegram.ui.Components.qc qcVar) {
    }

    private final void w(org.telegram.ui.Components.qc qcVar) {
    }

    private final void x(org.telegram.ui.Components.qc qcVar) {
    }

    private final void y(org.telegram.ui.Components.qc qcVar) {
    }

    private final void z(org.telegram.ui.Components.qc qcVar) {
    }
}
