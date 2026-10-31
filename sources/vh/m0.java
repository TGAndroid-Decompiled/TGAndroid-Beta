package vh;

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
import org.telegram.messenger.cd;
import org.telegram.ui.Components.bi0;
import org.telegram.ui.Components.dc;
import org.telegram.ui.Components.gr;
public final class m0 extends View {
    public float D;
    public boolean E;
    public final org.telegram.ui.Components.t5 F;
    public boolean G;
    public float H;
    public final org.telegram.ui.Components.t5 I;
    public final org.telegram.ui.Components.t5 J;
    public final RectF K;
    public final RectF L;
    public final RectF M;
    public final RectF N;
    public boolean O;
    public l0 P;
    public Runnable Q;
    public final Paint f51463a;
    public final TextPaint f51464b;
    public final TextPaint f51465c;
    public final Paint d;
    public final Paint e;
    public final Paint f51466f;
    public final dc h;
    public bi0 f51467n;
    public final StaticLayout f51468r;
    public final float f51469s;
    public final float f51470w;
    public StaticLayout f51471x;
    public float f51472y;

    public m0(Context context, String str) {
        super(context);
        Paint paint = new Paint(1);
        this.f51463a = paint;
        TextPaint textPaint = new TextPaint(1);
        this.f51464b = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.f51465c = textPaint2;
        Paint paint2 = new Paint(1);
        this.d = paint2;
        Paint paint3 = new Paint(1);
        this.e = paint3;
        Paint paint4 = new Paint(1);
        this.f51466f = paint4;
        this.h = new dc(this);
        this.E = false;
        this.F = new org.telegram.ui.Components.t5(0.0f, this, 0L, 350L, gr.h);
        this.G = true;
        this.H = 0.0f;
        this.I = new org.telegram.ui.Components.t5(this);
        this.J = new org.telegram.ui.Components.t5(this);
        this.K = new RectF();
        this.L = new RectF();
        this.M = new RectF();
        this.N = new RectF();
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
        paint3.setStrokeWidth(org.telegram.messenger.i0.L(4.0f));
        paint4.setStyle(style);
        paint4.setStrokeCap(cap);
        paint4.setStrokeWidth(org.telegram.messenger.i0.L(4.0f));
        textPaint.setTextSize(org.telegram.messenger.i0.L(14.0f));
        textPaint2.setTextSize(org.telegram.messenger.i0.N(14.66f));
        StaticLayout staticLayout = new StaticLayout(str, textPaint, org.telegram.messenger.i0.f16026q.x, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.f51468r = staticLayout;
        this.f51469s = staticLayout.getLineCount() > 0 ? staticLayout.getLineWidth(0) : 0.0f;
        this.f51470w = staticLayout.getLineCount() > 0 ? staticLayout.getLineLeft(0) : 0.0f;
        this.E = true;
        invalidate();
    }

    public final void a() {
        l0 l0Var = this.P;
        if (l0Var != null) {
            org.telegram.messenger.i0.r(l0Var);
            this.P = null;
        }
        this.E = false;
        invalidate();
    }

    public final void b(int i10, int i11, CharSequence charSequence) {
        float f7;
        bi0 bi0Var = this.f51467n;
        if (bi0Var != null) {
            bi0Var.setCallback(null);
            this.f51467n.C(true);
        }
        bi0 bi0Var2 = new bi0(i10, org.telegram.messenger.i0.L(36.0f), org.telegram.messenger.i0.L(36.0f));
        this.f51467n = bi0Var2;
        bi0Var2.setCallback(this);
        this.f51467n.start();
        StaticLayout staticLayout = new StaticLayout(charSequence, this.f51465c, org.telegram.messenger.i0.f16026q.x, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.f51471x = staticLayout;
        float f10 = 0.0f;
        if (staticLayout.getLineCount() > 0) {
            f7 = this.f51471x.getLineWidth(0);
        } else {
            f7 = 0.0f;
        }
        this.f51472y = f7;
        if (this.f51471x.getLineCount() > 0) {
            f10 = this.f51471x.getLineLeft(0);
        }
        this.D = f10;
        this.G = false;
        invalidate();
        l0 l0Var = this.P;
        if (l0Var != null) {
            org.telegram.messenger.i0.r(l0Var);
        }
        l0 l0Var2 = new l0(this, 1);
        this.P = l0Var2;
        org.telegram.messenger.i0.h3(l0Var2, i11);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f7;
        float f10;
        float f11;
        RectF rectF;
        float f12;
        int saveCount = canvas.getSaveCount();
        if (this.E) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        float e = this.F.e(false, f7);
        if (this.G) {
            f10 = 0.0f;
        } else {
            f10 = 1.0f;
        }
        float e7 = this.I.e(false, f10);
        float f13 = 1.0f - e7;
        Paint paint = this.f51463a;
        paint.setAlpha((int) (90.0f * f13 * e));
        Canvas canvas2 = canvas;
        canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
        float max = Math.max(this.f51469s, org.telegram.messenger.i0.L(54.0f)) + org.telegram.messenger.i0.L(42.0f);
        int L = org.telegram.messenger.i0.L(111.0f);
        StaticLayout staticLayout = this.f51468r;
        float height = staticLayout.getHeight() + L;
        RectF rectF2 = this.K;
        rectF2.set((getWidth() - max) / 2.0f, (getHeight() - height) / 2.0f, (getWidth() + max) / 2.0f, (getHeight() + height) / 2.0f);
        float L2 = org.telegram.messenger.i0.L(74.0f) + this.f51472y;
        float L3 = org.telegram.messenger.i0.L(48.0f);
        RectF rectF3 = this.L;
        rectF3.set((getWidth() - L2) / 2.0f, (getHeight() - L3) / 2.0f, (getWidth() + L2) / 2.0f, (getHeight() + L3) / 2.0f);
        RectF rectF4 = this.M;
        org.telegram.messenger.i0.Z1(rectF2, rectF3, e7, rectF4);
        int i10 = (e > 1.0f ? 1 : (e == 1.0f ? 0 : -1));
        if (i10 < 0 && this.G) {
            f11 = 42.0f;
            RectF rectF5 = this.N;
            rectF5.set(getWidth() / 2.0f, getHeight() / 2.0f, getWidth() / 2.0f, getHeight() / 2.0f);
            org.telegram.messenger.i0.Z1(rectF5, rectF4, e, rectF4);
        } else {
            f11 = 42.0f;
        }
        if (i10 < 0 && !this.G) {
            canvas2.scale(org.telegram.messenger.i0.T1(0.8f, 1.0f, e), org.telegram.messenger.i0.T1(0.8f, 1.0f, e), rectF4.centerX(), rectF4.centerY());
        }
        Paint paint2 = this.d;
        paint2.setAlpha((int) (204.0f * e));
        canvas2.drawRoundRect(rectF4, org.telegram.messenger.i0.L(10.0f), org.telegram.messenger.i0.L(10.0f), paint2);
        canvas2.save();
        canvas2.clipRect(rectF4);
        if (e7 < 1.0f) {
            float f14 = f13 * e;
            float e10 = this.J.e(false, this.H);
            float centerX = rectF2.centerX();
            float L4 = rectF2.top + org.telegram.messenger.i0.L(48.0f);
            float L5 = org.telegram.messenger.i0.L(25.0f);
            Paint paint3 = this.f51466f;
            paint3.setAlpha((int) (51.0f * f14));
            canvas2.drawCircle(centerX, L4, L5, paint3);
            RectF rectF6 = org.telegram.messenger.i0.P;
            f12 = 255.0f;
            rectF6.set(centerX - L5, L4 - L5, centerX + L5, L5 + L4);
            int i11 = (int) (f14 * 255.0f);
            Paint paint4 = this.e;
            paint4.setAlpha(i11);
            paint4.setStrokeWidth(org.telegram.messenger.i0.L(4.0f));
            rectF = rectF3;
            canvas.drawArc(rectF6, -90.0f, 360.0f * e10, false, paint4);
            float a2 = this.h.a(0.15f);
            canvas.save();
            canvas.scale(a2, a2, centerX, L4);
            paint4.setStrokeWidth(org.telegram.messenger.i0.L(3.4f));
            canvas.drawLine(centerX - org.telegram.messenger.i0.L(7.0f), L4 - org.telegram.messenger.i0.L(7.0f), org.telegram.messenger.i0.L(7.0f) + centerX, org.telegram.messenger.i0.L(7.0f) + L4, paint4);
            canvas2 = canvas;
            canvas2.drawLine(centerX - org.telegram.messenger.i0.L(7.0f), L4 + org.telegram.messenger.i0.L(7.0f), centerX + org.telegram.messenger.i0.L(7.0f), L4 - org.telegram.messenger.i0.L(7.0f), paint4);
            canvas2.restore();
            canvas2.save();
            canvas2.translate((rectF2.left + org.telegram.messenger.i0.L(21.0f)) - this.f51470w, (rectF2.bottom - org.telegram.messenger.i0.L(18.0f)) - staticLayout.getHeight());
            this.f51464b.setAlpha(i11);
            staticLayout.draw(canvas2);
            canvas2.restore();
        } else {
            rectF = rectF3;
            f12 = 255.0f;
        }
        if (e7 > 0.0f) {
            float f15 = e7 * e;
            bi0 bi0Var = this.f51467n;
            if (bi0Var != null) {
                bi0Var.setAlpha((int) (f15 * f12));
                this.f51467n.setBounds((int) (rectF.left + org.telegram.messenger.i0.L(9.0f)), (int) (rectF.top + org.telegram.messenger.i0.L(6.0f)), (int) (rectF.left + org.telegram.messenger.i0.L(45.0f)), (int) (rectF.top + org.telegram.messenger.i0.L(f11)));
                this.f51467n.draw(canvas2);
            }
            if (this.f51471x != null) {
                canvas2.save();
                canvas2.translate((rectF.left + org.telegram.messenger.i0.L(52.0f)) - this.D, rectF.centerY() - (this.f51471x.getHeight() / 2.0f));
                this.f51465c.setAlpha((int) (f15 * f12));
                this.f51471x.draw(canvas2);
                canvas2.restore();
            }
        }
        canvas2.restoreToCount(saveCount);
        if (e <= 0.0f && !this.E && !this.O) {
            this.O = true;
            post(new l0(this, 0));
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean contains = this.M.contains(motionEvent.getX(), motionEvent.getY());
        int action = motionEvent.getAction();
        dc dcVar = this.h;
        if (action == 0 && (this.G || contains)) {
            dcVar.c(contains);
            return true;
        }
        if (motionEvent.getAction() == 1) {
            if (dcVar.f25390i) {
                if (contains) {
                    if (this.G) {
                        Runnable runnable = this.Q;
                        if (runnable != null) {
                            runnable.run();
                        }
                    } else {
                        a();
                    }
                }
                dcVar.c(false);
                return true;
            }
        } else if (motionEvent.getAction() == 3) {
            dcVar.c(false);
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setOnCancelListener(Runnable runnable) {
        this.Q = runnable;
    }

    public void setProgress(float f7) {
        this.H = f7;
        invalidate();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f51467n && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }

    public m0(Context context) {
        this(context, cd.L0(2131746933, null));
    }
}
