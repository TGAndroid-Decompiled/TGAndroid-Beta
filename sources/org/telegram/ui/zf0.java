package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
public final class zf0 extends org.telegram.ui.Components.st0 {
    public final int[] f52449f0;
    public final int[] f52450g0;
    public int f52451h0;
    public final int[] f52452i0;
    public final h6.m f52453j0;
    public final Paint f52454k0;
    public final org.telegram.ui.ActionBar.h6 f52455l0;
    public final eg0 m0;

    public zf0(eg0 eg0Var, Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context, null);
        this.m0 = eg0Var;
        this.f52455l0 = h6Var;
        this.f52449f0 = new int[2];
        this.f52450g0 = new int[2];
        this.f52451h0 = 0;
        this.f52452i0 = new int[2];
        this.f52453j0 = new h6.m(28);
        org.telegram.ui.Components.wq wqVar = org.telegram.ui.Components.wq.f40046f;
        this.f52454k0 = new Paint(1);
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r35) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.zf0.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        eg0 eg0Var = this.m0;
        if (eg0Var.f45297w) {
            if (view != eg0Var.W) {
                org.telegram.ui.Cells.q1 q1Var = eg0Var.P;
                if (view == q1Var && q1Var != null && q1Var.getCurrentPosition() == null) {
                    return false;
                }
            } else {
                return false;
            }
        }
        return super.drawChild(canvas, view, j3);
    }
}
