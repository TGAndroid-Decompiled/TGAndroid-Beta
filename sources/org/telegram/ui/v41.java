package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.ColorFilter;
import android.util.SparseIntArray;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class v41 extends org.telegram.ui.Components.kw {
    public final int f42119g0;
    public final z51 f42120h0;

    public v41(z51 z51Var, Context context, org.telegram.ui.ActionBar.d6 d6Var, boolean z10, boolean z11, int i10, lv0 lv0Var, int i11, int i12) {
        super(context, d6Var, z10, z11, false, true, i10, lv0Var, i11, false);
        this.f42120h0 = z51Var;
        this.f42119g0 = i12;
    }

    @Override
    public final ColorFilter getEmojiColorFilter() {
        return this.f42120h0.f43603k1;
    }

    @Override
    public final boolean h(int i10) {
        int i11;
        int i12;
        n51 n51Var;
        int i13;
        int i14;
        z51 z51Var = this.f42120h0;
        SparseIntArray sparseIntArray = z51Var.f43631x0;
        int i15 = 0;
        if (z51Var.f43629w1) {
            return false;
        }
        int i16 = this.f42119g0;
        if (i16 == 4 && i10 == 0) {
            z51Var.Q = !z51Var.Q;
            z51Var.f43587d0.setVisibility(8);
            org.telegram.ui.Components.kw kwVar = z51Var.f43585c0[z51Var.Q ? 1 : 0];
            z51Var.f43587d0 = kwVar;
            kwVar.setVisibility(0);
            org.telegram.ui.Components.gw gwVar = z51Var.f43587d0.f28010x;
            Context context = getContext();
            if (z51Var.Q) {
                i13 = R.drawable.msg_emoji_stickers;
            } else {
                i13 = R.drawable.msg_emoji_smiles;
            }
            gwVar.setDrawable(context.getDrawable(i13));
            org.telegram.ui.Components.gw gwVar2 = z51Var.f43587d0.f28010x;
            if (z51Var.Q) {
                i14 = R.string.AccDescrStickers;
            } else {
                i14 = R.string.Emoji;
            }
            gwVar2.setContentDescription(LocaleController.getString(i14));
            z51Var.B(true, false, false);
            z51Var.f43616r0.h1(0, 0);
            return true;
        }
        org.telegram.ui.Components.gw gwVar3 = this.E;
        if (gwVar3 != null && this.f28003b0) {
            i11 = 1;
        } else {
            i11 = 0;
        }
        int i17 = i11 + 1;
        if (gwVar3 != null && this.f28003b0 && i10 == 1) {
            i12 = z51Var.f43606n;
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
        z51.a(z51Var, i12, AndroidUtilities.dp(i15 - 2));
        z51Var.f43587d0.j(i10, true);
        z51Var.f43596h0.J1 = true;
        z51Var.v(null, true, true);
        q41 q41Var = z51Var.f43592f0;
        if (q41Var != null && (n51Var = q41Var.f39662n) != null) {
            n51Var.G1(null);
        }
        return true;
    }

    @Override
    public final void i(org.telegram.ui.Components.gw gwVar) {
        ValueAnimator valueAnimator = this.f42120h0.U1;
        if (valueAnimator != null && !valueAnimator.isRunning()) {
            return;
        }
        gwVar.setScaleX(0.0f);
        gwVar.setScaleY(0.0f);
    }
}
