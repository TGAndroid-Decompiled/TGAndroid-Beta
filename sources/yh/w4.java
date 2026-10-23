package yh;

import ai.jc;
import android.graphics.Canvas;
import android.graphics.PointF;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.mm0;
public final class w4 extends s4.m0 {
    public final PointF f51036a = new PointF();
    public final x4 f51037b;

    public w4(x4 x4Var) {
        this.f51037b = x4Var;
    }

    @Override
    public final void b(Canvas canvas, RecyclerView recyclerView) {
        float f7;
        jc jcVar;
        float height = recyclerView.getHeight();
        float width = recyclerView.getWidth();
        x4 x4Var = this.f51037b;
        s4 s4Var = x4Var.f51063t0;
        r4 r4Var = x4Var.f51052h0;
        mm0 mm0Var = x4Var.d;
        PointF pointF = this.f51036a;
        float f10 = 0.0f;
        if (ih.k.b(r4Var, mm0Var, pointF)) {
            float f11 = pointF.x;
            height = Math.min(height, pointF.y);
            f10 = Math.max(0.0f, pointF.y + r4Var.getMeasuredHeight());
            f7 = f11;
            width = r4Var.getMeasuredWidth() + f11;
        } else {
            f7 = 0.0f;
        }
        if (ih.k.b(s4Var, mm0Var, pointF)) {
            height = Math.min(height, pointF.y);
            f10 = Math.max(f10, pointF.y + s4Var.getMeasuredHeight() + AndroidUtilities.dp(12.0f));
        }
        if (height < f10 && (jcVar = r4Var.L) != null) {
            float height2 = (f10 - height) / jcVar.getHeight();
            canvas.save();
            canvas.clipRect(f7, height, width, f10);
            canvas.translate(f7, height);
            canvas.scale(height2, height2);
            r4Var.L.draw(canvas);
            canvas.restore();
        }
    }
}
