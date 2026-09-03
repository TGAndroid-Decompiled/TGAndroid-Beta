package qh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.hj0;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.rc;
public final class m0 extends View {
    public boolean B;
    public final org.telegram.ui.Components.z5 C;
    public boolean D;
    public float E;
    public final org.telegram.ui.Components.z5 F;
    public final org.telegram.ui.Components.z5 G;
    public final RectF H;
    public final RectF I;
    public final RectF J;
    public final RectF K;
    public boolean L;
    public l0 M;
    public Runnable N;
    public final Paint f45721a;
    public final TextPaint f45722b;
    public final TextPaint f45723c;
    public final Paint d;
    public final Paint f45724e;
    public final Paint f45725f;
    public final rc h;
    public hj0 f45726n;
    public final StaticLayout f45727r;
    public final float f45728s;
    public final float v;
    public StaticLayout f45729w;
    public float f45730x;
    public float f45731y;

    public m0(Context context) {
        this(context, LocaleController.getString(R.string.PreparingVideo));
    }

    public final void a() {
        l0 l0Var = this.M;
        if (l0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(l0Var);
            this.M = null;
        }
        this.B = false;
        invalidate();
    }

    public final void b(int i10, int i11, CharSequence charSequence) {
        float f10;
        hj0 hj0Var = this.f45726n;
        if (hj0Var != null) {
            hj0Var.setCallback(null);
            this.f45726n.A(true);
        }
        hj0 hj0Var2 = new hj0(i10, AndroidUtilities.dp(36.0f), AndroidUtilities.dp(36.0f));
        this.f45726n = hj0Var2;
        hj0Var2.setCallback(this);
        this.f45726n.start();
        StaticLayout staticLayout = new StaticLayout(charSequence, this.f45723c, AndroidUtilities.displaySize.x, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.f45729w = staticLayout;
        float f11 = 0.0f;
        if (staticLayout.getLineCount() > 0) {
            f10 = this.f45729w.getLineWidth(0);
        } else {
            f10 = 0.0f;
        }
        this.f45730x = f10;
        if (this.f45729w.getLineCount() > 0) {
            f11 = this.f45729w.getLineLeft(0);
        }
        this.f45731y = f11;
        this.D = false;
        invalidate();
        l0 l0Var = this.M;
        if (l0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(l0Var);
        }
        l0 l0Var2 = new l0(this, 1);
        this.M = l0Var2;
        AndroidUtilities.runOnUIThread(l0Var2, i11);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f10;
        float f11;
        float f12;
        RectF rectF;
        float f13;
        int saveCount = canvas.getSaveCount();
        if (this.B) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        float d = this.C.d(f10, false);
        if (this.D) {
            f11 = 0.0f;
        } else {
            f11 = 1.0f;
        }
        float d10 = this.F.d(f11, false);
        float f14 = 1.0f - d10;
        Paint paint = this.f45721a;
        paint.setAlpha((int) (90.0f * f14 * d));
        Canvas canvas2 = canvas;
        canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
        float max = Math.max(this.f45728s, AndroidUtilities.dp(54.0f)) + AndroidUtilities.dp(42.0f);
        int dp = AndroidUtilities.dp(111.0f);
        StaticLayout staticLayout = this.f45727r;
        float height = staticLayout.getHeight() + dp;
        RectF rectF2 = this.H;
        rectF2.set((getWidth() - max) / 2.0f, (getHeight() - height) / 2.0f, (getWidth() + max) / 2.0f, (getHeight() + height) / 2.0f);
        float dp2 = AndroidUtilities.dp(74.0f) + this.f45730x;
        float dp3 = AndroidUtilities.dp(48.0f);
        RectF rectF3 = this.I;
        rectF3.set((getWidth() - dp2) / 2.0f, (getHeight() - dp3) / 2.0f, (getWidth() + dp2) / 2.0f, (getHeight() + dp3) / 2.0f);
        RectF rectF4 = this.J;
        AndroidUtilities.lerp(rectF2, rectF3, d10, rectF4);
        int i10 = (d > 1.0f ? 1 : (d == 1.0f ? 0 : -1));
        if (i10 < 0 && this.D) {
            f12 = 42.0f;
            RectF rectF5 = this.K;
            rectF5.set(getWidth() / 2.0f, getHeight() / 2.0f, getWidth() / 2.0f, getHeight() / 2.0f);
            AndroidUtilities.lerp(rectF5, rectF4, d, rectF4);
        } else {
            f12 = 42.0f;
        }
        if (i10 < 0 && !this.D) {
            canvas2.scale(AndroidUtilities.lerp(0.8f, 1.0f, d), AndroidUtilities.lerp(0.8f, 1.0f, d), rectF4.centerX(), rectF4.centerY());
        }
        Paint paint2 = this.d;
        paint2.setAlpha((int) (204.0f * d));
        canvas2.drawRoundRect(rectF4, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), paint2);
        canvas2.save();
        canvas2.clipRect(rectF4);
        if (d10 < 1.0f) {
            float f15 = f14 * d;
            float d11 = this.G.d(this.E, false);
            float centerX = rectF2.centerX();
            float dp4 = rectF2.top + AndroidUtilities.dp(48.0f);
            float dp5 = AndroidUtilities.dp(25.0f);
            Paint paint3 = this.f45725f;
            paint3.setAlpha((int) (51.0f * f15));
            canvas2.drawCircle(centerX, dp4, dp5, paint3);
            RectF rectF6 = AndroidUtilities.rectTmp;
            f13 = 255.0f;
            rectF6.set(centerX - dp5, dp4 - dp5, centerX + dp5, dp5 + dp4);
            int i11 = (int) (f15 * 255.0f);
            Paint paint4 = this.f45724e;
            paint4.setAlpha(i11);
            paint4.setStrokeWidth(AndroidUtilities.dp(4.0f));
            rectF = rectF3;
            canvas.drawArc(rectF6, -90.0f, 360.0f * d11, false, paint4);
            float a2 = this.h.a(0.15f);
            canvas.save();
            canvas.scale(a2, a2, centerX, dp4);
            paint4.setStrokeWidth(AndroidUtilities.dp(3.4f));
            canvas.drawLine(centerX - AndroidUtilities.dp(7.0f), dp4 - AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f) + centerX, AndroidUtilities.dp(7.0f) + dp4, paint4);
            canvas2 = canvas;
            canvas2.drawLine(centerX - AndroidUtilities.dp(7.0f), dp4 + AndroidUtilities.dp(7.0f), centerX + AndroidUtilities.dp(7.0f), dp4 - AndroidUtilities.dp(7.0f), paint4);
            canvas2.restore();
            canvas2.save();
            canvas2.translate((rectF2.left + AndroidUtilities.dp(21.0f)) - this.v, (rectF2.bottom - AndroidUtilities.dp(18.0f)) - staticLayout.getHeight());
            this.f45722b.setAlpha(i11);
            staticLayout.draw(canvas2);
            canvas2.restore();
        } else {
            rectF = rectF3;
            f13 = 255.0f;
        }
        if (d10 > 0.0f) {
            float f16 = d10 * d;
            hj0 hj0Var = this.f45726n;
            if (hj0Var != null) {
                hj0Var.setAlpha((int) (f16 * f13));
                this.f45726n.setBounds((int) (rectF.left + AndroidUtilities.dp(9.0f)), (int) (rectF.top + AndroidUtilities.dp(6.0f)), (int) (rectF.left + AndroidUtilities.dp(45.0f)), (int) (rectF.top + AndroidUtilities.dp(f12)));
                this.f45726n.draw(canvas2);
            }
            if (this.f45729w != null) {
                canvas2.save();
                canvas2.translate((rectF.left + AndroidUtilities.dp(52.0f)) - this.f45731y, rectF.centerY() - (this.f45729w.getHeight() / 2.0f));
                this.f45723c.setAlpha((int) (f16 * f13));
                this.f45729w.draw(canvas2);
                canvas2.restore();
            }
        }
        canvas2.restoreToCount(saveCount);
        if (d <= 0.0f && !this.B && !this.L) {
            this.L = true;
            post(new l0(this, 0));
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean contains = this.J.contains(motionEvent.getX(), motionEvent.getY());
        int action = motionEvent.getAction();
        rc rcVar = this.h;
        if (action == 0 && (this.D || contains)) {
            rcVar.c(contains);
            return true;
        }
        if (motionEvent.getAction() == 1) {
            if (rcVar.h) {
                if (contains) {
                    if (this.D) {
                        Runnable runnable = this.N;
                        if (runnable != null) {
                            runnable.run();
                        }
                    } else {
                        a();
                    }
                }
                rcVar.c(false);
                return true;
            }
        } else if (motionEvent.getAction() == 3) {
            rcVar.c(false);
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setOnCancelListener(Runnable runnable) {
        this.N = runnable;
    }

    public void setProgress(float f10) {
        this.E = f10;
        invalidate();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f45726n && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }

    public m0(Context context, String str) {
        super(context);
        Paint paint = new Paint(1);
        this.f45721a = paint;
        TextPaint textPaint = new TextPaint(1);
        this.f45722b = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.f45723c = textPaint2;
        Paint paint2 = new Paint(1);
        this.d = paint2;
        Paint paint3 = new Paint(1);
        this.f45724e = paint3;
        Paint paint4 = new Paint(1);
        this.f45725f = paint4;
        this.h = new rc(this);
        this.B = false;
        this.C = new org.telegram.ui.Components.z5(0.0f, this, 0L, 350L, pr.h);
        this.D = true;
        this.E = 0.0f;
        this.F = new org.telegram.ui.Components.z5(this);
        this.G = new org.telegram.ui.Components.z5(this);
        this.H = new RectF();
        this.I = new RectF();
        this.J = new RectF();
        this.K = new RectF();
        paint.setColor(1509949440);
        textPaint.setColor(-1);
        textPaint2.setColor(-1);
        paint2.setColor(-869783512);
        paint3.setColor(-1);
        paint4.setColor(872415231);
        Paint.Style style = Paint.Style.STROKE;
        paint3.setStyle(style);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint3.setStrokeCap(cap);
        paint3.setStrokeWidth(AndroidUtilities.dp(4.0f));
        paint4.setStyle(style);
        paint4.setStrokeCap(cap);
        paint4.setStrokeWidth(AndroidUtilities.dp(4.0f));
        textPaint.setTextSize(AndroidUtilities.dp(14.0f));
        textPaint2.setTextSize(AndroidUtilities.dpf2(14.66f));
        StaticLayout staticLayout = new StaticLayout(str, textPaint, AndroidUtilities.displaySize.x, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.f45727r = staticLayout;
        this.f45728s = staticLayout.getLineCount() > 0 ? staticLayout.getLineWidth(0) : 0.0f;
        this.v = staticLayout.getLineCount() > 0 ? staticLayout.getLineLeft(0) : 0.0f;
        this.B = true;
        invalidate();
    }
}
