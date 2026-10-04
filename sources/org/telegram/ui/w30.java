package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class w30 extends org.telegram.ui.Components.zl0 {
    public final h60 f41905e3;

    public w30(h60 h60Var, LaunchActivity launchActivity) {
        super(launchActivity, null);
        this.f41905e3 = h60Var;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        org.telegram.ui.Components.v20 v20Var = (org.telegram.ui.Components.v20) view;
        h60 h60Var = this.f41905e3;
        o50 o50Var = h60Var.Q;
        a40 a40Var = h60Var.a2;
        if (a40Var.f32002r == null && !h60Var.N2.k()) {
            v20Var.setAlpha(1.0f);
            v20Var.setTranslationX(0.0f);
            v20Var.setTranslationY(0.0f);
        }
        w30 w30Var = h60Var.f36928m2;
        v20Var.getClass();
        w30Var.getClass();
        if (RecyclerView.R(v20Var) == -1 && v20Var.getRenderer() != null) {
            return true;
        }
        if (v20Var.getTranslationY() != 0.0f && v20Var.getRenderer() != null && v20Var.getRenderer().f32181c != null) {
            float top = o50Var.getTop() - getTop();
            float measuredHeight = o50Var.getMeasuredHeight() + top;
            float f7 = a40Var.f31984c;
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
