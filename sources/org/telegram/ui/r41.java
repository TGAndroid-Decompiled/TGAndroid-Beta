package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class r41 implements org.telegram.ui.Components.pk0 {
    public final int f42266a;
    public final Context f42267b;
    public final org.telegram.ui.ActionBar.b6 f42268c;
    public final Integer d;
    public final b61 f42269e;

    public r41(b61 b61Var, int i9, Context context, org.telegram.ui.ActionBar.b6 b6Var, Integer num) {
        this.f42269e = b61Var;
        this.f42266a = i9;
        this.f42267b = context;
        this.f42268c = b6Var;
        this.d = num;
    }

    @Override
    public final boolean mo5c(float f10, float f11, int i9, View view) {
        b61 b61Var = this.f42269e;
        int i10 = b61Var.R;
        int i11 = this.f42266a;
        if (i11 != 11 && i11 != 13 && b61Var.f36670d1) {
            boolean z10 = view instanceof k51;
            if (z10 && (i11 == 1 || i11 == 8)) {
                b61Var.l();
                try {
                    b61Var.performHapticFeedback(0);
                } catch (Exception unused) {
                }
                k51 k51Var = (k51) view;
                if (!k51Var.f39717s && !UserConfig.getInstance(i10).isPremium()) {
                    org.telegram.ui.Components.t5 t5Var = k51Var.f39713e;
                    TLRPC.Document document = t5Var.document;
                    if (document == null) {
                        document = org.telegram.ui.Components.k5.f(i10, t5Var.documentId);
                    }
                    b61Var.p(k51Var, Long.valueOf(k51Var.f39713e.documentId), document, k51Var.v, null);
                    return true;
                }
                b61Var.O0 = k51Var;
                b61Var.Q0 = 0.0f;
                b61Var.P0 = false;
                if (k51Var.f39717s) {
                    b61Var.setBigReactionAnimatedEmoji(null);
                    TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(i10).getReactionsMap().get(b61Var.O0.f39719x.f10717f);
                    if (tL_availableReaction != null) {
                        b61Var.R0.setImage(ImageLocation.getForDocument(tL_availableReaction.select_animation), "60_60_pcache", null, null, null, 0L, "tgs", b61Var.O0.f39719x, 0);
                    }
                } else {
                    b61Var.setBigReactionAnimatedEmoji(new org.telegram.ui.Components.k5(4, i10, b61Var.O0.f39713e.documentId));
                }
                b61Var.f36669d0.invalidate();
                b61Var.m();
                return true;
            } else if (z10) {
                k51 k51Var2 = (k51) view;
                if (k51Var2.f39713e != null && (i11 == 0 || i11 == 12 || i11 == 9 || i11 == 10)) {
                    TL_stars.TL_starGiftUnique tL_starGiftUnique = k51Var2.v;
                    q41 q41Var = new q41(this, this.f42267b, b61Var.P1, b61Var, k51Var2, this.f42268c, view, tL_starGiftUnique);
                    b61Var.T0 = q41Var;
                    q41Var.show();
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
    public final void j() {
        b61 b61Var = this.f42269e;
        if (b61Var.O0 != null) {
            b61Var.P0 = true;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(b61Var.Q0, 0.0f);
            ofFloat.addUpdateListener(new v01(this, 8));
            ofFloat.addListener(new bc0(this, 25));
            ofFloat.setDuration(150L);
            ofFloat.setInterpolator(org.telegram.ui.Components.gr.f28844f);
            ofFloat.start();
        }
    }

    @Override
    public final void u(float f10) {
    }
}
