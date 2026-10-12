package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
public final class wi0 extends org.telegram.ui.Components.yw0 {
    public final l20 A0;
    public final Paint B0;
    public final org.telegram.ui.ActionBar.c6 C0;
    public final ej0 D0;
    public final int[] f43535w0;
    public final int[] f43536x0;
    public int f43537y0;
    public final int[] f43538z0;

    public wi0(ej0 ej0Var, Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, null);
        this.D0 = ej0Var;
        this.C0 = c6Var;
        this.f43535w0 = new int[2];
        this.f43536x0 = new int[2];
        this.f43537y0 = 0;
        this.f43538z0 = new int[2];
        this.A0 = new l20();
        org.telegram.ui.Components.js jsVar = org.telegram.ui.Components.js.f27627f;
        this.B0 = new Paint(1);
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r34) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.wi0.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        ej0 ej0Var = this.D0;
        if (ej0Var.f37154w) {
            if (view != ej0Var.X) {
                org.telegram.ui.Cells.u1 u1Var = ej0Var.Q;
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
