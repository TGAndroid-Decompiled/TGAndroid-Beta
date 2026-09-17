package qf;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.LaunchActivity;
public final class f extends ViewGroup {
    public final sf.e f44365a;

    public f(LaunchActivity launchActivity, sf.e eVar) {
        super(launchActivity);
        this.f44365a = eVar;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z10;
        sf.e eVar = this.f44365a;
        Path path = eVar.f46007m;
        float f7 = (1.0f - eVar.f46009o) * eVar.f46004j.f44357e;
        if (f7 > 1.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        canvas.drawColor(i0.a.k(j6.w0(null, j6.f20664d6, false), (int) Math.min(eVar.f46009o * 420.0f, 255.0f)));
        eVar.d.a(canvas, 1.0f);
        if (z10) {
            RectF rectF = eVar.f46006l;
            if (eVar.f46005k != f7) {
                eVar.f46005k = f7;
                rectF.set(eVar.f45999c);
                path.reset();
                path.addRoundRect(rectF, f7, f7, Path.Direction.CW);
                path.close();
            }
            canvas.save();
            canvas.clipPath(path);
        }
        super.dispatchDraw(canvas);
        eVar.f46000e.a(canvas, 1.0f - eVar.f46009o);
        if (z10) {
            canvas.restore();
        }
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        for (int i14 = 0; i14 < getChildCount(); i14++) {
            View childAt = getChildAt(i14);
            Rect rect = this.f44365a.f45999c;
            childAt.layout(rect.left, rect.top, rect.right, rect.bottom);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        setMeasuredDimension(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        boolean z10 = ((a) getParent()).d;
        sf.e eVar = this.f44365a;
        Rect rect = eVar.f45999c;
        if (z10) {
            rect.set(0, 0, size, size2);
        } else {
            rect.set(eVar.f45998b);
        }
        for (int i12 = 0; i12 < getChildCount(); i12++) {
            getChildAt(i12).measure(View.MeasureSpec.makeMeasureSpec(eVar.f45999c.width(), 1073741824), View.MeasureSpec.makeMeasureSpec(eVar.f45999c.height(), 1073741824));
        }
    }
}
