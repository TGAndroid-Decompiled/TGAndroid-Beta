package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class x51 implements org.telegram.ui.Components.cl0 {
    public final int f39507a;
    public final Context f39508b;
    public final org.telegram.ui.ActionBar.e6 f39509c;
    public final Integer d;
    public final h71 e;

    public x51(h71 h71Var, int i10, Context context, org.telegram.ui.ActionBar.e6 e6Var, Integer num) {
        this.e = h71Var;
        this.f39507a = i10;
        this.f39508b = context;
        this.f39509c = e6Var;
        this.d = num;
    }

    @Override
    public final boolean mo18c(float f7, float f10, int i10, View view) {
        h71 h71Var = this.e;
        int i11 = h71Var.V;
        int i12 = this.f39507a;
        if (i12 != 11 && i12 != 13 && h71Var.f34133h1) {
            boolean z10 = view instanceof q61;
            if (z10 && (i12 == 1 || i12 == 8)) {
                h71Var.l();
                try {
                    h71Var.performHapticFeedback(0);
                } catch (Exception unused) {
                }
                q61 q61Var = (q61) view;
                if (!q61Var.f36774s && !UserConfig.getInstance(i11).isPremium()) {
                    org.telegram.ui.Components.x5 x5Var = q61Var.e;
                    TLRPC.Document document = x5Var.document;
                    if (document == null) {
                        document = org.telegram.ui.Components.o5.f(i11, x5Var.documentId);
                    }
                    h71Var.p(q61Var, Long.valueOf(q61Var.e.documentId), document, q61Var.v, null);
                    return true;
                }
                h71Var.S0 = q61Var;
                h71Var.U0 = 0.0f;
                h71Var.T0 = false;
                if (q61Var.f36774s) {
                    h71Var.setBigReactionAnimatedEmoji(null);
                    TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(i11).getReactionsMap().get(h71Var.S0.f36776x.f49120f);
                    if (tL_availableReaction != null) {
                        h71Var.V0.setImage(ImageLocation.getForDocument(tL_availableReaction.select_animation), "60_60_pcache", null, null, null, 0L, "tgs", h71Var.S0.f36776x, 0);
                    }
                } else {
                    h71Var.setBigReactionAnimatedEmoji(new org.telegram.ui.Components.o5(4, i11, h71Var.S0.e.documentId));
                }
                h71Var.f34132h0.invalidate();
                h71Var.m();
                return true;
            } else if (z10) {
                q61 q61Var2 = (q61) view;
                if (q61Var2.e != null && (i12 == 0 || i12 == 12 || i12 == 9 || i12 == 10)) {
                    TL_stars.TL_starGiftUnique tL_starGiftUnique = q61Var2.v;
                    w51 w51Var = new w51(this, this.f39508b, h71Var.T1, h71Var, q61Var2, this.f39509c, view, tL_starGiftUnique);
                    h71Var.X0 = w51Var;
                    w51Var.show();
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
        h71 h71Var = this.e;
        if (h71Var.S0 != null) {
            h71Var.T0 = true;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(h71Var.U0, 0.0f);
            ofFloat.addUpdateListener(new a21(this, 8));
            ofFloat.addListener(new cr0(this, 19));
            ofFloat.setDuration(150L);
            ofFloat.setInterpolator(org.telegram.ui.Components.qr.f27420f);
            ofFloat.start();
        }
    }

    @Override
    public final void q(float f7) {
    }
}
