package qh;

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
import org.telegram.ui.Components.pr;
public abstract class v5 extends FrameLayout {
    public float B;
    public final u5 f46210a;
    public final File f46211b;
    public long f46212c;
    public long d;
    public final Paint f46213e;
    public final Paint f46214f;
    public final r5 h;
    public oh.z f46215n;
    public l f46216r;
    public float f46217s;
    public eg.z2 v;
    public ValueAnimator f46218w;
    public boolean f46219x;
    public ValueAnimator f46220y;

    public v5(Context context) {
        super(context);
        this.f46212c = -1L;
        this.d = -1L;
        this.f46213e = new Paint(1);
        Paint paint = new Paint(1);
        this.f46214f = paint;
        this.h = new r5(this, 0);
        this.f46217s = 1.0f;
        this.f46219x = false;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        this.f46211b = r6.x(UserConfig.selectedAccount, true);
        u5 u5Var = new u5(this, context);
        this.f46210a = u5Var;
        u5Var.setScaleX(0.0f);
        u5Var.setScaleY(0.0f);
        addView(u5Var);
        u5Var.setDelegate(new s5(this));
        u5Var.initTexture();
        setWillNotDraw(false);
    }

    public final void a(boolean z4) {
        l lVar = this.f46216r;
        if (lVar != null) {
            lVar.run();
            this.f46216r = null;
        }
        AndroidUtilities.cancelRunOnUIThread(this.h);
        this.f46210a.destroy(true, null);
        try {
            this.f46211b.delete();
        } catch (Exception unused) {
        }
        if (z4) {
            if (getParent() instanceof ViewGroup) {
                ((ViewGroup) getParent()).removeView(this);
                return;
            }
            return;
        }
        ValueAnimator valueAnimator = this.f46220y;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.B, 1.0f);
        this.f46220y = ofFloat;
        ofFloat.addUpdateListener(new oh.f5(this, 20));
        this.f46220y.addListener(new i2(this, 4));
        this.f46220y.setInterpolator(pr.h);
        this.f46220y.setDuration(280L);
        this.f46220y.start();
    }

    public final long b() {
        if (this.f46212c < 0) {
            return 0L;
        }
        long j10 = this.d;
        if (j10 < 0) {
            j10 = System.currentTimeMillis();
        }
        return Math.min(59500L, j10 - this.f46212c);
    }

    public abstract void c();

    @Override
    public final void dispatchDraw(Canvas canvas) {
        RectF rectF = AndroidUtilities.rectTmp;
        u5 u5Var = this.f46210a;
        rectF.set(((1.0f - u5Var.getScaleX()) * (u5Var.getWidth() / 2.0f)) + u5Var.getX(), ((1.0f - u5Var.getScaleY()) * (u5Var.getHeight() / 2.0f)) + u5Var.getY(), (u5Var.getX() + u5Var.getWidth()) - ((1.0f - u5Var.getScaleX()) * (u5Var.getWidth() / 2.0f)), (u5Var.getY() + u5Var.getHeight()) - ((1.0f - u5Var.getScaleY()) * (u5Var.getHeight() / 2.0f)));
        int l1 = org.telegram.ui.ActionBar.k6.l1(this.f46217s, 536870912);
        Paint paint = this.f46213e;
        paint.setShadowLayer(AndroidUtilities.dp(2.0f), 0.0f, AndroidUtilities.dp(0.66f), l1);
        paint.setAlpha((int) (this.f46217s * 255.0f));
        canvas.drawCircle(rectF.centerX(), rectF.centerY(), Math.min(rectF.width() / 2.0f, rectF.height() / 2.0f) - 1.0f, paint);
        super.dispatchDraw(canvas);
        eg.z2 z2Var = this.v;
        if (z2Var != null && z2Var.getWidth() > 0 && this.v.getHeight() > 0) {
            canvas.save();
            canvas.translate(rectF.left, rectF.top);
            canvas.scale(rectF.width() / this.v.getWidth(), rectF.height() / this.v.getHeight());
            float alpha = this.v.getAlpha();
            this.v.setDraw(true);
            this.v.setAlpha(1.0f - this.f46217s);
            this.v.draw(canvas);
            this.v.setAlpha(alpha);
            this.v.setDraw(false);
            canvas.restore();
        }
        if (this.f46212c > 0) {
            float clamp = Utilities.clamp(((float) b()) / 59500.0f, 1.0f, 0.0f);
            Paint paint2 = this.f46214f;
            paint2.setStrokeWidth(AndroidUtilities.dp(3.33f));
            paint2.setColor(org.telegram.ui.ActionBar.k6.l1(this.f46217s, -1090519041));
            paint2.setShadowLayer(AndroidUtilities.dp(1.0f), 0.0f, AndroidUtilities.dp(0.33f), org.telegram.ui.ActionBar.k6.l1(this.f46217s, 536870912));
            rectF.inset(-AndroidUtilities.dp(7.665f), -AndroidUtilities.dp(7.665f));
            canvas.drawArc(rectF, -90.0f, clamp * 360.0f, false, paint2);
            if (this.d <= 0) {
                invalidate();
            }
        }
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        u5 u5Var = this.f46210a;
        int measuredWidth = ((i12 - i10) - u5Var.getMeasuredWidth()) - AndroidUtilities.dp(16.0f);
        int dp = AndroidUtilities.dp(72.0f);
        u5Var.layout(measuredWidth, dp, u5Var.getMeasuredWidth() + measuredWidth, u5Var.getMeasuredHeight() + dp);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        int min = (int) (Math.min(size, size2) * 0.43f);
        this.f46210a.measure(View.MeasureSpec.makeMeasureSpec(min, 1073741824), View.MeasureSpec.makeMeasureSpec(min, 1073741824));
        setMeasuredDimension(size, size2);
    }
}
