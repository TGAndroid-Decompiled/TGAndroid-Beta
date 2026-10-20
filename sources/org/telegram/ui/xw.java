package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class xw extends x51 {
    public final o51[] f43287d2;
    public final cy f43288e2;

    public xw(cy cyVar, cy cyVar2, Activity activity, Integer num, org.telegram.ui.ActionBar.d6 d6Var, o51[] o51VarArr) {
        super(cyVar2, activity, true, num, 0, d6Var);
        this.f43288e2 = cyVar;
        this.f43287d2 = o51VarArr;
    }

    @Override
    public final boolean F(TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        int i10;
        if (tL_starGiftUnique != null) {
            i10 = ((org.telegram.ui.ActionBar.n2) this.f43288e2).currentAccount;
            if (ai.ga.y(i10, false).n(tL_starGiftUnique.f20500id) != null && MessagesController.getGlobalMainSettings().getInt("statusgiftpage", 0) < 2) {
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
        org.telegram.ui.ActionBar.d6 d6Var;
        o51[] o51VarArr = this.f43287d2;
        cy cyVar = this.f43288e2;
        if (l4 == null) {
            emojiStatus = new TLRPC.TL_emojiStatusEmpty();
        } else {
            if (tL_starGiftUnique != null) {
                i10 = ((org.telegram.ui.ActionBar.n2) cyVar).currentAccount;
                TL_stars.SavedStarGift n10 = ai.ga.y(i10, false).n(tL_starGiftUnique.f20500id);
                if (n10 != null && MessagesController.getGlobalMainSettings().getInt("statusgiftpage", 0) < 2) {
                    MessagesController.getGlobalMainSettings().edit().putInt("statusgiftpage", MessagesController.getGlobalMainSettings().getInt("statusgiftpage", 0) + 1).apply();
                    Context context = getContext();
                    i11 = ((org.telegram.ui.ActionBar.n2) cyVar).currentAccount;
                    i12 = ((org.telegram.ui.ActionBar.n2) cyVar).currentAccount;
                    long clientUserId = UserConfig.getInstance(i12).getClientUserId();
                    d6Var = ((org.telegram.ui.ActionBar.n2) cyVar).resourceProvider;
                    ai.l7 l7Var = new ai.l7(context, i11, clientUserId, d6Var, null);
                    l7Var.M2(n10, null);
                    l7Var.Q2();
                    l7Var.show();
                    o51 o51Var = o51VarArr[0];
                    if (o51Var != null) {
                        cyVar.M0 = null;
                        o51Var.dismiss();
                        return;
                    }
                    return;
                }
                TLRPC.TL_inputEmojiStatusCollectible tL_inputEmojiStatusCollectible = new TLRPC.TL_inputEmojiStatusCollectible();
                tL_inputEmojiStatusCollectible.collectible_id = tL_starGiftUnique.f20500id;
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
        cyVar.getMessagesController().updateEmojiStatus(emojiStatus, tL_starGiftUnique);
        if (l4 != null) {
            org.telegram.ui.Cells.o oVar = cyVar.F3;
            ?? obj = new Object();
            long longValue = l4.longValue();
            obj.f784g = longValue;
            obj.h = longValue;
            oVar.a(obj);
        }
        o51 o51Var2 = o51VarArr[0];
        if (o51Var2 != null) {
            cyVar.M0 = null;
            o51Var2.dismiss();
        }
    }
}
