package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class tx extends r71 {
    public final i71[] f40496d2;
    public final yy f40497e2;

    public tx(yy yyVar, yy yyVar2, Activity activity, Integer num, org.telegram.ui.ActionBar.c6 c6Var, i71[] i71VarArr) {
        super(yyVar2, activity, true, num, 0, c6Var);
        this.f40497e2 = yyVar;
        this.f40496d2 = i71VarArr;
    }

    @Override
    public final boolean F(TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        int i10;
        if (tL_starGiftUnique != null) {
            i10 = ((org.telegram.ui.ActionBar.m2) this.f40497e2).currentAccount;
            if (zh.n5.y(i10, false).n(tL_starGiftUnique.f19441id) != null && MessagesController.getGlobalMainSettings().getInt("statusgiftpage", 0) < 2) {
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
        i71[] i71VarArr = this.f40496d2;
        yy yyVar = this.f40497e2;
        if (l4 == null) {
            emojiStatus = new TLRPC.TL_emojiStatusEmpty();
        } else {
            if (tL_starGiftUnique != null) {
                i10 = ((org.telegram.ui.ActionBar.m2) yyVar).currentAccount;
                TL_stars.SavedStarGift n10 = zh.n5.y(i10, false).n(tL_starGiftUnique.f19441id);
                if (n10 != null && MessagesController.getGlobalMainSettings().getInt("statusgiftpage", 0) < 2) {
                    MessagesController.getGlobalMainSettings().edit().putInt("statusgiftpage", MessagesController.getGlobalMainSettings().getInt("statusgiftpage", 0) + 1).apply();
                    Context context = getContext();
                    i11 = ((org.telegram.ui.ActionBar.m2) yyVar).currentAccount;
                    i12 = ((org.telegram.ui.ActionBar.m2) yyVar).currentAccount;
                    long clientUserId = UserConfig.getInstance(i12).getClientUserId();
                    c6Var = ((org.telegram.ui.ActionBar.m2) yyVar).resourceProvider;
                    zh.r3 r3Var = new zh.r3(context, i11, clientUserId, c6Var, null);
                    r3Var.l2(n10, null);
                    r3Var.o2();
                    r3Var.show();
                    i71 i71Var = i71VarArr[0];
                    if (i71Var != null) {
                        yyVar.M0 = null;
                        i71Var.dismiss();
                        return;
                    }
                    return;
                }
                TLRPC.TL_inputEmojiStatusCollectible tL_inputEmojiStatusCollectible = new TLRPC.TL_inputEmojiStatusCollectible();
                tL_inputEmojiStatusCollectible.collectible_id = tL_starGiftUnique.f19441id;
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
        yyVar.getMessagesController().updateEmojiStatus(emojiStatus, tL_starGiftUnique);
        if (l4 != null) {
            org.telegram.ui.Cells.o oVar = yyVar.E3;
            ?? obj = new Object();
            long longValue = l4.longValue();
            obj.f780g = longValue;
            obj.h = longValue;
            oVar.a(obj);
        }
        i71 i71Var2 = i71VarArr[0];
        if (i71Var2 != null) {
            yyVar.M0 = null;
            i71Var2.dismiss();
        }
    }
}
