package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.ColorFilter;
import android.util.SparseIntArray;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class t41 extends org.telegram.ui.Components.kw {
    public final int f41596g0;
    public final x51 f41597h0;

    public t41(x51 x51Var, Context context, org.telegram.ui.ActionBar.d6 d6Var, boolean z10, boolean z11, int i10, jv0 jv0Var, int i11, int i12) {
        super(context, d6Var, z10, z11, false, true, i10, jv0Var, i11, false);
        this.f41597h0 = x51Var;
        this.f41596g0 = i12;
    }

    @Override
    public final ColorFilter getEmojiColorFilter() {
        return this.f41597h0.f43071k1;
    }

    @Override
    public final boolean h(int i10) {
        int i11;
        int i12;
        l51 l51Var;
        int i13;
        int i14;
        x51 x51Var = this.f41597h0;
        SparseIntArray sparseIntArray = x51Var.f43099x0;
        int i15 = 0;
        if (x51Var.f43097w1) {
            return false;
        }
        int i16 = this.f41596g0;
        if (i16 == 4 && i10 == 0) {
            x51Var.Q = !x51Var.Q;
            x51Var.f43055d0.setVisibility(8);
            org.telegram.ui.Components.kw kwVar = x51Var.f43053c0[x51Var.Q ? 1 : 0];
            x51Var.f43055d0 = kwVar;
            kwVar.setVisibility(0);
            org.telegram.ui.Components.gw gwVar = x51Var.f43055d0.f27978x;
            Context context = getContext();
            if (x51Var.Q) {
                i13 = R.drawable.msg_emoji_stickers;
            } else {
                i13 = R.drawable.msg_emoji_smiles;
            }
            gwVar.setDrawable(context.getDrawable(i13));
            org.telegram.ui.Components.gw gwVar2 = x51Var.f43055d0.f27978x;
            if (x51Var.Q) {
                i14 = R.string.AccDescrStickers;
            } else {
                i14 = R.string.Emoji;
            }
            gwVar2.setContentDescription(LocaleController.getString(i14));
            x51Var.B(true, false, false);
            x51Var.f43084r0.h1(0, 0);
            return true;
        }
        org.telegram.ui.Components.gw gwVar3 = this.E;
        if (gwVar3 != null && this.f27971b0) {
            i11 = 1;
        } else {
            i11 = 0;
        }
        int i17 = i11 + 1;
        if (gwVar3 != null && this.f27971b0 && i10 == 1) {
            i12 = x51Var.f43074n;
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
        x51.a(x51Var, i12, AndroidUtilities.dp(i15 - 2));
        x51Var.f43055d0.j(i10, true);
        x51Var.f43064h0.J1 = true;
        x51Var.v(null, true, true);
        o41 o41Var = x51Var.f43060f0;
        if (o41Var != null && (l51Var = o41Var.f39121n) != null) {
            l51Var.G1(null);
        }
        return true;
    }

    @Override
    public final void i(org.telegram.ui.Components.gw gwVar) {
        ValueAnimator valueAnimator = this.f41597h0.U1;
        if (valueAnimator != null && !valueAnimator.isRunning()) {
            return;
        }
        gwVar.setScaleX(0.0f);
        gwVar.setScaleY(0.0f);
    }
}
