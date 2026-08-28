package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class qo0 extends b61 {
    public final to0 Z1;
    public final s51[] a2;
    public final uo0 f42170b2;

    public qo0(uo0 uo0Var, org.telegram.ui.ActionBar.o2 o2Var, Context context, Integer num, int i9, org.telegram.ui.ActionBar.b6 b6Var, int i10, int i11, to0 to0Var, s51[] s51VarArr) {
        super(o2Var, context, true, num, i9, true, b6Var, i10, i11);
        this.f42170b2 = uo0Var;
        this.Z1 = to0Var;
        this.a2 = s51VarArr;
    }

    @Override
    public final float getScrimDrawableTranslationY() {
        return 0.0f;
    }

    @Override
    public final void p(View view, Long l10, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        long longValue;
        uo0 uo0Var = this.f42170b2;
        if (tL_starGiftUnique != null) {
            if (uo0Var.f43282c0 == 0) {
                TLRPC.PeerColor peerColor = tL_starGiftUnique.peer_color;
                if (peerColor instanceof TLRPC.TL_peerColorCollectible) {
                    uo0Var.v = (TLRPC.TL_peerColorCollectible) peerColor;
                    uo0Var.f43290s = null;
                } else {
                    return;
                }
            } else {
                uo0Var.v = null;
                uo0Var.f43290s = MessagesController.emojiStatusCollectibleFromGift(tL_starGiftUnique);
            }
            uo0Var.f43293y = null;
            uo0Var.f43288n = -1;
        } else {
            if (l10 == null) {
                longValue = 0;
            } else {
                longValue = l10.longValue();
            }
            uo0Var.f43289r = longValue;
            uo0Var.f43290s = null;
            uo0Var.v = null;
            uo0Var.f43293y = null;
        }
        to0 to0Var = this.Z1;
        if (to0Var != null) {
            to0Var.b(true);
        }
        uo0Var.i(true);
        uo0Var.h();
        uo0Var.f();
        s51 s51Var = this.a2[0];
        if (s51Var != null) {
            uo0Var.f43285e0 = null;
            s51Var.dismiss();
        }
    }
}
