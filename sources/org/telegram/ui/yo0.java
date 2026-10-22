package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class yo0 extends x51 {
    public final bp0 f43536d2;
    public final o51[] f43537e2;
    public final cp0 f43538f2;

    public yo0(cp0 cp0Var, org.telegram.ui.ActionBar.n2 n2Var, Context context, Integer num, int i10, org.telegram.ui.ActionBar.d6 d6Var, int i11, int i12, bp0 bp0Var, o51[] o51VarArr) {
        super(n2Var, context, true, num, i10, true, d6Var, i11, i12);
        this.f43538f2 = cp0Var;
        this.f43536d2 = bp0Var;
        this.f43537e2 = o51VarArr;
    }

    @Override
    public final float getScrimDrawableTranslationY() {
        return 0.0f;
    }

    @Override
    public final void p(View view, Long l4, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        long longValue;
        cp0 cp0Var = this.f43538f2;
        if (tL_starGiftUnique != null) {
            if (cp0Var.m0 == 0) {
                TLRPC.PeerColor peerColor = tL_starGiftUnique.peer_color;
                if (peerColor instanceof TLRPC.TL_peerColorCollectible) {
                    cp0Var.f36043s = (TLRPC.TL_peerColorCollectible) peerColor;
                    cp0Var.f36042r = null;
                } else {
                    return;
                }
            } else {
                cp0Var.f36043s = null;
                cp0Var.f36042r = MessagesController.emojiStatusCollectibleFromGift(tL_starGiftUnique);
            }
            cp0Var.I = null;
            cp0Var.h = -1;
        } else {
            if (l4 == null) {
                longValue = 0;
            } else {
                longValue = l4.longValue();
            }
            cp0Var.f36038n = longValue;
            cp0Var.f36042r = null;
            cp0Var.f36043s = null;
            cp0Var.I = null;
        }
        bp0 bp0Var = this.f43536d2;
        if (bp0Var != null) {
            bp0Var.b(true);
        }
        cp0Var.j(true);
        cp0Var.i();
        cp0Var.f(true);
        o51 o51Var = this.f43537e2[0];
        if (o51Var != null) {
            cp0Var.f36040o0 = null;
            o51Var.dismiss();
        }
    }
}
