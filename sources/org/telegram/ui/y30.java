package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class y30 extends org.telegram.ui.Components.ml0 {
    public final k60 X2;

    public y30(k60 k60Var, LaunchActivity launchActivity) {
        super(launchActivity, null);
        this.X2 = k60Var;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        org.telegram.ui.Components.r20 r20Var = (org.telegram.ui.Components.r20) view;
        k60 k60Var = this.X2;
        q50 q50Var = k60Var.Q;
        c40 c40Var = k60Var.a2;
        if (c40Var.f29057r == null && !k60Var.N2.k()) {
            r20Var.setAlpha(1.0f);
            r20Var.setTranslationX(0.0f);
            r20Var.setTranslationY(0.0f);
        }
        y30 y30Var = k60Var.f35065m2;
        r20Var.getClass();
        y30Var.getClass();
        if (RecyclerView.S(r20Var) == -1 && r20Var.getRenderer() != null) {
            return true;
        }
        if (r20Var.getTranslationY() != 0.0f && r20Var.getRenderer() != null && r20Var.getRenderer().f29224c != null) {
            float top = q50Var.getTop() - getTop();
            float measuredHeight = q50Var.getMeasuredHeight() + top;
            float f7 = c40Var.f29040c;
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
