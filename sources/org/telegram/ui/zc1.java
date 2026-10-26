package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.os.Bundle;
import android.text.SpannableString;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Wallet.WalletEngine2;
public final class zc1 implements Runnable {
    public final int f46263a;
    public final Object f46264b;
    public final Object f46265c;

    public zc1(int i10, Object obj, Object obj2) {
        this.f46263a = i10;
        this.f46264b = obj;
        this.f46265c = obj2;
    }

    @Override
    public final void run() {
        String message;
        switch (this.f46263a) {
            case 0:
                id1 id1Var = (id1) this.f46264b;
                id1Var.getClass();
                AndroidUtilities.addToClipboard((String) this.f46265c);
                id1Var.c(true);
                return;
            case 1:
                id1 id1Var2 = (id1) this.f46264b;
                id1Var2.getClass();
                AndroidUtilities.addToClipboard(MessageObject.formatTextWithEntities(((TLRPC.TodoItem) this.f46265c).title, false));
                id1Var2.c(true);
                return;
            case 2:
                ge1 ge1Var = (ge1) this.f46264b;
                ge1Var.getClass();
                Bundle bundle = new Bundle();
                af1 af1Var = ge1Var.f39639b;
                bundle.putLong("dialog_id", -af1Var.f37734a);
                bundle.putLong("topic_id", ((TLRPC.TL_forumTopic) this.f46265c).f22079id);
                af1Var.presentFragment(new h11(bundle, null));
                return;
            case 3:
                we1 we1Var = (we1) this.f46264b;
                String str = (String) this.f46265c;
                ArrayList arrayList = we1Var.f45126e0;
                af1 af1Var2 = we1Var.f45142v0;
                String lowerCase = str.trim().toLowerCase();
                ArrayList arrayList2 = new ArrayList();
                int i10 = 0;
                while (true) {
                    ArrayList arrayList3 = af1Var2.f37737b;
                    if (i10 < arrayList3.size()) {
                        if (((re1) arrayList3.get(i10)).f43135c != null && ((re1) arrayList3.get(i10)).f43135c.title.toLowerCase().contains(lowerCase)) {
                            arrayList2.add(((re1) arrayList3.get(i10)).f43135c);
                            ((re1) arrayList3.get(i10)).f43135c.searchQuery = lowerCase;
                        }
                        i10++;
                    } else {
                        arrayList.clear();
                        arrayList.addAll(arrayList2);
                        we1Var.N();
                        if (!arrayList.isEmpty()) {
                            we1Var.f45134n0 = false;
                            we1Var.f45137q0.b(0);
                        }
                        we1Var.L(str);
                        return;
                    }
                }
                break;
            case 4:
                df1 df1Var = ((cf1) this.f46264b).f38448b;
                df1Var.f38858a.e.remove(Integer.valueOf(((TLRPC.TL_forumTopic) this.f46265c).f22079id));
                df1Var.f38858a.W();
                return;
            case 5:
                TwoStepVerificationActivity.Z((TwoStepVerificationActivity) this.f46264b, (byte[]) this.f46265c);
                return;
            case 6:
                TwoStepVerificationActivity.e0((TwoStepVerificationActivity) this.f46264b, (TL_account.updatePasswordSettings) this.f46265c);
                return;
            case 7:
                TwoStepVerificationActivity.X((TwoStepVerificationActivity) this.f46264b, (TLRPC.TL_error) this.f46265c);
                return;
            case 8:
                dg1.h0((dg1) this.f46264b, (String) this.f46265c);
                return;
            case 9:
                Runnable runnable = (Runnable) this.f46265c;
                for (xr xrVar : ((dg1) this.f46264b).f38882w.f44897f) {
                    xrVar.l(0.0f);
                }
                runnable.run();
                return;
            case 10:
                jg1 jg1Var = (jg1) this.f46264b;
                TLObject tLObject = (TLObject) this.f46265c;
                ArrayList arrayList4 = jg1Var.f40637f;
                ArrayList<TLRPC.Chat> arrayList5 = jg1Var.e;
                if (tLObject instanceof TLRPC.messages_Chats) {
                    arrayList5.clear();
                    arrayList5.addAll(((TLRPC.messages_Chats) tLObject).chats);
                }
                int i11 = 0;
                MessagesController.getInstance(jg1Var.f40634a).putChats(arrayList5, false);
                jg1Var.d = false;
                jg1Var.f40636c = true;
                int size = arrayList4.size();
                while (i11 < size) {
                    Object obj = arrayList4.get(i11);
                    i11++;
                    ((Runnable) obj).run();
                }
                arrayList4.clear();
                return;
            case 11:
                ph1 ph1Var = (ph1) this.f46264b;
                ph1Var.U.a(new xg1(ph1Var, (VoIPService) this.f46265c, 1), true);
                return;
            case 12:
                ph1 ph1Var2 = (ph1) this.f46264b;
                ValueAnimator valueAnimator = (ValueAnimator) this.f46265c;
                org.telegram.ui.Components.voip.n2.U = false;
                org.telegram.ui.Components.voip.n2.i();
                ViewPropertyAnimator duration = ph1Var2.K.animate().setDuration(150L);
                org.telegram.ui.Components.ds dsVar = org.telegram.ui.Components.ds.f27586f;
                duration.setInterpolator(dsVar).start();
                ph1Var2.H.animate().alpha(1.0f).setDuration(150L).setInterpolator(dsVar).start();
                ph1Var2.I.animate().alpha(1.0f).setDuration(150L).setInterpolator(dsVar).start();
                ph1Var2.N.animate().alpha(1.0f).setDuration(150L).setInterpolator(dsVar).start();
                ph1Var2.X.animate().alpha(1.0f).setDuration(150L).setInterpolator(dsVar).start();
                ph1Var2.f42532j0.animate().alpha(1.0f).setDuration(150L).setInterpolator(dsVar).start();
                ph1Var2.f42528h0.animate().alpha(1.0f).setDuration(350L).setInterpolator(dsVar).start();
                ph1Var2.f42530i0.animate().alpha(1.0f).setDuration(350L).setInterpolator(dsVar).start();
                ph1Var2.M0.animate().alpha(1.0f).setDuration(350L).setInterpolator(dsVar).start();
                valueAnimator.addListener(new dh1(ph1Var2, 2));
                valueAnimator.setDuration(350L);
                valueAnimator.setInterpolator(dsVar);
                valueAnimator.start();
                return;
            case 13:
                MessagesController.getInstance(((org.telegram.ui.Wallet.l0) this.f46264b).f36807a).lambda$processUpdates$379((TLRPC.Updates) this.f46265c, false);
                return;
            case 14:
                org.telegram.ui.Wallet.l0 l0Var = (org.telegram.ui.Wallet.l0) this.f46264b;
                org.telegram.ui.Wallet.l0.F("enable backup: ready! getting secret phrase...");
                l0Var.y(new bi.m5(24, l0Var, (org.telegram.ui.Wallet.x7) this.f46265c), false, true);
                return;
            case 15:
                boolean[] zArr = (boolean[]) this.f46264b;
                org.telegram.ui.Wallet.q qVar = (org.telegram.ui.Wallet.q) this.f46265c;
                if (!zArr[0]) {
                    zArr[0] = true;
                    qVar.run();
                    return;
                }
                return;
            case 16:
                org.telegram.ui.Wallet.l0 l0Var2 = (org.telegram.ui.Wallet.l0) this.f46264b;
                org.telegram.ui.Wallet.j jVar = (org.telegram.ui.Wallet.j) this.f46265c;
                org.telegram.ui.Wallet.l0.F("emulate disable backup: ready");
                if (l0Var2.u() <= 0) {
                    jVar.run(500000L, null);
                    return;
                }
                WalletEngine2 walletEngine2 = l0Var2.f36808b;
                if (walletEngine2 == null) {
                    org.telegram.ui.Wallet.l0.i("emulate disable backup: no engine!");
                    jVar.run(null, "NULL_ENGINE");
                    return;
                }
                walletEngine2.emulateRotateKey(new org.telegram.ui.Wallet.d(l0Var2, jVar));
                return;
            case 17:
                ai.e eVar = (ai.e) this.f46264b;
                Exception exc = (Exception) this.f46265c;
                if (exc.getMessage() == null) {
                    message = "NULL_ERROR";
                } else {
                    message = exc.getMessage();
                }
                eVar.run(null, message);
                return;
            case 18:
                MessagesController.getInstance(((org.telegram.ui.Wallet.e2) this.f46264b).f36506a).lambda$processUpdates$379((TLRPC.Updates) this.f46265c, false);
                return;
            case 19:
                org.telegram.ui.ActionBar.r2 r2Var = (org.telegram.ui.ActionBar.r2) this.f46264b;
                r2Var.presentFragment(new org.telegram.ui.Wallet.i9(r2Var.getCurrentAccount(), ((TL_wallet.card) this.f46265c).address));
                return;
            case 20:
                TextView[] textViewArr = (TextView[]) this.f46264b;
                SpannableString[] spannableStringArr = (SpannableString[]) this.f46265c;
                if (textViewArr[0] != null) {
                    if (spannableStringArr[0] == null) {
                        SpannableString spannableString = new SpannableString(LocaleController.getString(R.string.Loading));
                        spannableStringArr[0] = spannableString;
                        spannableString.setSpan(new org.telegram.ui.Components.ea0(AndroidUtilities.dp(150.0f), textViewArr[0]), 0, spannableStringArr[0].length(), 33);
                    }
                    textViewArr[0].setText(spannableStringArr[0]);
                    return;
                }
                return;
            case 21:
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) this.f46265c;
                ((Utilities.Callback2) this.f46264b).run(wallettransaction.comment, Boolean.valueOf(wallettransaction.comment_encrypted));
                return;
            case 22:
                ((di.s) this.f46264b).run(((TL_wallet.walletTransaction[]) this.f46265c)[0]);
                return;
            case 23:
                ((org.telegram.ui.Wallet.m5) this.f46264b).P0.remove((org.telegram.ui.Wallet.w6) this.f46265c);
                return;
            case 24:
                org.telegram.ui.Wallet.j2[] j2VarArr = (org.telegram.ui.Wallet.j2[]) this.f46264b;
                j2VarArr[0].setOnDismissListener(new org.telegram.ui.Wallet.f4((TLRPC.User) this.f46265c, 0));
                j2VarArr[0].dismiss();
                return;
            case 25:
                new org.telegram.ui.Components.wc(((org.telegram.ui.Wallet.j2[]) this.f46264b)[0].topBulletinContainer, (org.telegram.ui.ActionBar.u6) this.f46265c).R(R.raw.copy, 36, LocaleController.getString(R.string.WalletAddressCopiedBulletin)).k(false);
                return;
            case 26:
                mk.a((mk) this.f46264b, (Canvas) this.f46265c);
                return;
            case 27:
                org.telegram.ui.Wallet.u5.e((org.telegram.ui.Wallet.u5) this.f46264b, (Canvas) this.f46265c);
                return;
            case 28:
                org.telegram.ui.Wallet.u5.f((org.telegram.ui.Wallet.u5) this.f46264b, (Canvas) this.f46265c);
                return;
            default:
                ((ViewGroup) this.f46265c).removeView(((org.telegram.ui.Wallet.d6) this.f46264b).h);
                return;
        }
    }
}
