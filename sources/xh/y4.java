package xh;

import android.graphics.Canvas;
import android.graphics.PointF;
import androidx.recyclerview.widget.RecyclerView;
import ci.bb;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ml0;
public final class y4 extends s4.n0 {
    public final PointF f46167a = new PointF();
    public final z4 f46168b;

    public y4(z4 z4Var) {
        this.f46168b = z4Var;
    }

    @Override
    public final void c(Canvas canvas, RecyclerView recyclerView) {
        float f7;
        float f10;
        bb bbVar;
        float height = recyclerView.getHeight();
        z4 z4Var = this.f46168b;
        u4 u4Var = z4Var.f46195s0;
        t4 t4Var = z4Var.f46185h0;
        ml0 ml0Var = z4Var.d;
        PointF pointF = this.f46167a;
        if (hh.k.b(t4Var, ml0Var, pointF)) {
            f7 = pointF.x;
            height = Math.min(height, pointF.y);
            f10 = Math.max(0.0f, pointF.y + t4Var.getMeasuredHeight());
        } else {
            f7 = 0.0f;
            f10 = 0.0f;
        }
        if (hh.k.b(u4Var, ml0Var, pointF)) {
            height = Math.min(height, pointF.y);
            f10 = Math.max(f10, pointF.y + u4Var.getMeasuredHeight() + AndroidUtilities.dp(12.0f));
        }
        if (height < f10 && (bbVar = t4Var.L) != null) {
            float height2 = (f10 - height) / bbVar.getHeight();
            canvas.save();
            canvas.clipRect(0.0f, height, recyclerView.getWidth(), f10);
            canvas.translate(f7, height);
            canvas.scale(height2, height2);
            t4Var.L.draw(canvas);
            canvas.restore();
        }
    }
}
