package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
public final class wf0 extends org.telegram.ui.Components.rt0 {
    public final int[] f51411f0;
    public final int[] f51412g0;
    public int f51413h0;
    public final int[] f51414i0;
    public final h6.m f51415j0;
    public final Paint f51416k0;
    public final org.telegram.ui.ActionBar.f6 f51417l0;
    public final bg0 m0;

    public wf0(bg0 bg0Var, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, null);
        this.m0 = bg0Var;
        this.f51417l0 = f6Var;
        this.f51411f0 = new int[2];
        this.f51412g0 = new int[2];
        this.f51413h0 = 0;
        this.f51414i0 = new int[2];
        this.f51415j0 = new h6.m(28);
        org.telegram.ui.Components.xq xqVar = org.telegram.ui.Components.xq.f40310f;
        this.f51416k0 = new Paint(1);
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r35) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.wf0.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        bg0 bg0Var = this.m0;
        if (bg0Var.f44329w) {
            if (view != bg0Var.W) {
                org.telegram.ui.Cells.q1 q1Var = bg0Var.P;
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
