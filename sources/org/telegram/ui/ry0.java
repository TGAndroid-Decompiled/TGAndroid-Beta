package org.telegram.ui;

import android.app.Activity;
import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

public final class ry0 extends a61 {
    public final r51[] Z1;
    public final ProfileActivity a2;

    public ry0(ProfileActivity profileActivity, ProfileActivity profileActivity2, Activity activity, Integer num, int i10, org.telegram.ui.ActionBar.c6 c6Var, int i11, r51[] r51VarArr) {
        super(profileActivity2, activity, true, num, i10, true, c6Var, i11);
        this.a2 = profileActivity;
        this.Z1 = r51VarArr;
    }

    @Override
    public final boolean F(TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        return tL_starGiftUnique == null || hh.u7.y(((org.telegram.ui.ActionBar.n2) this.a2).currentAccount, false).n(tL_starGiftUnique.f22607id) == null || MessagesController.getGlobalMainSettings().getInt("statusgiftpage", 0) >= 2;
    }

    @Override
    public final long getDialogId() {
        return this.a2.a();
    }

    @Override
    public final void p(View view, Long l10, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        TLRPC.TL_emojiStatus tL_emojiStatus;
        TLRPC.TL_emojiStatusEmpty tL_emojiStatusEmpty;
        TLRPC.EmojiStatus emojiStatus;
        Long lValueOf;
        TLRPC.TL_inputEmojiStatusCollectible tL_inputEmojiStatusCollectible;
        ProfileActivity profileActivity = this.a2;
        org.telegram.ui.Components.i5[] i5VarArr = profileActivity.C;
        r51[] r51VarArr = this.Z1;
        if (tL_starGiftUnique != null) {
            TL_stars.SavedStarGift savedStarGiftN = hh.u7.y(((org.telegram.ui.ActionBar.n2) profileActivity).currentAccount, false).n(tL_starGiftUnique.f22607id);
            if (savedStarGiftN != null && MessagesController.getGlobalMainSettings().getInt("statusgiftpage", 0) < 2) {
                MessagesController.getGlobalMainSettings().edit().putInt("statusgiftpage", MessagesController.getGlobalMainSettings().getInt("statusgiftpage", 0) + 1).apply();
                hh.i5 i5Var = new hh.i5(getContext(), ((org.telegram.ui.ActionBar.n2) profileActivity).currentAccount, UserConfig.getInstance(((org.telegram.ui.ActionBar.n2) profileActivity).currentAccount).getClientUserId(), profileActivity.f36067v0, null);
                i5Var.j2(savedStarGiftN, null);
                i5Var.m2();
                i5Var.show();
                r51 r51Var = r51VarArr[0];
                if (r51Var != null) {
                    profileActivity.f36085x5 = null;
                    r51Var.dismiss();
                    return;
                }
                return;
            }
            tL_inputEmojiStatusCollectible = new TLRPC.TL_inputEmojiStatusCollectible();
            tL_inputEmojiStatusCollectible.collectible_id = tL_starGiftUnique.f22607id;
            emojiStatus = tL_inputEmojiStatusCollectible;
            if (num != null) {
                tL_inputEmojiStatusCollectible.flags |= 1;
                tL_inputEmojiStatusCollectible.until = num.intValue();
            }
        } else if (l10 == null) {
            tL_emojiStatusEmpty = new TLRPC.TL_emojiStatusEmpty();
        } else {
            tL_emojiStatus = new TLRPC.TL_emojiStatus();
            tL_emojiStatus.document_id = l10.longValue();
            if (num != null) {
                emojiStatus = tL_emojiStatus;
                tL_emojiStatus.flags |= 1;
                tL_emojiStatus.until = num.intValue();
                emojiStatus = tL_emojiStatus;
            }
        }
        if (tL_starGiftUnique != null) {
            emojiStatus = tL_emojiStatusEmpty;
            emojiStatus = tL_inputEmojiStatusCollectible;
            lValueOf = Long.valueOf(tL_starGiftUnique.f22607id);
        } else {
            emojiStatus = tL_emojiStatusEmpty;
            emojiStatus = tL_inputEmojiStatusCollectible;
            lValueOf = null;
        }
        profileActivity.B = lValueOf;
        MessagesController messagesController = profileActivity.getMessagesController();
        TLRPC.Chat chat = profileActivity.A2;
        messagesController.updateEmojiStatus(chat == null ? 0L : -chat.f22380id, emojiStatus, tL_starGiftUnique);
        for (int i10 = 0; i10 < 2; i10++) {
            org.telegram.ui.Components.i5 i5Var2 = i5VarArr[i10];
            if (i5Var2 != null) {
                if (l10 == null && profileActivity.A2 == null) {
                    i5Var2.g(profileActivity.Y3(i10), true);
                } else if (l10 != null) {
                    i5Var2.j(l10.longValue(), true);
                } else {
                    i5Var2.g(null, true);
                }
                i5VarArr[i10].m(tL_starGiftUnique != null, true);
            }
        }
        if (l10 != null) {
            org.telegram.ui.Cells.o oVar = profileActivity.Z;
            ig.q0 q0Var = new ig.q0();
            long jLongValue = l10.longValue();
            q0Var.f11413g = jLongValue;
            q0Var.h = jLongValue;
            oVar.a(q0Var);
        }
        profileActivity.X4();
        profileActivity.Z4();
        r51 r51Var2 = r51VarArr[0];
        if (r51Var2 != null) {
            profileActivity.f36085x5 = null;
            r51Var2.dismiss();
        }
    }
}
