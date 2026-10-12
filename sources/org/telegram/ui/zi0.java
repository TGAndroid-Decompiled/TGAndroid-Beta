package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
public final class zi0 extends org.telegram.ui.Components.ow0 {
    public final p20 A0;
    public final Paint B0;
    public final org.telegram.ui.ActionBar.c6 C0;
    public final hj0 D0;
    public final int[] f42634w0;
    public final int[] f42635x0;
    public int f42636y0;
    public final int[] f42637z0;

    public zi0(hj0 hj0Var, Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, null);
        this.D0 = hj0Var;
        this.C0 = c6Var;
        this.f42634w0 = new int[2];
        this.f42635x0 = new int[2];
        this.f42636y0 = 0;
        this.f42637z0 = new int[2];
        this.A0 = new p20();
        org.telegram.ui.Components.es esVar = org.telegram.ui.Components.es.f24771f;
        this.B0 = new Paint(1);
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r34) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.zi0.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        hj0 hj0Var = this.D0;
        if (hj0Var.f36862w) {
            if (view != hj0Var.X) {
                org.telegram.ui.Cells.u1 u1Var = hj0Var.Q;
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
