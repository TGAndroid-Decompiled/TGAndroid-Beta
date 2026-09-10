package pg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.vl0;
import org.telegram.ui.Components.wr;
public abstract class i1 extends vl0 {
    public static final Paint f40024c3;
    public static final Paint f40025d3;
    public static final Path f40026e3;
    public static final Paint f40027f3;
    public final Paint X2;
    public final Paint Y2;
    public int Z2;
    public og.x0 f40028a3;
    public q0.a f40029b3;

    static {
        Paint paint = new Paint(1);
        f40024c3 = paint;
        Paint paint2 = new Paint(1);
        f40025d3 = paint2;
        paint.setColor(-2013265920);
        paint2.setColor(-1996488705);
        f40026e3 = new Path();
        f40027f3 = new Paint(1);
    }

    public i1(Context context) {
        super(context, null);
        this.X2 = new Paint(1);
        Paint paint = new Paint(1);
        this.Y2 = paint;
        this.Z2 = -1;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        setLayoutManager(new s4.s(7));
        setAdapter(new g1(this, context));
        setOverScrollMode(2);
        setOnItemClickListener(new ai.g(this, 14));
    }

    public static void v1(Canvas canvas, RectF rectF, int i10) {
        float f7 = rectF.left;
        while (f7 <= rectF.right) {
            float f10 = rectF.top;
            while (f10 <= rectF.bottom) {
                float f11 = i10;
                float f12 = f7 + f11;
                float f13 = f10 + f11;
                Paint paint = f40024c3;
                Canvas canvas2 = canvas;
                canvas2.drawRect(f7, f10, f12, f13, paint);
                float f14 = i10 * 2;
                float f15 = f7 + f14;
                Paint paint2 = f40025d3;
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

    public static void w1(float f7, float f10, float f11, int i10, Canvas canvas) {
        Paint paint = f40027f3;
        paint.setColor(i10);
        if (paint.getAlpha() != 255) {
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(f7 - f11, f10 - f11, f7 + f11, f10 + f11);
            paint.setAlpha(255);
            canvas.drawArc(rectF, -45.0f, -180.0f, true, paint);
            Path path = f40026e3;
            path.rewind();
            path.moveTo(rectF.centerX(), rectF.centerY());
            path.lineTo((float) hc.b.f(-1.5707963267948966d, rectF.width() / 2.0f, rectF.centerX()), (float) ((Math.sin(-1.5707963267948966d) * (rectF.height() / 2.0f)) + rectF.centerY()));
            path.moveTo(rectF.centerX(), rectF.centerY());
            path.lineTo((float) hc.b.f(4.71238898038469d, rectF.width() / 2.0f, rectF.centerX()), (float) ((Math.sin(4.71238898038469d) * (rectF.height() / 2.0f)) + rectF.centerY()));
            path.addArc(rectF, -45.0f, 180.0f);
            canvas.save();
            canvas.clipPath(path);
            v1(canvas, rectF, AndroidUtilities.dp(4.0f));
            canvas.restore();
            paint.setColor(i10);
            canvas.drawArc(rectF, -45.0f, 180.0f, true, paint);
            return;
        }
        canvas.drawCircle(f7, f10, f11, paint);
    }

    public int getSelectedColorIndex() {
        return this.Z2;
    }

    public void setColorListener(q0.a aVar) {
        this.f40029b3 = aVar;
    }

    public void setColorPalette(og.x0 x0Var) {
        this.f40028a3 = x0Var;
        getAdapter().l();
    }

    public void setSelectedColorIndex(int i10) {
        this.Z2 = i10;
        getAdapter().l();
    }

    public final void x1(float f7, boolean z10) {
        float interpolation;
        float f10;
        if (z10) {
            interpolation = wr.f28820g.getInterpolation(f7);
        } else {
            interpolation = wr.f28821i.getInterpolation(f7);
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
}
