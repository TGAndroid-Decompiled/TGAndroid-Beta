package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class sp0 extends j71 {
    public final vp0 f37440d2;
    public final a71[] f37441e2;
    public final wp0 f37442f2;

    public sp0(wp0 wp0Var, org.telegram.ui.ActionBar.n2 n2Var, Context context, Integer num, int i10, org.telegram.ui.ActionBar.f6 f6Var, int i11, int i12, vp0 vp0Var, a71[] a71VarArr) {
        super(n2Var, context, true, num, i10, true, f6Var, i11, i12);
        this.f37442f2 = wp0Var;
        this.f37440d2 = vp0Var;
        this.f37441e2 = a71VarArr;
    }

    @Override
    public final float getScrimDrawableTranslationY() {
        return 0.0f;
    }

    @Override
    public final void p(View view, Long l4, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        long longValue;
        wp0 wp0Var = this.f37442f2;
        if (tL_starGiftUnique != null) {
            if (wp0Var.m0 == 0) {
                TLRPC.PeerColor peerColor = tL_starGiftUnique.peer_color;
                if (peerColor instanceof TLRPC.TL_peerColorCollectible) {
                    wp0Var.f39213s = (TLRPC.TL_peerColorCollectible) peerColor;
                    wp0Var.f39212r = null;
                } else {
                    return;
                }
            } else {
                wp0Var.f39213s = null;
                wp0Var.f39212r = MessagesController.emojiStatusCollectibleFromGift(tL_starGiftUnique);
            }
            wp0Var.I = null;
            wp0Var.h = -1;
        } else {
            if (l4 == null) {
                longValue = 0;
            } else {
                longValue = l4.longValue();
            }
            wp0Var.f39208n = longValue;
            wp0Var.f39212r = null;
            wp0Var.f39213s = null;
            wp0Var.I = null;
        }
        vp0 vp0Var = this.f37440d2;
        if (vp0Var != null) {
            vp0Var.b(true);
        }
        wp0Var.j(true);
        wp0Var.i();
        wp0Var.f(true);
        a71 a71Var = this.f37441e2[0];
        if (a71Var != null) {
            wp0Var.f39210o0 = null;
            a71Var.dismiss();
        }
    }
}
