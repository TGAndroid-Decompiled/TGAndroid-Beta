package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class vv extends n11 {
    public final e11[] f52298f2;
    public final yw f52299g2;

    public vv(yw ywVar, yw ywVar2, Activity activity, Integer num, org.telegram.ui.ActionBar.e6 e6Var, e11[] e11VarArr) {
        super(ywVar2, activity, true, num, 0, e6Var);
        this.f52299g2 = ywVar;
        this.f52298f2 = e11VarArr;
    }

    @Override
    public final boolean F(TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        int i7;
        if (tL_starGiftUnique != null) {
            i7 = ((org.telegram.ui.ActionBar.e2) this.f52299g2).currentAccount;
            if (di.v8.y(i7, false).n(tL_starGiftUnique.f28280id) != null && org.telegram.messenger.np.e1().getInt("statusgiftpage", 0) < 2) {
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
        org.telegram.ui.ActionBar.e6 e6Var;
        e11[] e11VarArr = this.f52298f2;
        yw ywVar = this.f52299g2;
        if (l10 == null) {
            emojiStatus = new TLRPC.TL_emojiStatusEmpty();
        } else {
            if (tL_starGiftUnique != null) {
                i7 = ((org.telegram.ui.ActionBar.e2) ywVar).currentAccount;
                TL_stars.SavedStarGift n10 = di.v8.y(i7, false).n(tL_starGiftUnique.f28280id);
                if (n10 != null && org.telegram.messenger.np.e1().getInt("statusgiftpage", 0) < 2) {
                    org.telegram.messenger.np.e1().edit().putInt("statusgiftpage", org.telegram.messenger.np.e1().getInt("statusgiftpage", 0) + 1).apply();
                    Context context = getContext();
                    i10 = ((org.telegram.ui.ActionBar.e2) ywVar).currentAccount;
                    i11 = ((org.telegram.ui.ActionBar.e2) ywVar).currentAccount;
                    long e10 = org.telegram.messenger.m10.i(i11).e();
                    e6Var = ((org.telegram.ui.ActionBar.e2) ywVar).resourceProvider;
                    di.c6 c6Var = new di.c6(context, i10, e10, e6Var, null);
                    c6Var.k2(n10, null);
                    c6Var.o2();
                    c6Var.show();
                    e11 e11Var = e11VarArr[0];
                    if (e11Var != null) {
                        ywVar.N0 = null;
                        e11Var.dismiss();
                        return;
                    }
                    return;
                }
                TLRPC.TL_inputEmojiStatusCollectible tL_inputEmojiStatusCollectible = new TLRPC.TL_inputEmojiStatusCollectible();
                tL_inputEmojiStatusCollectible.collectible_id = tL_starGiftUnique.f28280id;
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
        ywVar.getMessagesController().i5(emojiStatus, tL_starGiftUnique);
        if (l10 != null) {
            org.telegram.ui.Cells.o oVar = ywVar.G3;
            ?? obj = new Object();
            long longValue = l10.longValue();
            obj.f5189g = longValue;
            obj.h = longValue;
            oVar.a(obj);
        }
        e11 e11Var2 = e11VarArr[0];
        if (e11Var2 != null) {
            ywVar.N0 = null;
            e11Var2.dismiss();
        }
    }
}
