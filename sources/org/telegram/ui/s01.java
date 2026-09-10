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
public class s01 extends org.telegram.ui.Components.w9 implements org.telegram.ui.Components.xv0 {
    public static final t0 f36500g0 = new t0("crossfadeProgress", 3);
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
    public ImageReceiver.BitmapHolder W;
    public boolean f36501a0;
    public float f36502b0;
    public org.telegram.ui.Components.yh0 f36503c0;
    public boolean f36504d0;
    public float f36505e0;
    public Runnable f36506f0;

    public s01(Context context) {
        super(context);
        this.J = 0;
        this.K = 0;
        this.L = 0;
        this.N = new Path();
        this.O = new RectF();
        this.Q = true;
        this.R = 1.0f;
        this.f36501a0 = true;
        this.f36505e0 = 1.0f;
        this.f36506f0 = null;
        setLayerType(2, null);
        this.U = new ImageReceiver(this);
        Paint paint = new Paint(1);
        this.P = paint;
        paint.setColor(-16777216);
    }

    @Override
    public final void g(Runnable runnable) {
        this.f36506f0 = runnable;
    }

    public float getForegroundAlpha() {
        return this.V;
    }

    public org.telegram.ui.Components.eh getPrevFragment() {
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
        org.telegram.ui.Components.yh0 yh0Var = this.f36503c0;
        if (yh0Var != null) {
            yh0Var.invalidate();
        }
        Runnable runnable = this.f36506f0;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.U.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.U.onDetachedFromWindow();
        ImageReceiver.BitmapHolder bitmapHolder = this.W;
        if (bitmapHolder != null) {
            bitmapHolder.release();
            this.W = null;
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        boolean z10;
        org.telegram.ui.Components.ph0 ph0Var;
        float f7;
        ImageReceiver imageReceiver;
        boolean z11;
        float f10;
        float f11;
        char c10;
        float f12;
        float f13;
        float f14;
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        org.telegram.ui.Components.yh0 yh0Var = this.f36503c0;
        boolean z12 = true;
        if (yh0Var != null && yh0Var.getVisibility() == 0 && this.M && this.H > 0.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            org.telegram.ui.Components.ph0 blurDrawer = this.f36503c0.getBlurDrawer();
            if (blurDrawer == null) {
                z12 = false;
            }
            boolean z13 = z12;
            ph0Var = blurDrawer;
            z10 = z13;
        } else {
            ph0Var = null;
        }
        if (this.f36504d0) {
            f7 = (int) AndroidUtilities.dpf2(3.5f);
        } else {
            f7 = 0.0f;
        }
        float A = org.telegram.messenger.a2.A(1.0f, this.V, this.f36505e0, (1.0f - this.f36502b0) * f7);
        org.telegram.ui.Components.p5 p5Var = this.e;
        if (p5Var != null) {
            imageReceiver = p5Var.f26033k;
        } else {
            imageReceiver = this.f28728a;
        }
        int i10 = this.K;
        if (i10 > 0) {
            Path path = this.N;
            path.rewind();
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(A, A, measuredWidth - A, measuredHeight - A);
            float f15 = i10;
            path.addRoundRect(rectF, f15, f15, Path.Direction.CW);
            canvas.clipPath(path);
        }
        canvas.save();
        float f16 = this.R;
        float f17 = measuredWidth;
        float f18 = measuredHeight;
        canvas.scale(f16, f16, f17 / 2.0f, f18 / 2.0f);
        if (z10) {
            if (this.G) {
                measuredHeight = Math.min(measuredHeight, measuredWidth);
            } else {
                measuredHeight = (int) (f18 - AndroidUtilities.lerp(0.0f, this.L / this.I, this.H));
            }
        }
        ImageReceiver imageReceiver2 = this.T;
        if (imageReceiver2 != null) {
            float f19 = this.S;
            float f20 = (1.0f - f19) * 1.0f;
            if (f19 > 0.0f) {
                float imageX = imageReceiver2.getImageX();
                float imageY = this.T.getImageY();
                float imageWidth = this.T.getImageWidth();
                f10 = 2.0f;
                float imageHeight = this.T.getImageHeight();
                f11 = 0.0f;
                float alpha = this.T.getAlpha();
                c10 = 0;
                float f21 = A * 2.0f;
                z11 = z10;
                f14 = f20;
                this.T.setImageCoords(A, A, f17 - f21, measuredHeight - f21);
                this.T.setAlpha(f19);
                this.T.draw(canvas);
                this.T.setImageCoords(imageX, imageY, imageWidth, imageHeight);
                this.T.setAlpha(alpha);
            } else {
                z11 = z10;
                f14 = f20;
                f10 = 2.0f;
                f11 = 0.0f;
                c10 = 0;
            }
            f12 = f14;
        } else {
            z11 = z10;
            f10 = 2.0f;
            f11 = 0.0f;
            c10 = 0;
            f12 = 1.0f;
        }
        if (imageReceiver != null && f12 > f11 && (this.V < 1.0f || !this.f36501a0)) {
            float f22 = A * f10;
            imageReceiver.setImageCoords(A, A, f17 - f22, measuredHeight - f22);
            float alpha2 = imageReceiver.getAlpha();
            imageReceiver.setAlpha(alpha2 * f12);
            if (this.Q) {
                int i11 = imageReceiver.getRoundRadius()[c10];
                if (z11) {
                    imageReceiver.setRoundRadius(0);
                }
                imageReceiver.draw(canvas);
                if (z11) {
                    imageReceiver.setRoundRadius(i11);
                }
            }
            imageReceiver.setAlpha(alpha2);
        }
        if (this.V > f11 && this.f36501a0 && f12 > f11) {
            ImageReceiver imageReceiver3 = this.U;
            if (imageReceiver3.getDrawable() != null) {
                float f23 = A * f10;
                imageReceiver3.setImageCoords(A, A, f17 - f23, measuredHeight - f23);
                imageReceiver3.setAlpha(this.V * f12);
                imageReceiver3.draw(canvas);
            } else {
                RectF rectF2 = this.O;
                rectF2.set(0.0f, 0.0f, f17, measuredHeight);
                Paint paint = this.P;
                paint.setAlpha((int) (this.V * f12 * 255.0f));
                float f24 = imageReceiver3.getRoundRadius()[0];
                canvas.drawRoundRect(rectF2, f24, f24, paint);
            }
        }
        if (z11) {
            float f25 = measuredHeight;
            canvas.translate(A, A + f25);
            if (!this.G && !ph0Var.f26125a && this.f36503c0.getRealPosition() != 0) {
                f13 = 1.0f;
            } else {
                f13 = 1.0f - this.H;
            }
            float f26 = A * f10;
            ph0Var.f(canvas, this, f17 - f26, f25 - f26, true, f13, f12);
        }
        canvas.restore();
    }

    public void setAnimateFromImageReceiver(ImageReceiver imageReceiver) {
        this.T = imageReceiver;
    }

    public void setAvatarsViewPager(org.telegram.ui.Components.yh0 yh0Var) {
        this.f36503c0 = yh0Var;
    }

    public void setCrossfadeProgress(float f7) {
        this.S = f7;
        invalidate();
    }

    public void setForegroundAlpha(float f7) {
        this.V = f7;
        invalidate();
    }

    public void setForegroundImageDrawable(ImageReceiver.BitmapHolder bitmapHolder) {
        if (bitmapHolder != null) {
            this.U.setImageBitmap(bitmapHolder.drawable);
        }
        ImageReceiver.BitmapHolder bitmapHolder2 = this.W;
        if (bitmapHolder2 != null) {
            bitmapHolder2.release();
            this.W = null;
        }
        this.W = bitmapHolder;
    }

    public void setHasStories(boolean z10) {
        if (this.f36504d0 == z10) {
            return;
        }
        this.f36504d0 = z10;
        invalidate();
    }

    public void setProgressToExpand(float f7) {
        if (this.f36502b0 == f7) {
            return;
        }
        this.f36502b0 = f7;
        invalidate();
    }

    public void setProgressToStoriesInsets(float f7) {
        if (f7 == this.f36505e0) {
            return;
        }
        this.f36505e0 = f7;
        invalidate();
    }

    @Override
    public void setRoundRadius(int i10) {
        super.setRoundRadius(i10);
        this.U.setRoundRadius(i10);
    }

    public void setRoundRadiusCollapse(int i10) {
        int i11 = this.J;
        this.J = i10;
        if (i11 != i10) {
            super.invalidate();
        }
    }

    public void setRoundRadiusForExpand(int i10) {
        if (!this.M) {
            setRoundRadius(i10);
            return;
        }
        this.K = i10;
        setRoundRadius(i10);
    }

    public final void t(int i10) {
        this.L = i10;
        this.M = true;
    }

    public final void u(ImageLocation imageLocation, String str, Drawable drawable) {
        this.U.setImage(imageLocation, str, drawable, 0L, (String) null, (Object) null, 0);
        ImageReceiver.BitmapHolder bitmapHolder = this.W;
        if (bitmapHolder != null) {
            bitmapHolder.release();
            this.W = null;
        }
    }

    @Override
    public final void invalidate(Rect rect) {
        super.invalidate(rect);
        Runnable runnable = this.f36506f0;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override
    public final void invalidate(int i10, int i11, int i12, int i13) {
        super.invalidate(i10, i11, i12, i13);
        Runnable runnable = this.f36506f0;
        if (runnable != null) {
            runnable.run();
        }
    }
}
