package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.os.SystemClock;
import android.view.View;
public abstract class tb extends org.telegram.ui.Components.aw0 {
    public final wb f36895w0;

    public tb(wb wbVar, Context context) {
        super(context, null);
        this.f36895w0 = wbVar;
    }

    public final void Z(Canvas canvas, RectF rectF) {
        boolean z10;
        long uptimeMillis = SystemClock.uptimeMillis();
        wb wbVar = this.f36895w0;
        if (wbVar.E.Y0()) {
            canvas.save();
            canvas.clipRect(rectF);
            drawChild(canvas, wbVar.E, uptimeMillis);
            canvas.restore();
            return;
        }
        canvas.save();
        canvas.clipRect(rectF);
        canvas.translate(0.0f, wbVar.E.getY());
        wbVar.E.getClass();
        for (int i10 = 0; i10 < wbVar.E.getChildCount(); i10++) {
            View childAt = wbVar.E.getChildAt(i10);
            RectF rectF2 = wbVar.W0;
            if (rectF != null && wbVar.E != null && childAt != null) {
                rectF2.set(childAt.getX(), wbVar.E.getY() + childAt.getY(), childAt.getX() + childAt.getWidth(), wbVar.E.getY() + childAt.getY() + childAt.getHeight());
                z10 = !rectF2.intersect(rectF);
            } else {
                z10 = false;
            }
            if (!z10) {
                if (childAt instanceof org.telegram.ui.Cells.t1) {
                    canvas.save();
                    canvas.translate(childAt.getX(), childAt.getY());
                    org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) childAt;
                    if (t1Var.C1()) {
                        canvas.save();
                        canvas.translate(0.0f, t1Var.V);
                        t1Var.D1(canvas, true, false);
                        canvas.restore();
                    }
                    canvas.restore();
                    wbVar.E.drawChild(canvas, childAt, uptimeMillis);
                    if (t1Var.U2()) {
                        canvas.save();
                        canvas.translate(t1Var.getX(), t1Var.getY());
                        t1Var.X1(canvas);
                        canvas.restore();
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.w0) {
                    wbVar.E.drawChild(canvas, childAt, uptimeMillis);
                    canvas.save();
                    canvas.translate(childAt.getX(), childAt.getY());
                    ((org.telegram.ui.Cells.w0) childAt).z(canvas);
                    canvas.restore();
                } else {
                    wbVar.E.drawChild(canvas, childAt, uptimeMillis);
                }
            }
        }
        wbVar.E.getClass();
        canvas.restore();
    }

    @Override
    public int[] getColorKeys() {
        return null;
    }
}
