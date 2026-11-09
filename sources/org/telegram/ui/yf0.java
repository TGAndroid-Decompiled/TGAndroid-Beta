package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
public final class yf0 extends org.telegram.ui.Components.tt0 {
    public final int[] f52099f0;
    public final int[] f52100g0;
    public int f52101h0;
    public final int[] f52102i0;
    public final h6.m f52103j0;
    public final Paint f52104k0;
    public final org.telegram.ui.ActionBar.g6 f52105l0;
    public final dg0 m0;

    public yf0(dg0 dg0Var, Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, null);
        this.m0 = dg0Var;
        this.f52105l0 = g6Var;
        this.f52099f0 = new int[2];
        this.f52100g0 = new int[2];
        this.f52101h0 = 0;
        this.f52102i0 = new int[2];
        this.f52103j0 = new h6.m(28);
        org.telegram.ui.Components.xq xqVar = org.telegram.ui.Components.xq.f40458f;
        this.f52104k0 = new Paint(1);
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r35) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.yf0.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        dg0 dg0Var = this.m0;
        if (dg0Var.f44976w) {
            if (view != dg0Var.W) {
                org.telegram.ui.Cells.q1 q1Var = dg0Var.P;
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
