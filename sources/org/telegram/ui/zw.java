package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class zw extends b61 {
    public final s51[] Z1;
    public final dy a2;

    public zw(dy dyVar, dy dyVar2, Activity activity, Integer num, org.telegram.ui.ActionBar.b6 b6Var, s51[] s51VarArr) {
        super(dyVar2, activity, true, num, 0, b6Var);
        this.a2 = dyVar;
        this.Z1 = s51VarArr;
    }

    @Override
    public final boolean F(TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        int i9;
        if (tL_starGiftUnique != null) {
            i9 = ((org.telegram.ui.ActionBar.o2) this.a2).currentAccount;
            if (gh.v7.y(i9, false).n(tL_starGiftUnique.f22607id) != null && MessagesController.getGlobalMainSettings().getInt("statusgiftpage", 0) < 2) {
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
        int i9;
        int i10;
        int i11;
        org.telegram.ui.ActionBar.b6 b6Var;
        s51[] s51VarArr = this.Z1;
        dy dyVar = this.a2;
        if (l10 == null) {
            emojiStatus = new TLRPC.TL_emojiStatusEmpty();
        } else {
            if (tL_starGiftUnique != null) {
                i9 = ((org.telegram.ui.ActionBar.o2) dyVar).currentAccount;
                TL_stars.SavedStarGift n10 = gh.v7.y(i9, false).n(tL_starGiftUnique.f22607id);
                if (n10 != null && MessagesController.getGlobalMainSettings().getInt("statusgiftpage", 0) < 2) {
                    MessagesController.getGlobalMainSettings().edit().putInt("statusgiftpage", MessagesController.getGlobalMainSettings().getInt("statusgiftpage", 0) + 1).apply();
                    Context context = getContext();
                    i10 = ((org.telegram.ui.ActionBar.o2) dyVar).currentAccount;
                    i11 = ((org.telegram.ui.ActionBar.o2) dyVar).currentAccount;
                    long clientUserId = UserConfig.getInstance(i11).getClientUserId();
                    b6Var = ((org.telegram.ui.ActionBar.o2) dyVar).resourceProvider;
                    gh.k5 k5Var = new gh.k5(context, i10, clientUserId, b6Var, null);
                    k5Var.j2(n10, null);
                    k5Var.m2();
                    k5Var.show();
                    s51 s51Var = s51VarArr[0];
                    if (s51Var != null) {
                        dyVar.I0 = null;
                        s51Var.dismiss();
                        return;
                    }
                    return;
                }
                TLRPC.TL_inputEmojiStatusCollectible tL_inputEmojiStatusCollectible = new TLRPC.TL_inputEmojiStatusCollectible();
                tL_inputEmojiStatusCollectible.collectible_id = tL_starGiftUnique.f22607id;
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
        dyVar.getMessagesController().updateEmojiStatus(emojiStatus, tL_starGiftUnique);
        if (l10 != null) {
            org.telegram.ui.Cells.o oVar = dyVar.A3;
            ?? obj = new Object();
            long longValue = l10.longValue();
            obj.f10718g = longValue;
            obj.h = longValue;
            oVar.a(obj);
        }
        s51 s51Var2 = s51VarArr[0];
        if (s51Var2 != null) {
            dyVar.I0 = null;
            s51Var2.dismiss();
        }
    }
}
