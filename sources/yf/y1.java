package yf;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import kh.g4;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.gr;
import org.telegram.ui.n60;
public abstract class y1 extends View {
    public Bitmap f50185a;
    public Paint f50186b;
    public Paint f50187c;
    public Paint d;
    public float f50188e;
    public float f50189f;
    public Path h;
    public Rect f50190n;
    public RectF f50191r;
    public int f50192s;
    public boolean v;
    public q0.a f50193w;
    public float f50194x;

    public final void a(boolean z10) {
        if (this.v) {
            return;
        }
        this.v = true;
        ValueAnimator duration = ValueAnimator.ofFloat(1.0f, 0.0f).setDuration(150L);
        duration.setInterpolator(gr.f28844f);
        duration.addUpdateListener(new g4(this, 21));
        duration.addListener(new n60(15, this, z10));
        duration.start();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ((xf.n) this).f49277y.f49412n.d();
        this.f50185a.recycle();
        this.f50185a = null;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i9;
        float f10;
        Rect rect = this.f50190n;
        Paint paint = this.f50186b;
        RectF rectF = this.f50191r;
        Path path = this.h;
        super.onDraw(canvas);
        float min = Math.min(getWidth(), getHeight()) * 0.2f;
        float width = this.f50188e * getWidth();
        float height = this.f50189f * getHeight();
        int round = Math.round(this.f50188e * this.f50185a.getWidth());
        int round2 = Math.round(this.f50189f * this.f50185a.getHeight());
        Bitmap bitmap = this.f50185a;
        int pixel = bitmap.getPixel(Utilities.clamp(round, bitmap.getWidth() - 1, 0), Utilities.clamp(round2, this.f50185a.getHeight() - 1, 0));
        this.f50192s = pixel;
        Paint paint2 = this.d;
        paint2.setColor(pixel);
        float f11 = this.f50194x;
        if (f11 != 0.0f && f11 != 1.0f) {
            RectF rectF2 = AndroidUtilities.rectTmp;
            f10 = 1.0f;
            i9 = round;
            rectF2.set(width - min, height - min, width + min, height + min);
            canvas.saveLayerAlpha(rectF2, (int) (this.f50194x * 255.0f), 31);
        } else {
            i9 = round;
            f10 = 1.0f;
            canvas.save();
        }
        float f12 = (this.f50194x * 0.5f) + 0.5f;
        canvas.scale(f12, f12, width, height);
        path.rewind();
        Path.Direction direction = Path.Direction.CW;
        path.addCircle(width, height, min, direction);
        canvas.clipPath(path);
        int round3 = Math.round(3.5f);
        rect.set(i9 - round3, round2 - round3, i9 + round3, round2 + round3);
        rectF.set(width - min, height - min, width + min, height + min);
        canvas.drawBitmap(this.f50185a, rect, rectF, (Paint) null);
        float strokeWidth = min - (paint2.getStrokeWidth() / 2.0f);
        canvas.drawCircle(width, height, strokeWidth, paint2);
        float strokeWidth2 = (strokeWidth - (paint2.getStrokeWidth() / 2.0f)) - (paint.getStrokeWidth() / 2.0f);
        canvas.drawCircle(width, height, strokeWidth2, paint);
        float strokeWidth3 = strokeWidth2 - (paint.getStrokeWidth() / 2.0f);
        path.rewind();
        path.addCircle(width, height, strokeWidth3, direction);
        canvas.clipPath(path);
        float f13 = (strokeWidth3 * 2.0f) / 8.0f;
        path.rewind();
        for (float f14 = -3.5f; f14 < 4.5f; f14 += f10) {
            float f15 = (f14 * f13) + width;
            path.moveTo(f15, height - strokeWidth3);
            path.lineTo(f15, height + strokeWidth3);
        }
        for (float f16 = -3.5f; f16 < 4.5f; f16 += f10) {
            float f17 = (f16 * f13) + height;
            path.moveTo(width - strokeWidth3, f17);
            path.lineTo(width + strokeWidth3, f17);
        }
        canvas.drawPath(path, this.f50187c);
        float f18 = f13 / 2.0f;
        rectF.set(width - f18, height - f18, width + f18, height + f18);
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(f10), AndroidUtilities.dp(f10), paint);
        canvas.restore();
    }

    @Override
    public final void onSizeChanged(int i9, int i10, int i11, int i12) {
        super.onSizeChanged(i9, i10, i11, i12);
        if (i9 != 0 && i10 != 0 && i11 != 0 && i12 != 0 && isLaidOut()) {
            this.f50188e = (i11 * this.f50188e) / i9;
            this.f50189f = (i12 * this.f50189f) / i10;
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        return true;
                    }
                    a(false);
                    return true;
                }
                this.f50188e = motionEvent.getX() / getWidth();
                this.f50189f = motionEvent.getY() / getHeight();
                invalidate();
                return true;
            }
            a(true);
            return true;
        }
        this.f50188e = motionEvent.getX() / getWidth();
        this.f50189f = motionEvent.getY() / getHeight();
        invalidate();
        getParent().requestDisallowInterceptTouchEvent(true);
        return true;
    }

    public void setColorListener(q0.a aVar) {
        this.f50193w = aVar;
    }
}
