package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
public final class ui0 extends org.telegram.ui.Components.ov0 {
    public final l20 A0;
    public final Paint B0;
    public final org.telegram.ui.ActionBar.f6 C0;
    public final cj0 D0;
    public final int[] f41102w0;
    public final int[] f41103x0;
    public int f41104y0;
    public final int[] f41105z0;

    public ui0(cj0 cj0Var, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, null);
        this.D0 = cj0Var;
        this.C0 = f6Var;
        this.f41102w0 = new int[2];
        this.f41103x0 = new int[2];
        this.f41104y0 = 0;
        this.f41105z0 = new int[2];
        this.A0 = new l20();
        org.telegram.ui.Components.pr prVar = org.telegram.ui.Components.pr.f29466f;
        this.B0 = new Paint(1);
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r34) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ui0.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        cj0 cj0Var = this.D0;
        if (cj0Var.f35156w) {
            if (view != cj0Var.X) {
                org.telegram.ui.Cells.t1 t1Var = cj0Var.Q;
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
