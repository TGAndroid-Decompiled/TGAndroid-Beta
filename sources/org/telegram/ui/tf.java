package org.telegram.ui;

import android.content.SharedPreferences;
import android.os.SystemClock;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
public final class tf implements Runnable {
    public final int f49790a;
    public final wm f49791b;

    public tf(wm wmVar, int i3) {
        this.f49790a = i3;
        this.f49791b = wmVar;
    }

    @Override
    public final void run() {
        mj mjVar;
        View sendButton;
        View sendButton2;
        boolean z10;
        boolean z11;
        gi.l3 l3Var;
        int i3 = this.f49790a;
        boolean z12 = true;
        wm wmVar = this.f49791b;
        switch (i3) {
            case 0:
                if (wmVar.getParentActivity() != null && wmVar.fragmentView != null && (mjVar = wmVar.f51237a0) != null && (sendButton = mjVar.getSendButton()) != null && wmVar.f51237a0.getEditField() != null && wmVar.f51237a0.getEditField().getText().length() >= 5) {
                    int i10 = org.telegram.messenger.az.f21612a;
                    SharedPreferences.Editor edit = org.telegram.messenger.hp.e1().edit();
                    org.telegram.messenger.az.L = System.currentTimeMillis();
                    int i11 = org.telegram.messenger.az.K + 1;
                    org.telegram.messenger.az.K = i11;
                    edit.putInt("scheduledOrNoSoundHintShows", i11);
                    edit.putLong("scheduledOrNoSoundHintSeenAt", org.telegram.messenger.az.L);
                    edit.apply();
                    if (wmVar.f51509v2 == null) {
                        gi.l3 D6 = wmVar.D6(280.0f, 3, -1, true);
                        wmVar.f51509v2 = D6;
                        D6.f13105v0 = 0.0f;
                        D6.f13107w0 = org.telegram.messenger.g0.L(56.0f) / 2.0f;
                        wmVar.f51509v2.u(org.telegram.messenger.bd.M0(2131745857, null));
                    }
                    wmVar.f51509v2.y(sendButton, true);
                    wmVar.f51523w2 = true;
                    return;
                }
                return;
            case 1:
                mj mjVar2 = wmVar.f51237a0;
                if (mjVar2 != null && wmVar.f51345hd != null) {
                    if (mjVar2.r0()) {
                        wmVar.f51237a0.j0(false);
                        org.telegram.messenger.g0.K3(wmVar.f51345hd.f55387a);
                        ((qe.a) wmVar.f51345hd.f55388b.f10221b).a(false, true);
                        return;
                    }
                    wmVar.f51237a0.U0(false, false, false);
                    wmVar.f51237a0.r1();
                    ((qe.a) wmVar.f51345hd.f55388b.f10221b).a(true, true);
                    return;
                }
                return;
            case 2:
                wmVar.Sa();
                return;
            case 3:
                if (wmVar.getParentActivity() != null && wmVar.fragmentView != null && wmVar.f51237a0 != null && wmVar.Za == null && wmVar.getMessagesController().N1(wmVar.a()) <= 0 && (sendButton2 = wmVar.f51237a0.getSendButton()) != null && wmVar.f51237a0.getEditField() != null && wmVar.f51237a0.getEditField().getText().length() != 0) {
                    int i12 = org.telegram.messenger.az.f21612a;
                    SharedPreferences.Editor edit2 = org.telegram.messenger.hp.e1().edit();
                    org.telegram.messenger.az.N = System.currentTimeMillis();
                    int i13 = org.telegram.messenger.az.M + 1;
                    org.telegram.messenger.az.M = i13;
                    edit2.putInt("scheduledHintShows", i13);
                    edit2.putLong("scheduledHintSeenAt", org.telegram.messenger.az.N);
                    edit2.apply();
                    if (wmVar.f51537x2 == null) {
                        gi.l3 D62 = wmVar.D6(280.0f, 3, -1, true);
                        wmVar.f51537x2 = D62;
                        D62.f13105v0 = 0.0f;
                        D62.u(org.telegram.messenger.bd.M0(2131745859, null));
                    }
                    wmVar.f51537x2.y(sendButton2, true);
                    wmVar.f51550y2 = true;
                    return;
                }
                return;
            case 4:
                wmVar.z9();
                wmVar.cd(0, true);
                return;
            case 5:
                wmVar.v8(false, true, 0.0f);
                return;
            case 6:
                ArrayList arrayList = wmVar.L6;
                wmVar.f51357ic = System.currentTimeMillis();
                if (wmVar.A0 != null && wmVar.D0 != null) {
                    int i14 = Integer.MAX_VALUE;
                    int i15 = Integer.MIN_VALUE;
                    for (int i16 = 0; i16 < wmVar.A0.getChildCount(); i16++) {
                        View childAt = wmVar.A0.getChildAt(i16);
                        if (childAt instanceof org.telegram.ui.Cells.q1) {
                            org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) childAt;
                            if (q1Var.getCurrentMessagesGroup() != null) {
                                for (int i17 = 0; i17 < q1Var.getCurrentMessagesGroup().d.size(); i17++) {
                                    int f12 = ((org.telegram.messenger.zi) q1Var.getCurrentMessagesGroup().d.get(i17)).f1();
                                    i14 = Math.min(i14, f12);
                                    i15 = Math.max(i15, f12);
                                }
                            } else if (q1Var.getMessageObject() != null) {
                                int f13 = q1Var.getMessageObject().f1();
                                i14 = Math.min(i14, f13);
                                i15 = Math.max(i15, f13);
                            }
                        }
                    }
                    if (i14 <= i15) {
                        ArrayList arrayList2 = new ArrayList();
                        for (int i18 = 0; i18 < arrayList.size(); i18++) {
                            org.telegram.messenger.zi ziVar = (org.telegram.messenger.zi) arrayList.get(i18);
                            org.telegram.messenger.ui uiVar = (org.telegram.messenger.ui) wmVar.O6.f(ziVar.d1());
                            if (uiVar != null) {
                                ArrayList arrayList3 = uiVar.d;
                                if (!arrayList2.contains(Long.valueOf(uiVar.f25699a))) {
                                    for (int i19 = 0; i19 < arrayList3.size(); i19++) {
                                        org.telegram.messenger.zi ziVar2 = (org.telegram.messenger.zi) arrayList3.get(i19);
                                        if (ziVar2 != null) {
                                            int f14 = ziVar2.f1();
                                            org.telegram.messenger.x00 x00Var = wmVar.getMessagesController().f23120s7;
                                            if (f14 >= i14 - 7 && f14 <= i15 + 7) {
                                                z11 = true;
                                            } else {
                                                z11 = false;
                                            }
                                            x00Var.h(ziVar2, z11, false);
                                        }
                                    }
                                    arrayList2.add(Long.valueOf(uiVar.f25699a));
                                }
                            } else {
                                int f15 = ziVar.f1();
                                org.telegram.messenger.x00 x00Var2 = wmVar.getMessagesController().f23120s7;
                                if (f15 >= i14 - 7 && f15 <= i15 + 7) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                x00Var2.h(ziVar, z10, false);
                            }
                        }
                    }
                }
                if (wmVar.Y4 > 0 && wmVar.W4 != null) {
                    wmVar.getMessagesController().f23120s7.h((org.telegram.messenger.zi) wmVar.W4.get(Integer.valueOf(wmVar.Y4)), true, false);
                }
                wmVar.Ad();
                return;
            case 7:
                wmVar.X5 = null;
                wmVar.z8();
                return;
            case 8:
                wmVar.X5 = null;
                wmVar.z8();
                return;
            case 9:
                wmVar.sa();
                return;
            case 10:
                wmVar.v8(false, true, 0.0f);
                return;
            case 11:
                wm.u0(wmVar);
                return;
            case 12:
                wmVar.v8(false, true, 0.0f);
                return;
            case 13:
                org.telegram.ui.ActionBar.s1 s1Var = new org.telegram.ui.ActionBar.s1(3, wmVar.getParentActivity(), wmVar.f51557ya);
                wmVar.Qb = s1Var;
                s1Var.setOnShowListener(new ve(wmVar, 1));
                wmVar.Qb.setOnCancelListener(wmVar.Ga);
                wmVar.Qb.r(500L);
                return;
            case 14:
                org.telegram.messenger.g0.E2(wmVar.f51238a1);
                return;
            case 15:
                wmVar.O7(true);
                org.telegram.messenger.k5.o(null, 2131743980, org.telegram.ui.Components.fc.a0(wmVar), 2131623981, 36);
                return;
            case 16:
                wmVar.b7();
                return;
            case 17:
                wmVar.D0.N.clear();
                fl flVar = wmVar.D0;
                flVar.M = false;
                flVar.O(true);
                wmVar.sc(false);
                return;
            case 18:
                wmVar.f51236a = (wmVar.f51236a + 1) % 3;
                return;
            case 19:
                wmVar.f51250b = !wmVar.f51250b;
                return;
            case 20:
                wmVar.D0.N.clear();
                fl flVar2 = wmVar.D0;
                flVar2.M = false;
                flVar2.O(true);
                wmVar.sc(false);
                return;
            case 21:
                wmVar.Sa = false;
                wmVar.Yc();
                return;
            case 22:
                wmVar.Mc = 0;
                wmVar.Nc = false;
                wmVar.A0.g1();
                return;
            case 23:
                wmVar.K9();
                wmVar.M9();
                wmVar.F7();
                wmVar.H7();
                return;
            case 24:
                wmVar.cd(0, (wmVar.f51327g6 == 0 || SystemClock.elapsedRealtime() < wmVar.f51327g6 + 150) ? false : false);
                return;
            case 25:
                pj pjVar = wmVar.f51324g3;
                if ((pjVar == null || pjVar.getVisibility() != 0) && (l3Var = wmVar.L1) != null) {
                    l3Var.w();
                    return;
                }
                return;
            case 26:
                wmVar.y7();
                return;
            case 27:
                wmVar.o7(false);
                return;
            case 28:
                FrameLayout.LayoutParams e10 = b8.mf.e(-1, -2, 87);
                e10.bottomMargin = wmVar.f51237a0.getMeasuredHeight();
                wmVar.m1.addView(wmVar.N1, e10);
                wmVar.N1.setTranslationY(-org.telegram.messenger.g0.f22603n);
                wmVar.N1.p(0.0f, wmVar.f51237a0.getEmojiButton().getX() + org.telegram.messenger.g0.L(22.0f));
                wmVar.N1.w();
                return;
            default:
                int i20 = wm.f51227jd;
                wmVar.n7();
                return;
        }
    }
}
