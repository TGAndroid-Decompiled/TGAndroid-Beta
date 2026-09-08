package zh;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.qq;
public final class u3 extends qq {
    public final View f52717b;
    public final Paint f52718c;
    public final Path d;
    public final long f52719e;
    public float f52720f;

    public u3(di.d dVar, int i10) {
        super(dVar);
        Paint paint = new Paint(1);
        this.f52718c = paint;
        Path path = new Path();
        this.d = path;
        this.f52719e = System.currentTimeMillis();
        this.f52720f = 1.0f;
        this.f52717b = dVar;
        this.f29824a.setColor(-1);
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
        Paint paint = this.f29824a;
        paint.setAlpha((int) (this.f52720f * 255.0f));
        canvas.drawCircle(getBounds().centerX(), getBounds().centerY(), getBounds().width() / 2.0f, paint);
        float currentTimeMillis = ((float) ((System.currentTimeMillis() - this.f52719e) % 400)) / 400.0f;
        Paint paint2 = this.f52718c;
        int alpha = paint2.getAlpha();
        paint2.setAlpha((int) (alpha * this.f52720f));
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
            paint2.setAlpha((int) (f7 * 255.0f * this.f52720f));
            canvas.save();
            float lerp = AndroidUtilities.lerp(0.5f, 1.0f, f7);
            canvas.scale(lerp, lerp);
            canvas.drawPath(this.d, paint2);
            canvas.restore();
            canvas.translate(0.0f, AndroidUtilities.dpf2(3.3260002f) * f7);
        }
        canvas.restore();
        paint2.setAlpha(alpha);
        View view = this.f52717b;
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
        this.f52720f = i10 / 255.0f;
    }
}
