package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.ColorFilter;
import android.util.SparseIntArray;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class y51 extends org.telegram.ui.Components.gw {
    public final int f43066g0;
    public final c71 f43067h0;

    public y51(c71 c71Var, Context context, org.telegram.ui.ActionBar.d6 d6Var, boolean z10, boolean z11, int i10, wx0 wx0Var, int i11, int i12) {
        super(context, d6Var, z10, z11, false, true, i10, wx0Var, i11, false);
        this.f43067h0 = c71Var;
        this.f43066g0 = i12;
    }

    @Override
    public final ColorFilter getEmojiColorFilter() {
        return this.f43067h0.f35322k1;
    }

    @Override
    public final boolean h(int i10) {
        int i11;
        int i12;
        q61 q61Var;
        int i13;
        int i14;
        c71 c71Var = this.f43067h0;
        SparseIntArray sparseIntArray = c71Var.f35350x0;
        int i15 = 0;
        if (c71Var.f35348w1) {
            return false;
        }
        int i16 = this.f43066g0;
        if (i16 == 4 && i10 == 0) {
            c71Var.Q = !c71Var.Q;
            c71Var.f35305d0.setVisibility(8);
            org.telegram.ui.Components.gw gwVar = c71Var.f35303c0[c71Var.Q ? 1 : 0];
            c71Var.f35305d0 = gwVar;
            gwVar.setVisibility(0);
            org.telegram.ui.Components.cw cwVar = c71Var.f35305d0.f26939x;
            Context context = getContext();
            if (c71Var.Q) {
                i13 = R.drawable.msg_emoji_stickers;
            } else {
                i13 = R.drawable.msg_emoji_smiles;
            }
            cwVar.setDrawable(context.getDrawable(i13));
            org.telegram.ui.Components.cw cwVar2 = c71Var.f35305d0.f26939x;
            if (c71Var.Q) {
                i14 = R.string.AccDescrStickers;
            } else {
                i14 = R.string.Emoji;
            }
            cwVar2.setContentDescription(LocaleController.getString(i14));
            c71Var.B(true, false, false);
            c71Var.f35335r0.h1(0, 0);
            return true;
        }
        org.telegram.ui.Components.cw cwVar3 = this.E;
        if (cwVar3 != null && this.f26932b0) {
            i11 = 1;
        } else {
            i11 = 0;
        }
        int i17 = i11 + 1;
        if (cwVar3 != null && this.f26932b0 && i10 == 1) {
            i12 = c71Var.f35325n;
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
        c71.a(c71Var, i12, AndroidUtilities.dp(i15 - 2));
        c71Var.f35305d0.j(i10, true);
        c71Var.f35315h0.L1 = true;
        c71Var.v(null, true, true);
        t51 t51Var = c71Var.f35311f0;
        if (t51Var != null && (q61Var = t51Var.f39932n) != null) {
            q61Var.H1(null);
        }
        return true;
    }

    @Override
    public final void i(org.telegram.ui.Components.cw cwVar) {
        ValueAnimator valueAnimator = this.f43067h0.U1;
        if (valueAnimator != null && !valueAnimator.isRunning()) {
            return;
        }
        cwVar.setScaleX(0.0f);
        cwVar.setScaleY(0.0f);
    }
}
