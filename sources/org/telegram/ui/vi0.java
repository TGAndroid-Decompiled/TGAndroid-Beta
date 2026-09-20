package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
public final class vi0 extends org.telegram.ui.Components.aw0 {
    public final l20 A0;
    public final Paint B0;
    public final org.telegram.ui.ActionBar.f6 C0;
    public final dj0 D0;
    public final int[] f38565w0;
    public final int[] f38566x0;
    public int f38567y0;
    public final int[] f38568z0;

    public vi0(dj0 dj0Var, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, null);
        this.D0 = dj0Var;
        this.C0 = f6Var;
        this.f38565w0 = new int[2];
        this.f38566x0 = new int[2];
        this.f38567y0 = 0;
        this.f38568z0 = new int[2];
        this.A0 = new l20();
        org.telegram.ui.Components.qr qrVar = org.telegram.ui.Components.qr.f27642f;
        this.B0 = new Paint(1);
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r34) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.vi0.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        dj0 dj0Var = this.D0;
        if (dj0Var.f33086w) {
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
