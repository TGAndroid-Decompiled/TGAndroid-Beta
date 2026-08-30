package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.util.SparseArray;
import android.view.View;
import org.telegram.messenger.SharedConfig;
public final class sg0 implements ng.g {
    public final vg0 f38337a;

    public sg0(vg0 vg0Var) {
        this.f38337a = vg0Var;
    }

    @Override
    public void Y(g.x xVar) {
        vg0 vg0Var = this.f38337a;
        RectF rectF = vg0Var.R;
        xVar.a(vg0Var.getThemedColor(org.telegram.ui.ActionBar.j6.f19906d6));
        xVar.b(SharedConfig.chatBlurEnabled());
        SparseArray sparseArray = vg0Var.f34873a;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            org.telegram.ui.ActionBar.p2 p2Var = ((fh1) sparseArray.valueAt(i10)).f34260a;
            View view = p2Var.fragmentView;
            if (view != null && ug.i.c(view, vg0Var.f34874b, rectF) && rectF.right > 0.0f && rectF.left < vg0Var.fragmentView.getMeasuredWidth() && (p2Var instanceof ug0) && ((ug0) p2Var).y() != null) {
                xVar.c(rectF.left);
                xVar.c(rectF.top);
                xVar.a(p2Var.getClassGuid());
            }
        }
    }

    @Override
    public void k(Canvas canvas) {
        sg.d y10;
        Canvas canvas2;
        vg0 vg0Var = this.f38337a;
        RectF rectF = vg0Var.R;
        int measuredWidth = vg0Var.fragmentView.getMeasuredWidth();
        int measuredHeight = vg0Var.fragmentView.getMeasuredHeight();
        canvas.drawColor(vg0Var.getThemedColor(org.telegram.ui.ActionBar.j6.f19906d6));
        SparseArray sparseArray = vg0Var.f34873a;
        int size = sparseArray.size();
        int i10 = 0;
        while (i10 < size) {
            org.telegram.ui.ActionBar.p2 p2Var = ((fh1) sparseArray.valueAt(i10)).f34260a;
            View view = p2Var.fragmentView;
            if (view == null || !ug.i.c(view, vg0Var.f34874b, rectF) || rectF.right <= 0.0f || rectF.left >= vg0Var.fragmentView.getMeasuredWidth() || !(p2Var instanceof ug0) || (y10 = ((ug0) p2Var).y()) == null) {
                canvas2 = canvas;
            } else {
                canvas.save();
                canvas.translate(rectF.left, rectF.top);
                canvas2 = canvas;
                y10.X(canvas2, 0.0f, 0.0f, measuredWidth, measuredHeight);
                canvas2.restore();
            }
            i10++;
            canvas = canvas2;
        }
    }
}
