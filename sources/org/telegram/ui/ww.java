package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class ww extends f61 {
    public final w51[] f45410e2;
    public final ey f45411f2;

    public ww(ey eyVar, ey eyVar2, Activity activity, Integer num, org.telegram.ui.ActionBar.u6 u6Var, w51[] w51VarArr) {
        super(eyVar2, activity, true, num, 0, u6Var);
        this.f45411f2 = eyVar;
        this.f45410e2 = w51VarArr;
    }

    @Override
    public final boolean F(TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        int i10;
        if (tL_starGiftUnique != null) {
            i10 = ((org.telegram.ui.ActionBar.r2) this.f45411f2).currentAccount;
            if (bi.ca.y(i10, false).n(tL_starGiftUnique.f22257id) != null && MessagesController.getGlobalMainSettings().getInt("statusgiftpage", 0) < 2) {
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
        w51[] w51VarArr = this.f45410e2;
        ey eyVar = this.f45411f2;
        if (l4 == null) {
            emojiStatus = new TLRPC.TL_emojiStatusEmpty();
        } else {
            if (tL_starGiftUnique != null) {
                i10 = ((org.telegram.ui.ActionBar.r2) eyVar).currentAccount;
                TL_stars.SavedStarGift n10 = bi.ca.y(i10, false).n(tL_starGiftUnique.f22257id);
                if (n10 != null && MessagesController.getGlobalMainSettings().getInt("statusgiftpage", 0) < 2) {
                    MessagesController.getGlobalMainSettings().edit().putInt("statusgiftpage", MessagesController.getGlobalMainSettings().getInt("statusgiftpage", 0) + 1).apply();
                    Context context = getContext();
                    i11 = ((org.telegram.ui.ActionBar.r2) eyVar).currentAccount;
                    i12 = ((org.telegram.ui.ActionBar.r2) eyVar).currentAccount;
                    long clientUserId = UserConfig.getInstance(i12).getClientUserId();
                    u6Var = ((org.telegram.ui.ActionBar.r2) eyVar).resourceProvider;
                    bi.h7 h7Var = new bi.h7(context, i11, clientUserId, u6Var, null);
                    h7Var.L2(n10, null);
                    h7Var.P2();
                    h7Var.show();
                    w51 w51Var = w51VarArr[0];
                    if (w51Var != null) {
                        eyVar.M0 = null;
                        w51Var.dismiss();
                        return;
                    }
                    return;
                }
                TLRPC.TL_inputEmojiStatusCollectible tL_inputEmojiStatusCollectible = new TLRPC.TL_inputEmojiStatusCollectible();
                tL_inputEmojiStatusCollectible.collectible_id = tL_starGiftUnique.f22257id;
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
            obj.f4209g = longValue;
            obj.h = longValue;
            oVar.a(obj);
        }
        w51 w51Var2 = w51VarArr[0];
        if (w51Var2 != null) {
            eyVar.M0 = null;
            w51Var2.dismiss();
        }
    }
}
