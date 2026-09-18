package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class w30 extends org.telegram.ui.Components.wl0 {
    public final i60 X2;

    public w30(i60 i60Var, LaunchActivity launchActivity) {
        super(launchActivity, null);
        this.X2 = i60Var;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        org.telegram.ui.Components.r20 r20Var = (org.telegram.ui.Components.r20) view;
        i60 i60Var = this.X2;
        o50 o50Var = i60Var.Q;
        a40 a40Var = i60Var.a2;
        if (a40Var.f29373r == null && !i60Var.N2.k()) {
            r20Var.setAlpha(1.0f);
            r20Var.setTranslationX(0.0f);
            r20Var.setTranslationY(0.0f);
        }
        w30 w30Var = i60Var.f34377m2;
        r20Var.getClass();
        w30Var.getClass();
        if (RecyclerView.S(r20Var) == -1 && r20Var.getRenderer() != null) {
            return true;
        }
        if (r20Var.getTranslationY() != 0.0f && r20Var.getRenderer() != null && r20Var.getRenderer().f29540c != null) {
            float top = o50Var.getTop() - getTop();
            float measuredHeight = o50Var.getMeasuredHeight() + top;
            float f7 = a40Var.f29356c;
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
