package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class u30 extends org.telegram.ui.Components.yl0 {
    public final g60 X2;

    public u30(g60 g60Var, LaunchActivity launchActivity) {
        super(launchActivity, null);
        this.X2 = g60Var;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        org.telegram.ui.Components.u20 u20Var = (org.telegram.ui.Components.u20) view;
        g60 g60Var = this.X2;
        m50 m50Var = g60Var.Q;
        y30 y30Var = g60Var.a2;
        if (y30Var.f29423r == null && !g60Var.N2.k()) {
            u20Var.setAlpha(1.0f);
            u20Var.setTranslationX(0.0f);
            u20Var.setTranslationY(0.0f);
        }
        u30 u30Var = g60Var.f33774m2;
        u20Var.getClass();
        u30Var.getClass();
        if (RecyclerView.S(u20Var) == -1 && u20Var.getRenderer() != null) {
            return true;
        }
        if (u20Var.getTranslationY() != 0.0f && u20Var.getRenderer() != null && u20Var.getRenderer().f29589c != null) {
            float top = m50Var.getTop() - getTop();
            float measuredHeight = m50Var.getMeasuredHeight() + top;
            float f7 = y30Var.f29406c;
            canvas.save();
            float f10 = 1.0f - f7;
            canvas.clipRect(0.0f, top * f10, getMeasuredWidth(), (getMeasuredHeight() * f7) + (measuredHeight * f10));
            boolean drawChild = super.drawChild(canvas, view, j3);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j3);
    }
}
