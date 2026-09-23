package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.util.SparseArray;
import android.view.View;
import org.telegram.messenger.SharedConfig;
public final class wg0 implements ah.j {
    public final zg0 f38986a;

    public wg0(zg0 zg0Var) {
        this.f38986a = zg0Var;
    }

    @Override
    public void b(Canvas canvas) {
        fh.d x10;
        Canvas canvas2;
        zg0 zg0Var = this.f38986a;
        RectF rectF = zg0Var.T;
        int measuredWidth = zg0Var.fragmentView.getMeasuredWidth();
        int measuredHeight = zg0Var.fragmentView.getMeasuredHeight();
        canvas.drawColor(zg0Var.getThemedColor(org.telegram.ui.ActionBar.h6.f18789d6));
        SparseArray sparseArray = zg0Var.f37684a;
        int size = sparseArray.size();
        int i10 = 0;
        while (i10 < size) {
            org.telegram.ui.ActionBar.n2 n2Var = ((rh1) sparseArray.valueAt(i10)).f36853a;
            View view = n2Var.fragmentView;
            if (view == null || !hh.k.c(view, zg0Var.f37685b, rectF) || rectF.right <= 0.0f || rectF.left >= zg0Var.fragmentView.getMeasuredWidth() || !(n2Var instanceof yg0) || (x10 = ((yg0) n2Var).x()) == null) {
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

    @Override
    public void m(ah.a aVar) {
        zg0 zg0Var = this.f38986a;
        RectF rectF = zg0Var.T;
        aVar.a(zg0Var.getThemedColor(org.telegram.ui.ActionBar.h6.f18789d6));
        aVar.b(SharedConfig.chatBlurEnabled());
        SparseArray sparseArray = zg0Var.f37684a;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            org.telegram.ui.ActionBar.n2 n2Var = ((rh1) sparseArray.valueAt(i10)).f36853a;
            View view = n2Var.fragmentView;
            if (view != null && hh.k.c(view, zg0Var.f37685b, rectF) && rectF.right > 0.0f && rectF.left < zg0Var.fragmentView.getMeasuredWidth() && (n2Var instanceof yg0) && ((yg0) n2Var).x() != null) {
                aVar.c(rectF.left);
                aVar.c(rectF.top);
                aVar.a(n2Var.getClassGuid());
            }
        }
    }
}
