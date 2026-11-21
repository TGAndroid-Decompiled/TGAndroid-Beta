package org.telegram.ui;

import android.content.SharedPreferences;
import android.os.SystemClock;
import android.view.View;
import java.util.ArrayList;
public final class vf implements Runnable {
    public final int f52804a;
    public final bn f52805b;

    public vf(bn bnVar, int i7) {
        this.f52804a = i7;
        this.f52805b = bnVar;
    }

    @Override
    public final void run() {
        org.telegram.ui.ActionBar.y0 y0Var;
        rj rjVar;
        View sendButton;
        View sendButton2;
        boolean z10;
        boolean z11;
        hi.l3 l3Var;
        int i7 = this.f52804a;
        boolean z12 = true;
        bn bnVar = this.f52805b;
        switch (i7) {
            case 0:
                bnVar.x8(false, true, 0.0f);
                return;
            case 1:
                org.telegram.ui.ActionBar.y0[] y0VarArr = bnVar.f46090k9;
                if (y0VarArr != null && y0VarArr.length > 0 && (y0Var = y0VarArr[0]) != null) {
                    y0Var.requestFocus();
                    bnVar.f46090k9[0].performAccessibilityAction(64, null);
                    bnVar.f46090k9[0].sendAccessibilityEvent(8);
                    return;
                }
                return;
            case 2:
                bnVar.Y5 = null;
                bnVar.B8();
                return;
            case 3:
                bnVar.Y5 = null;
                bnVar.B8();
                return;
            case 4:
                bnVar.x8(false, true, 0.0f);
                return;
            case 5:
                if (bnVar.getParentActivity() != null && bnVar.fragmentView != null && (rjVar = bnVar.f45946a0) != null && (sendButton = rjVar.getSendButton()) != null && bnVar.f45946a0.getEditField() != null && bnVar.f45946a0.getEditField().getText().length() >= 5) {
                    int i10 = org.telegram.messenger.bz.f23173a;
                    SharedPreferences.Editor edit = org.telegram.messenger.mp.g1().edit();
                    org.telegram.messenger.bz.L = System.currentTimeMillis();
                    int i11 = org.telegram.messenger.bz.K + 1;
                    org.telegram.messenger.bz.K = i11;
                    edit.putInt("scheduledOrNoSoundHintShows", i11);
                    edit.putLong("scheduledOrNoSoundHintSeenAt", org.telegram.messenger.bz.L);
                    edit.apply();
                    if (bnVar.f46221v2 == null) {
                        hi.l3 E6 = bnVar.E6(280.0f, 3, -1, true);
                        bnVar.f46221v2 = E6;
                        E6.f14990v0 = 0.0f;
                        E6.f14992w0 = org.telegram.messenger.g0.L(56.0f) / 2.0f;
                        bnVar.f46221v2.v(org.telegram.messenger.gd.N0(2131745651, null));
                    }
                    bnVar.f46221v2.z(sendButton, true);
                    bnVar.f46235w2 = true;
                    return;
                }
                return;
            case 6:
                bn.a1(bnVar);
                return;
            case 7:
                if (bnVar.getParentActivity() != null && bnVar.fragmentView != null && bnVar.f45946a0 != null && bnVar.f45986cb == null && bnVar.getMessagesController().P1(bnVar.a()) <= 0 && (sendButton2 = bnVar.f45946a0.getSendButton()) != null && bnVar.f45946a0.getEditField() != null && bnVar.f45946a0.getEditField().getText().length() != 0) {
                    int i12 = org.telegram.messenger.bz.f23173a;
                    SharedPreferences.Editor edit2 = org.telegram.messenger.mp.g1().edit();
                    org.telegram.messenger.bz.N = System.currentTimeMillis();
                    int i13 = org.telegram.messenger.bz.M + 1;
                    org.telegram.messenger.bz.M = i13;
                    edit2.putInt("scheduledHintShows", i13);
                    edit2.putLong("scheduledHintSeenAt", org.telegram.messenger.bz.N);
                    edit2.apply();
                    if (bnVar.f46248x2 == null) {
                        hi.l3 E62 = bnVar.E6(280.0f, 3, -1, true);
                        bnVar.f46248x2 = E62;
                        E62.f14990v0 = 0.0f;
                        E62.v(org.telegram.messenger.gd.N0(2131745653, null));
                    }
                    bnVar.f46248x2.z(sendButton2, true);
                    bnVar.f46261y2 = true;
                    return;
                }
                return;
            case 8:
                bnVar.x8(false, true, 0.0f);
                return;
            case 9:
                ArrayList arrayList = bnVar.M6;
                bnVar.f46105lc = System.currentTimeMillis();
                if (bnVar.A0 != null && bnVar.D0 != null) {
                    int i14 = Integer.MAX_VALUE;
                    int i15 = Integer.MIN_VALUE;
                    for (int i16 = 0; i16 < bnVar.A0.getChildCount(); i16++) {
                        View childAt = bnVar.A0.getChildAt(i16);
                        if (childAt instanceof org.telegram.ui.Cells.r1) {
                            org.telegram.ui.Cells.r1 r1Var = (org.telegram.ui.Cells.r1) childAt;
                            if (r1Var.getCurrentMessagesGroup() != null) {
                                for (int i17 = 0; i17 < r1Var.getCurrentMessagesGroup().d.size(); i17++) {
                                    int e12 = ((org.telegram.messenger.fj) r1Var.getCurrentMessagesGroup().d.get(i17)).e1();
                                    i14 = Math.min(i14, e12);
                                    i15 = Math.max(i15, e12);
                                }
                            } else if (r1Var.getMessageObject() != null) {
                                int e13 = r1Var.getMessageObject().e1();
                                i14 = Math.min(i14, e13);
                                i15 = Math.max(i15, e13);
                            }
                        }
                    }
                    if (i14 <= i15) {
                        ArrayList arrayList2 = new ArrayList();
                        for (int i18 = 0; i18 < arrayList.size(); i18++) {
                            org.telegram.messenger.fj fjVar = (org.telegram.messenger.fj) arrayList.get(i18);
                            org.telegram.messenger.aj ajVar = (org.telegram.messenger.aj) bnVar.P6.f(fjVar.c1());
                            if (ajVar != null) {
                                ArrayList arrayList3 = ajVar.d;
                                if (!arrayList2.contains(Long.valueOf(ajVar.f22923a))) {
                                    for (int i19 = 0; i19 < arrayList3.size(); i19++) {
                                        org.telegram.messenger.fj fjVar2 = (org.telegram.messenger.fj) arrayList3.get(i19);
                                        if (fjVar2 != null) {
                                            int e14 = fjVar2.e1();
                                            org.telegram.messenger.z00 z00Var = bnVar.getMessagesController().f25815v7;
                                            if (e14 >= i14 - 7 && e14 <= i15 + 7) {
                                                z11 = true;
                                            } else {
                                                z11 = false;
                                            }
                                            z00Var.h(fjVar2, z11, false);
                                        }
                                    }
                                    arrayList2.add(Long.valueOf(ajVar.f22923a));
                                }
                            } else {
                                int e15 = fjVar.e1();
                                org.telegram.messenger.z00 z00Var2 = bnVar.getMessagesController().f25815v7;
                                if (e15 >= i14 - 7 && e15 <= i15 + 7) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                z00Var2.h(fjVar, z10, false);
                            }
                        }
                    }
                }
                if (bnVar.Z4 > 0 && bnVar.X4 != null) {
                    bnVar.getMessagesController().f25815v7.h((org.telegram.messenger.fj) bnVar.X4.get(Integer.valueOf(bnVar.Z4)), true, false);
                }
                bnVar.Ed();
                return;
            case 10:
                bnVar.x8(false, true, 0.0f);
                return;
            case 11:
                org.telegram.ui.ActionBar.t1 t1Var = new org.telegram.ui.ActionBar.t1(3, bnVar.getParentActivity(), bnVar.Ba);
                bnVar.Tb = t1Var;
                t1Var.setOnShowListener(new xe(bnVar, 1));
                bnVar.Tb.setOnCancelListener(bnVar.Ja);
                bnVar.Tb.r(500L);
                return;
            case 12:
                bnVar.va();
                return;
            case 13:
                bnVar.x8(false, true, 0.0f);
                return;
            case 14:
                org.telegram.messenger.g0.E2(bnVar.f45947a1);
                return;
            case 15:
                bnVar.c7();
                return;
            case 16:
                bnVar.f45945a = (bnVar.f45945a + 1) % 3;
                return;
            case 17:
                bnVar.f45960b = !bnVar.f45960b;
                return;
            case 18:
                bnVar.D0.N.clear();
                kl klVar = bnVar.D0;
                klVar.M = false;
                klVar.O(true);
                bnVar.wc(false);
                return;
            case 19:
                bnVar.P7(true);
                org.telegram.messenger.f3.n(null, 2131743727, org.telegram.ui.Components.lc.b0(bnVar), 2131623982, 36);
                return;
            case 20:
                bnVar.finishFragment();
                return;
            case 21:
                bnVar.D0.N.clear();
                kl klVar2 = bnVar.D0;
                klVar2.M = false;
                klVar2.O(true);
                bnVar.wc(false);
                return;
            case 22:
                bnVar.Pc = 0;
                bnVar.Qc = false;
                bnVar.A0.g1();
                return;
            case 23:
                bnVar.M9();
                bnVar.O9();
                bnVar.G7();
                bnVar.I7();
                return;
            case 24:
                bnVar.Va = false;
                bnVar.cd();
                return;
            case 25:
                uj ujVar = bnVar.f46031g3;
                if ((ujVar == null || ujVar.getVisibility() != 0) && (l3Var = bnVar.L1) != null) {
                    l3Var.x();
                    return;
                }
                return;
            case 26:
                bnVar.z7();
                return;
            case 27:
                bnVar.p7(false);
                return;
            case 28:
                bnVar.gd(0, (bnVar.f46048h6 == 0 || SystemClock.elapsedRealtime() < bnVar.f46048h6 + 150) ? false : false);
                return;
            default:
                int i20 = bn.f45936md;
                bnVar.o7();
                return;
        }
    }
}
