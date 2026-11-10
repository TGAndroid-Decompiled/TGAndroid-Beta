package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class wv extends t11 {
    public final k11[] f51450e2;
    public final zw f51451f2;

    public wv(zw zwVar, zw zwVar2, Activity activity, Integer num, org.telegram.ui.ActionBar.h6 h6Var, k11[] k11VarArr) {
        super(zwVar2, activity, true, num, 0, h6Var);
        this.f51451f2 = zwVar;
        this.f51450e2 = k11VarArr;
    }

    @Override
    public final boolean F(TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        int i7;
        if (tL_starGiftUnique != null) {
            i7 = ((org.telegram.ui.ActionBar.f2) this.f51451f2).currentAccount;
            if (bi.ea.y(i7, false).n(tL_starGiftUnique.f27189id) != null && org.telegram.messenger.qp.e1().getInt("statusgiftpage", 0) < 2) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override
    public final void p(View view, Long l10, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        TLRPC.TL_emojiStatus tL_emojiStatus;
        TLRPC.EmojiStatus emojiStatus;
        int i7;
        int i10;
        int i11;
        org.telegram.ui.ActionBar.h6 h6Var;
        k11[] k11VarArr = this.f51450e2;
        zw zwVar = this.f51451f2;
        if (l10 == null) {
            emojiStatus = new TLRPC.TL_emojiStatusEmpty();
        } else {
            if (tL_starGiftUnique != null) {
                i7 = ((org.telegram.ui.ActionBar.f2) zwVar).currentAccount;
                TL_stars.SavedStarGift n10 = bi.ea.y(i7, false).n(tL_starGiftUnique.f27189id);
                if (n10 != null && org.telegram.messenger.qp.e1().getInt("statusgiftpage", 0) < 2) {
                    org.telegram.messenger.qp.e1().edit().putInt("statusgiftpage", org.telegram.messenger.qp.e1().getInt("statusgiftpage", 0) + 1).apply();
                    Context context = getContext();
                    i10 = ((org.telegram.ui.ActionBar.f2) zwVar).currentAccount;
                    i11 = ((org.telegram.ui.ActionBar.f2) zwVar).currentAccount;
                    long e10 = org.telegram.messenger.p10.i(i11).e();
                    h6Var = ((org.telegram.ui.ActionBar.f2) zwVar).resourceProvider;
                    bi.k7 k7Var = new bi.k7(context, i10, e10, h6Var, null);
                    k7Var.i2(n10, null);
                    k7Var.n2();
                    k7Var.show();
                    k11 k11Var = k11VarArr[0];
                    if (k11Var != null) {
                        zwVar.M0 = null;
                        k11Var.dismiss();
                        return;
                    }
                    return;
                }
                TLRPC.TL_inputEmojiStatusCollectible tL_inputEmojiStatusCollectible = new TLRPC.TL_inputEmojiStatusCollectible();
                tL_inputEmojiStatusCollectible.collectible_id = tL_starGiftUnique.f27189id;
                tL_emojiStatus = tL_inputEmojiStatusCollectible;
                if (num != null) {
                    tL_inputEmojiStatusCollectible.flags |= 1;
                    tL_inputEmojiStatusCollectible.until = num.intValue();
                    tL_emojiStatus = tL_inputEmojiStatusCollectible;
                }
            } else {
                TLRPC.TL_emojiStatus tL_emojiStatus2 = new TLRPC.TL_emojiStatus();
                tL_emojiStatus2.document_id = l10.longValue();
                tL_emojiStatus = tL_emojiStatus2;
                if (num != null) {
                    tL_emojiStatus2.flags |= 1;
                    tL_emojiStatus2.until = num.intValue();
                    tL_emojiStatus = tL_emojiStatus2;
                }
            }
            emojiStatus = tL_emojiStatus;
        }
        zwVar.getMessagesController().h5(emojiStatus, tL_starGiftUnique);
        if (l10 != null) {
            org.telegram.ui.Cells.o oVar = zwVar.F3;
            ?? obj = new Object();
            long longValue = l10.longValue();
            obj.f6360g = longValue;
            obj.h = longValue;
            oVar.a(obj);
        }
        k11 k11Var2 = k11VarArr[0];
        if (k11Var2 != null) {
            zwVar.M0 = null;
            k11Var2.dismiss();
        }
    }
}
