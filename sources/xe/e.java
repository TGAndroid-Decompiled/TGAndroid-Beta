package xe;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.LaunchActivity;
public final class e extends ViewGroup {
    public final ze.e f49155a;

    public e(LaunchActivity launchActivity, ze.e eVar) {
        super(launchActivity);
        this.f49155a = eVar;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z10;
        ze.e eVar = this.f49155a;
        Path path = eVar.f50449m;
        float f10 = (1.0f - eVar.f50451o) * eVar.f50446j.f49147e;
        if (f10 > 1.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        canvas.drawColor(i0.a.k(f6.w0(null, f6.f23001d6, false), (int) Math.min(eVar.f50451o * 420.0f, 255.0f)));
        eVar.d.a(canvas, 1.0f);
        if (z10) {
            RectF rectF = eVar.f50448l;
            if (eVar.f50447k != f10) {
                eVar.f50447k = f10;
                rectF.set(eVar.f50441c);
                path.reset();
                path.addRoundRect(rectF, f10, f10, Path.Direction.CW);
                path.close();
            }
            canvas.save();
            canvas.clipPath(path);
        }
        super.dispatchDraw(canvas);
        eVar.f50442e.a(canvas, 1.0f - eVar.f50451o);
        if (z10) {
            canvas.restore();
        }
    }

    @Override
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        for (int i13 = 0; i13 < getChildCount(); i13++) {
            View childAt = getChildAt(i13);
            Rect rect = this.f49155a.f50441c;
            childAt.layout(rect.left, rect.top, rect.right, rect.bottom);
        }
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        int size = View.MeasureSpec.getSize(i9);
        int size2 = View.MeasureSpec.getSize(i10);
        setMeasuredDimension(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        boolean z10 = ((a) getParent()).d;
        ze.e eVar = this.f49155a;
        Rect rect = eVar.f50441c;
        if (z10) {
            rect.set(0, 0, size, size2);
        } else {
            rect.set(eVar.f50440b);
        }
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            getChildAt(i11).measure(View.MeasureSpec.makeMeasureSpec(eVar.f50441c.width(), 1073741824), View.MeasureSpec.makeMeasureSpec(eVar.f50441c.height(), 1073741824));
        }
    }
}
