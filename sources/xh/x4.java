package xh;

import android.graphics.Canvas;
import android.graphics.PointF;
import androidx.recyclerview.widget.RecyclerView;
import ci.bb;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.wm0;
public final class x4 extends s4.o0 {
    public final PointF f51833a = new PointF();
    public final y4 f51834b;

    public x4(y4 y4Var) {
        this.f51834b = y4Var;
    }

    @Override
    public final void c(Canvas canvas, RecyclerView recyclerView) {
        float f7;
        float f10;
        bb bbVar;
        float height = recyclerView.getHeight();
        y4 y4Var = this.f51834b;
        t4 t4Var = y4Var.f51861s0;
        s4 s4Var = y4Var.f51851h0;
        wm0 wm0Var = y4Var.d;
        PointF pointF = this.f51833a;
        if (hh.j.b(s4Var, wm0Var, pointF)) {
            f7 = pointF.x;
            height = Math.min(height, pointF.y);
            f10 = Math.max(0.0f, pointF.y + s4Var.getMeasuredHeight());
        } else {
            f7 = 0.0f;
            f10 = 0.0f;
        }
        if (hh.j.b(t4Var, wm0Var, pointF)) {
            height = Math.min(height, pointF.y);
            f10 = Math.max(f10, pointF.y + t4Var.getMeasuredHeight() + AndroidUtilities.dp(12.0f));
        }
        if (height < f10 && (bbVar = s4Var.L) != null) {
            float height2 = (f10 - height) / bbVar.getHeight();
            canvas.save();
            canvas.clipRect(0.0f, height, recyclerView.getWidth(), f10);
            canvas.translate(f7, height);
            canvas.scale(height2, height2);
            s4Var.L.draw(canvas);
            canvas.restore();
        }
    }
}
