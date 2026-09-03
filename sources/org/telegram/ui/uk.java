package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
public final class uk extends cv0 {
    public uk(ViewGroup viewGroup, ViewGroup viewGroup2) {
        super(viewGroup, viewGroup2);
    }

    @Override
    public final void c(Canvas canvas, float f10, float f11, float f12, float f13, float f14) {
        if (f10 > 0.0f) {
            View view = this.e;
            if (view instanceof org.telegram.ui.Cells.s1) {
                org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) view;
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(f11, (int) Math.max(f13, f12), s1Var.getMeasuredWidth() + f11, (int) Math.min(f14, s1Var.getMeasuredHeight() + f12));
                canvas.saveLayerAlpha(rectF, (int) (f10 * 255.0f), 31);
                canvas.translate(f11, f12 + s1Var.getPaddingTop());
                s1Var.Bd = true;
                s1Var.Y1(canvas);
                if (s1Var.f4() && s1Var.getCurrentMessagesGroup() == null) {
                    s1Var.m2(1.0f, canvas, false);
                }
                s1Var.Bd = false;
                canvas.restore();
            }
        }
    }
}
