package tg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.wq;
public abstract class y0 extends pj0 {
    public static final Paint j3;
    public static final Paint f56015k3;
    public static final Path f56016l3;
    public static final Paint f56017m3;
    public final Paint f56018e3;
    public final Paint f56019f3;
    public int f56020g3;
    public sg.l0 f56021h3;
    public q0.a f56022i3;

    static {
        Paint paint = new Paint(1);
        j3 = paint;
        Paint paint2 = new Paint(1);
        f56015k3 = paint2;
        paint.setColor(-2013265920);
        paint2.setColor(-1996488705);
        f56016l3 = new Path();
        f56017m3 = new Paint(1);
    }

    public y0(Context context) {
        super(context, null);
        this.f56018e3 = new Paint(1);
        Paint paint = new Paint(1);
        this.f56019f3 = paint;
        this.f56020g3 = -1;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
        setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
        setLayoutManager(new v4.s(7));
        setAdapter(new w0(this, context));
        setOverScrollMode(2);
        setOnItemClickListener(new ai.k(this, 20));
    }

    public static void A1(float f10, float f11, float f12, int i7, Canvas canvas) {
        Paint paint = f56017m3;
        paint.setColor(i7);
        if (paint.getAlpha() != 255) {
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set(f10 - f12, f11 - f12, f10 + f12, f11 + f12);
            paint.setAlpha(255);
            canvas.drawArc(rectF, -45.0f, -180.0f, true, paint);
            Path path = f56016l3;
            path.rewind();
            path.moveTo(rectF.centerX(), rectF.centerY());
            path.lineTo((float) jg.g.d(-1.5707963267948966d, rectF.width() / 2.0f, rectF.centerX()), (float) ((Math.sin(-1.5707963267948966d) * (rectF.height() / 2.0f)) + rectF.centerY()));
            path.moveTo(rectF.centerX(), rectF.centerY());
            path.lineTo((float) jg.g.d(4.71238898038469d, rectF.width() / 2.0f, rectF.centerX()), (float) ((Math.sin(4.71238898038469d) * (rectF.height() / 2.0f)) + rectF.centerY()));
            path.addArc(rectF, -45.0f, 180.0f);
            canvas.save();
            canvas.clipPath(path);
            z1(canvas, rectF, org.telegram.messenger.g0.L(4.0f));
            canvas.restore();
            paint.setColor(i7);
            canvas.drawArc(rectF, -45.0f, 180.0f, true, paint);
            return;
        }
        canvas.drawCircle(f10, f11, f12, paint);
    }

    public static void z1(Canvas canvas, RectF rectF, int i7) {
        float f10 = rectF.left;
        while (f10 <= rectF.right) {
            float f11 = rectF.top;
            while (f11 <= rectF.bottom) {
                float f12 = i7;
                float f13 = f10 + f12;
                float f14 = f11 + f12;
                Paint paint = j3;
                Canvas canvas2 = canvas;
                canvas2.drawRect(f10, f11, f13, f14, paint);
                float f15 = i7 * 2;
                float f16 = f10 + f15;
                Paint paint2 = f56015k3;
                float f17 = f11;
                canvas2.drawRect(f13, f17, f16, f14, paint2);
                float f18 = f17 + f15;
                canvas2.drawRect(f13, f14, f16, f18, paint);
                canvas2.drawRect(f10, f14, f13, f18, paint2);
                canvas = canvas2;
                f11 = f18;
            }
            f10 += i7 * 2;
            canvas = canvas;
        }
    }

    public final void B1(boolean z9, float f10) {
        float interpolation;
        float f11;
        if (z9) {
            interpolation = wq.f40047g.getInterpolation(f10);
        } else {
            interpolation = wq.f40048i.getInterpolation(f10);
        }
        float childCount = 1.0f / (getChildCount() - 1);
        for (int i7 = 0; i7 < getChildCount(); i7++) {
            View childAt = getChildAt(i7);
            if (i7 == 0) {
                if (interpolation == 1.0f) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                childAt.setAlpha(f11);
            } else {
                float f12 = i7 * childCount;
                float min = Math.min(interpolation, f12) / f12;
                childAt.setScaleX(min);
                childAt.setScaleY(min);
            }
        }
        invalidate();
    }

    public int getSelectedColorIndex() {
        return this.f56020g3;
    }

    public void setColorListener(q0.a aVar) {
        this.f56022i3 = aVar;
    }

    public void setColorPalette(sg.l0 l0Var) {
        this.f56021h3 = l0Var;
        getAdapter().f();
    }

    public void setSelectedColorIndex(int i7) {
        this.f56020g3 = i7;
        getAdapter().f();
    }
}
