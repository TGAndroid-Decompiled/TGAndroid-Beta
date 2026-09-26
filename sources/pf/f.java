package pf;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.LaunchActivity;
public final class f extends ViewGroup {
    public final rf.e f41069a;

    public f(LaunchActivity launchActivity, rf.e eVar) {
        super(launchActivity);
        this.f41069a = eVar;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z10;
        rf.e eVar = this.f41069a;
        Path path = eVar.f42521m;
        float f7 = (1.0f - eVar.f42523o) * eVar.f42518j.e;
        if (f7 > 1.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        canvas.drawColor(i0.a.k(h6.w0(null, h6.f19059d6, false), (int) Math.min(eVar.f42523o * 420.0f, 255.0f)));
        eVar.d.a(canvas, 1.0f);
        if (z10) {
            RectF rectF = eVar.f42520l;
            if (eVar.f42519k != f7) {
                eVar.f42519k = f7;
                rectF.set(eVar.f42514c);
                path.reset();
                path.addRoundRect(rectF, f7, f7, Path.Direction.CW);
                path.close();
            }
            canvas.save();
            canvas.clipPath(path);
        }
        super.dispatchDraw(canvas);
        eVar.e.a(canvas, 1.0f - eVar.f42523o);
        if (z10) {
            canvas.restore();
        }
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        for (int i14 = 0; i14 < getChildCount(); i14++) {
            View childAt = getChildAt(i14);
            Rect rect = this.f41069a.f42514c;
            childAt.layout(rect.left, rect.top, rect.right, rect.bottom);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        setMeasuredDimension(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        boolean z10 = ((a) getParent()).d;
        rf.e eVar = this.f41069a;
        Rect rect = eVar.f42514c;
        if (z10) {
            rect.set(0, 0, size, size2);
        } else {
            rect.set(eVar.f42513b);
        }
        for (int i12 = 0; i12 < getChildCount(); i12++) {
            getChildAt(i12).measure(View.MeasureSpec.makeMeasureSpec(eVar.f42514c.width(), 1073741824), View.MeasureSpec.makeMeasureSpec(eVar.f42514c.height(), 1073741824));
        }
    }
}
