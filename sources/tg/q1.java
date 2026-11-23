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
import hi.j3;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.nr;
import org.telegram.ui.c30;
public abstract class q1 extends View {
    public Bitmap f58140a;
    public Paint f58141b;
    public Paint f58142c;
    public Paint d;
    public float f58143e;
    public float f58144f;
    public Path h;
    public Rect f58145n;
    public RectF f58146r;
    public int f58147s;
    public boolean f58148w;
    public q0.a f58149x;
    public float f58150y;

    public final void a(boolean z10) {
        if (this.f58148w) {
            return;
        }
        this.f58148w = true;
        ValueAnimator duration = ValueAnimator.ofFloat(1.0f, 0.0f).setDuration(150L);
        duration.setInterpolator(nr.f37960f);
        duration.addUpdateListener(new j3(this, 28));
        duration.addListener(new c30(15, this, z10));
        duration.start();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ((sg.i) this).E.f57368s1.d();
        this.f58140a.recycle();
        this.f58140a = null;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Bitmap bitmap;
        int i7;
        float f10;
        Rect rect = this.f58145n;
        Paint paint = this.f58141b;
        RectF rectF = this.f58146r;
        Path path = this.h;
        super.onDraw(canvas);
        float min = Math.min(getWidth(), getHeight()) * 0.2f;
        float width = this.f58143e * getWidth();
        float height = this.f58144f * getHeight();
        int round = Math.round(this.f58143e * this.f58140a.getWidth());
        int round2 = Math.round(this.f58144f * this.f58140a.getHeight());
        int pixel = this.f58140a.getPixel(Utilities.j(round, bitmap.getWidth() - 1, 0), Utilities.j(round2, this.f58140a.getHeight() - 1, 0));
        this.f58147s = pixel;
        Paint paint2 = this.d;
        paint2.setColor(pixel);
        float f11 = this.f58150y;
        if (f11 != 0.0f && f11 != 1.0f) {
            RectF rectF2 = org.telegram.messenger.g0.P;
            f10 = 1.0f;
            i7 = round;
            rectF2.set(width - min, height - min, width + min, height + min);
            canvas.saveLayerAlpha(rectF2, (int) (this.f58150y * 255.0f), 31);
        } else {
            i7 = round;
            f10 = 1.0f;
            canvas.save();
        }
        float f12 = (this.f58150y * 0.5f) + 0.5f;
        canvas.scale(f12, f12, width, height);
        path.rewind();
        Path.Direction direction = Path.Direction.CW;
        path.addCircle(width, height, min, direction);
        canvas.clipPath(path);
        int round3 = Math.round(3.5f);
        rect.set(i7 - round3, round2 - round3, i7 + round3, round2 + round3);
        rectF.set(width - min, height - min, width + min, height + min);
        canvas.drawBitmap(this.f58140a, rect, rectF, (Paint) null);
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
        canvas.drawPath(path, this.f58142c);
        float f18 = f13 / 2.0f;
        rectF.set(width - f18, height - f18, width + f18, height + f18);
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(f10), org.telegram.messenger.g0.L(f10), paint);
        canvas.restore();
    }

    @Override
    public final void onSizeChanged(int i7, int i10, int i11, int i12) {
        super.onSizeChanged(i7, i10, i11, i12);
        if (i7 != 0 && i10 != 0 && i11 != 0 && i12 != 0 && isLaidOut()) {
            this.f58143e = (i11 * this.f58143e) / i7;
            this.f58144f = (i12 * this.f58144f) / i10;
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
                this.f58143e = motionEvent.getX() / getWidth();
                this.f58144f = motionEvent.getY() / getHeight();
                invalidate();
                return true;
            }
            a(true);
            return true;
        }
        this.f58143e = motionEvent.getX() / getWidth();
        this.f58144f = motionEvent.getY() / getHeight();
        invalidate();
        getParent().requestDisallowInterceptTouchEvent(true);
        return true;
    }

    public void setColorListener(q0.a aVar) {
        this.f58149x = aVar;
    }
}
