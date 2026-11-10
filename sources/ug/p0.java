package ug;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import c8.ha;
import c8.ka;
import di.n4;
import org.telegram.messenger.k5;
import org.telegram.messenger.r2;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.bq;
import org.telegram.ui.Components.ch0;
import org.telegram.ui.Components.cp;
import org.telegram.ui.Components.cq;
import org.telegram.ui.Components.i6;
import org.telegram.ui.Components.v5;
import org.telegram.ui.Components.w41;
import org.telegram.ui.Components.wq;
import org.telegram.ui.Components.z70;
import org.telegram.ui.c50;
import org.telegram.ui.u81;
public class p0 extends FrameLayout implements z70 {
    public final org.telegram.ui.Components.voip.n D;
    public boolean E;
    public final ch0 F;
    public boolean G;
    public boolean H;
    public cq I;
    public boolean J;
    public boolean K;
    public final v5 L;
    public final v5 M;
    public cp N;
    public float O;
    public boolean P;
    public ValueAnimator Q;
    public final Paint f56764a;
    public final boolean f56765b;
    public final h6 f56766c;
    public float d;
    public boolean f56767e;
    public final o0 f56768f;
    public final o0 h;
    public final int f56769n;
    public boolean f56770r;
    public float f56771s;
    public final w41 f56772w;
    public ValueAnimator f56773x;
    public final Path f56774y;

    public p0(Context context, h6 h6Var, boolean z9) {
        this(org.telegram.messenger.g0.L(8.0f), context, h6Var, z9);
    }

    @Override
    public final boolean a() {
        return this.P;
    }

    public final void b(String str, View.OnClickListener onClickListener, boolean z9) {
        if (!this.G && z9) {
            z9 = true;
        }
        this.G = true;
        o0 o0Var = this.f56768f;
        if (z9 && o0Var.f34543c.h()) {
            o0Var.a();
        }
        o0Var.c(str, z9, true);
        w41 w41Var = this.f56772w;
        w41Var.setContentDescription(str);
        if (!this.K) {
            w41Var.setOnClickListener(onClickListener);
        }
    }

    public final void c(CharSequence charSequence, boolean z9, boolean z10) {
        this.f56770r = true;
        this.E = z9;
        o0 o0Var = this.h;
        o0Var.c(charSequence, z10, true);
        o0Var.setContentDescription(charSequence);
        d(z10);
    }

    public final void d(boolean z9) {
        ValueAnimator valueAnimator = this.f56773x;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.f56773x.cancel();
        }
        float f10 = 0.0f;
        if (!z9) {
            if (this.f56770r) {
                f10 = 1.0f;
            }
            this.f56771s = f10;
            e();
            return;
        }
        float f11 = this.f56771s;
        if (this.f56770r) {
            f10 = 1.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
        this.f56773x = ofFloat;
        ofFloat.addUpdateListener(new n4(this, 12));
        this.f56773x.addListener(new u81(this, 18));
        this.f56773x.setDuration(250L);
        this.f56773x.setInterpolator(wq.f40046f);
        this.f56773x.start();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int L;
        cq cqVar = this.I;
        o0 o0Var = this.h;
        if (cqVar != null) {
            bq bqVar = cqVar.f32735a;
            if (bqVar.h == 0) {
                L = 0;
            } else {
                L = org.telegram.messenger.g0.L(bqVar.C - 0.5f) + bqVar.f32337s;
            }
            v5 v5Var = this.L;
            v5Var.e(false, ((L * 0.85f) + org.telegram.messenger.g0.L(3.0f)) / 2.0f);
            float e10 = (o0Var.getDrawable().e() / 2.0f) + (getMeasuredWidth() / 2.0f) + org.telegram.messenger.g0.L(3.0f);
            v5 v5Var2 = this.M;
            v5Var2.e(false, e10);
            o0Var.setTranslationX(-v5Var.f38854c);
            this.I.setTranslationX(v5Var2.f38854c - v5Var.f38854c);
        } else if (o0Var != null) {
            o0Var.setTranslationX(0.0f);
        }
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        int i7 = (this.f56771s > 1.0f ? 1 : (this.f56771s == 1.0f ? 0 : -1));
        h6 h6Var = this.f56766c;
        boolean z9 = this.f56765b;
        int i10 = this.f56769n;
        Paint paint = this.f56764a;
        if (i7 != 0 || !this.E) {
            if (this.f56767e) {
                float f10 = this.d + 0.016f;
                this.d = f10;
                if (f10 > 3.0f) {
                    this.f56767e = false;
                }
            } else {
                float f11 = this.d - 0.016f;
                this.d = f11;
                if (f11 < 1.0f) {
                    this.f56767e = true;
                }
            }
            if (this.J) {
                ia.e.d().f((-getMeasuredWidth()) * 0.1f * this.d, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                float f12 = i10;
                canvas.drawRoundRect(rectF, f12, f12, ia.e.d().e());
            } else {
                if (z9) {
                    paint.setColor(m6.w0(m6.Ci, h6Var));
                }
                paint.setAlpha(255);
                float f13 = i10;
                canvas.drawRoundRect(rectF, f13, f13, paint);
            }
            invalidate();
        }
        boolean z10 = r2.f25216a;
        if (!this.H) {
            int measuredWidth = getMeasuredWidth();
            org.telegram.ui.Components.voip.n nVar = this.D;
            nVar.f39383f = measuredWidth;
            nVar.a(i10, canvas, rectF, null);
        }
        if (this.f56771s != 0.0f && this.E) {
            if (z9) {
                paint.setColor(m6.w0(m6.Ci, h6Var));
            }
            paint.setAlpha((int) (this.f56771s * 255.0f));
            if (this.f56771s != 1.0f) {
                Path path = this.f56774y;
                path.rewind();
                path.addCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, Math.max(getMeasuredWidth(), getMeasuredHeight()) * 1.4f * this.f56771s, Path.Direction.CW);
                canvas.save();
                canvas.clipPath(path);
                float f14 = i10;
                canvas.drawRoundRect(rectF, f14, f14, paint);
                canvas.restore();
            } else {
                float f15 = i10;
                canvas.drawRoundRect(rectF, f15, f15, paint);
            }
        }
        super.dispatchDraw(canvas);
    }

    public final void e() {
        int i7;
        float f10 = this.f56771s;
        o0 o0Var = this.h;
        o0Var.setAlpha(f10);
        o0Var.setTranslationY((1.0f - this.f56771s) * org.telegram.messenger.g0.L(12.0f));
        w41 w41Var = this.f56772w;
        w41Var.setAlpha(1.0f - this.f56771s);
        w41Var.setTranslationY((-org.telegram.messenger.g0.L(12.0f)) * this.f56771s);
        int i10 = 0;
        if (this.f56771s == 1.0f) {
            i7 = 4;
        } else {
            i7 = 0;
        }
        w41Var.setVisibility(i7);
        if (this.f56771s == 0.0f) {
            i10 = 4;
        }
        o0Var.setVisibility(i10);
        invalidate();
    }

    public ch0 getIconView() {
        return this.F;
    }

    public i6 getTextView() {
        return this.f56768f;
    }

    @Override
    public final boolean isEnabled() {
        return this.f56772w.isEnabled();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
    }

    @Override
    public void setEnabled(boolean z9) {
        super.setEnabled(z9);
        this.f56772w.setEnabled(z9);
    }

    public void setFlickerDisabled(boolean z9) {
        this.H = z9;
        invalidate();
    }

    public void setIcon(int i7) {
        ch0 ch0Var = this.F;
        ch0Var.f(i7, 24, 24, null);
        org.telegram.ui.Components.voip.n nVar = this.D;
        nVar.f39384g = 2.0f;
        nVar.f39392p = new sh.b(this, 15);
        invalidate();
        ch0Var.setVisibility(0);
    }

    @Override
    public void setLoading(boolean z9) {
        float f10;
        if (this.P != z9) {
            ValueAnimator valueAnimator = this.Q;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.Q = null;
            }
            float f11 = this.O;
            this.P = z9;
            if (z9) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
            this.Q = ofFloat;
            ofFloat.addUpdateListener(new ti.d(this, 2));
            this.Q.addListener(new c50(16, this, z9));
            this.Q.setDuration(320L);
            this.Q.setInterpolator(wq.h);
            this.Q.start();
        }
    }

    public p0(int i7, Context context, h6 h6Var, boolean z9) {
        super(context);
        Paint paint = new Paint(1);
        this.f56764a = paint;
        this.f56774y = new Path();
        this.J = true;
        this.L = new v5(this);
        this.M = new v5(this);
        this.O = 0.0f;
        this.f56769n = i7;
        org.telegram.ui.Components.voip.n nVar = new org.telegram.ui.Components.voip.n();
        this.D = nVar;
        nVar.f39390n = 1.2f;
        nVar.f39387k = false;
        nVar.f39389m = 4.0f;
        LinearLayout f10 = k5.f(context, 0);
        o0 o0Var = new o0(this, context, 0);
        this.f56768f = o0Var;
        o0Var.b(0.35f, 350L, wq.h);
        o0Var.setGravity(17);
        o0Var.setTextColor(-1);
        o0Var.setTextSize(org.telegram.messenger.g0.L(14.0f));
        o0Var.setTypeface(org.telegram.messenger.g0.o());
        ?? imageView = new ImageView(context);
        this.F = imageView;
        imageView.setColorFilter(-1);
        imageView.setVisibility(8);
        w41 w41Var = new w41(10, context, this);
        this.f56772w = w41Var;
        w41Var.addView(f10, ha.e(-2, -2, 17));
        int o4 = i0.a.o(-1, 120);
        w41Var.setBackground(m6.k0(i7, i7, i7, i7, 0, o4, o4));
        f10.addView(o0Var, ha.r(-2, -2, 16));
        f10.addView((View) imageView, ha.q(24, 24, 0.0f, 16, 4, 0, 0, 0));
        addView(w41Var);
        setOutlineProvider(bg.u0.f3381b);
        setClipToOutline(true);
        ka.b(this, 0.02f, 1.2f);
        if (z9) {
            o0 o0Var2 = new o0(this, context, 1);
            this.h = o0Var2;
            o0Var2.setPadding(org.telegram.messenger.g0.L(34.0f), 0, org.telegram.messenger.g0.L(34.0f), 0);
            o0Var2.setGravity(17);
            t6.Y(o0Var2, m6.Gi, h6Var);
            o0Var2.setTextSize(org.telegram.messenger.g0.L(14.0f));
            o0Var2.setTypeface(org.telegram.messenger.g0.o());
            o0Var2.getDrawable().J = true;
            int L = org.telegram.messenger.g0.L(8.0f);
            int o10 = i0.a.o(-1, 120);
            o0Var2.setBackground(m6.k0(L, L, L, L, 0, o10, o10));
            addView(o0Var2);
            paint.setColor(m6.w0(m6.Ci, h6Var));
            this.f56765b = true;
            this.f56766c = h6Var;
            e();
        }
    }
}
