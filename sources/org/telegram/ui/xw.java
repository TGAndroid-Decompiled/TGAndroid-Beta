package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class xw extends g31 {
    public final x21[] f43466e2;
    public final zx f43467f2;

    public xw(zx zxVar, zx zxVar2, Activity activity, Integer num, org.telegram.ui.ActionBar.p6 p6Var, x21[] x21VarArr) {
        super(zxVar2, activity, true, num, 0, p6Var);
        this.f43467f2 = zxVar;
        this.f43466e2 = x21VarArr;
    }

    @Override
    public final boolean F(TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        int i10;
        if (tL_starGiftUnique != null) {
            i10 = ((org.telegram.ui.ActionBar.k2) this.f43467f2).currentAccount;
            if (rh.e6.y(i10, false).n(tL_starGiftUnique.f20022id) != null && org.telegram.messenger.wp.d1().getInt("statusgiftpage", 0) < 2) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override
    public final void p(View view, Long l4, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        TLRPC.TL_emojiStatus tL_emojiStatus;
        TLRPC.EmojiStatus emojiStatus;
        int i10;
        int i11;
        int i12;
        org.telegram.ui.ActionBar.p6 p6Var;
        x21[] x21VarArr = this.f43466e2;
        zx zxVar = this.f43467f2;
        if (l4 == null) {
            emojiStatus = new TLRPC.TL_emojiStatusEmpty();
        } else {
            if (tL_starGiftUnique != null) {
                i10 = ((org.telegram.ui.ActionBar.k2) zxVar).currentAccount;
                TL_stars.SavedStarGift n10 = rh.e6.y(i10, false).n(tL_starGiftUnique.f20022id);
                if (n10 != null && org.telegram.messenger.wp.d1().getInt("statusgiftpage", 0) < 2) {
                    org.telegram.messenger.wp.d1().edit().putInt("statusgiftpage", org.telegram.messenger.wp.d1().getInt("statusgiftpage", 0) + 1).apply();
                    Context context = getContext();
                    i11 = ((org.telegram.ui.ActionBar.k2) zxVar).currentAccount;
                    i12 = ((org.telegram.ui.ActionBar.k2) zxVar).currentAccount;
                    long e = org.telegram.messenger.e20.i(i12).e();
                    p6Var = ((org.telegram.ui.ActionBar.k2) zxVar).resourceProvider;
                    rh.e4 e4Var = new rh.e4(context, i11, e, p6Var, null);
                    e4Var.j2(n10, null);
                    e4Var.n2();
                    e4Var.show();
                    x21 x21Var = x21VarArr[0];
                    if (x21Var != null) {
                        zxVar.M0 = null;
                        x21Var.dismiss();
                        return;
                    }
                    return;
                }
                TLRPC.TL_inputEmojiStatusCollectible tL_inputEmojiStatusCollectible = new TLRPC.TL_inputEmojiStatusCollectible();
                tL_inputEmojiStatusCollectible.collectible_id = tL_starGiftUnique.f20022id;
                tL_emojiStatus = tL_inputEmojiStatusCollectible;
                if (num != null) {
                    tL_inputEmojiStatusCollectible.flags |= 1;
                    tL_inputEmojiStatusCollectible.until = num.intValue();
                    tL_emojiStatus = tL_inputEmojiStatusCollectible;
                }
            } else {
                TLRPC.TL_emojiStatus tL_emojiStatus2 = new TLRPC.TL_emojiStatus();
                tL_emojiStatus2.document_id = l4.longValue();
                tL_emojiStatus = tL_emojiStatus2;
                if (num != null) {
                    tL_emojiStatus2.flags |= 1;
                    tL_emojiStatus2.until = num.intValue();
                    tL_emojiStatus = tL_emojiStatus2;
                }
            }
            emojiStatus = tL_emojiStatus;
        }
        zxVar.getMessagesController().e5(emojiStatus, tL_starGiftUnique);
        if (l4 != null) {
            org.telegram.ui.Cells.n nVar = zxVar.E3;
            ?? obj = new Object();
            long longValue = l4.longValue();
            obj.f48446g = longValue;
            obj.h = longValue;
            nVar.a(obj);
        }
        x21 x21Var2 = x21VarArr[0];
        if (x21Var2 != null) {
            zxVar.M0 = null;
            x21Var2.dismiss();
        }
    }
}
