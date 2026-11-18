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
import hi.k3;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.lr;
import org.telegram.ui.c30;
public abstract class o1 extends View {
    public Bitmap f58071a;
    public Paint f58072b;
    public Paint f58073c;
    public Paint d;
    public float f58074e;
    public float f58075f;
    public Path h;
    public Rect f58076n;
    public RectF f58077r;
    public int f58078s;
    public boolean f58079w;
    public q0.a f58080x;
    public float f58081y;

    public final void a(boolean z10) {
        if (this.f58079w) {
            return;
        }
        this.f58079w = true;
        ValueAnimator duration = ValueAnimator.ofFloat(1.0f, 0.0f).setDuration(150L);
        duration.setInterpolator(lr.f37208f);
        duration.addUpdateListener(new k3(this, 28));
        duration.addListener(new c30(15, this, z10));
        duration.start();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ((sg.i) this).E.f57323s1.d();
        this.f58071a.recycle();
        this.f58071a = null;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Bitmap bitmap;
        int i7;
        float f10;
        Rect rect = this.f58076n;
        Paint paint = this.f58072b;
        RectF rectF = this.f58077r;
        Path path = this.h;
        super.onDraw(canvas);
        float min = Math.min(getWidth(), getHeight()) * 0.2f;
        float width = this.f58074e * getWidth();
        float height = this.f58075f * getHeight();
        int round = Math.round(this.f58074e * this.f58071a.getWidth());
        int round2 = Math.round(this.f58075f * this.f58071a.getHeight());
        int pixel = this.f58071a.getPixel(Utilities.j(round, bitmap.getWidth() - 1, 0), Utilities.j(round2, this.f58071a.getHeight() - 1, 0));
        this.f58078s = pixel;
        Paint paint2 = this.d;
        paint2.setColor(pixel);
        float f11 = this.f58081y;
        if (f11 != 0.0f && f11 != 1.0f) {
            RectF rectF2 = org.telegram.messenger.g0.P;
            f10 = 1.0f;
            i7 = round;
            rectF2.set(width - min, height - min, width + min, height + min);
            canvas.saveLayerAlpha(rectF2, (int) (this.f58081y * 255.0f), 31);
        } else {
            i7 = round;
            f10 = 1.0f;
            canvas.save();
        }
        float f12 = (this.f58081y * 0.5f) + 0.5f;
        canvas.scale(f12, f12, width, height);
        path.rewind();
        Path.Direction direction = Path.Direction.CW;
        path.addCircle(width, height, min, direction);
        canvas.clipPath(path);
        int round3 = Math.round(3.5f);
        rect.set(i7 - round3, round2 - round3, i7 + round3, round2 + round3);
        rectF.set(width - min, height - min, width + min, height + min);
        canvas.drawBitmap(this.f58071a, rect, rectF, (Paint) null);
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
        canvas.drawPath(path, this.f58073c);
        float f18 = f13 / 2.0f;
        rectF.set(width - f18, height - f18, width + f18, height + f18);
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(f10), org.telegram.messenger.g0.L(f10), paint);
        canvas.restore();
    }

    @Override
    public final void onSizeChanged(int i7, int i10, int i11, int i12) {
        super.onSizeChanged(i7, i10, i11, i12);
        if (i7 != 0 && i10 != 0 && i11 != 0 && i12 != 0 && isLaidOut()) {
            this.f58074e = (i11 * this.f58074e) / i7;
            this.f58075f = (i12 * this.f58075f) / i10;
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
                this.f58074e = motionEvent.getX() / getWidth();
                this.f58075f = motionEvent.getY() / getHeight();
                invalidate();
                return true;
            }
            a(true);
            return true;
        }
        this.f58074e = motionEvent.getX() / getWidth();
        this.f58075f = motionEvent.getY() / getHeight();
        invalidate();
        getParent().requestDisallowInterceptTouchEvent(true);
        return true;
    }

    public void setColorListener(q0.a aVar) {
        this.f58080x = aVar;
    }
}
