package rg;

import ai.k6;
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
import org.telegram.messenger.ok;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.e6;
import org.telegram.ui.Components.nj0;
import org.telegram.ui.Components.p6;
import org.telegram.ui.Components.t90;
import org.telegram.ui.Components.tr;
import org.telegram.ui.Components.wp;
import org.telegram.ui.Components.yq;
import org.telegram.ui.Components.zq;
import org.telegram.ui.g70;
import w7.b6;
import w7.z5;
public class q0 extends FrameLayout implements t90 {
    public boolean E;
    public boolean F;
    public zq G;
    public boolean H;
    public boolean I;
    public final e6 J;
    public final e6 K;
    public wp L;
    public float M;
    public boolean N;
    public ValueAnimator O;
    public final Paint f46245a;
    public float f46246b;
    public boolean f46247c;
    public final p0 d;
    public final p0 f46248e;
    public final int f46249f;
    public boolean h;
    public float f46250n;
    public final ai.f0 f46251r;
    public ValueAnimator f46252s;
    public final Path v;
    public final org.telegram.ui.Components.voip.h f46253w;
    public boolean f46254x;
    public final nj0 f46255y;

    public q0(Context context, d6 d6Var, boolean z10) {
        this(AndroidUtilities.dp(8.0f), context, d6Var, z10);
    }

    public final void a(String str, View.OnClickListener onClickListener, boolean z10) {
        if (!this.E && z10) {
            z10 = true;
        }
        this.E = true;
        p0 p0Var = this.d;
        if (z10 && p0Var.f29516c.f()) {
            p0Var.a();
        }
        p0Var.c(str, z10, true);
        ai.f0 f0Var = this.f46251r;
        f0Var.setContentDescription(str);
        if (!this.I) {
            f0Var.setOnClickListener(onClickListener);
        }
    }

    public final void b(CharSequence charSequence, boolean z10, boolean z11) {
        this.h = true;
        this.f46254x = z10;
        p0 p0Var = this.f46248e;
        p0Var.c(charSequence, z11, true);
        p0Var.setContentDescription(charSequence);
        d(z11);
    }

    @Override
    public final boolean c() {
        return this.N;
    }

    public final void d(boolean z10) {
        ValueAnimator valueAnimator = this.f46252s;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.f46252s.cancel();
        }
        float f7 = 0.0f;
        if (!z10) {
            if (this.h) {
                f7 = 1.0f;
            }
            this.f46250n = f7;
            e();
            return;
        }
        float f10 = this.f46250n;
        if (this.h) {
            f7 = 1.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
        this.f46252s = ofFloat;
        ofFloat.addUpdateListener(new k6(this, 11));
        this.f46252s.addListener(new pg.d0(this, 4));
        this.f46252s.setDuration(250L);
        this.f46252s.setInterpolator(tr.f31140f);
        this.f46252s.start();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int dp;
        zq zqVar = this.G;
        p0 p0Var = this.f46248e;
        if (zqVar != null) {
            yq yqVar = zqVar.f33594a;
            if (yqVar.h == 0) {
                dp = 0;
            } else {
                dp = AndroidUtilities.dp(yqVar.C - 0.5f) + yqVar.f33226s;
            }
            e6 e6Var = this.J;
            e6Var.d(((dp * 0.85f) + AndroidUtilities.dp(3.0f)) / 2.0f, false);
            float e7 = (p0Var.getDrawable().e() / 2.0f) + (getMeasuredWidth() / 2.0f) + AndroidUtilities.dp(3.0f);
            e6 e6Var2 = this.K;
            e6Var2.d(e7, false);
            p0Var.setTranslationX(-e6Var.f25933c);
            this.G.setTranslationX(e6Var2.f25933c - e6Var.f25933c);
        } else if (p0Var != null) {
            p0Var.setTranslationX(0.0f);
        }
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        float f7 = this.f46250n;
        Paint paint = this.f46245a;
        int i10 = this.f46249f;
        if (f7 != 1.0f || !this.f46254x) {
            if (this.f46247c) {
                float f10 = this.f46246b + 0.016f;
                this.f46246b = f10;
                if (f10 > 3.0f) {
                    this.f46247c = false;
                }
            } else {
                float f11 = this.f46246b - 0.016f;
                this.f46246b = f11;
                if (f11 < 1.0f) {
                    this.f46247c = true;
                }
            }
            if (this.H) {
                b1.d().f((-getMeasuredWidth()) * 0.1f * this.f46246b, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                float f12 = i10;
                canvas.drawRoundRect(rectF, f12, f12, b1.d().e());
            } else {
                paint.setAlpha(255);
                float f13 = i10;
                canvas.drawRoundRect(rectF, f13, f13, paint);
            }
            invalidate();
        }
        if (!BuildVars.IS_BILLING_UNAVAILABLE && !this.F) {
            int measuredWidth = getMeasuredWidth();
            org.telegram.ui.Components.voip.h hVar = this.f46253w;
            hVar.f31874f = measuredWidth;
            hVar.a(i10, canvas, rectF, null);
        }
        float f14 = this.f46250n;
        if (f14 != 0.0f && this.f46254x) {
            paint.setAlpha((int) (f14 * 255.0f));
            if (this.f46250n != 1.0f) {
                Path path = this.v;
                path.rewind();
                path.addCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, Math.max(getMeasuredWidth(), getMeasuredHeight()) * 1.4f * this.f46250n, Path.Direction.CW);
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
        float f7 = this.f46250n;
        p0 p0Var = this.f46248e;
        p0Var.setAlpha(f7);
        p0Var.setTranslationY((1.0f - this.f46250n) * AndroidUtilities.dp(12.0f));
        ai.f0 f0Var = this.f46251r;
        f0Var.setAlpha(1.0f - this.f46250n);
        f0Var.setTranslationY((-AndroidUtilities.dp(12.0f)) * this.f46250n);
        int i11 = 0;
        if (this.f46250n == 1.0f) {
            i10 = 4;
        } else {
            i10 = 0;
        }
        f0Var.setVisibility(i10);
        if (this.f46250n == 0.0f) {
            i11 = 4;
        }
        p0Var.setVisibility(i11);
        invalidate();
    }

    public nj0 getIconView() {
        return this.f46255y;
    }

    public p6 getTextView() {
        return this.d;
    }

    @Override
    public final boolean isEnabled() {
        return this.f46251r.isEnabled();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
    }

    @Override
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        this.f46251r.setEnabled(z10);
    }

    public void setFlickerDisabled(boolean z10) {
        this.F = z10;
        invalidate();
    }

    public void setIcon(int i10) {
        nj0 nj0Var = this.f46255y;
        nj0Var.f(i10, 24, 24, null);
        org.telegram.ui.Components.voip.h hVar = this.f46253w;
        hVar.f31875g = 2.0f;
        hVar.f31883p = new org.telegram.ui.web.u0(this, 27);
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
            this.O.addListener(new g70(16, this, z10));
            this.O.setDuration(320L);
            this.O.setInterpolator(tr.h);
            this.O.start();
        }
    }

    public q0(int i10, Context context, d6 d6Var, boolean z10) {
        super(context);
        Paint paint = new Paint(1);
        this.f46245a = paint;
        this.v = new Path();
        this.H = true;
        this.J = new e6(this);
        this.K = new e6(this);
        this.M = 0.0f;
        this.f46249f = i10;
        org.telegram.ui.Components.voip.h hVar = new org.telegram.ui.Components.voip.h();
        this.f46253w = hVar;
        hVar.f31881n = 1.2f;
        hVar.f31878k = false;
        hVar.f31880m = 4.0f;
        LinearLayout f7 = ok.f(context, 0);
        p0 p0Var = new p0(this, context, 0);
        this.d = p0Var;
        p0Var.b(0.35f, 350L, tr.h);
        p0Var.setGravity(17);
        p0Var.setTextColor(-1);
        p0Var.setTextSize(AndroidUtilities.dp(14.0f));
        p0Var.setTypeface(AndroidUtilities.bold());
        ?? imageView = new ImageView(context);
        this.f46255y = imageView;
        imageView.setColorFilter(-1);
        imageView.setVisibility(8);
        ai.f0 f0Var = new ai.f0(this, context, 28);
        this.f46251r = f0Var;
        f0Var.addView(f7, z5.e(-2, -2, 17));
        int k10 = i0.a.k(-1, 120);
        f0Var.setBackground(i6.i0(i10, i10, i10, i10, 0, k10, k10));
        f7.addView(p0Var, z5.q(-2, -2, 16));
        f7.addView((View) imageView, z5.p(24, 24, 0.0f, 16, 4, 0, 0, 0));
        addView(f0Var);
        setOutlineProvider(yf.f0.f50980b);
        setClipToOutline(true);
        b6.b(this, 0.02f, 1.2f);
        if (z10) {
            p0 p0Var2 = new p0(this, context, 1);
            this.f46248e = p0Var2;
            p0Var2.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
            p0Var2.setGravity(17);
            p0Var2.setTextColor(i6.v0(i6.Sh, d6Var));
            p0Var2.setTextSize(AndroidUtilities.dp(14.0f));
            p0Var2.setTypeface(AndroidUtilities.bold());
            p0Var2.getDrawable().D = true;
            int dp = AndroidUtilities.dp(8.0f);
            int k11 = i0.a.k(-1, 120);
            p0Var2.setBackground(i6.i0(dp, dp, dp, dp, 0, k11, k11));
            addView(p0Var2);
            paint.setColor(i6.v0(i6.Oh, d6Var));
            e();
        }
    }
}
