package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;

public abstract class yt0 {

    public final View f44904i;

    public boolean f44911p;

    public final org.telegram.ui.Components.dq f44912q;

    public final org.telegram.ui.Components.tf0 f44913r;

    public final PhotoViewer f44914s;

    public long f44898a = 0;

    public float f44899b = 0.0f;

    public float f44900c = 0.0f;
    public float d = 0.0f;

    public long f44901e = 0;

    public float f44902f = 0.0f;

    public final RectF f44903g = new RectF();
    public int h = -1;

    public final int f44905j = AndroidUtilities.dp(64.0f);

    public int f44906k = -2;

    public float f44907l = 1.0f;

    public final float[] f44908m = new float[3];

    public final float[] f44909n = new float[3];

    public float f44910o = 1.0f;

    public yt0(PhotoViewer photoViewer, View view) {
        this.f44914s = photoViewer;
        if (PhotoViewer.S8 == null) {
            PhotoViewer.S8 = new DecelerateInterpolator(1.5f);
            Paint paint = new Paint(1);
            PhotoViewer.T8 = paint;
            paint.setStyle(Paint.Style.STROKE);
            PhotoViewer.T8.setStrokeCap(Paint.Cap.ROUND);
            PhotoViewer.T8.setStrokeWidth(AndroidUtilities.dp(3.0f));
            PhotoViewer.T8.setColor(-1);
        }
        this.f44904i = view;
        int i10 = 0;
        while (true) {
            float[] fArr = this.f44909n;
            if (i10 >= fArr.length) {
                a();
                org.telegram.ui.Components.tf0 tf0Var = new org.telegram.ui.Components.tf0(28);
                this.f44913r = tf0Var;
                tf0Var.h = 200;
                this.f44912q = new org.telegram.ui.Components.dq(photoViewer.f35800y.getDrawable(R.drawable.circle_big).mutate(), tf0Var);
                return;
            }
            this.f44908m[i10] = 1.0f;
            fArr[i10] = 1.0f;
            i10++;
        }
    }

    public final void a() {
        boolean z10;
        int i10 = 0;
        while (true) {
            float[] fArr = this.f44909n;
            if (i10 >= fArr.length) {
                z10 = true;
                break;
            } else {
                if (fArr[i10] != 1.0f) {
                    z10 = false;
                    break;
                }
                i10++;
            }
        }
        if (z10 != this.f44911p) {
            this.f44911p = z10;
            vr0 vr0Var = (vr0) this;
            PhotoViewer photoViewer = vr0Var.f43516t;
            if (vr0Var == photoViewer.S0[0]) {
                photoViewer.r3();
            }
        }
    }

    public final int b() {
        int i10 = AndroidUtilities.displaySize.y;
        PhotoViewer photoViewer = this.f44914s;
        float f10 = ((i10 + (!photoViewer.f35745s ? AndroidUtilities.statusBarHeight : 0)) - ((int) (this.f44905j * this.f44910o))) / 2;
        photoViewer.getClass();
        int i11 = (int) (f10 + 0.0f);
        return photoViewer.Y1 == 1 ? i11 - AndroidUtilities.dp(38.0f) : i11;
    }

    public final void c(Canvas canvas) {
        int i10;
        float f10 = this.f44905j;
        int i11 = (int) (this.f44910o * f10);
        int width = (this.f44914s.f35583a0.getWidth() - ((int) (f10 * this.f44910o))) / 2;
        int iB = b();
        int i12 = 0;
        float interpolation = 1.0f;
        while (true) {
            float[] fArr = this.f44908m;
            if (i12 >= fArr.length) {
                break;
            }
            interpolation = i12 == 2 ? AndroidUtilities.accelerateInterpolator.getInterpolation(fArr[i12]) * interpolation : interpolation * fArr[i12];
            i12++;
        }
        int i13 = this.f44906k;
        Drawable drawable = this.f44912q;
        if (i13 >= 0) {
            Drawable[] drawableArr = PhotoViewer.P8;
            if (i13 < drawableArr.length + 2) {
                Drawable drawable2 = i13 < drawableArr.length ? drawableArr[i13] : drawable;
                if (drawable2 != null) {
                    drawable2.setAlpha((int) (this.f44907l * 255.0f * interpolation));
                    drawable2.setBounds(width, iB, width + i11, iB + i11);
                    drawable2.draw(canvas);
                }
            }
        }
        int i14 = this.h;
        if (i14 >= 0) {
            Drawable[] drawableArr2 = PhotoViewer.P8;
            if (i14 < drawableArr2.length + 2) {
                if (i14 < drawableArr2.length) {
                    drawable = drawableArr2[i14];
                }
                if (drawable != null) {
                    if (this.f44906k != -2) {
                        drawable.setAlpha((int) org.telegram.messenger.y1.z(1.0f, this.f44907l, 255.0f, interpolation));
                    } else {
                        drawable.setAlpha((int) (interpolation * 255.0f));
                    }
                    drawable.setBounds(width, iB, width + i11, iB + i11);
                    drawable.draw(canvas);
                }
            }
        }
        int i15 = this.h;
        if (i15 != 0 && i15 != 1 && (i10 = this.f44906k) != 0 && i10 != 1) {
            g(false);
            return;
        }
        int iDp = AndroidUtilities.dp(4.0f);
        if (this.f44906k != -2) {
            PhotoViewer.T8.setAlpha((int) (this.f44907l * 255.0f * interpolation));
        } else {
            PhotoViewer.T8.setAlpha((int) (interpolation * 255.0f));
        }
        RectF rectF = this.f44903g;
        rectF.set(width + iDp, iB + iDp, (width + i11) - iDp, (iB + i11) - iDp);
        canvas.drawArc(rectF, this.f44899b - 90.0f, Math.max(4.0f, this.f44902f * 360.0f), false, PhotoViewer.T8);
        g(true);
    }

    public final void d(int i10, boolean z10, boolean z11) {
        int i11;
        int i12 = this.h;
        if (i12 == i10) {
            return;
        }
        View view = this.f44904i;
        org.telegram.ui.Components.tf0 tf0Var = this.f44913r;
        if (tf0Var != null) {
            boolean z12 = z11 && (i12 == 3 || i12 == 4);
            if (i10 == 3) {
                tf0Var.a(false, z12);
            } else if (i10 == 4) {
                tf0Var.a(true, z12);
            }
            tf0Var.f32766f = view;
            tf0Var.invalidateSelf();
        }
        this.f44898a = System.currentTimeMillis();
        if (!z10 || (i11 = this.h) == i10) {
            this.f44906k = -2;
        } else {
            this.f44906k = i11;
            this.f44907l = 1.0f;
        }
        this.h = i10;
        vr0 vr0Var = (vr0) this;
        PhotoViewer photoViewer = vr0Var.f43516t;
        if (vr0Var == photoViewer.S0[0]) {
            photoViewer.r3();
        }
        view.invalidate();
    }

    public final void e(int i10, float f10, boolean z10) {
        float[] fArr = this.f44909n;
        if (fArr[i10] != f10) {
            fArr[i10] = f10;
            if (!z10) {
                this.f44908m[i10] = f10;
            }
            a();
            this.f44904i.invalidate();
        }
    }

    public final void f(float f10, boolean z10) {
        if (z10) {
            this.d = this.f44902f;
        } else {
            this.f44902f = f10;
            this.d = f10;
        }
        this.f44900c = f10;
        this.f44901e = 0L;
        this.f44904i.invalidate();
    }

    public final void g(boolean z10) {
        boolean z11;
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j10 = jCurrentTimeMillis - this.f44898a;
        if (j10 > 18) {
            j10 = 18;
        }
        this.f44898a = jCurrentTimeMillis;
        int i10 = 0;
        if (z10) {
            if (this.f44902f == 1.0f && this.f44900c == 1.0f) {
                z11 = false;
            } else {
                this.f44899b = ((360 * j10) / 3000.0f) + this.f44899b;
                float f10 = this.f44900c - this.d;
                if (Math.abs(f10) > 0.0f) {
                    long j11 = this.f44901e + j10;
                    this.f44901e = j11;
                    if (j11 >= 300) {
                        float f11 = this.f44900c;
                        this.f44902f = f11;
                        this.d = f11;
                        this.f44901e = 0L;
                    } else {
                        this.f44902f = (PhotoViewer.S8.getInterpolation(j11 / 300.0f) * f10) + this.d;
                    }
                }
                z11 = true;
            }
            float f12 = this.f44907l;
            if (f12 > 0.0f && this.f44906k != -2) {
                float f13 = f12 - (j10 / 200.0f);
                this.f44907l = f13;
                if (f13 <= 0.0f) {
                    this.f44907l = 0.0f;
                    this.f44906k = -2;
                }
                z11 = true;
            }
        } else {
            z11 = false;
        }
        while (true) {
            float[] fArr = this.f44909n;
            if (i10 >= fArr.length) {
                break;
            }
            float f14 = fArr[i10];
            float[] fArr2 = this.f44908m;
            float f15 = fArr2[i10];
            if (f14 > f15) {
                fArr2[i10] = Math.min(1.0f, (j10 / 200.0f) + f15);
            } else {
                if (f14 < f15) {
                    fArr2[i10] = Math.max(0.0f, f15 - (j10 / 200.0f));
                }
                i10++;
            }
            z11 = true;
            i10++;
        }
        if (z11) {
            this.f44904i.postInvalidateOnAnimation();
        }
    }
}
