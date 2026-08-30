package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
public final class to0 extends org.telegram.ui.Components.sl0 {
    public final int U2;
    public final bp0 V2;

    public to0(bp0 bp0Var, Context context, org.telegram.ui.ActionBar.f6 f6Var, int i10) {
        super(context, f6Var);
        this.V2 = bp0Var;
        this.U2 = i10;
    }

    @Override
    public final Integer W0(int i10) {
        bp0 bp0Var = this.V2;
        if ((i10 >= bp0Var.Q && i10 < bp0Var.R) || (i10 >= bp0Var.S && i10 < bp0Var.T)) {
            return 0;
        }
        return super.W0(i10);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        bp0 bp0Var = this.V2;
        O0(canvas, bp0Var.Q, Math.max(bp0Var.T, bp0Var.R) - 1, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19906d6, this.f28750m2), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        super.onDraw(canvas);
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        lh.l7 l7Var;
        super.onLayout(z4, i10, i11, i12, i13);
        bp0 bp0Var = this.V2;
        gp0 gp0Var = bp0Var.f33007g0;
        bp0.a(bp0Var);
        if (bp0Var.C != null) {
            if (bp0Var.B != null && bp0Var.c()) {
                bp0Var.B.g(false);
                return;
            }
            return;
        }
        if (this.U2 == 1) {
            l7Var = gp0Var.f34655c;
        } else {
            l7Var = gp0Var.f34654b;
        }
        if (l7Var != null && bp0Var.c()) {
            l7Var.a();
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        bp0.a(this.V2);
    }
}
