package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class xy0 extends x51 {
    public final o51[] f43315d2;
    public final ProfileActivity f43316e2;

    public xy0(ProfileActivity profileActivity, ProfileActivity profileActivity2, Activity activity, Integer num, int i10, org.telegram.ui.ActionBar.d6 d6Var, int i11, o51[] o51VarArr) {
        super(profileActivity2, activity, true, num, i10, true, d6Var, i11);
        this.f43316e2 = profileActivity;
        this.f43315d2 = o51VarArr;
    }

    @Override
    public final boolean F(TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        int i10;
        if (tL_starGiftUnique != null) {
            i10 = ((org.telegram.ui.ActionBar.n2) this.f43316e2).currentAccount;
            if (ai.ga.y(i10, false).n(tL_starGiftUnique.f20503id) != null && MessagesController.getGlobalMainSettings().getInt("statusgiftpage", 0) < 2) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override
    public final long getDialogId() {
        return this.f43316e2.a();
    }

    @Override
    public final void p(View view, Long l4, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        TLRPC.TL_inputEmojiStatusCollectible tL_inputEmojiStatusCollectible;
        Long l10;
        long j10;
        boolean z10;
        int i10;
        int i11;
        int i12;
        ProfileActivity profileActivity = this.f43316e2;
        org.telegram.ui.Components.p5[] p5VarArr = profileActivity.G;
        o51[] o51VarArr = this.f43315d2;
        if (tL_starGiftUnique != null) {
            i10 = ((org.telegram.ui.ActionBar.n2) profileActivity).currentAccount;
            TL_stars.SavedStarGift n10 = ai.ga.y(i10, false).n(tL_starGiftUnique.f20503id);
            if (n10 != null && MessagesController.getGlobalMainSettings().getInt("statusgiftpage", 0) < 2) {
                MessagesController.getGlobalMainSettings().edit().putInt("statusgiftpage", MessagesController.getGlobalMainSettings().getInt("statusgiftpage", 0) + 1).apply();
                Context context = getContext();
                i11 = ((org.telegram.ui.ActionBar.n2) profileActivity).currentAccount;
                i12 = ((org.telegram.ui.ActionBar.n2) profileActivity).currentAccount;
                ai.l7 l7Var = new ai.l7(context, i11, UserConfig.getInstance(i12).getClientUserId(), profileActivity.A0, null);
                l7Var.M2(n10, null);
                l7Var.Q2();
                l7Var.show();
                o51 o51Var = o51VarArr[0];
                if (o51Var != null) {
                    profileActivity.D5 = null;
                    o51Var.dismiss();
                    return;
                }
                return;
            }
            TLRPC.TL_inputEmojiStatusCollectible tL_inputEmojiStatusCollectible2 = new TLRPC.TL_inputEmojiStatusCollectible();
            tL_inputEmojiStatusCollectible2.collectible_id = tL_starGiftUnique.f20503id;
            tL_inputEmojiStatusCollectible = tL_inputEmojiStatusCollectible2;
            if (num != null) {
                tL_inputEmojiStatusCollectible2.flags |= 1;
                tL_inputEmojiStatusCollectible2.until = num.intValue();
                tL_inputEmojiStatusCollectible = tL_inputEmojiStatusCollectible2;
            }
        } else if (l4 == null) {
            tL_inputEmojiStatusCollectible = new TLRPC.TL_emojiStatusEmpty();
        } else {
            TLRPC.TL_emojiStatus tL_emojiStatus = new TLRPC.TL_emojiStatus();
            tL_emojiStatus.document_id = l4.longValue();
            tL_inputEmojiStatusCollectible = tL_emojiStatus;
            if (num != null) {
                tL_emojiStatus.flags |= 1;
                tL_emojiStatus.until = num.intValue();
                tL_inputEmojiStatusCollectible = tL_emojiStatus;
            }
        }
        if (tL_starGiftUnique != null) {
            l10 = Long.valueOf(tL_starGiftUnique.f20503id);
        } else {
            l10 = null;
        }
        profileActivity.F = l10;
        MessagesController messagesController = profileActivity.getMessagesController();
        TLRPC.Chat chat = profileActivity.F2;
        if (chat == null) {
            j10 = 0;
        } else {
            j10 = -chat.f20279id;
        }
        messagesController.updateEmojiStatus(j10, tL_inputEmojiStatusCollectible, tL_starGiftUnique);
        for (int i13 = 0; i13 < 2; i13++) {
            org.telegram.ui.Components.p5 p5Var = p5VarArr[i13];
            if (p5Var != null) {
                if (l4 == null && profileActivity.F2 == null) {
                    p5Var.g(profileActivity.Y3(i13), true);
                } else if (l4 != null) {
                    p5Var.j(l4.longValue(), true);
                } else {
                    p5Var.g(null, true);
                }
                org.telegram.ui.Components.p5 p5Var2 = p5VarArr[i13];
                if (tL_starGiftUnique != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                p5Var2.m(z10, true);
            }
        }
        if (l4 != null) {
            org.telegram.ui.Cells.o oVar = profileActivity.f33614e0;
            ?? obj = new Object();
            long longValue = l4.longValue();
            obj.f784g = longValue;
            obj.h = longValue;
            oVar.a(obj);
        }
        profileActivity.X4();
        profileActivity.Z4();
        o51 o51Var2 = o51VarArr[0];
        if (o51Var2 != null) {
            profileActivity.D5 = null;
            o51Var2.dismiss();
        }
    }
}
