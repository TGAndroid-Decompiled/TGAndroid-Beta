package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.os.Bundle;
import android.text.SpannableString;
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
public final class yc1 implements Runnable {
    public final int f45960a;
    public final Object f45961b;
    public final Object f45962c;

    public yc1(int i10, Object obj, Object obj2) {
        this.f45960a = i10;
        this.f45961b = obj;
        this.f45962c = obj2;
    }

    @Override
    public final void run() {
        String message;
        switch (this.f45960a) {
            case 0:
                ad1.W((ad1) this.f45961b, (TLRPC.TL_theme) this.f45962c);
                return;
            case 1:
                kd1 kd1Var = (kd1) this.f45961b;
                kd1Var.getClass();
                AndroidUtilities.addToClipboard((String) this.f45962c);
                kd1Var.c(true);
                return;
            case 2:
                kd1 kd1Var2 = (kd1) this.f45961b;
                kd1Var2.getClass();
                AndroidUtilities.addToClipboard(MessageObject.formatTextWithEntities(((TLRPC.TodoItem) this.f45962c).title, false));
                kd1Var2.c(true);
                return;
            case 3:
                ie1 ie1Var = (ie1) this.f45961b;
                ie1Var.getClass();
                Bundle bundle = new Bundle();
                cf1 cf1Var = ie1Var.f40132b;
                bundle.putLong("dialog_id", -cf1Var.f38288a);
                bundle.putLong("topic_id", ((TLRPC.TL_forumTopic) this.f45962c).f22080id);
                cf1Var.presentFragment(new j11(bundle, null));
                return;
            case 4:
                ye1 ye1Var = (ye1) this.f45961b;
                String str = (String) this.f45962c;
                ArrayList arrayList = ye1Var.f45987e0;
                cf1 cf1Var2 = ye1Var.f46003v0;
                String lowerCase = str.trim().toLowerCase();
                ArrayList arrayList2 = new ArrayList();
                int i10 = 0;
                while (true) {
                    ArrayList arrayList3 = cf1Var2.f38291b;
                    if (i10 < arrayList3.size()) {
                        if (((te1) arrayList3.get(i10)).f43620c != null && ((te1) arrayList3.get(i10)).f43620c.title.toLowerCase().contains(lowerCase)) {
                            arrayList2.add(((te1) arrayList3.get(i10)).f43620c);
                            ((te1) arrayList3.get(i10)).f43620c.searchQuery = lowerCase;
                        }
                        i10++;
                    } else {
                        arrayList.clear();
                        arrayList.addAll(arrayList2);
                        ye1Var.N();
                        if (!arrayList.isEmpty()) {
                            ye1Var.f45995n0 = false;
                            ye1Var.f45998q0.b(0);
                        }
                        ye1Var.L(str);
                        return;
                    }
                }
                break;
            case 5:
                ff1 ff1Var = ((ef1) this.f45961b).f38859b;
                ff1Var.f39352a.e.remove(Integer.valueOf(((TLRPC.TL_forumTopic) this.f45962c).f22080id));
                ff1Var.f39352a.W();
                return;
            case 6:
                TwoStepVerificationActivity.Z((TwoStepVerificationActivity) this.f45961b, (byte[]) this.f45962c);
                return;
            case 7:
                TwoStepVerificationActivity.e0((TwoStepVerificationActivity) this.f45961b, (TL_account.updatePasswordSettings) this.f45962c);
                return;
            case 8:
                TwoStepVerificationActivity.X((TwoStepVerificationActivity) this.f45961b, (TLRPC.TL_error) this.f45962c);
                return;
            case 9:
                fg1.h0((fg1) this.f45961b, (String) this.f45962c);
                return;
            case 10:
                Runnable runnable = (Runnable) this.f45962c;
                for (zr zrVar : ((fg1) this.f45961b).f39376w.f45772f) {
                    zrVar.l(0.0f);
                }
                runnable.run();
                return;
            case 11:
                lg1 lg1Var = (lg1) this.f45961b;
                TLObject tLObject = (TLObject) this.f45962c;
                ArrayList arrayList4 = lg1Var.f41153f;
                ArrayList<TLRPC.Chat> arrayList5 = lg1Var.e;
                if (tLObject instanceof TLRPC.messages_Chats) {
                    arrayList5.clear();
                    arrayList5.addAll(((TLRPC.messages_Chats) tLObject).chats);
                }
                int i11 = 0;
                MessagesController.getInstance(lg1Var.f41150a).putChats(arrayList5, false);
                lg1Var.d = false;
                lg1Var.f41152c = true;
                int size = arrayList4.size();
                while (i11 < size) {
                    Object obj = arrayList4.get(i11);
                    i11++;
                    ((Runnable) obj).run();
                }
                arrayList4.clear();
                return;
            case 12:
                rh1 rh1Var = (rh1) this.f45961b;
                rh1Var.U.a(new zg1(rh1Var, (VoIPService) this.f45962c, 1), true);
                return;
            case 13:
                rh1 rh1Var2 = (rh1) this.f45961b;
                ValueAnimator valueAnimator = (ValueAnimator) this.f45962c;
                org.telegram.ui.Components.voip.n2.U = false;
                org.telegram.ui.Components.voip.n2.i();
                ViewPropertyAnimator duration = rh1Var2.K.animate().setDuration(150L);
                org.telegram.ui.Components.ds dsVar = org.telegram.ui.Components.ds.f27530f;
                duration.setInterpolator(dsVar).start();
                rh1Var2.H.animate().alpha(1.0f).setDuration(150L).setInterpolator(dsVar).start();
                rh1Var2.I.animate().alpha(1.0f).setDuration(150L).setInterpolator(dsVar).start();
                rh1Var2.N.animate().alpha(1.0f).setDuration(150L).setInterpolator(dsVar).start();
                rh1Var2.X.animate().alpha(1.0f).setDuration(150L).setInterpolator(dsVar).start();
                rh1Var2.f43022j0.animate().alpha(1.0f).setDuration(150L).setInterpolator(dsVar).start();
                rh1Var2.f43018h0.animate().alpha(1.0f).setDuration(350L).setInterpolator(dsVar).start();
                rh1Var2.f43020i0.animate().alpha(1.0f).setDuration(350L).setInterpolator(dsVar).start();
                rh1Var2.M0.animate().alpha(1.0f).setDuration(350L).setInterpolator(dsVar).start();
                valueAnimator.addListener(new fh1(rh1Var2, 2));
                valueAnimator.setDuration(350L);
                valueAnimator.setInterpolator(dsVar);
                valueAnimator.start();
                return;
            case 14:
                MessagesController.getInstance(((org.telegram.ui.Wallet.l0) this.f45961b).f36834a).lambda$processUpdates$379((TLRPC.Updates) this.f45962c, false);
                return;
            case 15:
                org.telegram.ui.Wallet.l0 l0Var = (org.telegram.ui.Wallet.l0) this.f45961b;
                org.telegram.ui.Wallet.l0.H("enable backup: ready! getting secret phrase...");
                l0Var.z(new bi.m5(24, l0Var, (org.telegram.ui.Wallet.x7) this.f45962c), false, true);
                return;
            case 16:
                boolean[] zArr = (boolean[]) this.f45961b;
                org.telegram.ui.Wallet.q qVar = (org.telegram.ui.Wallet.q) this.f45962c;
                if (!zArr[0]) {
                    zArr[0] = true;
                    qVar.run();
                    return;
                }
                return;
            case 17:
                org.telegram.ui.Wallet.l0 l0Var2 = (org.telegram.ui.Wallet.l0) this.f45961b;
                org.telegram.ui.Wallet.j jVar = (org.telegram.ui.Wallet.j) this.f45962c;
                org.telegram.ui.Wallet.l0.H("emulate disable backup: ready");
                if (l0Var2.v() <= 0) {
                    jVar.run(500000L, null);
                    return;
                }
                WalletEngine2 walletEngine2 = l0Var2.f36835b;
                if (walletEngine2 == null) {
                    org.telegram.ui.Wallet.l0.j("emulate disable backup: no engine!");
                    jVar.run(null, "NULL_ENGINE");
                    return;
                }
                walletEngine2.emulateRotateKey(new org.telegram.ui.Wallet.d(l0Var2, jVar));
                return;
            case 18:
                ai.e eVar = (ai.e) this.f45961b;
                Exception exc = (Exception) this.f45962c;
                if (exc.getMessage() == null) {
                    message = "NULL_ERROR";
                } else {
                    message = exc.getMessage();
                }
                eVar.run(null, message);
                return;
            case 19:
                MessagesController.getInstance(((org.telegram.ui.Wallet.e2) this.f45961b).f36513a).lambda$processUpdates$379((TLRPC.Updates) this.f45962c, false);
                return;
            case 20:
                org.telegram.ui.ActionBar.r2 r2Var = (org.telegram.ui.ActionBar.r2) this.f45961b;
                r2Var.presentFragment(new org.telegram.ui.Wallet.i9(r2Var.getCurrentAccount(), ((TL_wallet.card) this.f45962c).address));
                return;
            case 21:
                TextView[] textViewArr = (TextView[]) this.f45961b;
                SpannableString[] spannableStringArr = (SpannableString[]) this.f45962c;
                if (textViewArr[0] != null) {
                    if (spannableStringArr[0] == null) {
                        SpannableString spannableString = new SpannableString(LocaleController.getString(R.string.Loading));
                        spannableStringArr[0] = spannableString;
                        spannableString.setSpan(new org.telegram.ui.Components.fa0(AndroidUtilities.dp(150.0f), textViewArr[0]), 0, spannableStringArr[0].length(), 33);
                    }
                    textViewArr[0].setText(spannableStringArr[0]);
                    return;
                }
                return;
            case 22:
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) this.f45962c;
                ((Utilities.Callback2) this.f45961b).run(wallettransaction.comment, Boolean.valueOf(wallettransaction.comment_encrypted));
                return;
            case 23:
                ((di.s) this.f45961b).run(((TL_wallet.walletTransaction[]) this.f45962c)[0]);
                return;
            case 24:
                ((org.telegram.ui.Wallet.m5) this.f45961b).P0.remove((org.telegram.ui.Wallet.w6) this.f45962c);
                return;
            case 25:
                org.telegram.ui.Wallet.j2[] j2VarArr = (org.telegram.ui.Wallet.j2[]) this.f45961b;
                j2VarArr[0].setOnDismissListener(new org.telegram.ui.Wallet.f4((TLRPC.User) this.f45962c, 0));
                j2VarArr[0].dismiss();
                return;
            case 26:
                new org.telegram.ui.Components.wc(((org.telegram.ui.Wallet.j2[]) this.f45961b)[0].topBulletinContainer, (org.telegram.ui.ActionBar.u6) this.f45962c).R(R.raw.copy, 36, LocaleController.getString(R.string.WalletAddressCopiedBulletin)).k(false);
                return;
            case 27:
                ok.a((ok) this.f45961b, (Canvas) this.f45962c);
                return;
            case 28:
                org.telegram.ui.Wallet.u5.e((org.telegram.ui.Wallet.u5) this.f45961b, (Canvas) this.f45962c);
                return;
            default:
                org.telegram.ui.Wallet.u5.f((org.telegram.ui.Wallet.u5) this.f45961b, (Canvas) this.f45962c);
                return;
        }
    }
}
