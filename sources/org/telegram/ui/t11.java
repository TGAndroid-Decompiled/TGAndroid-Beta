package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Wallet.WalletEngine2;
public final class t11 implements Runnable {
    public final int f41688a;
    public final Object f41689b;
    public final Object f41690c;

    public t11(int i10, Object obj, Object obj2) {
        this.f41688a = i10;
        this.f41689b = obj;
        this.f41690c = obj2;
    }

    @Override
    public final void run() {
        org.telegram.ui.Components.ck0 ck0Var;
        String message;
        int i10 = this.f41688a;
        int i11 = 0;
        Object obj = this.f41690c;
        Object obj2 = this.f41689b;
        switch (i10) {
            case 0:
                i31 i31Var = (i31) obj2;
                i31Var.v(null, false, false);
                ((org.telegram.ui.ActionBar.k2) obj).presentFragment(new StickersActivity(5, i31Var.L0));
                Runnable runnable = i31Var.U1;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 1:
                org.telegram.messenger.i0.g((String) obj);
                org.telegram.ui.Components.cc.a0((e51) obj2).k(false).j();
                return;
            case 2:
                e51.a0((e51) obj2, (TLRPC.TL_attachMenuBot) obj);
                return;
            case 3:
                org.telegram.ui.ActionBar.k2 k2Var = (org.telegram.ui.ActionBar.k2) obj;
                new m51(k2Var.getContext(), k2Var.getCurrentAccount(), k2Var.getResourceProvider(), (ag.e0) obj2).show();
                return;
            case 4:
                ((StickersActivity) obj2).r0((org.telegram.ui.Cells.k8) obj);
                return;
            case 5:
                ThemeActivity themeActivity = (ThemeActivity) obj2;
                View view = (View) obj;
                themeActivity.getMessagesController().C4(true);
                if (view instanceof org.telegram.ui.Cells.t8) {
                    ((org.telegram.ui.Cells.t8) view).setChecked(themeActivity.getMessagesController().P4());
                    return;
                }
                return;
            case 6:
                ThemeActivity themeActivity2 = (ThemeActivity) obj2;
                String str = (String) obj;
                themeActivity2.getClass();
                org.telegram.ui.ActionBar.t6.f21270w = str;
                if (str == null) {
                    org.telegram.ui.ActionBar.t6.f21270w = String.format("(%.06f, %.06f)", Double.valueOf(org.telegram.ui.ActionBar.t6.f21288x), Double.valueOf(org.telegram.ui.ActionBar.t6.f21305y));
                }
                org.telegram.ui.ActionBar.t6.w1();
                org.telegram.ui.Components.tk0 tk0Var = themeActivity2.f34089b;
                if (tk0Var != null && (ck0Var = (org.telegram.ui.Components.ck0) tk0Var.K(themeActivity2.Y)) != null) {
                    View view2 = ck0Var.f47898a;
                    if (view2 instanceof org.telegram.ui.Cells.x9) {
                        ((org.telegram.ui.Cells.x9) view2).c(org.telegram.messenger.cd.L0(2131753781, "AutoNightUpdateLocation"), org.telegram.ui.ActionBar.t6.f21270w, false, false);
                        return;
                    }
                    return;
                }
                return;
            case 7:
                m91 m91Var = (m91) obj2;
                SharedPreferences sharedPreferences = (SharedPreferences) obj;
                if (m91Var.f39575n == 3) {
                    sharedPreferences.edit().putBoolean("bganimationhint", true).commit();
                    m91Var.B0.f(m91Var.L0[0], true);
                    return;
                }
                return;
            case 8:
                p91.b0((p91) obj2, (String) obj);
                return;
            case 9:
                p91.Z((p91) obj2, (TLRPC.TL_theme) obj);
                return;
            case 10:
                x91 x91Var = (x91) obj2;
                x91Var.getClass();
                org.telegram.messenger.i0.g((String) obj);
                x91Var.c(true);
                return;
            case 11:
                org.telegram.messenger.i0.g(org.telegram.messenger.jj.h0(((TLRPC.TodoItem) obj).title, false));
                ((x91) obj2).c(true);
                return;
            case 12:
                wa1 wa1Var = (wa1) obj2;
                wa1Var.getClass();
                Bundle bundle = new Bundle();
                pb1 pb1Var = wa1Var.f42915b;
                bundle.putLong("dialog_id", -pb1Var.f40566a);
                bundle.putLong("topic_id", ((TLRPC.TL_forumTopic) obj).f19845id);
                pb1Var.presentFragment(new uy0(bundle, null));
                return;
            case 13:
                lb1 lb1Var = (lb1) obj2;
                String str2 = (String) obj;
                ArrayList arrayList = lb1Var.f39153e0;
                pb1 pb1Var2 = lb1Var.f39169v0;
                String lowerCase = str2.trim().toLowerCase();
                ArrayList arrayList2 = new ArrayList();
                int i12 = 0;
                while (true) {
                    ArrayList arrayList3 = pb1Var2.f40569b;
                    if (i12 < arrayList3.size()) {
                        if (((hb1) arrayList3.get(i12)).f37887c != null && ((hb1) arrayList3.get(i12)).f37887c.title.toLowerCase().contains(lowerCase)) {
                            arrayList2.add(((hb1) arrayList3.get(i12)).f37887c);
                            ((hb1) arrayList3.get(i12)).f37887c.searchQuery = lowerCase;
                        }
                        i12++;
                    } else {
                        arrayList.clear();
                        arrayList.addAll(arrayList2);
                        lb1Var.N();
                        if (!arrayList.isEmpty()) {
                            lb1Var.f39161n0 = false;
                            lb1Var.f39164q0.b(0);
                        }
                        lb1Var.L(str2);
                        return;
                    }
                }
                break;
            case 14:
                sb1 sb1Var = ((rb1) obj2).f41195b;
                sb1Var.f41465a.e.remove(Integer.valueOf(((TLRPC.TL_forumTopic) obj).f19845id));
                sb1Var.f41465a.Z();
                return;
            case 15:
                TwoStepVerificationActivity.c0((TwoStepVerificationActivity) obj2, (byte[]) obj);
                return;
            case 16:
                TwoStepVerificationActivity.h0((TwoStepVerificationActivity) obj2, (TL_account.updatePasswordSettings) obj);
                return;
            case 17:
                TwoStepVerificationActivity.a0((TwoStepVerificationActivity) obj2, (TLRPC.TL_error) obj);
                return;
            case 18:
                tc1.k0((tc1) obj2, (String) obj);
                return;
            case 19:
                Runnable runnable2 = (Runnable) obj;
                bs[] bsVarArr = ((tc1) obj2).f41812x.f44219f;
                int length = bsVarArr.length;
                while (i11 < length) {
                    bsVarArr[i11].C(0.0f);
                    i11++;
                }
                runnable2.run();
                return;
            case 20:
                zc1 zc1Var = (zc1) obj2;
                TLObject tLObject = (TLObject) obj;
                ArrayList arrayList4 = zc1Var.f44125f;
                ArrayList arrayList5 = zc1Var.e;
                if (tLObject instanceof TLRPC.messages_Chats) {
                    arrayList5.clear();
                    arrayList5.addAll(((TLRPC.messages_Chats) tLObject).chats);
                }
                org.telegram.messenger.vp.r1(zc1Var.f44122a).P3(arrayList5, false);
                zc1Var.d = false;
                zc1Var.f44124c = true;
                int size = arrayList4.size();
                while (i11 < size) {
                    Object obj3 = arrayList4.get(i11);
                    i11++;
                    ((Runnable) obj3).run();
                }
                arrayList4.clear();
                return;
            case 21:
                be1 be1Var = (be1) obj2;
                be1Var.U.a(new ld1(be1Var, (VoIPService) obj, 1), true);
                return;
            case 22:
                be1 be1Var2 = (be1) obj2;
                ValueAnimator valueAnimator = (ValueAnimator) obj;
                org.telegram.ui.Components.voip.t1.U = false;
                org.telegram.ui.Components.voip.t1.a();
                ViewPropertyAnimator duration = be1Var2.K.animate().setDuration(150L);
                org.telegram.ui.Components.gr grVar = org.telegram.ui.Components.gr.f26495f;
                duration.setInterpolator(grVar).start();
                be1Var2.H.animate().alpha(1.0f).setDuration(150L).setInterpolator(grVar).start();
                be1Var2.I.animate().alpha(1.0f).setDuration(150L).setInterpolator(grVar).start();
                be1Var2.N.animate().alpha(1.0f).setDuration(150L).setInterpolator(grVar).start();
                be1Var2.X.animate().alpha(1.0f).setDuration(150L).setInterpolator(grVar).start();
                be1Var2.f36218j0.animate().alpha(1.0f).setDuration(150L).setInterpolator(grVar).start();
                be1Var2.f36214h0.animate().alpha(1.0f).setDuration(350L).setInterpolator(grVar).start();
                be1Var2.f36216i0.animate().alpha(1.0f).setDuration(350L).setInterpolator(grVar).start();
                be1Var2.M0.animate().alpha(1.0f).setDuration(350L).setInterpolator(grVar).start();
                valueAnimator.addListener(new qd1(be1Var2, 2));
                valueAnimator.setDuration(350L);
                valueAnimator.setInterpolator(grVar);
                valueAnimator.start();
                return;
            case 23:
                org.telegram.messenger.vp.r1(((org.telegram.ui.Wallet.k0) obj2).f34776a).L3((TLRPC.Updates) obj, false);
                return;
            case 24:
                org.telegram.ui.Wallet.k0 k0Var = (org.telegram.ui.Wallet.k0) obj2;
                org.telegram.ui.Wallet.k0.H("enable backup: ready! getting secret phrase...");
                k0Var.z(new ih.s(17, k0Var, (org.telegram.ui.Wallet.l8) obj), false, true);
                return;
            case 25:
                boolean[] zArr = (boolean[]) obj2;
                org.telegram.ui.Wallet.o oVar = (org.telegram.ui.Wallet.o) obj;
                if (!zArr[0]) {
                    zArr[0] = true;
                    oVar.run();
                    return;
                }
                return;
            case 26:
                org.telegram.ui.Wallet.k0 k0Var2 = (org.telegram.ui.Wallet.k0) obj2;
                org.telegram.ui.Wallet.j jVar = (org.telegram.ui.Wallet.j) obj;
                org.telegram.ui.Wallet.k0.H("emulate disable backup: ready");
                if (k0Var2.v() <= 0) {
                    jVar.a(500000L, null);
                    return;
                }
                WalletEngine2 walletEngine2 = k0Var2.f34777b;
                if (walletEngine2 == null) {
                    org.telegram.ui.Wallet.k0.j("emulate disable backup: no engine!");
                    jVar.a(null, "NULL_ENGINE");
                    return;
                }
                walletEngine2.emulateRotateKey(new org.telegram.ui.Wallet.d(k0Var2, jVar));
                return;
            case 27:
                qh.d dVar = (qh.d) obj2;
                Exception exc = (Exception) obj;
                if (exc.getMessage() == null) {
                    message = "NULL_ERROR";
                } else {
                    message = exc.getMessage();
                }
                dVar.a(null, message);
                return;
            case 28:
                org.telegram.messenger.vp.r1(((org.telegram.ui.Wallet.e2) obj2).f34445a).L3((TLRPC.Updates) obj, false);
                return;
            default:
                org.telegram.ui.Wallet.t2 t2Var = (org.telegram.ui.Wallet.t2) obj2;
                org.telegram.ui.Wallet.y2 y2Var = (org.telegram.ui.Wallet.y2) obj;
                if (!t2Var.e) {
                    y2Var.f21590c0 = true;
                    Runnable runnable3 = t2Var.f35230g;
                    if (runnable3 != null) {
                        runnable3.run();
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public t11(org.telegram.ui.ActionBar.k2 k2Var, ag.e0 e0Var) {
        this.f41688a = 3;
        this.f41690c = k2Var;
        this.f41689b = e0Var;
    }
}
