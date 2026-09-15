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
import org.telegram.messenger.wl;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.aj0;
import org.telegram.ui.Components.c6;
import org.telegram.ui.Components.f90;
import org.telegram.ui.Components.n6;
import org.telegram.ui.Components.qr;
import org.telegram.ui.Components.tp;
import org.telegram.ui.Components.vq;
import org.telegram.ui.Components.wq;
import org.telegram.ui.h70;
import w7.x5;
import w7.z5;
public class p0 extends FrameLayout implements f90 {
    public boolean E;
    public boolean F;
    public wq G;
    public boolean H;
    public boolean I;
    public final c6 J;
    public final c6 K;
    public tp L;
    public float M;
    public boolean N;
    public ValueAnimator O;
    public final Paint f42421a;
    public float f42422b;
    public boolean f42423c;
    public final o0 d;
    public final o0 e;
    public final int f42424f;
    public boolean h;
    public float f42425n;
    public final ai.f0 f42426r;
    public ValueAnimator f42427s;
    public final Path v;
    public final org.telegram.ui.Components.voip.h f42428w;
    public boolean f42429x;
    public final aj0 f42430y;

    public p0(Context context, e6 e6Var, boolean z10) {
        this(AndroidUtilities.dp(8.0f), context, e6Var, z10);
    }

    public final void a(String str, View.OnClickListener onClickListener, boolean z10) {
        if (!this.E && z10) {
            z10 = true;
        }
        this.E = true;
        o0 o0Var = this.d;
        if (z10 && o0Var.f26330c.f()) {
            o0Var.a();
        }
        o0Var.c(str, z10, true);
        ai.f0 f0Var = this.f42426r;
        f0Var.setContentDescription(str);
        if (!this.I) {
            f0Var.setOnClickListener(onClickListener);
        }
    }

    public final void b(CharSequence charSequence, boolean z10, boolean z11) {
        this.h = true;
        this.f42429x = z10;
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
        ValueAnimator valueAnimator = this.f42427s;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.f42427s.cancel();
        }
        float f7 = 0.0f;
        if (!z10) {
            if (this.h) {
                f7 = 1.0f;
            }
            this.f42425n = f7;
            e();
            return;
        }
        float f10 = this.f42425n;
        if (this.h) {
            f7 = 1.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
        this.f42427s = ofFloat;
        ofFloat.addUpdateListener(new l6(this, 11));
        this.f42427s.addListener(new qg.n0(this, 3));
        this.f42427s.setDuration(250L);
        this.f42427s.setInterpolator(qr.f27423f);
        this.f42427s.start();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int dp;
        wq wqVar = this.G;
        o0 o0Var = this.e;
        if (wqVar != null) {
            vq vqVar = wqVar.f29769a;
            if (vqVar.h == 0) {
                dp = 0;
            } else {
                dp = AndroidUtilities.dp(vqVar.C - 0.5f) + vqVar.f29408s;
            }
            c6 c6Var = this.J;
            c6Var.d(((dp * 0.85f) + AndroidUtilities.dp(3.0f)) / 2.0f, false);
            float e = (o0Var.getDrawable().e() / 2.0f) + (getMeasuredWidth() / 2.0f) + AndroidUtilities.dp(3.0f);
            c6 c6Var2 = this.K;
            c6Var2.d(e, false);
            o0Var.setTranslationX(-c6Var.f22953c);
            this.G.setTranslationX(c6Var2.f22953c - c6Var.f22953c);
        } else if (o0Var != null) {
            o0Var.setTranslationX(0.0f);
        }
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        float f7 = this.f42425n;
        Paint paint = this.f42421a;
        int i10 = this.f42424f;
        if (f7 != 1.0f || !this.f42429x) {
            if (this.f42423c) {
                float f10 = this.f42422b + 0.016f;
                this.f42422b = f10;
                if (f10 > 3.0f) {
                    this.f42423c = false;
                }
            } else {
                float f11 = this.f42422b - 0.016f;
                this.f42422b = f11;
                if (f11 < 1.0f) {
                    this.f42423c = true;
                }
            }
            if (this.H) {
                a1.d().f((-getMeasuredWidth()) * 0.1f * this.f42422b, 0.0f, getMeasuredWidth(), getMeasuredHeight());
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
            org.telegram.ui.Components.voip.h hVar = this.f42428w;
            hVar.f28965f = measuredWidth;
            hVar.a(i10, canvas, rectF, null);
        }
        float f14 = this.f42425n;
        if (f14 != 0.0f && this.f42429x) {
            paint.setAlpha((int) (f14 * 255.0f));
            if (this.f42425n != 1.0f) {
                Path path = this.v;
                path.rewind();
                path.addCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, Math.max(getMeasuredWidth(), getMeasuredHeight()) * 1.4f * this.f42425n, Path.Direction.CW);
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
        float f7 = this.f42425n;
        o0 o0Var = this.e;
        o0Var.setAlpha(f7);
        o0Var.setTranslationY((1.0f - this.f42425n) * AndroidUtilities.dp(12.0f));
        ai.f0 f0Var = this.f42426r;
        f0Var.setAlpha(1.0f - this.f42425n);
        f0Var.setTranslationY((-AndroidUtilities.dp(12.0f)) * this.f42425n);
        int i11 = 0;
        if (this.f42425n == 1.0f) {
            i10 = 4;
        } else {
            i10 = 0;
        }
        f0Var.setVisibility(i10);
        if (this.f42425n == 0.0f) {
            i11 = 4;
        }
        o0Var.setVisibility(i11);
        invalidate();
    }

    public aj0 getIconView() {
        return this.f42430y;
    }

    public n6 getTextView() {
        return this.d;
    }

    @Override
    public final boolean isEnabled() {
        return this.f42426r.isEnabled();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
    }

    @Override
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        this.f42426r.setEnabled(z10);
    }

    public void setFlickerDisabled(boolean z10) {
        this.F = z10;
        invalidate();
    }

    public void setIcon(int i10) {
        aj0 aj0Var = this.f42430y;
        aj0Var.f(i10, 24, 24, null);
        org.telegram.ui.Components.voip.h hVar = this.f42428w;
        hVar.f28966g = 2.0f;
        hVar.f28974p = new org.telegram.ui.web.u0(this, 26);
        invalidate();
        aj0Var.setVisibility(0);
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

    public p0(int i10, Context context, e6 e6Var, boolean z10) {
        super(context);
        Paint paint = new Paint(1);
        this.f42421a = paint;
        this.v = new Path();
        this.H = true;
        this.J = new c6(this);
        this.K = new c6(this);
        this.M = 0.0f;
        this.f42424f = i10;
        org.telegram.ui.Components.voip.h hVar = new org.telegram.ui.Components.voip.h();
        this.f42428w = hVar;
        hVar.f28972n = 1.2f;
        hVar.f28969k = false;
        hVar.f28971m = 4.0f;
        LinearLayout f7 = wl.f(context, 0);
        o0 o0Var = new o0(this, context, 0);
        this.d = o0Var;
        o0Var.b(0.35f, 350L, qr.h);
        o0Var.setGravity(17);
        o0Var.setTextColor(-1);
        o0Var.setTextSize(AndroidUtilities.dp(14.0f));
        o0Var.setTypeface(AndroidUtilities.bold());
        ?? imageView = new ImageView(context);
        this.f42430y = imageView;
        imageView.setColorFilter(-1);
        imageView.setVisibility(8);
        ai.f0 f0Var = new ai.f0(this, context, 27);
        this.f42426r = f0Var;
        f0Var.addView(f7, x5.e(-2, -2, 17));
        int k10 = i0.a.k(-1, 120);
        f0Var.setBackground(i6.i0(i10, i10, i10, i10, 0, k10, k10));
        f7.addView(o0Var, x5.q(-2, -2, 16));
        f7.addView((View) imageView, x5.p(24, 24, 0.0f, 16, 4, 0, 0, 0));
        addView(f0Var);
        setOutlineProvider(yf.j0.f46839b);
        setClipToOutline(true);
        z5.b(this, 0.02f, 1.2f);
        if (z10) {
            o0 o0Var2 = new o0(this, context, 1);
            this.e = o0Var2;
            o0Var2.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
            o0Var2.setGravity(17);
            o0Var2.setTextColor(i6.v0(i6.Sh, e6Var));
            o0Var2.setTextSize(AndroidUtilities.dp(14.0f));
            o0Var2.setTypeface(AndroidUtilities.bold());
            o0Var2.getDrawable().D = true;
            int dp = AndroidUtilities.dp(8.0f);
            int k11 = i0.a.k(-1, 120);
            o0Var2.setBackground(i6.i0(dp, dp, dp, dp, 0, k11, k11));
            addView(o0Var2);
            paint.setColor(i6.v0(i6.Oh, e6Var));
            e();
        }
    }
}
