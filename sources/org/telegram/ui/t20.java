package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class t20 extends org.telegram.ui.Components.uk0 {
    public final a50 f41516e3;

    public t20(a50 a50Var, LaunchActivity launchActivity) {
        super(launchActivity, null);
        this.f41516e3 = a50Var;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        org.telegram.ui.Components.y10 y10Var = (org.telegram.ui.Components.y10) view;
        a50 a50Var = this.f41516e3;
        h40 h40Var = a50Var.H1;
        x20 x20Var = a50Var.R3;
        if (x20Var.f31811r == null && !a50Var.E4.k()) {
            y10Var.setAlpha(1.0f);
            y10Var.setTranslationX(0.0f);
            y10Var.setTranslationY(0.0f);
        }
        t20 t20Var = a50Var.f35592d4;
        y10Var.getClass();
        t20Var.getClass();
        if (RecyclerView.R(y10Var) == -1 && y10Var.getRenderer() != null) {
            return true;
        }
        if (y10Var.getTranslationY() != 0.0f && y10Var.getRenderer() != null && y10Var.getRenderer().f31667c != null) {
            float top = h40Var.getTop() - getTop();
            float measuredHeight = h40Var.getMeasuredHeight() + top;
            float f7 = x20Var.f31794c;
            canvas.save();
            float f10 = 1.0f - f7;
            canvas.clipRect(0.0f, top * f10, getMeasuredWidth(), (getMeasuredHeight() * f7) + (measuredHeight * f10));
            boolean drawChild = super.drawChild(canvas, view, j10);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j10);
    }
}
