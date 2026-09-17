package rg;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.pr;
import org.telegram.ui.e50;
public abstract class a2 extends View {
    public Bitmap f45144a;
    public Paint f45145b;
    public Paint f45146c;
    public Paint d;
    public float f45147e;
    public float f45148f;
    public Path h;
    public Rect f45149n;
    public RectF f45150r;
    public int f45151s;
    public boolean v;
    public q0.a f45152w;
    public float f45153x;

    public final void a(boolean z10) {
        if (this.v) {
            return;
        }
        this.v = true;
        ValueAnimator duration = ValueAnimator.ofFloat(1.0f, 0.0f).setDuration(150L);
        duration.setInterpolator(pr.f29494f);
        duration.addUpdateListener(new ki.a(this, 12));
        duration.addListener(new e50(15, this, z10));
        duration.start();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ((qg.n) this).f44515y.f44649n.d();
        this.f45144a.recycle();
        this.f45144a = null;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10;
        float f7;
        Rect rect = this.f45149n;
        Paint paint = this.f45145b;
        RectF rectF = this.f45150r;
        Path path = this.h;
        super.onDraw(canvas);
        float min = Math.min(getWidth(), getHeight()) * 0.2f;
        float width = this.f45147e * getWidth();
        float height = this.f45148f * getHeight();
        int round = Math.round(this.f45147e * this.f45144a.getWidth());
        int round2 = Math.round(this.f45148f * this.f45144a.getHeight());
        Bitmap bitmap = this.f45144a;
        int pixel = bitmap.getPixel(Utilities.clamp(round, bitmap.getWidth() - 1, 0), Utilities.clamp(round2, this.f45144a.getHeight() - 1, 0));
        this.f45151s = pixel;
        Paint paint2 = this.d;
        paint2.setColor(pixel);
        float f10 = this.f45153x;
        if (f10 != 0.0f && f10 != 1.0f) {
            RectF rectF2 = AndroidUtilities.rectTmp;
            f7 = 1.0f;
            i10 = round;
            rectF2.set(width - min, height - min, width + min, height + min);
            canvas.saveLayerAlpha(rectF2, (int) (this.f45153x * 255.0f), 31);
        } else {
            i10 = round;
            f7 = 1.0f;
            canvas.save();
        }
        float f11 = (this.f45153x * 0.5f) + 0.5f;
        canvas.scale(f11, f11, width, height);
        path.rewind();
        Path.Direction direction = Path.Direction.CW;
        path.addCircle(width, height, min, direction);
        canvas.clipPath(path);
        int round3 = Math.round(3.5f);
        rect.set(i10 - round3, round2 - round3, i10 + round3, round2 + round3);
        rectF.set(width - min, height - min, width + min, height + min);
        canvas.drawBitmap(this.f45144a, rect, rectF, (Paint) null);
        float strokeWidth = min - (paint2.getStrokeWidth() / 2.0f);
        canvas.drawCircle(width, height, strokeWidth, paint2);
        float strokeWidth2 = (strokeWidth - (paint2.getStrokeWidth() / 2.0f)) - (paint.getStrokeWidth() / 2.0f);
        canvas.drawCircle(width, height, strokeWidth2, paint);
        float strokeWidth3 = strokeWidth2 - (paint.getStrokeWidth() / 2.0f);
        path.rewind();
        path.addCircle(width, height, strokeWidth3, direction);
        canvas.clipPath(path);
        float f12 = (strokeWidth3 * 2.0f) / 8.0f;
        path.rewind();
        for (float f13 = -3.5f; f13 < 4.5f; f13 += f7) {
            float f14 = (f13 * f12) + width;
            path.moveTo(f14, height - strokeWidth3);
            path.lineTo(f14, height + strokeWidth3);
        }
        for (float f15 = -3.5f; f15 < 4.5f; f15 += f7) {
            float f16 = (f15 * f12) + height;
            path.moveTo(width - strokeWidth3, f16);
            path.lineTo(width + strokeWidth3, f16);
        }
        canvas.drawPath(path, this.f45146c);
        float f17 = f12 / 2.0f;
        rectF.set(width - f17, height - f17, width + f17, height + f17);
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(f7), AndroidUtilities.dp(f7), paint);
        canvas.restore();
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (i10 != 0 && i11 != 0 && i12 != 0 && i13 != 0 && isLaidOut()) {
            this.f45147e = (i12 * this.f45147e) / i10;
            this.f45148f = (i13 * this.f45148f) / i11;
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
                this.f45147e = motionEvent.getX() / getWidth();
                this.f45148f = motionEvent.getY() / getHeight();
                invalidate();
                return true;
            }
            a(true);
            return true;
        }
        this.f45147e = motionEvent.getX() / getWidth();
        this.f45148f = motionEvent.getY() / getHeight();
        invalidate();
        getParent().requestDisallowInterceptTouchEvent(true);
        return true;
    }

    public void setColorListener(q0.a aVar) {
        this.f45152w = aVar;
    }
}
