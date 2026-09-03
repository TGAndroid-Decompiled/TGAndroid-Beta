package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class t30 extends org.telegram.ui.Components.rl0 {
    public final e60 U2;

    public t30(e60 e60Var, LaunchActivity launchActivity) {
        super(launchActivity, null);
        this.U2 = e60Var;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        org.telegram.ui.Components.t20 t20Var = (org.telegram.ui.Components.t20) view;
        e60 e60Var = this.U2;
        l50 l50Var = e60Var.N;
        x30 x30Var = e60Var.X1;
        if (x30Var.f29704r == null && !e60Var.K2.k()) {
            t20Var.setAlpha(1.0f);
            t20Var.setTranslationX(0.0f);
            t20Var.setTranslationY(0.0f);
        }
        t30 t30Var = e60Var.f33656j2;
        t20Var.getClass();
        t30Var.getClass();
        if (RecyclerView.R(t20Var) == -1 && t20Var.getRenderer() != null) {
            return true;
        }
        if (t20Var.getTranslationY() != 0.0f && t20Var.getRenderer() != null && t20Var.getRenderer().f29895c != null) {
            float top = l50Var.getTop() - getTop();
            float measuredHeight = l50Var.getMeasuredHeight() + top;
            float f10 = x30Var.f29687c;
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
