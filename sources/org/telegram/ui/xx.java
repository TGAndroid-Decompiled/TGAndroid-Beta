package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.widget.FrameLayout;
import java.util.HashSet;
public final class xx extends FrameLayout implements org.telegram.ui.ActionBar.a6 {
    public Paint f52010a;
    public float[] f52011b;
    public Path f52012c;
    public float d;

    public final void a(float f10, float f11) {
        float[] fArr = this.f52011b;
        fArr[7] = f10;
        fArr[6] = f10;
        fArr[1] = f10;
        fArr[0] = f10;
        fArr[5] = f11;
        fArr[4] = f11;
        fArr[3] = f11;
        fArr[2] = f11;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float measuredWidth = getMeasuredWidth() / 2.0f;
        Path path = this.f52012c;
        path.rewind();
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(0.0f, 0.0f, measuredWidth - org.telegram.messenger.g0.W1(this.d, 0, org.telegram.messenger.g0.L(4.0f)), getMeasuredHeight());
        a(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.W1(this.d, 0, org.telegram.messenger.g0.L(8.0f)));
        float[] fArr = this.f52011b;
        Path.Direction direction = Path.Direction.CW;
        path.addRoundRect(rectF, fArr, direction);
        Paint paint = this.f52010a;
        canvas.drawPath(path, paint);
        path.rewind();
        rectF.set(measuredWidth + org.telegram.messenger.g0.W1(this.d, 0, org.telegram.messenger.g0.L(4.0f)), 0.0f, getMeasuredWidth(), getMeasuredHeight());
        a(org.telegram.messenger.g0.W1(this.d, 0, org.telegram.messenger.g0.L(8.0f)), org.telegram.messenger.g0.L(8.0f));
        path.addRoundRect(rectF, fArr, direction);
        canvas.drawPath(path, paint);
    }

    @Override
    public final void updateColors() {
        try {
            this.f52010a.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Ci, false));
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
