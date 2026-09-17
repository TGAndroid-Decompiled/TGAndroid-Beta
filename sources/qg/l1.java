package qg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ml0;
import org.telegram.ui.Components.qr;
public abstract class l1 extends ml0 {
    public static final Paint f41466c3;
    public static final Paint f41467d3;
    public static final Path f41468e3;
    public static final Paint f41469f3;
    public final Paint X2;
    public final Paint Y2;
    public int Z2;
    public pg.s0 f41470a3;
    public q0.a f41471b3;

    static {
        Paint paint = new Paint(1);
        f41466c3 = paint;
        Paint paint2 = new Paint(1);
        f41467d3 = paint2;
        paint.setColor(-2013265920);
        paint2.setColor(-1996488705);
        f41468e3 = new Path();
        f41469f3 = new Paint(1);
    }

    public l1(Context context) {
        super(context, null);
        this.X2 = new Paint(1);
        Paint paint = new Paint(1);
        this.Y2 = paint;
        this.Z2 = -1;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        setLayoutManager(new s4.s(7));
        setAdapter(new j1(this, context));
        setOverScrollMode(2);
        setOnItemClickListener(new ai.g(this, 15));
    }

    public static void x1(Canvas canvas, RectF rectF, int i10) {
        float f7 = rectF.left;
        while (f7 <= rectF.right) {
            float f10 = rectF.top;
            while (f10 <= rectF.bottom) {
                float f11 = i10;
                float f12 = f7 + f11;
                float f13 = f10 + f11;
                Paint paint = f41466c3;
                Canvas canvas2 = canvas;
                canvas2.drawRect(f7, f10, f12, f13, paint);
                float f14 = i10 * 2;
                float f15 = f7 + f14;
                Paint paint2 = f41467d3;
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

    public static void y1(float f7, float f10, float f11, int i10, Canvas canvas) {
        Paint paint = f41469f3;
        paint.setColor(i10);
        if (paint.getAlpha() != 255) {
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(f7 - f11, f10 - f11, f7 + f11, f10 + f11);
            paint.setAlpha(255);
            canvas.drawArc(rectF, -45.0f, -180.0f, true, paint);
            Path path = f41468e3;
            path.rewind();
            path.moveTo(rectF.centerX(), rectF.centerY());
            path.lineTo((float) hg.k0.e(-1.5707963267948966d, rectF.width() / 2.0f, rectF.centerX()), (float) ((Math.sin(-1.5707963267948966d) * (rectF.height() / 2.0f)) + rectF.centerY()));
            path.moveTo(rectF.centerX(), rectF.centerY());
            path.lineTo((float) hg.k0.e(4.71238898038469d, rectF.width() / 2.0f, rectF.centerX()), (float) ((Math.sin(4.71238898038469d) * (rectF.height() / 2.0f)) + rectF.centerY()));
            path.addArc(rectF, -45.0f, 180.0f);
            canvas.save();
            canvas.clipPath(path);
            x1(canvas, rectF, AndroidUtilities.dp(4.0f));
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
        this.f41471b3 = aVar;
    }

    public void setColorPalette(pg.s0 s0Var) {
        this.f41470a3 = s0Var;
        getAdapter().l();
    }

    public void setSelectedColorIndex(int i10) {
        this.Z2 = i10;
        getAdapter().l();
    }

    public final void z1(float f7, boolean z10) {
        float interpolation;
        float f10;
        if (z10) {
            interpolation = qr.f27381g.getInterpolation(f7);
        } else {
            interpolation = qr.f27382i.getInterpolation(f7);
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
