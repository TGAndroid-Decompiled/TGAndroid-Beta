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
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.l6;
import org.telegram.ui.ActionBar.s6;
import org.telegram.ui.Components.a80;
import org.telegram.ui.Components.bq;
import org.telegram.ui.Components.cp;
import org.telegram.ui.Components.cq;
import org.telegram.ui.Components.dh0;
import org.telegram.ui.Components.j6;
import org.telegram.ui.Components.w41;
import org.telegram.ui.Components.w5;
import org.telegram.ui.Components.xq;
import org.telegram.ui.b50;
import org.telegram.ui.t81;
public class p0 extends FrameLayout implements a80 {
    public final org.telegram.ui.Components.voip.n D;
    public boolean E;
    public final dh0 F;
    public boolean G;
    public boolean H;
    public cq I;
    public boolean J;
    public boolean K;
    public final w5 L;
    public final w5 M;
    public cp N;
    public float O;
    public boolean P;
    public ValueAnimator Q;
    public final Paint f56765a;
    public final boolean f56766b;
    public final g6 f56767c;
    public float d;
    public boolean f56768e;
    public final o0 f56769f;
    public final o0 h;
    public final int f56770n;
    public boolean f56771r;
    public float f56772s;
    public final w41 f56773w;
    public ValueAnimator f56774x;
    public final Path f56775y;

    public p0(Context context, g6 g6Var, boolean z9) {
        this(org.telegram.messenger.g0.L(8.0f), context, g6Var, z9);
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
        o0 o0Var = this.f56769f;
        if (z9 && o0Var.f34934c.h()) {
            o0Var.a();
        }
        o0Var.c(str, z9, true);
        w41 w41Var = this.f56773w;
        w41Var.setContentDescription(str);
        if (!this.K) {
            w41Var.setOnClickListener(onClickListener);
        }
    }

    public final void c(CharSequence charSequence, boolean z9, boolean z10) {
        this.f56771r = true;
        this.E = z9;
        o0 o0Var = this.h;
        o0Var.c(charSequence, z10, true);
        o0Var.setContentDescription(charSequence);
        d(z10);
    }

    public final void d(boolean z9) {
        ValueAnimator valueAnimator = this.f56774x;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.f56774x.cancel();
        }
        float f10 = 0.0f;
        if (!z9) {
            if (this.f56771r) {
                f10 = 1.0f;
            }
            this.f56772s = f10;
            e();
            return;
        }
        float f11 = this.f56772s;
        if (this.f56771r) {
            f10 = 1.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
        this.f56774x = ofFloat;
        ofFloat.addUpdateListener(new n4(this, 12));
        this.f56774x.addListener(new t81(this, 18));
        this.f56774x.setDuration(250L);
        this.f56774x.setInterpolator(xq.f40458f);
        this.f56774x.start();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int L;
        cq cqVar = this.I;
        o0 o0Var = this.h;
        if (cqVar != null) {
            bq bqVar = cqVar.f32743a;
            if (bqVar.h == 0) {
                L = 0;
            } else {
                L = org.telegram.messenger.g0.L(bqVar.C - 0.5f) + bqVar.f32378s;
            }
            w5 w5Var = this.L;
            w5Var.e(false, ((L * 0.85f) + org.telegram.messenger.g0.L(3.0f)) / 2.0f);
            float e10 = (o0Var.getDrawable().e() / 2.0f) + (getMeasuredWidth() / 2.0f) + org.telegram.messenger.g0.L(3.0f);
            w5 w5Var2 = this.M;
            w5Var2.e(false, e10);
            o0Var.setTranslationX(-w5Var.f39910c);
            this.I.setTranslationX(w5Var2.f39910c - w5Var.f39910c);
        } else if (o0Var != null) {
            o0Var.setTranslationX(0.0f);
        }
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        int i7 = (this.f56772s > 1.0f ? 1 : (this.f56772s == 1.0f ? 0 : -1));
        g6 g6Var = this.f56767c;
        boolean z9 = this.f56766b;
        int i10 = this.f56770n;
        Paint paint = this.f56765a;
        if (i7 != 0 || !this.E) {
            if (this.f56768e) {
                float f10 = this.d + 0.016f;
                this.d = f10;
                if (f10 > 3.0f) {
                    this.f56768e = false;
                }
            } else {
                float f11 = this.d - 0.016f;
                this.d = f11;
                if (f11 < 1.0f) {
                    this.f56768e = true;
                }
            }
            if (this.J) {
                ia.e.d().f((-getMeasuredWidth()) * 0.1f * this.d, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                float f12 = i10;
                canvas.drawRoundRect(rectF, f12, f12, ia.e.d().e());
            } else {
                if (z9) {
                    paint.setColor(l6.w0(l6.Ci, g6Var));
                }
                paint.setAlpha(255);
                float f13 = i10;
                canvas.drawRoundRect(rectF, f13, f13, paint);
            }
            invalidate();
        }
        boolean z10 = r2.f25212a;
        if (!this.H) {
            int measuredWidth = getMeasuredWidth();
            org.telegram.ui.Components.voip.n nVar = this.D;
            nVar.f39463f = measuredWidth;
            nVar.a(i10, canvas, rectF, null);
        }
        if (this.f56772s != 0.0f && this.E) {
            if (z9) {
                paint.setColor(l6.w0(l6.Ci, g6Var));
            }
            paint.setAlpha((int) (this.f56772s * 255.0f));
            if (this.f56772s != 1.0f) {
                Path path = this.f56775y;
                path.rewind();
                path.addCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, Math.max(getMeasuredWidth(), getMeasuredHeight()) * 1.4f * this.f56772s, Path.Direction.CW);
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
        float f10 = this.f56772s;
        o0 o0Var = this.h;
        o0Var.setAlpha(f10);
        o0Var.setTranslationY((1.0f - this.f56772s) * org.telegram.messenger.g0.L(12.0f));
        w41 w41Var = this.f56773w;
        w41Var.setAlpha(1.0f - this.f56772s);
        w41Var.setTranslationY((-org.telegram.messenger.g0.L(12.0f)) * this.f56772s);
        int i10 = 0;
        if (this.f56772s == 1.0f) {
            i7 = 4;
        } else {
            i7 = 0;
        }
        w41Var.setVisibility(i7);
        if (this.f56772s == 0.0f) {
            i10 = 4;
        }
        o0Var.setVisibility(i10);
        invalidate();
    }

    public dh0 getIconView() {
        return this.F;
    }

    public j6 getTextView() {
        return this.f56769f;
    }

    @Override
    public final boolean isEnabled() {
        return this.f56773w.isEnabled();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
    }

    @Override
    public void setEnabled(boolean z9) {
        super.setEnabled(z9);
        this.f56773w.setEnabled(z9);
    }

    public void setFlickerDisabled(boolean z9) {
        this.H = z9;
        invalidate();
    }

    public void setIcon(int i7) {
        dh0 dh0Var = this.F;
        dh0Var.f(i7, 24, 24, null);
        org.telegram.ui.Components.voip.n nVar = this.D;
        nVar.f39464g = 2.0f;
        nVar.f39472p = new sh.b(this, 15);
        invalidate();
        dh0Var.setVisibility(0);
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
            this.Q.addListener(new b50(16, this, z9));
            this.Q.setDuration(320L);
            this.Q.setInterpolator(xq.h);
            this.Q.start();
        }
    }

    public p0(int i7, Context context, g6 g6Var, boolean z9) {
        super(context);
        Paint paint = new Paint(1);
        this.f56765a = paint;
        this.f56775y = new Path();
        this.J = true;
        this.L = new w5(this);
        this.M = new w5(this);
        this.O = 0.0f;
        this.f56770n = i7;
        org.telegram.ui.Components.voip.n nVar = new org.telegram.ui.Components.voip.n();
        this.D = nVar;
        nVar.f39470n = 1.2f;
        nVar.f39467k = false;
        nVar.f39469m = 4.0f;
        LinearLayout f10 = k5.f(context, 0);
        o0 o0Var = new o0(this, context, 0);
        this.f56769f = o0Var;
        o0Var.b(0.35f, 350L, xq.h);
        o0Var.setGravity(17);
        o0Var.setTextColor(-1);
        o0Var.setTextSize(org.telegram.messenger.g0.L(14.0f));
        o0Var.setTypeface(org.telegram.messenger.g0.o());
        ?? imageView = new ImageView(context);
        this.F = imageView;
        imageView.setColorFilter(-1);
        imageView.setVisibility(8);
        w41 w41Var = new w41(10, context, this);
        this.f56773w = w41Var;
        w41Var.addView(f10, ha.e(-2, -2, 17));
        int o4 = i0.a.o(-1, 120);
        w41Var.setBackground(l6.k0(i7, i7, i7, i7, 0, o4, o4));
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
            s6.Y(o0Var2, l6.Gi, g6Var);
            o0Var2.setTextSize(org.telegram.messenger.g0.L(14.0f));
            o0Var2.setTypeface(org.telegram.messenger.g0.o());
            o0Var2.getDrawable().J = true;
            int L = org.telegram.messenger.g0.L(8.0f);
            int o10 = i0.a.o(-1, 120);
            o0Var2.setBackground(l6.k0(L, L, L, L, 0, o10, o10));
            addView(o0Var2);
            paint.setColor(l6.w0(l6.Ci, g6Var));
            this.f56766b = true;
            this.f56767c = g6Var;
            e();
        }
    }
}
