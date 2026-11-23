package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class x10 extends org.telegram.ui.Components.ek0 {
    public final f40 f53505f3;

    public x10(f40 f40Var, LaunchActivity launchActivity) {
        super(launchActivity, null);
        this.f53505f3 = f40Var;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        org.telegram.ui.Components.u10 u10Var = (org.telegram.ui.Components.u10) view;
        f40 f40Var = this.f53505f3;
        n30 n30Var = f40Var.L1;
        b20 b20Var = f40Var.Z3;
        if (b20Var.f41091r == null && !f40Var.M4.k()) {
            u10Var.setAlpha(1.0f);
            u10Var.setTranslationX(0.0f);
            u10Var.setTranslationY(0.0f);
        }
        x10 x10Var = f40Var.f47477l4;
        u10Var.getClass();
        x10Var.getClass();
        if (RecyclerView.R(u10Var) == -1 && u10Var.getRenderer() != null) {
            return true;
        }
        if (u10Var.getTranslationY() != 0.0f && u10Var.getRenderer() != null && u10Var.getRenderer().f41427c != null) {
            float top = n30Var.getTop() - getTop();
            float measuredHeight = n30Var.getMeasuredHeight() + top;
            float f10 = b20Var.f41073c;
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
