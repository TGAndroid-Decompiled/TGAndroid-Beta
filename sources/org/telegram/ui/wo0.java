package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
public final class wo0 {
    public final View f53471i;
    public boolean f53478p;
    public final org.telegram.ui.Components.oq f53479q;
    public final org.telegram.ui.Components.we0 f53480r;
    public final PhotoViewer f53481s;
    public final PhotoViewer f53482t;
    public long f53465a = 0;
    public float f53466b = 0.0f;
    public float f53467c = 0.0f;
    public float d = 0.0f;
    public long f53468e = 0;
    public float f53469f = 0.0f;
    public final RectF f53470g = new RectF();
    public int h = -1;
    public final int f53472j = org.telegram.messenger.g0.L(64.0f);
    public int f53473k = -2;
    public float f53474l = 1.0f;
    public final float[] f53475m = new float[3];
    public final float[] f53476n = new float[3];
    public float f53477o = 1.0f;

    public wo0(PhotoViewer photoViewer, View view) {
        this.f53482t = photoViewer;
        this.f53481s = photoViewer;
        if (PhotoViewer.f43195c9 == null) {
            PhotoViewer.f43195c9 = new DecelerateInterpolator(1.5f);
            Paint paint = new Paint(1);
            PhotoViewer.f43196d9 = paint;
            paint.setStyle(Paint.Style.STROKE);
            PhotoViewer.f43196d9.setStrokeCap(Paint.Cap.ROUND);
            PhotoViewer.f43196d9.setStrokeWidth(org.telegram.messenger.g0.L(3.0f));
            PhotoViewer.f43196d9.setColor(-1);
        }
        this.f53471i = view;
        int i7 = 0;
        while (true) {
            float[] fArr = this.f53476n;
            if (i7 < fArr.length) {
                this.f53475m[i7] = 1.0f;
                fArr[i7] = 1.0f;
                i7++;
            } else {
                a();
                org.telegram.ui.Components.we0 we0Var = new org.telegram.ui.Components.we0(28);
                this.f53480r = we0Var;
                we0Var.h = 200;
                this.f53479q = new org.telegram.ui.Components.oq(photoViewer.E.getDrawable(2131231006).mutate(), we0Var);
                return;
            }
        }
    }

    public final void a() {
        boolean z10;
        int i7 = 0;
        while (true) {
            float[] fArr = this.f53476n;
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
        if (z10 != this.f53478p) {
            this.f53478p = z10;
            PhotoViewer photoViewer = this.f53482t;
            if (this == photoViewer.X0[0]) {
                photoViewer.p3();
            }
        }
    }

    public final int b() {
        int i7;
        int i10 = org.telegram.messenger.g0.f24146q.y;
        PhotoViewer photoViewer = this.f53481s;
        if (!photoViewer.f43361s) {
            i7 = org.telegram.messenger.g0.f24140m;
        } else {
            i7 = 0;
        }
        photoViewer.getClass();
        int i11 = (int) ((((i10 + i7) - ((int) (this.f53472j * this.f53477o))) / 2) + 0.0f);
        if (photoViewer.d2 == 1) {
            return i11 - org.telegram.messenger.g0.L(38.0f);
        }
        return i11;
    }

    public final void c(Canvas canvas) {
        int i7;
        Drawable drawable;
        float f10 = this.f53472j;
        int i10 = (int) (this.f53477o * f10);
        int width = (this.f53481s.f43249f0.getWidth() - ((int) (f10 * this.f53477o))) / 2;
        int b10 = b();
        float f11 = 1.0f;
        int i11 = 0;
        while (true) {
            float[] fArr = this.f53475m;
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
        int i12 = this.f53473k;
        Drawable drawable2 = this.f53479q;
        if (i12 >= 0) {
            Drawable[] drawableArr = PhotoViewer.Z8;
            if (i12 < drawableArr.length + 2) {
                if (i12 < drawableArr.length) {
                    drawable = drawableArr[i12];
                } else {
                    drawable = drawable2;
                }
                if (drawable != null) {
                    drawable.setAlpha((int) (this.f53474l * 255.0f * f11));
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
                    if (this.f53473k != -2) {
                        drawable2.setAlpha((int) org.telegram.messenger.f3.A(1.0f, this.f53474l, 255.0f, f11));
                    } else {
                        drawable2.setAlpha((int) (f11 * 255.0f));
                    }
                    drawable2.setBounds(width, b10, width + i10, b10 + i10);
                    drawable2.draw(canvas);
                }
            }
        }
        int i14 = this.h;
        if (i14 != 0 && i14 != 1 && (i7 = this.f53473k) != 0 && i7 != 1) {
            g(false);
            return;
        }
        int L = org.telegram.messenger.g0.L(4.0f);
        if (this.f53473k != -2) {
            PhotoViewer.f43196d9.setAlpha((int) (this.f53474l * 255.0f * f11));
        } else {
            PhotoViewer.f43196d9.setAlpha((int) (f11 * 255.0f));
        }
        RectF rectF = this.f53470g;
        rectF.set(width + L, b10 + L, (width + i10) - L, (b10 + i10) - L);
        canvas.drawArc(rectF, this.f53466b - 90.0f, Math.max(4.0f, this.f53469f * 360.0f), false, PhotoViewer.f43196d9);
        g(true);
    }

    public final void d(int i7, boolean z10, boolean z11) {
        int i10;
        boolean z12;
        int i11 = this.h;
        if (i11 == i7) {
            return;
        }
        View view = this.f53471i;
        org.telegram.ui.Components.we0 we0Var = this.f53480r;
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
            we0Var.f41795f = view;
            we0Var.invalidateSelf();
        }
        this.f53465a = System.currentTimeMillis();
        if (z10 && (i10 = this.h) != i7) {
            this.f53473k = i10;
            this.f53474l = 1.0f;
        } else {
            this.f53473k = -2;
        }
        this.h = i7;
        PhotoViewer photoViewer = this.f53482t;
        if (this == photoViewer.X0[0]) {
            photoViewer.p3();
        }
        view.invalidate();
    }

    public final void e(int i7, float f10, boolean z10) {
        float[] fArr = this.f53476n;
        if (fArr[i7] != f10) {
            fArr[i7] = f10;
            if (!z10) {
                this.f53475m[i7] = f10;
            }
            a();
            this.f53471i.invalidate();
        }
    }

    public final void f(boolean z10, float f10) {
        if (!z10) {
            this.f53469f = f10;
            this.d = f10;
        } else {
            this.d = this.f53469f;
        }
        this.f53467c = f10;
        this.f53468e = 0L;
        this.f53471i.invalidate();
    }

    public final void g(boolean z10) {
        boolean z11;
        long currentTimeMillis = System.currentTimeMillis();
        long j3 = currentTimeMillis - this.f53465a;
        if (j3 > 18) {
            j3 = 18;
        }
        this.f53465a = currentTimeMillis;
        int i7 = 0;
        if (z10) {
            if (this.f53469f == 1.0f && this.f53467c == 1.0f) {
                z11 = false;
            } else {
                this.f53466b = (((float) (360 * j3)) / 3000.0f) + this.f53466b;
                float f10 = this.f53467c - this.d;
                if (Math.abs(f10) > 0.0f) {
                    long j10 = this.f53468e + j3;
                    this.f53468e = j10;
                    if (j10 >= 300) {
                        float f11 = this.f53467c;
                        this.f53469f = f11;
                        this.d = f11;
                        this.f53468e = 0L;
                    } else {
                        this.f53469f = (PhotoViewer.f43195c9.getInterpolation(((float) j10) / 300.0f) * f10) + this.d;
                    }
                }
                z11 = true;
            }
            float f12 = this.f53474l;
            if (f12 > 0.0f && this.f53473k != -2) {
                float f13 = f12 - (((float) j3) / 200.0f);
                this.f53474l = f13;
                if (f13 <= 0.0f) {
                    this.f53474l = 0.0f;
                    this.f53473k = -2;
                }
                z11 = true;
            }
        } else {
            z11 = false;
        }
        while (true) {
            float[] fArr = this.f53476n;
            if (i7 >= fArr.length) {
                break;
            }
            float f14 = fArr[i7];
            float[] fArr2 = this.f53475m;
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
            this.f53471i.postInvalidateOnAnimation();
        }
    }
}
