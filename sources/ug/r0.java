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
import c8.na;
import c8.sa;
import fi.d4;
import org.telegram.messenger.f3;
import org.telegram.messenger.s2;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Components.c6;
import org.telegram.ui.Components.kr;
import org.telegram.ui.Components.m80;
import org.telegram.ui.Components.pq;
import org.telegram.ui.Components.qh0;
import org.telegram.ui.Components.qq;
import org.telegram.ui.Components.rp;
import org.telegram.ui.Components.w01;
import org.telegram.ui.b30;
import org.telegram.ui.i71;
import tg.c2;
public class r0 extends FrameLayout implements m80 {
    public final org.telegram.ui.Components.voip.n E;
    public boolean F;
    public final qh0 G;
    public boolean H;
    public boolean I;
    public qq J;
    public boolean K;
    public boolean L;
    public final c6 M;
    public final c6 N;
    public rp O;
    public float P;
    public boolean Q;
    public ValueAnimator R;
    public final Paint f58980a;
    public final boolean f58981b;
    public final i6 f58982c;
    public float d;
    public boolean f58983e;
    public final q0 f58984f;
    public final q0 h;
    public final int f58985n;
    public boolean f58986r;
    public float f58987s;
    public final w01 f58988w;
    public ValueAnimator f58989x;
    public final Path f58990y;

    public r0(Context context, i6 i6Var, boolean z10) {
        this(org.telegram.messenger.g0.L(8.0f), context, i6Var, z10);
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
        q0 q0Var = this.f58984f;
        if (z10 && q0Var.f37682c.h()) {
            q0Var.a();
        }
        q0Var.c(str, z10, true);
        w01 w01Var = this.f58988w;
        w01Var.setContentDescription(str);
        if (!this.L) {
            w01Var.setOnClickListener(onClickListener);
        }
    }

    public final void c(CharSequence charSequence, boolean z10, boolean z11) {
        this.f58986r = true;
        this.F = z10;
        q0 q0Var = this.h;
        q0Var.c(charSequence, z11, true);
        q0Var.setContentDescription(charSequence);
        d(z11);
    }

    public final void d(boolean z10) {
        ValueAnimator valueAnimator = this.f58989x;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.f58989x.cancel();
        }
        float f10 = 0.0f;
        if (!z10) {
            if (this.f58986r) {
                f10 = 1.0f;
            }
            this.f58987s = f10;
            e();
            return;
        }
        float f11 = this.f58987s;
        if (this.f58986r) {
            f10 = 1.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
        this.f58989x = ofFloat;
        ofFloat.addUpdateListener(new d4(this, 12));
        this.f58989x.addListener(new i71(this, 19));
        this.f58989x.setDuration(250L);
        this.f58989x.setInterpolator(kr.f36858f);
        this.f58989x.start();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int L;
        qq qqVar = this.J;
        q0 q0Var = this.h;
        if (qqVar != null) {
            pq pqVar = qqVar.f38979a;
            if (pqVar.h == 0) {
                L = 0;
            } else {
                L = org.telegram.messenger.g0.L(pqVar.C - 0.5f) + pqVar.f38557s;
            }
            c6 c6Var = this.M;
            c6Var.e(false, ((L * 0.85f) + org.telegram.messenger.g0.L(3.0f)) / 2.0f);
            float e10 = (q0Var.getDrawable().e() / 2.0f) + (getMeasuredWidth() / 2.0f) + org.telegram.messenger.g0.L(3.0f);
            c6 c6Var2 = this.N;
            c6Var2.e(false, e10);
            q0Var.setTranslationX(-c6Var.f33931c);
            this.J.setTranslationX(c6Var2.f33931c - c6Var.f33931c);
        } else if (q0Var != null) {
            q0Var.setTranslationX(0.0f);
        }
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        int i7 = (this.f58987s > 1.0f ? 1 : (this.f58987s == 1.0f ? 0 : -1));
        i6 i6Var = this.f58982c;
        boolean z10 = this.f58981b;
        int i10 = this.f58985n;
        Paint paint = this.f58980a;
        if (i7 != 0 || !this.F) {
            if (this.f58983e) {
                float f10 = this.d + 0.016f;
                this.d = f10;
                if (f10 > 3.0f) {
                    this.f58983e = false;
                }
            } else {
                float f11 = this.d - 0.016f;
                this.d = f11;
                if (f11 < 1.0f) {
                    this.f58983e = true;
                }
            }
            if (this.K) {
                ia.e.d().f((-getMeasuredWidth()) * 0.1f * this.d, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                float f12 = i10;
                canvas.drawRoundRect(rectF, f12, f12, ia.e.d().e());
            } else {
                if (z10) {
                    paint.setColor(n6.w0(n6.Fi, i6Var));
                }
                paint.setAlpha(255);
                float f13 = i10;
                canvas.drawRoundRect(rectF, f13, f13, paint);
            }
            invalidate();
        }
        boolean z11 = s2.f26829a;
        if (!this.I) {
            int measuredWidth = getMeasuredWidth();
            org.telegram.ui.Components.voip.n nVar = this.E;
            nVar.f41074f = measuredWidth;
            nVar.a(i10, canvas, rectF, null);
        }
        if (this.f58987s != 0.0f && this.F) {
            if (z10) {
                paint.setColor(n6.w0(n6.Fi, i6Var));
            }
            paint.setAlpha((int) (this.f58987s * 255.0f));
            if (this.f58987s != 1.0f) {
                Path path = this.f58990y;
                path.rewind();
                path.addCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, Math.max(getMeasuredWidth(), getMeasuredHeight()) * 1.4f * this.f58987s, Path.Direction.CW);
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
        float f10 = this.f58987s;
        q0 q0Var = this.h;
        q0Var.setAlpha(f10);
        q0Var.setTranslationY((1.0f - this.f58987s) * org.telegram.messenger.g0.L(12.0f));
        w01 w01Var = this.f58988w;
        w01Var.setAlpha(1.0f - this.f58987s);
        w01Var.setTranslationY((-org.telegram.messenger.g0.L(12.0f)) * this.f58987s);
        int i10 = 0;
        if (this.f58987s == 1.0f) {
            i7 = 4;
        } else {
            i7 = 0;
        }
        w01Var.setVisibility(i7);
        if (this.f58987s == 0.0f) {
            i10 = 4;
        }
        q0Var.setVisibility(i10);
        invalidate();
    }

    public qh0 getIconView() {
        return this.G;
    }

    public org.telegram.ui.Components.n6 getTextView() {
        return this.f58984f;
    }

    @Override
    public final boolean isEnabled() {
        return this.f58988w.isEnabled();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
    }

    @Override
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        this.f58988w.setEnabled(z10);
    }

    public void setFlickerDisabled(boolean z10) {
        this.I = z10;
        invalidate();
    }

    public void setIcon(int i7) {
        qh0 qh0Var = this.G;
        qh0Var.f(i7, 24, 24, null);
        org.telegram.ui.Components.voip.n nVar = this.E;
        nVar.f41075g = 2.0f;
        nVar.f41083p = new org.telegram.ui.web.z0(this, 26);
        invalidate();
        qh0Var.setVisibility(0);
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
            ofFloat.addUpdateListener(new c2(this, 3));
            this.R.addListener(new b30(17, this, z10));
            this.R.setDuration(320L);
            this.R.setInterpolator(kr.h);
            this.R.start();
        }
    }

    public r0(int i7, Context context, i6 i6Var, boolean z10) {
        super(context);
        Paint paint = new Paint(1);
        this.f58980a = paint;
        this.f58990y = new Path();
        this.K = true;
        this.M = new c6(this);
        this.N = new c6(this);
        this.P = 0.0f;
        this.f58985n = i7;
        org.telegram.ui.Components.voip.n nVar = new org.telegram.ui.Components.voip.n();
        this.E = nVar;
        nVar.f41081n = 1.2f;
        nVar.f41078k = false;
        nVar.f41080m = 4.0f;
        LinearLayout g10 = f3.g(context, 0);
        q0 q0Var = new q0(this, context, 0);
        this.f58984f = q0Var;
        q0Var.b(0.35f, 350L, kr.h);
        q0Var.setGravity(17);
        q0Var.setTextColor(-1);
        q0Var.setTextSize(org.telegram.messenger.g0.L(14.0f));
        q0Var.setTypeface(org.telegram.messenger.g0.o());
        ?? imageView = new ImageView(context);
        this.G = imageView;
        imageView.setColorFilter(-1);
        imageView.setVisibility(8);
        w01 w01Var = new w01(10, context, this);
        this.f58988w = w01Var;
        w01Var.addView(g10, na.e(-2, -2, 17));
        int o4 = i0.a.o(-1, 120);
        w01Var.setBackground(n6.k0(i7, i7, i7, i7, 0, o4, o4));
        g10.addView(q0Var, na.r(-2, -2, 16));
        g10.addView((View) imageView, na.q(24, 24, 0.0f, 16, 4, 0, 0, 0));
        addView(w01Var);
        setOutlineProvider(bg.u0.f3314b);
        setClipToOutline(true);
        sa.b(this, 0.02f, 1.2f);
        if (z10) {
            q0 q0Var2 = new q0(this, context, 1);
            this.h = q0Var2;
            q0Var2.setPadding(org.telegram.messenger.g0.L(34.0f), 0, org.telegram.messenger.g0.L(34.0f), 0);
            q0Var2.setGravity(17);
            u6.Y(q0Var2, n6.Ji, i6Var);
            q0Var2.setTextSize(org.telegram.messenger.g0.L(14.0f));
            q0Var2.setTypeface(org.telegram.messenger.g0.o());
            q0Var2.getDrawable().K = true;
            int L = org.telegram.messenger.g0.L(8.0f);
            int o10 = i0.a.o(-1, 120);
            q0Var2.setBackground(n6.k0(L, L, L, L, 0, o10, o10));
            addView(q0Var2);
            paint.setColor(n6.w0(n6.Fi, i6Var));
            this.f58981b = true;
            this.f58982c = i6Var;
            e();
        }
    }
}
