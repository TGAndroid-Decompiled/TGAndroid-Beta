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
    public final uf.e f48135a;

    public e(LaunchActivity launchActivity, uf.e eVar) {
        super(launchActivity);
        this.f48135a = eVar;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z10;
        uf.e eVar = this.f48135a;
        Path path = eVar.f49728m;
        float f7 = (1.0f - eVar.f49730o) * eVar.f49725j.e;
        if (f7 > 1.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        canvas.drawColor(i0.a.o(y6.x0(null, y6.f23354d6, false), (int) Math.min(eVar.f49730o * 420.0f, 255.0f)));
        eVar.d.a(canvas, 1.0f);
        if (z10) {
            RectF rectF = eVar.f49727l;
            if (eVar.f49726k != f7) {
                eVar.f49726k = f7;
                rectF.set(eVar.f49721c);
                path.reset();
                path.addRoundRect(rectF, f7, f7, Path.Direction.CW);
                path.close();
            }
            canvas.save();
            canvas.clipPath(path);
        }
        super.dispatchDraw(canvas);
        eVar.e.a(canvas, 1.0f - eVar.f49730o);
        if (z10) {
            canvas.restore();
        }
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        for (int i14 = 0; i14 < getChildCount(); i14++) {
            View childAt = getChildAt(i14);
            Rect rect = this.f48135a.f49721c;
            childAt.layout(rect.left, rect.top, rect.right, rect.bottom);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        setMeasuredDimension(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        boolean z10 = ((a) getParent()).d;
        uf.e eVar = this.f48135a;
        Rect rect = eVar.f49721c;
        if (z10) {
            rect.set(0, 0, size, size2);
        } else {
            rect.set(eVar.f49720b);
        }
        for (int i12 = 0; i12 < getChildCount(); i12++) {
            getChildAt(i12).measure(View.MeasureSpec.makeMeasureSpec(eVar.f49721c.width(), 1073741824), View.MeasureSpec.makeMeasureSpec(eVar.f49721c.height(), 1073741824));
        }
    }
}
