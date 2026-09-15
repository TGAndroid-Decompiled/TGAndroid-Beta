package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
public final class ti0 extends org.telegram.ui.Components.pv0 {
    public final l20 A0;
    public final Paint B0;
    public final org.telegram.ui.ActionBar.e6 C0;
    public final bj0 D0;
    public final int[] f37688w0;
    public final int[] f37689x0;
    public int f37690y0;
    public final int[] f37691z0;

    public ti0(bj0 bj0Var, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, null);
        this.D0 = bj0Var;
        this.C0 = e6Var;
        this.f37688w0 = new int[2];
        this.f37689x0 = new int[2];
        this.f37690y0 = 0;
        this.f37691z0 = new int[2];
        this.A0 = new l20();
        org.telegram.ui.Components.qr qrVar = org.telegram.ui.Components.qr.f27423f;
        this.B0 = new Paint(1);
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r34) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ti0.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        bj0 bj0Var = this.D0;
        if (bj0Var.f32203w) {
            if (view != bj0Var.X) {
                org.telegram.ui.Cells.t1 t1Var = bj0Var.Q;
                if (view == t1Var && t1Var != null && t1Var.getCurrentPosition() == null) {
                    return false;
                }
            } else {
                return false;
            }
        }
        return super.drawChild(canvas, view, j3);
    }
}
