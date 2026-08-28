package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class ry0 extends b61 {
    public final s51[] Z1;
    public final ProfileActivity a2;

    public ry0(ProfileActivity profileActivity, ProfileActivity profileActivity2, Activity activity, Integer num, int i9, org.telegram.ui.ActionBar.b6 b6Var, int i10, s51[] s51VarArr) {
        super(profileActivity2, activity, true, num, i9, true, b6Var, i10);
        this.a2 = profileActivity;
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
    public final long getDialogId() {
        return this.a2.a();
    }

    @Override
    public final void p(View view, Long l10, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        TLRPC.TL_inputEmojiStatusCollectible tL_inputEmojiStatusCollectible;
        Long l11;
        long j10;
        boolean z10;
        int i9;
        int i10;
        int i11;
        ProfileActivity profileActivity = this.a2;
        org.telegram.ui.Components.i5[] i5VarArr = profileActivity.C;
        s51[] s51VarArr = this.Z1;
        if (tL_starGiftUnique != null) {
            i9 = ((org.telegram.ui.ActionBar.o2) profileActivity).currentAccount;
            TL_stars.SavedStarGift n10 = gh.v7.y(i9, false).n(tL_starGiftUnique.f22607id);
            if (n10 != null && MessagesController.getGlobalMainSettings().getInt("statusgiftpage", 0) < 2) {
                MessagesController.getGlobalMainSettings().edit().putInt("statusgiftpage", MessagesController.getGlobalMainSettings().getInt("statusgiftpage", 0) + 1).apply();
                Context context = getContext();
                i10 = ((org.telegram.ui.ActionBar.o2) profileActivity).currentAccount;
                i11 = ((org.telegram.ui.ActionBar.o2) profileActivity).currentAccount;
                gh.k5 k5Var = new gh.k5(context, i10, UserConfig.getInstance(i11).getClientUserId(), profileActivity.f36064v0, null);
                k5Var.j2(n10, null);
                k5Var.m2();
                k5Var.show();
                s51 s51Var = s51VarArr[0];
                if (s51Var != null) {
                    profileActivity.f36082x5 = null;
                    s51Var.dismiss();
                    return;
                }
                return;
            }
            TLRPC.TL_inputEmojiStatusCollectible tL_inputEmojiStatusCollectible2 = new TLRPC.TL_inputEmojiStatusCollectible();
            tL_inputEmojiStatusCollectible2.collectible_id = tL_starGiftUnique.f22607id;
            tL_inputEmojiStatusCollectible = tL_inputEmojiStatusCollectible2;
            if (num != null) {
                tL_inputEmojiStatusCollectible2.flags |= 1;
                tL_inputEmojiStatusCollectible2.until = num.intValue();
                tL_inputEmojiStatusCollectible = tL_inputEmojiStatusCollectible2;
            }
        } else if (l10 == null) {
            tL_inputEmojiStatusCollectible = new TLRPC.TL_emojiStatusEmpty();
        } else {
            TLRPC.TL_emojiStatus tL_emojiStatus = new TLRPC.TL_emojiStatus();
            tL_emojiStatus.document_id = l10.longValue();
            tL_inputEmojiStatusCollectible = tL_emojiStatus;
            if (num != null) {
                tL_emojiStatus.flags |= 1;
                tL_emojiStatus.until = num.intValue();
                tL_inputEmojiStatusCollectible = tL_emojiStatus;
            }
        }
        if (tL_starGiftUnique != null) {
            l11 = Long.valueOf(tL_starGiftUnique.f22607id);
        } else {
            l11 = null;
        }
        profileActivity.B = l11;
        MessagesController messagesController = profileActivity.getMessagesController();
        TLRPC.Chat chat = profileActivity.A2;
        if (chat == null) {
            j10 = 0;
        } else {
            j10 = -chat.f22380id;
        }
        messagesController.updateEmojiStatus(j10, tL_inputEmojiStatusCollectible, tL_starGiftUnique);
        for (int i12 = 0; i12 < 2; i12++) {
            org.telegram.ui.Components.i5 i5Var = i5VarArr[i12];
            if (i5Var != null) {
                if (l10 == null && profileActivity.A2 == null) {
                    i5Var.g(profileActivity.Y3(i12), true);
                } else if (l10 != null) {
                    i5Var.j(l10.longValue(), true);
                } else {
                    i5Var.g(null, true);
                }
                org.telegram.ui.Components.i5 i5Var2 = i5VarArr[i12];
                if (tL_starGiftUnique != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                i5Var2.m(z10, true);
            }
        }
        if (l10 != null) {
            org.telegram.ui.Cells.o oVar = profileActivity.Z;
            ?? obj = new Object();
            long longValue = l10.longValue();
            obj.f10718g = longValue;
            obj.h = longValue;
            oVar.a(obj);
        }
        profileActivity.X4();
        profileActivity.Z4();
        s51 s51Var2 = s51VarArr[0];
        if (s51Var2 != null) {
            profileActivity.f36082x5 = null;
            s51Var2.dismiss();
        }
    }
}
