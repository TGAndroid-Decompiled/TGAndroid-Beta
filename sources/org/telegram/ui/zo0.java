package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class zo0 extends r61 {
    public final cp0 a2;
    public final i61[] f43965b2;
    public final dp0 f43966c2;

    public zo0(dp0 dp0Var, org.telegram.ui.ActionBar.p2 p2Var, Context context, Integer num, int i10, org.telegram.ui.ActionBar.g6 g6Var, int i11, int i12, cp0 cp0Var, i61[] i61VarArr) {
        super(p2Var, context, true, num, i10, true, g6Var, i11, i12);
        this.f43966c2 = dp0Var;
        this.a2 = cp0Var;
        this.f43965b2 = i61VarArr;
    }

    @Override
    public final float getScrimDrawableTranslationY() {
        return 0.0f;
    }

    @Override
    public final void p(View view, Long l10, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        long longValue;
        dp0 dp0Var = this.f43966c2;
        if (tL_starGiftUnique != null) {
            if (dp0Var.f36277d0 == 0) {
                TLRPC.PeerColor peerColor = tL_starGiftUnique.peer_color;
                if (peerColor instanceof TLRPC.TL_peerColorCollectible) {
                    dp0Var.v = (TLRPC.TL_peerColorCollectible) peerColor;
                    dp0Var.f36285s = null;
                } else {
                    return;
                }
            } else {
                dp0Var.v = null;
                dp0Var.f36285s = MessagesController.emojiStatusCollectibleFromGift(tL_starGiftUnique);
            }
            dp0Var.f36288y = null;
            dp0Var.f36283n = -1;
        } else {
            if (l10 == null) {
                longValue = 0;
            } else {
                longValue = l10.longValue();
            }
            dp0Var.f36284r = longValue;
            dp0Var.f36285s = null;
            dp0Var.v = null;
            dp0Var.f36288y = null;
        }
        cp0 cp0Var = this.a2;
        if (cp0Var != null) {
            cp0Var.b(true);
        }
        dp0Var.i(true);
        dp0Var.h();
        dp0Var.f();
        i61 i61Var = this.f43965b2[0];
        if (i61Var != null) {
            dp0Var.f36281f0 = null;
            i61Var.dismiss();
        }
    }
}
