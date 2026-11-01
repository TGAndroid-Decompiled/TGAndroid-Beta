package xh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import java.util.HashSet;
import org.telegram.messenger.f8;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.vu0;
import org.telegram.ui.Components.zc0;
import org.telegram.ui.LaunchActivity;
public final class l2 extends vu0 implements org.telegram.ui.ActionBar.o3 {
    public final Paint f53872f0;
    public boolean f53873g0;
    public final RectF f53874h0;
    public final Path f53875i0;
    public final m2 f53876j0;

    public l2(m2 m2Var, Context context) {
        super(context, null);
        this.f53876j0 = m2Var;
        setClipChildren(false);
        setClipToPadding(false);
        setWillNotDraw(false);
        this.f53872f0 = new Paint(1);
        this.f53874h0 = new RectF();
        this.f53875i0 = new Path();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(t6.f20930d6));
        hashSet.add(Integer.valueOf(t6.f20873a7));
        hashSet.add(Integer.valueOf(t6.G6));
        hashSet.add(Integer.valueOf(t6.f21245u8));
        hashSet.add(Integer.valueOf(t6.G8));
        hashSet.add(Integer.valueOf(t6.E8));
        hashSet.add(Integer.valueOf(t6.F8));
        hashSet.add(Integer.valueOf(t6.I5));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z10;
        Paint paint;
        float f7;
        m2 m2Var = this.f53876j0;
        zc0 zc0Var = m2Var.f53916t0;
        Rect rect = m2Var.f53907n;
        Rect rect2 = m2Var.h;
        if (!this.f53873g0) {
            int visibility = zc0Var.getVisibility();
            Paint paint2 = this.f53872f0;
            if (visibility != 0) {
                float f10 = m2Var.f53901g0;
                if (f10 < 1.0f && f10 > 0.0f) {
                    paint2.setColor(t6.r1(m2Var.R0, m2Var.S));
                    int i10 = rect2.left;
                    if (i10 > 0) {
                        canvas.drawRect(0.0f, 0.0f, i10, getHeight(), paint2);
                    }
                    if (rect2.top > 0) {
                        canvas.drawRect(0.0f, 0.0f, getWidth(), rect2.top, paint2);
                    }
                    if (rect2.bottom > 0) {
                        canvas.drawRect(0.0f, getHeight() - rect2.bottom, getWidth(), getHeight(), paint2);
                    }
                    if (rect2.right > 0) {
                        canvas.drawRect(getWidth() - rect2.right, 0.0f, getWidth(), getHeight(), paint2);
                    }
                }
            }
            if (m2Var.f53919w != null && !org.telegram.messenger.i0.Q1()) {
                canvas.save();
                canvas.translate((1.0f - m2Var.f53901g0) * rect.left, 0.0f);
                bh.d dVar = m2Var.f53919w;
                int W1 = org.telegram.messenger.i0.W1(m2Var.f53901g0, (getWidth() - rect.left) - rect.right, getWidth());
                getHeight();
                dVar.n(canvas, true, false, W1, 1.0f - m2Var.f53901g0);
                canvas.translate((1.0f - m2Var.f53901g0) * (-rect.left), 0.0f);
                z10 = true;
            } else {
                z10 = false;
            }
            super.dispatchDraw(canvas);
            if (z10) {
                canvas.restore();
            }
            if (zc0Var.getVisibility() != 0) {
                paint2.setColor(t6.r1(m2Var.R0, m2Var.S));
                int i11 = rect2.left;
                if (i11 > 0) {
                    paint = paint2;
                    canvas.drawRect(0.0f, 0.0f, (1.0f - m2Var.f53901g0) * i11, getHeight(), paint);
                } else {
                    paint = paint2;
                }
                if (rect2.top > 0) {
                    canvas.drawRect(0.0f, 0.0f, getWidth(), (1.0f - m2Var.f53901g0) * rect2.top, paint);
                }
                if (rect2.bottom > 0) {
                    float height = getHeight();
                    float f11 = rect2.bottom;
                    i2 i2Var = m2Var.m0;
                    if (i2Var != null && i2Var.getTotalHeight() > 0) {
                        f7 = 1.0f;
                    } else {
                        f7 = 1.0f - m2Var.f53901g0;
                    }
                    canvas.drawRect(0.0f, height - (f11 * f7), getWidth(), getHeight(), paint);
                }
                if (rect2.right > 0) {
                    canvas.drawRect(sc.e.z(1.0f, m2Var.f53901g0, rect2.right, getWidth()), 0.0f, getWidth(), getHeight(), paint);
                }
            }
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.i3 i3Var;
        m2 m2Var = this.f53876j0;
        Rect rect = m2Var.f53907n;
        LaunchActivity launchActivity = LaunchActivity.I1;
        if (launchActivity != null) {
            i3Var = launchActivity.N();
        } else {
            i3Var = null;
        }
        if (i3Var != null && rect != null) {
            int i10 = (int) ((1.0f - m2Var.f53901g0) * ((int) i3Var.G));
            if (motionEvent.getY() >= (getHeight() - rect.bottom) - i10 && motionEvent.getY() <= getHeight() - rect.bottom && !org.telegram.messenger.i0.Q1()) {
                return i3Var.j(motionEvent.getX(), motionEvent.getY() - ((getHeight() - rect.bottom) - i10), motionEvent.getAction());
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void draw(Canvas canvas) {
        float f7;
        float T1;
        m2 m2Var = this.f53876j0;
        Rect rect = m2Var.f53907n;
        d2 d2Var = m2Var.f53921x;
        Paint paint = m2Var.O;
        j2 j2Var = m2Var.X;
        Drawable drawable = m2Var.Z;
        if (this.f53873g0) {
            return;
        }
        super.draw(canvas);
        if (org.telegram.messenger.i0.Q1()) {
            f7 = 0.0f;
        } else {
            f7 = m2Var.f53895c;
        }
        paint.setColor(m2Var.f53891a);
        paint.setAlpha((int) ((1.0f - m2Var.f53901g0) * (1.0f - (Math.min(0.5f, f7) / 0.5f)) * paint.getAlpha()));
        canvas.save();
        float f10 = 1.0f - f7;
        if (org.telegram.messenger.i0.Q1()) {
            T1 = org.telegram.messenger.i0.T1(d2Var.getTranslationY() + org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.f16166m / 2.0f, m2Var.f53895c);
        } else {
            T1 = org.telegram.messenger.i0.T1(d2Var.getTranslationY(), (org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() / 2.0f) + org.telegram.messenger.i0.f16166m, f7) + org.telegram.messenger.i0.L(12.0f);
        }
        canvas.scale(f10, f10, getWidth() / 2.0f, T1);
        canvas.drawLine((getWidth() / 2.0f) - org.telegram.messenger.i0.L(16.0f), T1, (getWidth() / 2.0f) + org.telegram.messenger.i0.L(16.0f), T1, paint);
        canvas.restore();
        drawable.setAlpha((int) (j2Var.getAlpha() * 255.0f));
        float translationY = j2Var.getTranslationY() + j2Var.getY() + j2Var.getHeight();
        drawable.setBounds(rect.left, (int) translationY, getWidth() - rect.right, (int) (translationY + drawable.getIntrinsicHeight()));
        drawable.draw(canvas);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        boolean z10;
        m2 m2Var = this.f53876j0;
        if (view == m2Var.f53921x && m2Var.f53903i0 && m2Var.f53905k0 > 0 && m2Var.f53904j0 > 0) {
            canvas.save();
            canvas.clipRect(view.getX(), view.getY(), view.getX() + org.telegram.messenger.i0.W1(m2Var.f53902h0, m2Var.f53904j0, view.getWidth()), view.getY() + org.telegram.messenger.i0.W1(m2Var.f53902h0, m2Var.f53905k0, view.getHeight()));
            z10 = true;
        } else {
            z10 = false;
        }
        boolean drawChild = super.drawChild(canvas, view, j10);
        if (z10) {
            canvas.restore();
        }
        return drawChild;
    }

    @Override
    public RectF getRect() {
        d2 d2Var = this.f53876j0.f53921x;
        RectF rectF = this.f53874h0;
        rectF.set(d2Var.getLeft(), d2Var.getTranslationY() + org.telegram.messenger.i0.L(24.0f), d2Var.getRight(), getHeight());
        return rectF;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        setTag(2131296351, new mg.u(14));
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setTag(2131296351, null);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        int i10;
        boolean z10;
        m2 m2Var = this.f53876j0;
        Paint paint = m2Var.U;
        Paint paint2 = m2Var.Q;
        d2 d2Var = m2Var.f53921x;
        if (!this.f53873g0) {
            super.onDraw(canvas);
            if (m2Var.f53916t0.getVisibility() != 0) {
                canvas.save();
                bh.d dVar = m2Var.f53919w;
                float f7 = 1.0f;
                if (dVar != null) {
                    int width = getWidth();
                    getHeight();
                    canvas2 = canvas;
                    dVar.n(canvas2, false, false, width, 1.0f - m2Var.f53901g0);
                } else {
                    canvas2 = canvas;
                }
                if (!m2Var.W) {
                    int w02 = t6.w0(t6.f20930d6, m2Var.F);
                    paint2.setColor(w02);
                    m2Var.D.setFlickerViewColor(w02);
                    org.telegram.ui.b3 b3Var = m2Var.Y0;
                    if (b3Var != null) {
                        if (org.telegram.messenger.i0.B(paint2.getColor()) <= 0.721f) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        b3Var.b(z10, false);
                        m2Var.Y0.setBackgroundColor(paint2.getColor());
                    }
                }
                RectF rectF = org.telegram.messenger.i0.P;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                canvas2.drawRect(rectF, m2Var.P);
                org.telegram.ui.ActionBar.i3 i3Var = m2Var.f53914s;
                if (i3Var != null) {
                    i10 = (int) i3Var.G;
                } else {
                    i10 = 0;
                }
                paint.setColor(m2Var.R);
                float L = org.telegram.messenger.i0.L(16.0f);
                if (!org.telegram.messenger.i0.Q1()) {
                    f7 = 1.0f - m2Var.f53895c;
                }
                float f10 = L * f7;
                rectF.set(org.telegram.messenger.i0.W1(m2Var.f53901g0, d2Var.getLeft(), 0), org.telegram.messenger.i0.T1(d2Var.getTranslationY(), 0.0f, m2Var.f53895c), d2Var.getRight(), d2Var.getTranslationY() + org.telegram.messenger.i0.L(24.0f) + f10);
                canvas2.drawRoundRect(rectF, f10, f10, paint);
                int left = d2Var.getLeft();
                rectF.set(org.telegram.messenger.i0.W1(m2Var.f53901g0, left, 0), d2Var.getTranslationY() + org.telegram.messenger.i0.L(24.0f), org.telegram.messenger.i0.W1(m2Var.f53901g0, d2Var.getRight(), getWidth()), getHeight() - i10);
                canvas2.drawRect(rectF, paint2);
                canvas2.restore();
            }
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        m2 m2Var = this.f53876j0;
        d2 d2Var = m2Var.f53921x;
        if (motionEvent.getAction() == 0 && (motionEvent.getY() <= org.telegram.messenger.i0.T1(d2Var.getTranslationY() + org.telegram.messenger.i0.L(24.0f), 0.0f, m2Var.f53895c) || motionEvent.getX() > d2Var.getRight() || motionEvent.getX() < d2Var.getLeft())) {
            m2Var.o(true);
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override
    public void setDrawingFromOverlay(boolean z10) {
        if (this.f53873g0 != z10) {
            this.f53873g0 = z10;
            invalidate();
            m2 m2Var = this.f53876j0;
            m2Var.L();
            LaunchActivity launchActivity = LaunchActivity.I1;
            if (launchActivity != null && m2Var.f53898e0) {
                launchActivity.D0(m2Var.S);
            }
        }
    }

    @Override
    public final void updateColors() {
        int w02;
        m2 m2Var = this.f53876j0;
        Paint paint = m2Var.Q;
        l2 l2Var = m2Var.f53899f;
        j2 j2Var = m2Var.X;
        p6 p6Var = m2Var.F;
        if (j2Var != null && l2Var != null) {
            try {
                if (m2Var.D != null && paint != null) {
                    if (!m2Var.V) {
                        int i10 = m2Var.f53918v0;
                        if (i10 < 0) {
                            i10 = t6.f20930d6;
                        }
                        int w03 = t6.w0(i10, p6Var);
                        int i11 = m2Var.R;
                        if (w03 != i11) {
                            m2Var.R = w03;
                            if ((j2Var.getBackground() instanceof ColorDrawable) && ((ColorDrawable) j2Var.getBackground()).getColor() == i11) {
                                j2Var.setBackgroundColor(m2Var.R);
                            }
                        }
                    }
                    if (m2Var.I0 && m2Var.m0 != null && (w02 = t6.w0(t6.f20873a7, p6Var)) != m2Var.S) {
                        m2Var.D(w02, false);
                        m2Var.I0 = true;
                    }
                    if (m2Var.f53891a == m2Var.f53893b) {
                        int x02 = t6.x0(null, t6.wj, false);
                        m2Var.f53893b = x02;
                        m2Var.f53891a = x02;
                    }
                    int color = paint.getColor();
                    if (!m2Var.V) {
                        color = (((((((((((color * 31) + t6.w0(t6.G6, p6Var)) * 31) + t6.w0(t6.f21245u8, p6Var)) * 31) + t6.w0(t6.G8, p6Var)) * 31) + t6.w0(t6.E8, p6Var)) * 31) + t6.w0(t6.F8, p6Var)) * 31) + t6.w0(t6.I5, p6Var);
                    }
                    if (!m2Var.J0 || color != m2Var.K0) {
                        m2Var.J0 = true;
                        m2Var.K0 = color;
                        m2Var.F();
                    }
                    m2Var.J();
                    l2Var.invalidate();
                }
            } catch (Exception e) {
                f8.g(e, true);
            }
        }
    }

    @Override
    public final float x(Canvas canvas, RectF rectF, float f7, RectF rectF2, float f10) {
        m2 m2Var = this.f53876j0;
        d2 d2Var = m2Var.f53921x;
        RectF rectF3 = this.f53874h0;
        rectF3.set(d2Var.getLeft(), d2Var.getTranslationY() + org.telegram.messenger.i0.L(24.0f), d2Var.getRight(), getHeight());
        org.telegram.messenger.i0.c2(rectF3, rectF, f7, rectF2);
        canvas.save();
        Path path = this.f53875i0;
        path.rewind();
        float L = org.telegram.messenger.i0.L(16.0f);
        float f11 = 1.0f;
        if (!org.telegram.messenger.i0.Q1()) {
            f11 = 1.0f - m2Var.f53895c;
        }
        float T1 = org.telegram.messenger.i0.T1(L * f11, org.telegram.messenger.i0.L(18.0f), f7);
        path.addRoundRect(rectF2, T1, T1, Path.Direction.CW);
        canvas.clipPath(path);
        canvas.drawPaint(m2Var.Q);
        if (d2Var != null) {
            canvas.save();
            canvas.translate(rectF2.left, (f7 * org.telegram.messenger.i0.L(51.0f)) + Math.max(d2Var.getY(), rectF2.top));
            d2Var.draw(canvas);
            canvas.restore();
        }
        canvas.restore();
        return T1;
    }
}
