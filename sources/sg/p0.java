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
import ci.u4;
import ei.i6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.sl;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.ba0;
import org.telegram.ui.Components.bk0;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.eq;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.f6;
import org.telegram.ui.Components.fr;
import org.telegram.ui.Components.q6;
import org.telegram.ui.o40;
import org.telegram.ui.ve1;
import w7.b6;
import w7.z5;
public class p0 extends FrameLayout implements ba0 {
    public boolean E;
    public final bk0 F;
    public boolean G;
    public boolean H;
    public fr I;
    public boolean J;
    public boolean K;
    public final f6 L;
    public final f6 M;
    public eq N;
    public float O;
    public boolean P;
    public ValueAnimator Q;
    public final Paint f46800a;
    public final boolean f46801b;
    public final g6 f46802c;
    public float d;
    public boolean e;
    public final o0 f46803f;
    public final o0 h;
    public final int f46804n;
    public boolean f46805r;
    public float f46806s;
    public final rg.y1 v;
    public ValueAnimator f46807w;
    public final Path f46808x;
    public final org.telegram.ui.Components.voip.h f46809y;

    public p0(Context context, g6 g6Var, boolean z10) {
        this(AndroidUtilities.dp(8.0f), context, g6Var, z10);
    }

    public final void a(String str, View.OnClickListener onClickListener, boolean z10) {
        if (!this.G && z10) {
            z10 = true;
        }
        this.G = true;
        o0 o0Var = this.f46803f;
        if (z10 && o0Var.f29774c.h()) {
            o0Var.a();
        }
        o0Var.c(str, z10, true);
        rg.y1 y1Var = this.v;
        y1Var.setContentDescription(str);
        if (!this.K) {
            y1Var.setOnClickListener(onClickListener);
        }
    }

    public final void b(CharSequence charSequence, boolean z10, boolean z11) {
        this.f46805r = true;
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
        ValueAnimator valueAnimator = this.f46807w;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.f46807w.cancel();
        }
        float f7 = 0.0f;
        if (!z10) {
            if (this.f46805r) {
                f7 = 1.0f;
            }
            this.f46806s = f7;
            e();
            return;
        }
        float f10 = this.f46806s;
        if (this.f46805r) {
            f7 = 1.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
        this.f46807w = ofFloat;
        ofFloat.addUpdateListener(new u4(this, 12));
        this.f46807w.addListener(new ve1(this, 16));
        this.f46807w.setDuration(250L);
        this.f46807w.setInterpolator(bs.f25133f);
        this.f46807w.start();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int dp;
        fr frVar = this.I;
        o0 o0Var = this.h;
        if (frVar != null) {
            er erVar = frVar.f26440a;
            if (erVar.h == 0) {
                dp = 0;
            } else {
                dp = AndroidUtilities.dp(erVar.C - 0.5f) + erVar.f26046s;
            }
            f6 f6Var = this.L;
            f6Var.d(((dp * 0.85f) + AndroidUtilities.dp(3.0f)) / 2.0f, false);
            float e = (o0Var.getDrawable().e() / 2.0f) + (getMeasuredWidth() / 2.0f) + AndroidUtilities.dp(3.0f);
            f6 f6Var2 = this.M;
            f6Var2.d(e, false);
            o0Var.setTranslationX(-f6Var.f26180c);
            this.I.setTranslationX(f6Var2.f26180c - f6Var.f26180c);
        } else if (o0Var != null) {
            o0Var.setTranslationX(0.0f);
        }
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        int i10 = (this.f46806s > 1.0f ? 1 : (this.f46806s == 1.0f ? 0 : -1));
        g6 g6Var = this.f46802c;
        boolean z10 = this.f46801b;
        int i11 = this.f46804n;
        Paint paint = this.f46800a;
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
                    paint.setColor(k6.w0(k6.Oh, g6Var));
                }
                paint.setAlpha(255);
                float f12 = i11;
                canvas.drawRoundRect(rectF, f12, f12, paint);
            }
            invalidate();
        }
        if (!BuildVars.IS_BILLING_UNAVAILABLE && !this.H) {
            int measuredWidth = getMeasuredWidth();
            org.telegram.ui.Components.voip.h hVar = this.f46809y;
            hVar.f31613f = measuredWidth;
            hVar.a(i11, canvas, rectF, null);
        }
        if (this.f46806s != 0.0f && this.E) {
            if (z10) {
                paint.setColor(k6.w0(k6.Oh, g6Var));
            }
            paint.setAlpha((int) (this.f46806s * 255.0f));
            if (this.f46806s != 1.0f) {
                Path path = this.f46808x;
                path.rewind();
                path.addCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, Math.max(getMeasuredWidth(), getMeasuredHeight()) * 1.4f * this.f46806s, Path.Direction.CW);
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
        float f7 = this.f46806s;
        o0 o0Var = this.h;
        o0Var.setAlpha(f7);
        o0Var.setTranslationY((1.0f - this.f46806s) * AndroidUtilities.dp(12.0f));
        rg.y1 y1Var = this.v;
        y1Var.setAlpha(1.0f - this.f46806s);
        y1Var.setTranslationY((-AndroidUtilities.dp(12.0f)) * this.f46806s);
        int i11 = 0;
        if (this.f46806s == 1.0f) {
            i10 = 4;
        } else {
            i10 = 0;
        }
        y1Var.setVisibility(i10);
        if (this.f46806s == 0.0f) {
            i11 = 4;
        }
        o0Var.setVisibility(i11);
        invalidate();
    }

    public bk0 getIconView() {
        return this.F;
    }

    public q6 getTextView() {
        return this.f46803f;
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
        bk0 bk0Var = this.F;
        bk0Var.f(i10, 24, 24, null);
        org.telegram.ui.Components.voip.h hVar = this.f46809y;
        hVar.f31614g = 2.0f;
        hVar.f31622p = new org.telegram.ui.web.a2(this, 22);
        invalidate();
        bk0Var.setVisibility(0);
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
            ofFloat.addUpdateListener(new i6(this, 23));
            this.Q.addListener(new o40(17, this, z10));
            this.Q.setDuration(320L);
            this.Q.setInterpolator(bs.h);
            this.Q.start();
        }
    }

    public p0(int i10, Context context, g6 g6Var, boolean z10) {
        super(context);
        Paint paint = new Paint(1);
        this.f46800a = paint;
        this.f46808x = new Path();
        this.J = true;
        this.L = new f6(this);
        this.M = new f6(this);
        this.O = 0.0f;
        this.f46804n = i10;
        org.telegram.ui.Components.voip.h hVar = new org.telegram.ui.Components.voip.h();
        this.f46809y = hVar;
        hVar.f31620n = 1.2f;
        hVar.f31617k = false;
        hVar.f31619m = 4.0f;
        LinearLayout e = sl.e(context, 0);
        o0 o0Var = new o0(this, context, 0);
        this.f46803f = o0Var;
        o0Var.b(0.35f, 350L, bs.h);
        o0Var.setGravity(17);
        o0Var.setTextColor(-1);
        o0Var.setTextSize(AndroidUtilities.dp(14.0f));
        o0Var.setTypeface(AndroidUtilities.bold());
        ?? imageView = new ImageView(context);
        this.F = imageView;
        imageView.setColorFilter(-1);
        imageView.setVisibility(8);
        rg.y1 y1Var = new rg.y1(this, context, 3);
        this.v = y1Var;
        y1Var.addView(e, z5.e(-2, -2, 17));
        int o10 = i0.a.o(-1, 120);
        y1Var.setBackground(k6.j0(i10, i10, i10, i10, 0, o10, o10));
        e.addView(o0Var, z5.q(-2, -2, 16));
        e.addView((View) imageView, z5.p(24, 24, 0.0f, 16, 4, 0, 0, 0));
        addView(y1Var);
        setOutlineProvider(zf.j0.f52048b);
        setClipToOutline(true);
        b6.b(this, 0.02f, 1.2f);
        if (z10) {
            o0 o0Var2 = new o0(this, context, 1);
            this.h = o0Var2;
            o0Var2.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
            o0Var2.setGravity(17);
            r6.a0(o0Var2, k6.Sh, g6Var);
            o0Var2.setTextSize(AndroidUtilities.dp(14.0f));
            o0Var2.setTypeface(AndroidUtilities.bold());
            o0Var2.getDrawable().J = true;
            int dp = AndroidUtilities.dp(8.0f);
            int o11 = i0.a.o(-1, 120);
            o0Var2.setBackground(k6.j0(dp, dp, dp, dp, 0, o11, o11));
            addView(o0Var2);
            paint.setColor(k6.w0(k6.Oh, g6Var));
            this.f46801b = true;
            this.f46802c = g6Var;
            e();
        }
    }
}
