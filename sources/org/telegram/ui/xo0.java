package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
public final class xo0 {
    public final View f53871i;
    public boolean f53878p;
    public final org.telegram.ui.Components.oq f53879q;
    public final org.telegram.ui.Components.we0 f53880r;
    public final PhotoViewer f53881s;
    public final PhotoViewer f53882t;
    public long f53865a = 0;
    public float f53866b = 0.0f;
    public float f53867c = 0.0f;
    public float d = 0.0f;
    public long f53868e = 0;
    public float f53869f = 0.0f;
    public final RectF f53870g = new RectF();
    public int h = -1;
    public final int f53872j = org.telegram.messenger.g0.L(64.0f);
    public int f53873k = -2;
    public float f53874l = 1.0f;
    public final float[] f53875m = new float[3];
    public final float[] f53876n = new float[3];
    public float f53877o = 1.0f;

    public xo0(PhotoViewer photoViewer, View view) {
        this.f53882t = photoViewer;
        this.f53881s = photoViewer;
        if (PhotoViewer.f43164c9 == null) {
            PhotoViewer.f43164c9 = new DecelerateInterpolator(1.5f);
            Paint paint = new Paint(1);
            PhotoViewer.f43165d9 = paint;
            paint.setStyle(Paint.Style.STROKE);
            PhotoViewer.f43165d9.setStrokeCap(Paint.Cap.ROUND);
            PhotoViewer.f43165d9.setStrokeWidth(org.telegram.messenger.g0.L(3.0f));
            PhotoViewer.f43165d9.setColor(-1);
        }
        this.f53871i = view;
        int i7 = 0;
        while (true) {
            float[] fArr = this.f53876n;
            if (i7 < fArr.length) {
                this.f53875m[i7] = 1.0f;
                fArr[i7] = 1.0f;
                i7++;
            } else {
                a();
                org.telegram.ui.Components.we0 we0Var = new org.telegram.ui.Components.we0(28);
                this.f53880r = we0Var;
                we0Var.h = 200;
                this.f53879q = new org.telegram.ui.Components.oq(photoViewer.E.getDrawable(2131231006).mutate(), we0Var);
                return;
            }
        }
    }

    public final void a() {
        boolean z10;
        int i7 = 0;
        while (true) {
            float[] fArr = this.f53876n;
            if (i7 < fArr.length) {
                if (fArr[i7] != 1.0f) {
                    z10 = false;
                    break;
                }
                i7++;
            } else {
                z10 = true;
                break;
            }
        }
        if (z10 != this.f53878p) {
            this.f53878p = z10;
            PhotoViewer photoViewer = this.f53882t;
            if (this == photoViewer.X0[0]) {
                photoViewer.p3();
            }
        }
    }

    public final int b() {
        int i7;
        int i10 = org.telegram.messenger.g0.f24010q.y;
        PhotoViewer photoViewer = this.f53881s;
        if (!photoViewer.f43330s) {
            i7 = org.telegram.messenger.g0.f24004m;
        } else {
            i7 = 0;
        }
        photoViewer.getClass();
        int i11 = (int) ((((i10 + i7) - ((int) (this.f53872j * this.f53877o))) / 2) + 0.0f);
        if (photoViewer.d2 == 1) {
            return i11 - org.telegram.messenger.g0.L(38.0f);
        }
        return i11;
    }

    public final void c(Canvas canvas) {
        int i7;
        Drawable drawable;
        float f10 = this.f53872j;
        int i10 = (int) (this.f53877o * f10);
        int width = (this.f53881s.f43218f0.getWidth() - ((int) (f10 * this.f53877o))) / 2;
        int b10 = b();
        float f11 = 1.0f;
        int i11 = 0;
        while (true) {
            float[] fArr = this.f53875m;
            if (i11 >= fArr.length) {
                break;
            }
            if (i11 == 2) {
                f11 = org.telegram.messenger.g0.G.getInterpolation(fArr[i11]) * f11;
            } else {
                f11 *= fArr[i11];
            }
            i11++;
        }
        int i12 = this.f53873k;
        Drawable drawable2 = this.f53879q;
        if (i12 >= 0) {
            Drawable[] drawableArr = PhotoViewer.Z8;
            if (i12 < drawableArr.length + 2) {
                if (i12 < drawableArr.length) {
                    drawable = drawableArr[i12];
                } else {
                    drawable = drawable2;
                }
                if (drawable != null) {
                    drawable.setAlpha((int) (this.f53874l * 255.0f * f11));
                    drawable.setBounds(width, b10, width + i10, b10 + i10);
                    drawable.draw(canvas);
                }
            }
        }
        int i13 = this.h;
        if (i13 >= 0) {
            Drawable[] drawableArr2 = PhotoViewer.Z8;
            if (i13 < drawableArr2.length + 2) {
                if (i13 < drawableArr2.length) {
                    drawable2 = drawableArr2[i13];
                }
                if (drawable2 != null) {
                    if (this.f53873k != -2) {
                        drawable2.setAlpha((int) org.telegram.messenger.f3.A(1.0f, this.f53874l, 255.0f, f11));
                    } else {
                        drawable2.setAlpha((int) (f11 * 255.0f));
                    }
                    drawable2.setBounds(width, b10, width + i10, b10 + i10);
                    drawable2.draw(canvas);
                }
            }
        }
        int i14 = this.h;
        if (i14 != 0 && i14 != 1 && (i7 = this.f53873k) != 0 && i7 != 1) {
            g(false);
            return;
        }
        int L = org.telegram.messenger.g0.L(4.0f);
        if (this.f53873k != -2) {
            PhotoViewer.f43165d9.setAlpha((int) (this.f53874l * 255.0f * f11));
        } else {
            PhotoViewer.f43165d9.setAlpha((int) (f11 * 255.0f));
        }
        RectF rectF = this.f53870g;
        rectF.set(width + L, b10 + L, (width + i10) - L, (b10 + i10) - L);
        canvas.drawArc(rectF, this.f53866b - 90.0f, Math.max(4.0f, this.f53869f * 360.0f), false, PhotoViewer.f43165d9);
        g(true);
    }

    public final void d(int i7, boolean z10, boolean z11) {
        int i10;
        boolean z12;
        int i11 = this.h;
        if (i11 == i7) {
            return;
        }
        View view = this.f53871i;
        org.telegram.ui.Components.we0 we0Var = this.f53880r;
        if (we0Var != null) {
            if (z11 && (i11 == 3 || i11 == 4)) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (i7 == 3) {
                we0Var.a(false, z12);
            } else if (i7 == 4) {
                we0Var.a(true, z12);
            }
            we0Var.f41762f = view;
            we0Var.invalidateSelf();
        }
        this.f53865a = System.currentTimeMillis();
        if (z10 && (i10 = this.h) != i7) {
            this.f53873k = i10;
            this.f53874l = 1.0f;
        } else {
            this.f53873k = -2;
        }
        this.h = i7;
        PhotoViewer photoViewer = this.f53882t;
        if (this == photoViewer.X0[0]) {
            photoViewer.p3();
        }
        view.invalidate();
    }

    public final void e(int i7, float f10, boolean z10) {
        float[] fArr = this.f53876n;
        if (fArr[i7] != f10) {
            fArr[i7] = f10;
            if (!z10) {
                this.f53875m[i7] = f10;
            }
            a();
            this.f53871i.invalidate();
        }
    }

    public final void f(boolean z10, float f10) {
        if (!z10) {
            this.f53869f = f10;
            this.d = f10;
        } else {
            this.d = this.f53869f;
        }
        this.f53867c = f10;
        this.f53868e = 0L;
        this.f53871i.invalidate();
    }

    public final void g(boolean z10) {
        boolean z11;
        long currentTimeMillis = System.currentTimeMillis();
        long j3 = currentTimeMillis - this.f53865a;
        if (j3 > 18) {
            j3 = 18;
        }
        this.f53865a = currentTimeMillis;
        int i7 = 0;
        if (z10) {
            if (this.f53869f == 1.0f && this.f53867c == 1.0f) {
                z11 = false;
            } else {
                this.f53866b = (((float) (360 * j3)) / 3000.0f) + this.f53866b;
                float f10 = this.f53867c - this.d;
                if (Math.abs(f10) > 0.0f) {
                    long j10 = this.f53868e + j3;
                    this.f53868e = j10;
                    if (j10 >= 300) {
                        float f11 = this.f53867c;
                        this.f53869f = f11;
                        this.d = f11;
                        this.f53868e = 0L;
                    } else {
                        this.f53869f = (PhotoViewer.f43164c9.getInterpolation(((float) j10) / 300.0f) * f10) + this.d;
                    }
                }
                z11 = true;
            }
            float f12 = this.f53874l;
            if (f12 > 0.0f && this.f53873k != -2) {
                float f13 = f12 - (((float) j3) / 200.0f);
                this.f53874l = f13;
                if (f13 <= 0.0f) {
                    this.f53874l = 0.0f;
                    this.f53873k = -2;
                }
                z11 = true;
            }
        } else {
            z11 = false;
        }
        while (true) {
            float[] fArr = this.f53876n;
            if (i7 >= fArr.length) {
                break;
            }
            float f14 = fArr[i7];
            float[] fArr2 = this.f53875m;
            float f15 = fArr2[i7];
            if (f14 > f15) {
                fArr2[i7] = org.telegram.ui.Cells.c0.f((float) j3, 200.0f, f15, 1.0f);
            } else if (f14 < f15) {
                fArr2[i7] = org.telegram.ui.Cells.c0.B((float) j3, 200.0f, f15, 0.0f);
            } else {
                i7++;
            }
            z11 = true;
            i7++;
        }
        if (z11) {
            this.f53871i.postInvalidateOnAnimation();
        }
    }
}
