package th;

import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
public final class v0 extends ViewGroup {
    @Override
    public final void draw(Canvas canvas) {
        if (w0.Z.W) {
            return;
        }
        super.draw(canvas);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        w0 w0Var = w0.Z;
        if (w0Var.e.getParent() == this) {
            w0Var.e.layout(0, 0, w0Var.J, w0Var.K);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11));
        w0 w0Var = w0.Z;
        if (w0Var.e.getParent() == this) {
            w0Var.e.measure(View.MeasureSpec.makeMeasureSpec(w0Var.J, 1073741824), View.MeasureSpec.makeMeasureSpec(w0Var.K, 1073741824));
        }
    }
}
