package rh;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.View;
import org.telegram.ui.Components.gq;
public final class z3 extends gq {
    public final View f47797c;
    public final Paint d;
    public final Path e;
    public final long f47798f;
    public float h;

    public z3(vh.d dVar, int i10) {
        super(dVar);
        Paint paint = new Paint(1);
        this.d = paint;
        Path path = new Path();
        this.e = path;
        this.f47798f = System.currentTimeMillis();
        this.h = 1.0f;
        this.f47797c = dVar;
        ((Paint) this.f26491b).setColor(-1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setColor(i10);
        path.rewind();
        path.moveTo(-org.telegram.messenger.i0.N(2.91f), org.telegram.messenger.i0.N(1.08f));
        path.lineTo(0.0f, -org.telegram.messenger.i0.N(1.08f));
        path.lineTo(org.telegram.messenger.i0.N(2.91f), org.telegram.messenger.i0.N(1.08f));
    }

    @Override
    public final void draw(Canvas canvas) {
        float f7;
        Paint paint = (Paint) this.f26491b;
        paint.setAlpha((int) (this.h * 255.0f));
        canvas.drawCircle(getBounds().centerX(), getBounds().centerY(), getBounds().width() / 2.0f, paint);
        float currentTimeMillis = ((float) ((System.currentTimeMillis() - this.f47798f) % 400)) / 400.0f;
        Paint paint2 = this.d;
        int alpha = paint2.getAlpha();
        paint2.setAlpha((int) (alpha * this.h));
        paint2.setStrokeWidth(org.telegram.messenger.i0.N(1.33f));
        canvas.save();
        canvas.translate(getBounds().centerX(), getBounds().centerY() - (org.telegram.ui.Cells.f1.d(1.166f, 2.0f, org.telegram.messenger.i0.N(2.16f) * 3.0f) / 2.0f));
        for (int i10 = 0; i10 < 4; i10++) {
            if (i10 == 0) {
                f7 = 1.0f - currentTimeMillis;
            } else if (i10 == 3) {
                f7 = currentTimeMillis;
            } else {
                f7 = 1.0f;
            }
            paint2.setAlpha((int) (f7 * 255.0f * this.h));
            canvas.save();
            float T1 = org.telegram.messenger.i0.T1(0.5f, 1.0f, f7);
            canvas.scale(T1, T1);
            canvas.drawPath(this.e, paint2);
            canvas.restore();
            canvas.translate(0.0f, org.telegram.messenger.i0.N(3.3260002f) * f7);
        }
        canvas.restore();
        paint2.setAlpha(alpha);
        View view = this.f47797c;
        if (view != null) {
            view.invalidate();
        }
    }

    @Override
    public final int getIntrinsicHeight() {
        return org.telegram.messenger.i0.L(18.0f);
    }

    @Override
    public final int getIntrinsicWidth() {
        return org.telegram.messenger.i0.L(18.0f);
    }

    @Override
    public final void setAlpha(int i10) {
        this.h = i10 / 255.0f;
    }
}
