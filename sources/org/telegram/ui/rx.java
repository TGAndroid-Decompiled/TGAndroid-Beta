package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class rx extends i71 {
    public final z61[] f37336d2;
    public final wy f37337e2;

    public rx(wy wyVar, wy wyVar2, Activity activity, Integer num, org.telegram.ui.ActionBar.f6 f6Var, z61[] z61VarArr) {
        super(wyVar2, activity, true, num, 0, f6Var);
        this.f37337e2 = wyVar;
        this.f37336d2 = z61VarArr;
    }

    @Override
    public final boolean F(TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        int i10;
        if (tL_starGiftUnique != null) {
            i10 = ((org.telegram.ui.ActionBar.o2) this.f37337e2).currentAccount;
            if (yh.v5.y(i10, false).n(tL_starGiftUnique.f18347id) != null && MessagesController.getGlobalMainSettings().getInt("statusgiftpage", 0) < 2) {
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
        org.telegram.ui.ActionBar.f6 f6Var;
        z61[] z61VarArr = this.f37336d2;
        wy wyVar = this.f37337e2;
        if (l4 == null) {
            emojiStatus = new TLRPC.TL_emojiStatusEmpty();
        } else {
            if (tL_starGiftUnique != null) {
                i10 = ((org.telegram.ui.ActionBar.o2) wyVar).currentAccount;
                TL_stars.SavedStarGift n10 = yh.v5.y(i10, false).n(tL_starGiftUnique.f18347id);
                if (n10 != null && MessagesController.getGlobalMainSettings().getInt("statusgiftpage", 0) < 2) {
                    MessagesController.getGlobalMainSettings().edit().putInt("statusgiftpage", MessagesController.getGlobalMainSettings().getInt("statusgiftpage", 0) + 1).apply();
                    Context context = getContext();
                    i11 = ((org.telegram.ui.ActionBar.o2) wyVar).currentAccount;
                    i12 = ((org.telegram.ui.ActionBar.o2) wyVar).currentAccount;
                    long clientUserId = UserConfig.getInstance(i12).getClientUserId();
                    f6Var = ((org.telegram.ui.ActionBar.o2) wyVar).resourceProvider;
                    yh.a4 a4Var = new yh.a4(context, i11, clientUserId, f6Var, null);
                    a4Var.j2(n10, null);
                    a4Var.m2();
                    a4Var.show();
                    z61 z61Var = z61VarArr[0];
                    if (z61Var != null) {
                        wyVar.M0 = null;
                        z61Var.dismiss();
                        return;
                    }
                    return;
                }
                TLRPC.TL_inputEmojiStatusCollectible tL_inputEmojiStatusCollectible = new TLRPC.TL_inputEmojiStatusCollectible();
                tL_inputEmojiStatusCollectible.collectible_id = tL_starGiftUnique.f18347id;
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
        wyVar.getMessagesController().updateEmojiStatus(emojiStatus, tL_starGiftUnique);
        if (l4 != null) {
            org.telegram.ui.Cells.o oVar = wyVar.E3;
            ?? obj = new Object();
            long longValue = l4.longValue();
            obj.f49151g = longValue;
            obj.h = longValue;
            oVar.a(obj);
        }
        z61 z61Var2 = z61VarArr[0];
        if (z61Var2 != null) {
            wyVar.M0 = null;
            z61Var2.dismiss();
        }
    }
}
