package pf;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.LaunchActivity;
public final class f extends ViewGroup {
    public final rf.e f41119a;

    public f(LaunchActivity launchActivity, rf.e eVar) {
        super(launchActivity);
        this.f41119a = eVar;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z10;
        rf.e eVar = this.f41119a;
        Path path = eVar.f42557m;
        float f7 = (1.0f - eVar.f42559o) * eVar.f42554j.e;
        if (f7 > 1.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        canvas.drawColor(i0.a.k(j6.w0(null, j6.f19109d6, false), (int) Math.min(eVar.f42559o * 420.0f, 255.0f)));
        eVar.d.a(canvas, 1.0f);
        if (z10) {
            RectF rectF = eVar.f42556l;
            if (eVar.f42555k != f7) {
                eVar.f42555k = f7;
                rectF.set(eVar.f42550c);
                path.reset();
                path.addRoundRect(rectF, f7, f7, Path.Direction.CW);
                path.close();
            }
            canvas.save();
            canvas.clipPath(path);
        }
        super.dispatchDraw(canvas);
        eVar.e.a(canvas, 1.0f - eVar.f42559o);
        if (z10) {
            canvas.restore();
        }
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        for (int i14 = 0; i14 < getChildCount(); i14++) {
            View childAt = getChildAt(i14);
            Rect rect = this.f41119a.f42550c;
            childAt.layout(rect.left, rect.top, rect.right, rect.bottom);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        setMeasuredDimension(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        boolean z10 = ((a) getParent()).d;
        rf.e eVar = this.f41119a;
        Rect rect = eVar.f42550c;
        if (z10) {
            rect.set(0, 0, size, size2);
        } else {
            rect.set(eVar.f42549b);
        }
        for (int i12 = 0; i12 < getChildCount(); i12++) {
            getChildAt(i12).measure(View.MeasureSpec.makeMeasureSpec(eVar.f42550c.width(), 1073741824), View.MeasureSpec.makeMeasureSpec(eVar.f42550c.height(), 1073741824));
        }
    }
}
