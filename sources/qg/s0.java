package qg;

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
import bi.ld;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.em;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.br;
import org.telegram.ui.Components.cr;
import org.telegram.ui.Components.d6;
import org.telegram.ui.Components.kj0;
import org.telegram.ui.Components.o6;
import org.telegram.ui.Components.p90;
import org.telegram.ui.Components.wr;
import org.telegram.ui.Components.zp;
import org.telegram.ui.iw0;
import org.telegram.ui.mv0;
import w7.a6;
import w7.c6;
public class s0 extends FrameLayout implements p90 {
    public boolean E;
    public boolean F;
    public cr G;
    public boolean H;
    public boolean I;
    public final d6 J;
    public final d6 K;
    public zp L;
    public float M;
    public boolean N;
    public ValueAnimator O;
    public final Paint f40899a;
    public float f40900b;
    public boolean f40901c;
    public final r0 d;
    public final r0 e;
    public final int f40902f;
    public boolean h;
    public float f40903n;
    public final ld f40904r;
    public ValueAnimator f40905s;
    public final Path v;
    public final org.telegram.ui.Components.voip.h f40906w;
    public boolean f40907x;
    public final kj0 f40908y;

    public s0(Context context, f6 f6Var, boolean z10) {
        this(AndroidUtilities.dp(8.0f), context, f6Var, z10);
    }

    public final void a(String str, View.OnClickListener onClickListener, boolean z10) {
        if (!this.E && z10) {
            z10 = true;
        }
        this.E = true;
        r0 r0Var = this.d;
        if (z10 && r0Var.f25680c.f()) {
            r0Var.a();
        }
        r0Var.c(str, z10, true);
        ld ldVar = this.f40904r;
        ldVar.setContentDescription(str);
        if (!this.I) {
            ldVar.setOnClickListener(onClickListener);
        }
    }

    public final void b(CharSequence charSequence, boolean z10, boolean z11) {
        this.h = true;
        this.f40907x = z10;
        r0 r0Var = this.e;
        r0Var.c(charSequence, z11, true);
        r0Var.setContentDescription(charSequence);
        d(z11);
    }

    @Override
    public final boolean c() {
        return this.N;
    }

    public final void d(boolean z10) {
        ValueAnimator valueAnimator = this.f40905s;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.f40905s.cancel();
        }
        float f7 = 0.0f;
        if (!z10) {
            if (this.h) {
                f7 = 1.0f;
            }
            this.f40903n = f7;
            e();
            return;
        }
        float f10 = this.f40903n;
        if (this.h) {
            f7 = 1.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
        this.f40905s = ofFloat;
        ofFloat.addUpdateListener(new ai.m(this, 10));
        this.f40905s.addListener(new mv0(this, 21));
        this.f40905s.setDuration(250L);
        this.f40905s.setInterpolator(wr.f28819f);
        this.f40905s.start();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int dp;
        cr crVar = this.G;
        r0 r0Var = this.e;
        if (crVar != null) {
            br brVar = crVar.f22215a;
            if (brVar.h == 0) {
                dp = 0;
            } else {
                dp = AndroidUtilities.dp(brVar.C - 0.5f) + brVar.f21884s;
            }
            d6 d6Var = this.J;
            d6Var.d(((dp * 0.85f) + AndroidUtilities.dp(3.0f)) / 2.0f, false);
            float e = (r0Var.getDrawable().e() / 2.0f) + (getMeasuredWidth() / 2.0f) + AndroidUtilities.dp(3.0f);
            d6 d6Var2 = this.K;
            d6Var2.d(e, false);
            r0Var.setTranslationX(-d6Var.f22295c);
            this.G.setTranslationX(d6Var2.f22295c - d6Var.f22295c);
        } else if (r0Var != null) {
            r0Var.setTranslationX(0.0f);
        }
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        float f7 = this.f40903n;
        Paint paint = this.f40899a;
        int i10 = this.f40902f;
        if (f7 != 1.0f || !this.f40907x) {
            if (this.f40901c) {
                float f10 = this.f40900b + 0.016f;
                this.f40900b = f10;
                if (f10 > 3.0f) {
                    this.f40901c = false;
                }
            } else {
                float f11 = this.f40900b - 0.016f;
                this.f40900b = f11;
                if (f11 < 1.0f) {
                    this.f40901c = true;
                }
            }
            if (this.H) {
                d1.d().f((-getMeasuredWidth()) * 0.1f * this.f40900b, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                float f12 = i10;
                canvas.drawRoundRect(rectF, f12, f12, d1.d().e());
            } else {
                paint.setAlpha(255);
                float f13 = i10;
                canvas.drawRoundRect(rectF, f13, f13, paint);
            }
            invalidate();
        }
        if (!BuildVars.IS_BILLING_UNAVAILABLE && !this.F) {
            int measuredWidth = getMeasuredWidth();
            org.telegram.ui.Components.voip.h hVar = this.f40906w;
            hVar.f28147f = measuredWidth;
            hVar.a(i10, canvas, rectF, null);
        }
        float f14 = this.f40903n;
        if (f14 != 0.0f && this.f40907x) {
            paint.setAlpha((int) (f14 * 255.0f));
            if (this.f40903n != 1.0f) {
                Path path = this.v;
                path.rewind();
                path.addCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, Math.max(getMeasuredWidth(), getMeasuredHeight()) * 1.4f * this.f40903n, Path.Direction.CW);
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
        float f7 = this.f40903n;
        r0 r0Var = this.e;
        r0Var.setAlpha(f7);
        r0Var.setTranslationY((1.0f - this.f40903n) * AndroidUtilities.dp(12.0f));
        ld ldVar = this.f40904r;
        ldVar.setAlpha(1.0f - this.f40903n);
        ldVar.setTranslationY((-AndroidUtilities.dp(12.0f)) * this.f40903n);
        int i11 = 0;
        if (this.f40903n == 1.0f) {
            i10 = 4;
        } else {
            i10 = 0;
        }
        ldVar.setVisibility(i10);
        if (this.f40903n == 0.0f) {
            i11 = 4;
        }
        r0Var.setVisibility(i11);
        invalidate();
    }

    public kj0 getIconView() {
        return this.f40908y;
    }

    public o6 getTextView() {
        return this.d;
    }

    @Override
    public final boolean isEnabled() {
        return this.f40904r.isEnabled();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
    }

    @Override
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        this.f40904r.setEnabled(z10);
    }

    public void setFlickerDisabled(boolean z10) {
        this.F = z10;
        invalidate();
    }

    public void setIcon(int i10) {
        kj0 kj0Var = this.f40908y;
        kj0Var.f(i10, 24, 24, null);
        org.telegram.ui.Components.voip.h hVar = this.f40906w;
        hVar.f28148g = 2.0f;
        hVar.f28156p = new q0(this, 0);
        invalidate();
        kj0Var.setVisibility(0);
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
            ofFloat.addUpdateListener(new o(this, 1));
            this.O.addListener(new iw0(12, this, z10));
            this.O.setDuration(320L);
            this.O.setInterpolator(wr.h);
            this.O.start();
        }
    }

    public s0(int i10, Context context, f6 f6Var, boolean z10) {
        super(context);
        Paint paint = new Paint(1);
        this.f40899a = paint;
        this.v = new Path();
        this.H = true;
        this.J = new d6(this);
        this.K = new d6(this);
        this.M = 0.0f;
        this.f40902f = i10;
        org.telegram.ui.Components.voip.h hVar = new org.telegram.ui.Components.voip.h();
        this.f40906w = hVar;
        hVar.f28154n = 1.2f;
        hVar.f28151k = false;
        hVar.f28153m = 4.0f;
        LinearLayout f7 = em.f(context, 0);
        r0 r0Var = new r0(this, context, 0);
        this.d = r0Var;
        r0Var.b(0.35f, 350L, wr.h);
        r0Var.setGravity(17);
        r0Var.setTextColor(-1);
        r0Var.setTextSize(AndroidUtilities.dp(14.0f));
        r0Var.setTypeface(AndroidUtilities.bold());
        ?? imageView = new ImageView(context);
        this.f40908y = imageView;
        imageView.setColorFilter(-1);
        imageView.setVisibility(8);
        ld ldVar = new ld(this, context, 25);
        this.f40904r = ldVar;
        ldVar.addView(f7, a6.e(-2, -2, 17));
        int k10 = i0.a.k(-1, 120);
        ldVar.setBackground(j6.i0(i10, i10, i10, i10, 0, k10, k10));
        f7.addView(r0Var, a6.q(-2, -2, 16));
        f7.addView((View) imageView, a6.p(24, 24, 0.0f, 16, 4, 0, 0, 0));
        addView(ldVar);
        setOutlineProvider(xf.k0.f45157b);
        setClipToOutline(true);
        c6.b(this, 0.02f, 1.2f);
        if (z10) {
            r0 r0Var2 = new r0(this, context, 1);
            this.e = r0Var2;
            r0Var2.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
            r0Var2.setGravity(17);
            r0Var2.setTextColor(j6.v0(j6.Sh, f6Var));
            r0Var2.setTextSize(AndroidUtilities.dp(14.0f));
            r0Var2.setTypeface(AndroidUtilities.bold());
            r0Var2.getDrawable().D = true;
            int dp = AndroidUtilities.dp(8.0f);
            int k11 = i0.a.k(-1, 120);
            r0Var2.setBackground(j6.i0(dp, dp, dp, dp, 0, k11, k11));
            addView(r0Var2);
            paint.setColor(j6.v0(j6.Oh, f6Var));
            e();
        }
    }
}
