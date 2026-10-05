package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
public final class ri0 extends org.telegram.ui.Components.mw0 {
    public final k20 A0;
    public final Paint B0;
    public final org.telegram.ui.ActionBar.d6 C0;
    public final zi0 D0;
    public final int[] f40114w0;
    public final int[] f40115x0;
    public int f40116y0;
    public final int[] f40117z0;

    public ri0(zi0 zi0Var, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, null);
        this.D0 = zi0Var;
        this.C0 = d6Var;
        this.f40114w0 = new int[2];
        this.f40115x0 = new int[2];
        this.f40116y0 = 0;
        this.f40117z0 = new int[2];
        this.A0 = new k20();
        org.telegram.ui.Components.tr trVar = org.telegram.ui.Components.tr.f31215f;
        this.B0 = new Paint(1);
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r34) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ri0.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        zi0 zi0Var = this.D0;
        if (zi0Var.f43831w) {
            if (view != zi0Var.X) {
                org.telegram.ui.Cells.u1 u1Var = zi0Var.Q;
                if (view == u1Var && u1Var != null && u1Var.getCurrentPosition() == null) {
                    return false;
                }
            } else {
                return false;
            }
        }
        return super.drawChild(canvas, view, j3);
    }
}
