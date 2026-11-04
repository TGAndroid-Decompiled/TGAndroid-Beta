package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class qv extends g11 {
    public final x01[] f48960f2;
    public final uw f48961g2;

    public qv(uw uwVar, uw uwVar2, Activity activity, Integer num, org.telegram.ui.ActionBar.e6 e6Var, x01[] x01VarArr) {
        super(uwVar2, activity, true, num, 0, e6Var);
        this.f48961g2 = uwVar;
        this.f48960f2 = x01VarArr;
    }

    @Override
    public final boolean F(TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        int i3;
        if (tL_starGiftUnique != null) {
            i3 = ((org.telegram.ui.ActionBar.d2) this.f48961g2).currentAccount;
            if (ci.e9.y(i3, false).n(tL_starGiftUnique.f27230id) != null && org.telegram.messenger.hp.e1().getInt("statusgiftpage", 0) < 2) {
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
        int i3;
        int i10;
        int i11;
        org.telegram.ui.ActionBar.e6 e6Var;
        x01[] x01VarArr = this.f48960f2;
        uw uwVar = this.f48961g2;
        if (l10 == null) {
            emojiStatus = new TLRPC.TL_emojiStatusEmpty();
        } else {
            if (tL_starGiftUnique != null) {
                i3 = ((org.telegram.ui.ActionBar.d2) uwVar).currentAccount;
                TL_stars.SavedStarGift n4 = ci.e9.y(i3, false).n(tL_starGiftUnique.f27230id);
                if (n4 != null && org.telegram.messenger.hp.e1().getInt("statusgiftpage", 0) < 2) {
                    org.telegram.messenger.hp.e1().edit().putInt("statusgiftpage", org.telegram.messenger.hp.e1().getInt("statusgiftpage", 0) + 1).apply();
                    Context context = getContext();
                    i10 = ((org.telegram.ui.ActionBar.d2) uwVar).currentAccount;
                    i11 = ((org.telegram.ui.ActionBar.d2) uwVar).currentAccount;
                    long e10 = org.telegram.messenger.h10.i(i11).e();
                    e6Var = ((org.telegram.ui.ActionBar.d2) uwVar).resourceProvider;
                    ci.l6 l6Var = new ci.l6(context, i10, e10, e6Var, null);
                    l6Var.j2(n4, null);
                    l6Var.n2();
                    l6Var.show();
                    x01 x01Var = x01VarArr[0];
                    if (x01Var != null) {
                        uwVar.N0 = null;
                        x01Var.dismiss();
                        return;
                    }
                    return;
                }
                TLRPC.TL_inputEmojiStatusCollectible tL_inputEmojiStatusCollectible = new TLRPC.TL_inputEmojiStatusCollectible();
                tL_inputEmojiStatusCollectible.collectible_id = tL_starGiftUnique.f27230id;
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
        uwVar.getMessagesController().h5(emojiStatus, tL_starGiftUnique);
        if (l10 != null) {
            org.telegram.ui.Cells.o oVar = uwVar.F3;
            ?? obj = new Object();
            long longValue = l10.longValue();
            obj.f9098g = longValue;
            obj.h = longValue;
            oVar.a(obj);
        }
        x01 x01Var2 = x01VarArr[0];
        if (x01Var2 != null) {
            uwVar.N0 = null;
            x01Var2.dismiss();
        }
    }
}
