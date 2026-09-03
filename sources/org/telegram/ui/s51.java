package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.ColorFilter;
import android.util.SparseIntArray;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class s51 extends org.telegram.ui.Components.wv {
    public final int f38103d0;
    public final x61 f38104e0;

    public s51(x61 x61Var, Context context, org.telegram.ui.ActionBar.f6 f6Var, boolean z4, boolean z10, int i10, b11 b11Var, int i11, int i12) {
        super(context, f6Var, z4, z10, false, true, i10, b11Var, i11, false);
        this.f38104e0 = x61Var;
        this.f38103d0 = i12;
    }

    @Override
    public final ColorFilter getEmojiColorFilter() {
        return this.f38104e0.f39870h1;
    }

    @Override
    public final boolean h(int i10) {
        int i11;
        int i12;
        k61 k61Var;
        int i13;
        int i14;
        x61 x61Var = this.f38104e0;
        SparseIntArray sparseIntArray = x61Var.f39896u0;
        int i15 = 0;
        if (x61Var.f39895t1) {
            return false;
        }
        int i16 = this.f38103d0;
        if (i16 == 4 && i10 == 0) {
            x61Var.N = !x61Var.N;
            x61Var.f39852a0.setVisibility(8);
            org.telegram.ui.Components.wv wvVar = x61Var.W[x61Var.N ? 1 : 0];
            x61Var.f39852a0 = wvVar;
            wvVar.setVisibility(0);
            org.telegram.ui.Components.sv svVar = x61Var.f39852a0.f30359x;
            Context context = getContext();
            if (x61Var.N) {
                i13 = R.drawable.msg_emoji_stickers;
            } else {
                i13 = R.drawable.msg_emoji_smiles;
            }
            svVar.setDrawable(context.getDrawable(i13));
            org.telegram.ui.Components.sv svVar2 = x61Var.f39852a0.f30359x;
            if (x61Var.N) {
                i14 = R.string.AccDescrStickers;
            } else {
                i14 = R.string.Emoji;
            }
            svVar2.setContentDescription(LocaleController.getString(i14));
            x61Var.B(true, false, false);
            x61Var.f39882o0.h1(0, 0);
            return true;
        }
        org.telegram.ui.Components.sv svVar3 = this.B;
        if (svVar3 != null && this.V) {
            i11 = 1;
        } else {
            i11 = 0;
        }
        int i17 = i11 + 1;
        if (svVar3 != null && this.V && i10 == 1) {
            i12 = x61Var.f39879n;
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
        x61.a(x61Var, i12, AndroidUtilities.dp(i15 - 2));
        x61Var.f39852a0.j(i10, true);
        x61Var.f39862e0.I1 = true;
        x61Var.v(null, true, true);
        n51 n51Var = x61Var.f39858c0;
        if (n51Var != null && (k61Var = n51Var.f35659n) != null) {
            k61Var.E1(null);
        }
        return true;
    }

    @Override
    public final void i(org.telegram.ui.Components.sv svVar) {
        ValueAnimator valueAnimator = this.f38104e0.R1;
        if (valueAnimator != null && !valueAnimator.isRunning()) {
            return;
        }
        svVar.setScaleX(0.0f);
        svVar.setScaleY(0.0f);
    }
}
