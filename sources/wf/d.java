package wf;

import android.graphics.Canvas;
import org.telegram.ui.Cells.d8;
import org.telegram.ui.Components.wk0;
public abstract class d extends wk0 {
    public boolean T2;

    @Override
    public final void dispatchDraw(Canvas canvas) {
        this.T2 = false;
        for (int i9 = 0; i9 < getChildCount(); i9++) {
            if (getChildAt(i9) instanceof c) {
                c cVar = (c) getChildAt(i9);
                canvas.save();
                canvas.translate(cVar.getX(), cVar.getY());
                d8 d8Var = (d8) cVar;
                if (d8Var.H) {
                    d8Var.b(canvas, this);
                }
                canvas.restore();
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final void invalidate() {
        if (this.T2) {
            return;
        }
        super.invalidate();
        this.T2 = true;
    }
}
