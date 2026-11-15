package org.telegram.ui;

import android.content.SharedPreferences;
import android.os.SystemClock;
import android.view.View;
import java.util.ArrayList;
public final class uf implements Runnable {
    public final int f51933a;
    public final an f51934b;

    public uf(an anVar, int i7) {
        this.f51933a = i7;
        this.f51934b = anVar;
    }

    @Override
    public final void run() {
        org.telegram.ui.ActionBar.z0 z0Var;
        qj qjVar;
        View sendButton;
        View sendButton2;
        boolean z10;
        boolean z11;
        hi.l3 l3Var;
        int i7 = this.f51933a;
        boolean z12 = true;
        an anVar = this.f51934b;
        switch (i7) {
            case 0:
                anVar.x8(false, true, 0.0f);
                return;
            case 1:
                org.telegram.ui.ActionBar.z0[] z0VarArr = anVar.f45247j9;
                if (z0VarArr != null && z0VarArr.length > 0 && (z0Var = z0VarArr[0]) != null) {
                    z0Var.requestFocus();
                    anVar.f45247j9[0].performAccessibilityAction(64, null);
                    anVar.f45247j9[0].sendAccessibilityEvent(8);
                    return;
                }
                return;
            case 2:
                anVar.X5 = null;
                anVar.B8();
                return;
            case 3:
                anVar.X5 = null;
                anVar.B8();
                return;
            case 4:
                if (anVar.getParentActivity() != null && anVar.fragmentView != null && (qjVar = anVar.f45117a0) != null && (sendButton = qjVar.getSendButton()) != null && anVar.f45117a0.getEditField() != null && anVar.f45117a0.getEditField().getText().length() >= 5) {
                    int i10 = org.telegram.messenger.gz.f23932a;
                    SharedPreferences.Editor edit = org.telegram.messenger.np.e1().edit();
                    org.telegram.messenger.gz.L = System.currentTimeMillis();
                    int i11 = org.telegram.messenger.gz.K + 1;
                    org.telegram.messenger.gz.K = i11;
                    edit.putInt("scheduledOrNoSoundHintShows", i11);
                    edit.putLong("scheduledOrNoSoundHintSeenAt", org.telegram.messenger.gz.L);
                    edit.apply();
                    if (anVar.f45391v2 == null) {
                        hi.l3 E6 = anVar.E6(280.0f, 3, -1, true);
                        anVar.f45391v2 = E6;
                        E6.f14575v0 = 0.0f;
                        E6.f14577w0 = org.telegram.messenger.g0.L(56.0f) / 2.0f;
                        anVar.f45391v2.u(org.telegram.messenger.hd.M0(2131745847, null));
                    }
                    anVar.f45391v2.y(sendButton, true);
                    anVar.f45405w2 = true;
                    return;
                }
                return;
            case 5:
                anVar.x8(false, true, 0.0f);
                return;
            case 6:
                if (anVar.getParentActivity() != null && anVar.fragmentView != null && anVar.f45117a0 != null && anVar.f45143bb == null && anVar.getMessagesController().N1(anVar.a()) <= 0 && (sendButton2 = anVar.f45117a0.getSendButton()) != null && anVar.f45117a0.getEditField() != null && anVar.f45117a0.getEditField().getText().length() != 0) {
                    int i12 = org.telegram.messenger.gz.f23932a;
                    SharedPreferences.Editor edit2 = org.telegram.messenger.np.e1().edit();
                    org.telegram.messenger.gz.N = System.currentTimeMillis();
                    int i13 = org.telegram.messenger.gz.M + 1;
                    org.telegram.messenger.gz.M = i13;
                    edit2.putInt("scheduledHintShows", i13);
                    edit2.putLong("scheduledHintSeenAt", org.telegram.messenger.gz.N);
                    edit2.apply();
                    if (anVar.f45418x2 == null) {
                        hi.l3 E62 = anVar.E6(280.0f, 3, -1, true);
                        anVar.f45418x2 = E62;
                        E62.f14575v0 = 0.0f;
                        E62.u(org.telegram.messenger.hd.M0(2131745849, null));
                    }
                    anVar.f45418x2.y(sendButton2, true);
                    anVar.f45431y2 = true;
                    return;
                }
                return;
            case 7:
                an.a1(anVar);
                return;
            case 8:
                ArrayList arrayList = anVar.L6;
                anVar.f45263kc = System.currentTimeMillis();
                if (anVar.A0 != null && anVar.D0 != null) {
                    int i14 = Integer.MAX_VALUE;
                    int i15 = Integer.MIN_VALUE;
                    for (int i16 = 0; i16 < anVar.A0.getChildCount(); i16++) {
                        View childAt = anVar.A0.getChildAt(i16);
                        if (childAt instanceof org.telegram.ui.Cells.q1) {
                            org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) childAt;
                            if (q1Var.getCurrentMessagesGroup() != null) {
                                for (int i17 = 0; i17 < q1Var.getCurrentMessagesGroup().d.size(); i17++) {
                                    int e12 = ((org.telegram.messenger.gj) q1Var.getCurrentMessagesGroup().d.get(i17)).e1();
                                    i14 = Math.min(i14, e12);
                                    i15 = Math.max(i15, e12);
                                }
                            } else if (q1Var.getMessageObject() != null) {
                                int e13 = q1Var.getMessageObject().e1();
                                i14 = Math.min(i14, e13);
                                i15 = Math.max(i15, e13);
                            }
                        }
                    }
                    if (i14 <= i15) {
                        ArrayList arrayList2 = new ArrayList();
                        for (int i18 = 0; i18 < arrayList.size(); i18++) {
                            org.telegram.messenger.gj gjVar = (org.telegram.messenger.gj) arrayList.get(i18);
                            org.telegram.messenger.bj bjVar = (org.telegram.messenger.bj) anVar.O6.f(gjVar.c1());
                            if (bjVar != null) {
                                ArrayList arrayList3 = bjVar.d;
                                if (!arrayList2.contains(Long.valueOf(bjVar.f22707a))) {
                                    for (int i19 = 0; i19 < arrayList3.size(); i19++) {
                                        org.telegram.messenger.gj gjVar2 = (org.telegram.messenger.gj) arrayList3.get(i19);
                                        if (gjVar2 != null) {
                                            int e14 = gjVar2.e1();
                                            org.telegram.messenger.c10 c10Var = anVar.getMessagesController().f25403t7;
                                            if (e14 >= i14 - 7 && e14 <= i15 + 7) {
                                                z11 = true;
                                            } else {
                                                z11 = false;
                                            }
                                            c10Var.h(gjVar2, z11, false);
                                        }
                                    }
                                    arrayList2.add(Long.valueOf(bjVar.f22707a));
                                }
                            } else {
                                int e15 = gjVar.e1();
                                org.telegram.messenger.c10 c10Var2 = anVar.getMessagesController().f25403t7;
                                if (e15 >= i14 - 7 && e15 <= i15 + 7) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                c10Var2.h(gjVar, z10, false);
                            }
                        }
                    }
                }
                if (anVar.Y4 > 0 && anVar.W4 != null) {
                    anVar.getMessagesController().f25403t7.h((org.telegram.messenger.gj) anVar.W4.get(Integer.valueOf(anVar.Y4)), true, false);
                }
                anVar.Ed();
                return;
            case 9:
                anVar.x8(false, true, 0.0f);
                return;
            case 10:
                anVar.va();
                return;
            case 11:
                anVar.x8(false, true, 0.0f);
                return;
            case 12:
                org.telegram.ui.ActionBar.t1 t1Var = new org.telegram.ui.ActionBar.t1(3, anVar.getParentActivity(), anVar.Aa);
                anVar.Sb = t1Var;
                t1Var.setOnShowListener(new we(anVar, 1));
                anVar.Sb.setOnCancelListener(anVar.Ia);
                anVar.Sb.r(500L);
                return;
            case 13:
                anVar.finishFragment();
                return;
            case 14:
                anVar.x8(false, true, 0.0f);
                return;
            case 15:
                org.telegram.messenger.g0.E2(anVar.f45118a1);
                return;
            case 16:
                anVar.c7();
                return;
            case 17:
                anVar.f45116a = (anVar.f45116a + 1) % 3;
                return;
            case 18:
                anVar.f45131b = !anVar.f45131b;
                return;
            case 19:
                anVar.D0.N.clear();
                jl jlVar = anVar.D0;
                jlVar.M = false;
                jlVar.O(true);
                anVar.wc(false);
                return;
            case 20:
                anVar.P7(true);
                org.telegram.messenger.k5.n(null, 2131743970, org.telegram.ui.Components.cc.a0(anVar), 2131623982, 36);
                return;
            case 21:
                anVar.D0.N.clear();
                jl jlVar2 = anVar.D0;
                jlVar2.M = false;
                jlVar2.O(true);
                anVar.wc(false);
                return;
            case 22:
                anVar.Oc = 0;
                anVar.Pc = false;
                anVar.A0.g1();
                return;
            case 23:
                anVar.Ua = false;
                anVar.cd();
                return;
            case 24:
                anVar.M9();
                anVar.O9();
                anVar.G7();
                anVar.I7();
                return;
            case 25:
                tj tjVar = anVar.f45202g3;
                if ((tjVar == null || tjVar.getVisibility() != 0) && (l3Var = anVar.L1) != null) {
                    l3Var.w();
                    return;
                }
                return;
            case 26:
                anVar.z7();
                return;
            case 27:
                anVar.gd(0, (anVar.f45205g6 == 0 || SystemClock.elapsedRealtime() < anVar.f45205g6 + 150) ? false : false);
                return;
            case 28:
                anVar.p7(false);
                return;
            default:
                int i20 = an.f45107ld;
                anVar.o7();
                return;
        }
    }
}
