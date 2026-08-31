package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
public class vz0 extends org.telegram.ui.Components.p9 implements org.telegram.ui.Components.nv0 {
    public static final u0 f42323d0 = new u0("crossfadeProgress", 3);
    public boolean D;
    public float E;
    public float F;
    public int G;
    public int H;
    public int I;
    public boolean J;
    public final Path K;
    public final RectF L;
    public final Paint M;
    public boolean N;
    public float O;
    public float P;
    public ImageReceiver Q;
    public final ImageReceiver R;
    public float S;
    public ImageReceiver.BitmapHolder T;
    public boolean U;
    public float V;
    public org.telegram.ui.Components.xh0 W;
    public boolean f42324a0;
    public float f42325b0;
    public Runnable f42326c0;

    public vz0(Context context) {
        super(context);
        this.G = 0;
        this.H = 0;
        this.I = 0;
        this.K = new Path();
        this.L = new RectF();
        this.N = true;
        this.O = 1.0f;
        this.U = true;
        this.f42325b0 = 1.0f;
        this.f42326c0 = null;
        setLayerType(2, null);
        this.R = new ImageReceiver(this);
        Paint paint = new Paint(1);
        this.M = paint;
        paint.setColor(-16777216);
    }

    @Override
    public final void g(Runnable runnable) {
        this.f42326c0 = runnable;
    }

    public float getForegroundAlpha() {
        return this.S;
    }

    public org.telegram.ui.Components.rg getPrevFragment() {
        return null;
    }

    public int getRoundRadiusForExpand() {
        if (!this.J) {
            return getRoundRadius()[0];
        }
        return this.H;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        org.telegram.ui.Components.xh0 xh0Var = this.W;
        if (xh0Var != null) {
            xh0Var.invalidate();
        }
        Runnable runnable = this.f42326c0;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.R.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.R.onDetachedFromWindow();
        ImageReceiver.BitmapHolder bitmapHolder = this.T;
        if (bitmapHolder != null) {
            bitmapHolder.release();
            this.T = null;
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        boolean z4;
        org.telegram.ui.Components.oh0 oh0Var;
        float f10;
        ImageReceiver imageReceiver;
        boolean z10;
        float f11;
        float f12;
        char c3;
        float f13;
        float f14;
        float f15;
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        org.telegram.ui.Components.xh0 xh0Var = this.W;
        boolean z11 = true;
        if (xh0Var != null && xh0Var.getVisibility() == 0 && this.J && this.E > 0.0f) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            org.telegram.ui.Components.oh0 blurDrawer = this.W.getBlurDrawer();
            if (blurDrawer == null) {
                z11 = false;
            }
            boolean z12 = z11;
            oh0Var = blurDrawer;
            z4 = z12;
        } else {
            oh0Var = null;
        }
        if (this.f42324a0) {
            f10 = (int) AndroidUtilities.dpf2(3.5f);
        } else {
            f10 = 0.0f;
        }
        float y10 = org.telegram.messenger.y3.y(1.0f, this.S, this.f42325b0, (1.0f - this.V) * f10);
        org.telegram.ui.Components.l5 l5Var = this.f30001e;
        if (l5Var != null) {
            imageReceiver = l5Var.f28604k;
        } else {
            imageReceiver = this.f29998a;
        }
        int i10 = this.H;
        if (i10 > 0) {
            Path path = this.K;
            path.rewind();
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(y10, y10, measuredWidth - y10, measuredHeight - y10);
            float f16 = i10;
            path.addRoundRect(rectF, f16, f16, Path.Direction.CW);
            canvas.clipPath(path);
        }
        canvas.save();
        float f17 = this.O;
        float f18 = measuredWidth;
        float f19 = measuredHeight;
        canvas.scale(f17, f17, f18 / 2.0f, f19 / 2.0f);
        if (z4) {
            if (this.D) {
                measuredHeight = Math.min(measuredHeight, measuredWidth);
            } else {
                measuredHeight = (int) (f19 - AndroidUtilities.lerp(0.0f, this.I / this.F, this.E));
            }
        }
        ImageReceiver imageReceiver2 = this.Q;
        if (imageReceiver2 != null) {
            float f20 = this.P;
            float f21 = (1.0f - f20) * 1.0f;
            if (f20 > 0.0f) {
                float imageX = imageReceiver2.getImageX();
                float imageY = this.Q.getImageY();
                float imageWidth = this.Q.getImageWidth();
                f11 = 2.0f;
                float imageHeight = this.Q.getImageHeight();
                f12 = 0.0f;
                float alpha = this.Q.getAlpha();
                c3 = 0;
                float f22 = y10 * 2.0f;
                z10 = z4;
                f15 = f21;
                this.Q.setImageCoords(y10, y10, f18 - f22, measuredHeight - f22);
                this.Q.setAlpha(f20);
                this.Q.draw(canvas);
                this.Q.setImageCoords(imageX, imageY, imageWidth, imageHeight);
                this.Q.setAlpha(alpha);
            } else {
                z10 = z4;
                f15 = f21;
                f11 = 2.0f;
                f12 = 0.0f;
                c3 = 0;
            }
            f13 = f15;
        } else {
            z10 = z4;
            f11 = 2.0f;
            f12 = 0.0f;
            c3 = 0;
            f13 = 1.0f;
        }
        if (imageReceiver != null && f13 > f12 && (this.S < 1.0f || !this.U)) {
            float f23 = y10 * f11;
            imageReceiver.setImageCoords(y10, y10, f18 - f23, measuredHeight - f23);
            float alpha2 = imageReceiver.getAlpha();
            imageReceiver.setAlpha(alpha2 * f13);
            if (this.N) {
                int i11 = imageReceiver.getRoundRadius()[c3];
                if (z10) {
                    imageReceiver.setRoundRadius(0);
                }
                imageReceiver.draw(canvas);
                if (z10) {
                    imageReceiver.setRoundRadius(i11);
                }
            }
            imageReceiver.setAlpha(alpha2);
        }
        if (this.S > f12 && this.U && f13 > f12) {
            ImageReceiver imageReceiver3 = this.R;
            if (imageReceiver3.getDrawable() != null) {
                float f24 = y10 * f11;
                imageReceiver3.setImageCoords(y10, y10, f18 - f24, measuredHeight - f24);
                imageReceiver3.setAlpha(this.S * f13);
                imageReceiver3.draw(canvas);
            } else {
                RectF rectF2 = this.L;
                rectF2.set(0.0f, 0.0f, f18, measuredHeight);
                Paint paint = this.M;
                paint.setAlpha((int) (this.S * f13 * 255.0f));
                float f25 = imageReceiver3.getRoundRadius()[0];
                canvas.drawRoundRect(rectF2, f25, f25, paint);
            }
        }
        if (z10) {
            float f26 = measuredHeight;
            canvas.translate(y10, y10 + f26);
            if (!this.D && !oh0Var.f29760a && this.W.getRealPosition() != 0) {
                f14 = 1.0f;
            } else {
                f14 = 1.0f - this.E;
            }
            float f27 = y10 * f11;
            oh0Var.f(canvas, this, f18 - f27, f26 - f27, true, f14, f13);
        }
        canvas.restore();
    }

    public void setAnimateFromImageReceiver(ImageReceiver imageReceiver) {
        this.Q = imageReceiver;
    }

    public void setAvatarsViewPager(org.telegram.ui.Components.xh0 xh0Var) {
        this.W = xh0Var;
    }

    public void setCrossfadeProgress(float f10) {
        this.P = f10;
        invalidate();
    }

    public void setForegroundAlpha(float f10) {
        this.S = f10;
        invalidate();
    }

    public void setForegroundImageDrawable(ImageReceiver.BitmapHolder bitmapHolder) {
        if (bitmapHolder != null) {
            this.R.setImageBitmap(bitmapHolder.drawable);
        }
        ImageReceiver.BitmapHolder bitmapHolder2 = this.T;
        if (bitmapHolder2 != null) {
            bitmapHolder2.release();
            this.T = null;
        }
        this.T = bitmapHolder;
    }

    public void setHasStories(boolean z4) {
        if (this.f42324a0 == z4) {
            return;
        }
        this.f42324a0 = z4;
        invalidate();
    }

    public void setProgressToExpand(float f10) {
        if (this.V == f10) {
            return;
        }
        this.V = f10;
        invalidate();
    }

    public void setProgressToStoriesInsets(float f10) {
        if (f10 == this.f42325b0) {
            return;
        }
        this.f42325b0 = f10;
        invalidate();
    }

    @Override
    public void setRoundRadius(int i10) {
        super.setRoundRadius(i10);
        this.R.setRoundRadius(i10);
    }

    public void setRoundRadiusCollapse(int i10) {
        int i11 = this.G;
        this.G = i10;
        if (i11 != i10) {
            super.invalidate();
        }
    }

    public void setRoundRadiusForExpand(int i10) {
        if (!this.J) {
            setRoundRadius(i10);
            return;
        }
        this.H = i10;
        setRoundRadius(i10);
    }

    public final void t(int i10) {
        this.I = i10;
        this.J = true;
    }

    public final void u(ImageLocation imageLocation, String str, Drawable drawable) {
        this.R.setImage(imageLocation, str, drawable, 0L, (String) null, (Object) null, 0);
        ImageReceiver.BitmapHolder bitmapHolder = this.T;
        if (bitmapHolder != null) {
            bitmapHolder.release();
            this.T = null;
        }
    }

    @Override
    public final void invalidate(Rect rect) {
        super.invalidate(rect);
        Runnable runnable = this.f42326c0;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override
    public final void invalidate(int i10, int i11, int i12, int i13) {
        super.invalidate(i10, i11, i12, i13);
        Runnable runnable = this.f42326c0;
        if (runnable != null) {
            runnable.run();
        }
    }
}
