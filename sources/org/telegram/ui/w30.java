package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class w30 extends org.telegram.ui.Components.ll0 {
    public final j60 X2;

    public w30(j60 j60Var, LaunchActivity launchActivity) {
        super(launchActivity, null);
        this.X2 = j60Var;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        org.telegram.ui.Components.r20 r20Var = (org.telegram.ui.Components.r20) view;
        j60 j60Var = this.X2;
        p50 p50Var = j60Var.Q;
        a40 a40Var = j60Var.a2;
        if (a40Var.f31644r == null && !j60Var.N2.k()) {
            r20Var.setAlpha(1.0f);
            r20Var.setTranslationX(0.0f);
            r20Var.setTranslationY(0.0f);
        }
        w30 w30Var = j60Var.f37589m2;
        r20Var.getClass();
        w30Var.getClass();
        if (RecyclerView.R(r20Var) == -1 && r20Var.getRenderer() != null) {
            return true;
        }
        if (r20Var.getTranslationY() != 0.0f && r20Var.getRenderer() != null && r20Var.getRenderer().f31835c != null) {
            float top = p50Var.getTop() - getTop();
            float measuredHeight = p50Var.getMeasuredHeight() + top;
            float f7 = a40Var.f31626c;
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
