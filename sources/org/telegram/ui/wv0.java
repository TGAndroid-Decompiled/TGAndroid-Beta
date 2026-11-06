package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;
public class wv0 extends org.telegram.ui.Components.l9 implements org.telegram.ui.Components.ot0 {
    public static final q0 f51516g0 = new q0("crossfadeProgress", 4);
    public boolean G;
    public float H;
    public float I;
    public int J;
    public int K;
    public int L;
    public boolean M;
    public final Path N;
    public final RectF O;
    public final Paint P;
    public boolean Q;
    public float R;
    public float S;
    public ImageReceiver T;
    public final ImageReceiver U;
    public float V;
    public org.telegram.messenger.jc W;
    public boolean f51517a0;
    public float f51518b0;
    public org.telegram.ui.Components.sf0 f51519c0;
    public boolean f51520d0;
    public float f51521e0;
    public Runnable f51522f0;

    public wv0(Context context) {
        super(context);
        this.J = 0;
        this.K = 0;
        this.L = 0;
        this.N = new Path();
        this.O = new RectF();
        this.Q = true;
        this.R = 1.0f;
        this.f51517a0 = true;
        this.f51521e0 = 1.0f;
        this.f51522f0 = null;
        setLayerType(2, null);
        this.U = new ImageReceiver(this);
        Paint paint = new Paint(1);
        this.P = paint;
        paint.setColor(-16777216);
    }

    @Override
    public final void f(Runnable runnable) {
        this.f51522f0 = runnable;
    }

    public float getForegroundAlpha() {
        return this.V;
    }

    public org.telegram.ui.Components.kg getPrevFragment() {
        return null;
    }

    public int getRoundRadiusForExpand() {
        if (!this.M) {
            return getRoundRadius()[0];
        }
        return this.K;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        org.telegram.ui.Components.sf0 sf0Var = this.f51519c0;
        if (sf0Var != null) {
            sf0Var.invalidate();
        }
        Runnable runnable = this.f51522f0;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.U.P();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.U.R();
        org.telegram.messenger.jc jcVar = this.W;
        if (jcVar != null) {
            jcVar.a();
            this.W = null;
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        boolean z9;
        org.telegram.ui.Components.kf0 kf0Var;
        float f10;
        ImageReceiver imageReceiver;
        float f11;
        boolean z10;
        float f12;
        int i7;
        float f13;
        float f14;
        float f15;
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        org.telegram.ui.Components.sf0 sf0Var = this.f51519c0;
        boolean z11 = true;
        if (sf0Var != null && sf0Var.getVisibility() == 0 && this.M && this.H > 0.0f) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9) {
            org.telegram.ui.Components.kf0 blurDrawer = this.f51519c0.getBlurDrawer();
            if (blurDrawer == null) {
                z11 = false;
            }
            boolean z12 = z11;
            kf0Var = blurDrawer;
            z9 = z12;
        } else {
            kf0Var = null;
        }
        if (this.f51520d0) {
            f10 = (int) org.telegram.messenger.g0.N(3.5f);
        } else {
            f10 = 0.0f;
        }
        float A = org.telegram.messenger.k5.A(1.0f, this.V, this.f51521e0, (1.0f - this.f51518b0) * f10);
        org.telegram.ui.Components.i5 i5Var = this.f35585e;
        if (i5Var != null) {
            imageReceiver = i5Var.f34497k;
        } else {
            imageReceiver = this.f35582a;
        }
        int i10 = this.K;
        if (i10 > 0) {
            Path path = this.N;
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
        float f17 = this.R;
        float f18 = measuredWidth;
        float f19 = measuredHeight;
        canvas.scale(f17, f17, f18 / 2.0f, f19 / 2.0f);
        if (z9) {
            if (this.G) {
                measuredHeight = Math.min(measuredHeight, measuredWidth);
            } else {
                measuredHeight = (int) (f19 - org.telegram.messenger.g0.T1(0.0f, this.L / this.I, this.H));
            }
        }
        ImageReceiver imageReceiver2 = this.T;
        if (imageReceiver2 != null) {
            float f20 = this.S;
            float f21 = (f11 - f20) * f11;
            if (f20 > 0.0f) {
                float f22 = imageReceiver2.K0;
                float f23 = imageReceiver2.L0;
                f12 = 0.0f;
                float f24 = imageReceiver2.M0;
                i7 = 0;
                float f25 = imageReceiver2.N0;
                float alpha = imageReceiver2.getAlpha();
                float f26 = A * 2.0f;
                z10 = z9;
                f15 = f21;
                this.T.y0(A, A, f18 - f26, measuredHeight - f26);
                this.T.setAlpha(f20);
                this.T.h(canvas, null);
                this.T.y0(f22, f23, f24, f25);
                this.T.setAlpha(alpha);
            } else {
                z10 = z9;
                f12 = 0.0f;
                f15 = f21;
                i7 = 0;
            }
            f13 = f15;
        } else {
            z10 = z9;
            f12 = 0.0f;
            i7 = 0;
            f13 = f11;
        }
        if (imageReceiver != null && f13 > f12 && (this.V < f11 || !this.f51517a0)) {
            float f27 = A * 2.0f;
            imageReceiver.y0(A, A, f18 - f27, measuredHeight - f27);
            float alpha2 = imageReceiver.getAlpha();
            imageReceiver.setAlpha(alpha2 * f13);
            if (this.Q) {
                int i11 = imageReceiver.W0[i7];
                if (z10) {
                    imageReceiver.J0(i7);
                }
                imageReceiver.h(canvas, null);
                if (z10) {
                    imageReceiver.J0(i11);
                }
            }
            imageReceiver.setAlpha(alpha2);
        }
        if (this.V > f12 && this.f51517a0 && f13 > f12) {
            ImageReceiver imageReceiver3 = this.U;
            if (imageReceiver3.t() != null) {
                float f28 = A * 2.0f;
                imageReceiver3.y0(A, A, f18 - f28, measuredHeight - f28);
                imageReceiver3.setAlpha(this.V * f13);
                imageReceiver3.h(canvas, null);
            } else {
                RectF rectF2 = this.O;
                float f29 = f12;
                rectF2.set(f29, f29, f18, measuredHeight);
                Paint paint = this.P;
                paint.setAlpha((int) (this.V * f13 * 255.0f));
                float f30 = imageReceiver3.W0[0];
                canvas.drawRoundRect(rectF2, f30, f30, paint);
            }
        }
        if (z10) {
            float f31 = measuredHeight;
            canvas.translate(A, A + f31);
            if (!this.G && !kf0Var.f35268a && this.f51519c0.getRealPosition() != 0) {
                f14 = f11;
            } else {
                f14 = f11 - this.H;
            }
            float f32 = A * 2.0f;
            kf0Var.e(canvas, this, f18 - f32, f31 - f32, true, f14, f13);
        }
        canvas.restore();
    }

    public void setAnimateFromImageReceiver(ImageReceiver imageReceiver) {
        this.T = imageReceiver;
    }

    public void setAvatarsViewPager(org.telegram.ui.Components.sf0 sf0Var) {
        this.f51519c0 = sf0Var;
    }

    public void setCrossfadeProgress(float f10) {
        this.S = f10;
        invalidate();
    }

    public void setForegroundAlpha(float f10) {
        this.V = f10;
        invalidate();
    }

    public void setForegroundImageDrawable(org.telegram.messenger.jc jcVar) {
        if (jcVar != null) {
            this.U.w0(jcVar.d);
        }
        org.telegram.messenger.jc jcVar2 = this.W;
        if (jcVar2 != null) {
            jcVar2.a();
            this.W = null;
        }
        this.W = jcVar;
    }

    public void setHasStories(boolean z9) {
        if (this.f51520d0 == z9) {
            return;
        }
        this.f51520d0 = z9;
        invalidate();
    }

    public void setProgressToExpand(float f10) {
        if (this.f51518b0 == f10) {
            return;
        }
        this.f51518b0 = f10;
        invalidate();
    }

    public void setProgressToStoriesInsets(float f10) {
        if (f10 == this.f51521e0) {
            return;
        }
        this.f51521e0 = f10;
        invalidate();
    }

    @Override
    public void setRoundRadius(int i7) {
        super.setRoundRadius(i7);
        this.U.J0(i7);
    }

    public void setRoundRadiusCollapse(int i7) {
        int i10 = this.J;
        this.J = i7;
        if (i10 != i7) {
            super.invalidate();
        }
    }

    public void setRoundRadiusForExpand(int i7) {
        if (!this.M) {
            setRoundRadius(i7);
            return;
        }
        this.K = i7;
        setRoundRadius(i7);
    }

    public final void v(int i7) {
        this.L = i7;
        this.M = true;
    }

    public final void w(org.telegram.messenger.hc hcVar, String str, Drawable drawable) {
        this.U.p0(hcVar, str, drawable, 0L, null, null, 0);
        org.telegram.messenger.jc jcVar = this.W;
        if (jcVar != null) {
            jcVar.a();
            this.W = null;
        }
    }

    @Override
    public final void invalidate(Rect rect) {
        super.invalidate(rect);
        Runnable runnable = this.f51522f0;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override
    public final void invalidate(int i7, int i10, int i11, int i12) {
        super.invalidate(i7, i10, i11, i12);
        Runnable runnable = this.f51522f0;
        if (runnable != null) {
            runnable.run();
        }
    }
}
