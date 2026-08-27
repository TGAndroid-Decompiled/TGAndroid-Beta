package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.ColorFilter;
import android.util.SparseIntArray;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

public final class w41 extends org.telegram.ui.Components.mv {

    public final int f43606e0;

    public final a61 f43607f0;

    public w41(a61 a61Var, Context context, org.telegram.ui.ActionBar.c6 c6Var, boolean z10, boolean z11, int i10, m21 m21Var, int i11, int i12) {
        super(context, c6Var, z10, z11, false, true, i10, m21Var, i11, false);
        this.f43607f0 = a61Var;
        this.f43606e0 = i12;
    }

    @Override
    public final ColorFilter getEmojiColorFilter() {
        return this.f43607f0.f36401g1;
    }

    @Override
    public final boolean h(int i10) {
        int i11;
        o51 o51Var;
        a61 a61Var = this.f43607f0;
        SparseIntArray sparseIntArray = a61Var.f36427t0;
        if (a61Var.f36426s1) {
            return false;
        }
        int i12 = this.f43606e0;
        if (i12 == 4 && i10 == 0) {
            a61Var.M = !a61Var.M;
            a61Var.W.setVisibility(8);
            org.telegram.ui.Components.mv mvVar = a61Var.V[a61Var.M ? 1 : 0];
            a61Var.W = mvVar;
            mvVar.setVisibility(0);
            a61Var.W.f30758x.setDrawable(getContext().getDrawable(a61Var.M ? R.drawable.msg_emoji_stickers : R.drawable.msg_emoji_smiles));
            a61Var.W.f30758x.setContentDescription(LocaleController.getString(a61Var.M ? R.string.AccDescrStickers : R.string.Emoji));
            a61Var.B(true, false, false);
            a61Var.f36413n0.h1(0, 0);
            return true;
        }
        org.telegram.ui.Components.iv ivVar = this.A;
        int i13 = ((ivVar == null || !this.V) ? 0 : 1) + 1;
        if (ivVar != null && this.V && i10 == 1) {
            i11 = a61Var.f36412n;
        } else if (!(i12 == 4 && i10 == 0) && i10 > 0) {
            int i14 = i10 - i13;
            if (sparseIntArray.indexOfKey(i14) >= 0) {
                i11 = sparseIntArray.get(i14);
            } else {
                i11 = 0;
            }
        } else {
            i11 = 0;
        }
        a61.a(a61Var, i11, AndroidUtilities.dp((i12 == 6 ? 7 : 0) - 2));
        a61Var.W.j(i10, true);
        a61Var.f36392d0.H1 = true;
        a61Var.v(null, true, true);
        r41 r41Var = a61Var.f36387b0;
        if (r41Var != null && (o51Var = r41Var.f41277n) != null) {
            o51Var.F1(null);
        }
        return true;
    }

    @Override
    public final void i(org.telegram.ui.Components.iv ivVar) {
        ValueAnimator valueAnimator = this.f43607f0.Q1;
        if (valueAnimator == null || valueAnimator.isRunning()) {
            ivVar.setScaleX(0.0f);
            ivVar.setScaleY(0.0f);
        }
    }
}
