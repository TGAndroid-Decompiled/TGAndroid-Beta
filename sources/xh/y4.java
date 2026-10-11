package xh;

import android.graphics.Canvas;
import android.graphics.PointF;
import androidx.recyclerview.widget.RecyclerView;
import ci.bb;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.rm0;
public final class y4 extends s4.o0 {
    public final PointF f51737a = new PointF();
    public final z4 f51738b;

    public y4(z4 z4Var) {
        this.f51738b = z4Var;
    }

    @Override
    public final void c(Canvas canvas, RecyclerView recyclerView) {
        float f7;
        float f10;
        bb bbVar;
        float height = recyclerView.getHeight();
        z4 z4Var = this.f51738b;
        u4 u4Var = z4Var.f51762s0;
        t4 t4Var = z4Var.f51752h0;
        rm0 rm0Var = z4Var.d;
        PointF pointF = this.f51737a;
        if (hh.j.b(t4Var, rm0Var, pointF)) {
            f7 = pointF.x;
            height = Math.min(height, pointF.y);
            f10 = Math.max(0.0f, pointF.y + t4Var.getMeasuredHeight());
        } else {
            f7 = 0.0f;
            f10 = 0.0f;
        }
        if (hh.j.b(u4Var, rm0Var, pointF)) {
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
