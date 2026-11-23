package org.telegram.ui;

import android.view.View;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class zd implements Runnable {
    public final int f54530a;
    public final bn f54531b;

    public zd(bn bnVar, int i7) {
        this.f54530a = i7;
        this.f54531b = bnVar;
    }

    @Override
    public final void run() {
        rj rjVar;
        org.telegram.ui.Cells.r1 r1Var;
        org.telegram.messenger.gj messageObject;
        org.telegram.ui.Components.oh0[] oh0VarArr;
        int i7 = this.f54530a;
        TLRPC.ChatTheme chatTheme = null;
        bn bnVar = this.f54531b;
        switch (i7) {
            case 0:
                bnVar.f45998d6 = null;
                if (bnVar.getParentActivity() != null) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, bnVar.getParentActivity(), bnVar.Ba);
                    boolean T = org.telegram.messenger.v3.T(bnVar.f46005e);
                    org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28777a;
                    if (T && !bnVar.f46005e.megagroup) {
                        t1Var.U = org.telegram.messenger.hd.N0(2131748892, null);
                        t1Var.S = org.telegram.messenger.hd.N0(2131748891, null);
                    } else {
                        t1Var.U = org.telegram.messenger.hd.N0(2131748890, null);
                        t1Var.S = org.telegram.messenger.hd.N0(2131748889, null);
                    }
                    alertDialog$Builder.k(org.telegram.messenger.hd.N0(2131748888, null), new ee(bnVar, 2));
                    alertDialog$Builder.h(org.telegram.messenger.hd.N0(2131752577, null), new ee(bnVar, 3));
                    bnVar.showDialog(t1Var);
                    return;
                }
                return;
            case 1:
                bnVar.n7();
                return;
            case 2:
                bn.m0(bnVar);
                return;
            case 3:
                org.telegram.messenger.g0.E2(bnVar.Z0);
                return;
            case 4:
                FrameLayout.LayoutParams e10 = c8.ma.e(-1, -2, 87);
                e10.bottomMargin = bnVar.f45950a0.getMeasuredHeight();
                bnVar.f46111m1.addView(bnVar.N1, e10);
                bnVar.N1.setTranslationY(-org.telegram.messenger.g0.f24041n);
                bnVar.N1.p(0.0f, bnVar.f45950a0.getEmojiButton().getX() + org.telegram.messenger.g0.L(22.0f));
                bnVar.N1.x();
                return;
            case 5:
                if (!org.telegram.ui.ActionBar.g2.hasSheets(bnVar) && (rjVar = bnVar.f45950a0) != null) {
                    rjVar.setFieldFocused(true);
                    bnVar.f45950a0.i1();
                    return;
                }
                return;
            case 6:
                bnVar.Dd();
                bnVar.M9();
                org.telegram.messenger.g0.d0(bnVar.A0, new me(bnVar, 5));
                bnVar.J7();
                jj jjVar = bnVar.f46113m3;
                if (jjVar != null) {
                    jjVar.setTranslationX(bnVar.n9() / 2.0f);
                }
                hj hjVar = bnVar.f46124n3;
                if (hjVar != null) {
                    hjVar.setTranslationX(bnVar.n9() / 2.0f);
                }
                FrameLayout frameLayout = bnVar.f46021f1;
                if (frameLayout != null) {
                    frameLayout.setTranslationX(bnVar.n9() / 2.0f);
                }
                bnVar.h7();
                bnVar.I7();
                return;
            case 7:
                w81 f02 = w81.f0(-bnVar.f46103l6, 0L);
                f02.E = bnVar;
                bnVar.presentFragment(f02);
                return;
            case 8:
                bnVar.Ic(true);
                return;
            case 9:
                bnVar.f46264y1.d(true);
                return;
            case 10:
                bnVar.Ra(null, bnVar.I8);
                bnVar.I8 = null;
                return;
            case 11:
                bnVar.resumeDelayedFragmentAnimation();
                yj yjVar = bnVar.f46207ta;
                org.telegram.messenger.g0.r(yjVar);
                yjVar.run();
                bnVar.getNotificationCenter().o();
                return;
            case 12:
                int childCount = bnVar.A0.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    View childAt = bnVar.A0.getChildAt(i10);
                    if (childAt instanceof org.telegram.ui.Cells.r1) {
                        org.telegram.ui.Cells.r1 r1Var2 = (org.telegram.ui.Cells.r1) childAt;
                        if (r1Var2.getMessageObject().D == 4) {
                            r1Var2.H1();
                        }
                    }
                }
                return;
            case 13:
                bnVar.fc = true;
                bnVar.fd(true);
                return;
            case 14:
                ik ikVar = bnVar.Bb;
                if (ikVar != null) {
                    ikVar.requestLayout();
                    return;
                }
                return;
            case 15:
                TLRPC.UserFull userFull = bnVar.f46194s8;
                if (userFull != null) {
                    chatTheme = userFull.theme;
                }
                bnVar.Ob(chatTheme);
                return;
            case 16:
                bn.r0(bnVar);
                return;
            case 17:
                bnVar.f46000d8 = Integer.MAX_VALUE;
                bnVar.f46028f8 = false;
                bnVar.f46040g8 = 0L;
                bnVar.f46053h8 = null;
                bnVar.f46066i8 = null;
                bnVar.f46079j8 = null;
                bnVar.f46093k8 = -1;
                bnVar.f46014e8 = false;
                bnVar.Gd(false);
                bnVar.f46118m8 = null;
                return;
            case 18:
                bnVar.getNotificationCenter().j(bnVar.f45989ca);
                return;
            case 19:
                bnVar.cc(false, true);
                return;
            case 20:
                bn.U0(bnVar);
                return;
            case 21:
                zd zdVar = new zd(bnVar, 11);
                if (org.telegram.utils.twidget.n0.z()) {
                    zdVar.run();
                    return;
                }
                org.telegram.ui.Components.ik ikVar2 = new org.telegram.ui.Components.ik(zdVar, 29);
                org.telegram.utils.twidget.n0.h.add(ikVar2);
                org.telegram.messenger.g0.h3(ikVar2, 150L);
                return;
            case 22:
                bnVar.o7();
                return;
            case 23:
                bnVar.f45950a0.i1();
                return;
            case 24:
                bn.e0(bnVar);
                return;
            case 25:
                bn bnVar2 = this.f54531b;
                int i11 = bnVar2.Ub;
                if (i11 != 0) {
                    bnVar2.l(i11, bnVar2.Vb, bnVar2.Wb, bnVar2.Xb, bnVar2.Yb, bnVar2.Zb);
                    bnVar2.Ub = 0;
                    return;
                }
                return;
            case 26:
                if (!bnVar.A3 && bnVar.A0 != null && bnVar.getParentActivity() != null && bnVar.fragmentView != null) {
                    org.telegram.ui.Components.rp rpVar = bnVar.K2;
                    if (rpVar == null || !rpVar.W) {
                        if (rpVar == null) {
                            pl plVar = bnVar.f46111m1;
                            int indexOfChild = plVar.indexOfChild(bnVar.U);
                            if (indexOfChild != -1) {
                                org.telegram.ui.Components.rp rpVar2 = new org.telegram.ui.Components.rp(bnVar.getParentActivity());
                                bnVar.K2 = rpVar2;
                                rpVar2.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
                                bnVar.K2.l(bnVar.L);
                                plVar.addView(bnVar.K2, indexOfChild + 1, c8.ma.e(-1, 150, 55));
                            } else {
                                return;
                            }
                        }
                        int childCount2 = bnVar.A0.getChildCount();
                        for (int i12 = 0; i12 < childCount2; i12++) {
                            View childAt2 = bnVar.A0.getChildAt(i12);
                            if ((childAt2 instanceof org.telegram.ui.Cells.r1) && (messageObject = (r1Var = (org.telegram.ui.Cells.r1) childAt2).getMessageObject()) != null && messageObject.P3() && messageObject.q4()) {
                                org.telegram.ui.Components.rp rpVar3 = bnVar.K2;
                                int[] iArr = (int[]) rpVar3.Z0;
                                if (rpVar3.getParent() instanceof View) {
                                    r1Var.getLocationInWindow(iArr);
                                    int i13 = iArr[0];
                                    int i14 = iArr[1];
                                    ((View) rpVar3.getParent()).getLocationInWindow(iArr);
                                    float f10 = i14 - iArr[1];
                                    if (f10 > org.telegram.messenger.g0.L(80.0f)) {
                                        for (org.telegram.ui.Components.oh0 oh0Var : (org.telegram.ui.Components.oh0[]) rpVar3.Y0) {
                                            oh0Var.N(0, false, false);
                                            oh0Var.start();
                                        }
                                        rpVar3.y(org.telegram.messenger.g0.L(5.0f) + r1Var.getChecksX() + (i13 - iArr[0]), f10 + r1Var.getChecksY() + org.telegram.messenger.g0.L(6.0f), true);
                                        bnVar.getMessagesController().s4(0L, "NEWCOMER_TICKS");
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
                bn.G0(bnVar);
                return;
            case 28:
                rj rjVar2 = bnVar.f45950a0;
                if (rjVar2 != null && bnVar.Sb != 5) {
                    rjVar2.i1();
                    return;
                }
                return;
            default:
                org.telegram.ui.Components.so soVar = ((org.telegram.ui.Components.so[]) bnVar.f45979c0.f3595b)[0];
                org.telegram.ui.ActionBar.m5 m5Var = soVar.d;
                org.telegram.ui.ActionBar.m5 m5Var2 = soVar.f39639e;
                bnVar.U1 = !bnVar.U1;
                m5Var.setPivotX(0.0f);
                m5Var2.setPivotX(0.0f);
                if (bnVar.U1) {
                    m5Var.animate().alpha(0.0f).scaleX(0.98f).scaleY(0.98f).setDuration(150L).start();
                    m5Var2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                } else {
                    m5Var.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                    m5Var2.animate().alpha(0.0f).scaleX(0.98f).scaleY(0.98f).setDuration(150L).start();
                }
                org.telegram.messenger.g0.h3(bnVar.V1, 6000L);
                return;
        }
    }
}
