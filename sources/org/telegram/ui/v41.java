package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class v41 implements org.telegram.ui.Components.dm0 {
    public final int f44182a;
    public final Context f44183b;
    public final org.telegram.ui.ActionBar.u6 f44184c;
    public final Integer d;
    public final f61 e;

    public v41(f61 f61Var, int i10, Context context, org.telegram.ui.ActionBar.u6 u6Var, Integer num) {
        this.e = f61Var;
        this.f44182a = i10;
        this.f44183b = context;
        this.f44184c = u6Var;
        this.d = num;
    }

    @Override
    public final boolean mo17e(float f7, float f10, int i10, View view) {
        f61 f61Var = this.e;
        int i11 = f61Var.V;
        int i12 = this.f44182a;
        if (i12 != 11 && i12 != 13 && f61Var.f39203h1) {
            boolean z10 = view instanceof o51;
            if (z10 && (i12 == 1 || i12 == 8)) {
                f61Var.l();
                try {
                    f61Var.performHapticFeedback(0);
                } catch (Exception unused) {
                }
                o51 o51Var = (o51) view;
                if (!o51Var.f41980s && !UserConfig.getInstance(i11).isPremium()) {
                    org.telegram.ui.Components.c6 c6Var = o51Var.e;
                    TLRPC.Document document = c6Var.document;
                    if (document == null) {
                        document = org.telegram.ui.Components.t5.f(i11, c6Var.documentId);
                    }
                    f61Var.p(o51Var, Long.valueOf(o51Var.e.documentId), document, o51Var.v, null);
                    return true;
                }
                f61Var.S0 = o51Var;
                f61Var.U0 = 0.0f;
                f61Var.T0 = false;
                if (o51Var.f41980s) {
                    f61Var.setBigReactionAnimatedEmoji(null);
                    TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(i11).getReactionsMap().get(f61Var.S0.f41982x.f4208f);
                    if (tL_availableReaction != null) {
                        f61Var.V0.setImage(ImageLocation.getForDocument(tL_availableReaction.select_animation), "60_60_pcache", null, null, null, 0L, "tgs", f61Var.S0.f41982x, 0);
                    }
                } else {
                    f61Var.setBigReactionAnimatedEmoji(new org.telegram.ui.Components.t5(4, i11, f61Var.S0.e.documentId));
                }
                f61Var.f39202h0.invalidate();
                f61Var.m();
                return true;
            } else if (z10) {
                o51 o51Var2 = (o51) view;
                if (o51Var2.e != null && (i12 == 0 || i12 == 12 || i12 == 9 || i12 == 10)) {
                    TL_stars.TL_starGiftUnique tL_starGiftUnique = o51Var2.v;
                    u41 u41Var = new u41(this, this.f44183b, f61Var.U1, f61Var, o51Var2, this.f44184c, view, tL_starGiftUnique);
                    f61Var.X0 = u41Var;
                    u41Var.show();
                    try {
                        view.performHapticFeedback(0, 1);
                    } catch (Exception unused2) {
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public final void g() {
        f61 f61Var = this.e;
        if (f61Var.S0 != null) {
            f61Var.T0 = true;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f61Var.U0, 0.0f);
            ofFloat.addUpdateListener(new x11(this, 5));
            ofFloat.addListener(new k50(this, 27));
            ofFloat.setDuration(150L);
            ofFloat.setInterpolator(org.telegram.ui.Components.ds.f27530f);
            ofFloat.start();
        }
    }

    @Override
    public final void o(float f7) {
    }
}
