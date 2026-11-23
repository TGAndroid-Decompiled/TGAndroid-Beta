package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class w10 extends org.telegram.ui.Components.ek0 {
    public final e40 f53083f3;

    public w10(e40 e40Var, LaunchActivity launchActivity) {
        super(launchActivity, null);
        this.f53083f3 = e40Var;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        org.telegram.ui.Components.s10 s10Var = (org.telegram.ui.Components.s10) view;
        e40 e40Var = this.f53083f3;
        m30 m30Var = e40Var.L1;
        a20 a20Var = e40Var.Z3;
        if (a20Var.f41023r == null && !e40Var.M4.k()) {
            s10Var.setAlpha(1.0f);
            s10Var.setTranslationX(0.0f);
            s10Var.setTranslationY(0.0f);
        }
        w10 w10Var = e40Var.f47365l4;
        s10Var.getClass();
        w10Var.getClass();
        if (RecyclerView.R(s10Var) == -1 && s10Var.getRenderer() != null) {
            return true;
        }
        if (s10Var.getTranslationY() != 0.0f && s10Var.getRenderer() != null && s10Var.getRenderer().f41361c != null) {
            float top = m30Var.getTop() - getTop();
            float measuredHeight = m30Var.getMeasuredHeight() + top;
            float f10 = a20Var.f41005c;
            canvas.save();
            float f11 = 1.0f - f10;
            canvas.clipRect(0.0f, top * f11, getMeasuredWidth(), (getMeasuredHeight() * f10) + (measuredHeight * f11));
            boolean drawChild = super.drawChild(canvas, view, j3);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j3);
    }
}
