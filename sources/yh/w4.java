package yh;

import ai.ic;
import android.graphics.Canvas;
import android.graphics.PointF;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.im0;
public final class w4 extends s4.m0 {
    public final PointF f50570a = new PointF();
    public final x4 f50571b;

    public w4(x4 x4Var) {
        this.f50571b = x4Var;
    }

    @Override
    public final void b(Canvas canvas, RecyclerView recyclerView) {
        float f7;
        ic icVar;
        float height = recyclerView.getHeight();
        float width = recyclerView.getWidth();
        x4 x4Var = this.f50571b;
        s4 s4Var = x4Var.f50596s0;
        r4 r4Var = x4Var.f50586h0;
        im0 im0Var = x4Var.d;
        PointF pointF = this.f50570a;
        float f10 = 0.0f;
        if (ih.j.b(r4Var, im0Var, pointF)) {
            float f11 = pointF.x;
            height = Math.min(height, pointF.y);
            f10 = Math.max(0.0f, pointF.y + r4Var.getMeasuredHeight());
            f7 = f11;
            width = r4Var.getMeasuredWidth() + f11;
        } else {
            f7 = 0.0f;
        }
        if (ih.j.b(s4Var, im0Var, pointF)) {
            height = Math.min(height, pointF.y);
            f10 = Math.max(f10, pointF.y + s4Var.getMeasuredHeight() + AndroidUtilities.dp(12.0f));
        }
        if (height < f10 && (icVar = r4Var.L) != null) {
            float height2 = (f10 - height) / icVar.getHeight();
            canvas.save();
            canvas.clipRect(f7, height, width, f10);
            canvas.translate(f7, height);
            canvas.scale(height2, height2);
            r4Var.L.draw(canvas);
            canvas.restore();
        }
    }
}
