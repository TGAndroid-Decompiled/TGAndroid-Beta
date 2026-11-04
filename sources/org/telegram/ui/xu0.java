package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class xu0 extends g11 {
    public final x01[] f52106f2;
    public final ProfileActivity f52107g2;

    public xu0(ProfileActivity profileActivity, ProfileActivity profileActivity2, Activity activity, Integer num, int i3, org.telegram.ui.ActionBar.e6 e6Var, int i10, x01[] x01VarArr) {
        super(profileActivity2, activity, true, num, i3, true, e6Var, i10);
        this.f52107g2 = profileActivity;
        this.f52106f2 = x01VarArr;
    }

    @Override
    public final boolean F(TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        int i3;
        if (tL_starGiftUnique != null) {
            i3 = ((org.telegram.ui.ActionBar.d2) this.f52107g2).currentAccount;
            if (ci.e9.y(i3, false).n(tL_starGiftUnique.f27230id) != null && org.telegram.messenger.hp.e1().getInt("statusgiftpage", 0) < 2) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override
    public final long getDialogId() {
        return this.f52107g2.a();
    }

    @Override
    public final void p(View view, Long l10, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        TLRPC.TL_inputEmojiStatusCollectible tL_inputEmojiStatusCollectible;
        Long l11;
        long j10;
        boolean z10;
        int i3;
        int i10;
        int i11;
        x01[] x01VarArr = this.f52106f2;
        ProfileActivity profileActivity = this.f52107g2;
        if (tL_starGiftUnique != null) {
            i3 = ((org.telegram.ui.ActionBar.d2) profileActivity).currentAccount;
            TL_stars.SavedStarGift n4 = ci.e9.y(i3, false).n(tL_starGiftUnique.f27230id);
            if (n4 != null && org.telegram.messenger.hp.e1().getInt("statusgiftpage", 0) < 2) {
                org.telegram.messenger.hp.e1().edit().putInt("statusgiftpage", org.telegram.messenger.hp.e1().getInt("statusgiftpage", 0) + 1).apply();
                Context context = getContext();
                i10 = ((org.telegram.ui.ActionBar.d2) profileActivity).currentAccount;
                i11 = ((org.telegram.ui.ActionBar.d2) profileActivity).currentAccount;
                ci.l6 l6Var = new ci.l6(context, i10, org.telegram.messenger.h10.i(i11).e(), profileActivity.A0, null);
                l6Var.j2(n4, null);
                l6Var.n2();
                l6Var.show();
                x01 x01Var = x01VarArr[0];
                if (x01Var != null) {
                    profileActivity.O5 = null;
                    x01Var.dismiss();
                    return;
                }
                return;
            }
            TLRPC.TL_inputEmojiStatusCollectible tL_inputEmojiStatusCollectible2 = new TLRPC.TL_inputEmojiStatusCollectible();
            tL_inputEmojiStatusCollectible2.collectible_id = tL_starGiftUnique.f27230id;
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
            l11 = Long.valueOf(tL_starGiftUnique.f27230id);
        } else {
            l11 = null;
        }
        profileActivity.F = l11;
        org.telegram.messenger.hp messagesController = profileActivity.getMessagesController();
        TLRPC.Chat chat = profileActivity.E2;
        if (chat == null) {
            j10 = 0;
        } else {
            j10 = -chat.f27001id;
        }
        messagesController.g5(j10, tL_inputEmojiStatusCollectible, tL_starGiftUnique);
        org.telegram.ui.Components.e5 e5Var = profileActivity.G;
        if (e5Var != null) {
            if (l10 == null && profileActivity.E2 == null) {
                e5Var.g(profileActivity.o4(), true);
            } else if (l10 != null) {
                e5Var.j(l10.longValue(), true);
            } else {
                e5Var.g(null, true);
            }
            org.telegram.ui.Components.e5 e5Var2 = profileActivity.G;
            if (tL_starGiftUnique != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            e5Var2.m(z10, true);
        }
        if (l10 != null) {
            org.telegram.ui.Cells.o oVar = profileActivity.f41750e0;
            ?? obj = new Object();
            long longValue = l10.longValue();
            obj.f9098g = longValue;
            obj.h = longValue;
            oVar.a(obj);
        }
        profileActivity.s5();
        profileActivity.u5();
        x01 x01Var2 = x01VarArr[0];
        if (x01Var2 != null) {
            profileActivity.O5 = null;
            x01Var2.dismiss();
        }
    }
}
