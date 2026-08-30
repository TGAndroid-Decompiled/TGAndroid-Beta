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
import org.telegram.ui.Components.nr;
public abstract class y5 extends FrameLayout {
    public float B;
    public final x5 f42619a;
    public final File f42620b;
    public long f42621c;
    public long d;
    public final Paint e;
    public final Paint f42622f;
    public final u5 h;
    public nh.a0 f42623n;
    public l f42624r;
    public float f42625s;
    public dg.b3 v;
    public ValueAnimator f42626w;
    public boolean f42627x;
    public ValueAnimator f42628y;

    public y5(Context context) {
        super(context);
        this.f42621c = -1L;
        this.d = -1L;
        this.e = new Paint(1);
        Paint paint = new Paint(1);
        this.f42622f = paint;
        this.h = new u5(this, 0);
        this.f42625s = 1.0f;
        this.f42627x = false;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        this.f42620b = u6.x(UserConfig.selectedAccount, true);
        x5 x5Var = new x5(this, context);
        this.f42619a = x5Var;
        x5Var.setScaleX(0.0f);
        x5Var.setScaleY(0.0f);
        addView(x5Var);
        x5Var.setDelegate(new v5(this));
        x5Var.initTexture();
        setWillNotDraw(false);
    }

    public final void a(boolean z4) {
        l lVar = this.f42624r;
        if (lVar != null) {
            lVar.run();
            this.f42624r = null;
        }
        AndroidUtilities.cancelRunOnUIThread(this.h);
        this.f42619a.destroy(true, null);
        try {
            this.f42620b.delete();
        } catch (Exception unused) {
        }
        if (z4) {
            if (getParent() instanceof ViewGroup) {
                ((ViewGroup) getParent()).removeView(this);
                return;
            }
            return;
        }
        ValueAnimator valueAnimator = this.f42628y;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.B, 1.0f);
        this.f42628y = ofFloat;
        ofFloat.addUpdateListener(new nh.e5(this, 20));
        this.f42628y.addListener(new j2(this, 4));
        this.f42628y.setInterpolator(nr.h);
        this.f42628y.setDuration(280L);
        this.f42628y.start();
    }

    public final long b() {
        if (this.f42621c < 0) {
            return 0L;
        }
        long j10 = this.d;
        if (j10 < 0) {
            j10 = System.currentTimeMillis();
        }
        return Math.min(59500L, j10 - this.f42621c);
    }

    public abstract void c();

    @Override
    public final void dispatchDraw(Canvas canvas) {
        RectF rectF = AndroidUtilities.rectTmp;
        x5 x5Var = this.f42619a;
        rectF.set(((1.0f - x5Var.getScaleX()) * (x5Var.getWidth() / 2.0f)) + x5Var.getX(), ((1.0f - x5Var.getScaleY()) * (x5Var.getHeight() / 2.0f)) + x5Var.getY(), (x5Var.getX() + x5Var.getWidth()) - ((1.0f - x5Var.getScaleX()) * (x5Var.getWidth() / 2.0f)), (x5Var.getY() + x5Var.getHeight()) - ((1.0f - x5Var.getScaleY()) * (x5Var.getHeight() / 2.0f)));
        int l1 = org.telegram.ui.ActionBar.j6.l1(this.f42625s, 536870912);
        Paint paint = this.e;
        paint.setShadowLayer(AndroidUtilities.dp(2.0f), 0.0f, AndroidUtilities.dp(0.66f), l1);
        paint.setAlpha((int) (this.f42625s * 255.0f));
        canvas.drawCircle(rectF.centerX(), rectF.centerY(), Math.min(rectF.width() / 2.0f, rectF.height() / 2.0f) - 1.0f, paint);
        super.dispatchDraw(canvas);
        dg.b3 b3Var = this.v;
        if (b3Var != null && b3Var.getWidth() > 0 && this.v.getHeight() > 0) {
            canvas.save();
            canvas.translate(rectF.left, rectF.top);
            canvas.scale(rectF.width() / this.v.getWidth(), rectF.height() / this.v.getHeight());
            float alpha = this.v.getAlpha();
            this.v.setDraw(true);
            this.v.setAlpha(1.0f - this.f42625s);
            this.v.draw(canvas);
            this.v.setAlpha(alpha);
            this.v.setDraw(false);
            canvas.restore();
        }
        if (this.f42621c > 0) {
            float clamp = Utilities.clamp(((float) b()) / 59500.0f, 1.0f, 0.0f);
            Paint paint2 = this.f42622f;
            paint2.setStrokeWidth(AndroidUtilities.dp(3.33f));
            paint2.setColor(org.telegram.ui.ActionBar.j6.l1(this.f42625s, -1090519041));
            paint2.setShadowLayer(AndroidUtilities.dp(1.0f), 0.0f, AndroidUtilities.dp(0.33f), org.telegram.ui.ActionBar.j6.l1(this.f42625s, 536870912));
            rectF.inset(-AndroidUtilities.dp(7.665f), -AndroidUtilities.dp(7.665f));
            canvas.drawArc(rectF, -90.0f, clamp * 360.0f, false, paint2);
            if (this.d <= 0) {
                invalidate();
            }
        }
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        x5 x5Var = this.f42619a;
        int measuredWidth = ((i12 - i10) - x5Var.getMeasuredWidth()) - AndroidUtilities.dp(16.0f);
        int dp = AndroidUtilities.dp(72.0f);
        x5Var.layout(measuredWidth, dp, x5Var.getMeasuredWidth() + measuredWidth, x5Var.getMeasuredHeight() + dp);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        int min = (int) (Math.min(size, size2) * 0.43f);
        this.f42619a.measure(View.MeasureSpec.makeMeasureSpec(min, 1073741824), View.MeasureSpec.makeMeasureSpec(min, 1073741824));
        setMeasuredDimension(size, size2);
    }
}
