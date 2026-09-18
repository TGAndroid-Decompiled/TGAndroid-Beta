package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
public final class ui0 extends org.telegram.ui.Components.bw0 {
    public final l20 A0;
    public final Paint B0;
    public final org.telegram.ui.ActionBar.e6 C0;
    public final cj0 D0;
    public final int[] f38015w0;
    public final int[] f38016x0;
    public int f38017y0;
    public final int[] f38018z0;

    public ui0(cj0 cj0Var, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, null);
        this.D0 = cj0Var;
        this.C0 = e6Var;
        this.f38015w0 = new int[2];
        this.f38016x0 = new int[2];
        this.f38017y0 = 0;
        this.f38018z0 = new int[2];
        this.A0 = new l20();
        org.telegram.ui.Components.qr qrVar = org.telegram.ui.Components.qr.f27715f;
        this.B0 = new Paint(1);
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r34) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ui0.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        cj0 cj0Var = this.D0;
        if (cj0Var.f32699w) {
            if (view != cj0Var.X) {
                org.telegram.ui.Cells.u1 u1Var = cj0Var.Q;
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
