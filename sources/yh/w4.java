package yh;

import android.graphics.Canvas;
import android.graphics.PointF;
import androidx.recyclerview.widget.RecyclerView;
import di.ab;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.mm0;
public final class w4 extends s4.m0 {
    public final PointF f49188a = new PointF();
    public final x4 f49189b;

    public w4(x4 x4Var) {
        this.f49189b = x4Var;
    }

    @Override
    public final void b(Canvas canvas, RecyclerView recyclerView) {
        float f7;
        float f10;
        ab abVar;
        float height = recyclerView.getHeight();
        x4 x4Var = this.f49189b;
        s4 s4Var = x4Var.f49216s0;
        r4 r4Var = x4Var.f49206h0;
        mm0 mm0Var = x4Var.d;
        PointF pointF = this.f49188a;
        if (ih.j.b(r4Var, mm0Var, pointF)) {
            f7 = pointF.x;
            height = Math.min(height, pointF.y);
            f10 = Math.max(0.0f, pointF.y + r4Var.getMeasuredHeight());
        } else {
            f7 = 0.0f;
            f10 = 0.0f;
        }
        if (ih.j.b(s4Var, mm0Var, pointF)) {
            height = Math.min(height, pointF.y);
            f10 = Math.max(f10, pointF.y + s4Var.getMeasuredHeight() + AndroidUtilities.dp(12.0f));
        }
        if (height < f10 && (abVar = r4Var.L) != null) {
            float height2 = (f10 - height) / abVar.getHeight();
            canvas.save();
            canvas.clipRect(0.0f, height, recyclerView.getWidth(), f10);
            canvas.translate(f7, height);
            canvas.scale(height2, height2);
            r4Var.L.draw(canvas);
            canvas.restore();
        }
    }
}
