package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class yw extends i31 {
    public final z21[] f43900e2;
    public final ay f43901f2;

    public yw(ay ayVar, ay ayVar2, Activity activity, Integer num, org.telegram.ui.ActionBar.p6 p6Var, z21[] z21VarArr) {
        super(ayVar2, activity, true, num, 0, p6Var);
        this.f43901f2 = ayVar;
        this.f43900e2 = z21VarArr;
    }

    @Override
    public final boolean F(TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        int i10;
        if (tL_starGiftUnique != null) {
            i10 = ((org.telegram.ui.ActionBar.k2) this.f43901f2).currentAccount;
            if (rh.e6.y(i10, false).n(tL_starGiftUnique.f20021id) != null && org.telegram.messenger.vp.d1().getInt("statusgiftpage", 0) < 2) {
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
        z21[] z21VarArr = this.f43900e2;
        ay ayVar = this.f43901f2;
        if (l4 == null) {
            emojiStatus = new TLRPC.TL_emojiStatusEmpty();
        } else {
            if (tL_starGiftUnique != null) {
                i10 = ((org.telegram.ui.ActionBar.k2) ayVar).currentAccount;
                TL_stars.SavedStarGift n10 = rh.e6.y(i10, false).n(tL_starGiftUnique.f20021id);
                if (n10 != null && org.telegram.messenger.vp.d1().getInt("statusgiftpage", 0) < 2) {
                    org.telegram.messenger.vp.d1().edit().putInt("statusgiftpage", org.telegram.messenger.vp.d1().getInt("statusgiftpage", 0) + 1).apply();
                    Context context = getContext();
                    i11 = ((org.telegram.ui.ActionBar.k2) ayVar).currentAccount;
                    i12 = ((org.telegram.ui.ActionBar.k2) ayVar).currentAccount;
                    long e = org.telegram.messenger.d20.i(i12).e();
                    p6Var = ((org.telegram.ui.ActionBar.k2) ayVar).resourceProvider;
                    rh.e4 e4Var = new rh.e4(context, i11, e, p6Var, null);
                    e4Var.j2(n10, null);
                    e4Var.n2();
                    e4Var.show();
                    z21 z21Var = z21VarArr[0];
                    if (z21Var != null) {
                        ayVar.M0 = null;
                        z21Var.dismiss();
                        return;
                    }
                    return;
                }
                TLRPC.TL_inputEmojiStatusCollectible tL_inputEmojiStatusCollectible = new TLRPC.TL_inputEmojiStatusCollectible();
                tL_inputEmojiStatusCollectible.collectible_id = tL_starGiftUnique.f20021id;
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
        ayVar.getMessagesController().e5(emojiStatus, tL_starGiftUnique);
        if (l4 != null) {
            org.telegram.ui.Cells.n nVar = ayVar.E3;
            ?? obj = new Object();
            long longValue = l4.longValue();
            obj.f48435g = longValue;
            obj.h = longValue;
            nVar.a(obj);
        }
        z21 z21Var2 = z21VarArr[0];
        if (z21Var2 != null) {
            ayVar.M0 = null;
            z21Var2.dismiss();
        }
    }
}
