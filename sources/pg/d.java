package pg;

import android.graphics.Canvas;
import org.telegram.ui.Cells.f8;
import org.telegram.ui.Components.ll0;
public abstract class d extends ll0 {
    public boolean X2;

    @Override
    public final void dispatchDraw(Canvas canvas) {
        this.X2 = false;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            if (getChildAt(i10) instanceof c) {
                c cVar = (c) getChildAt(i10);
                canvas.save();
                canvas.translate(cVar.getX(), cVar.getY());
                f8 f8Var = (f8) cVar;
                if (f8Var.L) {
                    f8Var.b(canvas, this);
                }
                canvas.restore();
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final void invalidate() {
        if (this.X2) {
            return;
        }
        super.invalidate();
        this.X2 = true;
    }
}
