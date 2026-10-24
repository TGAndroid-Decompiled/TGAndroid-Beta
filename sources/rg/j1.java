package rg;

import ai.xa;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.lm0;
import org.telegram.ui.Components.zr;
public abstract class j1 extends lm0 {
    public static final Paint f45830d3;
    public static final Paint f45831e3;
    public static final Path f45832f3;
    public static final Paint f45833g3;
    public final Paint Y2;
    public final Paint Z2;
    public int f45834a3;
    public qg.u0 f45835b3;
    public q0.a f45836c3;

    static {
        Paint paint = new Paint(1);
        f45830d3 = paint;
        Paint paint2 = new Paint(1);
        f45831e3 = paint2;
        paint.setColor(-2013265920);
        paint2.setColor(-1996488705);
        f45832f3 = new Path();
        f45833g3 = new Paint(1);
    }

    public j1(Context context) {
        super(context, null);
        this.Y2 = new Paint(1);
        Paint paint = new Paint(1);
        this.Z2 = paint;
        this.f45834a3 = -1;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        setLayoutManager(new s4.s(7));
        setAdapter(new h1(this, context));
        setOverScrollMode(2);
        setOnItemClickListener(new xa(this, 19));
    }

    public static void C1(Canvas canvas, RectF rectF, int i10) {
        float f7 = rectF.left;
        while (f7 <= rectF.right) {
            float f10 = rectF.top;
            while (f10 <= rectF.bottom) {
                float f11 = i10;
                float f12 = f7 + f11;
                float f13 = f10 + f11;
                Paint paint = f45830d3;
                Canvas canvas2 = canvas;
                canvas2.drawRect(f7, f10, f12, f13, paint);
                float f14 = i10 * 2;
                float f15 = f7 + f14;
                Paint paint2 = f45831e3;
                float f16 = f10;
                canvas2.drawRect(f12, f16, f15, f13, paint2);
                float f17 = f16 + f14;
                canvas2.drawRect(f12, f13, f15, f17, paint);
                canvas2.drawRect(f7, f13, f12, f17, paint2);
                canvas = canvas2;
                f10 = f17;
            }
            f7 += i10 * 2;
            canvas = canvas;
        }
    }

    public static void D1(float f7, float f10, float f11, int i10, Canvas canvas) {
        Paint paint = f45833g3;
        paint.setColor(i10);
        if (paint.getAlpha() != 255) {
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(f7 - f11, f10 - f11, f7 + f11, f10 + f11);
            paint.setAlpha(255);
            canvas.drawArc(rectF, -45.0f, -180.0f, true, paint);
            Path path = f45832f3;
            path.rewind();
            path.moveTo(rectF.centerX(), rectF.centerY());
            path.lineTo((float) i2.o1.f(-1.5707963267948966d, rectF.width() / 2.0f, rectF.centerX()), (float) ((Math.sin(-1.5707963267948966d) * (rectF.height() / 2.0f)) + rectF.centerY()));
            path.moveTo(rectF.centerX(), rectF.centerY());
            path.lineTo((float) i2.o1.f(4.71238898038469d, rectF.width() / 2.0f, rectF.centerX()), (float) ((Math.sin(4.71238898038469d) * (rectF.height() / 2.0f)) + rectF.centerY()));
            path.addArc(rectF, -45.0f, 180.0f);
            canvas.save();
            canvas.clipPath(path);
            C1(canvas, rectF, AndroidUtilities.dp(4.0f));
            canvas.restore();
            paint.setColor(i10);
            canvas.drawArc(rectF, -45.0f, 180.0f, true, paint);
            return;
        }
        canvas.drawCircle(f7, f10, f11, paint);
    }

    public final void E1(float f7, boolean z10) {
        float interpolation;
        float f10;
        if (z10) {
            interpolation = zr.f33338g.getInterpolation(f7);
        } else {
            interpolation = zr.f33339i.getInterpolation(f7);
        }
        float childCount = 1.0f / (getChildCount() - 1);
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (i10 == 0) {
                if (interpolation == 1.0f) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                childAt.setAlpha(f10);
            } else {
                float f11 = i10 * childCount;
                float min = Math.min(interpolation, f11) / f11;
                childAt.setScaleX(min);
                childAt.setScaleY(min);
            }
        }
        invalidate();
    }

    public int getSelectedColorIndex() {
        return this.f45834a3;
    }

    public void setColorListener(q0.a aVar) {
        this.f45836c3 = aVar;
    }

    public void setColorPalette(qg.u0 u0Var) {
        this.f45835b3 = u0Var;
        getAdapter().l();
    }

    public void setSelectedColorIndex(int i10) {
        this.f45834a3 = i10;
        getAdapter().l();
    }
}
