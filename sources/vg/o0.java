package vg;

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
import b8.mf;
import b8.pf;
import ei.n4;
import org.telegram.messenger.k5;
import org.telegram.messenger.r2;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.cp;
import org.telegram.ui.Components.cq;
import org.telegram.ui.Components.dq;
import org.telegram.ui.Components.fh0;
import org.telegram.ui.Components.h6;
import org.telegram.ui.Components.kw0;
import org.telegram.ui.Components.u5;
import org.telegram.ui.Components.v70;
import org.telegram.ui.Components.xq;
import org.telegram.ui.i81;
import org.telegram.ui.u40;
import ug.f2;
public class o0 extends FrameLayout implements v70 {
    public final org.telegram.ui.Components.voip.g E;
    public boolean F;
    public final fh0 G;
    public boolean H;
    public boolean I;
    public dq J;
    public boolean K;
    public boolean L;
    public final u5 M;
    public final u5 N;
    public cp O;
    public float P;
    public boolean Q;
    public ValueAnimator R;
    public final Paint f56759a;
    public final boolean f56760b;
    public final e6 f56761c;
    public float d;
    public boolean f56762e;
    public final n0 f56763f;
    public final n0 h;
    public final int f56764n;
    public boolean f56765r;
    public float f56766s;
    public final kw0 f56767w;
    public ValueAnimator f56768x;
    public final Path f56769y;

    public o0(Context context, e6 e6Var, boolean z10) {
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
        n0 n0Var = this.f56763f;
        if (z10 && n0Var.f34307c.h()) {
            n0Var.a();
        }
        n0Var.c(str, z10, true);
        kw0 kw0Var = this.f56767w;
        kw0Var.setContentDescription(str);
        if (!this.L) {
            kw0Var.setOnClickListener(onClickListener);
        }
    }

    public final void c(CharSequence charSequence, boolean z10, boolean z11) {
        this.f56765r = true;
        this.F = z10;
        n0 n0Var = this.h;
        n0Var.c(charSequence, z11, true);
        n0Var.setContentDescription(charSequence);
        d(z11);
    }

    public final void d(boolean z10) {
        ValueAnimator valueAnimator = this.f56768x;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.f56768x.cancel();
        }
        float f10 = 0.0f;
        if (!z10) {
            if (this.f56765r) {
                f10 = 1.0f;
            }
            this.f56766s = f10;
            e();
            return;
        }
        float f11 = this.f56766s;
        if (this.f56765r) {
            f10 = 1.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
        this.f56768x = ofFloat;
        ofFloat.addUpdateListener(new n4(this, 13));
        this.f56768x.addListener(new i81(this, 18));
        this.f56768x.setDuration(250L);
        this.f56768x.setInterpolator(xq.f40452f);
        this.f56768x.start();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int L;
        dq dqVar = this.J;
        n0 n0Var = this.h;
        if (dqVar != null) {
            cq cqVar = dqVar.f33180a;
            if (cqVar.h == 0) {
                L = 0;
            } else {
                L = org.telegram.messenger.g0.L(cqVar.C - 0.5f) + cqVar.f32812s;
            }
            u5 u5Var = this.M;
            u5Var.e(false, ((L * 0.85f) + org.telegram.messenger.g0.L(3.0f)) / 2.0f);
            float e10 = (n0Var.getDrawable().e() / 2.0f) + (getMeasuredWidth() / 2.0f) + org.telegram.messenger.g0.L(3.0f);
            u5 u5Var2 = this.N;
            u5Var2.e(false, e10);
            n0Var.setTranslationX(-u5Var.f38645c);
            this.J.setTranslationX(u5Var2.f38645c - u5Var.f38645c);
        } else if (n0Var != null) {
            n0Var.setTranslationX(0.0f);
        }
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        int i3 = (this.f56766s > 1.0f ? 1 : (this.f56766s == 1.0f ? 0 : -1));
        e6 e6Var = this.f56761c;
        boolean z10 = this.f56760b;
        int i10 = this.f56764n;
        Paint paint = this.f56759a;
        if (i3 != 0 || !this.F) {
            if (this.f56762e) {
                float f10 = this.d + 0.016f;
                this.d = f10;
                if (f10 > 3.0f) {
                    this.f56762e = false;
                }
            } else {
                float f11 = this.d - 0.016f;
                this.d = f11;
                if (f11 < 1.0f) {
                    this.f56762e = true;
                }
            }
            if (this.K) {
                ha.e.d().f((-getMeasuredWidth()) * 0.1f * this.d, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                float f12 = i10;
                canvas.drawRoundRect(rectF, f12, f12, ha.e.d().e());
            } else {
                if (z10) {
                    paint.setColor(k6.w0(k6.Ci, e6Var));
                }
                paint.setAlpha(255);
                float f13 = i10;
                canvas.drawRoundRect(rectF, f13, f13, paint);
            }
            invalidate();
        }
        boolean z11 = r2.f25040a;
        if (!this.I) {
            int measuredWidth = getMeasuredWidth();
            org.telegram.ui.Components.voip.g gVar = this.E;
            gVar.f39349f = measuredWidth;
            gVar.a(i10, canvas, rectF, null);
        }
        if (this.f56766s != 0.0f && this.F) {
            if (z10) {
                paint.setColor(k6.w0(k6.Ci, e6Var));
            }
            paint.setAlpha((int) (this.f56766s * 255.0f));
            if (this.f56766s != 1.0f) {
                Path path = this.f56769y;
                path.rewind();
                path.addCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, Math.max(getMeasuredWidth(), getMeasuredHeight()) * 1.4f * this.f56766s, Path.Direction.CW);
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
        int i3;
        float f10 = this.f56766s;
        n0 n0Var = this.h;
        n0Var.setAlpha(f10);
        n0Var.setTranslationY((1.0f - this.f56766s) * org.telegram.messenger.g0.L(12.0f));
        kw0 kw0Var = this.f56767w;
        kw0Var.setAlpha(1.0f - this.f56766s);
        kw0Var.setTranslationY((-org.telegram.messenger.g0.L(12.0f)) * this.f56766s);
        int i10 = 0;
        if (this.f56766s == 1.0f) {
            i3 = 4;
        } else {
            i3 = 0;
        }
        kw0Var.setVisibility(i3);
        if (this.f56766s == 0.0f) {
            i10 = 4;
        }
        n0Var.setVisibility(i10);
        invalidate();
    }

    public fh0 getIconView() {
        return this.G;
    }

    public h6 getTextView() {
        return this.f56763f;
    }

    @Override
    public final boolean isEnabled() {
        return this.f56767w.isEnabled();
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(i3, i10);
    }

    @Override
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        this.f56767w.setEnabled(z10);
    }

    public void setFlickerDisabled(boolean z10) {
        this.I = z10;
        invalidate();
    }

    public void setIcon(int i3) {
        fh0 fh0Var = this.G;
        fh0Var.f(i3, 24, 24, null);
        org.telegram.ui.Components.voip.g gVar = this.E;
        gVar.f39350g = 2.0f;
        gVar.f39358p = new r4.u(this, 19);
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
            ofFloat.addUpdateListener(new f2(this, 2));
            this.R.addListener(new u40(17, this, z10));
            this.R.setDuration(320L);
            this.R.setInterpolator(xq.h);
            this.R.start();
        }
    }

    public o0(int i3, Context context, e6 e6Var, boolean z10) {
        super(context);
        Paint paint = new Paint(1);
        this.f56759a = paint;
        this.f56769y = new Path();
        this.K = true;
        this.M = new u5(this);
        this.N = new u5(this);
        this.P = 0.0f;
        this.f56764n = i3;
        org.telegram.ui.Components.voip.g gVar = new org.telegram.ui.Components.voip.g();
        this.E = gVar;
        gVar.f39356n = 1.2f;
        gVar.f39353k = false;
        gVar.f39355m = 4.0f;
        LinearLayout f10 = k5.f(context, 0);
        n0 n0Var = new n0(this, context, 0);
        this.f56763f = n0Var;
        n0Var.b(0.35f, 350L, xq.h);
        n0Var.setGravity(17);
        n0Var.setTextColor(-1);
        n0Var.setTextSize(org.telegram.messenger.g0.L(14.0f));
        n0Var.setTypeface(org.telegram.messenger.g0.o());
        ?? imageView = new ImageView(context);
        this.G = imageView;
        imageView.setColorFilter(-1);
        imageView.setVisibility(8);
        kw0 kw0Var = new kw0(11, context, this);
        this.f56767w = kw0Var;
        kw0Var.addView(f10, mf.e(-2, -2, 17));
        int o10 = i0.a.o(-1, 120);
        kw0Var.setBackground(k6.k0(i3, i3, i3, i3, 0, o10, o10));
        f10.addView(n0Var, mf.r(-2, -2, 16));
        f10.addView((View) imageView, mf.q(24, 24, 0.0f, 16, 4, 0, 0, 0));
        addView(kw0Var);
        setOutlineProvider(cg.t0.f4746b);
        setClipToOutline(true);
        pf.b(this, 0.02f, 1.2f);
        if (z10) {
            n0 n0Var2 = new n0(this, context, 1);
            this.h = n0Var2;
            n0Var2.setPadding(org.telegram.messenger.g0.L(34.0f), 0, org.telegram.messenger.g0.L(34.0f), 0);
            n0Var2.setGravity(17);
            r6.Z(n0Var2, k6.Gi, e6Var);
            n0Var2.setTextSize(org.telegram.messenger.g0.L(14.0f));
            n0Var2.setTypeface(org.telegram.messenger.g0.o());
            n0Var2.getDrawable().J = true;
            int L = org.telegram.messenger.g0.L(8.0f);
            int o11 = i0.a.o(-1, 120);
            n0Var2.setBackground(k6.k0(L, L, L, L, 0, o11, o11));
            addView(n0Var2);
            paint.setColor(k6.w0(k6.Ci, e6Var));
            this.f56760b = true;
            this.f56761c = e6Var;
            e();
        }
    }
}
