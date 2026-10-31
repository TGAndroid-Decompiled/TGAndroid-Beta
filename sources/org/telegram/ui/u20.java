package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class u20 extends org.telegram.ui.Components.tk0 {
    public final b50 f41992e3;

    public u20(b50 b50Var, LaunchActivity launchActivity) {
        super(launchActivity, null);
        this.f41992e3 = b50Var;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        org.telegram.ui.Components.y10 y10Var = (org.telegram.ui.Components.y10) view;
        b50 b50Var = this.f41992e3;
        i40 i40Var = b50Var.H1;
        y20 y20Var = b50Var.R3;
        if (y20Var.f31731r == null && !b50Var.E4.k()) {
            y10Var.setAlpha(1.0f);
            y10Var.setTranslationX(0.0f);
            y10Var.setTranslationY(0.0f);
        }
        u20 u20Var = b50Var.f36008d4;
        y10Var.getClass();
        u20Var.getClass();
        if (RecyclerView.R(y10Var) == -1 && y10Var.getRenderer() != null) {
            return true;
        }
        if (y10Var.getTranslationY() != 0.0f && y10Var.getRenderer() != null && y10Var.getRenderer().f31604c != null) {
            float top = i40Var.getTop() - getTop();
            float measuredHeight = i40Var.getMeasuredHeight() + top;
            float f7 = y20Var.f31714c;
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
