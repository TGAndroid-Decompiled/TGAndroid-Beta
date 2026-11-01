package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Wallet.WalletEngine2;
public final class y01 implements Runnable {
    public final int f43523a;
    public final Object f43524b;
    public final Object f43525c;

    public y01(int i10, Object obj, Object obj2) {
        this.f43523a = i10;
        this.f43524b = obj;
        this.f43525c = obj2;
    }

    @Override
    public final void run() {
        org.telegram.ui.Components.dk0 dk0Var;
        String message;
        int i10 = this.f43523a;
        int i11 = 0;
        Object obj = this.f43525c;
        Object obj2 = this.f43524b;
        switch (i10) {
            case 0:
                ((SecretMediaViewer) ((m5.e) obj2).f13015c).i((File) obj);
                return;
            case 1:
                g31 g31Var = (g31) obj2;
                g31Var.v(null, false, false);
                ((org.telegram.ui.ActionBar.k2) obj).presentFragment(new StickersActivity(5, g31Var.L0));
                Runnable runnable = g31Var.U1;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 2:
                org.telegram.messenger.i0.g((String) obj);
                org.telegram.ui.Components.cc.a0((c51) obj2).k(false).j();
                return;
            case 3:
                c51.b0((c51) obj2, (TLRPC.TL_attachMenuBot) obj);
                return;
            case 4:
                org.telegram.ui.ActionBar.k2 k2Var = (org.telegram.ui.ActionBar.k2) obj2;
                new k51(k2Var.getContext(), k2Var.getCurrentAccount(), k2Var.getResourceProvider(), (ag.e0) obj).show();
                return;
            case 5:
                ((StickersActivity) obj2).s0((org.telegram.ui.Cells.k8) obj);
                return;
            case 6:
                ThemeActivity themeActivity = (ThemeActivity) obj2;
                View view = (View) obj;
                themeActivity.getMessagesController().C4(true);
                if (view instanceof org.telegram.ui.Cells.t8) {
                    ((org.telegram.ui.Cells.t8) view).setChecked(themeActivity.getMessagesController().P4());
                    return;
                }
                return;
            case 7:
                ThemeActivity themeActivity2 = (ThemeActivity) obj2;
                String str = (String) obj;
                themeActivity2.getClass();
                org.telegram.ui.ActionBar.t6.f21271w = str;
                if (str == null) {
                    org.telegram.ui.ActionBar.t6.f21271w = String.format("(%.06f, %.06f)", Double.valueOf(org.telegram.ui.ActionBar.t6.f21289x), Double.valueOf(org.telegram.ui.ActionBar.t6.f21306y));
                }
                org.telegram.ui.ActionBar.t6.w1();
                org.telegram.ui.Components.uk0 uk0Var = themeActivity2.f34096b;
                if (uk0Var != null && (dk0Var = (org.telegram.ui.Components.dk0) uk0Var.K(themeActivity2.Y)) != null) {
                    View view2 = dk0Var.f47909a;
                    if (view2 instanceof org.telegram.ui.Cells.x9) {
                        ((org.telegram.ui.Cells.x9) view2).c(org.telegram.messenger.dd.L0(2131753781, "AutoNightUpdateLocation"), org.telegram.ui.ActionBar.t6.f21271w, false, false);
                        return;
                    }
                    return;
                }
                return;
            case 8:
                k91 k91Var = (k91) obj2;
                SharedPreferences sharedPreferences = (SharedPreferences) obj;
                if (k91Var.f38750n == 3) {
                    sharedPreferences.edit().putBoolean("bganimationhint", true).commit();
                    k91Var.B0.f(k91Var.L0[0], true);
                    return;
                }
                return;
            case 9:
                n91.c0((n91) obj2, (String) obj);
                return;
            case 10:
                n91.a0((n91) obj2, (TLRPC.TL_theme) obj);
                return;
            case 11:
                v91 v91Var = (v91) obj2;
                v91Var.getClass();
                org.telegram.messenger.i0.g((String) obj);
                v91Var.c(true);
                return;
            case 12:
                org.telegram.messenger.i0.g(org.telegram.messenger.kj.h0(((TLRPC.TodoItem) obj).title, false));
                ((v91) obj2).c(true);
                return;
            case 13:
                ua1 ua1Var = (ua1) obj2;
                ua1Var.getClass();
                Bundle bundle = new Bundle();
                nb1 nb1Var = ua1Var.f41900b;
                bundle.putLong("dialog_id", -nb1Var.f39797a);
                bundle.putLong("topic_id", ((TLRPC.TL_forumTopic) obj).f19846id);
                nb1Var.presentFragment(new ty0(bundle, null));
                return;
            case 14:
                jb1 jb1Var = (jb1) obj2;
                String str2 = (String) obj;
                ArrayList arrayList = jb1Var.f38340e0;
                nb1 nb1Var2 = jb1Var.f38356v0;
                String lowerCase = str2.trim().toLowerCase();
                ArrayList arrayList2 = new ArrayList();
                int i12 = 0;
                while (true) {
                    ArrayList arrayList3 = nb1Var2.f39800b;
                    if (i12 < arrayList3.size()) {
                        if (((fb1) arrayList3.get(i12)).f37097c != null && ((fb1) arrayList3.get(i12)).f37097c.title.toLowerCase().contains(lowerCase)) {
                            arrayList2.add(((fb1) arrayList3.get(i12)).f37097c);
                            ((fb1) arrayList3.get(i12)).f37097c.searchQuery = lowerCase;
                        }
                        i12++;
                    } else {
                        arrayList.clear();
                        arrayList.addAll(arrayList2);
                        jb1Var.N();
                        if (!arrayList.isEmpty()) {
                            jb1Var.f38348n0 = false;
                            jb1Var.f38351q0.b(0);
                        }
                        jb1Var.L(str2);
                        return;
                    }
                }
                break;
            case 15:
                qb1 qb1Var = ((pb1) obj2).f40446b;
                qb1Var.f40741a.e.remove(Integer.valueOf(((TLRPC.TL_forumTopic) obj).f19846id));
                qb1Var.f40741a.a0();
                return;
            case 16:
                TwoStepVerificationActivity.d0((TwoStepVerificationActivity) obj2, (byte[]) obj);
                return;
            case 17:
                TwoStepVerificationActivity.i0((TwoStepVerificationActivity) obj2, (TL_account.updatePasswordSettings) obj);
                return;
            case 18:
                TwoStepVerificationActivity.b0((TwoStepVerificationActivity) obj2, (TLRPC.TL_error) obj);
                return;
            case 19:
                rc1.l0((rc1) obj2, (String) obj);
                return;
            case 20:
                Runnable runnable2 = (Runnable) obj;
                bs[] bsVarArr = ((rc1) obj2).f41055x.f44045f;
                int length = bsVarArr.length;
                while (i11 < length) {
                    bsVarArr[i11].C(0.0f);
                    i11++;
                }
                runnable2.run();
                return;
            case 21:
                xc1 xc1Var = (xc1) obj2;
                TLObject tLObject = (TLObject) obj;
                ArrayList arrayList4 = xc1Var.f43353f;
                ArrayList arrayList5 = xc1Var.e;
                if (tLObject instanceof TLRPC.messages_Chats) {
                    arrayList5.clear();
                    arrayList5.addAll(((TLRPC.messages_Chats) tLObject).chats);
                }
                org.telegram.messenger.wp.r1(xc1Var.f43350a).P3(arrayList5, false);
                xc1Var.d = false;
                xc1Var.f43352c = true;
                int size = arrayList4.size();
                while (i11 < size) {
                    Object obj3 = arrayList4.get(i11);
                    i11++;
                    ((Runnable) obj3).run();
                }
                arrayList4.clear();
                return;
            case 22:
                zd1 zd1Var = (zd1) obj2;
                zd1Var.U.a(new jd1(zd1Var, (VoIPService) obj, 1), true);
                return;
            case 23:
                zd1 zd1Var2 = (zd1) obj2;
                ValueAnimator valueAnimator = (ValueAnimator) obj;
                org.telegram.ui.Components.voip.u1.U = false;
                org.telegram.ui.Components.voip.u1.a();
                ViewPropertyAnimator duration = zd1Var2.K.animate().setDuration(150L);
                org.telegram.ui.Components.gr grVar = org.telegram.ui.Components.gr.f26523f;
                duration.setInterpolator(grVar).start();
                zd1Var2.H.animate().alpha(1.0f).setDuration(150L).setInterpolator(grVar).start();
                zd1Var2.I.animate().alpha(1.0f).setDuration(150L).setInterpolator(grVar).start();
                zd1Var2.N.animate().alpha(1.0f).setDuration(150L).setInterpolator(grVar).start();
                zd1Var2.X.animate().alpha(1.0f).setDuration(150L).setInterpolator(grVar).start();
                zd1Var2.f43957j0.animate().alpha(1.0f).setDuration(150L).setInterpolator(grVar).start();
                zd1Var2.f43953h0.animate().alpha(1.0f).setDuration(350L).setInterpolator(grVar).start();
                zd1Var2.f43955i0.animate().alpha(1.0f).setDuration(350L).setInterpolator(grVar).start();
                zd1Var2.M0.animate().alpha(1.0f).setDuration(350L).setInterpolator(grVar).start();
                valueAnimator.addListener(new od1(zd1Var2, 2));
                valueAnimator.setDuration(350L);
                valueAnimator.setInterpolator(grVar);
                valueAnimator.start();
                return;
            case 24:
                org.telegram.messenger.wp.r1(((org.telegram.ui.Wallet.k0) obj2).f34781a).L3((TLRPC.Updates) obj, false);
                return;
            case 25:
                org.telegram.ui.Wallet.k0 k0Var = (org.telegram.ui.Wallet.k0) obj2;
                org.telegram.ui.Wallet.k0.H("enable backup: ready! getting secret phrase...");
                k0Var.z(new ih.s(17, k0Var, (org.telegram.ui.Wallet.l8) obj), false, true);
                return;
            case 26:
                boolean[] zArr = (boolean[]) obj2;
                org.telegram.ui.Wallet.o oVar = (org.telegram.ui.Wallet.o) obj;
                if (!zArr[0]) {
                    zArr[0] = true;
                    oVar.run();
                    return;
                }
                return;
            case 27:
                org.telegram.ui.Wallet.k0 k0Var2 = (org.telegram.ui.Wallet.k0) obj2;
                org.telegram.ui.Wallet.j jVar = (org.telegram.ui.Wallet.j) obj;
                org.telegram.ui.Wallet.k0.H("emulate disable backup: ready");
                if (k0Var2.v() <= 0) {
                    jVar.a(500000L, null);
                    return;
                }
                WalletEngine2 walletEngine2 = k0Var2.f34782b;
                if (walletEngine2 == null) {
                    org.telegram.ui.Wallet.k0.j("emulate disable backup: no engine!");
                    jVar.a(null, "NULL_ENGINE");
                    return;
                }
                walletEngine2.emulateRotateKey(new org.telegram.ui.Wallet.d(k0Var2, jVar));
                return;
            case 28:
                qh.d dVar = (qh.d) obj2;
                Exception exc = (Exception) obj;
                if (exc.getMessage() == null) {
                    message = "NULL_ERROR";
                } else {
                    message = exc.getMessage();
                }
                dVar.a(null, message);
                return;
            default:
                org.telegram.messenger.wp.r1(((org.telegram.ui.Wallet.e2) obj2).f34450a).L3((TLRPC.Updates) obj, false);
                return;
        }
    }
}
