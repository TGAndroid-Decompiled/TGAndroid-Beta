package zh;

import android.graphics.Canvas;
import android.graphics.PointF;
import androidx.recyclerview.widget.RecyclerView;
import bi.ec;
import org.telegram.ui.Components.pj0;
public final class a4 extends v4.m0 {
    public final PointF f60123a = new PointF();
    public final b4 f60124b;

    public a4(b4 b4Var) {
        this.f60124b = b4Var;
    }

    @Override
    public final void f(Canvas canvas, RecyclerView recyclerView) {
        float f10;
        ec ecVar;
        float height = recyclerView.getHeight();
        float width = recyclerView.getWidth();
        b4 b4Var = this.f60124b;
        w3 w3Var = b4Var.f60140l2;
        v3 v3Var = b4Var.Z1;
        pj0 pj0Var = b4Var.f36261k1;
        PointF pointF = this.f60123a;
        float f11 = 0.0f;
        if (jh.k.b(v3Var, pj0Var, pointF)) {
            float f12 = pointF.x;
            height = Math.min(height, pointF.y);
            f11 = Math.max(0.0f, pointF.y + v3Var.getMeasuredHeight());
            f10 = f12;
            width = v3Var.getMeasuredWidth() + f12;
        } else {
            f10 = 0.0f;
        }
        if (jh.k.b(w3Var, pj0Var, pointF)) {
            height = Math.min(height, pointF.y);
            f11 = Math.max(f11, pointF.y + w3Var.getMeasuredHeight() + org.telegram.messenger.g0.L(12.0f));
        }
        if (height < f11 && (ecVar = v3Var.L) != null) {
            float height2 = (f11 - height) / ecVar.getHeight();
            canvas.save();
            canvas.clipRect(f10, height, width, f11);
            canvas.translate(f10, height);
            canvas.scale(height2, height2);
            v3Var.L.draw(canvas);
            canvas.restore();
        }
    }
}
