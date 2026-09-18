package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
public final class u40 extends rv0 {
    public final k60 T;

    public u40(k60 k60Var, ViewGroup viewGroup, ViewGroup viewGroup2) {
        super(viewGroup, viewGroup2);
        this.T = k60Var;
    }

    @Override
    public final void c(Canvas canvas, float f7, float f10, float f11, float f12, float f13) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        k60 k60Var = this.T;
        e40 e40Var = k60Var.f35019b;
        f40 f40Var = k60Var.C2;
        if (f7 > 0.0f) {
            float x10 = f40Var.getX();
            viewGroup = ((org.telegram.ui.ActionBar.g3) k60Var).containerView;
            float x11 = viewGroup.getX() + x10;
            float y3 = f40Var.getY();
            viewGroup2 = ((org.telegram.ui.ActionBar.g3) k60Var).containerView;
            float y10 = viewGroup2.getY() + y3;
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(x11, y10, e40Var.getMeasuredWidth() + x11, e40Var.getMeasuredHeight() + y10);
            canvas.saveLayerAlpha(rectF, (int) (f7 * 255.0f), 31);
            canvas.translate(x11, y10);
            f40Var.draw(canvas);
            canvas.restore();
        }
    }

    @Override
    public final void e() {
        e40 e40Var = this.T.f35019b;
        super.e();
        for (int i10 = 0; i10 < e40Var.getChildCount(); i10++) {
            e40Var.getChildAt(i10).invalidate();
        }
    }
}
