package sg;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import org.telegram.ui.Cells.y7;
import org.telegram.ui.Components.tj0;
public abstract class d extends tj0 {
    public boolean f54718f3;

    @Override
    public final void J0(Canvas canvas, RectF rectF, long j10) {
        super.J0(canvas, rectF, j10);
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt instanceof c) {
                float x10 = childAt.getX();
                float y9 = childAt.getY();
                if (rectF.intersects(x10, y9, childAt.getWidth() + x10, childAt.getHeight() + y9)) {
                    canvas.save();
                    canvas.translate(x10, y9);
                    y7 y7Var = (y7) ((c) childAt);
                    if (y7Var.M) {
                        y7Var.b(canvas, this);
                    }
                    canvas.restore();
                }
            }
        }
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        this.f54718f3 = false;
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            if (getChildAt(i3) instanceof c) {
                c cVar = (c) getChildAt(i3);
                canvas.save();
                canvas.translate(cVar.getX(), cVar.getY());
                y7 y7Var = (y7) cVar;
                if (y7Var.M) {
                    y7Var.b(canvas, this);
                }
                canvas.restore();
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final void invalidate() {
        if (this.f54718f3) {
            return;
        }
        super.invalidate();
        this.f54718f3 = true;
    }
}
