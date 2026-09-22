package xh;

import android.graphics.Canvas;
import android.graphics.PointF;
import androidx.recyclerview.widget.RecyclerView;
import ci.eb;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.yl0;
public final class y4 extends s4.n0 {
    public final PointF f46536a = new PointF();
    public final z4 f46537b;

    public y4(z4 z4Var) {
        this.f46537b = z4Var;
    }

    @Override
    public final void c(Canvas canvas, RecyclerView recyclerView) {
        float f7;
        float f10;
        eb ebVar;
        float height = recyclerView.getHeight();
        z4 z4Var = this.f46537b;
        u4 u4Var = z4Var.f46564s0;
        t4 t4Var = z4Var.f46554h0;
        yl0 yl0Var = z4Var.d;
        PointF pointF = this.f46536a;
        if (hh.k.b(t4Var, yl0Var, pointF)) {
            f7 = pointF.x;
            height = Math.min(height, pointF.y);
            f10 = Math.max(0.0f, pointF.y + t4Var.getMeasuredHeight());
        } else {
            f7 = 0.0f;
            f10 = 0.0f;
        }
        if (hh.k.b(u4Var, yl0Var, pointF)) {
            height = Math.min(height, pointF.y);
            f10 = Math.max(f10, pointF.y + u4Var.getMeasuredHeight() + AndroidUtilities.dp(12.0f));
        }
        if (height < f10 && (ebVar = t4Var.L) != null) {
            float height2 = (f10 - height) / ebVar.getHeight();
            canvas.save();
            canvas.clipRect(0.0f, height, recyclerView.getWidth(), f10);
            canvas.translate(f7, height);
            canvas.scale(height2, height2);
            t4Var.L.draw(canvas);
            canvas.restore();
        }
    }
}
