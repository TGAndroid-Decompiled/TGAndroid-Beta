package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class sp0 extends n71 {
    public final vp0 f41972d2;
    public final e71[] f41973e2;
    public final wp0 f41974f2;

    public sp0(wp0 wp0Var, org.telegram.ui.ActionBar.m2 m2Var, Context context, Integer num, int i10, org.telegram.ui.ActionBar.c6 c6Var, int i11, int i12, vp0 vp0Var, e71[] e71VarArr) {
        super(m2Var, context, true, num, i10, true, c6Var, i11, i12);
        this.f41974f2 = wp0Var;
        this.f41972d2 = vp0Var;
        this.f41973e2 = e71VarArr;
    }

    @Override
    public final float getScrimDrawableTranslationY() {
        return 0.0f;
    }

    @Override
    public final void p(View view, Long l4, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        long longValue;
        wp0 wp0Var = this.f41974f2;
        if (tL_starGiftUnique != null) {
            if (wp0Var.m0 == 0) {
                TLRPC.PeerColor peerColor = tL_starGiftUnique.peer_color;
                if (peerColor instanceof TLRPC.TL_peerColorCollectible) {
                    wp0Var.f43599s = (TLRPC.TL_peerColorCollectible) peerColor;
                    wp0Var.f43598r = null;
                } else {
                    return;
                }
            } else {
                wp0Var.f43599s = null;
                wp0Var.f43598r = MessagesController.emojiStatusCollectibleFromGift(tL_starGiftUnique);
            }
            wp0Var.I = null;
            wp0Var.h = -1;
        } else {
            if (l4 == null) {
                longValue = 0;
            } else {
                longValue = l4.longValue();
            }
            wp0Var.f43594n = longValue;
            wp0Var.f43598r = null;
            wp0Var.f43599s = null;
            wp0Var.I = null;
        }
        vp0 vp0Var = this.f41972d2;
        if (vp0Var != null) {
            vp0Var.b(true);
        }
        wp0Var.j(true);
        wp0Var.i();
        wp0Var.f(true);
        e71 e71Var = this.f41973e2[0];
        if (e71Var != null) {
            wp0Var.f43596o0 = null;
            e71Var.dismiss();
        }
    }
}
