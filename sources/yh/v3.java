package yh;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.sq;
public final class v3 extends sq {
    public final View f48147b;
    public final Paint f48148c;
    public final Path d;
    public final long e;
    public float f48149f;

    public v3(ci.d dVar, int i10) {
        super(dVar);
        Paint paint = new Paint(1);
        this.f48148c = paint;
        Path path = new Path();
        this.d = path;
        this.e = System.currentTimeMillis();
        this.f48149f = 1.0f;
        this.f48147b = dVar;
        this.f28309a.setColor(-1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setColor(i10);
        path.rewind();
        path.moveTo(-AndroidUtilities.dpf2(2.91f), AndroidUtilities.dpf2(1.08f));
        path.lineTo(0.0f, -AndroidUtilities.dpf2(1.08f));
        path.lineTo(AndroidUtilities.dpf2(2.91f), AndroidUtilities.dpf2(1.08f));
    }

    @Override
    public final void draw(Canvas canvas) {
        float f7;
        Paint paint = this.f28309a;
        paint.setAlpha((int) (this.f48149f * 255.0f));
        canvas.drawCircle(getBounds().centerX(), getBounds().centerY(), getBounds().width() / 2.0f, paint);
        float currentTimeMillis = ((float) ((System.currentTimeMillis() - this.e) % 400)) / 400.0f;
        Paint paint2 = this.f48148c;
        int alpha = paint2.getAlpha();
        paint2.setAlpha((int) (alpha * this.f48149f));
        paint2.setStrokeWidth(AndroidUtilities.dpf2(1.33f));
        canvas.save();
        canvas.translate(getBounds().centerX(), getBounds().centerY() - (((AndroidUtilities.dpf2(1.166f) * 2.0f) + (AndroidUtilities.dpf2(2.16f) * 3.0f)) / 2.0f));
        for (int i10 = 0; i10 < 4; i10++) {
            if (i10 == 0) {
                f7 = 1.0f - currentTimeMillis;
            } else if (i10 == 3) {
                f7 = currentTimeMillis;
            } else {
                f7 = 1.0f;
            }
            paint2.setAlpha((int) (f7 * 255.0f * this.f48149f));
            canvas.save();
            float lerp = AndroidUtilities.lerp(0.5f, 1.0f, f7);
            canvas.scale(lerp, lerp);
            canvas.drawPath(this.d, paint2);
            canvas.restore();
            canvas.translate(0.0f, AndroidUtilities.dpf2(3.3260002f) * f7);
        }
        canvas.restore();
        paint2.setAlpha(alpha);
        View view = this.f48147b;
        if (view != null) {
            view.invalidate();
        }
    }

    @Override
    public final int getIntrinsicHeight() {
        return AndroidUtilities.dp(18.0f);
    }

    @Override
    public final int getIntrinsicWidth() {
        return AndroidUtilities.dp(18.0f);
    }

    @Override
    public final void setAlpha(int i10) {
        this.f48149f = i10 / 255.0f;
    }
}
