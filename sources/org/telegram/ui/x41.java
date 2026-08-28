package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.ColorFilter;
import android.util.SparseIntArray;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class x41 extends org.telegram.ui.Components.nv {
    public final int f44365c0;
    public final b61 f44366d0;

    public x41(b61 b61Var, Context context, org.telegram.ui.ActionBar.b6 b6Var, boolean z10, boolean z11, int i9, n21 n21Var, int i10, int i11) {
        super(context, b6Var, z10, z11, false, true, i9, n21Var, i10, false);
        this.f44366d0 = b61Var;
        this.f44365c0 = i11;
    }

    @Override
    public final ColorFilter getEmojiColorFilter() {
        return this.f44366d0.f36678g1;
    }

    @Override
    public final boolean h(int i9) {
        int i10;
        int i11;
        p51 p51Var;
        int i12;
        int i13;
        b61 b61Var = this.f44366d0;
        SparseIntArray sparseIntArray = b61Var.f36704t0;
        int i14 = 0;
        if (b61Var.f36703s1) {
            return false;
        }
        int i15 = this.f44365c0;
        if (i15 == 4 && i9 == 0) {
            b61Var.M = !b61Var.M;
            b61Var.W.setVisibility(8);
            org.telegram.ui.Components.nv nvVar = b61Var.V[b61Var.M ? 1 : 0];
            b61Var.W = nvVar;
            nvVar.setVisibility(0);
            org.telegram.ui.Components.jv jvVar = b61Var.W.f31188x;
            Context context = getContext();
            if (b61Var.M) {
                i12 = R.drawable.msg_emoji_stickers;
            } else {
                i12 = R.drawable.msg_emoji_smiles;
            }
            jvVar.setDrawable(context.getDrawable(i12));
            org.telegram.ui.Components.jv jvVar2 = b61Var.W.f31188x;
            if (b61Var.M) {
                i13 = R.string.AccDescrStickers;
            } else {
                i13 = R.string.Emoji;
            }
            jvVar2.setContentDescription(LocaleController.getString(i13));
            b61Var.B(true, false, false);
            b61Var.f36690n0.h1(0, 0);
            return true;
        }
        org.telegram.ui.Components.jv jvVar3 = this.A;
        if (jvVar3 != null && this.U) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        int i16 = i10 + 1;
        if (jvVar3 != null && this.U && i9 == 1) {
            i11 = b61Var.f36689n;
        } else {
            if ((i15 != 4 || i9 != 0) && i9 > 0) {
                int i17 = i9 - i16;
                if (sparseIntArray.indexOfKey(i17) >= 0) {
                    i11 = sparseIntArray.get(i17);
                }
            }
            i11 = 0;
        }
        if (i15 == 6) {
            i14 = 7;
        }
        b61.a(b61Var, i11, AndroidUtilities.dp(i14 - 2));
        b61Var.W.j(i9, true);
        b61Var.f36669d0.H1 = true;
        b61Var.v(null, true, true);
        s41 s41Var = b61Var.f36664b0;
        if (s41Var != null && (p51Var = s41Var.f41687n) != null) {
            p51Var.F1(null);
        }
        return true;
    }

    @Override
    public final void i(org.telegram.ui.Components.jv jvVar) {
        ValueAnimator valueAnimator = this.f44366d0.Q1;
        if (valueAnimator != null && !valueAnimator.isRunning()) {
            return;
        }
        jvVar.setScaleX(0.0f);
        jvVar.setScaleY(0.0f);
    }
}
