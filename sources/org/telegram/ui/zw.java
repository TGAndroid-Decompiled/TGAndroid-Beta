package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class zw extends b61 {
    public final s51[] f44217e2;
    public final ey f44218f2;

    public zw(ey eyVar, ey eyVar2, Activity activity, Integer num, org.telegram.ui.ActionBar.g6 g6Var, s51[] s51VarArr) {
        super(eyVar2, activity, true, num, 0, g6Var);
        this.f44218f2 = eyVar;
        this.f44217e2 = s51VarArr;
    }

    @Override
    public final boolean F(TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        int i10;
        if (tL_starGiftUnique != null) {
            i10 = ((org.telegram.ui.ActionBar.o2) this.f44218f2).currentAccount;
            if (ai.ha.y(i10, false).n(tL_starGiftUnique.f20567id) != null && MessagesController.getGlobalMainSettings().getInt("statusgiftpage", 0) < 2) {
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
        org.telegram.ui.ActionBar.g6 g6Var;
        s51[] s51VarArr = this.f44217e2;
        ey eyVar = this.f44218f2;
        if (l4 == null) {
            emojiStatus = new TLRPC.TL_emojiStatusEmpty();
        } else {
            if (tL_starGiftUnique != null) {
                i10 = ((org.telegram.ui.ActionBar.o2) eyVar).currentAccount;
                TL_stars.SavedStarGift n10 = ai.ha.y(i10, false).n(tL_starGiftUnique.f20567id);
                if (n10 != null && MessagesController.getGlobalMainSettings().getInt("statusgiftpage", 0) < 2) {
                    MessagesController.getGlobalMainSettings().edit().putInt("statusgiftpage", MessagesController.getGlobalMainSettings().getInt("statusgiftpage", 0) + 1).apply();
                    Context context = getContext();
                    i11 = ((org.telegram.ui.ActionBar.o2) eyVar).currentAccount;
                    i12 = ((org.telegram.ui.ActionBar.o2) eyVar).currentAccount;
                    long clientUserId = UserConfig.getInstance(i12).getClientUserId();
                    g6Var = ((org.telegram.ui.ActionBar.o2) eyVar).resourceProvider;
                    ai.l7 l7Var = new ai.l7(context, i11, clientUserId, g6Var, null);
                    l7Var.L2(n10, null);
                    l7Var.P2();
                    l7Var.show();
                    s51 s51Var = s51VarArr[0];
                    if (s51Var != null) {
                        eyVar.M0 = null;
                        s51Var.dismiss();
                        return;
                    }
                    return;
                }
                TLRPC.TL_inputEmojiStatusCollectible tL_inputEmojiStatusCollectible = new TLRPC.TL_inputEmojiStatusCollectible();
                tL_inputEmojiStatusCollectible.collectible_id = tL_starGiftUnique.f20567id;
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
            obj.f785g = longValue;
            obj.h = longValue;
            oVar.a(obj);
        }
        s51 s51Var2 = s51VarArr[0];
        if (s51Var2 != null) {
            eyVar.M0 = null;
            s51Var2.dismiss();
        }
    }
}
