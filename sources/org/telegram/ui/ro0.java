package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

public final class ro0 extends a61 {
    public final uo0 Z1;
    public final r51[] a2;

    public final vo0 f42305b2;

    public ro0(vo0 vo0Var, org.telegram.ui.ActionBar.n2 n2Var, Context context, Integer num, int i10, org.telegram.ui.ActionBar.c6 c6Var, int i11, int i12, uo0 uo0Var, r51[] r51VarArr) {
        super(n2Var, context, true, num, i10, true, c6Var, i11, i12);
        this.f42305b2 = vo0Var;
        this.Z1 = uo0Var;
        this.a2 = r51VarArr;
    }

    @Override
    public final float getScrimDrawableTranslationY() {
        return 0.0f;
    }

    @Override
    public final void p(View view, Long l10, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        vo0 vo0Var = this.f42305b2;
        if (tL_starGiftUnique != null) {
            if (vo0Var.f43500c0 == 0) {
                TLRPC.PeerColor peerColor = tL_starGiftUnique.peer_color;
                if (!(peerColor instanceof TLRPC.TL_peerColorCollectible)) {
                    return;
                }
                vo0Var.v = (TLRPC.TL_peerColorCollectible) peerColor;
                vo0Var.f43508s = null;
            } else {
                vo0Var.v = null;
                vo0Var.f43508s = MessagesController.emojiStatusCollectibleFromGift(tL_starGiftUnique);
            }
            vo0Var.f43511y = null;
            vo0Var.f43506n = -1;
        } else {
            vo0Var.f43507r = l10 == null ? 0L : l10.longValue();
            vo0Var.f43508s = null;
            vo0Var.v = null;
            vo0Var.f43511y = null;
        }
        uo0 uo0Var = this.Z1;
        if (uo0Var != null) {
            uo0Var.b(true);
        }
        vo0Var.i(true);
        vo0Var.h();
        vo0Var.f();
        r51 r51Var = this.a2[0];
        if (r51Var != null) {
            vo0Var.f43503e0 = null;
            r51Var.dismiss();
        }
    }
}
