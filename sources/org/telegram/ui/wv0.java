package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;
public class wv0 extends org.telegram.ui.Components.q9 implements org.telegram.ui.Components.au0 {
    public static final q0 f53535h0 = new q0("crossfadeProgress", 4);
    public boolean H;
    public float I;
    public float J;
    public int K;
    public int L;
    public int M;
    public boolean N;
    public final Path O;
    public final RectF P;
    public final Paint Q;
    public boolean R;
    public float S;
    public float T;
    public ImageReceiver U;
    public final ImageReceiver V;
    public float W;
    public org.telegram.messenger.ic f53536a0;
    public boolean f53537b0;
    public float f53538c0;
    public org.telegram.ui.Components.hg0 f53539d0;
    public boolean f53540e0;
    public float f53541f0;
    public Runnable f53542g0;

    public wv0(Context context) {
        super(context);
        this.K = 0;
        this.L = 0;
        this.M = 0;
        this.O = new Path();
        this.P = new RectF();
        this.R = true;
        this.S = 1.0f;
        this.f53537b0 = true;
        this.f53541f0 = 1.0f;
        this.f53542g0 = null;
        setLayerType(2, null);
        this.V = new ImageReceiver(this);
        Paint paint = new Paint(1);
        this.Q = paint;
        paint.setColor(-16777216);
    }

    @Override
    public final void e(Runnable runnable) {
        this.f53542g0 = runnable;
    }

    public float getForegroundAlpha() {
        return this.W;
    }

    public org.telegram.ui.Components.bh getPrevFragment() {
        return null;
    }

    public int getRoundRadiusForExpand() {
        if (!this.N) {
            return getRoundRadius()[0];
        }
        return this.L;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        org.telegram.ui.Components.hg0 hg0Var = this.f53539d0;
        if (hg0Var != null) {
            hg0Var.invalidate();
        }
        Runnable runnable = this.f53542g0;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.V.P();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.V.R();
        org.telegram.messenger.ic icVar = this.f53536a0;
        if (icVar != null) {
            icVar.a();
            this.f53536a0 = null;
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        boolean z10;
        org.telegram.ui.Components.zf0 zf0Var;
        float f10;
        ImageReceiver imageReceiver;
        float f11;
        boolean z11;
        float f12;
        int i7;
        float f13;
        float f14;
        float f15;
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        org.telegram.ui.Components.hg0 hg0Var = this.f53539d0;
        boolean z12 = true;
        if (hg0Var != null && hg0Var.getVisibility() == 0 && this.N && this.I > 0.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            org.telegram.ui.Components.zf0 blurDrawer = this.f53539d0.getBlurDrawer();
            if (blurDrawer == null) {
                z12 = false;
            }
            boolean z13 = z12;
            zf0Var = blurDrawer;
            z10 = z13;
        } else {
            zf0Var = null;
        }
        if (this.f53540e0) {
            f10 = (int) org.telegram.messenger.g0.N(3.5f);
        } else {
            f10 = 0.0f;
        }
        float A = org.telegram.messenger.f3.A(1.0f, this.W, this.f53541f0, (1.0f - this.f53538c0) * f10);
        org.telegram.ui.Components.p5 p5Var = this.f38839e;
        if (p5Var != null) {
            imageReceiver = p5Var.f38500k;
        } else {
            imageReceiver = this.f38836a;
        }
        int i10 = this.L;
        if (i10 > 0) {
            Path path = this.O;
            path.rewind();
            RectF rectF = org.telegram.messenger.g0.P;
            f11 = 1.0f;
            rectF.set(A, A, measuredWidth - A, measuredHeight - A);
            float f16 = i10;
            path.addRoundRect(rectF, f16, f16, Path.Direction.CW);
            canvas.clipPath(path);
        } else {
            f11 = 1.0f;
        }
        canvas.save();
        float f17 = this.S;
        float f18 = measuredWidth;
        float f19 = measuredHeight;
        canvas.scale(f17, f17, f18 / 2.0f, f19 / 2.0f);
        if (z10) {
            if (this.H) {
                measuredHeight = Math.min(measuredHeight, measuredWidth);
            } else {
                measuredHeight = (int) (f19 - org.telegram.messenger.g0.T1(0.0f, this.M / this.J, this.I));
            }
        }
        ImageReceiver imageReceiver2 = this.U;
        if (imageReceiver2 != null) {
            float f20 = this.T;
            float f21 = (f11 - f20) * f11;
            if (f20 > 0.0f) {
                float f22 = imageReceiver2.L0;
                float f23 = imageReceiver2.M0;
                f12 = 0.0f;
                float f24 = imageReceiver2.N0;
                i7 = 0;
                float f25 = imageReceiver2.O0;
                float alpha = imageReceiver2.getAlpha();
                float f26 = A * 2.0f;
                z11 = z10;
                f15 = f21;
                this.U.y0(A, A, f18 - f26, measuredHeight - f26);
                this.U.setAlpha(f20);
                this.U.h(canvas, null);
                this.U.y0(f22, f23, f24, f25);
                this.U.setAlpha(alpha);
            } else {
                z11 = z10;
                f12 = 0.0f;
                f15 = f21;
                i7 = 0;
            }
            f13 = f15;
        } else {
            z11 = z10;
            f12 = 0.0f;
            i7 = 0;
            f13 = f11;
        }
        if (imageReceiver != null && f13 > f12 && (this.W < f11 || !this.f53537b0)) {
            float f27 = A * 2.0f;
            imageReceiver.y0(A, A, f18 - f27, measuredHeight - f27);
            float alpha2 = imageReceiver.getAlpha();
            imageReceiver.setAlpha(alpha2 * f13);
            if (this.R) {
                int i11 = imageReceiver.X0[i7];
                if (z11) {
                    imageReceiver.J0(i7);
                }
                imageReceiver.h(canvas, null);
                if (z11) {
                    imageReceiver.J0(i11);
                }
            }
            imageReceiver.setAlpha(alpha2);
        }
        if (this.W > f12 && this.f53537b0 && f13 > f12) {
            ImageReceiver imageReceiver3 = this.V;
            if (imageReceiver3.t() != null) {
                float f28 = A * 2.0f;
                imageReceiver3.y0(A, A, f18 - f28, measuredHeight - f28);
                imageReceiver3.setAlpha(this.W * f13);
                imageReceiver3.h(canvas, null);
            } else {
                RectF rectF2 = this.P;
                float f29 = f12;
                rectF2.set(f29, f29, f18, measuredHeight);
                Paint paint = this.Q;
                paint.setAlpha((int) (this.W * f13 * 255.0f));
                float f30 = imageReceiver3.X0[0];
                canvas.drawRoundRect(rectF2, f30, f30, paint);
            }
        }
        if (z11) {
            float f31 = measuredHeight;
            canvas.translate(A, A + f31);
            if (!this.H && !zf0Var.f42796a && this.f53539d0.getRealPosition() != 0) {
                f14 = f11;
            } else {
                f14 = f11 - this.I;
            }
            float f32 = A * 2.0f;
            zf0Var.e(canvas, this, f18 - f32, f31 - f32, true, f14, f13);
        }
        canvas.restore();
    }

    public void setAnimateFromImageReceiver(ImageReceiver imageReceiver) {
        this.U = imageReceiver;
    }

    public void setAvatarsViewPager(org.telegram.ui.Components.hg0 hg0Var) {
        this.f53539d0 = hg0Var;
    }

    public void setCrossfadeProgress(float f10) {
        this.T = f10;
        invalidate();
    }

    public void setForegroundAlpha(float f10) {
        this.W = f10;
        invalidate();
    }

    public void setForegroundImageDrawable(org.telegram.messenger.ic icVar) {
        if (icVar != null) {
            this.V.w0(icVar.d);
        }
        org.telegram.messenger.ic icVar2 = this.f53536a0;
        if (icVar2 != null) {
            icVar2.a();
            this.f53536a0 = null;
        }
        this.f53536a0 = icVar;
    }

    public void setHasStories(boolean z10) {
        if (this.f53540e0 == z10) {
            return;
        }
        this.f53540e0 = z10;
        invalidate();
    }

    public void setProgressToExpand(float f10) {
        if (this.f53538c0 == f10) {
            return;
        }
        this.f53538c0 = f10;
        invalidate();
    }

    public void setProgressToStoriesInsets(float f10) {
        if (f10 == this.f53541f0) {
            return;
        }
        this.f53541f0 = f10;
        invalidate();
    }

    @Override
    public void setRoundRadius(int i7) {
        super.setRoundRadius(i7);
        this.V.J0(i7);
    }

    public void setRoundRadiusCollapse(int i7) {
        int i10 = this.K;
        this.K = i7;
        if (i10 != i7) {
            super.invalidate();
        }
    }

    public void setRoundRadiusForExpand(int i7) {
        if (!this.N) {
            setRoundRadius(i7);
            return;
        }
        this.L = i7;
        setRoundRadius(i7);
    }

    public final void v(int i7) {
        this.M = i7;
        this.N = true;
    }

    public final void w(org.telegram.messenger.gc gcVar, String str, Drawable drawable) {
        this.V.p0(gcVar, str, drawable, 0L, null, null, 0);
        org.telegram.messenger.ic icVar = this.f53536a0;
        if (icVar != null) {
            icVar.a();
            this.f53536a0 = null;
        }
    }

    @Override
    public final void invalidate(Rect rect) {
        super.invalidate(rect);
        Runnable runnable = this.f53542g0;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override
    public final void invalidate(int i7, int i10, int i11, int i12) {
        super.invalidate(i7, i10, i11, i12);
        Runnable runnable = this.f53542g0;
        if (runnable != null) {
            runnable.run();
        }
    }
}
