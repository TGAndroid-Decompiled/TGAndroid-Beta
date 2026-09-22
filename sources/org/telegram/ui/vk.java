package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
public final class vk extends pv0 {
    public vk(ViewGroup viewGroup, ViewGroup viewGroup2) {
        super(viewGroup, viewGroup2);
    }

    @Override
    public final void c(Canvas canvas, float f7, float f10, float f11, float f12, float f13) {
        if (f7 > 0.0f) {
            View view = this.e;
            if (view instanceof org.telegram.ui.Cells.u1) {
                org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) view;
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(f10, (int) Math.max(f12, f11), u1Var.getMeasuredWidth() + f10, (int) Math.min(f13, u1Var.getMeasuredHeight() + f11));
                canvas.saveLayerAlpha(rectF, (int) (f7 * 255.0f), 31);
                canvas.translate(f10, f11 + u1Var.getPaddingTop());
                u1Var.Ed = true;
                u1Var.Y1(canvas);
                if (u1Var.f4() && u1Var.getCurrentMessagesGroup() == null) {
                    u1Var.m2(1.0f, canvas, false);
                }
                u1Var.Ed = false;
                canvas.restore();
            }
        }
    }
}
