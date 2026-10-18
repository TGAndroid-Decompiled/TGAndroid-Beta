package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class zw extends z51 {
    public final q51[] f43842d2;
    public final ey f43843e2;

    public zw(ey eyVar, ey eyVar2, Activity activity, Integer num, org.telegram.ui.ActionBar.d6 d6Var, q51[] q51VarArr) {
        super(eyVar2, activity, true, num, 0, d6Var);
        this.f43843e2 = eyVar;
        this.f43842d2 = q51VarArr;
    }

    @Override
    public final boolean F(TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        int i10;
        if (tL_starGiftUnique != null) {
            i10 = ((org.telegram.ui.ActionBar.n2) this.f43843e2).currentAccount;
            if (ai.ga.y(i10, false).n(tL_starGiftUnique.f20503id) != null && MessagesController.getGlobalMainSettings().getInt("statusgiftpage", 0) < 2) {
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
        q51[] q51VarArr = this.f43842d2;
        ey eyVar = this.f43843e2;
        if (l4 == null) {
            emojiStatus = new TLRPC.TL_emojiStatusEmpty();
        } else {
            if (tL_starGiftUnique != null) {
                i10 = ((org.telegram.ui.ActionBar.n2) eyVar).currentAccount;
                TL_stars.SavedStarGift n10 = ai.ga.y(i10, false).n(tL_starGiftUnique.f20503id);
                if (n10 != null && MessagesController.getGlobalMainSettings().getInt("statusgiftpage", 0) < 2) {
                    MessagesController.getGlobalMainSettings().edit().putInt("statusgiftpage", MessagesController.getGlobalMainSettings().getInt("statusgiftpage", 0) + 1).apply();
                    Context context = getContext();
                    i11 = ((org.telegram.ui.ActionBar.n2) eyVar).currentAccount;
                    i12 = ((org.telegram.ui.ActionBar.n2) eyVar).currentAccount;
                    long clientUserId = UserConfig.getInstance(i12).getClientUserId();
                    d6Var = ((org.telegram.ui.ActionBar.n2) eyVar).resourceProvider;
                    ai.k7 k7Var = new ai.k7(context, i11, clientUserId, d6Var, null);
                    k7Var.F2(n10, null);
                    k7Var.J2();
                    k7Var.show();
                    q51 q51Var = q51VarArr[0];
                    if (q51Var != null) {
                        eyVar.M0 = null;
                        q51Var.dismiss();
                        return;
                    }
                    return;
                }
                TLRPC.TL_inputEmojiStatusCollectible tL_inputEmojiStatusCollectible = new TLRPC.TL_inputEmojiStatusCollectible();
                tL_inputEmojiStatusCollectible.collectible_id = tL_starGiftUnique.f20503id;
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
        eyVar.getMessagesController().updateEmojiStatus(emojiStatus, tL_starGiftUnique);
        if (l4 != null) {
            org.telegram.ui.Cells.o oVar = eyVar.F3;
            ?? obj = new Object();
            long longValue = l4.longValue();
            obj.f786g = longValue;
            obj.h = longValue;
            oVar.a(obj);
        }
        q51 q51Var2 = q51VarArr[0];
        if (q51Var2 != null) {
            eyVar.M0 = null;
            q51Var2.dismiss();
        }
    }
}
