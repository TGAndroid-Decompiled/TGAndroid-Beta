package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class yv extends r11 {
    public final i11[] f54262f2;
    public final cx f54263g2;

    public yv(cx cxVar, cx cxVar2, Activity activity, Integer num, org.telegram.ui.ActionBar.h6 h6Var, i11[] i11VarArr) {
        super(cxVar2, activity, true, num, 0, h6Var);
        this.f54263g2 = cxVar;
        this.f54262f2 = i11VarArr;
    }

    @Override
    public final boolean F(TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        int i7;
        if (tL_starGiftUnique != null) {
            i7 = ((org.telegram.ui.ActionBar.g2) this.f54263g2).currentAccount;
            if (di.y8.y(i7, false).n(tL_starGiftUnique.f28627id) != null && org.telegram.messenger.np.g1().getInt("statusgiftpage", 0) < 2) {
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
        int i7;
        int i10;
        int i11;
        org.telegram.ui.ActionBar.h6 h6Var;
        i11[] i11VarArr = this.f54262f2;
        cx cxVar = this.f54263g2;
        if (l10 == null) {
            emojiStatus = new TLRPC.TL_emojiStatusEmpty();
        } else {
            if (tL_starGiftUnique != null) {
                i7 = ((org.telegram.ui.ActionBar.g2) cxVar).currentAccount;
                TL_stars.SavedStarGift n10 = di.y8.y(i7, false).n(tL_starGiftUnique.f28627id);
                if (n10 != null && org.telegram.messenger.np.g1().getInt("statusgiftpage", 0) < 2) {
                    org.telegram.messenger.np.g1().edit().putInt("statusgiftpage", org.telegram.messenger.np.g1().getInt("statusgiftpage", 0) + 1).apply();
                    Context context = getContext();
                    i10 = ((org.telegram.ui.ActionBar.g2) cxVar).currentAccount;
                    i11 = ((org.telegram.ui.ActionBar.g2) cxVar).currentAccount;
                    long e10 = org.telegram.messenger.k10.i(i11).e();
                    h6Var = ((org.telegram.ui.ActionBar.g2) cxVar).resourceProvider;
                    di.f6 f6Var = new di.f6(context, i10, e10, h6Var, null);
                    f6Var.w2(n10, null);
                    f6Var.A2();
                    f6Var.show();
                    i11 i11Var = i11VarArr[0];
                    if (i11Var != null) {
                        cxVar.N0 = null;
                        i11Var.dismiss();
                        return;
                    }
                    return;
                }
                TLRPC.TL_inputEmojiStatusCollectible tL_inputEmojiStatusCollectible = new TLRPC.TL_inputEmojiStatusCollectible();
                tL_inputEmojiStatusCollectible.collectible_id = tL_starGiftUnique.f28627id;
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
        cxVar.getMessagesController().t5(emojiStatus, tL_starGiftUnique);
        if (l10 != null) {
            org.telegram.ui.Cells.o oVar = cxVar.G3;
            ?? obj = new Object();
            long longValue = l10.longValue();
            obj.f5471g = longValue;
            obj.h = longValue;
            oVar.a(obj);
        }
        i11 i11Var2 = i11VarArr[0];
        if (i11Var2 != null) {
            cxVar.N0 = null;
            i11Var2.dismiss();
        }
    }
}
