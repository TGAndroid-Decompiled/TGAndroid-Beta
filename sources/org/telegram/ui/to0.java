package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
public final class to0 {
    public final View f51634i;
    public boolean f51641p;
    public final org.telegram.ui.Components.fq f51642q;
    public final org.telegram.ui.Components.ke0 f51643r;
    public final PhotoViewer f51644s;
    public final PhotoViewer f51645t;
    public long f51628a = 0;
    public float f51629b = 0.0f;
    public float f51630c = 0.0f;
    public float d = 0.0f;
    public long f51631e = 0;
    public float f51632f = 0.0f;
    public final RectF f51633g = new RectF();
    public int h = -1;
    public final int f51635j = org.telegram.messenger.g0.L(64.0f);
    public int f51636k = -2;
    public float f51637l = 1.0f;
    public final float[] f51638m = new float[3];
    public final float[] f51639n = new float[3];
    public float f51640o = 1.0f;

    public to0(PhotoViewer photoViewer, View view) {
        this.f51645t = photoViewer;
        this.f51644s = photoViewer;
        if (PhotoViewer.f42709c9 == null) {
            PhotoViewer.f42709c9 = new DecelerateInterpolator(1.5f);
            Paint paint = new Paint(1);
            PhotoViewer.f42710d9 = paint;
            paint.setStyle(Paint.Style.STROKE);
            PhotoViewer.f42710d9.setStrokeCap(Paint.Cap.ROUND);
            PhotoViewer.f42710d9.setStrokeWidth(org.telegram.messenger.g0.L(3.0f));
            PhotoViewer.f42710d9.setColor(-1);
        }
        this.f51634i = view;
        int i7 = 0;
        while (true) {
            float[] fArr = this.f51639n;
            if (i7 < fArr.length) {
                this.f51638m[i7] = 1.0f;
                fArr[i7] = 1.0f;
                i7++;
            } else {
                a();
                org.telegram.ui.Components.ke0 ke0Var = new org.telegram.ui.Components.ke0(28);
                this.f51643r = ke0Var;
                ke0Var.h = 200;
                this.f51642q = new org.telegram.ui.Components.fq(photoViewer.E.getDrawable(2131231006).mutate(), ke0Var);
                return;
            }
        }
    }

    public final void a() {
        boolean z10;
        int i7 = 0;
        while (true) {
            float[] fArr = this.f51639n;
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
        if (z10 != this.f51641p) {
            this.f51641p = z10;
            PhotoViewer photoViewer = this.f51645t;
            if (this == photoViewer.X0[0]) {
                photoViewer.p3();
            }
        }
    }

    public final int b() {
        int i7;
        int i10 = org.telegram.messenger.g0.f23609q.y;
        PhotoViewer photoViewer = this.f51644s;
        if (!photoViewer.f42875s) {
            i7 = org.telegram.messenger.g0.f23603m;
        } else {
            i7 = 0;
        }
        photoViewer.getClass();
        int i11 = (int) ((((i10 + i7) - ((int) (this.f51635j * this.f51640o))) / 2) + 0.0f);
        if (photoViewer.d2 == 1) {
            return i11 - org.telegram.messenger.g0.L(38.0f);
        }
        return i11;
    }

    public final void c(Canvas canvas) {
        int i7;
        Drawable drawable;
        float f10 = this.f51635j;
        int i10 = (int) (this.f51640o * f10);
        int width = (this.f51644s.f42763f0.getWidth() - ((int) (f10 * this.f51640o))) / 2;
        int b10 = b();
        float f11 = 1.0f;
        int i11 = 0;
        while (true) {
            float[] fArr = this.f51638m;
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
        int i12 = this.f51636k;
        Drawable drawable2 = this.f51642q;
        if (i12 >= 0) {
            Drawable[] drawableArr = PhotoViewer.Z8;
            if (i12 < drawableArr.length + 2) {
                if (i12 < drawableArr.length) {
                    drawable = drawableArr[i12];
                } else {
                    drawable = drawable2;
                }
                if (drawable != null) {
                    drawable.setAlpha((int) (this.f51637l * 255.0f * f11));
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
                    if (this.f51636k != -2) {
                        drawable2.setAlpha((int) org.telegram.messenger.k5.A(1.0f, this.f51637l, 255.0f, f11));
                    } else {
                        drawable2.setAlpha((int) (f11 * 255.0f));
                    }
                    drawable2.setBounds(width, b10, width + i10, b10 + i10);
                    drawable2.draw(canvas);
                }
            }
        }
        int i14 = this.h;
        if (i14 != 0 && i14 != 1 && (i7 = this.f51636k) != 0 && i7 != 1) {
            g(false);
            return;
        }
        int L = org.telegram.messenger.g0.L(4.0f);
        if (this.f51636k != -2) {
            PhotoViewer.f42710d9.setAlpha((int) (this.f51637l * 255.0f * f11));
        } else {
            PhotoViewer.f42710d9.setAlpha((int) (f11 * 255.0f));
        }
        RectF rectF = this.f51633g;
        rectF.set(width + L, b10 + L, (width + i10) - L, (b10 + i10) - L);
        canvas.drawArc(rectF, this.f51629b - 90.0f, Math.max(4.0f, this.f51632f * 360.0f), false, PhotoViewer.f42710d9);
        g(true);
    }

    public final void d(int i7, boolean z10, boolean z11) {
        int i10;
        boolean z12;
        int i11 = this.h;
        if (i11 == i7) {
            return;
        }
        View view = this.f51634i;
        org.telegram.ui.Components.ke0 ke0Var = this.f51643r;
        if (ke0Var != null) {
            if (z11 && (i11 == 3 || i11 == 4)) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (i7 == 3) {
                ke0Var.a(false, z12);
            } else if (i7 == 4) {
                ke0Var.a(true, z12);
            }
            ke0Var.f36406f = view;
            ke0Var.invalidateSelf();
        }
        this.f51628a = System.currentTimeMillis();
        if (z10 && (i10 = this.h) != i7) {
            this.f51636k = i10;
            this.f51637l = 1.0f;
        } else {
            this.f51636k = -2;
        }
        this.h = i7;
        PhotoViewer photoViewer = this.f51645t;
        if (this == photoViewer.X0[0]) {
            photoViewer.p3();
        }
        view.invalidate();
    }

    public final void e(int i7, float f10, boolean z10) {
        float[] fArr = this.f51639n;
        if (fArr[i7] != f10) {
            fArr[i7] = f10;
            if (!z10) {
                this.f51638m[i7] = f10;
            }
            a();
            this.f51634i.invalidate();
        }
    }

    public final void f(boolean z10, float f10) {
        if (!z10) {
            this.f51632f = f10;
            this.d = f10;
        } else {
            this.d = this.f51632f;
        }
        this.f51630c = f10;
        this.f51631e = 0L;
        this.f51634i.invalidate();
    }

    public final void g(boolean z10) {
        boolean z11;
        long currentTimeMillis = System.currentTimeMillis();
        long j3 = currentTimeMillis - this.f51628a;
        if (j3 > 18) {
            j3 = 18;
        }
        this.f51628a = currentTimeMillis;
        int i7 = 0;
        if (z10) {
            if (this.f51632f == 1.0f && this.f51630c == 1.0f) {
                z11 = false;
            } else {
                this.f51629b = (((float) (360 * j3)) / 3000.0f) + this.f51629b;
                float f10 = this.f51630c - this.d;
                if (Math.abs(f10) > 0.0f) {
                    long j10 = this.f51631e + j3;
                    this.f51631e = j10;
                    if (j10 >= 300) {
                        float f11 = this.f51630c;
                        this.f51632f = f11;
                        this.d = f11;
                        this.f51631e = 0L;
                    } else {
                        this.f51632f = (PhotoViewer.f42709c9.getInterpolation(((float) j10) / 300.0f) * f10) + this.d;
                    }
                }
                z11 = true;
            }
            float f12 = this.f51637l;
            if (f12 > 0.0f && this.f51636k != -2) {
                float f13 = f12 - (((float) j3) / 200.0f);
                this.f51637l = f13;
                if (f13 <= 0.0f) {
                    this.f51637l = 0.0f;
                    this.f51636k = -2;
                }
                z11 = true;
            }
        } else {
            z11 = false;
        }
        while (true) {
            float[] fArr = this.f51639n;
            if (i7 >= fArr.length) {
                break;
            }
            float f14 = fArr[i7];
            float[] fArr2 = this.f51638m;
            float f15 = fArr2[i7];
            if (f14 > f15) {
                fArr2[i7] = org.telegram.ui.Cells.y0.e((float) j3, 200.0f, f15, 1.0f);
            } else if (f14 < f15) {
                fArr2[i7] = org.telegram.ui.Cells.y0.z((float) j3, 200.0f, f15, 0.0f);
            } else {
                i7++;
            }
            z11 = true;
            i7++;
        }
        if (z11) {
            this.f51634i.postInvalidateOnAnimation();
        }
    }
}
