package yh;

import ai.ic;
import android.graphics.Canvas;
import android.graphics.PointF;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.im0;
public final class x4 extends s4.m0 {
    public final PointF f50629a = new PointF();
    public final y4 f50630b;

    public x4(y4 y4Var) {
        this.f50630b = y4Var;
    }

    @Override
    public final void b(Canvas canvas, RecyclerView recyclerView) {
        float f7;
        float f10;
        ic icVar;
        float height = recyclerView.getHeight();
        y4 y4Var = this.f50630b;
        t4 t4Var = y4Var.f50655s0;
        s4 s4Var = y4Var.f50645h0;
        im0 im0Var = y4Var.d;
        PointF pointF = this.f50629a;
        if (ih.j.b(s4Var, im0Var, pointF)) {
            f7 = pointF.x;
            height = Math.min(height, pointF.y);
            f10 = Math.max(0.0f, pointF.y + s4Var.getMeasuredHeight());
        } else {
            f7 = 0.0f;
            f10 = 0.0f;
        }
        if (ih.j.b(t4Var, im0Var, pointF)) {
            height = Math.min(height, pointF.y);
            f10 = Math.max(f10, pointF.y + t4Var.getMeasuredHeight() + AndroidUtilities.dp(12.0f));
        }
        if (height < f10 && (icVar = s4Var.L) != null) {
            float height2 = (f10 - height) / icVar.getHeight();
            canvas.save();
            canvas.clipRect(0.0f, height, recyclerView.getWidth(), f10);
            canvas.translate(f7, height);
            canvas.scale(height2, height2);
            s4Var.L.draw(canvas);
            canvas.restore();
        }
    }
}
