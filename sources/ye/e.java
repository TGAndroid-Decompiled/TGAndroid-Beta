package ye;

import af.f;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.LaunchActivity;

public final class e extends ViewGroup {

    public final f f49871a;

    public e(LaunchActivity launchActivity, f fVar) {
        super(launchActivity);
        this.f49871a = fVar;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        f fVar = this.f49871a;
        Path path = fVar.f268m;
        float f10 = (1.0f - fVar.f270o) * fVar.f265j.f49863e;
        boolean z10 = f10 > 1.0f;
        canvas.drawColor(i0.b.k(g6.w0(null, g6.f23053d6, false), (int) Math.min(fVar.f270o * 420.0f, 255.0f)));
        fVar.d.a(canvas, 1.0f);
        if (z10) {
            RectF rectF = fVar.f267l;
            if (fVar.f266k != f10) {
                fVar.f266k = f10;
                rectF.set(fVar.f260c);
                path.reset();
                path.addRoundRect(rectF, f10, f10, Path.Direction.CW);
                path.close();
            }
            canvas.save();
            canvas.clipPath(path);
        }
        super.dispatchDraw(canvas);
        fVar.f261e.a(canvas, 1.0f - fVar.f270o);
        if (z10) {
            canvas.restore();
        }
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        for (int i14 = 0; i14 < getChildCount(); i14++) {
            View childAt = getChildAt(i14);
            Rect rect = this.f49871a.f260c;
            childAt.layout(rect.left, rect.top, rect.right, rect.bottom);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        setMeasuredDimension(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        boolean z10 = ((a) getParent()).d;
        f fVar = this.f49871a;
        Rect rect = fVar.f260c;
        if (z10) {
            rect.set(0, 0, size, size2);
        } else {
            rect.set(fVar.f259b);
        }
        for (int i12 = 0; i12 < getChildCount(); i12++) {
            getChildAt(i12).measure(View.MeasureSpec.makeMeasureSpec(fVar.f260c.width(), 1073741824), View.MeasureSpec.makeMeasureSpec(fVar.f260c.height(), 1073741824));
        }
    }
}
