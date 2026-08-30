package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class xo0 extends q61 {
    public final ap0 a2;
    public final g61[] f40274b2;
    public final bp0 f40275c2;

    public xo0(bp0 bp0Var, org.telegram.ui.ActionBar.p2 p2Var, Context context, Integer num, int i10, org.telegram.ui.ActionBar.f6 f6Var, int i11, int i12, ap0 ap0Var, g61[] g61VarArr) {
        super(p2Var, context, true, num, i10, true, f6Var, i11, i12);
        this.f40275c2 = bp0Var;
        this.a2 = ap0Var;
        this.f40274b2 = g61VarArr;
    }

    @Override
    public final float getScrimDrawableTranslationY() {
        return 0.0f;
    }

    @Override
    public final void p(View view, Long l10, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        long longValue;
        bp0 bp0Var = this.f40275c2;
        if (tL_starGiftUnique != null) {
            if (bp0Var.f33003d0 == 0) {
                TLRPC.PeerColor peerColor = tL_starGiftUnique.peer_color;
                if (peerColor instanceof TLRPC.TL_peerColorCollectible) {
                    bp0Var.v = (TLRPC.TL_peerColorCollectible) peerColor;
                    bp0Var.f33010s = null;
                } else {
                    return;
                }
            } else {
                bp0Var.v = null;
                bp0Var.f33010s = MessagesController.emojiStatusCollectibleFromGift(tL_starGiftUnique);
            }
            bp0Var.f33013y = null;
            bp0Var.f33008n = -1;
        } else {
            if (l10 == null) {
                longValue = 0;
            } else {
                longValue = l10.longValue();
            }
            bp0Var.f33009r = longValue;
            bp0Var.f33010s = null;
            bp0Var.v = null;
            bp0Var.f33013y = null;
        }
        ap0 ap0Var = this.a2;
        if (ap0Var != null) {
            ap0Var.b(true);
        }
        bp0Var.i(true);
        bp0Var.h();
        bp0Var.f();
        g61 g61Var = this.f40274b2[0];
        if (g61Var != null) {
            bp0Var.f33006f0 = null;
            g61Var.dismiss();
        }
    }
}
