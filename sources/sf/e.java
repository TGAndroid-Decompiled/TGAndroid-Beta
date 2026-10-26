package sf;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.LaunchActivity;
public final class e extends ViewGroup {
    public final uf.e f48138a;

    public e(LaunchActivity launchActivity, uf.e eVar) {
        super(launchActivity);
        this.f48138a = eVar;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z10;
        uf.e eVar = this.f48138a;
        Path path = eVar.f49731m;
        float f7 = (1.0f - eVar.f49733o) * eVar.f49728j.e;
        if (f7 > 1.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        canvas.drawColor(i0.a.o(y6.x0(null, y6.f23356d6, false), (int) Math.min(eVar.f49733o * 420.0f, 255.0f)));
        eVar.d.a(canvas, 1.0f);
        if (z10) {
            RectF rectF = eVar.f49730l;
            if (eVar.f49729k != f7) {
                eVar.f49729k = f7;
                rectF.set(eVar.f49724c);
                path.reset();
                path.addRoundRect(rectF, f7, f7, Path.Direction.CW);
                path.close();
            }
            canvas.save();
            canvas.clipPath(path);
        }
        super.dispatchDraw(canvas);
        eVar.e.a(canvas, 1.0f - eVar.f49733o);
        if (z10) {
            canvas.restore();
        }
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        for (int i14 = 0; i14 < getChildCount(); i14++) {
            View childAt = getChildAt(i14);
            Rect rect = this.f48138a.f49724c;
            childAt.layout(rect.left, rect.top, rect.right, rect.bottom);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        setMeasuredDimension(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        boolean z10 = ((a) getParent()).d;
        uf.e eVar = this.f48138a;
        Rect rect = eVar.f49724c;
        if (z10) {
            rect.set(0, 0, size, size2);
        } else {
            rect.set(eVar.f49723b);
        }
        for (int i12 = 0; i12 < getChildCount(); i12++) {
            getChildAt(i12).measure(View.MeasureSpec.makeMeasureSpec(eVar.f49724c.width(), 1073741824), View.MeasureSpec.makeMeasureSpec(eVar.f49724c.height(), 1073741824));
        }
    }
}
