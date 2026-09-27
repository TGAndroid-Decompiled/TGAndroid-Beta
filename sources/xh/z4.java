package xh;

import android.graphics.Canvas;
import android.graphics.PointF;
import androidx.recyclerview.widget.RecyclerView;
import ci.ab;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.yl0;
public final class z4 extends s4.n0 {
    public final PointF f46571a = new PointF();
    public final a5 f46572b;

    public z4(a5 a5Var) {
        this.f46572b = a5Var;
    }

    @Override
    public final void c(Canvas canvas, RecyclerView recyclerView) {
        float f7;
        float f10;
        ab abVar;
        float height = recyclerView.getHeight();
        a5 a5Var = this.f46572b;
        v4 v4Var = a5Var.f46136s0;
        u4 u4Var = a5Var.f46126h0;
        yl0 yl0Var = a5Var.d;
        PointF pointF = this.f46571a;
        if (hh.k.b(u4Var, yl0Var, pointF)) {
            f7 = pointF.x;
            height = Math.min(height, pointF.y);
            f10 = Math.max(0.0f, pointF.y + u4Var.getMeasuredHeight());
        } else {
            f7 = 0.0f;
            f10 = 0.0f;
        }
        if (hh.k.b(v4Var, yl0Var, pointF)) {
            height = Math.min(height, pointF.y);
            f10 = Math.max(f10, pointF.y + v4Var.getMeasuredHeight() + AndroidUtilities.dp(12.0f));
        }
        if (height < f10 && (abVar = u4Var.L) != null) {
            float height2 = (f10 - height) / abVar.getHeight();
            canvas.save();
            canvas.clipRect(0.0f, height, recyclerView.getWidth(), f10);
            canvas.translate(f7, height);
            canvas.scale(height2, height2);
            u4Var.L.draw(canvas);
            canvas.restore();
        }
    }
}
