package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
public abstract class ru0 {
    public final View f37483i;
    public boolean f37490p;
    public final org.telegram.ui.Components.qq f37491q;
    public final org.telegram.ui.Components.pg0 f37492r;
    public final PhotoViewer f37493s;
    public long f37478a = 0;
    public float f37479b = 0.0f;
    public float f37480c = 0.0f;
    public float d = 0.0f;
    public long e = 0;
    public float f37481f = 0.0f;
    public final RectF f37482g = new RectF();
    public int h = -1;
    public final int f37484j = AndroidUtilities.dp(64.0f);
    public int f37485k = -2;
    public float f37486l = 1.0f;
    public final float[] f37487m = new float[3];
    public final float[] f37488n = new float[3];
    public float f37489o = 1.0f;

    public ru0(PhotoViewer photoViewer, View view) {
        this.f37493s = photoViewer;
        if (PhotoViewer.X8 == null) {
            PhotoViewer.X8 = new DecelerateInterpolator(1.5f);
            Paint paint = new Paint(1);
            PhotoViewer.Y8 = paint;
            paint.setStyle(Paint.Style.STROKE);
            PhotoViewer.Y8.setStrokeCap(Paint.Cap.ROUND);
            PhotoViewer.Y8.setStrokeWidth(AndroidUtilities.dp(3.0f));
            PhotoViewer.Y8.setColor(-1);
        }
        this.f37483i = view;
        int i10 = 0;
        while (true) {
            float[] fArr = this.f37488n;
            if (i10 < fArr.length) {
                this.f37487m[i10] = 1.0f;
                fArr[i10] = 1.0f;
                i10++;
            } else {
                a();
                org.telegram.ui.Components.pg0 pg0Var = new org.telegram.ui.Components.pg0(28);
                this.f37492r = pg0Var;
                pg0Var.h = 200;
                this.f37491q = new org.telegram.ui.Components.qq(photoViewer.f31401y.getDrawable(R.drawable.circle_big).mutate(), pg0Var);
                return;
            }
        }
    }

    public final void a() {
        boolean z10;
        int i10 = 0;
        while (true) {
            float[] fArr = this.f37488n;
            if (i10 < fArr.length) {
                if (fArr[i10] != 1.0f) {
                    z10 = false;
                    break;
                }
                i10++;
            } else {
                z10 = true;
                break;
            }
        }
        if (z10 != this.f37490p) {
            this.f37490p = z10;
            ps0 ps0Var = (ps0) this;
            PhotoViewer photoViewer = ps0Var.f36677t;
            if (ps0Var == photoViewer.W0[0]) {
                photoViewer.q3();
            }
        }
    }

    public final int b() {
        int i10;
        int i11 = AndroidUtilities.displaySize.y;
        PhotoViewer photoViewer = this.f37493s;
        if (!photoViewer.f31344s) {
            i10 = AndroidUtilities.statusBarHeight;
        } else {
            i10 = 0;
        }
        photoViewer.getClass();
        int i12 = (int) ((((i11 + i10) - ((int) (this.f37484j * this.f37489o))) / 2) + 0.0f);
        if (photoViewer.f31207c2 == 1) {
            return i12 - AndroidUtilities.dp(38.0f);
        }
        return i12;
    }

    public final void c(Canvas canvas) {
        int i10;
        Drawable drawable;
        float f7 = this.f37484j;
        int i11 = (int) (this.f37489o * f7);
        int width = (this.f37493s.f31223e0.getWidth() - ((int) (f7 * this.f37489o))) / 2;
        int b10 = b();
        int i12 = 0;
        float f10 = 1.0f;
        while (true) {
            float[] fArr = this.f37487m;
            if (i12 >= fArr.length) {
                break;
            }
            if (i12 == 2) {
                f10 = AndroidUtilities.accelerateInterpolator.getInterpolation(fArr[i12]) * f10;
            } else {
                f10 *= fArr[i12];
            }
            i12++;
        }
        int i13 = this.f37485k;
        Drawable drawable2 = this.f37491q;
        if (i13 >= 0) {
            Drawable[] drawableArr = PhotoViewer.U8;
            if (i13 < drawableArr.length + 2) {
                if (i13 < drawableArr.length) {
                    drawable = drawableArr[i13];
                } else {
                    drawable = drawable2;
                }
                if (drawable != null) {
                    drawable.setAlpha((int) (this.f37486l * 255.0f * f10));
                    drawable.setBounds(width, b10, width + i11, b10 + i11);
                    drawable.draw(canvas);
                }
            }
        }
        int i14 = this.h;
        if (i14 >= 0) {
            Drawable[] drawableArr2 = PhotoViewer.U8;
            if (i14 < drawableArr2.length + 2) {
                if (i14 < drawableArr2.length) {
                    drawable2 = drawableArr2[i14];
                }
                if (drawable2 != null) {
                    if (this.f37485k != -2) {
                        drawable2.setAlpha((int) org.telegram.messenger.f0.z(1.0f, this.f37486l, 255.0f, f10));
                    } else {
                        drawable2.setAlpha((int) (f10 * 255.0f));
                    }
                    drawable2.setBounds(width, b10, width + i11, b10 + i11);
                    drawable2.draw(canvas);
                }
            }
        }
        int i15 = this.h;
        if (i15 != 0 && i15 != 1 && (i10 = this.f37485k) != 0 && i10 != 1) {
            g(false);
            return;
        }
        int dp = AndroidUtilities.dp(4.0f);
        if (this.f37485k != -2) {
            PhotoViewer.Y8.setAlpha((int) (this.f37486l * 255.0f * f10));
        } else {
            PhotoViewer.Y8.setAlpha((int) (f10 * 255.0f));
        }
        RectF rectF = this.f37482g;
        rectF.set(width + dp, b10 + dp, (width + i11) - dp, (b10 + i11) - dp);
        canvas.drawArc(rectF, this.f37479b - 90.0f, Math.max(4.0f, this.f37481f * 360.0f), false, PhotoViewer.Y8);
        g(true);
    }

    public final void d(int i10, boolean z10, boolean z11) {
        int i11;
        boolean z12;
        int i12 = this.h;
        if (i12 == i10) {
            return;
        }
        View view = this.f37483i;
        org.telegram.ui.Components.pg0 pg0Var = this.f37492r;
        if (pg0Var != null) {
            if (z11 && (i12 == 3 || i12 == 4)) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (i10 == 3) {
                pg0Var.a(false, z12);
            } else if (i10 == 4) {
                pg0Var.a(true, z12);
            }
            pg0Var.f27341f = view;
            pg0Var.invalidateSelf();
        }
        this.f37478a = System.currentTimeMillis();
        if (z10 && (i11 = this.h) != i10) {
            this.f37485k = i11;
            this.f37486l = 1.0f;
        } else {
            this.f37485k = -2;
        }
        this.h = i10;
        ps0 ps0Var = (ps0) this;
        PhotoViewer photoViewer = ps0Var.f36677t;
        if (ps0Var == photoViewer.W0[0]) {
            photoViewer.q3();
        }
        view.invalidate();
    }

    public final void e(int i10, float f7, boolean z10) {
        float[] fArr = this.f37488n;
        if (fArr[i10] != f7) {
            fArr[i10] = f7;
            if (!z10) {
                this.f37487m[i10] = f7;
            }
            a();
            this.f37483i.invalidate();
        }
    }

    public final void f(float f7, boolean z10) {
        if (!z10) {
            this.f37481f = f7;
            this.d = f7;
        } else {
            this.d = this.f37481f;
        }
        this.f37480c = f7;
        this.e = 0L;
        this.f37483i.invalidate();
    }

    public final void g(boolean z10) {
        boolean z11;
        long currentTimeMillis = System.currentTimeMillis();
        long j3 = currentTimeMillis - this.f37478a;
        if (j3 > 18) {
            j3 = 18;
        }
        this.f37478a = currentTimeMillis;
        int i10 = 0;
        if (z10) {
            if (this.f37481f == 1.0f && this.f37480c == 1.0f) {
                z11 = false;
            } else {
                this.f37479b = (((float) (360 * j3)) / 3000.0f) + this.f37479b;
                float f7 = this.f37480c - this.d;
                if (Math.abs(f7) > 0.0f) {
                    long j10 = this.e + j3;
                    this.e = j10;
                    if (j10 >= 300) {
                        float f10 = this.f37480c;
                        this.f37481f = f10;
                        this.d = f10;
                        this.e = 0L;
                    } else {
                        this.f37481f = (PhotoViewer.X8.getInterpolation(((float) j10) / 300.0f) * f7) + this.d;
                    }
                }
                z11 = true;
            }
            float f11 = this.f37486l;
            if (f11 > 0.0f && this.f37485k != -2) {
                float f12 = f11 - (((float) j3) / 200.0f);
                this.f37486l = f12;
                if (f12 <= 0.0f) {
                    this.f37486l = 0.0f;
                    this.f37485k = -2;
                }
                z11 = true;
            }
        } else {
            z11 = false;
        }
        while (true) {
            float[] fArr = this.f37488n;
            if (i10 >= fArr.length) {
                break;
            }
            float f13 = fArr[i10];
            float[] fArr2 = this.f37487m;
            float f14 = fArr2[i10];
            if (f13 > f14) {
                fArr2[i10] = Math.min(1.0f, (((float) j3) / 200.0f) + f14);
            } else if (f13 < f14) {
                fArr2[i10] = Math.max(0.0f, f14 - (((float) j3) / 200.0f));
            } else {
                i10++;
            }
            z11 = true;
            i10++;
        }
        if (z11) {
            this.f37483i.postInvalidateOnAnimation();
        }
    }
}
