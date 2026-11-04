package org.telegram.ui;

import android.view.View;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class yd implements Runnable {
    public final int f52258a;
    public final wm f52259b;

    public yd(wm wmVar, int i3) {
        this.f52258a = i3;
        this.f52259b = wmVar;
    }

    @Override
    public final void run() {
        mj mjVar;
        org.telegram.ui.Cells.q1 q1Var;
        org.telegram.messenger.zi messageObject;
        org.telegram.ui.Components.ch0[] ch0VarArr;
        int i3 = this.f52258a;
        TLRPC.ChatTheme chatTheme = null;
        wm wmVar = this.f52259b;
        switch (i3) {
            case 0:
                wmVar.f51271c6 = null;
                if (wmVar.getParentActivity() != null) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, wmVar.getParentActivity(), wmVar.f51557ya);
                    boolean T = org.telegram.messenger.t3.T(wmVar.f51292e);
                    org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
                    if (T && !wmVar.f51292e.megagroup) {
                        s1Var.U = org.telegram.messenger.bd.M0(2131749093, null);
                        s1Var.S = org.telegram.messenger.bd.M0(2131749092, null);
                    } else {
                        s1Var.U = org.telegram.messenger.bd.M0(2131749091, null);
                        s1Var.S = org.telegram.messenger.bd.M0(2131749090, null);
                    }
                    alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131749089, null), new de(wmVar, 2));
                    alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), new de(wmVar, 3));
                    wmVar.showDialog(s1Var);
                    return;
                }
                return;
            case 1:
                wmVar.m7();
                return;
            case 2:
                wm.l0(wmVar);
                return;
            case 3:
                org.telegram.messenger.g0.E2(wmVar.Z0);
                return;
            case 4:
                wmVar.Oa(null, wmVar.H8);
                wmVar.H8 = null;
                return;
            case 5:
                if (!org.telegram.ui.ActionBar.d2.hasSheets(wmVar) && (mjVar = wmVar.f51237a0) != null) {
                    mjVar.setFieldFocused(true);
                    wmVar.f51237a0.G0();
                    return;
                }
                return;
            case 6:
                wmVar.zd();
                wmVar.K9();
                org.telegram.messenger.g0.d0(wmVar.A0, new le(wmVar, 5));
                wmVar.I7();
                ej ejVar = wmVar.f51396m3;
                if (ejVar != null) {
                    ejVar.setTranslationX(wmVar.l9() / 2.0f);
                }
                cj cjVar = wmVar.f51410n3;
                if (cjVar != null) {
                    cjVar.setTranslationX(wmVar.l9() / 2.0f);
                }
                FrameLayout frameLayout = wmVar.f51308f1;
                if (frameLayout != null) {
                    frameLayout.setTranslationX(wmVar.l9() / 2.0f);
                }
                wmVar.g7();
                wmVar.H7();
                return;
            case 7:
                l81 f02 = l81.f0(-wmVar.f51376k6, 0L);
                f02.E = wmVar;
                wmVar.presentFragment(f02);
                return;
            case 8:
                wmVar.Ec(true);
                return;
            case 9:
                wmVar.f51549y1.d(true);
                return;
            case 10:
                wmVar.resumeDelayedFragmentAnimation();
                tj tjVar = wmVar.f51455qa;
                org.telegram.messenger.g0.r(tjVar);
                tjVar.run();
                wmVar.getNotificationCenter().o();
                return;
            case 11:
                wmVar.getNotificationCenter().j(wmVar.Z9);
                return;
            case 12:
                int childCount = wmVar.A0.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    View childAt = wmVar.A0.getChildAt(i10);
                    if (childAt instanceof org.telegram.ui.Cells.q1) {
                        org.telegram.ui.Cells.q1 q1Var2 = (org.telegram.ui.Cells.q1) childAt;
                        if (q1Var2.getMessageObject().D == 4) {
                            q1Var2.G1();
                        }
                    }
                }
                return;
            case 13:
                wmVar.cc = true;
                wmVar.bd(true);
                return;
            case 14:
                dk dkVar = wmVar.f51558yb;
                if (dkVar != null) {
                    dkVar.requestLayout();
                    return;
                }
                return;
            case 15:
                wm.S0(wmVar);
                return;
            case 16:
                TLRPC.UserFull userFull = wmVar.f51466r8;
                if (userFull != null) {
                    chatTheme = userFull.theme;
                }
                wmVar.Kb(chatTheme);
                return;
            case 17:
                wm.p0(wmVar);
                return;
            case 18:
                wmVar.f51273c8 = Integer.MAX_VALUE;
                wmVar.f51301e8 = false;
                wmVar.f51315f8 = 0L;
                wmVar.f51328g8 = null;
                wmVar.f51341h8 = null;
                wmVar.f51353i8 = null;
                wmVar.f51367j8 = -1;
                wmVar.f51286d8 = false;
                wmVar.Cd(false);
                wmVar.f51391l8 = null;
                return;
            case 19:
                yd ydVar = new yd(wmVar, 10);
                if (org.telegram.utils.twidget.p.x()) {
                    ydVar.run();
                    return;
                }
                org.telegram.ui.Components.lt ltVar = new org.telegram.ui.Components.lt(ydVar, 21);
                org.telegram.utils.twidget.p.h.add(ltVar);
                org.telegram.messenger.g0.i3(ltVar, 150L);
                return;
            case 20:
                wmVar.Yb(false, true);
                return;
            case 21:
                wm.d0(wmVar);
                return;
            case 22:
                wmVar.n7();
                return;
            case 23:
                wmVar.f51237a0.G0();
                return;
            case 24:
                wm wmVar2 = this.f52259b;
                int i11 = wmVar2.Rb;
                if (i11 != 0) {
                    wmVar2.l(i11, wmVar2.Sb, wmVar2.Tb, wmVar2.Ub, wmVar2.Vb, wmVar2.Wb);
                    wmVar2.Rb = 0;
                    return;
                }
                return;
            case 25:
                if (!wmVar.A3 && wmVar.A0 != null && wmVar.getParentActivity() != null && wmVar.fragmentView != null) {
                    org.telegram.ui.Components.zo zoVar = wmVar.K2;
                    if (zoVar == null || !zoVar.W) {
                        if (zoVar == null) {
                            kl klVar = wmVar.m1;
                            int indexOfChild = klVar.indexOfChild(wmVar.U);
                            if (indexOfChild != -1) {
                                org.telegram.ui.Components.zo zoVar2 = new org.telegram.ui.Components.zo(wmVar.getParentActivity());
                                wmVar.K2 = zoVar2;
                                zoVar2.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
                                wmVar.K2.l(wmVar.L);
                                klVar.addView(wmVar.K2, indexOfChild + 1, b8.mf.e(-1, 150, 55));
                            } else {
                                return;
                            }
                        }
                        int childCount2 = wmVar.A0.getChildCount();
                        for (int i12 = 0; i12 < childCount2; i12++) {
                            View childAt2 = wmVar.A0.getChildAt(i12);
                            if ((childAt2 instanceof org.telegram.ui.Cells.q1) && (messageObject = (q1Var = (org.telegram.ui.Cells.q1) childAt2).getMessageObject()) != null && messageObject.Q3() && messageObject.r4()) {
                                org.telegram.ui.Components.zo zoVar3 = wmVar.K2;
                                int[] iArr = (int[]) zoVar3.Z0;
                                if (zoVar3.getParent() instanceof View) {
                                    q1Var.getLocationInWindow(iArr);
                                    int i13 = iArr[0];
                                    int i14 = iArr[1];
                                    ((View) zoVar3.getParent()).getLocationInWindow(iArr);
                                    float f10 = i14 - iArr[1];
                                    if (f10 > org.telegram.messenger.g0.L(80.0f)) {
                                        for (org.telegram.ui.Components.ch0 ch0Var : (org.telegram.ui.Components.ch0[]) zoVar3.Y0) {
                                            ch0Var.N(0, false, false);
                                            ch0Var.start();
                                        }
                                        zoVar3.x(org.telegram.messenger.g0.L(5.0f) + q1Var.getChecksX() + (i13 - iArr[0]), f10 + q1Var.getChecksY() + org.telegram.messenger.g0.L(6.0f), true);
                                        wmVar.getMessagesController().k4(0L, "NEWCOMER_TICKS");
                                        return;
                                    }
                                } else {
                                    continue;
                                }
                            }
                        }
                        return;
                    }
                    return;
                }
                return;
            case 26:
                wm.C0(wmVar);
                return;
            case 27:
                mj mjVar2 = wmVar.f51237a0;
                if (mjVar2 != null && wmVar.Pb != 5) {
                    mjVar2.G0();
                    return;
                }
                return;
            case 28:
                org.telegram.messenger.g0.d0(wmVar.A0, new ei.e(11));
                fl flVar = wmVar.D0;
                if (flVar != null) {
                    flVar.O(true);
                    return;
                }
                return;
            default:
                org.telegram.ui.Components.yn ynVar = ((org.telegram.ui.Components.yn[]) wmVar.f51266c0.f852b)[0];
                org.telegram.ui.ActionBar.k5 k5Var = ynVar.d;
                org.telegram.ui.ActionBar.k5 k5Var2 = ynVar.f40789e;
                wmVar.U1 = !wmVar.U1;
                k5Var.setPivotX(0.0f);
                k5Var2.setPivotX(0.0f);
                if (wmVar.U1) {
                    k5Var.animate().alpha(0.0f).scaleX(0.98f).scaleY(0.98f).setDuration(150L).start();
                    k5Var2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                } else {
                    k5Var.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                    k5Var2.animate().alpha(0.0f).scaleX(0.98f).scaleY(0.98f).setDuration(150L).start();
                }
                org.telegram.messenger.g0.i3(wmVar.V1, 6000L);
                return;
        }
    }
}
