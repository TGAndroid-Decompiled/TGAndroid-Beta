package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class qp0 extends l71 {
    public final tp0 f36115d2;
    public final c71[] f36116e2;
    public final up0 f36117f2;

    public qp0(up0 up0Var, org.telegram.ui.ActionBar.p2 p2Var, Context context, Integer num, int i10, org.telegram.ui.ActionBar.f6 f6Var, int i11, int i12, tp0 tp0Var, c71[] c71VarArr) {
        super(p2Var, context, true, num, i10, true, f6Var, i11, i12);
        this.f36117f2 = up0Var;
        this.f36115d2 = tp0Var;
        this.f36116e2 = c71VarArr;
    }

    @Override
    public final float getScrimDrawableTranslationY() {
        return 0.0f;
    }

    @Override
    public final void p(View view, Long l4, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        long longValue;
        up0 up0Var = this.f36117f2;
        if (tL_starGiftUnique != null) {
            if (up0Var.m0 == 0) {
                TLRPC.PeerColor peerColor = tL_starGiftUnique.peer_color;
                if (peerColor instanceof TLRPC.TL_peerColorCollectible) {
                    up0Var.f37326s = (TLRPC.TL_peerColorCollectible) peerColor;
                    up0Var.f37325r = null;
                } else {
                    return;
                }
            } else {
                up0Var.f37326s = null;
                up0Var.f37325r = MessagesController.emojiStatusCollectibleFromGift(tL_starGiftUnique);
            }
            up0Var.I = null;
            up0Var.h = -1;
        } else {
            if (l4 == null) {
                longValue = 0;
            } else {
                longValue = l4.longValue();
            }
            up0Var.f37321n = longValue;
            up0Var.f37325r = null;
            up0Var.f37326s = null;
            up0Var.I = null;
        }
        tp0 tp0Var = this.f36115d2;
        if (tp0Var != null) {
            tp0Var.b(true);
        }
        up0Var.j(true);
        up0Var.i();
        up0Var.f(true);
        c71 c71Var = this.f36116e2[0];
        if (c71Var != null) {
            up0Var.f37323o0 = null;
            c71Var.dismiss();
        }
    }
}
