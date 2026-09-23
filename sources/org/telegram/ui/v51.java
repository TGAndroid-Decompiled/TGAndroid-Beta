package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.ColorFilter;
import android.util.SparseIntArray;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class v51 extends org.telegram.ui.Components.dw {
    public final int f38301g0;
    public final z61 f38302h0;

    public v51(z61 z61Var, Context context, org.telegram.ui.ActionBar.d6 d6Var, boolean z10, boolean z11, int i10, by0 by0Var, int i11, int i12) {
        super(context, d6Var, z10, z11, false, true, i10, by0Var, i11, false);
        this.f38302h0 = z61Var;
        this.f38301g0 = i12;
    }

    @Override
    public final ColorFilter getEmojiColorFilter() {
        return this.f38302h0.f40028k1;
    }

    @Override
    public final boolean h(int i10) {
        int i11;
        int i12;
        n61 n61Var;
        int i13;
        int i14;
        z61 z61Var = this.f38302h0;
        SparseIntArray sparseIntArray = z61Var.f40056x0;
        int i15 = 0;
        if (z61Var.f40054w1) {
            return false;
        }
        int i16 = this.f38301g0;
        if (i16 == 4 && i10 == 0) {
            z61Var.Q = !z61Var.Q;
            z61Var.f40012d0.setVisibility(8);
            org.telegram.ui.Components.dw dwVar = z61Var.f40010c0[z61Var.Q ? 1 : 0];
            z61Var.f40012d0 = dwVar;
            dwVar.setVisibility(0);
            org.telegram.ui.Components.zv zvVar = z61Var.f40012d0.f23477x;
            Context context = getContext();
            if (z61Var.Q) {
                i13 = R.drawable.msg_emoji_stickers;
            } else {
                i13 = R.drawable.msg_emoji_smiles;
            }
            zvVar.setDrawable(context.getDrawable(i13));
            org.telegram.ui.Components.zv zvVar2 = z61Var.f40012d0.f23477x;
            if (z61Var.Q) {
                i14 = R.string.AccDescrStickers;
            } else {
                i14 = R.string.Emoji;
            }
            zvVar2.setContentDescription(LocaleController.getString(i14));
            z61Var.B(true, false, false);
            z61Var.f40041r0.h1(0, 0);
            return true;
        }
        org.telegram.ui.Components.zv zvVar3 = this.E;
        if (zvVar3 != null && this.f23470b0) {
            i11 = 1;
        } else {
            i11 = 0;
        }
        int i17 = i11 + 1;
        if (zvVar3 != null && this.f23470b0 && i10 == 1) {
            i12 = z61Var.f40031n;
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
        z61.a(z61Var, i12, AndroidUtilities.dp(i15 - 2));
        z61Var.f40012d0.j(i10, true);
        z61Var.f40021h0.L1 = true;
        z61Var.v(null, true, true);
        q51 q51Var = z61Var.f40017f0;
        if (q51Var != null && (n61Var = q51Var.f35693n) != null) {
            n61Var.F1(null);
        }
        return true;
    }

    @Override
    public final void i(org.telegram.ui.Components.zv zvVar) {
        ValueAnimator valueAnimator = this.f38302h0.U1;
        if (valueAnimator != null && !valueAnimator.isRunning()) {
            return;
        }
        zvVar.setScaleX(0.0f);
        zvVar.setScaleY(0.0f);
    }
}
