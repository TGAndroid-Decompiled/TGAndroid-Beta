package zh;

import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
public final class w0 extends ViewGroup {
    @Override
    public final void draw(Canvas canvas) {
        if (x0.Z.W) {
            return;
        }
        super.draw(canvas);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        x0 x0Var = x0.Z;
        if (x0Var.e.getParent() == this) {
            x0Var.e.layout(0, 0, x0Var.J, x0Var.K);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11));
        x0 x0Var = x0.Z;
        if (x0Var.e.getParent() == this) {
            x0Var.e.measure(View.MeasureSpec.makeMeasureSpec(x0Var.J, 1073741824), View.MeasureSpec.makeMeasureSpec(x0Var.K, 1073741824));
        }
    }
}
