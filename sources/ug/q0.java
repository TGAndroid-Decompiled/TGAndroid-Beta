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
import c8.ja;
import c8.na;
import fi.f4;
import org.telegram.messenger.k5;
import org.telegram.messenger.r2;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.q6;
import org.telegram.ui.Components.c80;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.fh0;
import org.telegram.ui.Components.h6;
import org.telegram.ui.Components.jq;
import org.telegram.ui.Components.kq;
import org.telegram.ui.Components.lp;
import org.telegram.ui.Components.m01;
import org.telegram.ui.Components.u5;
import org.telegram.ui.g71;
import org.telegram.ui.z20;
import tg.x1;
public class q0 extends FrameLayout implements c80 {
    public final org.telegram.ui.Components.voip.n E;
    public boolean F;
    public final fh0 G;
    public boolean H;
    public boolean I;
    public kq J;
    public boolean K;
    public boolean L;
    public final u5 M;
    public final u5 N;
    public lp O;
    public float P;
    public boolean Q;
    public ValueAnimator R;
    public final Paint f58263a;
    public final boolean f58264b;
    public final e6 f58265c;
    public float d;
    public boolean f58266e;
    public final p0 f58267f;
    public final p0 h;
    public final int f58268n;
    public boolean f58269r;
    public float f58270s;
    public final m01 f58271w;
    public ValueAnimator f58272x;
    public final Path f58273y;

    public q0(Context context, e6 e6Var, boolean z10) {
        this(org.telegram.messenger.g0.L(8.0f), context, e6Var, z10);
    }

    @Override
    public final boolean a() {
        return this.Q;
    }

    public final void b(String str, View.OnClickListener onClickListener, boolean z10) {
        if (!this.H && z10) {
            z10 = true;
        }
        this.H = true;
        p0 p0Var = this.f58267f;
        if (z10 && p0Var.f35175c.h()) {
            p0Var.a();
        }
        p0Var.c(str, z10, true);
        m01 m01Var = this.f58271w;
        m01Var.setContentDescription(str);
        if (!this.L) {
            m01Var.setOnClickListener(onClickListener);
        }
    }

    public final void c(CharSequence charSequence, boolean z10, boolean z11) {
        this.f58269r = true;
        this.F = z10;
        p0 p0Var = this.h;
        p0Var.c(charSequence, z11, true);
        p0Var.setContentDescription(charSequence);
        d(z11);
    }

    public final void d(boolean z10) {
        ValueAnimator valueAnimator = this.f58272x;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.f58272x.cancel();
        }
        float f10 = 0.0f;
        if (!z10) {
            if (this.f58269r) {
                f10 = 1.0f;
            }
            this.f58270s = f10;
            e();
            return;
        }
        float f11 = this.f58270s;
        if (this.f58269r) {
            f10 = 1.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
        this.f58272x = ofFloat;
        ofFloat.addUpdateListener(new f4(this, 12));
        this.f58272x.addListener(new g71(this, 19));
        this.f58272x.setDuration(250L);
        this.f58272x.setInterpolator(er.f34419f);
        this.f58272x.start();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int L;
        kq kqVar = this.J;
        p0 p0Var = this.h;
        if (kqVar != null) {
            jq jqVar = kqVar.f36574a;
            if (jqVar.h == 0) {
                L = 0;
            } else {
                L = org.telegram.messenger.g0.L(jqVar.C - 0.5f) + jqVar.f36145s;
            }
            u5 u5Var = this.M;
            u5Var.e(false, ((L * 0.85f) + org.telegram.messenger.g0.L(3.0f)) / 2.0f);
            float e10 = (p0Var.getDrawable().e() / 2.0f) + (getMeasuredWidth() / 2.0f) + org.telegram.messenger.g0.L(3.0f);
            u5 u5Var2 = this.N;
            u5Var2.e(false, e10);
            p0Var.setTranslationX(-u5Var.f39900c);
            this.J.setTranslationX(u5Var2.f39900c - u5Var.f39900c);
        } else if (p0Var != null) {
            p0Var.setTranslationX(0.0f);
        }
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        int i7 = (this.f58270s > 1.0f ? 1 : (this.f58270s == 1.0f ? 0 : -1));
        e6 e6Var = this.f58265c;
        boolean z10 = this.f58264b;
        int i10 = this.f58268n;
        Paint paint = this.f58263a;
        if (i7 != 0 || !this.F) {
            if (this.f58266e) {
                float f10 = this.d + 0.016f;
                this.d = f10;
                if (f10 > 3.0f) {
                    this.f58266e = false;
                }
            } else {
                float f11 = this.d - 0.016f;
                this.d = f11;
                if (f11 < 1.0f) {
                    this.f58266e = true;
                }
            }
            if (this.K) {
                ia.f.d().f((-getMeasuredWidth()) * 0.1f * this.d, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                float f12 = i10;
                canvas.drawRoundRect(rectF, f12, f12, ia.f.d().e());
            } else {
                if (z10) {
                    paint.setColor(j6.w0(j6.Fi, e6Var));
                }
                paint.setAlpha(255);
                float f13 = i10;
                canvas.drawRoundRect(rectF, f13, f13, paint);
            }
            invalidate();
        }
        boolean z11 = r2.f26206a;
        if (!this.I) {
            int measuredWidth = getMeasuredWidth();
            org.telegram.ui.Components.voip.n nVar = this.E;
            nVar.f40798f = measuredWidth;
            nVar.a(i10, canvas, rectF, null);
        }
        if (this.f58270s != 0.0f && this.F) {
            if (z10) {
                paint.setColor(j6.w0(j6.Fi, e6Var));
            }
            paint.setAlpha((int) (this.f58270s * 255.0f));
            if (this.f58270s != 1.0f) {
                Path path = this.f58273y;
                path.rewind();
                path.addCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, Math.max(getMeasuredWidth(), getMeasuredHeight()) * 1.4f * this.f58270s, Path.Direction.CW);
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
        float f10 = this.f58270s;
        p0 p0Var = this.h;
        p0Var.setAlpha(f10);
        p0Var.setTranslationY((1.0f - this.f58270s) * org.telegram.messenger.g0.L(12.0f));
        m01 m01Var = this.f58271w;
        m01Var.setAlpha(1.0f - this.f58270s);
        m01Var.setTranslationY((-org.telegram.messenger.g0.L(12.0f)) * this.f58270s);
        int i10 = 0;
        if (this.f58270s == 1.0f) {
            i7 = 4;
        } else {
            i7 = 0;
        }
        m01Var.setVisibility(i7);
        if (this.f58270s == 0.0f) {
            i10 = 4;
        }
        p0Var.setVisibility(i10);
        invalidate();
    }

    public fh0 getIconView() {
        return this.G;
    }

    public h6 getTextView() {
        return this.f58267f;
    }

    @Override
    public final boolean isEnabled() {
        return this.f58271w.isEnabled();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
    }

    @Override
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        this.f58271w.setEnabled(z10);
    }

    public void setFlickerDisabled(boolean z10) {
        this.I = z10;
        invalidate();
    }

    public void setIcon(int i7) {
        fh0 fh0Var = this.G;
        fh0Var.f(i7, 24, 24, null);
        org.telegram.ui.Components.voip.n nVar = this.E;
        nVar.f40799g = 2.0f;
        nVar.f40807p = new q2.d(this, 22);
        invalidate();
        fh0Var.setVisibility(0);
    }

    @Override
    public void setLoading(boolean z10) {
        float f10;
        if (this.Q != z10) {
            ValueAnimator valueAnimator = this.R;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.R = null;
            }
            float f11 = this.P;
            this.Q = z10;
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
            this.R = ofFloat;
            ofFloat.addUpdateListener(new x1(this, 3));
            this.R.addListener(new z20(17, this, z10));
            this.R.setDuration(320L);
            this.R.setInterpolator(er.h);
            this.R.start();
        }
    }

    public q0(int i7, Context context, e6 e6Var, boolean z10) {
        super(context);
        Paint paint = new Paint(1);
        this.f58263a = paint;
        this.f58273y = new Path();
        this.K = true;
        this.M = new u5(this);
        this.N = new u5(this);
        this.P = 0.0f;
        this.f58268n = i7;
        org.telegram.ui.Components.voip.n nVar = new org.telegram.ui.Components.voip.n();
        this.E = nVar;
        nVar.f40805n = 1.2f;
        nVar.f40802k = false;
        nVar.f40804m = 4.0f;
        LinearLayout f10 = k5.f(context, 0);
        p0 p0Var = new p0(this, context, 0);
        this.f58267f = p0Var;
        p0Var.b(0.35f, 350L, er.h);
        p0Var.setGravity(17);
        p0Var.setTextColor(-1);
        p0Var.setTextSize(org.telegram.messenger.g0.L(14.0f));
        p0Var.setTypeface(org.telegram.messenger.g0.o());
        ?? imageView = new ImageView(context);
        this.G = imageView;
        imageView.setColorFilter(-1);
        imageView.setVisibility(8);
        m01 m01Var = new m01(11, context, this);
        this.f58271w = m01Var;
        m01Var.addView(f10, ja.e(-2, -2, 17));
        int o4 = i0.a.o(-1, 120);
        m01Var.setBackground(j6.k0(i7, i7, i7, i7, 0, o4, o4));
        f10.addView(p0Var, ja.r(-2, -2, 16));
        f10.addView((View) imageView, ja.q(24, 24, 0.0f, 16, 4, 0, 0, 0));
        addView(m01Var);
        setOutlineProvider(bg.t0.f3336b);
        setClipToOutline(true);
        na.b(this, 0.02f, 1.2f);
        if (z10) {
            p0 p0Var2 = new p0(this, context, 1);
            this.h = p0Var2;
            p0Var2.setPadding(org.telegram.messenger.g0.L(34.0f), 0, org.telegram.messenger.g0.L(34.0f), 0);
            p0Var2.setGravity(17);
            q6.Y(p0Var2, j6.Ji, e6Var);
            p0Var2.setTextSize(org.telegram.messenger.g0.L(14.0f));
            p0Var2.setTypeface(org.telegram.messenger.g0.o());
            p0Var2.getDrawable().K = true;
            int L = org.telegram.messenger.g0.L(8.0f);
            int o10 = i0.a.o(-1, 120);
            p0Var2.setBackground(j6.k0(L, L, L, L, 0, o10, o10));
            addView(p0Var2);
            paint.setColor(j6.w0(j6.Fi, e6Var));
            this.f58264b = true;
            this.f58265c = e6Var;
            e();
        }
    }
}
