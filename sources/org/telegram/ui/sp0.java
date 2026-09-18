package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class sp0 extends g71 {
    public final vp0 f37385d2;
    public final x61[] f37386e2;
    public final wp0 f37387f2;

    public sp0(wp0 wp0Var, org.telegram.ui.ActionBar.n2 n2Var, Context context, Integer num, int i10, org.telegram.ui.ActionBar.e6 e6Var, int i11, int i12, vp0 vp0Var, x61[] x61VarArr) {
        super(n2Var, context, true, num, i10, true, e6Var, i11, i12);
        this.f37387f2 = wp0Var;
        this.f37385d2 = vp0Var;
        this.f37386e2 = x61VarArr;
    }

    @Override
    public final float getScrimDrawableTranslationY() {
        return 0.0f;
    }

    @Override
    public final void p(View view, Long l4, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        long longValue;
        wp0 wp0Var = this.f37387f2;
        if (tL_starGiftUnique != null) {
            if (wp0Var.m0 == 0) {
                TLRPC.PeerColor peerColor = tL_starGiftUnique.peer_color;
                if (peerColor instanceof TLRPC.TL_peerColorCollectible) {
                    wp0Var.f39223s = (TLRPC.TL_peerColorCollectible) peerColor;
                    wp0Var.f39222r = null;
                } else {
                    return;
                }
            } else {
                wp0Var.f39223s = null;
                wp0Var.f39222r = MessagesController.emojiStatusCollectibleFromGift(tL_starGiftUnique);
            }
            wp0Var.I = null;
            wp0Var.h = -1;
        } else {
            if (l4 == null) {
                longValue = 0;
            } else {
                longValue = l4.longValue();
            }
            wp0Var.f39218n = longValue;
            wp0Var.f39222r = null;
            wp0Var.f39223s = null;
            wp0Var.I = null;
        }
        vp0 vp0Var = this.f37385d2;
        if (vp0Var != null) {
            vp0Var.b(true);
        }
        wp0Var.j(true);
        wp0Var.i();
        wp0Var.f(true);
        x61 x61Var = this.f37386e2[0];
        if (x61Var != null) {
            wp0Var.f39220o0 = null;
            x61Var.dismiss();
        }
    }
}
