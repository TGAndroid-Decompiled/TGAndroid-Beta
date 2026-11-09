package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class vv extends s11 {
    public final j11[] f50780e2;
    public final yw f50781f2;

    public vv(yw ywVar, yw ywVar2, Activity activity, Integer num, org.telegram.ui.ActionBar.g6 g6Var, j11[] j11VarArr) {
        super(ywVar2, activity, true, num, 0, g6Var);
        this.f50781f2 = ywVar;
        this.f50780e2 = j11VarArr;
    }

    @Override
    public final boolean F(TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        int i7;
        if (tL_starGiftUnique != null) {
            i7 = ((org.telegram.ui.ActionBar.f2) this.f50781f2).currentAccount;
            if (bi.ea.y(i7, false).n(tL_starGiftUnique.f27185id) != null && org.telegram.messenger.qp.e1().getInt("statusgiftpage", 0) < 2) {
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
        org.telegram.ui.ActionBar.g6 g6Var;
        j11[] j11VarArr = this.f50780e2;
        yw ywVar = this.f50781f2;
        if (l10 == null) {
            emojiStatus = new TLRPC.TL_emojiStatusEmpty();
        } else {
            if (tL_starGiftUnique != null) {
                i7 = ((org.telegram.ui.ActionBar.f2) ywVar).currentAccount;
                TL_stars.SavedStarGift n10 = bi.ea.y(i7, false).n(tL_starGiftUnique.f27185id);
                if (n10 != null && org.telegram.messenger.qp.e1().getInt("statusgiftpage", 0) < 2) {
                    org.telegram.messenger.qp.e1().edit().putInt("statusgiftpage", org.telegram.messenger.qp.e1().getInt("statusgiftpage", 0) + 1).apply();
                    Context context = getContext();
                    i10 = ((org.telegram.ui.ActionBar.f2) ywVar).currentAccount;
                    i11 = ((org.telegram.ui.ActionBar.f2) ywVar).currentAccount;
                    long e10 = org.telegram.messenger.p10.i(i11).e();
                    g6Var = ((org.telegram.ui.ActionBar.f2) ywVar).resourceProvider;
                    bi.k7 k7Var = new bi.k7(context, i10, e10, g6Var, null);
                    k7Var.i2(n10, null);
                    k7Var.n2();
                    k7Var.show();
                    j11 j11Var = j11VarArr[0];
                    if (j11Var != null) {
                        ywVar.M0 = null;
                        j11Var.dismiss();
                        return;
                    }
                    return;
                }
                TLRPC.TL_inputEmojiStatusCollectible tL_inputEmojiStatusCollectible = new TLRPC.TL_inputEmojiStatusCollectible();
                tL_inputEmojiStatusCollectible.collectible_id = tL_starGiftUnique.f27185id;
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
        ywVar.getMessagesController().h5(emojiStatus, tL_starGiftUnique);
        if (l10 != null) {
            org.telegram.ui.Cells.o oVar = ywVar.F3;
            ?? obj = new Object();
            long longValue = l10.longValue();
            obj.f6355g = longValue;
            obj.h = longValue;
            oVar.a(obj);
        }
        j11 j11Var2 = j11VarArr[0];
        if (j11Var2 != null) {
            ywVar.M0 = null;
            j11Var2.dismiss();
        }
    }
}
