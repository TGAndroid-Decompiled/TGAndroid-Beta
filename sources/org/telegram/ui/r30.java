package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class r30 extends org.telegram.ui.Components.yl0 {
    public final d60 X2;

    public r30(d60 d60Var, LaunchActivity launchActivity) {
        super(launchActivity, null);
        this.X2 = d60Var;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        org.telegram.ui.Components.u20 u20Var = (org.telegram.ui.Components.u20) view;
        d60 d60Var = this.X2;
        j50 j50Var = d60Var.Q;
        v30 v30Var = d60Var.a2;
        if (v30Var.f29401r == null && !d60Var.N2.k()) {
            u20Var.setAlpha(1.0f);
            u20Var.setTranslationX(0.0f);
            u20Var.setTranslationY(0.0f);
        }
        r30 r30Var = d60Var.f32983m2;
        u20Var.getClass();
        r30Var.getClass();
        if (RecyclerView.R(u20Var) == -1 && u20Var.getRenderer() != null) {
            return true;
        }
        if (u20Var.getTranslationY() != 0.0f && u20Var.getRenderer() != null && u20Var.getRenderer().f29567c != null) {
            float top = j50Var.getTop() - getTop();
            float measuredHeight = j50Var.getMeasuredHeight() + top;
            float f7 = v30Var.f29384c;
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
