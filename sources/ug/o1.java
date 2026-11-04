package ug;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import gi.j3;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.xq;
import org.telegram.ui.u40;
public abstract class o1 extends View {
    public Bitmap f56194a;
    public Paint f56195b;
    public Paint f56196c;
    public Paint d;
    public float f56197e;
    public float f56198f;
    public Path h;
    public Rect f56199n;
    public RectF f56200r;
    public int f56201s;
    public boolean f56202w;
    public q0.a f56203x;
    public float f56204y;

    public final void a(boolean z10) {
        if (this.f56202w) {
            return;
        }
        this.f56202w = true;
        ValueAnimator duration = ValueAnimator.ofFloat(1.0f, 0.0f).setDuration(150L);
        duration.setInterpolator(xq.f40452f);
        duration.addUpdateListener(new j3(this, 27));
        duration.addListener(new u40(15, this, z10));
        duration.start();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ((tg.i) this).E.f55290p1.c();
        this.f56194a.recycle();
        this.f56194a = null;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Bitmap bitmap;
        int i3;
        float f10;
        Rect rect = this.f56199n;
        Paint paint = this.f56195b;
        RectF rectF = this.f56200r;
        Path path = this.h;
        super.onDraw(canvas);
        float min = Math.min(getWidth(), getHeight()) * 0.2f;
        float width = this.f56197e * getWidth();
        float height = this.f56198f * getHeight();
        int round = Math.round(this.f56197e * this.f56194a.getWidth());
        int round2 = Math.round(this.f56198f * this.f56194a.getHeight());
        int pixel = this.f56194a.getPixel(Utilities.j(round, bitmap.getWidth() - 1, 0), Utilities.j(round2, this.f56194a.getHeight() - 1, 0));
        this.f56201s = pixel;
        Paint paint2 = this.d;
        paint2.setColor(pixel);
        float f11 = this.f56204y;
        if (f11 != 0.0f && f11 != 1.0f) {
            RectF rectF2 = org.telegram.messenger.g0.P;
            f10 = 1.0f;
            i3 = round;
            rectF2.set(width - min, height - min, width + min, height + min);
            canvas.saveLayerAlpha(rectF2, (int) (this.f56204y * 255.0f), 31);
        } else {
            i3 = round;
            f10 = 1.0f;
            canvas.save();
        }
        float f12 = (this.f56204y * 0.5f) + 0.5f;
        canvas.scale(f12, f12, width, height);
        path.rewind();
        Path.Direction direction = Path.Direction.CW;
        path.addCircle(width, height, min, direction);
        canvas.clipPath(path);
        int round3 = Math.round(3.5f);
        rect.set(i3 - round3, round2 - round3, i3 + round3, round2 + round3);
        rectF.set(width - min, height - min, width + min, height + min);
        canvas.drawBitmap(this.f56194a, rect, rectF, (Paint) null);
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
        canvas.drawPath(path, this.f56196c);
        float f18 = f13 / 2.0f;
        rectF.set(width - f18, height - f18, width + f18, height + f18);
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(f10), org.telegram.messenger.g0.L(f10), paint);
        canvas.restore();
    }

    @Override
    public final void onSizeChanged(int i3, int i10, int i11, int i12) {
        super.onSizeChanged(i3, i10, i11, i12);
        if (i3 != 0 && i10 != 0 && i11 != 0 && i12 != 0 && isLaidOut()) {
            this.f56197e = (i11 * this.f56197e) / i3;
            this.f56198f = (i12 * this.f56198f) / i10;
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
                this.f56197e = motionEvent.getX() / getWidth();
                this.f56198f = motionEvent.getY() / getHeight();
                invalidate();
                return true;
            }
            a(true);
            return true;
        }
        this.f56197e = motionEvent.getX() / getWidth();
        this.f56198f = motionEvent.getY() / getHeight();
        invalidate();
        getParent().requestDisallowInterceptTouchEvent(true);
        return true;
    }

    public void setColorListener(q0.a aVar) {
        this.f56203x = aVar;
    }
}
