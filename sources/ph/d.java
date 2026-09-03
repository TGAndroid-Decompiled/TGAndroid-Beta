package ph;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.i90;
import org.telegram.ui.Components.j90;
import org.telegram.ui.Components.mr;
import org.telegram.ui.Components.qp;
import org.telegram.ui.de;
import org.telegram.ui.s61;
import org.telegram.ui.sg1;
public class d extends FrameLayout implements i90 {
    public boolean B;
    public int C;
    public sg1 D;
    public float E;
    public ValueAnimator F;
    public boolean G;
    public j90 H;
    public boolean I;
    public float J;
    public boolean K;
    public ValueAnimator L;
    public float M;
    public ValueAnimator N;
    public int O;
    public boolean P;
    public boolean Q;
    public Drawable R;
    public float S;
    public boolean T;
    public ValueAnimator U;
    public qp V;
    public int W;
    public org.telegram.ui.ActionBar.f6 f41451a;
    public boolean f41452a0;
    public int f41453b;
    public int f41454b0;
    public final Paint f41455c;
    public boolean f41456c0;
    public final org.telegram.ui.Components.j6 d;
    public int f41457d0;
    public final org.telegram.ui.Components.j6 e;
    public final org.telegram.ui.Components.j6 f41458f;
    public float h;
    public final org.telegram.ui.Components.z5 f41459n;
    public final View f41460r;
    public boolean f41461s;
    public boolean v;
    public boolean f41462w;
    public boolean f41463x;
    public int f41464y;

    public d(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        this(context, f6Var, true);
    }

    private int getWrapWidth() {
        float f10;
        float d = this.f41459n.d(this.h, false);
        if (this.Q) {
            f10 = AndroidUtilities.dp(12.0f);
        } else {
            f10 = 0.0f;
        }
        return getPaddingRight() + getPaddingLeft() + ((int) (a(this.f41458f.d() + AndroidUtilities.dp(15.66f), d) + this.d.d() + f10));
    }

    public float a(float f10, float f11) {
        return f10 * f11;
    }

    @Override
    public final boolean b() {
        return this.K;
    }

    public final void c(int i10, boolean z4) {
        float f10;
        int i11;
        org.telegram.ui.Components.j6 j6Var = this.f41458f;
        if (z4) {
            j6Var.b();
        }
        if (z4 && i10 != (i11 = this.O) && i10 > 0 && i11 > 0) {
            ValueAnimator valueAnimator = this.N;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.N = null;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.N = ofFloat;
            ofFloat.addUpdateListener(new b(this, 0));
            this.N.addListener(new c(this, 1));
            this.N.setInterpolator(new OvershootInterpolator(2.0f));
            this.N.setDuration(200L);
            this.N.start();
        }
        this.O = i10;
        if (i10 == 0 && !this.P) {
            f10 = 0.0f;
        } else {
            f10 = 1.0f;
        }
        this.h = f10;
        j6Var.q(LocaleController.formatNumber(i10, ' '), z4, true);
        invalidate();
    }

    public final void d() {
        this.f41462w = true;
        setFilled(true);
        setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20242xa, this.f41451a));
        j();
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        return false;
    }

    public final void e() {
        setRoundRadius(24);
    }

    public final void f(CharSequence charSequence, boolean z4) {
        boolean z10;
        if (charSequence != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        org.telegram.ui.Components.j6 j6Var = this.e;
        if (z4) {
            j6Var.b();
        }
        setContentDescription(charSequence);
        invalidate();
        if (this.G && !z10) {
            ValueAnimator valueAnimator = this.F;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.F = null;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.E, 0.0f);
            this.F = ofFloat;
            ofFloat.addUpdateListener(new b(this, 3));
            this.F.addListener(new c(this, 0));
            this.F.setDuration(200L);
            this.F.setInterpolator(mr.f27122f);
            this.F.start();
        } else {
            j6Var.q(charSequence, z4, true);
        }
        if (!this.G && z10) {
            this.G = true;
            ValueAnimator valueAnimator2 = this.F;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
                this.F = null;
            }
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.E, 1.0f);
            this.F = ofFloat2;
            ofFloat2.addUpdateListener(new b(this, 4));
            this.F.setDuration(200L);
            this.F.setInterpolator(mr.f27122f);
            this.F.start();
        }
    }

    public final void g(CharSequence charSequence, boolean z4, boolean z10) {
        org.telegram.ui.Components.j6 j6Var = this.d;
        if (z4) {
            j6Var.b();
        }
        j6Var.q(charSequence, z4, z10);
        setContentDescription(charSequence);
        invalidate();
    }

    public TextPaint getTextPaint() {
        return this.d.f25846a;
    }

    public final void h(CharSequence charSequence) {
        g(charSequence, false, true);
    }

    public boolean i() {
        return !(this instanceof de);
    }

    @Override
    public final boolean isEnabled() {
        return this.T;
    }

    public final void j() {
        int i10;
        int i11;
        int i12;
        if (!this.f41463x) {
            if (this.f41462w) {
                i12 = org.telegram.ui.ActionBar.j6.f20242xa;
            } else {
                i12 = org.telegram.ui.ActionBar.j6.Oh;
            }
            this.f41464y = org.telegram.ui.ActionBar.j6.v0(i12, this.f41451a);
        }
        if (this.f41461s) {
            if (this.f41462w) {
                i10 = org.telegram.ui.ActionBar.j6.f20260ya;
            } else {
                i10 = org.telegram.ui.ActionBar.j6.Sh;
            }
        } else {
            i10 = org.telegram.ui.ActionBar.j6.Oh;
        }
        int v02 = org.telegram.ui.ActionBar.j6.v0(i10, this.f41451a);
        org.telegram.ui.Components.j6 j6Var = this.d;
        j6Var.r(v02);
        boolean z4 = this.f41461s;
        View view = this.f41460r;
        if (z4) {
            int v03 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19971i6, this.f41451a);
            int i13 = this.f41453b;
            view.setBackground(org.telegram.ui.ActionBar.j6.Y(v03, i13, i13));
        } else {
            int l1 = org.telegram.ui.ActionBar.j6.l1(0.1f, j6Var.f25846a.getColor());
            int i14 = this.f41453b;
            view.setBackground(org.telegram.ui.ActionBar.j6.Y(l1, i14, i14));
        }
        if (this.f41461s) {
            if (this.f41462w) {
                i11 = org.telegram.ui.ActionBar.j6.f20260ya;
            } else {
                i11 = org.telegram.ui.ActionBar.j6.Sh;
            }
        } else {
            i11 = org.telegram.ui.ActionBar.j6.Oh;
        }
        this.e.r(org.telegram.ui.ActionBar.j6.v0(i11, this.f41451a));
        this.f41458f.r(this.f41464y);
        this.f41455c.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Sh, this.f41451a));
    }

    public final void k() {
        this.Q = true;
        Drawable mutate = getContext().getDrawable(R.drawable.mini_boost_button).mutate();
        this.R = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(this.f41464y, PorterDuff.Mode.SRC_IN));
    }

    public final void l() {
        this.f41452a0 = true;
    }

    @Override
    public void onDraw(Canvas canvas) {
        int wrapWidth;
        boolean z4;
        float f10;
        float f11;
        int i10;
        float f12;
        float f13;
        float f14;
        this.f41460r.draw(canvas);
        int i11 = 0;
        if (this.I) {
            if (this.K) {
                if (this.H == null) {
                    j90 j90Var = new j90(this.f41451a);
                    this.H = j90Var;
                    j90Var.setCallback(this);
                    j90 j90Var2 = this.H;
                    j90Var2.f25920t = 2.0f;
                    j90Var2.C = true;
                    j90Var2.f25922w.setStrokeWidth(0.0f);
                    this.H.e(org.telegram.ui.ActionBar.j6.l1(0.02f, -1), org.telegram.ui.ActionBar.j6.l1(0.375f, -1));
                }
                j90 j90Var3 = this.H;
                j90Var3.f25906c = -1L;
                j90Var3.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
                this.H.j(this.f41453b);
                this.H.draw(canvas);
            } else {
                j90 j90Var4 = this.H;
                if (j90Var4 != null) {
                    j90Var4.a();
                    this.H.draw(canvas);
                    if (this.H.b()) {
                        this.H.f25905b = -1L;
                    }
                }
            }
        }
        float f15 = this.J;
        org.telegram.ui.Components.j6 j6Var = this.d;
        if (f15 > 0.0f) {
            if (this.V == null) {
                this.V = new qp(j6Var.f25846a.getColor());
            }
            int dp = (int) ((1.0f - this.J) * AndroidUtilities.dp(24.0f));
            this.V.setBounds(0, dp, getWidth(), getHeight() + dp);
            this.V.setAlpha((int) (this.J * 255.0f));
            this.V.draw(canvas);
            invalidate();
        }
        float f16 = this.J;
        if (f16 < 1.0f) {
            if (f16 != 0.0f) {
                canvas.save();
                canvas.translate(0.0f, (int) (this.J * AndroidUtilities.dp(-24.0f)));
                canvas.scale(1.0f, 1.0f - (this.J * 0.4f));
                z4 = true;
            } else {
                z4 = false;
            }
            float d = j6Var.d();
            float d10 = this.f41459n.d(this.h, false);
            if (this.Q) {
                f10 = AndroidUtilities.dp(12.0f);
            } else {
                f10 = 0.0f;
            }
            org.telegram.ui.Components.j6 j6Var2 = this.f41458f;
            float a2 = a(j6Var2.d() + AndroidUtilities.dp(15.66f), d10) + d + f10;
            Rect rect = AndroidUtilities.rectTmp2;
            rect.set((int) (((getMeasuredWidth() - a2) - getWidth()) / 2.0f), (int) (((getMeasuredHeight() - j6Var.e) / 2.0f) - AndroidUtilities.dp(1.0f)), (int) kf.k0.b(getMeasuredWidth() - a2, getWidth(), 2.0f, d), (int) (((getMeasuredHeight() + j6Var.e) / 2.0f) - AndroidUtilities.dp(1.0f)));
            rect.offset(0, (int) ((-AndroidUtilities.dp(7.0f)) * this.E));
            j6Var.f25864w = (int) (AndroidUtilities.lerp(0.5f, 1.0f, this.S) * (1.0f - this.J) * this.W);
            j6Var.setBounds(rect);
            j6Var.draw(canvas);
            if (this.G) {
                org.telegram.ui.Components.j6 j6Var3 = this.e;
                a2 = j6Var3.d();
                rect.set((int) (((getMeasuredWidth() - a2) - getWidth()) / 2.0f), (int) (((getMeasuredHeight() - j6Var3.e) / 2.0f) - AndroidUtilities.dp(1.0f)), (int) kf.k0.b(getMeasuredWidth() - a2, getWidth(), 2.0f, a2), (int) (((getMeasuredHeight() + j6Var3.e) / 2.0f) - AndroidUtilities.dp(1.0f)));
                rect.offset(0, AndroidUtilities.dp(11.0f));
                canvas.save();
                float lerp = AndroidUtilities.lerp(0.1f, 1.0f, this.E);
                canvas.scale(lerp, lerp, rect.centerX(), rect.bottom);
                j6Var3.f25864w = (int) (AndroidUtilities.lerp(0.5f, 1.0f, this.S) * (1.0f - this.J) * 200.0f * this.E);
                j6Var3.setBounds(rect);
                j6Var3.draw(canvas);
                canvas.restore();
            }
            float x10 = e2.c.x(getMeasuredWidth(), a2, 2.0f, d);
            if (this.B) {
                f11 = 5.0f;
            } else {
                f11 = 2.0f;
            }
            int dp2 = (int) (x10 + AndroidUtilities.dp(f11));
            int measuredHeight = (int) ((getMeasuredHeight() - AndroidUtilities.dp(18.0f)) / 2.0f);
            float x11 = e2.c.x(getMeasuredWidth(), a2, 2.0f, d);
            if (this.B) {
                i10 = 5;
            } else {
                i10 = 2;
            }
            rect.set(dp2, measuredHeight, (int) (Math.max(AndroidUtilities.dp(9.0f), j6Var2.d() + f10) + x11 + AndroidUtilities.dp(i10 + 8)), (int) ((AndroidUtilities.dp(18.0f) + getMeasuredHeight()) / 2.0f));
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(rect);
            if (this.M != 1.0f) {
                canvas.save();
                float f17 = this.M;
                canvas.scale(f17, f17, rect.centerX(), rect.centerY());
            }
            if (this.B) {
                float f18 = 1.0f - this.J;
                f12 = 0.5f;
                float lerp2 = AndroidUtilities.lerp(0.5f, 1.0f, this.S);
                Paint paint = this.f41455c;
                paint.setAlpha((int) (lerp2 * f18 * this.W * d10 * d10));
                if (this.Q) {
                    f14 = 4.0f;
                } else {
                    f14 = 10.0f;
                }
                float dp3 = AndroidUtilities.dp(f14);
                canvas.drawRoundRect(rectF, dp3, dp3, paint);
            } else {
                f12 = 0.5f;
            }
            CharSequence charSequence = j6Var2.f25850g;
            if (charSequence != null) {
                i11 = charSequence.length();
            }
            if (i11 > 1) {
                f13 = 0.3f;
            } else {
                f13 = 0.0f;
            }
            rect.offset(-AndroidUtilities.dp(f13), -AndroidUtilities.dp(0.4f));
            float y10 = org.telegram.messenger.y3.y(1.0f, this.J, this.W, d10);
            if (this.B) {
                f12 = 1.0f;
            }
            j6Var2.f25864w = (int) (y10 * f12);
            j6Var2.setBounds(rect);
            canvas.save();
            if (this.B && this.Q) {
                this.R.setAlpha((int) ((1.0f - this.J) * this.W * d10 * 1.0f));
                this.R.setBounds(AndroidUtilities.dp(1.0f) + rect.left, AndroidUtilities.dp(2.0f) + rect.top, this.R.getIntrinsicWidth() + AndroidUtilities.dp(1.0f) + rect.left, this.R.getIntrinsicHeight() + AndroidUtilities.dp(2.0f) + rect.top);
                this.R.draw(canvas);
                canvas.translate(f10 / 2.0f, 0.0f);
            }
            j6Var2.draw(canvas);
            canvas.restore();
            if (this.M != 1.0f) {
                canvas.restore();
            }
            if (z4) {
                canvas.restore();
            }
        }
        if (this.v && this.f41457d0 != (wrapWidth = getWrapWidth())) {
            this.f41457d0 = wrapWidth;
            requestLayout();
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Button");
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f41461s && isClickable() && getParent() != null) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public void onMeasure(int i10, int i11) {
        if (this.v) {
            int wrapWidth = getWrapWidth();
            this.f41457d0 = wrapWidth;
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(wrapWidth, View.MeasureSpec.getSize(i10)), 1073741824), i11);
            View view = this.f41460r;
            if (view != null) {
                view.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
            }
        } else if (this.f41456c0) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) Math.min(Math.max(this.d.d() + getPaddingLeft() + getPaddingRight(), this.f41454b0), View.MeasureSpec.getSize(i10)), 1073741824), i11);
        } else {
            super.onMeasure(i10, i11);
        }
    }

    public void setColor(int i10) {
        if (this.f41461s) {
            this.f41463x = true;
            int dp = AndroidUtilities.dp(this.f41453b);
            this.f41464y = i10;
            setBackground(org.telegram.ui.ActionBar.j6.b0(dp, i10));
            return;
        }
        this.d.r(i10);
        int l1 = org.telegram.ui.ActionBar.j6.l1(0.1f, i10);
        int i11 = this.f41453b;
        this.f41460r.setBackground(org.telegram.ui.ActionBar.j6.Y(l1, i11, i11));
    }

    public void setCountFilled(boolean z4) {
        float f10;
        int color;
        this.B = z4;
        if (z4) {
            f10 = 12.0f;
        } else {
            f10 = 14.0f;
        }
        org.telegram.ui.Components.j6 j6Var = this.f41458f;
        j6Var.t(AndroidUtilities.dp(f10));
        if (this.B) {
            color = this.f41464y;
        } else {
            color = this.d.f25846a.getColor();
        }
        j6Var.r(color);
    }

    public void setCounterColor(int i10) {
        this.f41458f.r(i10);
        this.R.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN));
    }

    @Override
    public void setEnabled(boolean z4) {
        float f10;
        if (this.T != z4) {
            ValueAnimator valueAnimator = this.U;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.U = null;
            }
            float f11 = this.S;
            this.T = z4;
            if (z4) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
            this.U = ofFloat;
            ofFloat.addUpdateListener(new b(this, 1));
            this.U.start();
        }
        super.setEnabled(z4);
    }

    public void setFilled(boolean z4) {
        if (this.f41461s == z4) {
            return;
        }
        this.f41461s = z4;
        org.telegram.ui.Components.j6 j6Var = this.d;
        if (z4) {
            setBackground(org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(this.f41453b), this.f41464y));
            j6Var.u(AndroidUtilities.bold());
        } else {
            setBackground(null);
            j6Var.u(null);
        }
        j();
    }

    public void setFlickeringLoading(boolean z4) {
        this.I = z4;
    }

    public void setGlobalAlpha(float f10) {
        this.W = (int) (f10 * 255.0f);
    }

    @Override
    public void setLoading(boolean z4) {
        float f10;
        if (this.K != z4) {
            if (this.I) {
                this.K = z4;
                invalidate();
                return;
            }
            ValueAnimator valueAnimator = this.L;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.L = null;
            }
            float f11 = this.J;
            this.K = z4;
            if (z4) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
            this.L = ofFloat;
            ofFloat.addUpdateListener(new b(this, 2));
            this.L.addListener(new s61(6, this, z4));
            this.L.setDuration(320L);
            this.L.setInterpolator(mr.h);
            this.L.start();
        }
    }

    public void setMinWidth(int i10) {
        this.f41456c0 = true;
        this.f41454b0 = i10;
    }

    public void setRoundRadius(int i10) {
        this.f41453b = i10;
        if (this.f41461s) {
            setBackground(org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(i10), this.f41464y));
        } else {
            setBackground(null);
        }
        j();
    }

    public void setShowZero(boolean z4) {
        this.P = z4;
    }

    public void setText(CharSequence charSequence) {
        g(charSequence, false, true);
    }

    public void setTextAlpha(float f10) {
        this.d.f25864w = (int) (f10 * 255.0f);
    }

    public void setTextColor(int i10) {
        org.telegram.ui.Components.j6 j6Var = this.d;
        j6Var.r(i10);
        if (!this.f41461s) {
            int l1 = org.telegram.ui.ActionBar.j6.l1(0.1f, j6Var.f25846a.getColor());
            int i11 = this.f41453b;
            this.f41460r.setBackground(org.telegram.ui.ActionBar.j6.Y(l1, i11, i11));
        }
    }

    public void setUseWrapContent(boolean z4) {
        this.v = z4;
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (this.H != drawable && this.d != drawable && this.e != drawable && this.f41458f != drawable && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }

    public d(Context context, org.telegram.ui.ActionBar.f6 f6Var, boolean z4) {
        super(context);
        this.f41453b = 8;
        mr mrVar = mr.h;
        this.f41459n = new org.telegram.ui.Components.z5(350L, mrVar);
        this.B = true;
        this.C = 0;
        this.E = 0.0f;
        this.J = 0.0f;
        this.M = 1.0f;
        this.S = 1.0f;
        this.T = true;
        this.W = 255;
        this.f41461s = z4;
        this.f41451a = f6Var;
        k7.d6.b(this, 0.02f, 1.2f);
        View view = new View(context);
        this.f41460r = view;
        addView(view, k7.b6.c(-1.0f, -1));
        if (z4) {
            int dp = AndroidUtilities.dp(8.0f);
            int v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Oh, f6Var);
            this.f41464y = v02;
            setBackground(org.telegram.ui.ActionBar.j6.b0(dp, v02));
        }
        Paint paint = new Paint(1);
        this.f41455c = paint;
        paint.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Sh, f6Var));
        org.telegram.ui.Components.j6 j6Var = new org.telegram.ui.Components.j6(true, true, false, false);
        this.d = j6Var;
        j6Var.k(0.3f, 250L, mrVar);
        j6Var.setCallback(this);
        j6Var.t(AndroidUtilities.dp(14.0f));
        if (z4) {
            j6Var.u(AndroidUtilities.bold());
        }
        j6Var.f25847b = 1;
        org.telegram.ui.Components.j6 j6Var2 = new org.telegram.ui.Components.j6(i(), true, false, false);
        this.e = j6Var2;
        j6Var2.k(0.3f, 250L, mrVar);
        j6Var2.setCallback(this);
        j6Var2.t(AndroidUtilities.dp(12.0f));
        j6Var2.f25847b = 1;
        org.telegram.ui.Components.j6 j6Var3 = new org.telegram.ui.Components.j6(false, false, true, false);
        this.f41458f = j6Var3;
        j6Var3.k(0.3f, 250L, mrVar);
        j6Var3.setCallback(this);
        j6Var3.t(AndroidUtilities.dp(12.0f));
        j6Var3.u(AndroidUtilities.bold());
        j6Var3.q("", true, true);
        j6Var3.f25847b = 1;
        setWillNotDraw(false);
        j();
    }
}
