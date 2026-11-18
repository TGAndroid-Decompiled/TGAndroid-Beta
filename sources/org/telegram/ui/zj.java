package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
public final class zj extends fr0 {
    public zj(ViewGroup viewGroup, ViewGroup viewGroup2) {
        super(viewGroup, viewGroup2);
    }

    @Override
    public final void c(Canvas canvas, float f10, float f11, float f12, float f13, float f14) {
        if (f10 > 0.0f) {
            View view = this.f47753e;
            if (view instanceof org.telegram.ui.Cells.r1) {
                org.telegram.ui.Cells.r1 r1Var = (org.telegram.ui.Cells.r1) view;
                RectF rectF = org.telegram.messenger.g0.P;
                rectF.set(f11, (int) Math.max(f13, f12), r1Var.getMeasuredWidth() + f11, (int) Math.min(f14, r1Var.getMeasuredHeight() + f12));
                canvas.saveLayerAlpha(rectF, (int) (f10 * 255.0f), 31);
                canvas.translate(f11, f12 + r1Var.getPaddingTop());
                r1Var.Mb = true;
                r1Var.j1(canvas);
                if (r1Var.H3() && r1Var.getCurrentMessagesGroup() == null) {
                    r1Var.y1(1.0f, canvas, false);
                }
                r1Var.Mb = false;
                canvas.restore();
            }
        }
    }
}
