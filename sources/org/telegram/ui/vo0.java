package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
public final class vo0 extends org.telegram.ui.Components.tl0 {
    public final int U2;
    public final dp0 V2;

    public vo0(dp0 dp0Var, Context context, org.telegram.ui.ActionBar.g6 g6Var, int i10) {
        super(context, g6Var);
        this.V2 = dp0Var;
        this.U2 = i10;
    }

    @Override
    public final Integer W0(int i10) {
        dp0 dp0Var = this.V2;
        if ((i10 >= dp0Var.Q && i10 < dp0Var.R) || (i10 >= dp0Var.S && i10 < dp0Var.T)) {
            return 0;
        }
        return super.W0(i10);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        dp0 dp0Var = this.V2;
        O0(canvas, dp0Var.Q, Math.max(dp0Var.T, dp0Var.R) - 1, org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21659d6, this.f31383m2), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        super.onDraw(canvas);
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        mh.l7 l7Var;
        super.onLayout(z4, i10, i11, i12, i13);
        dp0 dp0Var = this.V2;
        ip0 ip0Var = dp0Var.f36282g0;
        dp0.a(dp0Var);
        if (dp0Var.C != null) {
            if (dp0Var.B != null && dp0Var.c()) {
                dp0Var.B.g(false);
                return;
            }
            return;
        }
        if (this.U2 == 1) {
            l7Var = ip0Var.f37906c;
        } else {
            l7Var = ip0Var.f37905b;
        }
        if (l7Var != null && dp0Var.c()) {
            l7Var.a();
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        dp0.a(this.V2);
    }
}
