package zf;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.zk0;

public abstract class i1 extends zk0 {
    public static final Paint Y2;
    public static final Paint Z2;
    public static final Path a3;

    public static final Paint f50435b3;
    public final Paint T2;
    public final Paint U2;
    public int V2;
    public yf.r0 W2;
    public q0.a X2;

    static {
        Paint paint = new Paint(1);
        Y2 = paint;
        Paint paint2 = new Paint(1);
        Z2 = paint2;
        paint.setColor(-2013265920);
        paint2.setColor(-1996488705);
        a3 = new Path();
        f50435b3 = new Paint(1);
    }

    public i1(Context context) {
        super(context, null);
        this.T2 = new Paint(1);
        Paint paint = new Paint(1);
        this.U2 = paint;
        this.V2 = -1;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        setLayoutManager(new f2.x(7));
        setAdapter(new g1(this, context));
        setOverScrollMode(2);
        setOnItemClickListener(new ag.p0(this, 24));
    }

    public static void w1(Canvas canvas, RectF rectF, int i10) {
        float f10 = rectF.left;
        while (f10 <= rectF.right) {
            float f11 = rectF.top;
            while (f11 <= rectF.bottom) {
                float f12 = i10;
                float f13 = f10 + f12;
                float f14 = f11 + f12;
                Paint paint = Y2;
                Canvas canvas2 = canvas;
                canvas2.drawRect(f10, f11, f13, f14, paint);
                float f15 = i10 * 2;
                float f16 = f10 + f15;
                Paint paint2 = Z2;
                float f17 = f11;
                canvas2.drawRect(f13, f17, f16, f14, paint2);
                float f18 = f17 + f15;
                canvas2.drawRect(f13, f14, f16, f18, paint);
                canvas2.drawRect(f10, f14, f13, f18, paint2);
                canvas = canvas2;
                f11 = f18;
            }
            f10 += i10 * 2;
            canvas = canvas;
        }
    }

    public static void x1(float f10, float f11, float f12, int i10, Canvas canvas) {
        Paint paint = f50435b3;
        paint.setColor(i10);
        if (paint.getAlpha() == 255) {
            canvas.drawCircle(f10, f11, f12, paint);
            return;
        }
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(f10 - f12, f11 - f12, f10 + f12, f11 + f12);
        paint.setAlpha(255);
        canvas.drawArc(rectF, -45.0f, -180.0f, true, paint);
        Path path = a3;
        path.rewind();
        path.moveTo(rectF.centerX(), rectF.centerY());
        path.lineTo((float) i0.a.b(-1.5707963267948966d, rectF.width() / 2.0f, rectF.centerX()), (float) ((Math.sin(-1.5707963267948966d) * ((double) (rectF.height() / 2.0f))) + ((double) rectF.centerY())));
        path.moveTo(rectF.centerX(), rectF.centerY());
        path.lineTo((float) i0.a.b(4.71238898038469d, rectF.width() / 2.0f, rectF.centerX()), (float) ((Math.sin(4.71238898038469d) * ((double) (rectF.height() / 2.0f))) + ((double) rectF.centerY())));
        path.addArc(rectF, -45.0f, 180.0f);
        canvas.save();
        canvas.clipPath(path);
        w1(canvas, rectF, AndroidUtilities.dp(4.0f));
        canvas.restore();
        paint.setColor(i10);
        canvas.drawArc(rectF, -45.0f, 180.0f, true, paint);
    }

    public int getSelectedColorIndex() {
        return this.V2;
    }

    public void setColorListener(q0.a aVar) {
        this.X2 = aVar;
    }

    public void setColorPalette(yf.r0 r0Var) {
        this.W2 = r0Var;
        getAdapter().l();
    }

    public void setSelectedColorIndex(int i10) {
        this.V2 = i10;
        getAdapter().l();
    }

    public final void y1(float f10, boolean z10) {
        float interpolation = z10 ? er.f28123g.getInterpolation(f10) : er.f28124i.getInterpolation(f10);
        float childCount = 1.0f / (getChildCount() - 1);
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (i10 == 0) {
                childAt.setAlpha(interpolation == 1.0f ? 1.0f : 0.0f);
            } else {
                float f11 = i10 * childCount;
                float fMin = Math.min(interpolation, f11) / f11;
                childAt.setScaleX(fMin);
                childAt.setScaleY(fMin);
            }
        }
        invalidate();
    }
}
