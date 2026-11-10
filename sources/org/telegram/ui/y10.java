package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class y10 extends org.telegram.ui.Components.pj0 {
    public final f40 f51869e3;

    public y10(f40 f40Var, LaunchActivity launchActivity) {
        super(launchActivity, null);
        this.f51869e3 = f40Var;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        org.telegram.ui.Components.g10 g10Var = (org.telegram.ui.Components.g10) view;
        f40 f40Var = this.f51869e3;
        n30 n30Var = f40Var.K1;
        c20 c20Var = f40Var.U3;
        if (c20Var.f39322r == null && !f40Var.H4.k()) {
            g10Var.setAlpha(1.0f);
            g10Var.setTranslationX(0.0f);
            g10Var.setTranslationY(0.0f);
        }
        y10 y10Var = f40Var.f45529g4;
        g10Var.getClass();
        y10Var.getClass();
        if (RecyclerView.R(g10Var) == -1 && g10Var.getRenderer() != null) {
            return true;
        }
        if (g10Var.getTranslationY() != 0.0f && g10Var.getRenderer() != null && g10Var.getRenderer().f39640c != null) {
            float top = n30Var.getTop() - getTop();
            float measuredHeight = n30Var.getMeasuredHeight() + top;
            float f10 = c20Var.f39304c;
            canvas.save();
            float f11 = 1.0f - f10;
            canvas.clipRect(0.0f, top * f11, getMeasuredWidth(), (getMeasuredHeight() * f10) + (measuredHeight * f11));
            boolean drawChild = super.drawChild(canvas, view, j3);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j3);
    }
}
