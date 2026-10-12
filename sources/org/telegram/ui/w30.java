package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class w30 extends org.telegram.ui.Components.wm0 {
    public final i60 V2;

    public w30(i60 i60Var, LaunchActivity launchActivity) {
        super(launchActivity, null);
        this.V2 = i60Var;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        org.telegram.ui.Components.l30 l30Var = (org.telegram.ui.Components.l30) view;
        i60 i60Var = this.V2;
        o50 o50Var = i60Var.Q;
        a40 a40Var = i60Var.a2;
        if (a40Var.f31819r == null && !i60Var.N2.k()) {
            l30Var.setAlpha(1.0f);
            l30Var.setTranslationX(0.0f);
            l30Var.setTranslationY(0.0f);
        }
        w30 w30Var = i60Var.f38730m2;
        l30Var.getClass();
        w30Var.getClass();
        if (RecyclerView.R(l30Var) == -1 && l30Var.getRenderer() != null) {
            return true;
        }
        if (l30Var.getTranslationY() != 0.0f && l30Var.getRenderer() != null && l30Var.getRenderer().f32000c != null) {
            float top = o50Var.getTop() - getTop();
            float measuredHeight = o50Var.getMeasuredHeight() + top;
            float f7 = a40Var.f31801c;
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
