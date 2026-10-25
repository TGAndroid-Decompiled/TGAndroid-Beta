package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class uw extends c61 {
    public final t51[] f44539e2;
    public final cy f44540f2;

    public uw(cy cyVar, cy cyVar2, Activity activity, Integer num, org.telegram.ui.ActionBar.u6 u6Var, t51[] t51VarArr) {
        super(cyVar2, activity, true, num, 0, u6Var);
        this.f44540f2 = cyVar;
        this.f44539e2 = t51VarArr;
    }

    @Override
    public final boolean F(TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        int i10;
        if (tL_starGiftUnique != null) {
            i10 = ((org.telegram.ui.ActionBar.r2) this.f44540f2).currentAccount;
            if (bi.ca.y(i10, false).n(tL_starGiftUnique.f22254id) != null && MessagesController.getGlobalMainSettings().getInt("statusgiftpage", 0) < 2) {
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
        org.telegram.ui.ActionBar.u6 u6Var;
        t51[] t51VarArr = this.f44539e2;
        cy cyVar = this.f44540f2;
        if (l4 == null) {
            emojiStatus = new TLRPC.TL_emojiStatusEmpty();
        } else {
            if (tL_starGiftUnique != null) {
                i10 = ((org.telegram.ui.ActionBar.r2) cyVar).currentAccount;
                TL_stars.SavedStarGift n10 = bi.ca.y(i10, false).n(tL_starGiftUnique.f22254id);
                if (n10 != null && MessagesController.getGlobalMainSettings().getInt("statusgiftpage", 0) < 2) {
                    MessagesController.getGlobalMainSettings().edit().putInt("statusgiftpage", MessagesController.getGlobalMainSettings().getInt("statusgiftpage", 0) + 1).apply();
                    Context context = getContext();
                    i11 = ((org.telegram.ui.ActionBar.r2) cyVar).currentAccount;
                    i12 = ((org.telegram.ui.ActionBar.r2) cyVar).currentAccount;
                    long clientUserId = UserConfig.getInstance(i12).getClientUserId();
                    u6Var = ((org.telegram.ui.ActionBar.r2) cyVar).resourceProvider;
                    bi.h7 h7Var = new bi.h7(context, i11, clientUserId, u6Var, null);
                    h7Var.L2(n10, null);
                    h7Var.P2();
                    h7Var.show();
                    t51 t51Var = t51VarArr[0];
                    if (t51Var != null) {
                        cyVar.M0 = null;
                        t51Var.dismiss();
                        return;
                    }
                    return;
                }
                TLRPC.TL_inputEmojiStatusCollectible tL_inputEmojiStatusCollectible = new TLRPC.TL_inputEmojiStatusCollectible();
                tL_inputEmojiStatusCollectible.collectible_id = tL_starGiftUnique.f22254id;
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
            obj.f4209g = longValue;
            obj.h = longValue;
            oVar.a(obj);
        }
        t51 t51Var2 = t51VarArr[0];
        if (t51Var2 != null) {
            cyVar.M0 = null;
            t51Var2.dismiss();
        }
    }
}
