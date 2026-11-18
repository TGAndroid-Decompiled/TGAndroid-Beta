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
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Components.c6;
import org.telegram.ui.Components.lr;
import org.telegram.ui.Components.n80;
import org.telegram.ui.Components.ph0;
import org.telegram.ui.Components.qq;
import org.telegram.ui.Components.rq;
import org.telegram.ui.Components.sp;
import org.telegram.ui.Components.w01;
import org.telegram.ui.c30;
import org.telegram.ui.k71;
public class s0 extends FrameLayout implements n80 {
    public final org.telegram.ui.Components.voip.n E;
    public boolean F;
    public final ph0 G;
    public boolean H;
    public boolean I;
    public rq J;
    public boolean K;
    public boolean L;
    public final c6 M;
    public final c6 N;
    public sp O;
    public float P;
    public boolean Q;
    public ValueAnimator R;
    public final Paint f58859a;
    public final boolean f58860b;
    public final i6 f58861c;
    public float d;
    public boolean f58862e;
    public final r0 f58863f;
    public final r0 h;
    public final int f58864n;
    public boolean f58865r;
    public float f58866s;
    public final w01 f58867w;
    public ValueAnimator f58868x;
    public final Path f58869y;

    public s0(Context context, i6 i6Var, boolean z10) {
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
        r0 r0Var = this.f58863f;
        if (z10 && r0Var.f37737c.h()) {
            r0Var.a();
        }
        r0Var.c(str, z10, true);
        w01 w01Var = this.f58867w;
        w01Var.setContentDescription(str);
        if (!this.L) {
            w01Var.setOnClickListener(onClickListener);
        }
    }

    public final void c(CharSequence charSequence, boolean z10, boolean z11) {
        this.f58865r = true;
        this.F = z10;
        r0 r0Var = this.h;
        r0Var.c(charSequence, z11, true);
        r0Var.setContentDescription(charSequence);
        d(z11);
    }

    public final void d(boolean z10) {
        ValueAnimator valueAnimator = this.f58868x;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.f58868x.cancel();
        }
        float f10 = 0.0f;
        if (!z10) {
            if (this.f58865r) {
                f10 = 1.0f;
            }
            this.f58866s = f10;
            e();
            return;
        }
        float f11 = this.f58866s;
        if (this.f58865r) {
            f10 = 1.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
        this.f58868x = ofFloat;
        ofFloat.addUpdateListener(new d4(this, 12));
        this.f58868x.addListener(new k71(this, 19));
        this.f58868x.setDuration(250L);
        this.f58868x.setInterpolator(lr.f37208f);
        this.f58868x.start();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int L;
        rq rqVar = this.J;
        r0 r0Var = this.h;
        if (rqVar != null) {
            qq qqVar = rqVar.f39274a;
            if (qqVar.h == 0) {
                L = 0;
            } else {
                L = org.telegram.messenger.g0.L(qqVar.C - 0.5f) + qqVar.f38879s;
            }
            c6 c6Var = this.M;
            c6Var.e(false, ((L * 0.85f) + org.telegram.messenger.g0.L(3.0f)) / 2.0f);
            float e10 = (r0Var.getDrawable().e() / 2.0f) + (getMeasuredWidth() / 2.0f) + org.telegram.messenger.g0.L(3.0f);
            c6 c6Var2 = this.N;
            c6Var2.e(false, e10);
            r0Var.setTranslationX(-c6Var.f33892c);
            this.J.setTranslationX(c6Var2.f33892c - c6Var.f33892c);
        } else if (r0Var != null) {
            r0Var.setTranslationX(0.0f);
        }
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        int i7 = (this.f58866s > 1.0f ? 1 : (this.f58866s == 1.0f ? 0 : -1));
        i6 i6Var = this.f58861c;
        boolean z10 = this.f58860b;
        int i10 = this.f58864n;
        Paint paint = this.f58859a;
        if (i7 != 0 || !this.F) {
            if (this.f58862e) {
                float f10 = this.d + 0.016f;
                this.d = f10;
                if (f10 > 3.0f) {
                    this.f58862e = false;
                }
            } else {
                float f11 = this.d - 0.016f;
                this.d = f11;
                if (f11 < 1.0f) {
                    this.f58862e = true;
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
        boolean z11 = s2.f26723a;
        if (!this.I) {
            int measuredWidth = getMeasuredWidth();
            org.telegram.ui.Components.voip.n nVar = this.E;
            nVar.f41050f = measuredWidth;
            nVar.a(i10, canvas, rectF, null);
        }
        if (this.f58866s != 0.0f && this.F) {
            if (z10) {
                paint.setColor(n6.w0(n6.Fi, i6Var));
            }
            paint.setAlpha((int) (this.f58866s * 255.0f));
            if (this.f58866s != 1.0f) {
                Path path = this.f58869y;
                path.rewind();
                path.addCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, Math.max(getMeasuredWidth(), getMeasuredHeight()) * 1.4f * this.f58866s, Path.Direction.CW);
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
        float f10 = this.f58866s;
        r0 r0Var = this.h;
        r0Var.setAlpha(f10);
        r0Var.setTranslationY((1.0f - this.f58866s) * org.telegram.messenger.g0.L(12.0f));
        w01 w01Var = this.f58867w;
        w01Var.setAlpha(1.0f - this.f58866s);
        w01Var.setTranslationY((-org.telegram.messenger.g0.L(12.0f)) * this.f58866s);
        int i10 = 0;
        if (this.f58866s == 1.0f) {
            i7 = 4;
        } else {
            i7 = 0;
        }
        w01Var.setVisibility(i7);
        if (this.f58866s == 0.0f) {
            i10 = 4;
        }
        r0Var.setVisibility(i10);
        invalidate();
    }

    public ph0 getIconView() {
        return this.G;
    }

    public org.telegram.ui.Components.n6 getTextView() {
        return this.f58863f;
    }

    @Override
    public final boolean isEnabled() {
        return this.f58867w.isEnabled();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
    }

    @Override
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        this.f58867w.setEnabled(z10);
    }

    public void setFlickerDisabled(boolean z10) {
        this.I = z10;
        invalidate();
    }

    public void setIcon(int i7) {
        ph0 ph0Var = this.G;
        ph0Var.f(i7, 24, 24, null);
        org.telegram.ui.Components.voip.n nVar = this.E;
        nVar.f41051g = 2.0f;
        nVar.f41059p = new org.telegram.ui.web.z0(this, 25);
        invalidate();
        ph0Var.setVisibility(0);
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
            ofFloat.addUpdateListener(new tg.x1(this, 3));
            this.R.addListener(new c30(17, this, z10));
            this.R.setDuration(320L);
            this.R.setInterpolator(lr.h);
            this.R.start();
        }
    }

    public s0(int i7, Context context, i6 i6Var, boolean z10) {
        super(context);
        Paint paint = new Paint(1);
        this.f58859a = paint;
        this.f58869y = new Path();
        this.K = true;
        this.M = new c6(this);
        this.N = new c6(this);
        this.P = 0.0f;
        this.f58864n = i7;
        org.telegram.ui.Components.voip.n nVar = new org.telegram.ui.Components.voip.n();
        this.E = nVar;
        nVar.f41057n = 1.2f;
        nVar.f41054k = false;
        nVar.f41056m = 4.0f;
        LinearLayout g10 = f3.g(context, 0);
        r0 r0Var = new r0(this, context, 0);
        this.f58863f = r0Var;
        r0Var.b(0.35f, 350L, lr.h);
        r0Var.setGravity(17);
        r0Var.setTextColor(-1);
        r0Var.setTextSize(org.telegram.messenger.g0.L(14.0f));
        r0Var.setTypeface(org.telegram.messenger.g0.o());
        ?? imageView = new ImageView(context);
        this.G = imageView;
        imageView.setColorFilter(-1);
        imageView.setVisibility(8);
        w01 w01Var = new w01(10, context, this);
        this.f58867w = w01Var;
        w01Var.addView(g10, ma.e(-2, -2, 17));
        int o4 = i0.a.o(-1, 120);
        w01Var.setBackground(n6.k0(i7, i7, i7, i7, 0, o4, o4));
        g10.addView(r0Var, ma.r(-2, -2, 16));
        g10.addView((View) imageView, ma.q(24, 24, 0.0f, 16, 4, 0, 0, 0));
        addView(w01Var);
        setOutlineProvider(bg.u0.f3343b);
        setClipToOutline(true);
        ra.b(this, 0.02f, 1.2f);
        if (z10) {
            r0 r0Var2 = new r0(this, context, 1);
            this.h = r0Var2;
            r0Var2.setPadding(org.telegram.messenger.g0.L(34.0f), 0, org.telegram.messenger.g0.L(34.0f), 0);
            r0Var2.setGravity(17);
            u6.Y(r0Var2, n6.Ji, i6Var);
            r0Var2.setTextSize(org.telegram.messenger.g0.L(14.0f));
            r0Var2.setTypeface(org.telegram.messenger.g0.o());
            r0Var2.getDrawable().K = true;
            int L = org.telegram.messenger.g0.L(8.0f);
            int o10 = i0.a.o(-1, 120);
            r0Var2.setBackground(n6.k0(L, L, L, L, 0, o10, o10));
            addView(r0Var2);
            paint.setColor(n6.w0(n6.Fi, i6Var));
            this.f58860b = true;
            this.f58861c = i6Var;
            e();
        }
    }
}
