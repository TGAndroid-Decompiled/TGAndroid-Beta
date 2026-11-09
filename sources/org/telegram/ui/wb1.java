package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.graphics.Canvas;
import android.text.SpannableString;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.TextView;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Wallet.WalletEngine2;
public final class wb1 implements Runnable {
    public final int f51025a;
    public final Object f51026b;
    public final Object f51027c;

    public wb1(int i7, Object obj, Object obj2) {
        this.f51025a = i7;
        this.f51026b = obj;
        this.f51027c = obj2;
    }

    @Override
    public final void run() {
        String message;
        int i7 = this.f51025a;
        Object obj = this.f51027c;
        Object obj2 = this.f51026b;
        switch (i7) {
            case 0:
                ic1 ic1Var = (ic1) obj2;
                ValueAnimator valueAnimator = (ValueAnimator) obj;
                org.telegram.ui.Components.voip.e2.S = false;
                org.telegram.ui.Components.voip.e2.b();
                ViewPropertyAnimator duration = ic1Var.K.animate().setDuration(150L);
                org.telegram.ui.Components.xq xqVar = org.telegram.ui.Components.xq.f40458f;
                duration.setInterpolator(xqVar).start();
                ic1Var.H.animate().alpha(1.0f).setDuration(150L).setInterpolator(xqVar).start();
                ic1Var.I.animate().alpha(1.0f).setDuration(150L).setInterpolator(xqVar).start();
                ic1Var.N.animate().alpha(1.0f).setDuration(150L).setInterpolator(xqVar).start();
                ic1Var.X.animate().alpha(1.0f).setDuration(150L).setInterpolator(xqVar).start();
                ic1Var.f46592i0.animate().alpha(1.0f).setDuration(150L).setInterpolator(xqVar).start();
                ic1Var.f46588g0.animate().alpha(1.0f).setDuration(350L).setInterpolator(xqVar).start();
                ic1Var.f46590h0.animate().alpha(1.0f).setDuration(350L).setInterpolator(xqVar).start();
                ic1Var.L0.animate().alpha(1.0f).setDuration(350L).setInterpolator(xqVar).start();
                valueAnimator.addListener(new yb1(ic1Var, 2));
                valueAnimator.setDuration(350L);
                valueAnimator.setInterpolator(xqVar);
                valueAnimator.start();
                return;
            case 1:
                org.telegram.messenger.qp.s1(((org.telegram.ui.Wallet.l0) obj2).f42680a).O3((TLRPC.Updates) obj, false);
                return;
            case 2:
                org.telegram.ui.Wallet.l0 l0Var = (org.telegram.ui.Wallet.l0) obj2;
                org.telegram.ui.Wallet.l0.H("enable backup: ready! getting secret phrase...");
                l0Var.z(new bi.p5(23, l0Var, (org.telegram.ui.Wallet.e8) obj), false, true);
                return;
            case 3:
                boolean[] zArr = (boolean[]) obj2;
                org.telegram.ui.Wallet.o oVar = (org.telegram.ui.Wallet.o) obj;
                if (!zArr[0]) {
                    zArr[0] = true;
                    oVar.run();
                    return;
                }
                return;
            case 4:
                org.telegram.ui.Wallet.l0 l0Var2 = (org.telegram.ui.Wallet.l0) obj2;
                org.telegram.ui.Wallet.j jVar = (org.telegram.ui.Wallet.j) obj;
                org.telegram.ui.Wallet.l0.H("emulate disable backup: ready");
                if (l0Var2.v() <= 0) {
                    jVar.a(500000L, null);
                    return;
                }
                WalletEngine2 walletEngine2 = l0Var2.f42681b;
                if (walletEngine2 == null) {
                    org.telegram.ui.Wallet.l0.j("emulate disable backup: no engine!");
                    jVar.a(null, "NULL_ENGINE");
                    return;
                }
                walletEngine2.emulateRotateKey(new org.telegram.ui.Wallet.d(l0Var2, jVar));
                return;
            case 5:
                ai.e eVar = (ai.e) obj2;
                Exception exc = (Exception) obj;
                if (exc.getMessage() == null) {
                    message = "NULL_ERROR";
                } else {
                    message = exc.getMessage();
                }
                eVar.a(null, message);
                return;
            case 6:
                org.telegram.messenger.qp.s1(((org.telegram.ui.Wallet.d2) obj2).f42345a).O3((TLRPC.Updates) obj, false);
                return;
            case 7:
                org.telegram.ui.Wallet.s2 s2Var = (org.telegram.ui.Wallet.s2) obj2;
                org.telegram.ui.Wallet.x2 x2Var = (org.telegram.ui.Wallet.x2) obj;
                if (!s2Var.f43084e) {
                    x2Var.f28628c0 = true;
                    Runnable runnable = s2Var.f43086g;
                    if (runnable != null) {
                        runnable.run();
                        return;
                    }
                    return;
                }
                return;
            case 8:
                org.telegram.ui.ActionBar.f2 f2Var = (org.telegram.ui.ActionBar.f2) obj2;
                f2Var.presentFragment(new org.telegram.ui.Wallet.l9(f2Var.getCurrentAccount(), ((TL_wallet.card) obj).address));
                return;
            case 9:
                TextView[] textViewArr = (TextView[]) obj2;
                SpannableString[] spannableStringArr = (SpannableString[]) obj;
                if (textViewArr[0] != null) {
                    if (spannableStringArr[0] == null) {
                        SpannableString spannableString = new SpannableString(org.telegram.messenger.id.M0(2131748779, null));
                        spannableStringArr[0] = spannableString;
                        spannableString.setSpan(new org.telegram.ui.Components.c80(org.telegram.messenger.g0.L(150.0f), textViewArr[0]), 0, spannableStringArr[0].length(), 33);
                    }
                    textViewArr[0].setText(spannableStringArr[0]);
                    return;
                }
                return;
            case 10:
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                ((org.telegram.messenger.v10) obj2).a(wallettransaction.comment, Boolean.valueOf(wallettransaction.comment_encrypted));
                return;
            case 11:
                ((di.r) obj2).a(((TL_wallet.walletTransaction[]) obj)[0]);
                return;
            case 12:
                ((org.telegram.ui.Wallet.w5) obj2).P0.remove((org.telegram.ui.Wallet.e7) obj);
                return;
            case 13:
                org.telegram.ui.Wallet.y2[] y2VarArr = (org.telegram.ui.Wallet.y2[]) obj2;
                y2VarArr[0].setOnDismissListener(new org.telegram.ui.Wallet.k2((TLRPC.User) obj, 1));
                y2VarArr[0].dismiss();
                return;
            case 14:
                new org.telegram.ui.Components.hc(((org.telegram.ui.Wallet.y2[]) obj2)[0].E, (org.telegram.ui.ActionBar.g6) obj).Q(2131623993, 36, org.telegram.messenger.id.M0(2131743201, null)).k(false);
                return;
            case 15:
                org.telegram.ui.ActionBar.m2.a((org.telegram.ui.ActionBar.m2) obj2, (Canvas) obj);
                return;
            case 16:
                org.telegram.ui.Wallet.d6.e((org.telegram.ui.Wallet.d6) obj2, (Canvas) obj);
                return;
            case 17:
                org.telegram.ui.Wallet.d6.f((org.telegram.ui.Wallet.d6) obj2, (Canvas) obj);
                return;
            case 18:
                ((ViewGroup) obj).removeView(((org.telegram.ui.Wallet.m6) obj2).h);
                return;
            case 19:
                ((org.telegram.messenger.c20) obj2).a((TL_wallet.walletTransaction) obj);
                return;
            case 20:
                org.telegram.ui.Wallet.a8 a8Var = (org.telegram.ui.Wallet.a8) obj2;
                TLRPC.UserFull userFull = (TLRPC.UserFull) obj;
                if (!a8Var.f42138a1 && userFull != null) {
                    TL_wallet.card cardVar = userFull.wallet_card;
                    if (cardVar == null) {
                        cardVar = new TL_wallet.card();
                    }
                    a8Var.d(cardVar);
                    return;
                }
                return;
            case 21:
                org.telegram.ui.Wallet.d8 d8Var = (org.telegram.ui.Wallet.d8) obj2;
                org.telegram.ui.ActionBar.f2 f2Var2 = (org.telegram.ui.ActionBar.f2) obj;
                if ((f2Var2 instanceof org.telegram.ui.Wallet.w5) && org.telegram.ui.Components.hc.a(f2Var2)) {
                    org.telegram.ui.Components.hc.a0(f2Var2).I(2131623989, org.telegram.messenger.id.M0(2131743089, null), org.telegram.messenger.id.M0(2131743088, null)).j();
                }
                d8Var.finishFragment();
                return;
            case 22:
                ((org.telegram.ui.Wallet.p0) obj).B();
                ((org.telegram.ui.Wallet.m8) obj2).f36649a.f37556f3.O(true);
                return;
            case 23:
                org.telegram.ui.Wallet.m8 m8Var = (org.telegram.ui.Wallet.m8) obj2;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, m8Var.getParentActivity(), m8Var.getResourceProvider());
                String M0 = org.telegram.messenger.id.M0(2131743131, null);
                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27296a;
                u1Var.R = M0;
                u1Var.T = org.telegram.messenger.id.M0(2131743133, null);
                alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), null);
                alertDialog$Builder.k(org.telegram.messenger.id.M0(2131743136, null), new nk0(27, m8Var, (org.telegram.ui.Wallet.l0) obj));
                alertDialog$Builder.d(-1);
                alertDialog$Builder.p();
                return;
            case 24:
                ((org.telegram.ui.ActionBar.u1[]) obj2)[0].dismiss();
                ((Runnable) obj).run();
                return;
            case 25:
                ((ViewGroup) obj).removeView(((org.telegram.ui.Wallet.z9) obj2).h);
                return;
            case 26:
                qc1 qc1Var = (qc1) obj2;
                int[] iArr = (int[]) obj;
                qc1Var.getClass();
                int i10 = iArr[0] - 1;
                iArr[0] = i10;
                if (i10 == 0) {
                    qc1Var.f49024a.G0(true);
                    return;
                }
                return;
            case 27:
                vc1 vc1Var = (vc1) obj2;
                String str = (String) obj;
                vc1Var.d.clear();
                vc1Var.f50645e.clear();
                vc1Var.f50646f = true;
                vc1Var.F(str, "", true);
                vc1Var.h = str;
                vc1Var.f();
                vc1Var.D = null;
                return;
            case 28:
                vc1 vc1Var2 = (vc1) obj2;
                TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) ((TLObject) obj);
                WallpapersListActivity wallpapersListActivity = vc1Var2.E;
                org.telegram.messenger.qp.s1(WallpapersListActivity.u0(wallpapersListActivity)).Y3(tL_contacts_resolvedPeer.users, false);
                org.telegram.messenger.qp.s1(WallpapersListActivity.v0(wallpapersListActivity)).S3(tL_contacts_resolvedPeer.chats, false);
                wallpapersListActivity.getMessagesStorage().m1(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, true, true);
                String str2 = vc1Var2.f50652y;
                vc1Var2.f50652y = null;
                vc1Var2.F(str2, "", false);
                return;
            default:
                String str3 = (String) obj;
                cd1 cd1Var = ((bd1) obj2).f44017a;
                Activity parentActivity = cd1Var.getParentActivity();
                org.telegram.messenger.ij ijVar = cd1Var.f44289n;
                if (parentActivity != null) {
                    if (org.telegram.messenger.r2.f25212a) {
                        org.telegram.messenger.a8.b(str3);
                    }
                    str3.getClass();
                    if (!str3.equals("share_game")) {
                        if (str3.equals("share_score")) {
                            ijVar.f23262k.with_my_score = true;
                        }
                    } else {
                        ijVar.f23262k.with_my_score = false;
                    }
                    cd1Var.showDialog(org.telegram.ui.Components.no0.N0(cd1Var.getParentActivity(), ijVar, null, false, cd1Var.h));
                    return;
                }
                return;
        }
    }
}
