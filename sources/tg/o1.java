package tg;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import fi.v3;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.xq;
import org.telegram.ui.z40;
public abstract class o1 extends View {
    public Bitmap f55883a;
    public Paint f55884b;
    public Paint f55885c;
    public Paint d;
    public float f55886e;
    public float f55887f;
    public Path h;
    public Rect f55888n;
    public RectF f55889r;
    public int f55890s;
    public boolean f55891w;
    public q0.a f55892x;
    public float f55893y;

    public final void a(boolean z9) {
        if (this.f55891w) {
            return;
        }
        this.f55891w = true;
        ValueAnimator duration = ValueAnimator.ofFloat(1.0f, 0.0f).setDuration(150L);
        duration.setInterpolator(xq.f40366f);
        duration.addUpdateListener(new v3(this, 26));
        duration.addListener(new z40(14, this, z9));
        duration.start();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ((sg.i) this).D.f55186o1.c();
        this.f55883a.recycle();
        this.f55883a = null;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Bitmap bitmap;
        int i7;
        float f10;
        Rect rect = this.f55888n;
        Paint paint = this.f55884b;
        RectF rectF = this.f55889r;
        Path path = this.h;
        super.onDraw(canvas);
        float min = Math.min(getWidth(), getHeight()) * 0.2f;
        float width = this.f55886e * getWidth();
        float height = this.f55887f * getHeight();
        int round = Math.round(this.f55886e * this.f55883a.getWidth());
        int round2 = Math.round(this.f55887f * this.f55883a.getHeight());
        int pixel = this.f55883a.getPixel(Utilities.j(round, bitmap.getWidth() - 1, 0), Utilities.j(round2, this.f55883a.getHeight() - 1, 0));
        this.f55890s = pixel;
        Paint paint2 = this.d;
        paint2.setColor(pixel);
        float f11 = this.f55893y;
        if (f11 != 0.0f && f11 != 1.0f) {
            RectF rectF2 = org.telegram.messenger.g0.P;
            f10 = 1.0f;
            i7 = round;
            rectF2.set(width - min, height - min, width + min, height + min);
            canvas.saveLayerAlpha(rectF2, (int) (this.f55893y * 255.0f), 31);
        } else {
            i7 = round;
            f10 = 1.0f;
            canvas.save();
        }
        float f12 = (this.f55893y * 0.5f) + 0.5f;
        canvas.scale(f12, f12, width, height);
        path.rewind();
        Path.Direction direction = Path.Direction.CW;
        path.addCircle(width, height, min, direction);
        canvas.clipPath(path);
        int round3 = Math.round(3.5f);
        rect.set(i7 - round3, round2 - round3, i7 + round3, round2 + round3);
        rectF.set(width - min, height - min, width + min, height + min);
        canvas.drawBitmap(this.f55883a, rect, rectF, (Paint) null);
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
        canvas.drawPath(path, this.f55885c);
        float f18 = f13 / 2.0f;
        rectF.set(width - f18, height - f18, width + f18, height + f18);
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(f10), org.telegram.messenger.g0.L(f10), paint);
        canvas.restore();
    }

    @Override
    public final void onSizeChanged(int i7, int i10, int i11, int i12) {
        super.onSizeChanged(i7, i10, i11, i12);
        if (i7 != 0 && i10 != 0 && i11 != 0 && i12 != 0 && isLaidOut()) {
            this.f55886e = (i11 * this.f55886e) / i7;
            this.f55887f = (i12 * this.f55887f) / i10;
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
                this.f55886e = motionEvent.getX() / getWidth();
                this.f55887f = motionEvent.getY() / getHeight();
                invalidate();
                return true;
            }
            a(true);
            return true;
        }
        this.f55886e = motionEvent.getX() / getWidth();
        this.f55887f = motionEvent.getY() / getHeight();
        invalidate();
        getParent().requestDisallowInterceptTouchEvent(true);
        return true;
    }

    public void setColorListener(q0.a aVar) {
        this.f55892x = aVar;
    }
}
