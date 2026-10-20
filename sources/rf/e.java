package rf;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.LaunchActivity;
public final class e extends ViewGroup {
    public final tf.e f45281a;

    public e(LaunchActivity launchActivity, tf.e eVar) {
        super(launchActivity);
        this.f45281a = eVar;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z10;
        tf.e eVar = this.f45281a;
        Path path = eVar.f47023m;
        float f7 = (1.0f - eVar.f47025o) * eVar.f47020j.e;
        if (f7 > 1.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        canvas.drawColor(i0.a.o(h6.x0(null, h6.f20990d6, false), (int) Math.min(eVar.f47025o * 420.0f, 255.0f)));
        eVar.d.a(canvas, 1.0f);
        if (z10) {
            RectF rectF = eVar.f47022l;
            if (eVar.f47021k != f7) {
                eVar.f47021k = f7;
                rectF.set(eVar.f47016c);
                path.reset();
                path.addRoundRect(rectF, f7, f7, Path.Direction.CW);
                path.close();
            }
            canvas.save();
            canvas.clipPath(path);
        }
        super.dispatchDraw(canvas);
        eVar.e.a(canvas, 1.0f - eVar.f47025o);
        if (z10) {
            canvas.restore();
        }
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        for (int i14 = 0; i14 < getChildCount(); i14++) {
            View childAt = getChildAt(i14);
            Rect rect = this.f45281a.f47016c;
            childAt.layout(rect.left, rect.top, rect.right, rect.bottom);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        setMeasuredDimension(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        boolean z10 = ((a) getParent()).d;
        tf.e eVar = this.f45281a;
        Rect rect = eVar.f47016c;
        if (z10) {
            rect.set(0, 0, size, size2);
        } else {
            rect.set(eVar.f47015b);
        }
        for (int i12 = 0; i12 < getChildCount(); i12++) {
            getChildAt(i12).measure(View.MeasureSpec.makeMeasureSpec(eVar.f47016c.width(), 1073741824), View.MeasureSpec.makeMeasureSpec(eVar.f47016c.height(), 1073741824));
        }
    }
}
