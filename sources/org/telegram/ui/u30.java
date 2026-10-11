package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class u30 extends org.telegram.ui.Components.sm0 {
    public final g60 V2;

    public u30(g60 g60Var, LaunchActivity launchActivity) {
        super(launchActivity, null);
        this.V2 = g60Var;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        org.telegram.ui.Components.j30 j30Var = (org.telegram.ui.Components.j30) view;
        g60 g60Var = this.V2;
        m50 m50Var = g60Var.Q;
        y30 y30Var = g60Var.a2;
        if (y30Var.f32134r == null && !g60Var.N2.k()) {
            j30Var.setAlpha(1.0f);
            j30Var.setTranslationX(0.0f);
            j30Var.setTranslationY(0.0f);
        }
        u30 u30Var = g60Var.f37918m2;
        j30Var.getClass();
        u30Var.getClass();
        if (RecyclerView.R(j30Var) == -1 && j30Var.getRenderer() != null) {
            return true;
        }
        if (j30Var.getTranslationY() != 0.0f && j30Var.getRenderer() != null && j30Var.getRenderer().f32314c != null) {
            float top = m50Var.getTop() - getTop();
            float measuredHeight = m50Var.getMeasuredHeight() + top;
            float f7 = y30Var.f32116c;
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
