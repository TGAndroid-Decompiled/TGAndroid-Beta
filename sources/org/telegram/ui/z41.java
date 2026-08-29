package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.ColorFilter;
import android.util.SparseIntArray;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class z41 extends org.telegram.ui.Components.tv {
    public final int f45071c0;
    public final d61 f45072d0;

    public z41(d61 d61Var, Context context, org.telegram.ui.ActionBar.c6 c6Var, boolean z10, boolean z11, int i10, t31 t31Var, int i11, int i12) {
        super(context, c6Var, z10, z11, false, true, i10, t31Var, i11, false);
        this.f45072d0 = d61Var;
        this.f45071c0 = i12;
    }

    @Override
    public final ColorFilter getEmojiColorFilter() {
        return this.f45072d0.f37335g1;
    }

    @Override
    public final boolean h(int i10) {
        int i11;
        int i12;
        r51 r51Var;
        int i13;
        int i14;
        d61 d61Var = this.f45072d0;
        SparseIntArray sparseIntArray = d61Var.f37361t0;
        int i15 = 0;
        if (d61Var.f37360s1) {
            return false;
        }
        int i16 = this.f45071c0;
        if (i16 == 4 && i10 == 0) {
            d61Var.M = !d61Var.M;
            d61Var.W.setVisibility(8);
            org.telegram.ui.Components.tv tvVar = d61Var.V[d61Var.M ? 1 : 0];
            d61Var.W = tvVar;
            tvVar.setVisibility(0);
            org.telegram.ui.Components.pv pvVar = d61Var.W.f33047x;
            Context context = getContext();
            if (d61Var.M) {
                i13 = R.drawable.msg_emoji_stickers;
            } else {
                i13 = R.drawable.msg_emoji_smiles;
            }
            pvVar.setDrawable(context.getDrawable(i13));
            org.telegram.ui.Components.pv pvVar2 = d61Var.W.f33047x;
            if (d61Var.M) {
                i14 = R.string.AccDescrStickers;
            } else {
                i14 = R.string.Emoji;
            }
            pvVar2.setContentDescription(LocaleController.getString(i14));
            d61Var.B(true, false, false);
            d61Var.f37347n0.h1(0, 0);
            return true;
        }
        org.telegram.ui.Components.pv pvVar3 = this.A;
        if (pvVar3 != null && this.U) {
            i11 = 1;
        } else {
            i11 = 0;
        }
        int i17 = i11 + 1;
        if (pvVar3 != null && this.U && i10 == 1) {
            i12 = d61Var.f37346n;
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
        d61.a(d61Var, i12, AndroidUtilities.dp(i15 - 2));
        d61Var.W.j(i10, true);
        d61Var.f37326d0.H1 = true;
        d61Var.v(null, true, true);
        u41 u41Var = d61Var.f37321b0;
        if (u41Var != null && (r51Var = u41Var.f42276n) != null) {
            r51Var.F1(null);
        }
        return true;
    }

    @Override
    public final void i(org.telegram.ui.Components.pv pvVar) {
        ValueAnimator valueAnimator = this.f45072d0.Q1;
        if (valueAnimator != null && !valueAnimator.isRunning()) {
            return;
        }
        pvVar.setScaleX(0.0f);
        pvVar.setScaleY(0.0f);
    }
}
