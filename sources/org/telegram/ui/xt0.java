package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
public abstract class xt0 {
    public final View f44593i;
    public boolean f44600p;
    public final org.telegram.ui.Components.fq f44601q;
    public final org.telegram.ui.Components.qf0 f44602r;
    public final PhotoViewer f44603s;
    public long f44587a = 0;
    public float f44588b = 0.0f;
    public float f44589c = 0.0f;
    public float d = 0.0f;
    public long f44590e = 0;
    public float f44591f = 0.0f;
    public final RectF f44592g = new RectF();
    public int h = -1;
    public final int f44594j = AndroidUtilities.dp(64.0f);
    public int f44595k = -2;
    public float f44596l = 1.0f;
    public final float[] f44597m = new float[3];
    public final float[] f44598n = new float[3];
    public float f44599o = 1.0f;

    public xt0(PhotoViewer photoViewer, View view) {
        this.f44603s = photoViewer;
        if (PhotoViewer.S8 == null) {
            PhotoViewer.S8 = new DecelerateInterpolator(1.5f);
            Paint paint = new Paint(1);
            PhotoViewer.T8 = paint;
            paint.setStyle(Paint.Style.STROKE);
            PhotoViewer.T8.setStrokeCap(Paint.Cap.ROUND);
            PhotoViewer.T8.setStrokeWidth(AndroidUtilities.dp(3.0f));
            PhotoViewer.T8.setColor(-1);
        }
        this.f44593i = view;
        int i9 = 0;
        while (true) {
            float[] fArr = this.f44598n;
            if (i9 < fArr.length) {
                this.f44597m[i9] = 1.0f;
                fArr[i9] = 1.0f;
                i9++;
            } else {
                a();
                org.telegram.ui.Components.qf0 qf0Var = new org.telegram.ui.Components.qf0(28);
                this.f44602r = qf0Var;
                qf0Var.h = 200;
                this.f44601q = new org.telegram.ui.Components.fq(photoViewer.f35797y.getDrawable(R.drawable.circle_big).mutate(), qf0Var);
                return;
            }
        }
    }

    public final void a() {
        boolean z10;
        int i9 = 0;
        while (true) {
            float[] fArr = this.f44598n;
            if (i9 < fArr.length) {
                if (fArr[i9] != 1.0f) {
                    z10 = false;
                    break;
                }
                i9++;
            } else {
                z10 = true;
                break;
            }
        }
        if (z10 != this.f44600p) {
            this.f44600p = z10;
            ur0 ur0Var = (ur0) this;
            PhotoViewer photoViewer = ur0Var.f43304t;
            if (ur0Var == photoViewer.S0[0]) {
                photoViewer.r3();
            }
        }
    }

    public final int b() {
        int i9;
        int i10 = AndroidUtilities.displaySize.y;
        PhotoViewer photoViewer = this.f44603s;
        if (!photoViewer.f35742s) {
            i9 = AndroidUtilities.statusBarHeight;
        } else {
            i9 = 0;
        }
        photoViewer.getClass();
        int i11 = (int) ((((i10 + i9) - ((int) (this.f44594j * this.f44599o))) / 2) + 0.0f);
        if (photoViewer.Y1 == 1) {
            return i11 - AndroidUtilities.dp(38.0f);
        }
        return i11;
    }

    public final void c(Canvas canvas) {
        int i9;
        Drawable drawable;
        float f10 = this.f44594j;
        int i10 = (int) (this.f44599o * f10);
        int width = (this.f44603s.f35580a0.getWidth() - ((int) (f10 * this.f44599o))) / 2;
        int b10 = b();
        int i11 = 0;
        float f11 = 1.0f;
        while (true) {
            float[] fArr = this.f44597m;
            if (i11 >= fArr.length) {
                break;
            }
            if (i11 == 2) {
                f11 = AndroidUtilities.accelerateInterpolator.getInterpolation(fArr[i11]) * f11;
            } else {
                f11 *= fArr[i11];
            }
            i11++;
        }
        int i12 = this.f44595k;
        Drawable drawable2 = this.f44601q;
        if (i12 >= 0) {
            Drawable[] drawableArr = PhotoViewer.P8;
            if (i12 < drawableArr.length + 2) {
                if (i12 < drawableArr.length) {
                    drawable = drawableArr[i12];
                } else {
                    drawable = drawable2;
                }
                if (drawable != null) {
                    drawable.setAlpha((int) (this.f44596l * 255.0f * f11));
                    drawable.setBounds(width, b10, width + i10, b10 + i10);
                    drawable.draw(canvas);
                }
            }
        }
        int i13 = this.h;
        if (i13 >= 0) {
            Drawable[] drawableArr2 = PhotoViewer.P8;
            if (i13 < drawableArr2.length + 2) {
                if (i13 < drawableArr2.length) {
                    drawable2 = drawableArr2[i13];
                }
                if (drawable2 != null) {
                    if (this.f44595k != -2) {
                        drawable2.setAlpha((int) org.telegram.messenger.l0.y(1.0f, this.f44596l, 255.0f, f11));
                    } else {
                        drawable2.setAlpha((int) (f11 * 255.0f));
                    }
                    drawable2.setBounds(width, b10, width + i10, b10 + i10);
                    drawable2.draw(canvas);
                }
            }
        }
        int i14 = this.h;
        if (i14 != 0 && i14 != 1 && (i9 = this.f44595k) != 0 && i9 != 1) {
            g(false);
            return;
        }
        int dp = AndroidUtilities.dp(4.0f);
        if (this.f44595k != -2) {
            PhotoViewer.T8.setAlpha((int) (this.f44596l * 255.0f * f11));
        } else {
            PhotoViewer.T8.setAlpha((int) (f11 * 255.0f));
        }
        RectF rectF = this.f44592g;
        rectF.set(width + dp, b10 + dp, (width + i10) - dp, (b10 + i10) - dp);
        canvas.drawArc(rectF, this.f44588b - 90.0f, Math.max(4.0f, this.f44591f * 360.0f), false, PhotoViewer.T8);
        g(true);
    }

    public final void d(int i9, boolean z10, boolean z11) {
        int i10;
        boolean z12;
        int i11 = this.h;
        if (i11 == i9) {
            return;
        }
        View view = this.f44593i;
        org.telegram.ui.Components.qf0 qf0Var = this.f44602r;
        if (qf0Var != null) {
            if (z11 && (i11 == 3 || i11 == 4)) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (i9 == 3) {
                qf0Var.a(false, z12);
            } else if (i9 == 4) {
                qf0Var.a(true, z12);
            }
            qf0Var.f31935f = view;
            qf0Var.invalidateSelf();
        }
        this.f44587a = System.currentTimeMillis();
        if (z10 && (i10 = this.h) != i9) {
            this.f44595k = i10;
            this.f44596l = 1.0f;
        } else {
            this.f44595k = -2;
        }
        this.h = i9;
        ur0 ur0Var = (ur0) this;
        PhotoViewer photoViewer = ur0Var.f43304t;
        if (ur0Var == photoViewer.S0[0]) {
            photoViewer.r3();
        }
        view.invalidate();
    }

    public final void e(int i9, float f10, boolean z10) {
        float[] fArr = this.f44598n;
        if (fArr[i9] != f10) {
            fArr[i9] = f10;
            if (!z10) {
                this.f44597m[i9] = f10;
            }
            a();
            this.f44593i.invalidate();
        }
    }

    public final void f(float f10, boolean z10) {
        if (!z10) {
            this.f44591f = f10;
            this.d = f10;
        } else {
            this.d = this.f44591f;
        }
        this.f44589c = f10;
        this.f44590e = 0L;
        this.f44593i.invalidate();
    }

    public final void g(boolean z10) {
        boolean z11;
        long currentTimeMillis = System.currentTimeMillis();
        long j10 = currentTimeMillis - this.f44587a;
        if (j10 > 18) {
            j10 = 18;
        }
        this.f44587a = currentTimeMillis;
        int i9 = 0;
        if (z10) {
            if (this.f44591f == 1.0f && this.f44589c == 1.0f) {
                z11 = false;
            } else {
                this.f44588b = (((float) (360 * j10)) / 3000.0f) + this.f44588b;
                float f10 = this.f44589c - this.d;
                if (Math.abs(f10) > 0.0f) {
                    long j11 = this.f44590e + j10;
                    this.f44590e = j11;
                    if (j11 >= 300) {
                        float f11 = this.f44589c;
                        this.f44591f = f11;
                        this.d = f11;
                        this.f44590e = 0L;
                    } else {
                        this.f44591f = (PhotoViewer.S8.getInterpolation(((float) j11) / 300.0f) * f10) + this.d;
                    }
                }
                z11 = true;
            }
            float f12 = this.f44596l;
            if (f12 > 0.0f && this.f44595k != -2) {
                float f13 = f12 - (((float) j10) / 200.0f);
                this.f44596l = f13;
                if (f13 <= 0.0f) {
                    this.f44596l = 0.0f;
                    this.f44595k = -2;
                }
                z11 = true;
            }
        } else {
            z11 = false;
        }
        while (true) {
            float[] fArr = this.f44598n;
            if (i9 >= fArr.length) {
                break;
            }
            float f14 = fArr[i9];
            float[] fArr2 = this.f44597m;
            float f15 = fArr2[i9];
            if (f14 > f15) {
                fArr2[i9] = Math.min(1.0f, (((float) j10) / 200.0f) + f15);
            } else if (f14 < f15) {
                fArr2[i9] = Math.max(0.0f, f15 - (((float) j10) / 200.0f));
            } else {
                i9++;
            }
            z11 = true;
            i9++;
        }
        if (z11) {
            this.f44593i.postInvalidateOnAnimation();
        }
    }
}
