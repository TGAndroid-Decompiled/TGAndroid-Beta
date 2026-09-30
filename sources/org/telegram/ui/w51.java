package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.ColorFilter;
import android.util.SparseIntArray;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class w51 extends org.telegram.ui.Components.fw {
    public final int f38984g0;
    public final a71 f38985h0;

    public w51(a71 a71Var, Context context, org.telegram.ui.ActionBar.d6 d6Var, boolean z10, boolean z11, int i10, jx0 jx0Var, int i11, int i12) {
        super(context, d6Var, z10, z11, false, true, i10, jx0Var, i11, false);
        this.f38985h0 = a71Var;
        this.f38984g0 = i12;
    }

    @Override
    public final ColorFilter getEmojiColorFilter() {
        return this.f38985h0.f32108k1;
    }

    @Override
    public final boolean h(int i10) {
        int i11;
        int i12;
        o61 o61Var;
        int i13;
        int i14;
        a71 a71Var = this.f38985h0;
        SparseIntArray sparseIntArray = a71Var.f32136x0;
        int i15 = 0;
        if (a71Var.f32134w1) {
            return false;
        }
        int i16 = this.f38984g0;
        if (i16 == 4 && i10 == 0) {
            a71Var.Q = !a71Var.Q;
            a71Var.f32092d0.setVisibility(8);
            org.telegram.ui.Components.fw fwVar = a71Var.f32090c0[a71Var.Q ? 1 : 0];
            a71Var.f32092d0 = fwVar;
            fwVar.setVisibility(0);
            org.telegram.ui.Components.bw bwVar = a71Var.f32092d0.f24371x;
            Context context = getContext();
            if (a71Var.Q) {
                i13 = R.drawable.msg_emoji_stickers;
            } else {
                i13 = R.drawable.msg_emoji_smiles;
            }
            bwVar.setDrawable(context.getDrawable(i13));
            org.telegram.ui.Components.bw bwVar2 = a71Var.f32092d0.f24371x;
            if (a71Var.Q) {
                i14 = R.string.AccDescrStickers;
            } else {
                i14 = R.string.Emoji;
            }
            bwVar2.setContentDescription(LocaleController.getString(i14));
            a71Var.B(true, false, false);
            a71Var.f32121r0.h1(0, 0);
            return true;
        }
        org.telegram.ui.Components.bw bwVar3 = this.E;
        if (bwVar3 != null && this.f24364b0) {
            i11 = 1;
        } else {
            i11 = 0;
        }
        int i17 = i11 + 1;
        if (bwVar3 != null && this.f24364b0 && i10 == 1) {
            i12 = a71Var.f32111n;
        } else {
            if ((i16 != 4 || i10 != 0) && i10 > 0) {
                int i18 = i10 - i17;
                if (sparseIntArray.indexOfKey(i18) >= 0) {
                    i12 = sparseIntArray.get(i18);
                }
            }
            i12 = 0;
        }
        if (i16 == 6) {
            i15 = 7;
        }
        a71.a(a71Var, i12, AndroidUtilities.dp(i15 - 2));
        a71Var.f32092d0.j(i10, true);
        a71Var.f32101h0.L1 = true;
        a71Var.v(null, true, true);
        r51 r51Var = a71Var.f32097f0;
        if (r51Var != null && (o61Var = r51Var.f36517n) != null) {
            o61Var.H1(null);
        }
        return true;
    }

    @Override
    public final void i(org.telegram.ui.Components.bw bwVar) {
        ValueAnimator valueAnimator = this.f38985h0.U1;
        if (valueAnimator != null && !valueAnimator.isRunning()) {
            return;
        }
        bwVar.setScaleX(0.0f);
        bwVar.setScaleY(0.0f);
    }
}
