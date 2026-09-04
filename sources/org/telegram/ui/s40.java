package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
public final class s40 extends ov0 {
    public final j60 T;

    public s40(j60 j60Var, ViewGroup viewGroup, ViewGroup viewGroup2) {
        super(viewGroup, viewGroup2);
        this.T = j60Var;
    }

    @Override
    public final void c(Canvas canvas, float f7, float f10, float f11, float f12, float f13) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        j60 j60Var = this.T;
        c40 c40Var = j60Var.f37515b;
        d40 d40Var = j60Var.C2;
        if (f7 > 0.0f) {
            float x10 = d40Var.getX();
            viewGroup = ((org.telegram.ui.ActionBar.f3) j60Var).containerView;
            float x11 = viewGroup.getX() + x10;
            float y3 = d40Var.getY();
            viewGroup2 = ((org.telegram.ui.ActionBar.f3) j60Var).containerView;
            float y10 = viewGroup2.getY() + y3;
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(x11, y10, c40Var.getMeasuredWidth() + x11, c40Var.getMeasuredHeight() + y10);
            canvas.saveLayerAlpha(rectF, (int) (f7 * 255.0f), 31);
            canvas.translate(x11, y10);
            d40Var.draw(canvas);
            canvas.restore();
        }
    }

    @Override
    public final void e() {
        c40 c40Var = this.T.f37515b;
        super.e();
        for (int i10 = 0; i10 < c40Var.getChildCount(); i10++) {
            c40Var.getChildAt(i10).invalidate();
        }
    }
}
