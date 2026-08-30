package rh;

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
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.qv0;
import org.telegram.ui.Components.vd0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.yh;
public final class p2 extends qv0 implements org.telegram.ui.ActionBar.u3 {
    public final Paint f43655t0;
    public boolean f43656u0;
    public final RectF f43657v0;
    public final Path f43658w0;
    public final q2 f43659x0;

    public p2(q2 q2Var, Context context) {
        super(context, null);
        this.f43659x0 = q2Var;
        setClipChildren(false);
        setClipToPadding(false);
        setWillNotDraw(false);
        this.f43655t0 = new Paint(1);
        this.f43657v0 = new RectF();
        this.f43658w0 = new Path();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z4;
        Paint paint;
        float f10;
        q2 q2Var = this.f43659x0;
        vd0 vd0Var = q2Var.f43697p0;
        Rect rect = q2Var.h;
        Rect rect2 = q2Var.f43686f;
        if (!this.f43656u0) {
            int visibility = vd0Var.getVisibility();
            Paint paint2 = this.f43655t0;
            if (visibility != 0) {
                float f11 = q2Var.f43683c0;
                if (f11 < 1.0f && f11 > 0.0f) {
                    paint2.setColor(j6.l1(q2Var.K0, q2Var.O));
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
            if (q2Var.f43701s != null && !AndroidUtilities.isTablet()) {
                canvas.save();
                canvas.translate((1.0f - q2Var.f43683c0) * rect.left, 0.0f);
                c5.j jVar = q2Var.f43701s;
                int lerp = AndroidUtilities.lerp((getWidth() - rect.left) - rect.right, getWidth(), q2Var.f43683c0);
                getHeight();
                jVar.r(canvas, true, false, lerp, 1.0f - q2Var.f43683c0);
                canvas.translate((1.0f - q2Var.f43683c0) * (-rect.left), 0.0f);
                z4 = true;
            } else {
                z4 = false;
            }
            super.dispatchDraw(canvas);
            if (z4) {
                canvas.restore();
            }
            if (vd0Var.getVisibility() != 0) {
                paint2.setColor(j6.l1(q2Var.K0, q2Var.O));
                int i11 = rect2.left;
                if (i11 > 0) {
                    paint = paint2;
                    canvas.drawRect(0.0f, 0.0f, (1.0f - q2Var.f43683c0) * i11, getHeight(), paint);
                } else {
                    paint = paint2;
                }
                if (rect2.top > 0) {
                    canvas.drawRect(0.0f, 0.0f, getWidth(), (1.0f - q2Var.f43683c0) * rect2.top, paint);
                }
                if (rect2.bottom > 0) {
                    float height = getHeight();
                    float f12 = rect2.bottom;
                    m2 m2Var = q2Var.f43690i0;
                    if (m2Var != null && m2Var.getTotalHeight() > 0) {
                        f10 = 1.0f;
                    } else {
                        f10 = 1.0f - q2Var.f43683c0;
                    }
                    canvas.drawRect(0.0f, height - (f12 * f10), getWidth(), getHeight(), paint);
                }
                if (rect2.right > 0) {
                    canvas.drawRect(yh.c(1.0f, q2Var.f43683c0, rect2.right, getWidth()), 0.0f, getWidth(), getHeight(), paint);
                }
            }
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.n3 n3Var;
        q2 q2Var = this.f43659x0;
        Rect rect = q2Var.h;
        LaunchActivity launchActivity = LaunchActivity.D1;
        if (launchActivity != null) {
            n3Var = launchActivity.P();
        } else {
            n3Var = null;
        }
        if (n3Var != null && rect != null) {
            int i10 = (int) ((1.0f - q2Var.f43683c0) * ((int) n3Var.D));
            if (motionEvent.getY() >= (getHeight() - rect.bottom) - i10 && motionEvent.getY() <= getHeight() - rect.bottom && !AndroidUtilities.isTablet()) {
                return n3Var.j(motionEvent.getX(), motionEvent.getY() - ((getHeight() - rect.bottom) - i10), motionEvent.getAction());
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void draw(Canvas canvas) {
        float f10;
        float lerp;
        q2 q2Var = this.f43659x0;
        Rect rect = q2Var.h;
        h2 h2Var = q2Var.v;
        Paint paint = q2Var.K;
        n2 n2Var = q2Var.T;
        Drawable drawable = q2Var.V;
        if (this.f43656u0) {
            return;
        }
        super.draw(canvas);
        if (AndroidUtilities.isTablet()) {
            f10 = 0.0f;
        } else {
            f10 = q2Var.f43680b;
        }
        paint.setColor(q2Var.f43678a);
        paint.setAlpha((int) ((1.0f - q2Var.f43683c0) * (1.0f - (Math.min(0.5f, f10) / 0.5f)) * paint.getAlpha()));
        canvas.save();
        float f11 = 1.0f - f10;
        if (AndroidUtilities.isTablet()) {
            lerp = AndroidUtilities.lerp(h2Var.getTranslationY() + AndroidUtilities.dp(12.0f), AndroidUtilities.statusBarHeight / 2.0f, q2Var.f43680b);
        } else {
            lerp = AndroidUtilities.lerp(h2Var.getTranslationY(), (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2.0f) + AndroidUtilities.statusBarHeight, f10) + AndroidUtilities.dp(12.0f);
        }
        canvas.scale(f11, f11, getWidth() / 2.0f, lerp);
        canvas.drawLine((getWidth() / 2.0f) - AndroidUtilities.dp(16.0f), lerp, (getWidth() / 2.0f) + AndroidUtilities.dp(16.0f), lerp, paint);
        canvas.restore();
        drawable.setAlpha((int) (n2Var.getAlpha() * 255.0f));
        float translationY = n2Var.getTranslationY() + n2Var.getY() + n2Var.getHeight();
        drawable.setBounds(rect.left, (int) translationY, getWidth() - rect.right, (int) (translationY + drawable.getIntrinsicHeight()));
        drawable.draw(canvas);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        boolean z4;
        q2 q2Var = this.f43659x0;
        if (view == q2Var.v && q2Var.f43685e0 && q2Var.f43688g0 > 0 && q2Var.f43687f0 > 0) {
            canvas.save();
            canvas.clipRect(view.getX(), view.getY(), view.getX() + AndroidUtilities.lerp(q2Var.f43687f0, view.getWidth(), q2Var.f43684d0), view.getY() + AndroidUtilities.lerp(q2Var.f43688g0, view.getHeight(), q2Var.f43684d0));
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
        h2 h2Var = this.f43659x0.v;
        RectF rectF = this.f43657v0;
        rectF.set(h2Var.getLeft(), h2Var.getTranslationY() + AndroidUtilities.dp(24.0f), h2Var.getRight(), getHeight());
        return rectF;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ic.a(this, new gg.w(15));
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
        q2 q2Var = this.f43659x0;
        Paint paint = q2Var.Q;
        Paint paint2 = q2Var.M;
        h2 h2Var = q2Var.v;
        if (!this.f43656u0) {
            super.onDraw(canvas);
            if (q2Var.f43697p0.getVisibility() != 0) {
                canvas.save();
                c5.j jVar = q2Var.f43701s;
                float f10 = 1.0f;
                if (jVar != null) {
                    int width = getWidth();
                    getHeight();
                    canvas2 = canvas;
                    jVar.r(canvas2, false, false, width, 1.0f - q2Var.f43683c0);
                } else {
                    canvas2 = canvas;
                }
                if (!q2Var.S) {
                    int v02 = j6.v0(j6.f19906d6, q2Var.B);
                    paint2.setColor(v02);
                    q2Var.f43708x.setFlickerViewColor(v02);
                    org.telegram.ui.f3 f3Var = q2Var.R0;
                    if (f3Var != null) {
                        if (AndroidUtilities.computePerceivedBrightness(paint2.getColor()) <= 0.721f) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        f3Var.b(z4, false);
                        q2Var.R0.setBackgroundColor(paint2.getColor());
                    }
                }
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                canvas2.drawRect(rectF, q2Var.L);
                org.telegram.ui.ActionBar.n3 n3Var = q2Var.f43699r;
                if (n3Var != null) {
                    i10 = (int) n3Var.D;
                } else {
                    i10 = 0;
                }
                paint.setColor(q2Var.N);
                float dp = AndroidUtilities.dp(16.0f);
                if (!AndroidUtilities.isTablet()) {
                    f10 = 1.0f - q2Var.f43680b;
                }
                float f11 = dp * f10;
                rectF.set(AndroidUtilities.lerp(h2Var.getLeft(), 0, q2Var.f43683c0), AndroidUtilities.lerp(h2Var.getTranslationY(), 0.0f, q2Var.f43680b), h2Var.getRight(), h2Var.getTranslationY() + AndroidUtilities.dp(24.0f) + f11);
                canvas2.drawRoundRect(rectF, f11, f11, paint);
                rectF.set(AndroidUtilities.lerp(h2Var.getLeft(), 0, q2Var.f43683c0), h2Var.getTranslationY() + AndroidUtilities.dp(24.0f), AndroidUtilities.lerp(h2Var.getRight(), getWidth(), q2Var.f43683c0), getHeight() - i10);
                canvas2.drawRect(rectF, paint2);
                canvas2.restore();
            }
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        q2 q2Var = this.f43659x0;
        h2 h2Var = q2Var.v;
        if (motionEvent.getAction() == 0 && (motionEvent.getY() <= AndroidUtilities.lerp(h2Var.getTranslationY() + AndroidUtilities.dp(24.0f), 0.0f, q2Var.f43680b) || motionEvent.getX() > h2Var.getRight() || motionEvent.getX() < h2Var.getLeft())) {
            q2Var.k(true);
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override
    public void setDrawingFromOverlay(boolean z4) {
        if (this.f43656u0 != z4) {
            this.f43656u0 = z4;
            invalidate();
            q2 q2Var = this.f43659x0;
            q2Var.G();
            LaunchActivity launchActivity = LaunchActivity.D1;
            if (launchActivity != null && q2Var.f43679a0) {
                launchActivity.z0(q2Var.O);
            }
        }
    }

    @Override
    public final float z(Canvas canvas, RectF rectF, float f10, RectF rectF2, float f11) {
        q2 q2Var = this.f43659x0;
        h2 h2Var = q2Var.v;
        RectF rectF3 = this.f43657v0;
        rectF3.set(h2Var.getLeft(), h2Var.getTranslationY() + AndroidUtilities.dp(24.0f), h2Var.getRight(), getHeight());
        AndroidUtilities.lerpCentered(rectF3, rectF, f10, rectF2);
        canvas.save();
        Path path = this.f43658w0;
        path.rewind();
        float dp = AndroidUtilities.dp(16.0f);
        float f12 = 1.0f;
        if (!AndroidUtilities.isTablet()) {
            f12 = 1.0f - q2Var.f43680b;
        }
        float lerp = AndroidUtilities.lerp(dp * f12, AndroidUtilities.dp(18.0f), f10);
        path.addRoundRect(rectF2, lerp, lerp, Path.Direction.CW);
        canvas.clipPath(path);
        canvas.drawPaint(q2Var.M);
        if (h2Var != null) {
            canvas.save();
            canvas.translate(rectF2.left, (f10 * AndroidUtilities.dp(51.0f)) + Math.max(h2Var.getY(), rectF2.top));
            h2Var.draw(canvas);
            canvas.restore();
        }
        canvas.restore();
        return lerp;
    }
}
