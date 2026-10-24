package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.ColorFilter;
import android.util.SparseIntArray;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class w41 extends org.telegram.ui.Components.iw {
    public final int f42899g0;
    public final a61 f42900h0;

    public w41(a61 a61Var, Context context, org.telegram.ui.ActionBar.g6 g6Var, boolean z10, boolean z11, int i10, lv0 lv0Var, int i11, int i12) {
        super(context, g6Var, z10, z11, false, true, i10, lv0Var, i11, false);
        this.f42900h0 = a61Var;
        this.f42899g0 = i12;
    }

    @Override
    public final ColorFilter getEmojiColorFilter() {
        return this.f42900h0.f35629k1;
    }

    @Override
    public final boolean h(int i10) {
        int i11;
        int i12;
        o51 o51Var;
        int i13;
        int i14;
        a61 a61Var = this.f42900h0;
        SparseIntArray sparseIntArray = a61Var.f35657x0;
        int i15 = 0;
        if (a61Var.f35658x1) {
            return false;
        }
        int i16 = this.f42899g0;
        if (i16 == 4 && i10 == 0) {
            a61Var.Q = !a61Var.Q;
            a61Var.f35613d0.setVisibility(8);
            org.telegram.ui.Components.iw iwVar = a61Var.f35611c0[a61Var.Q ? 1 : 0];
            a61Var.f35613d0 = iwVar;
            iwVar.setVisibility(0);
            org.telegram.ui.Components.ew ewVar = a61Var.f35613d0.f27506x;
            Context context = getContext();
            if (a61Var.Q) {
                i13 = R.drawable.msg_emoji_stickers;
            } else {
                i13 = R.drawable.msg_emoji_smiles;
            }
            ewVar.setDrawable(context.getDrawable(i13));
            org.telegram.ui.Components.ew ewVar2 = a61Var.f35613d0.f27506x;
            if (a61Var.Q) {
                i14 = R.string.AccDescrStickers;
            } else {
                i14 = R.string.Emoji;
            }
            ewVar2.setContentDescription(LocaleController.getString(i14));
            a61Var.B(true, false, false);
            a61Var.f35642r0.h1(0, 0);
            return true;
        }
        org.telegram.ui.Components.ew ewVar3 = this.E;
        if (ewVar3 != null && this.f27499b0) {
            i11 = 1;
        } else {
            i11 = 0;
        }
        int i17 = i11 + 1;
        if (ewVar3 != null && this.f27499b0 && i10 == 1) {
            i12 = a61Var.f35632n;
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
        a61.a(a61Var, i12, AndroidUtilities.dp(i15 - 2));
        a61Var.f35613d0.j(i10, true);
        a61Var.f35622h0.J1 = true;
        a61Var.v(null, true, true);
        r41 r41Var = a61Var.f35618f0;
        if (r41Var != null && (o51Var = r41Var.f40339n) != null) {
            o51Var.L1(null);
        }
        return true;
    }

    @Override
    public final void i(org.telegram.ui.Components.ew ewVar) {
        ValueAnimator valueAnimator = this.f42900h0.V1;
        if (valueAnimator != null && !valueAnimator.isRunning()) {
            return;
        }
        ewVar.setScaleX(0.0f);
        ewVar.setScaleY(0.0f);
    }
}
