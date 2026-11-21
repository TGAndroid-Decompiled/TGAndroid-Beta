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
import c8.ma;
import c8.ra;
import fi.d4;
import org.telegram.messenger.f3;
import org.telegram.messenger.s2;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.d6;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.o6;
import org.telegram.ui.Components.p80;
import org.telegram.ui.Components.rh0;
import org.telegram.ui.Components.sq;
import org.telegram.ui.Components.tq;
import org.telegram.ui.Components.up;
import org.telegram.ui.Components.y01;
import org.telegram.ui.c30;
import org.telegram.ui.k71;
import tg.z1;
public class r0 extends FrameLayout implements p80 {
    public final org.telegram.ui.Components.voip.n E;
    public boolean F;
    public final rh0 G;
    public boolean H;
    public boolean I;
    public tq J;
    public boolean K;
    public boolean L;
    public final d6 M;
    public final d6 N;
    public up O;
    public float P;
    public boolean Q;
    public ValueAnimator R;
    public final Paint f58896a;
    public final boolean f58897b;
    public final h6 f58898c;
    public float d;
    public boolean f58899e;
    public final q0 f58900f;
    public final q0 h;
    public final int f58901n;
    public boolean f58902r;
    public float f58903s;
    public final y01 f58904w;
    public ValueAnimator f58905x;
    public final Path f58906y;

    public r0(Context context, h6 h6Var, boolean z10) {
        this(org.telegram.messenger.g0.L(8.0f), context, h6Var, z10);
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
        q0 q0Var = this.f58900f;
        if (z10 && q0Var.f38122c.h()) {
            q0Var.a();
        }
        q0Var.c(str, z10, true);
        y01 y01Var = this.f58904w;
        y01Var.setContentDescription(str);
        if (!this.L) {
            y01Var.setOnClickListener(onClickListener);
        }
    }

    public final void c(CharSequence charSequence, boolean z10, boolean z11) {
        this.f58902r = true;
        this.F = z10;
        q0 q0Var = this.h;
        q0Var.c(charSequence, z11, true);
        q0Var.setContentDescription(charSequence);
        d(z11);
    }

    public final void d(boolean z10) {
        ValueAnimator valueAnimator = this.f58905x;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.f58905x.cancel();
        }
        float f10 = 0.0f;
        if (!z10) {
            if (this.f58902r) {
                f10 = 1.0f;
            }
            this.f58903s = f10;
            e();
            return;
        }
        float f11 = this.f58903s;
        if (this.f58902r) {
            f10 = 1.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
        this.f58905x = ofFloat;
        ofFloat.addUpdateListener(new d4(this, 12));
        this.f58905x.addListener(new k71(this, 19));
        this.f58905x.setDuration(250L);
        this.f58905x.setInterpolator(nr.f37956f);
        this.f58905x.start();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int L;
        tq tqVar = this.J;
        q0 q0Var = this.h;
        if (tqVar != null) {
            sq sqVar = tqVar.f40023a;
            if (sqVar.h == 0) {
                L = 0;
            } else {
                L = org.telegram.messenger.g0.L(sqVar.C - 0.5f) + sqVar.f39675s;
            }
            d6 d6Var = this.M;
            d6Var.e(false, ((L * 0.85f) + org.telegram.messenger.g0.L(3.0f)) / 2.0f);
            float e10 = (q0Var.getDrawable().e() / 2.0f) + (getMeasuredWidth() / 2.0f) + org.telegram.messenger.g0.L(3.0f);
            d6 d6Var2 = this.N;
            d6Var2.e(false, e10);
            q0Var.setTranslationX(-d6Var.f34391c);
            this.J.setTranslationX(d6Var2.f34391c - d6Var.f34391c);
        } else if (q0Var != null) {
            q0Var.setTranslationX(0.0f);
        }
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        int i7 = (this.f58903s > 1.0f ? 1 : (this.f58903s == 1.0f ? 0 : -1));
        h6 h6Var = this.f58898c;
        boolean z10 = this.f58897b;
        int i10 = this.f58901n;
        Paint paint = this.f58896a;
        if (i7 != 0 || !this.F) {
            if (this.f58899e) {
                float f10 = this.d + 0.016f;
                this.d = f10;
                if (f10 > 3.0f) {
                    this.f58899e = false;
                }
            } else {
                float f11 = this.d - 0.016f;
                this.d = f11;
                if (f11 < 1.0f) {
                    this.f58899e = true;
                }
            }
            if (this.K) {
                ia.e.d().f((-getMeasuredWidth()) * 0.1f * this.d, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                float f12 = i10;
                canvas.drawRoundRect(rectF, f12, f12, ia.e.d().e());
            } else {
                if (z10) {
                    paint.setColor(m6.w0(m6.Fi, h6Var));
                }
                paint.setAlpha(255);
                float f13 = i10;
                canvas.drawRoundRect(rectF, f13, f13, paint);
            }
            invalidate();
        }
        boolean z11 = s2.f26749a;
        if (!this.I) {
            int measuredWidth = getMeasuredWidth();
            org.telegram.ui.Components.voip.n nVar = this.E;
            nVar.f41185f = measuredWidth;
            nVar.a(i10, canvas, rectF, null);
        }
        if (this.f58903s != 0.0f && this.F) {
            if (z10) {
                paint.setColor(m6.w0(m6.Fi, h6Var));
            }
            paint.setAlpha((int) (this.f58903s * 255.0f));
            if (this.f58903s != 1.0f) {
                Path path = this.f58906y;
                path.rewind();
                path.addCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, Math.max(getMeasuredWidth(), getMeasuredHeight()) * 1.4f * this.f58903s, Path.Direction.CW);
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
        float f10 = this.f58903s;
        q0 q0Var = this.h;
        q0Var.setAlpha(f10);
        q0Var.setTranslationY((1.0f - this.f58903s) * org.telegram.messenger.g0.L(12.0f));
        y01 y01Var = this.f58904w;
        y01Var.setAlpha(1.0f - this.f58903s);
        y01Var.setTranslationY((-org.telegram.messenger.g0.L(12.0f)) * this.f58903s);
        int i10 = 0;
        if (this.f58903s == 1.0f) {
            i7 = 4;
        } else {
            i7 = 0;
        }
        y01Var.setVisibility(i7);
        if (this.f58903s == 0.0f) {
            i10 = 4;
        }
        q0Var.setVisibility(i10);
        invalidate();
    }

    public rh0 getIconView() {
        return this.G;
    }

    public o6 getTextView() {
        return this.f58900f;
    }

    @Override
    public final boolean isEnabled() {
        return this.f58904w.isEnabled();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
    }

    @Override
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        this.f58904w.setEnabled(z10);
    }

    public void setFlickerDisabled(boolean z10) {
        this.I = z10;
        invalidate();
    }

    public void setIcon(int i7) {
        rh0 rh0Var = this.G;
        rh0Var.f(i7, 24, 24, null);
        org.telegram.ui.Components.voip.n nVar = this.E;
        nVar.f41186g = 2.0f;
        nVar.f41194p = new org.telegram.ui.web.z0(this, 25);
        invalidate();
        rh0Var.setVisibility(0);
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
            ofFloat.addUpdateListener(new z1(this, 3));
            this.R.addListener(new c30(17, this, z10));
            this.R.setDuration(320L);
            this.R.setInterpolator(nr.h);
            this.R.start();
        }
    }

    public r0(int i7, Context context, h6 h6Var, boolean z10) {
        super(context);
        Paint paint = new Paint(1);
        this.f58896a = paint;
        this.f58906y = new Path();
        this.K = true;
        this.M = new d6(this);
        this.N = new d6(this);
        this.P = 0.0f;
        this.f58901n = i7;
        org.telegram.ui.Components.voip.n nVar = new org.telegram.ui.Components.voip.n();
        this.E = nVar;
        nVar.f41192n = 1.2f;
        nVar.f41189k = false;
        nVar.f41191m = 4.0f;
        LinearLayout g10 = f3.g(context, 0);
        q0 q0Var = new q0(this, context, 0);
        this.f58900f = q0Var;
        q0Var.b(0.35f, 350L, nr.h);
        q0Var.setGravity(17);
        q0Var.setTextColor(-1);
        q0Var.setTextSize(org.telegram.messenger.g0.L(14.0f));
        q0Var.setTypeface(org.telegram.messenger.g0.o());
        ?? imageView = new ImageView(context);
        this.G = imageView;
        imageView.setColorFilter(-1);
        imageView.setVisibility(8);
        y01 y01Var = new y01(10, context, this);
        this.f58904w = y01Var;
        y01Var.addView(g10, ma.e(-2, -2, 17));
        int o4 = i0.a.o(-1, 120);
        y01Var.setBackground(m6.k0(i7, i7, i7, i7, 0, o4, o4));
        g10.addView(q0Var, ma.r(-2, -2, 16));
        g10.addView((View) imageView, ma.q(24, 24, 0.0f, 16, 4, 0, 0, 0));
        addView(y01Var);
        setOutlineProvider(bg.u0.f3356b);
        setClipToOutline(true);
        ra.b(this, 0.02f, 1.2f);
        if (z10) {
            q0 q0Var2 = new q0(this, context, 1);
            this.h = q0Var2;
            q0Var2.setPadding(org.telegram.messenger.g0.L(34.0f), 0, org.telegram.messenger.g0.L(34.0f), 0);
            q0Var2.setGravity(17);
            t6.Y(q0Var2, m6.Ji, h6Var);
            q0Var2.setTextSize(org.telegram.messenger.g0.L(14.0f));
            q0Var2.setTypeface(org.telegram.messenger.g0.o());
            q0Var2.getDrawable().K = true;
            int L = org.telegram.messenger.g0.L(8.0f);
            int o10 = i0.a.o(-1, 120);
            q0Var2.setBackground(m6.k0(L, L, L, L, 0, o10, o10));
            addView(q0Var2);
            paint.setColor(m6.w0(m6.Fi, h6Var));
            this.f58897b = true;
            this.f58898c = h6Var;
            e();
        }
    }
}
