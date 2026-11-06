package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class v10 extends org.telegram.ui.Components.pj0 {
    public final c40 f50545e3;

    public v10(c40 c40Var, LaunchActivity launchActivity) {
        super(launchActivity, null);
        this.f50545e3 = c40Var;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        org.telegram.ui.Components.g10 g10Var = (org.telegram.ui.Components.g10) view;
        c40 c40Var = this.f50545e3;
        k30 k30Var = c40Var.H1;
        z10 z10Var = c40Var.R3;
        if (z10Var.f39260r == null && !c40Var.E4.k()) {
            g10Var.setAlpha(1.0f);
            g10Var.setTranslationX(0.0f);
            g10Var.setTranslationY(0.0f);
        }
        v10 v10Var = c40Var.f44538d4;
        g10Var.getClass();
        v10Var.getClass();
        if (RecyclerView.R(g10Var) == -1 && g10Var.getRenderer() != null) {
            return true;
        }
        if (g10Var.getTranslationY() != 0.0f && g10Var.getRenderer() != null && g10Var.getRenderer().f39576c != null) {
            float top = k30Var.getTop() - getTop();
            float measuredHeight = k30Var.getMeasuredHeight() + top;
            float f10 = z10Var.f39242c;
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
