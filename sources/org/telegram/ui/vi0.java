package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
public final class vi0 extends org.telegram.ui.Components.sw0 {
    public final j20 A0;
    public final Paint B0;
    public final org.telegram.ui.ActionBar.e6 C0;
    public final dj0 D0;
    public final int[] f42872w0;
    public final int[] f42873x0;
    public int f42874y0;
    public final int[] f42875z0;

    public vi0(dj0 dj0Var, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, null);
        this.D0 = dj0Var;
        this.C0 = e6Var;
        this.f42872w0 = new int[2];
        this.f42873x0 = new int[2];
        this.f42874y0 = 0;
        this.f42875z0 = new int[2];
        this.A0 = new j20();
        org.telegram.ui.Components.hs hsVar = org.telegram.ui.Components.hs.f27118f;
        this.B0 = new Paint(1);
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r34) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.vi0.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        dj0 dj0Var = this.D0;
        if (dj0Var.f37019w) {
            if (view != dj0Var.X) {
                org.telegram.ui.Cells.u1 u1Var = dj0Var.Q;
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
