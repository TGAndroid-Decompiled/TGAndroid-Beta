package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.ColorFilter;
import android.util.SparseIntArray;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class y41 extends org.telegram.ui.Components.kw {
    public final int f45955g0;
    public final c61 f45956h0;

    public y41(c61 c61Var, Context context, org.telegram.ui.ActionBar.u6 u6Var, boolean z10, boolean z11, int i10, fy0 fy0Var, int i11, int i12) {
        super(context, u6Var, z10, z11, false, true, i10, fy0Var, i11, false);
        this.f45956h0 = c61Var;
        this.f45955g0 = i12;
    }

    @Override
    public final ColorFilter getEmojiColorFilter() {
        return this.f45956h0.f38306k1;
    }

    @Override
    public final boolean h(int i10) {
        int i11;
        int i12;
        q51 q51Var;
        int i13;
        int i14;
        c61 c61Var = this.f45956h0;
        SparseIntArray sparseIntArray = c61Var.f38334x0;
        int i15 = 0;
        if (c61Var.f38335x1) {
            return false;
        }
        int i16 = this.f45955g0;
        if (i16 == 4 && i10 == 0) {
            c61Var.Q = !c61Var.Q;
            c61Var.f38290d0.setVisibility(8);
            org.telegram.ui.Components.kw kwVar = c61Var.f38288c0[c61Var.Q ? 1 : 0];
            c61Var.f38290d0 = kwVar;
            kwVar.setVisibility(0);
            org.telegram.ui.Components.gw gwVar = c61Var.f38290d0.f29998x;
            Context context = getContext();
            if (c61Var.Q) {
                i13 = R.drawable.msg_emoji_stickers;
            } else {
                i13 = R.drawable.msg_emoji_smiles;
            }
            gwVar.setDrawable(context.getDrawable(i13));
            org.telegram.ui.Components.gw gwVar2 = c61Var.f38290d0.f29998x;
            if (c61Var.Q) {
                i14 = R.string.AccDescrStickers;
            } else {
                i14 = R.string.Emoji;
            }
            gwVar2.setContentDescription(LocaleController.getString(i14));
            c61Var.B(true, false, false);
            c61Var.f38319r0.h1(0, 0);
            return true;
        }
        org.telegram.ui.Components.gw gwVar3 = this.E;
        if (gwVar3 != null && this.f29991b0) {
            i11 = 1;
        } else {
            i11 = 0;
        }
        int i17 = i11 + 1;
        if (gwVar3 != null && this.f29991b0 && i10 == 1) {
            i12 = c61Var.f38309n;
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
        c61.a(c61Var, i12, AndroidUtilities.dp(i15 - 2));
        c61Var.f38290d0.j(i10, true);
        c61Var.f38299h0.J1 = true;
        c61Var.v(null, true, true);
        t41 t41Var = c61Var.f38295f0;
        if (t41Var != null && (q51Var = t41Var.f43003n) != null) {
            q51Var.L1(null);
        }
        return true;
    }

    @Override
    public final void i(org.telegram.ui.Components.gw gwVar) {
        ValueAnimator valueAnimator = this.f45956h0.V1;
        if (valueAnimator != null && !valueAnimator.isRunning()) {
            return;
        }
        gwVar.setScaleX(0.0f);
        gwVar.setScaleY(0.0f);
    }
}
