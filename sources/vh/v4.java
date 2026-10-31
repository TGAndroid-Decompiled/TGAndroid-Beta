package vh;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.io.File;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.d20;
import org.telegram.ui.Components.gr;
import org.telegram.ui.jo;
public abstract class v4 extends FrameLayout {
    public ValueAnimator D;
    public float E;
    public final u4 f52042a;
    public final File f52043b;
    public long f52044c;
    public long d;
    public final Paint e;
    public final Paint f52045f;
    public final s4 h;
    public jo f52046n;
    public l f52047r;
    public float f52048s;
    public jg.i2 f52049w;
    public ValueAnimator f52050x;
    public boolean f52051y;

    public v4(Context context) {
        super(context);
        this.f52044c = -1L;
        this.d = -1L;
        this.e = new Paint(1);
        Paint paint = new Paint(1);
        this.f52045f = paint;
        this.h = new s4(this, 0);
        this.f52048s = 1.0f;
        this.f52051y = false;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        this.f52043b = n5.x(d20.f15147s0, true);
        u4 u4Var = new u4(this, context);
        this.f52042a = u4Var;
        u4Var.setScaleX(0.0f);
        u4Var.setScaleY(0.0f);
        addView(u4Var);
        u4Var.setDelegate(new t4(this));
        u4Var.initTexture();
        setWillNotDraw(false);
    }

    public final void a(boolean z10) {
        l lVar = this.f52047r;
        if (lVar != null) {
            lVar.run();
            this.f52047r = null;
        }
        org.telegram.messenger.i0.r(this.h);
        this.f52042a.destroy(true, null);
        try {
            this.f52043b.delete();
        } catch (Exception unused) {
        }
        if (z10) {
            if (getParent() instanceof ViewGroup) {
                ((ViewGroup) getParent()).removeView(this);
                return;
            }
            return;
        }
        ValueAnimator valueAnimator = this.D;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.E, 1.0f);
        this.D = ofFloat;
        ofFloat.addUpdateListener(new c4(2, this));
        this.D.addListener(new sg.r(this, 20));
        this.D.setInterpolator(gr.h);
        this.D.setDuration(280L);
        this.D.start();
    }

    public final long b() {
        if (this.f52044c < 0) {
            return 0L;
        }
        long j10 = this.d;
        if (j10 < 0) {
            j10 = System.currentTimeMillis();
        }
        return Math.min(59500L, j10 - this.f52044c);
    }

    public abstract void c();

    @Override
    public final void dispatchDraw(Canvas canvas) {
        RectF rectF = org.telegram.messenger.i0.P;
        u4 u4Var = this.f52042a;
        rectF.set(((1.0f - u4Var.getScaleX()) * (u4Var.getWidth() / 2.0f)) + u4Var.getX(), ((1.0f - u4Var.getScaleY()) * (u4Var.getHeight() / 2.0f)) + u4Var.getY(), (u4Var.getX() + u4Var.getWidth()) - ((1.0f - u4Var.getScaleX()) * (u4Var.getWidth() / 2.0f)), (u4Var.getY() + u4Var.getHeight()) - ((1.0f - u4Var.getScaleY()) * (u4Var.getHeight() / 2.0f)));
        int r12 = org.telegram.ui.ActionBar.t6.r1(this.f52048s, 536870912);
        Paint paint = this.e;
        paint.setShadowLayer(org.telegram.messenger.i0.L(2.0f), 0.0f, org.telegram.messenger.i0.L(0.66f), r12);
        paint.setAlpha((int) (this.f52048s * 255.0f));
        canvas.drawCircle(rectF.centerX(), rectF.centerY(), Math.min(rectF.width() / 2.0f, rectF.height() / 2.0f) - 1.0f, paint);
        super.dispatchDraw(canvas);
        jg.i2 i2Var = this.f52049w;
        if (i2Var != null && i2Var.getWidth() > 0 && this.f52049w.getHeight() > 0) {
            canvas.save();
            canvas.translate(rectF.left, rectF.top);
            canvas.scale(rectF.width() / this.f52049w.getWidth(), rectF.height() / this.f52049w.getHeight());
            float alpha = this.f52049w.getAlpha();
            this.f52049w.setDraw(true);
            this.f52049w.setAlpha(1.0f - this.f52048s);
            this.f52049w.draw(canvas);
            this.f52049w.setAlpha(alpha);
            this.f52049w.setDraw(false);
            canvas.restore();
        }
        if (this.f52044c > 0) {
            float i10 = Utilities.i(((float) b()) / 59500.0f, 1.0f, 0.0f);
            Paint paint2 = this.f52045f;
            paint2.setStrokeWidth(org.telegram.messenger.i0.L(3.33f));
            paint2.setColor(org.telegram.ui.ActionBar.t6.r1(this.f52048s, -1090519041));
            paint2.setShadowLayer(org.telegram.messenger.i0.L(1.0f), 0.0f, org.telegram.messenger.i0.L(0.33f), org.telegram.ui.ActionBar.t6.r1(this.f52048s, 536870912));
            rectF.inset(-org.telegram.messenger.i0.L(7.665f), -org.telegram.messenger.i0.L(7.665f));
            canvas.drawArc(rectF, -90.0f, i10 * 360.0f, false, paint2);
            if (this.d <= 0) {
                invalidate();
            }
        }
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        u4 u4Var = this.f52042a;
        int measuredWidth = ((i12 - i10) - u4Var.getMeasuredWidth()) - org.telegram.messenger.i0.L(16.0f);
        int L = org.telegram.messenger.i0.L(72.0f);
        u4Var.layout(measuredWidth, L, u4Var.getMeasuredWidth() + measuredWidth, u4Var.getMeasuredHeight() + L);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        int min = (int) (Math.min(size, size2) * 0.43f);
        this.f52042a.measure(View.MeasureSpec.makeMeasureSpec(min, 1073741824), View.MeasureSpec.makeMeasureSpec(min, 1073741824));
        setMeasuredDimension(size, size2);
    }
}
