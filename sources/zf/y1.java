package zf;

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
import org.telegram.ui.Components.er;
import org.telegram.ui.n40;

public abstract class y1 extends View {

    public Bitmap f50780a;

    public Paint f50781b;

    public Paint f50782c;
    public Paint d;

    public float f50783e;

    public float f50784f;
    public Path h;

    public Rect f50785n;

    public RectF f50786r;

    public int f50787s;
    public boolean v;

    public q0.a f50788w;

    public float f50789x;

    public final void a(boolean z10) {
        if (this.v) {
            return;
        }
        this.v = true;
        ValueAnimator duration = ValueAnimator.ofFloat(1.0f, 0.0f).setDuration(150L);
        duration.setInterpolator(er.f28122f);
        duration.addUpdateListener(new lh.m2(this, 24));
        duration.addListener(new n40(17, this, z10));
        duration.start();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ((yf.n) this).f49985y.f50116n.d();
        this.f50780a.recycle();
        this.f50780a = null;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f10;
        Rect rect = this.f50785n;
        Paint paint = this.f50781b;
        RectF rectF = this.f50786r;
        Path path = this.h;
        super.onDraw(canvas);
        float fMin = Math.min(getWidth(), getHeight()) * 0.2f;
        float width = this.f50783e * getWidth();
        float height = this.f50784f * getHeight();
        int iRound = Math.round(this.f50783e * this.f50780a.getWidth());
        int iRound2 = Math.round(this.f50784f * this.f50780a.getHeight());
        Bitmap bitmap = this.f50780a;
        int pixel = bitmap.getPixel(Utilities.clamp(iRound, bitmap.getWidth() - 1, 0), Utilities.clamp(iRound2, this.f50780a.getHeight() - 1, 0));
        this.f50787s = pixel;
        Paint paint2 = this.d;
        paint2.setColor(pixel);
        float f11 = this.f50789x;
        if (f11 == 0.0f || f11 == 1.0f) {
            f10 = 1.0f;
            canvas.save();
        } else {
            RectF rectF2 = AndroidUtilities.rectTmp;
            f10 = 1.0f;
            rectF2.set(width - fMin, height - fMin, width + fMin, height + fMin);
            canvas.saveLayerAlpha(rectF2, (int) (this.f50789x * 255.0f), 31);
        }
        float f12 = (this.f50789x * 0.5f) + 0.5f;
        canvas.scale(f12, f12, width, height);
        path.rewind();
        Path.Direction direction = Path.Direction.CW;
        path.addCircle(width, height, fMin, direction);
        canvas.clipPath(path);
        int iRound3 = Math.round(3.5f);
        rect.set(iRound - iRound3, iRound2 - iRound3, iRound + iRound3, iRound2 + iRound3);
        rectF.set(width - fMin, height - fMin, width + fMin, height + fMin);
        canvas.drawBitmap(this.f50780a, rect, rectF, (Paint) null);
        float strokeWidth = fMin - (paint2.getStrokeWidth() / 2.0f);
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
        canvas.drawPath(path, this.f50782c);
        float f18 = f13 / 2.0f;
        rectF.set(width - f18, height - f18, width + f18, height + f18);
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(f10), AndroidUtilities.dp(f10), paint);
        canvas.restore();
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (i10 == 0 || i11 == 0 || i12 == 0 || i13 == 0 || !isLaidOut()) {
            return;
        }
        this.f50783e = (i12 * this.f50783e) / i10;
        this.f50784f = (i13 * this.f50784f) / i11;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f50783e = motionEvent.getX() / getWidth();
            this.f50784f = motionEvent.getY() / getHeight();
            invalidate();
            getParent().requestDisallowInterceptTouchEvent(true);
            return true;
        }
        if (actionMasked == 1) {
            a(true);
            return true;
        }
        if (actionMasked != 2) {
            if (actionMasked != 3) {
                return true;
            }
            a(false);
            return true;
        }
        this.f50783e = motionEvent.getX() / getWidth();
        this.f50784f = motionEvent.getY() / getHeight();
        invalidate();
        return true;
    }

    public void setColorListener(q0.a aVar) {
        this.f50788w = aVar;
    }
}
