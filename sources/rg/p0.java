package rg;

import ai.l6;
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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.rk;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.d6;
import org.telegram.ui.Components.nj0;
import org.telegram.ui.Components.o6;
import org.telegram.ui.Components.q90;
import org.telegram.ui.Components.qr;
import org.telegram.ui.Components.tp;
import org.telegram.ui.Components.vq;
import org.telegram.ui.Components.wq;
import org.telegram.ui.h70;
import w7.a6;
import w7.y5;
public class p0 extends FrameLayout implements q90 {
    public boolean E;
    public boolean F;
    public wq G;
    public boolean H;
    public boolean I;
    public final d6 J;
    public final d6 K;
    public tp L;
    public float M;
    public boolean N;
    public ValueAnimator O;
    public final Paint f42740a;
    public float f42741b;
    public boolean f42742c;
    public final o0 d;
    public final o0 e;
    public final int f42743f;
    public boolean h;
    public float f42744n;
    public final ai.f0 f42745r;
    public ValueAnimator f42746s;
    public final Path v;
    public final org.telegram.ui.Components.voip.h f42747w;
    public boolean f42748x;
    public final nj0 f42749y;

    public p0(Context context, f6 f6Var, boolean z10) {
        this(AndroidUtilities.dp(8.0f), context, f6Var, z10);
    }

    public final void a(String str, View.OnClickListener onClickListener, boolean z10) {
        if (!this.E && z10) {
            z10 = true;
        }
        this.E = true;
        o0 o0Var = this.d;
        if (z10 && o0Var.f26995c.f()) {
            o0Var.a();
        }
        o0Var.c(str, z10, true);
        ai.f0 f0Var = this.f42745r;
        f0Var.setContentDescription(str);
        if (!this.I) {
            f0Var.setOnClickListener(onClickListener);
        }
    }

    public final void b(CharSequence charSequence, boolean z10, boolean z11) {
        this.h = true;
        this.f42748x = z10;
        o0 o0Var = this.e;
        o0Var.c(charSequence, z11, true);
        o0Var.setContentDescription(charSequence);
        d(z11);
    }

    @Override
    public final boolean c() {
        return this.N;
    }

    public final void d(boolean z10) {
        ValueAnimator valueAnimator = this.f42746s;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.f42746s.cancel();
        }
        float f7 = 0.0f;
        if (!z10) {
            if (this.h) {
                f7 = 1.0f;
            }
            this.f42744n = f7;
            e();
            return;
        }
        float f10 = this.f42744n;
        if (this.h) {
            f7 = 1.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
        this.f42746s = ofFloat;
        ofFloat.addUpdateListener(new l6(this, 11));
        this.f42746s.addListener(new pg.d0(this, 4));
        this.f42746s.setDuration(250L);
        this.f42746s.setInterpolator(qr.f27653f);
        this.f42746s.start();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int dp;
        wq wqVar = this.G;
        o0 o0Var = this.e;
        if (wqVar != null) {
            vq vqVar = wqVar.f30095a;
            if (vqVar.h == 0) {
                dp = 0;
            } else {
                dp = AndroidUtilities.dp(vqVar.C - 0.5f) + vqVar.f29773s;
            }
            d6 d6Var = this.J;
            d6Var.d(((dp * 0.85f) + AndroidUtilities.dp(3.0f)) / 2.0f, false);
            float e = (o0Var.getDrawable().e() / 2.0f) + (getMeasuredWidth() / 2.0f) + AndroidUtilities.dp(3.0f);
            d6 d6Var2 = this.K;
            d6Var2.d(e, false);
            o0Var.setTranslationX(-d6Var.f23570c);
            this.G.setTranslationX(d6Var2.f23570c - d6Var.f23570c);
        } else if (o0Var != null) {
            o0Var.setTranslationX(0.0f);
        }
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        float f7 = this.f42744n;
        Paint paint = this.f42740a;
        int i10 = this.f42743f;
        if (f7 != 1.0f || !this.f42748x) {
            if (this.f42742c) {
                float f10 = this.f42741b + 0.016f;
                this.f42741b = f10;
                if (f10 > 3.0f) {
                    this.f42742c = false;
                }
            } else {
                float f11 = this.f42741b - 0.016f;
                this.f42741b = f11;
                if (f11 < 1.0f) {
                    this.f42742c = true;
                }
            }
            if (this.H) {
                a1.d().f((-getMeasuredWidth()) * 0.1f * this.f42741b, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                float f12 = i10;
                canvas.drawRoundRect(rectF, f12, f12, a1.d().e());
            } else {
                paint.setAlpha(255);
                float f13 = i10;
                canvas.drawRoundRect(rectF, f13, f13, paint);
            }
            invalidate();
        }
        if (!BuildVars.IS_BILLING_UNAVAILABLE && !this.F) {
            int measuredWidth = getMeasuredWidth();
            org.telegram.ui.Components.voip.h hVar = this.f42747w;
            hVar.f29330f = measuredWidth;
            hVar.a(i10, canvas, rectF, null);
        }
        float f14 = this.f42744n;
        if (f14 != 0.0f && this.f42748x) {
            paint.setAlpha((int) (f14 * 255.0f));
            if (this.f42744n != 1.0f) {
                Path path = this.v;
                path.rewind();
                path.addCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, Math.max(getMeasuredWidth(), getMeasuredHeight()) * 1.4f * this.f42744n, Path.Direction.CW);
                canvas.save();
                canvas.clipPath(path);
                float f15 = i10;
                canvas.drawRoundRect(rectF, f15, f15, paint);
                canvas.restore();
            } else {
                float f16 = i10;
                canvas.drawRoundRect(rectF, f16, f16, paint);
            }
        }
        super.dispatchDraw(canvas);
    }

    public final void e() {
        int i10;
        float f7 = this.f42744n;
        o0 o0Var = this.e;
        o0Var.setAlpha(f7);
        o0Var.setTranslationY((1.0f - this.f42744n) * AndroidUtilities.dp(12.0f));
        ai.f0 f0Var = this.f42745r;
        f0Var.setAlpha(1.0f - this.f42744n);
        f0Var.setTranslationY((-AndroidUtilities.dp(12.0f)) * this.f42744n);
        int i11 = 0;
        if (this.f42744n == 1.0f) {
            i10 = 4;
        } else {
            i10 = 0;
        }
        f0Var.setVisibility(i10);
        if (this.f42744n == 0.0f) {
            i11 = 4;
        }
        o0Var.setVisibility(i11);
        invalidate();
    }

    public nj0 getIconView() {
        return this.f42749y;
    }

    public o6 getTextView() {
        return this.d;
    }

    @Override
    public final boolean isEnabled() {
        return this.f42745r.isEnabled();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
    }

    @Override
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        this.f42745r.setEnabled(z10);
    }

    public void setFlickerDisabled(boolean z10) {
        this.F = z10;
        invalidate();
    }

    public void setIcon(int i10) {
        nj0 nj0Var = this.f42749y;
        nj0Var.f(i10, 24, 24, null);
        org.telegram.ui.Components.voip.h hVar = this.f42747w;
        hVar.f29331g = 2.0f;
        hVar.f29339p = new org.telegram.ui.web.r0(this, 27);
        invalidate();
        nj0Var.setVisibility(0);
    }

    @Override
    public void setLoading(boolean z10) {
        float f7;
        if (this.N != z10) {
            ValueAnimator valueAnimator = this.O;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.O = null;
            }
            float f10 = this.M;
            this.N = z10;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
            this.O = ofFloat;
            ofFloat.addUpdateListener(new org.telegram.ui.Components.voip.r0(this, 16));
            this.O.addListener(new h70(16, this, z10));
            this.O.setDuration(320L);
            this.O.setInterpolator(qr.h);
            this.O.start();
        }
    }

    public p0(int i10, Context context, f6 f6Var, boolean z10) {
        super(context);
        Paint paint = new Paint(1);
        this.f42740a = paint;
        this.v = new Path();
        this.H = true;
        this.J = new d6(this);
        this.K = new d6(this);
        this.M = 0.0f;
        this.f42743f = i10;
        org.telegram.ui.Components.voip.h hVar = new org.telegram.ui.Components.voip.h();
        this.f42747w = hVar;
        hVar.f29337n = 1.2f;
        hVar.f29334k = false;
        hVar.f29336m = 4.0f;
        LinearLayout f7 = rk.f(context, 0);
        o0 o0Var = new o0(this, context, 0);
        this.d = o0Var;
        o0Var.b(0.35f, 350L, qr.h);
        o0Var.setGravity(17);
        o0Var.setTextColor(-1);
        o0Var.setTextSize(AndroidUtilities.dp(14.0f));
        o0Var.setTypeface(AndroidUtilities.bold());
        ?? imageView = new ImageView(context);
        this.f42749y = imageView;
        imageView.setColorFilter(-1);
        imageView.setVisibility(8);
        ai.f0 f0Var = new ai.f0(this, context, 27);
        this.f42745r = f0Var;
        f0Var.addView(f7, y5.e(-2, -2, 17));
        int k10 = i0.a.k(-1, 120);
        f0Var.setBackground(j6.i0(i10, i10, i10, i10, 0, k10, k10));
        f7.addView(o0Var, y5.q(-2, -2, 16));
        f7.addView((View) imageView, y5.p(24, 24, 0.0f, 16, 4, 0, 0, 0));
        addView(f0Var);
        setOutlineProvider(yf.j0.f47162b);
        setClipToOutline(true);
        a6.b(this, 0.02f, 1.2f);
        if (z10) {
            o0 o0Var2 = new o0(this, context, 1);
            this.e = o0Var2;
            o0Var2.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
            o0Var2.setGravity(17);
            o0Var2.setTextColor(j6.v0(j6.Sh, f6Var));
            o0Var2.setTextSize(AndroidUtilities.dp(14.0f));
            o0Var2.setTypeface(AndroidUtilities.bold());
            o0Var2.getDrawable().D = true;
            int dp = AndroidUtilities.dp(8.0f);
            int k11 = i0.a.k(-1, 120);
            o0Var2.setBackground(j6.i0(dp, dp, dp, dp, 0, k11, k11));
            addView(o0Var2);
            paint.setColor(j6.v0(j6.Oh, f6Var));
            e();
        }
    }
}
