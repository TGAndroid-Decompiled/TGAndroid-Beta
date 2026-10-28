package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.os.SystemClock;
import android.view.View;
public abstract class tb extends org.telegram.ui.Components.ww0 {
    public final wb f43590l0;

    public tb(wb wbVar, Context context) {
        super(context, null);
        this.f43590l0 = wbVar;
    }

    public final void X(Canvas canvas, RectF rectF) {
        boolean z10;
        long uptimeMillis = SystemClock.uptimeMillis();
        wb wbVar = this.f43590l0;
        if (wbVar.v.Z0()) {
            canvas.save();
            canvas.clipRect(rectF);
            drawChild(canvas, wbVar.v, uptimeMillis);
            canvas.restore();
            return;
        }
        canvas.save();
        canvas.clipRect(rectF);
        canvas.translate(0.0f, wbVar.v.getY());
        wbVar.v.getClass();
        for (int i10 = 0; i10 < wbVar.v.getChildCount(); i10++) {
            View childAt = wbVar.v.getChildAt(i10);
            RectF rectF2 = wbVar.P0;
            if (rectF != null && wbVar.v != null && childAt != null) {
                rectF2.set(childAt.getX(), wbVar.v.getY() + childAt.getY(), childAt.getX() + childAt.getWidth(), wbVar.v.getY() + childAt.getY() + childAt.getHeight());
                z10 = !rectF2.intersect(rectF);
            } else {
                z10 = false;
            }
            if (!z10) {
                if (childAt instanceof org.telegram.ui.Cells.s1) {
                    canvas.save();
                    canvas.translate(childAt.getX(), childAt.getY());
                    org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) childAt;
                    if (s1Var.C1()) {
                        canvas.save();
                        canvas.translate(0.0f, s1Var.V);
                        s1Var.D1(canvas, true, false);
                        canvas.restore();
                    }
                    canvas.restore();
                    wbVar.v.drawChild(canvas, childAt, uptimeMillis);
                    if (s1Var.U2()) {
                        canvas.save();
                        canvas.translate(s1Var.getX(), s1Var.getY());
                        s1Var.X1(canvas);
                        canvas.restore();
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.v0) {
                    wbVar.v.drawChild(canvas, childAt, uptimeMillis);
                    canvas.save();
                    canvas.translate(childAt.getX(), childAt.getY());
                    ((org.telegram.ui.Cells.v0) childAt).A(canvas);
                    canvas.restore();
                } else {
                    wbVar.v.drawChild(canvas, childAt, uptimeMillis);
                }
            }
        }
        wbVar.v.getClass();
        canvas.restore();
    }
}
