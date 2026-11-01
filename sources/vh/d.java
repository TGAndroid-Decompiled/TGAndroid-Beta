package vh;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.messenger.a30;
import org.telegram.messenger.dd;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.kp;
import org.telegram.ui.Components.s80;
import org.telegram.ui.Components.t80;
import org.telegram.ui.be;
public class d extends FrameLayout implements s80, org.telegram.ui.ActionBar.k6 {
    public int D;
    public boolean E;
    public int F;
    public int G;
    public boolean H;
    public int I;
    public th.o0 J;
    public float K;
    public ValueAnimator L;
    public boolean M;
    public t80 N;
    public boolean O;
    public float P;
    public boolean Q;
    public ValueAnimator R;
    public float S;
    public ValueAnimator T;
    public int U;
    public boolean V;
    public boolean W;
    public org.telegram.ui.ActionBar.p6 f51065a;
    public Drawable f51066a0;
    public int f51067b;
    public float f51068b0;
    public final Paint f51069c;
    public boolean f51070c0;
    public final org.telegram.ui.Components.e6 d;
    public ValueAnimator f51071d0;
    public final org.telegram.ui.Components.e6 e;
    public kp f51072e0;
    public final org.telegram.ui.Components.e6 f51073f;
    public int f51074f0;
    public boolean f51075g0;
    public float h;
    public int f51076h0;
    public boolean f51077i0;
    public int f51078j0;
    public final org.telegram.ui.Components.t5 f51079n;
    public final View f51080r;
    public boolean f51081s;
    public boolean f51082w;
    public boolean f51083x;
    public boolean f51084y;

    public d(Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        this(context, p6Var, true);
    }

    private int getWrapWidth() {
        float f7;
        float e = this.f51079n.e(false, this.h);
        if (this.W) {
            f7 = org.telegram.messenger.i0.L(12.0f);
        } else {
            f7 = 0.0f;
        }
        return getPaddingRight() + getPaddingLeft() + ((int) (b(this.f51073f.c() + org.telegram.messenger.i0.L(15.66f), e) + this.d.c() + f7));
    }

    private void setRippleColor(int i10) {
        View view = this.f51080r;
        Drawable background = view.getBackground();
        if (background != null && this.G == i10) {
            return;
        }
        this.G = i10;
        if (background instanceof RippleDrawable) {
            ((RippleDrawable) background).setColor(ColorStateList.valueOf(i10));
            return;
        }
        int i11 = this.f51067b;
        view.setBackground(org.telegram.ui.ActionBar.t6.a0(i10, i11, i11));
    }

    @Override
    public final boolean a() {
        return this.Q;
    }

    public float b(float f7, float f10) {
        return f7 * f10;
    }

    public final void c(int i10, boolean z10) {
        float f7;
        int i11;
        org.telegram.ui.Components.e6 e6Var = this.f51073f;
        if (z10) {
            e6Var.a();
        }
        if (z10 && i10 != (i11 = this.U) && i10 > 0 && i11 > 0) {
            ValueAnimator valueAnimator = this.T;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.T = null;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.T = ofFloat;
            ofFloat.addUpdateListener(new b(this, 0));
            this.T.addListener(new c(this, 1));
            a30.j(2.0f, this.T);
            this.T.setDuration(200L);
            this.T.start();
        }
        this.U = i10;
        if (i10 == 0 && !this.V) {
            f7 = 0.0f;
        } else {
            f7 = 1.0f;
        }
        this.h = f7;
        e6Var.t(dd.E(i10, ' '), z10, true);
        invalidate();
    }

    public final void d() {
        int i10;
        ShapeDrawable d02 = org.telegram.ui.ActionBar.t6.d0(org.telegram.messenger.i0.L(this.f51067b), this.D);
        if (this.f51084y) {
            setBackground(d02);
            return;
        }
        if (this.f51083x) {
            i10 = org.telegram.ui.ActionBar.t6.f21082lb;
        } else {
            i10 = org.telegram.ui.ActionBar.t6.Ci;
        }
        org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i10);
        org.telegram.ui.ActionBar.p6 p6Var = this.f51065a;
        setBackground(d02);
        org.telegram.ui.ActionBar.a7.k(this, d02, N, null, p6Var);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        return false;
    }

    public final void e() {
        this.f51083x = true;
        setFilled(true);
        if (!this.f51084y) {
            this.D = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21082lb, this.f51065a);
            d();
        }
        updateColors();
    }

    public final void f() {
        setRoundRadius(24);
    }

    public final void g(CharSequence charSequence, boolean z10) {
        boolean z11;
        if (charSequence != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        org.telegram.ui.Components.e6 e6Var = this.e;
        if (z10) {
            e6Var.a();
        }
        setContentDescription(charSequence);
        invalidate();
        if (this.M && !z11) {
            ValueAnimator valueAnimator = this.L;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.L = null;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.K, 0.0f);
            this.L = ofFloat;
            ofFloat.addUpdateListener(new b(this, 3));
            this.L.addListener(new c(this, 0));
            this.L.setDuration(200L);
            this.L.setInterpolator(gr.f26523f);
            this.L.start();
        } else {
            e6Var.t(charSequence, z10, true);
        }
        if (!this.M && z11) {
            this.M = true;
            ValueAnimator valueAnimator2 = this.L;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
                this.L = null;
            }
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.K, 1.0f);
            this.L = ofFloat2;
            ofFloat2.addUpdateListener(new b(this, 4));
            this.L.setDuration(200L);
            this.L.setInterpolator(gr.f26523f);
            this.L.start();
        }
    }

    public TextPaint getTextPaint() {
        return this.d.f25742a;
    }

    public final void h(CharSequence charSequence, boolean z10) {
        i(charSequence, false, true);
    }

    public final void i(CharSequence charSequence, boolean z10, boolean z11) {
        org.telegram.ui.Components.e6 e6Var = this.d;
        if (z10) {
            e6Var.a();
        }
        e6Var.t(charSequence, z10, z11);
        setContentDescription(charSequence);
        invalidate();
    }

    @Override
    public final boolean isEnabled() {
        return this.f51070c0;
    }

    public boolean j() {
        return !(this instanceof be);
    }

    public final void k() {
        this.W = true;
        Drawable mutate = getContext().getDrawable(2131231928).mutate();
        this.f51066a0 = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(this.D, PorterDuff.Mode.SRC_IN));
    }

    public final void l() {
        this.f51075g0 = true;
    }

    @Override
    public void onDraw(Canvas canvas) {
        int wrapWidth;
        boolean z10;
        float f7;
        float f10;
        int i10;
        float f11;
        float f12;
        float f13;
        this.f51080r.draw(canvas);
        int i11 = 0;
        if (this.O) {
            if (this.Q) {
                if (this.N == null) {
                    t80 t80Var = new t80(this.f51065a);
                    this.N = t80Var;
                    t80Var.setCallback(this);
                    t80 t80Var2 = this.N;
                    t80Var2.f30589t = 2.0f;
                    t80Var2.D = true;
                    t80Var2.f30592x.setStrokeWidth(0.0f);
                    this.N.f(org.telegram.ui.ActionBar.t6.r1(0.02f, -1), org.telegram.ui.ActionBar.t6.r1(0.375f, -1));
                }
                t80 t80Var3 = this.N;
                t80Var3.f30575c = -1L;
                t80Var3.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
                this.N.k(this.f51067b);
                this.N.draw(canvas);
            } else {
                t80 t80Var4 = this.N;
                if (t80Var4 != null) {
                    t80Var4.a();
                    this.N.draw(canvas);
                    if (this.N.c()) {
                        this.N.f30574b = -1L;
                    }
                }
            }
        }
        int i12 = (this.P > 0.0f ? 1 : (this.P == 0.0f ? 0 : -1));
        org.telegram.ui.Components.e6 e6Var = this.d;
        if (i12 > 0) {
            if (this.f51072e0 == null) {
                this.f51072e0 = new kp(e6Var.f25742a.getColor());
            }
            int L = (int) ((1.0f - this.P) * org.telegram.messenger.i0.L(24.0f));
            this.f51072e0.setBounds(0, L, getWidth(), getHeight() + L);
            this.f51072e0.setAlpha((int) (this.P * 255.0f));
            this.f51072e0.draw(canvas);
            invalidate();
        }
        float f14 = this.P;
        if (f14 < 1.0f) {
            if (f14 != 0.0f) {
                canvas.save();
                canvas.translate(0.0f, (int) (this.P * org.telegram.messenger.i0.L(-24.0f)));
                canvas.scale(1.0f, 1.0f - (this.P * 0.4f));
                z10 = true;
            } else {
                z10 = false;
            }
            float c10 = e6Var.c();
            float e = this.f51079n.e(false, this.h);
            if (this.W) {
                f7 = org.telegram.messenger.i0.L(12.0f);
            } else {
                f7 = 0.0f;
            }
            org.telegram.ui.Components.e6 e6Var2 = this.f51073f;
            float b10 = b(e6Var2.c() + org.telegram.messenger.i0.L(15.66f), e) + c10 + f7;
            Rect rect = org.telegram.messenger.i0.Q;
            rect.set((int) (((getMeasuredWidth() - b10) - getWidth()) / 2.0f), (int) (((getMeasuredHeight() - e6Var.e) / 2.0f) - org.telegram.messenger.i0.L(1.0f)), (int) org.telegram.messenger.m5.a(getMeasuredWidth() - b10, getWidth(), 2.0f, c10), (int) (((getMeasuredHeight() + e6Var.e) / 2.0f) - org.telegram.messenger.i0.L(1.0f)));
            rect.offset(0, (int) ((-org.telegram.messenger.i0.L(7.0f)) * this.K));
            e6Var.B = (int) (org.telegram.messenger.i0.T1(0.5f, 1.0f, this.f51068b0) * (1.0f - this.P) * this.f51074f0);
            e6Var.setBounds(rect);
            e6Var.draw(canvas);
            if (this.M) {
                org.telegram.ui.Components.e6 e6Var3 = this.e;
                b10 = e6Var3.c();
                rect.set((int) (((getMeasuredWidth() - b10) - getWidth()) / 2.0f), (int) (((getMeasuredHeight() - e6Var3.e) / 2.0f) - org.telegram.messenger.i0.L(1.0f)), (int) org.telegram.messenger.m5.a(getMeasuredWidth() - b10, getWidth(), 2.0f, b10), (int) (((getMeasuredHeight() + e6Var3.e) / 2.0f) - org.telegram.messenger.i0.L(1.0f)));
                rect.offset(0, org.telegram.messenger.i0.L(11.0f));
                canvas.save();
                float T1 = org.telegram.messenger.i0.T1(0.1f, 1.0f, this.K);
                canvas.scale(T1, T1, rect.centerX(), rect.bottom);
                e6Var3.B = (int) (org.telegram.messenger.i0.T1(0.5f, 1.0f, this.f51068b0) * (1.0f - this.P) * 200.0f * this.K);
                e6Var3.setBounds(rect);
                e6Var3.draw(canvas);
                canvas.restore();
            }
            float B = c3.i0.B(getMeasuredWidth(), b10, 2.0f, c10);
            if (this.H) {
                f10 = 5.0f;
            } else {
                f10 = 2.0f;
            }
            int L2 = (int) (B + org.telegram.messenger.i0.L(f10));
            int measuredHeight = (int) ((getMeasuredHeight() - org.telegram.messenger.i0.L(18.0f)) / 2.0f);
            float B2 = c3.i0.B(getMeasuredWidth(), b10, 2.0f, c10);
            if (this.H) {
                i10 = 5;
            } else {
                i10 = 2;
            }
            rect.set(L2, measuredHeight, (int) (Math.max(org.telegram.messenger.i0.L(9.0f), e6Var2.c() + f7) + B2 + org.telegram.messenger.i0.L(i10 + 8)), (int) ((org.telegram.messenger.i0.L(18.0f) + getMeasuredHeight()) / 2.0f));
            RectF rectF = org.telegram.messenger.i0.P;
            rectF.set(rect);
            if (this.S != 1.0f) {
                canvas.save();
                float f15 = this.S;
                canvas.scale(f15, f15, rect.centerX(), rect.centerY());
            }
            if (this.H) {
                float f16 = 1.0f - this.P;
                f11 = 0.5f;
                float T12 = org.telegram.messenger.i0.T1(0.5f, 1.0f, this.f51068b0);
                Paint paint = this.f51069c;
                paint.setAlpha((int) (T12 * f16 * this.f51074f0 * e * e));
                if (this.W) {
                    f13 = 4.0f;
                } else {
                    f13 = 10.0f;
                }
                float L3 = org.telegram.messenger.i0.L(f13);
                canvas.drawRoundRect(rectF, L3, L3, paint);
            } else {
                f11 = 0.5f;
            }
            CharSequence charSequence = e6Var2.f25749i;
            if (charSequence != null) {
                i11 = charSequence.length();
            }
            if (i11 > 1) {
                f12 = 0.3f;
            } else {
                f12 = 0.0f;
            }
            rect.offset(-org.telegram.messenger.i0.L(f12), -org.telegram.messenger.i0.L(0.4f));
            float A = org.telegram.messenger.m5.A(1.0f, this.P, this.f51074f0, e);
            if (this.H) {
                f11 = 1.0f;
            }
            e6Var2.B = (int) (A * f11);
            e6Var2.setBounds(rect);
            canvas.save();
            if (this.H && this.W) {
                this.f51066a0.setAlpha((int) ((1.0f - this.P) * this.f51074f0 * e * 1.0f));
                this.f51066a0.setBounds(org.telegram.messenger.i0.L(1.0f) + rect.left, org.telegram.messenger.i0.L(2.0f) + rect.top, this.f51066a0.getIntrinsicWidth() + org.telegram.messenger.i0.L(1.0f) + rect.left, this.f51066a0.getIntrinsicHeight() + org.telegram.messenger.i0.L(2.0f) + rect.top);
                this.f51066a0.draw(canvas);
                canvas.translate(f7 / 2.0f, 0.0f);
            }
            e6Var2.draw(canvas);
            canvas.restore();
            if (this.S != 1.0f) {
                canvas.restore();
            }
            if (z10) {
                canvas.restore();
            }
        }
        if (this.f51082w && this.f51078j0 != (wrapWidth = getWrapWidth())) {
            this.f51078j0 = wrapWidth;
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
        if (this.f51081s && isClickable() && getParent() != null) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public void onMeasure(int i10, int i11) {
        if (this.f51082w) {
            int wrapWidth = getWrapWidth();
            this.f51078j0 = wrapWidth;
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(wrapWidth, View.MeasureSpec.getSize(i10)), 1073741824), i11);
            View view = this.f51080r;
            if (view != null) {
                view.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
            }
        } else if (this.f51077i0) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) Math.min(Math.max(this.d.c() + getPaddingLeft() + getPaddingRight(), this.f51076h0), View.MeasureSpec.getSize(i10)), 1073741824), i11);
        } else {
            super.onMeasure(i10, i11);
        }
    }

    public void setColor(int i10) {
        if (this.f51081s) {
            this.f51084y = true;
            int L = org.telegram.messenger.i0.L(this.f51067b);
            this.D = i10;
            setBackground(org.telegram.ui.ActionBar.t6.d0(L, i10));
            return;
        }
        this.E = true;
        this.d.u(i10);
        int r12 = org.telegram.ui.ActionBar.t6.r1(0.1f, i10);
        int i11 = this.f51067b;
        this.f51080r.setBackground(org.telegram.ui.ActionBar.t6.a0(r12, i11, i11));
    }

    public void setCountFilled(boolean z10) {
        float f7;
        int color;
        this.H = z10;
        if (z10) {
            f7 = 12.0f;
        } else {
            f7 = 14.0f;
        }
        org.telegram.ui.Components.e6 e6Var = this.f51073f;
        e6Var.w(org.telegram.messenger.i0.L(f7));
        if (this.H) {
            color = this.D;
        } else {
            color = this.d.f25742a.getColor();
        }
        e6Var.u(color);
    }

    public void setCounterColor(int i10) {
        this.f51073f.u(i10);
        this.f51066a0.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN));
    }

    @Override
    public void setEnabled(boolean z10) {
        float f7;
        if (this.f51070c0 != z10) {
            ValueAnimator valueAnimator = this.f51071d0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f51071d0 = null;
            }
            float f10 = this.f51068b0;
            this.f51070c0 = z10;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
            this.f51071d0 = ofFloat;
            ofFloat.addUpdateListener(new b(this, 1));
            this.f51071d0.start();
        }
        super.setEnabled(z10);
    }

    public void setFilled(boolean z10) {
        if (this.f51081s == z10) {
            return;
        }
        this.f51081s = z10;
        org.telegram.ui.Components.e6 e6Var = this.d;
        if (z10) {
            d();
            e6Var.x(org.telegram.messenger.i0.o());
        } else {
            setBackground(null);
            e6Var.x(null);
        }
        updateColors();
    }

    public void setFlickeringLoading(boolean z10) {
        this.O = z10;
    }

    public void setGlobalAlpha(float f7) {
        this.f51074f0 = (int) (f7 * 255.0f);
    }

    @Override
    public void setLoading(boolean z10) {
        float f7;
        if (this.Q != z10) {
            if (this.O) {
                this.Q = z10;
                invalidate();
                return;
            }
            ValueAnimator valueAnimator = this.R;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.R = null;
            }
            float f10 = this.P;
            this.Q = z10;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
            this.R = ofFloat;
            ofFloat.addUpdateListener(new b(this, 2));
            this.R.addListener(new sg.y(7, this, z10));
            this.R.setDuration(320L);
            this.R.setInterpolator(gr.h);
            this.R.start();
        }
    }

    public void setMinWidth(int i10) {
        this.f51077i0 = true;
        this.f51076h0 = i10;
    }

    public void setRoundRadius(int i10) {
        this.f51067b = i10;
        if (this.f51081s) {
            d();
        } else {
            setBackground(null);
        }
        this.f51080r.setBackground(null);
        updateColors();
    }

    public void setShowZero(boolean z10) {
        this.V = z10;
    }

    public void setText(CharSequence charSequence) {
        i(charSequence, false, true);
    }

    public void setTextAlpha(float f7) {
        this.d.B = (int) (f7 * 255.0f);
    }

    public void setTextColor(int i10) {
        this.F = -1;
        this.E = true;
        org.telegram.ui.Components.e6 e6Var = this.d;
        e6Var.u(i10);
        if (!this.f51081s) {
            setRippleColor(org.telegram.ui.ActionBar.t6.r1(0.1f, e6Var.f25742a.getColor()));
        }
    }

    public void setTextColorKey(int i10) {
        this.F = i10;
        this.E = false;
        updateColors();
    }

    public void setUseWrapContent(boolean z10) {
        this.f51082w = z10;
    }

    public void updateColors() {
        int i10;
        int i11;
        if (!this.f51084y) {
            if (this.f51083x) {
                i11 = org.telegram.ui.ActionBar.t6.f21082lb;
            } else {
                i11 = org.telegram.ui.ActionBar.t6.Ci;
            }
            this.D = org.telegram.ui.ActionBar.t6.w0(i11, this.f51065a);
        }
        boolean z10 = this.E;
        org.telegram.ui.Components.e6 e6Var = this.d;
        if (!z10) {
            int i12 = this.F;
            if (i12 < 0) {
                if (this.f51081s) {
                    if (this.f51083x) {
                        i12 = org.telegram.ui.ActionBar.t6.f21101mb;
                    } else {
                        i12 = org.telegram.ui.ActionBar.t6.Gi;
                    }
                } else {
                    i12 = org.telegram.ui.ActionBar.t6.Ci;
                }
            }
            e6Var.u(org.telegram.ui.ActionBar.t6.w0(i12, this.f51065a));
        }
        if (this.f51081s) {
            setRippleColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21021i6, this.f51065a));
        } else if (!this.E) {
            setRippleColor(org.telegram.ui.ActionBar.t6.r1(0.1f, e6Var.f25742a.getColor()));
        }
        if (!this.E) {
            if (this.f51081s) {
                if (this.f51083x) {
                    i10 = org.telegram.ui.ActionBar.t6.f21101mb;
                } else {
                    i10 = org.telegram.ui.ActionBar.t6.Gi;
                }
            } else {
                i10 = org.telegram.ui.ActionBar.t6.Ci;
            }
            this.e.u(org.telegram.ui.ActionBar.t6.w0(i10, this.f51065a));
        }
        this.f51073f.u(this.D);
        this.f51069c.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Gi, this.f51065a));
        invalidate();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (this.N != drawable && this.d != drawable && this.e != drawable && this.f51073f != drawable && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }

    public d(Context context, org.telegram.ui.ActionBar.p6 p6Var, boolean z10) {
        super(context);
        this.f51067b = 8;
        gr grVar = gr.h;
        this.f51079n = new org.telegram.ui.Components.t5(350L, grVar);
        this.F = -1;
        this.H = true;
        this.I = 0;
        this.K = 0.0f;
        this.P = 0.0f;
        this.S = 1.0f;
        this.f51068b0 = 1.0f;
        this.f51070c0 = true;
        this.f51074f0 = 255;
        this.f51081s = z10;
        this.f51065a = p6Var;
        w7.e6.b(this, 0.02f, 1.2f);
        View view = new View(context);
        this.f51080r = view;
        addView(view, w7.b6.c(-1.0f, -1));
        if (z10) {
            int L = org.telegram.messenger.i0.L(8.0f);
            int i10 = org.telegram.ui.ActionBar.t6.Ci;
            int w02 = org.telegram.ui.ActionBar.t6.w0(i10, p6Var);
            this.D = w02;
            ShapeDrawable d02 = org.telegram.ui.ActionBar.t6.d0(L, w02);
            org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i10);
            setBackground(d02);
            org.telegram.ui.ActionBar.a7.k(this, d02, N, null, p6Var);
        }
        Paint paint = new Paint(1);
        this.f51069c = paint;
        paint.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Gi, p6Var));
        org.telegram.ui.Components.e6 e6Var = new org.telegram.ui.Components.e6(true, true, false, false, true);
        this.d = e6Var;
        e6Var.n(0.3f, 250L, grVar);
        e6Var.setCallback(this);
        e6Var.w(org.telegram.messenger.i0.L(14.0f));
        if (z10) {
            e6Var.x(org.telegram.messenger.i0.o());
        }
        e6Var.f25744b = 1;
        org.telegram.ui.Components.e6 e6Var2 = new org.telegram.ui.Components.e6(j(), true, false);
        this.e = e6Var2;
        e6Var2.n(0.3f, 250L, grVar);
        e6Var2.setCallback(this);
        e6Var2.w(org.telegram.messenger.i0.L(12.0f));
        e6Var2.f25744b = 1;
        org.telegram.ui.Components.e6 e6Var3 = new org.telegram.ui.Components.e6(false, false, true);
        this.f51073f = e6Var3;
        e6Var3.n(0.3f, 250L, grVar);
        e6Var3.setCallback(this);
        e6Var3.w(org.telegram.messenger.i0.L(12.0f));
        e6Var3.x(org.telegram.messenger.i0.o());
        e6Var3.t("", true, true);
        e6Var3.f25744b = 1;
        setWillNotDraw(false);
        updateColors();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
