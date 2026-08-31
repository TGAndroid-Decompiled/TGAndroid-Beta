package sh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.qv0;
import org.telegram.ui.Components.xd0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.yh;
public final class o2 extends qv0 implements org.telegram.ui.ActionBar.v3 {
    public final Paint f47556t0;
    public boolean f47557u0;
    public final RectF f47558v0;
    public final Path f47559w0;
    public final p2 f47560x0;

    public o2(p2 p2Var, Context context) {
        super(context, null);
        this.f47560x0 = p2Var;
        setClipChildren(false);
        setClipToPadding(false);
        setWillNotDraw(false);
        this.f47556t0 = new Paint(1);
        this.f47558v0 = new RectF();
        this.f47559w0 = new Path();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z4;
        Paint paint;
        float f10;
        p2 p2Var = this.f47560x0;
        xd0 xd0Var = p2Var.f47601p0;
        Rect rect = p2Var.h;
        Rect rect2 = p2Var.f47590f;
        if (!this.f47557u0) {
            int visibility = xd0Var.getVisibility();
            Paint paint2 = this.f47556t0;
            if (visibility != 0) {
                float f11 = p2Var.f47586c0;
                if (f11 < 1.0f && f11 > 0.0f) {
                    paint2.setColor(k6.l1(p2Var.K0, p2Var.O));
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
            if (p2Var.f47605s != null && !AndroidUtilities.isTablet()) {
                canvas.save();
                canvas.translate((1.0f - p2Var.f47586c0) * rect.left, 0.0f);
                c5.j jVar = p2Var.f47605s;
                int lerp = AndroidUtilities.lerp((getWidth() - rect.left) - rect.right, getWidth(), p2Var.f47586c0);
                getHeight();
                jVar.p(canvas, true, false, lerp, 1.0f - p2Var.f47586c0);
                canvas.translate((1.0f - p2Var.f47586c0) * (-rect.left), 0.0f);
                z4 = true;
            } else {
                z4 = false;
            }
            super.dispatchDraw(canvas);
            if (z4) {
                canvas.restore();
            }
            if (xd0Var.getVisibility() != 0) {
                paint2.setColor(k6.l1(p2Var.K0, p2Var.O));
                int i11 = rect2.left;
                if (i11 > 0) {
                    paint = paint2;
                    canvas.drawRect(0.0f, 0.0f, (1.0f - p2Var.f47586c0) * i11, getHeight(), paint);
                } else {
                    paint = paint2;
                }
                if (rect2.top > 0) {
                    canvas.drawRect(0.0f, 0.0f, getWidth(), (1.0f - p2Var.f47586c0) * rect2.top, paint);
                }
                if (rect2.bottom > 0) {
                    float height = getHeight();
                    float f12 = rect2.bottom;
                    l2 l2Var = p2Var.f47594i0;
                    if (l2Var != null && l2Var.getTotalHeight() > 0) {
                        f10 = 1.0f;
                    } else {
                        f10 = 1.0f - p2Var.f47586c0;
                    }
                    canvas.drawRect(0.0f, height - (f12 * f10), getWidth(), getHeight(), paint);
                }
                if (rect2.right > 0) {
                    canvas.drawRect(yh.c(1.0f, p2Var.f47586c0, rect2.right, getWidth()), 0.0f, getWidth(), getHeight(), paint);
                }
            }
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.o3 o3Var;
        p2 p2Var = this.f47560x0;
        Rect rect = p2Var.h;
        LaunchActivity launchActivity = LaunchActivity.D1;
        if (launchActivity != null) {
            o3Var = launchActivity.P();
        } else {
            o3Var = null;
        }
        if (o3Var != null && rect != null) {
            int i10 = (int) ((1.0f - p2Var.f47586c0) * ((int) o3Var.D));
            if (motionEvent.getY() >= (getHeight() - rect.bottom) - i10 && motionEvent.getY() <= getHeight() - rect.bottom && !AndroidUtilities.isTablet()) {
                return o3Var.j(motionEvent.getX(), motionEvent.getY() - ((getHeight() - rect.bottom) - i10), motionEvent.getAction());
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void draw(Canvas canvas) {
        float f10;
        float lerp;
        p2 p2Var = this.f47560x0;
        Rect rect = p2Var.h;
        g2 g2Var = p2Var.v;
        Paint paint = p2Var.K;
        m2 m2Var = p2Var.T;
        Drawable drawable = p2Var.V;
        if (this.f47557u0) {
            return;
        }
        super.draw(canvas);
        if (AndroidUtilities.isTablet()) {
            f10 = 0.0f;
        } else {
            f10 = p2Var.f47583b;
        }
        paint.setColor(p2Var.f47581a);
        paint.setAlpha((int) ((1.0f - p2Var.f47586c0) * (1.0f - (Math.min(0.5f, f10) / 0.5f)) * paint.getAlpha()));
        canvas.save();
        float f11 = 1.0f - f10;
        if (AndroidUtilities.isTablet()) {
            lerp = AndroidUtilities.lerp(g2Var.getTranslationY() + AndroidUtilities.dp(12.0f), AndroidUtilities.statusBarHeight / 2.0f, p2Var.f47583b);
        } else {
            lerp = AndroidUtilities.lerp(g2Var.getTranslationY(), (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2.0f) + AndroidUtilities.statusBarHeight, f10) + AndroidUtilities.dp(12.0f);
        }
        canvas.scale(f11, f11, getWidth() / 2.0f, lerp);
        canvas.drawLine((getWidth() / 2.0f) - AndroidUtilities.dp(16.0f), lerp, (getWidth() / 2.0f) + AndroidUtilities.dp(16.0f), lerp, paint);
        canvas.restore();
        drawable.setAlpha((int) (m2Var.getAlpha() * 255.0f));
        float translationY = m2Var.getTranslationY() + m2Var.getY() + m2Var.getHeight();
        drawable.setBounds(rect.left, (int) translationY, getWidth() - rect.right, (int) (translationY + drawable.getIntrinsicHeight()));
        drawable.draw(canvas);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        boolean z4;
        p2 p2Var = this.f47560x0;
        if (view == p2Var.v && p2Var.f47589e0 && p2Var.f47592g0 > 0 && p2Var.f47591f0 > 0) {
            canvas.save();
            canvas.clipRect(view.getX(), view.getY(), view.getX() + AndroidUtilities.lerp(p2Var.f47591f0, view.getWidth(), p2Var.f47587d0), view.getY() + AndroidUtilities.lerp(p2Var.f47592g0, view.getHeight(), p2Var.f47587d0));
            z4 = true;
        } else {
            z4 = false;
        }
        boolean drawChild = super.drawChild(canvas, view, j10);
        if (z4) {
            canvas.restore();
        }
        return drawChild;
    }

    @Override
    public int[] getColorKeys() {
        return null;
    }

    @Override
    public RectF getRect() {
        g2 g2Var = this.f47560x0.v;
        RectF rectF = this.f47558v0;
        rectF.set(g2Var.getLeft(), g2Var.getTranslationY() + AndroidUtilities.dp(24.0f), g2Var.getRight(), getHeight());
        return rectF;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ic.a(this, new hg.w(15));
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ic.h(this);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        int i10;
        boolean z4;
        p2 p2Var = this.f47560x0;
        Paint paint = p2Var.Q;
        Paint paint2 = p2Var.M;
        g2 g2Var = p2Var.v;
        if (!this.f47557u0) {
            super.onDraw(canvas);
            if (p2Var.f47601p0.getVisibility() != 0) {
                canvas.save();
                c5.j jVar = p2Var.f47605s;
                float f10 = 1.0f;
                if (jVar != null) {
                    int width = getWidth();
                    getHeight();
                    canvas2 = canvas;
                    jVar.p(canvas2, false, false, width, 1.0f - p2Var.f47586c0);
                } else {
                    canvas2 = canvas;
                }
                if (!p2Var.S) {
                    int v02 = k6.v0(k6.f21659d6, p2Var.B);
                    paint2.setColor(v02);
                    p2Var.f47612x.setFlickerViewColor(v02);
                    org.telegram.ui.f3 f3Var = p2Var.R0;
                    if (f3Var != null) {
                        if (AndroidUtilities.computePerceivedBrightness(paint2.getColor()) <= 0.721f) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        f3Var.b(z4, false);
                        p2Var.R0.setBackgroundColor(paint2.getColor());
                    }
                }
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                canvas2.drawRect(rectF, p2Var.L);
                org.telegram.ui.ActionBar.o3 o3Var = p2Var.f47603r;
                if (o3Var != null) {
                    i10 = (int) o3Var.D;
                } else {
                    i10 = 0;
                }
                paint.setColor(p2Var.N);
                float dp = AndroidUtilities.dp(16.0f);
                if (!AndroidUtilities.isTablet()) {
                    f10 = 1.0f - p2Var.f47583b;
                }
                float f11 = dp * f10;
                rectF.set(AndroidUtilities.lerp(g2Var.getLeft(), 0, p2Var.f47586c0), AndroidUtilities.lerp(g2Var.getTranslationY(), 0.0f, p2Var.f47583b), g2Var.getRight(), g2Var.getTranslationY() + AndroidUtilities.dp(24.0f) + f11);
                canvas2.drawRoundRect(rectF, f11, f11, paint);
                rectF.set(AndroidUtilities.lerp(g2Var.getLeft(), 0, p2Var.f47586c0), g2Var.getTranslationY() + AndroidUtilities.dp(24.0f), AndroidUtilities.lerp(g2Var.getRight(), getWidth(), p2Var.f47586c0), getHeight() - i10);
                canvas2.drawRect(rectF, paint2);
                canvas2.restore();
            }
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        p2 p2Var = this.f47560x0;
        g2 g2Var = p2Var.v;
        if (motionEvent.getAction() == 0 && (motionEvent.getY() <= AndroidUtilities.lerp(g2Var.getTranslationY() + AndroidUtilities.dp(24.0f), 0.0f, p2Var.f47583b) || motionEvent.getX() > g2Var.getRight() || motionEvent.getX() < g2Var.getLeft())) {
            p2Var.k(true);
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override
    public void setDrawingFromOverlay(boolean z4) {
        if (this.f47557u0 != z4) {
            this.f47557u0 = z4;
            invalidate();
            p2 p2Var = this.f47560x0;
            p2Var.G();
            LaunchActivity launchActivity = LaunchActivity.D1;
            if (launchActivity != null && p2Var.f47582a0) {
                launchActivity.z0(p2Var.O);
            }
        }
    }

    @Override
    public final float z(Canvas canvas, RectF rectF, float f10, RectF rectF2, float f11) {
        p2 p2Var = this.f47560x0;
        g2 g2Var = p2Var.v;
        RectF rectF3 = this.f47558v0;
        rectF3.set(g2Var.getLeft(), g2Var.getTranslationY() + AndroidUtilities.dp(24.0f), g2Var.getRight(), getHeight());
        AndroidUtilities.lerpCentered(rectF3, rectF, f10, rectF2);
        canvas.save();
        Path path = this.f47559w0;
        path.rewind();
        float dp = AndroidUtilities.dp(16.0f);
        float f12 = 1.0f;
        if (!AndroidUtilities.isTablet()) {
            f12 = 1.0f - p2Var.f47583b;
        }
        float lerp = AndroidUtilities.lerp(dp * f12, AndroidUtilities.dp(18.0f), f10);
        path.addRoundRect(rectF2, lerp, lerp, Path.Direction.CW);
        canvas.clipPath(path);
        canvas.drawPaint(p2Var.M);
        if (g2Var != null) {
            canvas.save();
            canvas.translate(rectF2.left, (f10 * AndroidUtilities.dp(51.0f)) + Math.max(g2Var.getY(), rectF2.top));
            g2Var.draw(canvas);
            canvas.restore();
        }
        canvas.restore();
        return lerp;
    }
}
