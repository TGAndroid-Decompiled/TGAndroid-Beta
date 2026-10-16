package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class up0 extends r71 {
    public final xp0 f40465d2;
    public final i71[] f40466e2;
    public final yp0 f40467f2;

    public up0(yp0 yp0Var, org.telegram.ui.ActionBar.m2 m2Var, Context context, Integer num, int i10, org.telegram.ui.ActionBar.c6 c6Var, int i11, int i12, xp0 xp0Var, i71[] i71VarArr) {
        super(m2Var, context, true, num, i10, true, c6Var, i11, i12);
        this.f40467f2 = yp0Var;
        this.f40465d2 = xp0Var;
        this.f40466e2 = i71VarArr;
    }

    @Override
    public final float getScrimDrawableTranslationY() {
        return 0.0f;
    }

    @Override
    public final void p(View view, Long l4, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        long longValue;
        yp0 yp0Var = this.f40467f2;
        if (tL_starGiftUnique != null) {
            if (yp0Var.m0 == 0) {
                TLRPC.PeerColor peerColor = tL_starGiftUnique.peer_color;
                if (peerColor instanceof TLRPC.TL_peerColorCollectible) {
                    yp0Var.f41882s = (TLRPC.TL_peerColorCollectible) peerColor;
                    yp0Var.f41881r = null;
                } else {
                    return;
                }
            } else {
                yp0Var.f41882s = null;
                yp0Var.f41881r = MessagesController.emojiStatusCollectibleFromGift(tL_starGiftUnique);
            }
            yp0Var.I = null;
            yp0Var.h = -1;
        } else {
            if (l4 == null) {
                longValue = 0;
            } else {
                longValue = l4.longValue();
            }
            yp0Var.f41877n = longValue;
            yp0Var.f41881r = null;
            yp0Var.f41882s = null;
            yp0Var.I = null;
        }
        xp0 xp0Var = this.f40465d2;
        if (xp0Var != null) {
            xp0Var.b(true);
        }
        yp0Var.j(true);
        yp0Var.i();
        yp0Var.f(true);
        i71 i71Var = this.f40466e2[0];
        if (i71Var != null) {
            yp0Var.f41879o0 = null;
            i71Var.dismiss();
        }
    }
}
