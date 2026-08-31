package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.util.SparseArray;
import android.view.View;
import org.telegram.messenger.SharedConfig;
public final class tg0 implements og.g {
    public final wg0 f41614a;

    public tg0(wg0 wg0Var) {
        this.f41614a = wg0Var;
    }

    @Override
    public void P(g.x xVar) {
        wg0 wg0Var = this.f41614a;
        RectF rectF = wg0Var.R;
        xVar.a(wg0Var.getThemedColor(org.telegram.ui.ActionBar.k6.f21659d6));
        xVar.b(SharedConfig.chatBlurEnabled());
        SparseArray sparseArray = wg0Var.f38156a;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            org.telegram.ui.ActionBar.p2 p2Var = ((hh1) sparseArray.valueAt(i10)).f37508a;
            View view = p2Var.fragmentView;
            if (view != null && vg.i.c(view, wg0Var.f38157b, rectF) && rectF.right > 0.0f && rectF.left < wg0Var.fragmentView.getMeasuredWidth() && (p2Var instanceof vg0) && ((vg0) p2Var).y() != null) {
                xVar.c(rectF.left);
                xVar.c(rectF.top);
                xVar.a(p2Var.getClassGuid());
            }
        }
    }

    @Override
    public void i(Canvas canvas) {
        tg.d y10;
        Canvas canvas2;
        wg0 wg0Var = this.f41614a;
        RectF rectF = wg0Var.R;
        int measuredWidth = wg0Var.fragmentView.getMeasuredWidth();
        int measuredHeight = wg0Var.fragmentView.getMeasuredHeight();
        canvas.drawColor(wg0Var.getThemedColor(org.telegram.ui.ActionBar.k6.f21659d6));
        SparseArray sparseArray = wg0Var.f38156a;
        int size = sparseArray.size();
        int i10 = 0;
        while (i10 < size) {
            org.telegram.ui.ActionBar.p2 p2Var = ((hh1) sparseArray.valueAt(i10)).f37508a;
            View view = p2Var.fragmentView;
            if (view == null || !vg.i.c(view, wg0Var.f38157b, rectF) || rectF.right <= 0.0f || rectF.left >= wg0Var.fragmentView.getMeasuredWidth() || !(p2Var instanceof vg0) || (y10 = ((vg0) p2Var).y()) == null) {
                canvas2 = canvas;
            } else {
                canvas.save();
                canvas.translate(rectF.left, rectF.top);
                canvas2 = canvas;
                y10.I(canvas2, 0.0f, 0.0f, measuredWidth, measuredHeight);
                canvas2.restore();
            }
            i10++;
            canvas = canvas2;
        }
    }
}
