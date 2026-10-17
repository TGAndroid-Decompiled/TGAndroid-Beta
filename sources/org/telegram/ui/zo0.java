package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class zo0 extends z51 {
    public final cp0 f43787d2;
    public final q51[] f43788e2;
    public final dp0 f43789f2;

    public zo0(dp0 dp0Var, org.telegram.ui.ActionBar.n2 n2Var, Context context, Integer num, int i10, org.telegram.ui.ActionBar.d6 d6Var, int i11, int i12, cp0 cp0Var, q51[] q51VarArr) {
        super(n2Var, context, true, num, i10, true, d6Var, i11, i12);
        this.f43789f2 = dp0Var;
        this.f43787d2 = cp0Var;
        this.f43788e2 = q51VarArr;
    }

    @Override
    public final float getScrimDrawableTranslationY() {
        return 0.0f;
    }

    @Override
    public final void p(View view, Long l4, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        long longValue;
        dp0 dp0Var = this.f43789f2;
        if (tL_starGiftUnique != null) {
            if (dp0Var.m0 == 0) {
                TLRPC.PeerColor peerColor = tL_starGiftUnique.peer_color;
                if (peerColor instanceof TLRPC.TL_peerColorCollectible) {
                    dp0Var.f36263s = (TLRPC.TL_peerColorCollectible) peerColor;
                    dp0Var.f36262r = null;
                } else {
                    return;
                }
            } else {
                dp0Var.f36263s = null;
                dp0Var.f36262r = MessagesController.emojiStatusCollectibleFromGift(tL_starGiftUnique);
            }
            dp0Var.I = null;
            dp0Var.h = -1;
        } else {
            if (l4 == null) {
                longValue = 0;
            } else {
                longValue = l4.longValue();
            }
            dp0Var.f36258n = longValue;
            dp0Var.f36262r = null;
            dp0Var.f36263s = null;
            dp0Var.I = null;
        }
        cp0 cp0Var = this.f43787d2;
        if (cp0Var != null) {
            cp0Var.b(true);
        }
        dp0Var.j(true);
        dp0Var.i();
        dp0Var.f(true);
        q51 q51Var = this.f43788e2[0];
        if (q51Var != null) {
            dp0Var.f36260o0 = null;
            q51Var.dismiss();
        }
    }
}
