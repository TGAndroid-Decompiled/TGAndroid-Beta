package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class x10 extends org.telegram.ui.Components.qj0 {
    public final e40 f51529e3;

    public x10(e40 e40Var, LaunchActivity launchActivity) {
        super(launchActivity, null);
        this.f51529e3 = e40Var;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        org.telegram.ui.Components.h10 h10Var = (org.telegram.ui.Components.h10) view;
        e40 e40Var = this.f51529e3;
        m30 m30Var = e40Var.H1;
        b20 b20Var = e40Var.R3;
        if (b20Var.f39402r == null && !e40Var.E4.k()) {
            h10Var.setAlpha(1.0f);
            h10Var.setTranslationX(0.0f);
            h10Var.setTranslationY(0.0f);
        }
        x10 x10Var = e40Var.f45201d4;
        h10Var.getClass();
        x10Var.getClass();
        if (RecyclerView.R(h10Var) == -1 && h10Var.getRenderer() != null) {
            return true;
        }
        if (h10Var.getTranslationY() != 0.0f && h10Var.getRenderer() != null && h10Var.getRenderer().f39718c != null) {
            float top = m30Var.getTop() - getTop();
            float measuredHeight = m30Var.getMeasuredHeight() + top;
            float f10 = b20Var.f39384c;
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
