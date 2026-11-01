package sg;

import android.graphics.Canvas;
import android.graphics.RectF;
import org.telegram.ui.Cells.f1;
import org.telegram.ui.Components.nj0;
public final class q extends nj0 {
    public float f48471m1;
    public long f48472n1;

    @Override
    public final void draw(Canvas canvas) {
        long min = Math.min(16L, System.currentTimeMillis() - this.f48472n1);
        this.f48472n1 = System.currentTimeMillis();
        RectF rectF = org.telegram.messenger.i0.P;
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
        canvas.saveLayerAlpha(rectF, (int) (this.f48471m1 * 255.0f), 31);
        super.draw(canvas);
        canvas.restore();
        if (!isEnabled()) {
            float f7 = this.f48471m1;
            if (f7 != 0.0f) {
                this.f48471m1 = f1.v((float) min, 150.0f, f7, 0.0f);
                invalidate();
                if (this.f48471m1 == 0.0f) {
                    setVisibility(8);
                    return;
                }
                return;
            }
        }
        if (isEnabled()) {
            float f10 = this.f48471m1;
            if (f10 != 1.0f) {
                this.f48471m1 = f1.e((float) min, 150.0f, f10, 1.0f);
                invalidate();
            }
        }
    }

    @Override
    public final void setVisibility(int i10) {
        super.setVisibility(i10);
        if (i10 == 8 && this.f48471m1 != 0.0f) {
            this.f48471m1 = 0.0f;
        }
    }
}
