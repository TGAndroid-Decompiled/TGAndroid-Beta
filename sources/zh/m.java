package zh;

import android.graphics.Canvas;
import org.telegram.ui.Components.im0;
public final class m extends im0 {
    public z V2;
    public y W2;

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        int i10;
        if (this.W2 != null) {
            canvas2 = canvas;
            i10 = canvas2.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), null);
        } else {
            canvas2 = canvas;
            i10 = -1;
        }
        z zVar = this.V2;
        if (zVar != null) {
            zVar.accept(canvas2);
        }
        super.dispatchDraw(canvas2);
        y yVar = this.W2;
        if (yVar != null) {
            yVar.accept(canvas2);
            canvas2.restoreToCount(i10);
        }
    }
}
