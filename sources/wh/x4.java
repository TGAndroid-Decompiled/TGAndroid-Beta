package wh;

import android.graphics.Canvas;
import android.graphics.PointF;
import androidx.recyclerview.widget.RecyclerView;
import bi.nc;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.vl0;
public final class x4 extends s4.n0 {
    public final PointF f44431a = new PointF();
    public final y4 f44432b;

    public x4(y4 y4Var) {
        this.f44432b = y4Var;
    }

    @Override
    public final void b(Canvas canvas, RecyclerView recyclerView) {
        float f7;
        float f10;
        nc ncVar;
        float height = recyclerView.getHeight();
        y4 y4Var = this.f44432b;
        t4 t4Var = y4Var.f44457s0;
        s4 s4Var = y4Var.f44447h0;
        vl0 vl0Var = y4Var.d;
        PointF pointF = this.f44431a;
        if (gh.k.b(s4Var, vl0Var, pointF)) {
            f7 = pointF.x;
            height = Math.min(height, pointF.y);
            f10 = Math.max(0.0f, pointF.y + s4Var.getMeasuredHeight());
        } else {
            f7 = 0.0f;
            f10 = 0.0f;
        }
        if (gh.k.b(t4Var, vl0Var, pointF)) {
            height = Math.min(height, pointF.y);
            f10 = Math.max(f10, pointF.y + t4Var.getMeasuredHeight() + AndroidUtilities.dp(12.0f));
        }
        if (height < f10 && (ncVar = s4Var.L) != null) {
            float height2 = (f10 - height) / ncVar.getHeight();
            canvas.save();
            canvas.clipRect(0.0f, height, recyclerView.getWidth(), f10);
            canvas.translate(f7, height);
            canvas.scale(height2, height2);
            s4Var.L.draw(canvas);
            canvas.restore();
        }
    }
}
