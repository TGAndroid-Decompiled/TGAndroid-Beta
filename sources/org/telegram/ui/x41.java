package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.ColorFilter;
import android.util.SparseIntArray;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class x41 extends org.telegram.ui.Components.kw {
    public final int f43494g0;
    public final b61 f43495h0;

    public x41(b61 b61Var, Context context, org.telegram.ui.ActionBar.g6 g6Var, boolean z10, boolean z11, int i10, mv0 mv0Var, int i11, int i12) {
        super(context, g6Var, z10, z11, false, true, i10, mv0Var, i11, false);
        this.f43495h0 = b61Var;
        this.f43494g0 = i12;
    }

    @Override
    public final ColorFilter getEmojiColorFilter() {
        return this.f43495h0.f35912k1;
    }

    @Override
    public final boolean h(int i10) {
        int i11;
        int i12;
        p51 p51Var;
        int i13;
        int i14;
        b61 b61Var = this.f43495h0;
        SparseIntArray sparseIntArray = b61Var.f35940x0;
        int i15 = 0;
        if (b61Var.f35941x1) {
            return false;
        }
        int i16 = this.f43494g0;
        if (i16 == 4 && i10 == 0) {
            b61Var.Q = !b61Var.Q;
            b61Var.f35896d0.setVisibility(8);
            org.telegram.ui.Components.kw kwVar = b61Var.f35894c0[b61Var.Q ? 1 : 0];
            b61Var.f35896d0 = kwVar;
            kwVar.setVisibility(0);
            org.telegram.ui.Components.gw gwVar = b61Var.f35896d0.f28170x;
            Context context = getContext();
            if (b61Var.Q) {
                i13 = R.drawable.msg_emoji_stickers;
            } else {
                i13 = R.drawable.msg_emoji_smiles;
            }
            gwVar.setDrawable(context.getDrawable(i13));
            org.telegram.ui.Components.gw gwVar2 = b61Var.f35896d0.f28170x;
            if (b61Var.Q) {
                i14 = R.string.AccDescrStickers;
            } else {
                i14 = R.string.Emoji;
            }
            gwVar2.setContentDescription(LocaleController.getString(i14));
            b61Var.B(true, false, false);
            b61Var.f35925r0.h1(0, 0);
            return true;
        }
        org.telegram.ui.Components.gw gwVar3 = this.E;
        if (gwVar3 != null && this.f28163b0) {
            i11 = 1;
        } else {
            i11 = 0;
        }
        int i17 = i11 + 1;
        if (gwVar3 != null && this.f28163b0 && i10 == 1) {
            i12 = b61Var.f35915n;
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
        b61.a(b61Var, i12, AndroidUtilities.dp(i15 - 2));
        b61Var.f35896d0.j(i10, true);
        b61Var.f35905h0.J1 = true;
        b61Var.v(null, true, true);
        s41 s41Var = b61Var.f35901f0;
        if (s41Var != null && (p51Var = s41Var.f40631n) != null) {
            p51Var.L1(null);
        }
        return true;
    }

    @Override
    public final void i(org.telegram.ui.Components.gw gwVar) {
        ValueAnimator valueAnimator = this.f43495h0.V1;
        if (valueAnimator != null && !valueAnimator.isRunning()) {
            return;
        }
        gwVar.setScaleX(0.0f);
        gwVar.setScaleY(0.0f);
    }
}
