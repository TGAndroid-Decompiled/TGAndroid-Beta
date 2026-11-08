package rg;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import org.telegram.ui.Cells.z7;
import org.telegram.ui.Components.pj0;
public abstract class d extends pj0 {
    public boolean f54534e3;

    @Override
    public final void J0(Canvas canvas, RectF rectF, long j3) {
        super.J0(canvas, rectF, j3);
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt instanceof c) {
                float x10 = childAt.getX();
                float y10 = childAt.getY();
                if (rectF.intersects(x10, y10, childAt.getWidth() + x10, childAt.getHeight() + y10)) {
                    canvas.save();
                    canvas.translate(x10, y10);
                    z7 z7Var = (z7) ((c) childAt);
                    if (z7Var.L) {
                        z7Var.b(canvas, this);
                    }
                    canvas.restore();
                }
            }
        }
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        this.f54534e3 = false;
        for (int i7 = 0; i7 < getChildCount(); i7++) {
            if (getChildAt(i7) instanceof c) {
                c cVar = (c) getChildAt(i7);
                canvas.save();
                canvas.translate(cVar.getX(), cVar.getY());
                z7 z7Var = (z7) cVar;
                if (z7Var.L) {
                    z7Var.b(canvas, this);
                }
                canvas.restore();
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final void invalidate() {
        if (this.f54534e3) {
            return;
        }
        super.invalidate();
        this.f54534e3 = true;
    }
}
