package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.ColorFilter;
import android.util.SparseIntArray;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class s51 extends org.telegram.ui.Components.zv {
    public final int f41024d0;
    public final w61 f41025e0;

    public s51(w61 w61Var, Context context, org.telegram.ui.ActionBar.g6 g6Var, boolean z4, boolean z10, int i10, h21 h21Var, int i11, int i12) {
        super(context, g6Var, z4, z10, false, true, i10, h21Var, i11, false);
        this.f41025e0 = w61Var;
        this.f41024d0 = i12;
    }

    @Override
    public final ColorFilter getEmojiColorFilter() {
        return this.f41025e0.f42322h1;
    }

    @Override
    public final boolean h(int i10) {
        int i11;
        int i12;
        k61 k61Var;
        int i13;
        int i14;
        w61 w61Var = this.f41025e0;
        SparseIntArray sparseIntArray = w61Var.f42348u0;
        int i15 = 0;
        if (w61Var.f42347t1) {
            return false;
        }
        int i16 = this.f41024d0;
        if (i16 == 4 && i10 == 0) {
            w61Var.N = !w61Var.N;
            w61Var.f42303a0.setVisibility(8);
            org.telegram.ui.Components.zv zvVar = w61Var.W[w61Var.N ? 1 : 0];
            w61Var.f42303a0 = zvVar;
            zvVar.setVisibility(0);
            org.telegram.ui.Components.vv vvVar = w61Var.f42303a0.f34025x;
            Context context = getContext();
            if (w61Var.N) {
                i13 = R.drawable.msg_emoji_stickers;
            } else {
                i13 = R.drawable.msg_emoji_smiles;
            }
            vvVar.setDrawable(context.getDrawable(i13));
            org.telegram.ui.Components.vv vvVar2 = w61Var.f42303a0.f34025x;
            if (w61Var.N) {
                i14 = R.string.AccDescrStickers;
            } else {
                i14 = R.string.Emoji;
            }
            vvVar2.setContentDescription(LocaleController.getString(i14));
            w61Var.B(true, false, false);
            w61Var.f42334o0.h1(0, 0);
            return true;
        }
        org.telegram.ui.Components.vv vvVar3 = this.B;
        if (vvVar3 != null && this.V) {
            i11 = 1;
        } else {
            i11 = 0;
        }
        int i17 = i11 + 1;
        if (vvVar3 != null && this.V && i10 == 1) {
            i12 = w61Var.f42331n;
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
        w61.a(w61Var, i12, AndroidUtilities.dp(i15 - 2));
        w61Var.f42303a0.j(i10, true);
        w61Var.f42314e0.I1 = true;
        w61Var.v(null, true, true);
        n51 n51Var = w61Var.f42309c0;
        if (n51Var != null && (k61Var = n51Var.f38556n) != null) {
            k61Var.E1(null);
        }
        return true;
    }

    @Override
    public final void i(org.telegram.ui.Components.vv vvVar) {
        ValueAnimator valueAnimator = this.f41025e0.R1;
        if (valueAnimator != null && !valueAnimator.isRunning()) {
            return;
        }
        vvVar.setScaleX(0.0f);
        vvVar.setScaleY(0.0f);
    }
}
