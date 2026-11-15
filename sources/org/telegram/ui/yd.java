package org.telegram.ui;

import android.view.View;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class yd implements Runnable {
    public final int f53495a;
    public final an f53496b;

    public yd(an anVar, int i7) {
        this.f53495a = i7;
        this.f53496b = anVar;
    }

    @Override
    public final void run() {
        qj qjVar;
        org.telegram.ui.Cells.q1 q1Var;
        org.telegram.messenger.gj messageObject;
        org.telegram.ui.Components.ch0[] ch0VarArr;
        int i7 = this.f53495a;
        TLRPC.ChatTheme chatTheme = null;
        an anVar = this.f53496b;
        switch (i7) {
            case 0:
                anVar.f45152c6 = null;
                if (anVar.getParentActivity() != null) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, anVar.getParentActivity(), anVar.Aa);
                    boolean T = org.telegram.messenger.t3.T(anVar.f45172e);
                    org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28392a;
                    if (T && !anVar.f45172e.megagroup) {
                        t1Var.U = org.telegram.messenger.hd.M0(2131749085, null);
                        t1Var.S = org.telegram.messenger.hd.M0(2131749084, null);
                    } else {
                        t1Var.U = org.telegram.messenger.hd.M0(2131749083, null);
                        t1Var.S = org.telegram.messenger.hd.M0(2131749082, null);
                    }
                    alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131749081, null), new ce(anVar, 2));
                    alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), new ce(anVar, 3));
                    anVar.showDialog(t1Var);
                    return;
                }
                return;
            case 1:
                anVar.n7();
                return;
            case 2:
                FrameLayout.LayoutParams e10 = c8.ja.e(-1, -2, 87);
                e10.bottomMargin = anVar.f45117a0.getMeasuredHeight();
                anVar.f45277m1.addView(anVar.N1, e10);
                anVar.N1.setTranslationY(-org.telegram.messenger.g0.f23606n);
                anVar.N1.p(0.0f, anVar.f45117a0.getEmojiButton().getX() + org.telegram.messenger.g0.L(22.0f));
                anVar.N1.w();
                return;
            case 3:
                an.m0(anVar);
                return;
            case 4:
                org.telegram.messenger.g0.E2(anVar.Z0);
                return;
            case 5:
                if (!org.telegram.ui.ActionBar.e2.hasSheets(anVar) && (qjVar = anVar.f45117a0) != null) {
                    qjVar.setFieldFocused(true);
                    anVar.f45117a0.W0();
                    return;
                }
                return;
            case 6:
                anVar.Dd();
                anVar.M9();
                org.telegram.messenger.g0.d0(anVar.A0, new ke(anVar, 5));
                anVar.J7();
                ij ijVar = anVar.f45279m3;
                if (ijVar != null) {
                    ijVar.setTranslationX(anVar.n9() / 2.0f);
                }
                gj gjVar = anVar.f45290n3;
                if (gjVar != null) {
                    gjVar.setTranslationX(anVar.n9() / 2.0f);
                }
                FrameLayout frameLayout = anVar.f45188f1;
                if (frameLayout != null) {
                    frameLayout.setTranslationX(anVar.n9() / 2.0f);
                }
                anVar.h7();
                anVar.I7();
                return;
            case 7:
                anVar.Ra(null, anVar.H8);
                anVar.H8 = null;
                return;
            case 8:
                s81 f02 = s81.f0(-anVar.f45258k6, 0L);
                f02.E = anVar;
                anVar.presentFragment(f02);
                return;
            case 9:
                anVar.Ic(true);
                return;
            case 10:
                anVar.f45430y1.d(true);
                return;
            case 11:
                anVar.resumeDelayedFragmentAnimation();
                xj xjVar = anVar.f45361sa;
                org.telegram.messenger.g0.r(xjVar);
                xjVar.run();
                anVar.getNotificationCenter().o();
                return;
            case 12:
                int childCount = anVar.A0.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    View childAt = anVar.A0.getChildAt(i10);
                    if (childAt instanceof org.telegram.ui.Cells.q1) {
                        org.telegram.ui.Cells.q1 q1Var2 = (org.telegram.ui.Cells.q1) childAt;
                        if (q1Var2.getMessageObject().D == 4) {
                            q1Var2.H1();
                        }
                    }
                }
                return;
            case 13:
                anVar.f45184ec = true;
                anVar.fd(true);
                return;
            case 14:
                hk hkVar = anVar.Ab;
                if (hkVar != null) {
                    hkVar.requestLayout();
                    return;
                }
                return;
            case 15:
                anVar.getNotificationCenter().j(anVar.f45142ba);
                return;
            case 16:
                TLRPC.UserFull userFull = anVar.f45347r8;
                if (userFull != null) {
                    chatTheme = userFull.theme;
                }
                anVar.Ob(chatTheme);
                return;
            case 17:
                an.r0(anVar);
                return;
            case 18:
                anVar.f45154c8 = Integer.MAX_VALUE;
                anVar.f45181e8 = false;
                anVar.f45195f8 = 0L;
                anVar.f45207g8 = null;
                anVar.f45220h8 = null;
                anVar.f45233i8 = null;
                anVar.f45246j8 = -1;
                anVar.f45167d8 = false;
                anVar.Gd(false);
                anVar.f45272l8 = null;
                return;
            case 19:
                an.U0(anVar);
                return;
            case 20:
                anVar.cc(false, true);
                return;
            case 21:
                yd ydVar = new yd(anVar, 11);
                if (org.telegram.utils.twidget.n0.z()) {
                    ydVar.run();
                    return;
                }
                org.telegram.ui.Components.zj zjVar = new org.telegram.ui.Components.zj(ydVar, 29);
                org.telegram.utils.twidget.n0.h.add(zjVar);
                org.telegram.messenger.g0.i3(zjVar, 150L);
                return;
            case 22:
                an.e0(anVar);
                return;
            case 23:
                anVar.o7();
                return;
            case 24:
                anVar.f45117a0.W0();
                return;
            case 25:
                an anVar2 = this.f53496b;
                int i11 = anVar2.Tb;
                if (i11 != 0) {
                    anVar2.l(i11, anVar2.Ub, anVar2.Vb, anVar2.Wb, anVar2.Xb, anVar2.Yb);
                    anVar2.Tb = 0;
                    return;
                }
                return;
            case 26:
                if (!anVar.A3 && anVar.A0 != null && anVar.getParentActivity() != null && anVar.fragmentView != null) {
                    org.telegram.ui.Components.ip ipVar = anVar.K2;
                    if (ipVar == null || !ipVar.W) {
                        if (ipVar == null) {
                            ol olVar = anVar.f45277m1;
                            int indexOfChild = olVar.indexOfChild(anVar.U);
                            if (indexOfChild != -1) {
                                org.telegram.ui.Components.ip ipVar2 = new org.telegram.ui.Components.ip(anVar.getParentActivity());
                                anVar.K2 = ipVar2;
                                ipVar2.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
                                anVar.K2.l(anVar.L);
                                olVar.addView(anVar.K2, indexOfChild + 1, c8.ja.e(-1, 150, 55));
                            } else {
                                return;
                            }
                        }
                        int childCount2 = anVar.A0.getChildCount();
                        for (int i12 = 0; i12 < childCount2; i12++) {
                            View childAt2 = anVar.A0.getChildAt(i12);
                            if ((childAt2 instanceof org.telegram.ui.Cells.q1) && (messageObject = (q1Var = (org.telegram.ui.Cells.q1) childAt2).getMessageObject()) != null && messageObject.P3() && messageObject.q4()) {
                                org.telegram.ui.Components.ip ipVar3 = anVar.K2;
                                int[] iArr = (int[]) ipVar3.Z0;
                                if (ipVar3.getParent() instanceof View) {
                                    q1Var.getLocationInWindow(iArr);
                                    int i13 = iArr[0];
                                    int i14 = iArr[1];
                                    ((View) ipVar3.getParent()).getLocationInWindow(iArr);
                                    float f10 = i14 - iArr[1];
                                    if (f10 > org.telegram.messenger.g0.L(80.0f)) {
                                        for (org.telegram.ui.Components.ch0 ch0Var : (org.telegram.ui.Components.ch0[]) ipVar3.Y0) {
                                            ch0Var.N(0, false, false);
                                            ch0Var.start();
                                        }
                                        ipVar3.x(org.telegram.messenger.g0.L(5.0f) + q1Var.getChecksX() + (i13 - iArr[0]), f10 + q1Var.getChecksY() + org.telegram.messenger.g0.L(6.0f), true);
                                        anVar.getMessagesController().k4(0L, "NEWCOMER_TICKS");
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
            case 27:
                an.G0(anVar);
                return;
            case 28:
                qj qjVar2 = anVar.f45117a0;
                if (qjVar2 != null && anVar.Rb != 5) {
                    qjVar2.W0();
                    return;
                }
                return;
            default:
                org.telegram.ui.Components.jo joVar = ((org.telegram.ui.Components.jo[]) anVar.f45146c0.f3548b)[0];
                org.telegram.ui.ActionBar.j5 j5Var = joVar.d;
                org.telegram.ui.ActionBar.j5 j5Var2 = joVar.f36115e;
                anVar.U1 = !anVar.U1;
                j5Var.setPivotX(0.0f);
                j5Var2.setPivotX(0.0f);
                if (anVar.U1) {
                    j5Var.animate().alpha(0.0f).scaleX(0.98f).scaleY(0.98f).setDuration(150L).start();
                    j5Var2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                } else {
                    j5Var.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                    j5Var2.animate().alpha(0.0f).scaleX(0.98f).scaleY(0.98f).setDuration(150L).start();
                }
                org.telegram.messenger.g0.i3(anVar.V1, 6000L);
                return;
        }
    }
}
