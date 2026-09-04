package yh;

import android.graphics.Canvas;
import android.graphics.PointF;
import androidx.recyclerview.widget.RecyclerView;
import di.eb;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ll0;
public final class w4 extends s4.n0 {
    public final PointF f50620a = new PointF();
    public final x4 f50621b;

    public w4(x4 x4Var) {
        this.f50621b = x4Var;
    }

    @Override
    public final void b(Canvas canvas, RecyclerView recyclerView) {
        float f7;
        float f10;
        eb ebVar;
        float height = recyclerView.getHeight();
        x4 x4Var = this.f50621b;
        s4 s4Var = x4Var.f50645s0;
        r4 r4Var = x4Var.f50635h0;
        ll0 ll0Var = x4Var.d;
        PointF pointF = this.f50620a;
        if (ih.k.b(r4Var, ll0Var, pointF)) {
            f7 = pointF.x;
            height = Math.min(height, pointF.y);
            f10 = Math.max(0.0f, pointF.y + r4Var.getMeasuredHeight());
        } else {
            f7 = 0.0f;
            f10 = 0.0f;
        }
        if (ih.k.b(s4Var, ll0Var, pointF)) {
            height = Math.min(height, pointF.y);
            f10 = Math.max(f10, pointF.y + s4Var.getMeasuredHeight() + AndroidUtilities.dp(12.0f));
        }
        if (height < f10 && (ebVar = r4Var.L) != null) {
            float height2 = (f10 - height) / ebVar.getHeight();
            canvas.save();
            canvas.clipRect(0.0f, height, recyclerView.getWidth(), f10);
            canvas.translate(f7, height);
            canvas.scale(height2, height2);
            r4Var.L.draw(canvas);
            canvas.restore();
        }
    }
}
