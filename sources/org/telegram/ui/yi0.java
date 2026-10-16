package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
public final class yi0 extends org.telegram.ui.Components.ow0 {
    public final p20 A0;
    public final Paint B0;
    public final org.telegram.ui.ActionBar.c6 C0;
    public final gj0 D0;
    public final int[] f41837w0;
    public final int[] f41838x0;
    public int f41839y0;
    public final int[] f41840z0;

    public yi0(gj0 gj0Var, Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, null);
        this.D0 = gj0Var;
        this.C0 = c6Var;
        this.f41837w0 = new int[2];
        this.f41838x0 = new int[2];
        this.f41839y0 = 0;
        this.f41840z0 = new int[2];
        this.A0 = new p20();
        org.telegram.ui.Components.es esVar = org.telegram.ui.Components.es.f24465f;
        this.B0 = new Paint(1);
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r34) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.yi0.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        gj0 gj0Var = this.D0;
        if (gj0Var.f36260w) {
            if (view != gj0Var.X) {
                org.telegram.ui.Cells.u1 u1Var = gj0Var.Q;
                if (view == u1Var && u1Var != null && u1Var.getCurrentPosition() == null) {
                    return false;
                }
            } else {
                return false;
            }
        }
        return super.drawChild(canvas, view, j10);
    }
}
