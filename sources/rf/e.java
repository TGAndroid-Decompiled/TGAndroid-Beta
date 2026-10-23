package rf;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.LaunchActivity;
public final class e extends ViewGroup {
    public final tf.e f45697a;

    public e(LaunchActivity launchActivity, tf.e eVar) {
        super(launchActivity);
        this.f45697a = eVar;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z10;
        tf.e eVar = this.f45697a;
        Path path = eVar.f47462m;
        float f7 = (1.0f - eVar.f47464o) * eVar.f47459j.e;
        if (f7 > 1.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        canvas.drawColor(i0.a.o(k6.x0(null, k6.f21183d6, false), (int) Math.min(eVar.f47464o * 420.0f, 255.0f)));
        eVar.d.a(canvas, 1.0f);
        if (z10) {
            RectF rectF = eVar.f47461l;
            if (eVar.f47460k != f7) {
                eVar.f47460k = f7;
                rectF.set(eVar.f47455c);
                path.reset();
                path.addRoundRect(rectF, f7, f7, Path.Direction.CW);
                path.close();
            }
            canvas.save();
            canvas.clipPath(path);
        }
        super.dispatchDraw(canvas);
        eVar.e.a(canvas, 1.0f - eVar.f47464o);
        if (z10) {
            canvas.restore();
        }
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        for (int i14 = 0; i14 < getChildCount(); i14++) {
            View childAt = getChildAt(i14);
            Rect rect = this.f45697a.f47455c;
            childAt.layout(rect.left, rect.top, rect.right, rect.bottom);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        setMeasuredDimension(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        boolean z10 = ((a) getParent()).d;
        tf.e eVar = this.f45697a;
        Rect rect = eVar.f47455c;
        if (z10) {
            rect.set(0, 0, size, size2);
        } else {
            rect.set(eVar.f47454b);
        }
        for (int i12 = 0; i12 < getChildCount(); i12++) {
            getChildAt(i12).measure(View.MeasureSpec.makeMeasureSpec(eVar.f47455c.width(), 1073741824), View.MeasureSpec.makeMeasureSpec(eVar.f47455c.height(), 1073741824));
        }
    }
}
