package ph;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.io.File;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.mr;
public abstract class x5 extends FrameLayout {
    public float B;
    public final w5 f42592a;
    public final File f42593b;
    public long f42594c;
    public long d;
    public final Paint e;
    public final Paint f42595f;
    public final t5 h;
    public nh.a0 f42596n;
    public l f42597r;
    public float f42598s;
    public dg.b3 v;
    public ValueAnimator f42599w;
    public boolean f42600x;
    public ValueAnimator f42601y;

    public x5(Context context) {
        super(context);
        this.f42594c = -1L;
        this.d = -1L;
        this.e = new Paint(1);
        Paint paint = new Paint(1);
        this.f42595f = paint;
        this.h = new t5(this, 0);
        this.f42598s = 1.0f;
        this.f42600x = false;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        this.f42593b = t6.x(UserConfig.selectedAccount, true);
        w5 w5Var = new w5(this, context);
        this.f42592a = w5Var;
        w5Var.setScaleX(0.0f);
        w5Var.setScaleY(0.0f);
        addView(w5Var);
        w5Var.setDelegate(new u5(this));
        w5Var.initTexture();
        setWillNotDraw(false);
    }

    public final void a(boolean z4) {
        l lVar = this.f42597r;
        if (lVar != null) {
            lVar.run();
            this.f42597r = null;
        }
        AndroidUtilities.cancelRunOnUIThread(this.h);
        this.f42592a.destroy(true, null);
        try {
            this.f42593b.delete();
        } catch (Exception unused) {
        }
        if (z4) {
            if (getParent() instanceof ViewGroup) {
                ((ViewGroup) getParent()).removeView(this);
                return;
            }
            return;
        }
        ValueAnimator valueAnimator = this.f42601y;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.B, 1.0f);
        this.f42601y = ofFloat;
        ofFloat.addUpdateListener(new nh.e5(this, 20));
        this.f42601y.addListener(new j2(this, 4));
        this.f42601y.setInterpolator(mr.h);
        this.f42601y.setDuration(280L);
        this.f42601y.start();
    }

    public final long b() {
        if (this.f42594c < 0) {
            return 0L;
        }
        long j10 = this.d;
        if (j10 < 0) {
            j10 = System.currentTimeMillis();
        }
        return Math.min(59500L, j10 - this.f42594c);
    }

    public abstract void c();

    @Override
    public final void dispatchDraw(Canvas canvas) {
        RectF rectF = AndroidUtilities.rectTmp;
        w5 w5Var = this.f42592a;
        rectF.set(((1.0f - w5Var.getScaleX()) * (w5Var.getWidth() / 2.0f)) + w5Var.getX(), ((1.0f - w5Var.getScaleY()) * (w5Var.getHeight() / 2.0f)) + w5Var.getY(), (w5Var.getX() + w5Var.getWidth()) - ((1.0f - w5Var.getScaleX()) * (w5Var.getWidth() / 2.0f)), (w5Var.getY() + w5Var.getHeight()) - ((1.0f - w5Var.getScaleY()) * (w5Var.getHeight() / 2.0f)));
        int l1 = org.telegram.ui.ActionBar.j6.l1(this.f42598s, 536870912);
        Paint paint = this.e;
        paint.setShadowLayer(AndroidUtilities.dp(2.0f), 0.0f, AndroidUtilities.dp(0.66f), l1);
        paint.setAlpha((int) (this.f42598s * 255.0f));
        canvas.drawCircle(rectF.centerX(), rectF.centerY(), Math.min(rectF.width() / 2.0f, rectF.height() / 2.0f) - 1.0f, paint);
        super.dispatchDraw(canvas);
        dg.b3 b3Var = this.v;
        if (b3Var != null && b3Var.getWidth() > 0 && this.v.getHeight() > 0) {
            canvas.save();
            canvas.translate(rectF.left, rectF.top);
            canvas.scale(rectF.width() / this.v.getWidth(), rectF.height() / this.v.getHeight());
            float alpha = this.v.getAlpha();
            this.v.setDraw(true);
            this.v.setAlpha(1.0f - this.f42598s);
            this.v.draw(canvas);
            this.v.setAlpha(alpha);
            this.v.setDraw(false);
            canvas.restore();
        }
        if (this.f42594c > 0) {
            float clamp = Utilities.clamp(((float) b()) / 59500.0f, 1.0f, 0.0f);
            Paint paint2 = this.f42595f;
            paint2.setStrokeWidth(AndroidUtilities.dp(3.33f));
            paint2.setColor(org.telegram.ui.ActionBar.j6.l1(this.f42598s, -1090519041));
            paint2.setShadowLayer(AndroidUtilities.dp(1.0f), 0.0f, AndroidUtilities.dp(0.33f), org.telegram.ui.ActionBar.j6.l1(this.f42598s, 536870912));
            rectF.inset(-AndroidUtilities.dp(7.665f), -AndroidUtilities.dp(7.665f));
            canvas.drawArc(rectF, -90.0f, clamp * 360.0f, false, paint2);
            if (this.d <= 0) {
                invalidate();
            }
        }
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        w5 w5Var = this.f42592a;
        int measuredWidth = ((i12 - i10) - w5Var.getMeasuredWidth()) - AndroidUtilities.dp(16.0f);
        int dp = AndroidUtilities.dp(72.0f);
        w5Var.layout(measuredWidth, dp, w5Var.getMeasuredWidth() + measuredWidth, w5Var.getMeasuredHeight() + dp);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        int min = (int) (Math.min(size, size2) * 0.43f);
        this.f42592a.measure(View.MeasureSpec.makeMeasureSpec(min, 1073741824), View.MeasureSpec.makeMeasureSpec(min, 1073741824));
        setMeasuredDimension(size, size2);
    }
}
