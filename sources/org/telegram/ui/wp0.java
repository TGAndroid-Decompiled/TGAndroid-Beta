package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class wp0 extends r71 {
    public final zp0 f41632d2;
    public final i71[] f41633e2;
    public final aq0 f41634f2;

    public wp0(aq0 aq0Var, org.telegram.ui.ActionBar.m2 m2Var, Context context, Integer num, int i10, org.telegram.ui.ActionBar.c6 c6Var, int i11, int i12, zp0 zp0Var, i71[] i71VarArr) {
        super(m2Var, context, true, num, i10, true, c6Var, i11, i12);
        this.f41634f2 = aq0Var;
        this.f41632d2 = zp0Var;
        this.f41633e2 = i71VarArr;
    }

    @Override
    public final float getScrimDrawableTranslationY() {
        return 0.0f;
    }

    @Override
    public final void p(View view, Long l4, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        long longValue;
        aq0 aq0Var = this.f41634f2;
        if (tL_starGiftUnique != null) {
            if (aq0Var.m0 == 0) {
                TLRPC.PeerColor peerColor = tL_starGiftUnique.peer_color;
                if (peerColor instanceof TLRPC.TL_peerColorCollectible) {
                    aq0Var.f34324s = (TLRPC.TL_peerColorCollectible) peerColor;
                    aq0Var.f34323r = null;
                } else {
                    return;
                }
            } else {
                aq0Var.f34324s = null;
                aq0Var.f34323r = MessagesController.emojiStatusCollectibleFromGift(tL_starGiftUnique);
            }
            aq0Var.I = null;
            aq0Var.h = -1;
        } else {
            if (l4 == null) {
                longValue = 0;
            } else {
                longValue = l4.longValue();
            }
            aq0Var.f34319n = longValue;
            aq0Var.f34323r = null;
            aq0Var.f34324s = null;
            aq0Var.I = null;
        }
        zp0 zp0Var = this.f41632d2;
        if (zp0Var != null) {
            zp0Var.b(true);
        }
        aq0Var.j(true);
        aq0Var.i();
        aq0Var.f(true);
        i71 i71Var = this.f41633e2[0];
        if (i71Var != null) {
            aq0Var.f34321o0 = null;
            i71Var.dismiss();
        }
    }
}
