package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class qx extends n71 {
    public final e71[] f41452d2;
    public final vy f41453e2;

    public qx(vy vyVar, vy vyVar2, Activity activity, Integer num, org.telegram.ui.ActionBar.c6 c6Var, e71[] e71VarArr) {
        super(vyVar2, activity, true, num, 0, c6Var);
        this.f41453e2 = vyVar;
        this.f41452d2 = e71VarArr;
    }

    @Override
    public final boolean F(TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        int i10;
        if (tL_starGiftUnique != null) {
            i10 = ((org.telegram.ui.ActionBar.m2) this.f41453e2).currentAccount;
            if (yh.n5.y(i10, false).n(tL_starGiftUnique.f20032id) != null && MessagesController.getGlobalMainSettings().getInt("statusgiftpage", 0) < 2) {
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
        org.telegram.ui.ActionBar.c6 c6Var;
        e71[] e71VarArr = this.f41452d2;
        vy vyVar = this.f41453e2;
        if (l4 == null) {
            emojiStatus = new TLRPC.TL_emojiStatusEmpty();
        } else {
            if (tL_starGiftUnique != null) {
                i10 = ((org.telegram.ui.ActionBar.m2) vyVar).currentAccount;
                TL_stars.SavedStarGift n10 = yh.n5.y(i10, false).n(tL_starGiftUnique.f20032id);
                if (n10 != null && MessagesController.getGlobalMainSettings().getInt("statusgiftpage", 0) < 2) {
                    MessagesController.getGlobalMainSettings().edit().putInt("statusgiftpage", MessagesController.getGlobalMainSettings().getInt("statusgiftpage", 0) + 1).apply();
                    Context context = getContext();
                    i11 = ((org.telegram.ui.ActionBar.m2) vyVar).currentAccount;
                    i12 = ((org.telegram.ui.ActionBar.m2) vyVar).currentAccount;
                    long clientUserId = UserConfig.getInstance(i12).getClientUserId();
                    c6Var = ((org.telegram.ui.ActionBar.m2) vyVar).resourceProvider;
                    yh.s3 s3Var = new yh.s3(context, i11, clientUserId, c6Var, null);
                    s3Var.l2(n10, null);
                    s3Var.o2();
                    s3Var.show();
                    e71 e71Var = e71VarArr[0];
                    if (e71Var != null) {
                        vyVar.M0 = null;
                        e71Var.dismiss();
                        return;
                    }
                    return;
                }
                TLRPC.TL_inputEmojiStatusCollectible tL_inputEmojiStatusCollectible = new TLRPC.TL_inputEmojiStatusCollectible();
                tL_inputEmojiStatusCollectible.collectible_id = tL_starGiftUnique.f20032id;
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
        vyVar.getMessagesController().updateEmojiStatus(emojiStatus, tL_starGiftUnique);
        if (l4 != null) {
            org.telegram.ui.Cells.o oVar = vyVar.E3;
            ?? obj = new Object();
            long longValue = l4.longValue();
            obj.f54850g = longValue;
            obj.h = longValue;
            oVar.a(obj);
        }
        e71 e71Var2 = e71VarArr[0];
        if (e71Var2 != null) {
            vyVar.M0 = null;
            e71Var2.dismiss();
        }
    }
}
