package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class s30 extends org.telegram.ui.Components.sl0 {
    public final d60 U2;

    public s30(d60 d60Var, LaunchActivity launchActivity) {
        super(launchActivity, null);
        this.U2 = d60Var;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        org.telegram.ui.Components.t20 t20Var = (org.telegram.ui.Components.t20) view;
        d60 d60Var = this.U2;
        k50 k50Var = d60Var.N;
        w30 w30Var = d60Var.X1;
        if (w30Var.f32165r == null && !d60Var.K2.k()) {
            t20Var.setAlpha(1.0f);
            t20Var.setTranslationX(0.0f);
            t20Var.setTranslationY(0.0f);
        }
        s30 s30Var = d60Var.f36030j2;
        t20Var.getClass();
        s30Var.getClass();
        if (RecyclerView.R(t20Var) == -1 && t20Var.getRenderer() != null) {
            return true;
        }
        if (t20Var.getTranslationY() != 0.0f && t20Var.getRenderer() != null && t20Var.getRenderer().f32369c != null) {
            float top = k50Var.getTop() - getTop();
            float measuredHeight = k50Var.getMeasuredHeight() + top;
            float f10 = w30Var.f32147c;
            canvas.save();
            float f11 = 1.0f - f10;
            canvas.clipRect(0.0f, top * f11, getMeasuredWidth(), (getMeasuredHeight() * f10) + (measuredHeight * f11));
            boolean drawChild = super.drawChild(canvas, view, j10);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j10);
    }
}
