package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class u30 extends org.telegram.ui.Components.qm0 {
    public final g60 V2;

    public u30(g60 g60Var, LaunchActivity launchActivity) {
        super(launchActivity, null);
        this.V2 = g60Var;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        org.telegram.ui.Components.i30 i30Var = (org.telegram.ui.Components.i30) view;
        g60 g60Var = this.V2;
        m50 m50Var = g60Var.Q;
        y30 y30Var = g60Var.a2;
        if (y30Var.f32075r == null && !g60Var.N2.k()) {
            i30Var.setAlpha(1.0f);
            i30Var.setTranslationX(0.0f);
            i30Var.setTranslationY(0.0f);
        }
        u30 u30Var = g60Var.f37836m2;
        i30Var.getClass();
        u30Var.getClass();
        if (RecyclerView.R(i30Var) == -1 && i30Var.getRenderer() != null) {
            return true;
        }
        if (i30Var.getTranslationY() != 0.0f && i30Var.getRenderer() != null && i30Var.getRenderer().f32255c != null) {
            float top = m50Var.getTop() - getTop();
            float measuredHeight = m50Var.getMeasuredHeight() + top;
            float f7 = y30Var.f32057c;
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
