package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class ry0 extends d61 {
    public final u51[] Z1;
    public final ProfileActivity a2;

    public ry0(ProfileActivity profileActivity, ProfileActivity profileActivity2, Activity activity, Integer num, int i10, org.telegram.ui.ActionBar.c6 c6Var, int i11, u51[] u51VarArr) {
        super(profileActivity2, activity, true, num, i10, true, c6Var, i11);
        this.a2 = profileActivity;
        this.Z1 = u51VarArr;
    }

    @Override
    public final boolean F(TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        int i10;
        if (tL_starGiftUnique != null) {
            i10 = ((org.telegram.ui.ActionBar.o2) this.a2).currentAccount;
            if (jh.s7.y(i10, false).n(tL_starGiftUnique.f22619id) != null && MessagesController.getGlobalMainSettings().getInt("statusgiftpage", 0) < 2) {
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
        int i10;
        int i11;
        int i12;
        ProfileActivity profileActivity = this.a2;
        org.telegram.ui.Components.n5[] n5VarArr = profileActivity.C;
        u51[] u51VarArr = this.Z1;
        if (tL_starGiftUnique != null) {
            i10 = ((org.telegram.ui.ActionBar.o2) profileActivity).currentAccount;
            TL_stars.SavedStarGift n10 = jh.s7.y(i10, false).n(tL_starGiftUnique.f22619id);
            if (n10 != null && MessagesController.getGlobalMainSettings().getInt("statusgiftpage", 0) < 2) {
                MessagesController.getGlobalMainSettings().edit().putInt("statusgiftpage", MessagesController.getGlobalMainSettings().getInt("statusgiftpage", 0) + 1).apply();
                Context context = getContext();
                i11 = ((org.telegram.ui.ActionBar.o2) profileActivity).currentAccount;
                i12 = ((org.telegram.ui.ActionBar.o2) profileActivity).currentAccount;
                jh.h5 h5Var = new jh.h5(context, i11, UserConfig.getInstance(i12).getClientUserId(), profileActivity.f36129v0, null);
                h5Var.j2(n10, null);
                h5Var.m2();
                h5Var.show();
                u51 u51Var = u51VarArr[0];
                if (u51Var != null) {
                    profileActivity.f36147x5 = null;
                    u51Var.dismiss();
                    return;
                }
                return;
            }
            TLRPC.TL_inputEmojiStatusCollectible tL_inputEmojiStatusCollectible2 = new TLRPC.TL_inputEmojiStatusCollectible();
            tL_inputEmojiStatusCollectible2.collectible_id = tL_starGiftUnique.f22619id;
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
            l11 = Long.valueOf(tL_starGiftUnique.f22619id);
        } else {
            l11 = null;
        }
        profileActivity.B = l11;
        MessagesController messagesController = profileActivity.getMessagesController();
        TLRPC.Chat chat = profileActivity.A2;
        if (chat == null) {
            j10 = 0;
        } else {
            j10 = -chat.f22392id;
        }
        messagesController.updateEmojiStatus(j10, tL_inputEmojiStatusCollectible, tL_starGiftUnique);
        for (int i13 = 0; i13 < 2; i13++) {
            org.telegram.ui.Components.n5 n5Var = n5VarArr[i13];
            if (n5Var != null) {
                if (l10 == null && profileActivity.A2 == null) {
                    n5Var.g(profileActivity.Y3(i13), true);
                } else if (l10 != null) {
                    n5Var.j(l10.longValue(), true);
                } else {
                    n5Var.g(null, true);
                }
                org.telegram.ui.Components.n5 n5Var2 = n5VarArr[i13];
                if (tL_starGiftUnique != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                n5Var2.m(z10, true);
            }
        }
        if (l10 != null) {
            org.telegram.ui.Cells.o oVar = profileActivity.Z;
            ?? obj = new Object();
            long longValue = l10.longValue();
            obj.f13826g = longValue;
            obj.h = longValue;
            oVar.a(obj);
        }
        profileActivity.X4();
        profileActivity.Z4();
        u51 u51Var2 = u51VarArr[0];
        if (u51Var2 != null) {
            profileActivity.f36147x5 = null;
            u51Var2.dismiss();
        }
    }
}
