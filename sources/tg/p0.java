package tg;

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
import di.u4;
import fi.e4;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.vh;
import org.telegram.ui.ActionBar.f7;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.ak0;
import org.telegram.ui.Components.ca0;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.gb1;
import org.telegram.ui.Components.gq;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.h6;
import org.telegram.ui.Components.hr;
import org.telegram.ui.Components.s6;
import org.telegram.ui.Wallet.p5;
import org.telegram.ui.fc1;
import org.telegram.ui.q40;
public class p0 extends FrameLayout implements ca0 {
    public boolean E;
    public final ak0 F;
    public boolean G;
    public boolean H;
    public hr I;
    public boolean J;
    public boolean K;
    public final h6 L;
    public final h6 M;
    public gq N;
    public float O;
    public boolean P;
    public ValueAnimator Q;
    public final Paint f48975a;
    public final boolean f48976b;
    public final u6 f48977c;
    public float d;
    public boolean e;
    public final o0 f48978f;
    public final o0 h;
    public final int f48979n;
    public boolean f48980r;
    public float f48981s;
    public final p5 v;
    public ValueAnimator f48982w;
    public final Path f48983x;
    public final org.telegram.ui.Components.voip.h f48984y;

    public p0(Context context, u6 u6Var, boolean z10) {
        this(AndroidUtilities.dp(8.0f), context, u6Var, z10);
    }

    public final void a(String str, View.OnClickListener onClickListener, boolean z10) {
        if (!this.G && z10) {
            z10 = true;
        }
        this.G = true;
        o0 o0Var = this.f48978f;
        if (z10 && o0Var.f32440c.h()) {
            o0Var.a();
        }
        o0Var.c(str, z10, true);
        p5 p5Var = this.v;
        p5Var.setContentDescription(str);
        if (!this.K) {
            p5Var.setOnClickListener(onClickListener);
        }
    }

    public final void b(CharSequence charSequence, boolean z10, boolean z11) {
        this.f48980r = true;
        this.E = z10;
        o0 o0Var = this.h;
        o0Var.c(charSequence, z11, true);
        o0Var.setContentDescription(charSequence);
        d(z11);
    }

    @Override
    public final boolean c() {
        return this.P;
    }

    public final void d(boolean z10) {
        ValueAnimator valueAnimator = this.f48982w;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.f48982w.cancel();
        }
        float f7 = 0.0f;
        if (!z10) {
            if (this.f48980r) {
                f7 = 1.0f;
            }
            this.f48981s = f7;
            e();
            return;
        }
        float f10 = this.f48981s;
        if (this.f48980r) {
            f7 = 1.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
        this.f48982w = ofFloat;
        ofFloat.addUpdateListener(new u4(this, 12));
        this.f48982w.addListener(new fc1(this, 18));
        this.f48982w.setDuration(250L);
        this.f48982w.setInterpolator(ds.f27584f);
        this.f48982w.start();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int dp;
        hr hrVar = this.I;
        o0 o0Var = this.h;
        if (hrVar != null) {
            gr grVar = hrVar.f29038a;
            if (grVar.h == 0) {
                dp = 0;
            } else {
                dp = AndroidUtilities.dp(grVar.C - 0.5f) + grVar.f28696s;
            }
            h6 h6Var = this.L;
            h6Var.d(((dp * 0.85f) + AndroidUtilities.dp(3.0f)) / 2.0f, false);
            float e = (o0Var.getDrawable().e() / 2.0f) + (getMeasuredWidth() / 2.0f) + AndroidUtilities.dp(3.0f);
            h6 h6Var2 = this.M;
            h6Var2.d(e, false);
            o0Var.setTranslationX(-h6Var.f28809c);
            this.I.setTranslationX(h6Var2.f28809c - h6Var.f28809c);
        } else if (o0Var != null) {
            o0Var.setTranslationX(0.0f);
        }
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        int i10 = (this.f48981s > 1.0f ? 1 : (this.f48981s == 1.0f ? 0 : -1));
        u6 u6Var = this.f48977c;
        boolean z10 = this.f48976b;
        int i11 = this.f48979n;
        Paint paint = this.f48975a;
        if (i10 != 0 || !this.E) {
            if (this.e) {
                float f7 = this.d + 0.016f;
                this.d = f7;
                if (f7 > 3.0f) {
                    this.e = false;
                }
            } else {
                float f10 = this.d - 0.016f;
                this.d = f10;
                if (f10 < 1.0f) {
                    this.e = true;
                }
            }
            if (this.J) {
                b1.d().f((-getMeasuredWidth()) * 0.1f * this.d, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                float f11 = i11;
                canvas.drawRoundRect(rectF, f11, f11, b1.d().e());
            } else {
                if (z10) {
                    paint.setColor(y6.w0(y6.Oh, u6Var));
                }
                paint.setAlpha(255);
                float f12 = i11;
                canvas.drawRoundRect(rectF, f12, f12, paint);
            }
            invalidate();
        }
        if (!BuildVars.IS_BILLING_UNAVAILABLE && !this.H) {
            int measuredWidth = getMeasuredWidth();
            org.telegram.ui.Components.voip.h hVar = this.f48984y;
            hVar.f33817f = measuredWidth;
            hVar.a(i11, canvas, rectF, null);
        }
        if (this.f48981s != 0.0f && this.E) {
            if (z10) {
                paint.setColor(y6.w0(y6.Oh, u6Var));
            }
            paint.setAlpha((int) (this.f48981s * 255.0f));
            if (this.f48981s != 1.0f) {
                Path path = this.f48983x;
                path.rewind();
                path.addCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, Math.max(getMeasuredWidth(), getMeasuredHeight()) * 1.4f * this.f48981s, Path.Direction.CW);
                canvas.save();
                canvas.clipPath(path);
                float f13 = i11;
                canvas.drawRoundRect(rectF, f13, f13, paint);
                canvas.restore();
            } else {
                float f14 = i11;
                canvas.drawRoundRect(rectF, f14, f14, paint);
            }
        }
        super.dispatchDraw(canvas);
    }

    public final void e() {
        int i10;
        float f7 = this.f48981s;
        o0 o0Var = this.h;
        o0Var.setAlpha(f7);
        o0Var.setTranslationY((1.0f - this.f48981s) * AndroidUtilities.dp(12.0f));
        p5 p5Var = this.v;
        p5Var.setAlpha(1.0f - this.f48981s);
        p5Var.setTranslationY((-AndroidUtilities.dp(12.0f)) * this.f48981s);
        int i11 = 0;
        if (this.f48981s == 1.0f) {
            i10 = 4;
        } else {
            i10 = 0;
        }
        p5Var.setVisibility(i10);
        if (this.f48981s == 0.0f) {
            i11 = 4;
        }
        o0Var.setVisibility(i11);
        invalidate();
    }

    public ak0 getIconView() {
        return this.F;
    }

    public s6 getTextView() {
        return this.f48978f;
    }

    @Override
    public final boolean isEnabled() {
        return this.v.isEnabled();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
    }

    @Override
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        this.v.setEnabled(z10);
    }

    public void setFlickerDisabled(boolean z10) {
        this.H = z10;
        invalidate();
    }

    public void setIcon(int i10) {
        ak0 ak0Var = this.F;
        ak0Var.f(i10, 24, 24, null);
        org.telegram.ui.Components.voip.h hVar = this.f48984y;
        hVar.f33818g = 2.0f;
        hVar.f33826p = new org.telegram.ui.web.h1(this, 25);
        invalidate();
        ak0Var.setVisibility(0);
    }

    @Override
    public void setLoading(boolean z10) {
        float f7;
        if (this.P != z10) {
            ValueAnimator valueAnimator = this.Q;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.Q = null;
            }
            float f10 = this.O;
            this.P = z10;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
            this.Q = ofFloat;
            ofFloat.addUpdateListener(new e4(this, 26));
            this.Q.addListener(new q40(17, this, z10));
            this.Q.setDuration(320L);
            this.Q.setInterpolator(ds.h);
            this.Q.start();
        }
    }

    public p0(int i10, Context context, u6 u6Var, boolean z10) {
        super(context);
        Paint paint = new Paint(1);
        this.f48975a = paint;
        this.f48983x = new Path();
        this.J = true;
        this.L = new h6(this);
        this.M = new h6(this);
        this.O = 0.0f;
        this.f48979n = i10;
        org.telegram.ui.Components.voip.h hVar = new org.telegram.ui.Components.voip.h();
        this.f48984y = hVar;
        hVar.f33824n = 1.2f;
        hVar.f33821k = false;
        hVar.f33823m = 4.0f;
        LinearLayout d = vh.d(context, 0);
        o0 o0Var = new o0(this, context, 0);
        this.f48978f = o0Var;
        o0Var.b(0.35f, 350L, ds.h);
        o0Var.setGravity(17);
        o0Var.setTextColor(-1);
        o0Var.setTextSize(AndroidUtilities.dp(14.0f));
        o0Var.setTypeface(AndroidUtilities.bold());
        ?? imageView = new ImageView(context);
        this.F = imageView;
        imageView.setColorFilter(-1);
        imageView.setVisibility(8);
        p5 p5Var = new p5(this, context, 5);
        this.v = p5Var;
        p5Var.addView(d, gb1.i(-2, -2, 17));
        int o10 = i0.a.o(-1, 120);
        p5Var.setBackground(y6.j0(i10, i10, i10, i10, 0, o10, o10));
        d.addView(o0Var, gb1.u(-2, -2, 16));
        d.addView((View) imageView, gb1.t(24, 24, 0.0f, 16, 4, 0, 0, 0));
        addView(p5Var);
        setOutlineProvider(ag.z0.f1401b);
        setClipToOutline(true);
        gb1.c(this, 0.02f, 1.2f);
        if (z10) {
            o0 o0Var2 = new o0(this, context, 1);
            this.h = o0Var2;
            o0Var2.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
            o0Var2.setGravity(17);
            f7.Z(o0Var2, y6.Sh, u6Var);
            o0Var2.setTextSize(AndroidUtilities.dp(14.0f));
            o0Var2.setTypeface(AndroidUtilities.bold());
            o0Var2.getDrawable().J = true;
            int dp = AndroidUtilities.dp(8.0f);
            int o11 = i0.a.o(-1, 120);
            o0Var2.setBackground(y6.j0(dp, dp, dp, dp, 0, o11, o11));
            addView(o0Var2);
            paint.setColor(y6.w0(y6.Oh, u6Var));
            this.f48976b = true;
            this.f48977c = u6Var;
            e();
        }
    }
}
