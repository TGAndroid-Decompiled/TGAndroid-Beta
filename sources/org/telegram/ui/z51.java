package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class z51 implements org.telegram.ui.Components.pl0 {
    public final int f40122a;
    public final Context f40123b;
    public final org.telegram.ui.ActionBar.f6 f40124c;
    public final Integer d;
    public final j71 e;

    public z51(j71 j71Var, int i10, Context context, org.telegram.ui.ActionBar.f6 f6Var, Integer num) {
        this.e = j71Var;
        this.f40122a = i10;
        this.f40123b = context;
        this.f40124c = f6Var;
        this.d = num;
    }

    @Override
    public final boolean mo18c(float f7, float f10, int i10, View view) {
        j71 j71Var = this.e;
        int i11 = j71Var.V;
        int i12 = this.f40122a;
        if (i12 != 11 && i12 != 13 && j71Var.f34818h1) {
            boolean z10 = view instanceof s61;
            if (z10 && (i12 == 1 || i12 == 8)) {
                j71Var.l();
                try {
                    j71Var.performHapticFeedback(0);
                } catch (Exception unused) {
                }
                s61 s61Var = (s61) view;
                if (!s61Var.f37334s && !UserConfig.getInstance(i11).isPremium()) {
                    org.telegram.ui.Components.y5 y5Var = s61Var.e;
                    TLRPC.Document document = y5Var.document;
                    if (document == null) {
                        document = org.telegram.ui.Components.p5.f(i11, y5Var.documentId);
                    }
                    j71Var.p(s61Var, Long.valueOf(s61Var.e.documentId), document, s61Var.v, null);
                    return true;
                }
                j71Var.S0 = s61Var;
                j71Var.U0 = 0.0f;
                j71Var.T0 = false;
                if (s61Var.f37334s) {
                    j71Var.setBigReactionAnimatedEmoji(null);
                    TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(i11).getReactionsMap().get(j71Var.S0.f37336x.f49447f);
                    if (tL_availableReaction != null) {
                        j71Var.V0.setImage(ImageLocation.getForDocument(tL_availableReaction.select_animation), "60_60_pcache", null, null, null, 0L, "tgs", j71Var.S0.f37336x, 0);
                    }
                } else {
                    j71Var.setBigReactionAnimatedEmoji(new org.telegram.ui.Components.p5(4, i11, j71Var.S0.e.documentId));
                }
                j71Var.f34817h0.invalidate();
                j71Var.m();
                return true;
            } else if (z10) {
                s61 s61Var2 = (s61) view;
                if (s61Var2.e != null && (i12 == 0 || i12 == 12 || i12 == 9 || i12 == 10)) {
                    TL_stars.TL_starGiftUnique tL_starGiftUnique = s61Var2.v;
                    y51 y51Var = new y51(this, this.f40123b, j71Var.T1, j71Var, s61Var2, this.f40124c, view, tL_starGiftUnique);
                    j71Var.X0 = y51Var;
                    y51Var.show();
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
        j71 j71Var = this.e;
        if (j71Var.S0 != null) {
            j71Var.T0 = true;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(j71Var.U0, 0.0f);
            ofFloat.addUpdateListener(new i21(this, 7));
            ofFloat.addListener(new gp0(this, 20));
            ofFloat.setDuration(150L);
            ofFloat.setInterpolator(org.telegram.ui.Components.qr.f27653f);
            ofFloat.start();
        }
    }

    @Override
    public final void q(float f7) {
    }
}
