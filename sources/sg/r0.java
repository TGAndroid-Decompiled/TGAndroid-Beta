package sg;

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
import bi.u5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.wl;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.aj0;
import org.telegram.ui.Components.e6;
import org.telegram.ui.Components.g90;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.q6;
import org.telegram.ui.Components.sp;
import org.telegram.ui.Components.uq;
import org.telegram.ui.Components.vq;
import org.telegram.ui.e50;
import org.telegram.ui.oj1;
import w7.x5;
import w7.z5;
public class r0 extends FrameLayout implements g90 {
    public boolean E;
    public boolean F;
    public vq G;
    public boolean H;
    public boolean I;
    public final e6 J;
    public final e6 K;
    public sp L;
    public float M;
    public boolean N;
    public ValueAnimator O;
    public final Paint f46235a;
    public float f46236b;
    public boolean f46237c;
    public final q0 d;
    public final q0 f46238e;
    public final int f46239f;
    public boolean h;
    public float f46240n;
    public final ah.y f46241r;
    public ValueAnimator f46242s;
    public final Path v;
    public final org.telegram.ui.Components.voip.h f46243w;
    public boolean f46244x;
    public final aj0 f46245y;

    public r0(Context context, f6 f6Var, boolean z10) {
        this(AndroidUtilities.dp(8.0f), context, f6Var, z10);
    }

    public final void a(String str, View.OnClickListener onClickListener, boolean z10) {
        if (!this.E && z10) {
            z10 = true;
        }
        this.E = true;
        q0 q0Var = this.d;
        if (z10 && q0Var.f29597c.f()) {
            q0Var.a();
        }
        q0Var.c(str, z10, true);
        ah.y yVar = this.f46241r;
        yVar.setContentDescription(str);
        if (!this.I) {
            yVar.setOnClickListener(onClickListener);
        }
    }

    public final void b(CharSequence charSequence, boolean z10, boolean z11) {
        this.h = true;
        this.f46244x = z10;
        q0 q0Var = this.f46238e;
        q0Var.c(charSequence, z11, true);
        q0Var.setContentDescription(charSequence);
        d(z11);
    }

    @Override
    public final boolean c() {
        return this.N;
    }

    public final void d(boolean z10) {
        ValueAnimator valueAnimator = this.f46242s;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.f46242s.cancel();
        }
        float f7 = 0.0f;
        if (!z10) {
            if (this.h) {
                f7 = 1.0f;
            }
            this.f46240n = f7;
            e();
            return;
        }
        float f10 = this.f46240n;
        if (this.h) {
            f7 = 1.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
        this.f46242s = ofFloat;
        ofFloat.addUpdateListener(new u5(this, 12));
        this.f46242s.addListener(new oj1(this, 6));
        this.f46242s.setDuration(250L);
        this.f46242s.setInterpolator(pr.f29466f);
        this.f46242s.start();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int dp;
        vq vqVar = this.G;
        q0 q0Var = this.f46238e;
        if (vqVar != null) {
            uq uqVar = vqVar.f31962a;
            if (uqVar.h == 0) {
                dp = 0;
            } else {
                dp = AndroidUtilities.dp(uqVar.C - 0.5f) + uqVar.f30951s;
            }
            e6 e6Var = this.J;
            e6Var.d(((dp * 0.85f) + AndroidUtilities.dp(3.0f)) / 2.0f, false);
            float e7 = (q0Var.getDrawable().e() / 2.0f) + (getMeasuredWidth() / 2.0f) + AndroidUtilities.dp(3.0f);
            e6 e6Var2 = this.K;
            e6Var2.d(e7, false);
            q0Var.setTranslationX(-e6Var.f25565c);
            this.G.setTranslationX(e6Var2.f25565c - e6Var.f25565c);
        } else if (q0Var != null) {
            q0Var.setTranslationX(0.0f);
        }
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        float f7 = this.f46240n;
        Paint paint = this.f46235a;
        int i10 = this.f46239f;
        if (f7 != 1.0f || !this.f46244x) {
            if (this.f46237c) {
                float f10 = this.f46236b + 0.016f;
                this.f46236b = f10;
                if (f10 > 3.0f) {
                    this.f46237c = false;
                }
            } else {
                float f11 = this.f46236b - 0.016f;
                this.f46236b = f11;
                if (f11 < 1.0f) {
                    this.f46237c = true;
                }
            }
            if (this.H) {
                d1.d().f((-getMeasuredWidth()) * 0.1f * this.f46236b, 0.0f, getMeasuredWidth(), getMeasuredHeight());
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
            org.telegram.ui.Components.voip.h hVar = this.f46243w;
            hVar.f31503f = measuredWidth;
            hVar.a(i10, canvas, rectF, null);
        }
        float f14 = this.f46240n;
        if (f14 != 0.0f && this.f46244x) {
            paint.setAlpha((int) (f14 * 255.0f));
            if (this.f46240n != 1.0f) {
                Path path = this.v;
                path.rewind();
                path.addCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, Math.max(getMeasuredWidth(), getMeasuredHeight()) * 1.4f * this.f46240n, Path.Direction.CW);
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
        float f7 = this.f46240n;
        q0 q0Var = this.f46238e;
        q0Var.setAlpha(f7);
        q0Var.setTranslationY((1.0f - this.f46240n) * AndroidUtilities.dp(12.0f));
        ah.y yVar = this.f46241r;
        yVar.setAlpha(1.0f - this.f46240n);
        yVar.setTranslationY((-AndroidUtilities.dp(12.0f)) * this.f46240n);
        int i11 = 0;
        if (this.f46240n == 1.0f) {
            i10 = 4;
        } else {
            i10 = 0;
        }
        yVar.setVisibility(i10);
        if (this.f46240n == 0.0f) {
            i11 = 4;
        }
        q0Var.setVisibility(i11);
        invalidate();
    }

    public aj0 getIconView() {
        return this.f46245y;
    }

    public q6 getTextView() {
        return this.d;
    }

    @Override
    public final boolean isEnabled() {
        return this.f46241r.isEnabled();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
    }

    @Override
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        this.f46241r.setEnabled(z10);
    }

    public void setFlickerDisabled(boolean z10) {
        this.F = z10;
        invalidate();
    }

    public void setIcon(int i10) {
        aj0 aj0Var = this.f46245y;
        aj0Var.f(i10, 24, 24, null);
        org.telegram.ui.Components.voip.h hVar = this.f46243w;
        hVar.f31504g = 2.0f;
        hVar.f31512p = new p0(this, 0);
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
            ofFloat.addUpdateListener(new ki.a(this, 17));
            this.O.addListener(new e50(17, this, z10));
            this.O.setDuration(320L);
            this.O.setInterpolator(pr.h);
            this.O.start();
        }
    }

    public r0(int i10, Context context, f6 f6Var, boolean z10) {
        super(context);
        Paint paint = new Paint(1);
        this.f46235a = paint;
        this.v = new Path();
        this.H = true;
        this.J = new e6(this);
        this.K = new e6(this);
        this.M = 0.0f;
        this.f46239f = i10;
        org.telegram.ui.Components.voip.h hVar = new org.telegram.ui.Components.voip.h();
        this.f46243w = hVar;
        hVar.f31510n = 1.2f;
        hVar.f31507k = false;
        hVar.f31509m = 4.0f;
        LinearLayout f7 = wl.f(context, 0);
        q0 q0Var = new q0(this, context, 0);
        this.d = q0Var;
        q0Var.b(0.35f, 350L, pr.h);
        q0Var.setGravity(17);
        q0Var.setTextColor(-1);
        q0Var.setTextSize(AndroidUtilities.dp(14.0f));
        q0Var.setTypeface(AndroidUtilities.bold());
        ?? imageView = new ImageView(context);
        this.f46245y = imageView;
        imageView.setColorFilter(-1);
        imageView.setVisibility(8);
        ah.y yVar = new ah.y(this, context, 28);
        this.f46241r = yVar;
        yVar.addView(f7, x5.e(-2, -2, 17));
        int k10 = i0.a.k(-1, 120);
        yVar.setBackground(j6.i0(i10, i10, i10, i10, 0, k10, k10));
        f7.addView(q0Var, x5.q(-2, -2, 16));
        f7.addView((View) imageView, x5.p(24, 24, 0.0f, 16, 4, 0, 0, 0));
        addView(yVar);
        setOutlineProvider(yf.j0.f50113b);
        setClipToOutline(true);
        z5.b(this, 0.02f, 1.2f);
        if (z10) {
            q0 q0Var2 = new q0(this, context, 1);
            this.f46238e = q0Var2;
            q0Var2.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
            q0Var2.setGravity(17);
            q0Var2.setTextColor(j6.v0(j6.Sh, f6Var));
            q0Var2.setTextSize(AndroidUtilities.dp(14.0f));
            q0Var2.setTypeface(AndroidUtilities.bold());
            q0Var2.getDrawable().D = true;
            int dp = AndroidUtilities.dp(8.0f);
            int k11 = i0.a.k(-1, 120);
            q0Var2.setBackground(j6.i0(dp, dp, dp, dp, 0, k11, k11));
            addView(q0Var2);
            paint.setColor(j6.v0(j6.Oh, f6Var));
            e();
        }
    }
}
