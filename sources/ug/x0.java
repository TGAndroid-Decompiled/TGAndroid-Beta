package ug;

import ai.j6;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.Components.xq;
public abstract class x0 extends tj0 {
    public static final Paint f56294k3;
    public static final Paint f56295l3;
    public static final Path f56296m3;
    public static final Paint f56297n3;
    public final Paint f56298f3;
    public final Paint f56299g3;
    public int f56300h3;
    public tg.k0 i3;
    public q0.a f56301j3;

    static {
        Paint paint = new Paint(1);
        f56294k3 = paint;
        Paint paint2 = new Paint(1);
        f56295l3 = paint2;
        paint.setColor(-2013265920);
        paint2.setColor(-1996488705);
        f56296m3 = new Path();
        f56297n3 = new Paint(1);
    }

    public x0(Context context) {
        super(context, null);
        this.f56298f3 = new Paint(1);
        Paint paint = new Paint(1);
        this.f56299g3 = paint;
        this.f56300h3 = -1;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
        setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
        setLayoutManager(new u4.s(7));
        setAdapter(new v0(this, context));
        setOverScrollMode(2);
        setOnItemClickListener(new j6(this, 21));
    }

    public static void A1(float f10, float f11, float f12, int i3, Canvas canvas) {
        Paint paint = f56297n3;
        paint.setColor(i3);
        if (paint.getAlpha() != 255) {
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set(f10 - f12, f11 - f12, f10 + f12, f11 + f12);
            paint.setAlpha(255);
            canvas.drawArc(rectF, -45.0f, -180.0f, true, paint);
            Path path = f56296m3;
            path.rewind();
            path.moveTo(rectF.centerX(), rectF.centerY());
            path.lineTo((float) k2.p1.c(-1.5707963267948966d, rectF.width() / 2.0f, rectF.centerX()), (float) ((Math.sin(-1.5707963267948966d) * (rectF.height() / 2.0f)) + rectF.centerY()));
            path.moveTo(rectF.centerX(), rectF.centerY());
            path.lineTo((float) k2.p1.c(4.71238898038469d, rectF.width() / 2.0f, rectF.centerX()), (float) ((Math.sin(4.71238898038469d) * (rectF.height() / 2.0f)) + rectF.centerY()));
            path.addArc(rectF, -45.0f, 180.0f);
            canvas.save();
            canvas.clipPath(path);
            z1(canvas, rectF, org.telegram.messenger.g0.L(4.0f));
            canvas.restore();
            paint.setColor(i3);
            canvas.drawArc(rectF, -45.0f, 180.0f, true, paint);
            return;
        }
        canvas.drawCircle(f10, f11, f12, paint);
    }

    public static void z1(Canvas canvas, RectF rectF, int i3) {
        float f10 = rectF.left;
        while (f10 <= rectF.right) {
            float f11 = rectF.top;
            while (f11 <= rectF.bottom) {
                float f12 = i3;
                float f13 = f10 + f12;
                float f14 = f11 + f12;
                Paint paint = f56294k3;
                Canvas canvas2 = canvas;
                canvas2.drawRect(f10, f11, f13, f14, paint);
                float f15 = i3 * 2;
                float f16 = f10 + f15;
                Paint paint2 = f56295l3;
                float f17 = f11;
                canvas2.drawRect(f13, f17, f16, f14, paint2);
                float f18 = f17 + f15;
                canvas2.drawRect(f13, f14, f16, f18, paint);
                canvas2.drawRect(f10, f14, f13, f18, paint2);
                canvas = canvas2;
                f11 = f18;
            }
            f10 += i3 * 2;
            canvas = canvas;
        }
    }

    public final void B1(boolean z10, float f10) {
        float interpolation;
        float f11;
        if (z10) {
            interpolation = xq.f40453g.getInterpolation(f10);
        } else {
            interpolation = xq.f40454i.getInterpolation(f10);
        }
        float childCount = 1.0f / (getChildCount() - 1);
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            View childAt = getChildAt(i3);
            if (i3 == 0) {
                if (interpolation == 1.0f) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                childAt.setAlpha(f11);
            } else {
                float f12 = i3 * childCount;
                float min = Math.min(interpolation, f12) / f12;
                childAt.setScaleX(min);
                childAt.setScaleY(min);
            }
        }
        invalidate();
    }

    public int getSelectedColorIndex() {
        return this.f56300h3;
    }

    public void setColorListener(q0.a aVar) {
        this.f56301j3 = aVar;
    }

    public void setColorPalette(tg.k0 k0Var) {
        this.i3 = k0Var;
        getAdapter().f();
    }

    public void setSelectedColorIndex(int i3) {
        this.f56300h3 = i3;
        getAdapter().f();
    }
}
