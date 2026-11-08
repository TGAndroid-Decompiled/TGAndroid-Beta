package org.telegram.ui;

import android.content.SharedPreferences;
import android.os.SystemClock;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
public final class xf implements Runnable {
    public final int f51845a;
    public final an f51846b;

    public xf(an anVar, int i7) {
        this.f51845a = i7;
        this.f51846b = anVar;
    }

    @Override
    public final void run() {
        qj qjVar;
        View sendButton;
        View sendButton2;
        boolean z9;
        boolean z10;
        fi.m3 m3Var;
        int i7 = this.f51845a;
        boolean z11 = true;
        an anVar = this.f51846b;
        switch (i7) {
            case 0:
                if (anVar.getParentActivity() != null && anVar.fragmentView != null && (qjVar = anVar.Z) != null && (sendButton = qjVar.getSendButton()) != null && anVar.Z.getEditField() != null && anVar.Z.getEditField().getText().length() >= 5) {
                    int i10 = org.telegram.messenger.iz.f23385a;
                    SharedPreferences.Editor edit = org.telegram.messenger.qp.e1().edit();
                    org.telegram.messenger.iz.L = System.currentTimeMillis();
                    int i11 = org.telegram.messenger.iz.K + 1;
                    org.telegram.messenger.iz.K = i11;
                    edit.putInt("scheduledOrNoSoundHintShows", i11);
                    edit.putLong("scheduledOrNoSoundHintSeenAt", org.telegram.messenger.iz.L);
                    edit.apply();
                    if (anVar.f43980u2 == null) {
                        fi.m3 D6 = anVar.D6(280.0f, 3, -1, true);
                        anVar.f43980u2 = D6;
                        D6.f12442u0 = 0.0f;
                        D6.f12443v0 = org.telegram.messenger.g0.L(56.0f) / 2.0f;
                        anVar.f43980u2.u(org.telegram.messenger.id.M0(2131745850, null));
                    }
                    anVar.f43980u2.y(sendButton, true);
                    anVar.f43993v2 = true;
                    return;
                }
                return;
            case 1:
                qj qjVar2 = anVar.Z;
                if (qjVar2 != null && anVar.f43817gd != null) {
                    if (qjVar2.s0()) {
                        anVar.Z.k0(false);
                        org.telegram.messenger.g0.K3(anVar.f43817gd.f55283a);
                        ((te.a) anVar.f43817gd.f55284b.f8841b).a(false, true);
                        return;
                    }
                    anVar.Z.U0(false, false, false);
                    anVar.Z.s1();
                    ((te.a) anVar.f43817gd.f55284b.f8841b).a(true, true);
                    return;
                }
                return;
            case 2:
                anVar.Sa();
                return;
            case 3:
                if (anVar.getParentActivity() != null && anVar.fragmentView != null && anVar.Z != null && anVar.Ya == null && anVar.getMessagesController().N1(anVar.a()) <= 0 && (sendButton2 = anVar.Z.getSendButton()) != null && anVar.Z.getEditField() != null && anVar.Z.getEditField().getText().length() != 0) {
                    int i12 = org.telegram.messenger.iz.f23385a;
                    SharedPreferences.Editor edit2 = org.telegram.messenger.qp.e1().edit();
                    org.telegram.messenger.iz.N = System.currentTimeMillis();
                    int i13 = org.telegram.messenger.iz.M + 1;
                    org.telegram.messenger.iz.M = i13;
                    edit2.putInt("scheduledHintShows", i13);
                    edit2.putLong("scheduledHintSeenAt", org.telegram.messenger.iz.N);
                    edit2.apply();
                    if (anVar.f44007w2 == null) {
                        fi.m3 D62 = anVar.D6(280.0f, 3, -1, true);
                        anVar.f44007w2 = D62;
                        D62.f12442u0 = 0.0f;
                        D62.u(org.telegram.messenger.id.M0(2131745852, null));
                    }
                    anVar.f44007w2.y(sendButton2, true);
                    anVar.f44020x2 = true;
                    return;
                }
                return;
            case 4:
                anVar.z9();
                anVar.cd(0, true);
                return;
            case 5:
                anVar.v8(false, true, 0.0f);
                return;
            case 6:
                ArrayList arrayList = anVar.K6;
                anVar.f43829hc = System.currentTimeMillis();
                if (anVar.f44043z0 != null && anVar.C0 != null) {
                    int i14 = Integer.MAX_VALUE;
                    int i15 = Integer.MIN_VALUE;
                    for (int i16 = 0; i16 < anVar.f44043z0.getChildCount(); i16++) {
                        View childAt = anVar.f44043z0.getChildAt(i16);
                        if (childAt instanceof org.telegram.ui.Cells.q1) {
                            org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) childAt;
                            if (q1Var.getCurrentMessagesGroup() != null) {
                                for (int i17 = 0; i17 < q1Var.getCurrentMessagesGroup().d.size(); i17++) {
                                    int f12 = ((org.telegram.messenger.ij) q1Var.getCurrentMessagesGroup().d.get(i17)).f1();
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
                            org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) arrayList.get(i18);
                            org.telegram.messenger.dj djVar = (org.telegram.messenger.dj) anVar.N6.f(ijVar.d1());
                            if (djVar != null) {
                                ArrayList arrayList3 = djVar.d;
                                if (!arrayList2.contains(Long.valueOf(djVar.f22034a))) {
                                    for (int i19 = 0; i19 < arrayList3.size(); i19++) {
                                        org.telegram.messenger.ij ijVar2 = (org.telegram.messenger.ij) arrayList3.get(i19);
                                        if (ijVar2 != null) {
                                            int f14 = ijVar2.f1();
                                            org.telegram.messenger.f10 f10Var = anVar.getMessagesController().f24896s7;
                                            if (f14 >= i14 - 7 && f14 <= i15 + 7) {
                                                z10 = true;
                                            } else {
                                                z10 = false;
                                            }
                                            f10Var.h(ijVar2, z10, false);
                                        }
                                    }
                                    arrayList2.add(Long.valueOf(djVar.f22034a));
                                }
                            } else {
                                int f15 = ijVar.f1();
                                org.telegram.messenger.f10 f10Var2 = anVar.getMessagesController().f24896s7;
                                if (f15 >= i14 - 7 && f15 <= i15 + 7) {
                                    z9 = true;
                                } else {
                                    z9 = false;
                                }
                                f10Var2.h(ijVar, z9, false);
                            }
                        }
                    }
                }
                if (anVar.X4 > 0 && anVar.V4 != null) {
                    anVar.getMessagesController().f24896s7.h((org.telegram.messenger.ij) anVar.V4.get(Integer.valueOf(anVar.X4)), true, false);
                }
                anVar.Ad();
                return;
            case 7:
                anVar.W5 = null;
                anVar.z8();
                return;
            case 8:
                anVar.W5 = null;
                anVar.z8();
                return;
            case 9:
                anVar.sa();
                return;
            case 10:
                anVar.v8(false, true, 0.0f);
                return;
            case 11:
                an.u0(anVar);
                return;
            case 12:
                anVar.v8(false, true, 0.0f);
                return;
            case 13:
                org.telegram.ui.ActionBar.u1 u1Var = new org.telegram.ui.ActionBar.u1(3, anVar.getParentActivity(), anVar.f44028xa);
                anVar.Pb = u1Var;
                u1Var.setOnShowListener(new ye(anVar, 1));
                anVar.Pb.setOnCancelListener(anVar.Fa);
                anVar.Pb.r(500L);
                return;
            case 14:
                org.telegram.messenger.g0.E2(anVar.Z0);
                return;
            case 15:
                anVar.O7(true);
                org.telegram.messenger.k5.o(null, 2131743973, org.telegram.ui.Components.hc.a0(anVar), 2131623981, 36);
                return;
            case 16:
                anVar.b7();
                return;
            case 17:
                anVar.f43721a = (anVar.f43721a + 1) % 3;
                return;
            case 18:
                anVar.f43736b = !anVar.f43736b;
                return;
            case 19:
                anVar.C0.M.clear();
                jl jlVar = anVar.C0;
                jlVar.L = false;
                jlVar.O(true);
                anVar.sc(false);
                return;
            case 20:
                anVar.C0.M.clear();
                jl jlVar2 = anVar.C0;
                jlVar2.L = false;
                jlVar2.O(true);
                anVar.sc(false);
                return;
            case 21:
                anVar.Ra = false;
                anVar.Yc();
                return;
            case 22:
                anVar.Lc = 0;
                anVar.Mc = false;
                anVar.f44043z0.g1();
                return;
            case 23:
                anVar.K9();
                anVar.M9();
                anVar.F7();
                anVar.H7();
                return;
            case 24:
                anVar.cd(0, (anVar.f43798f6 == 0 || SystemClock.elapsedRealtime() < anVar.f43798f6 + 150) ? false : false);
                return;
            case 25:
                tj tjVar = anVar.f43795f3;
                if ((tjVar == null || tjVar.getVisibility() != 0) && (m3Var = anVar.K1) != null) {
                    m3Var.w();
                    return;
                }
                return;
            case 26:
                anVar.y7();
                return;
            case 27:
                anVar.o7(false);
                return;
            case 28:
                FrameLayout.LayoutParams e10 = c8.ha.e(-1, -2, 87);
                e10.bottomMargin = anVar.Z.getMeasuredHeight();
                anVar.l1.addView(anVar.M1, e10);
                anVar.M1.setTranslationY(-org.telegram.messenger.g0.f22558n);
                anVar.M1.p(0.0f, anVar.Z.getEmojiButton().getX() + org.telegram.messenger.g0.L(22.0f));
                anVar.M1.w();
                return;
            default:
                int i20 = an.f43712id;
                anVar.n7();
                return;
        }
    }
}
