package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.util.SparseArray;
import android.view.View;
import org.telegram.messenger.SharedConfig;
public final class vg0 implements ah.j {
    public final yg0 f38699a;

    public vg0(yg0 yg0Var) {
        this.f38699a = yg0Var;
    }

    @Override
    public void U(ah.a aVar) {
        yg0 yg0Var = this.f38699a;
        RectF rectF = yg0Var.T;
        aVar.a(yg0Var.getThemedColor(org.telegram.ui.ActionBar.h6.f19045d6));
        aVar.b(SharedConfig.chatBlurEnabled());
        SparseArray sparseArray = yg0Var.f38107a;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            org.telegram.ui.ActionBar.m2 m2Var = ((rh1) sparseArray.valueAt(i10)).f37325a;
            View view = m2Var.fragmentView;
            if (view != null && hh.k.c(view, yg0Var.f38108b, rectF) && rectF.right > 0.0f && rectF.left < yg0Var.fragmentView.getMeasuredWidth() && (m2Var instanceof xg0) && ((xg0) m2Var).x() != null) {
                aVar.c(rectF.left);
                aVar.c(rectF.top);
                aVar.a(m2Var.getClassGuid());
            }
        }
    }

    @Override
    public void d(Canvas canvas) {
        fh.d x10;
        Canvas canvas2;
        yg0 yg0Var = this.f38699a;
        RectF rectF = yg0Var.T;
        int measuredWidth = yg0Var.fragmentView.getMeasuredWidth();
        int measuredHeight = yg0Var.fragmentView.getMeasuredHeight();
        canvas.drawColor(yg0Var.getThemedColor(org.telegram.ui.ActionBar.h6.f19045d6));
        SparseArray sparseArray = yg0Var.f38107a;
        int size = sparseArray.size();
        int i10 = 0;
        while (i10 < size) {
            org.telegram.ui.ActionBar.m2 m2Var = ((rh1) sparseArray.valueAt(i10)).f37325a;
            View view = m2Var.fragmentView;
            if (view == null || !hh.k.c(view, yg0Var.f38108b, rectF) || rectF.right <= 0.0f || rectF.left >= yg0Var.fragmentView.getMeasuredWidth() || !(m2Var instanceof xg0) || (x10 = ((xg0) m2Var).x()) == null) {
                canvas2 = canvas;
            } else {
                canvas.save();
                canvas.translate(rectF.left, rectF.top);
                canvas2 = canvas;
                x10.y(canvas2, 0.0f, 0.0f, measuredWidth, measuredHeight);
                canvas2.restore();
            }
            i10++;
            canvas = canvas2;
        }
    }
}
