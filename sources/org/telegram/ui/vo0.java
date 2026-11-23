package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
public final class vo0 {
    public final View f53001i;
    public boolean f53008p;
    public final org.telegram.ui.Components.lq f53009q;
    public final org.telegram.ui.Components.ve0 f53010r;
    public final PhotoViewer f53011s;
    public final PhotoViewer f53012t;
    public long f52995a = 0;
    public float f52996b = 0.0f;
    public float f52997c = 0.0f;
    public float d = 0.0f;
    public long f52998e = 0;
    public float f52999f = 0.0f;
    public final RectF f53000g = new RectF();
    public int h = -1;
    public final int f53002j = org.telegram.messenger.g0.L(64.0f);
    public int f53003k = -2;
    public float f53004l = 1.0f;
    public final float[] f53005m = new float[3];
    public final float[] f53006n = new float[3];
    public float f53007o = 1.0f;

    public vo0(PhotoViewer photoViewer, View view) {
        this.f53012t = photoViewer;
        this.f53011s = photoViewer;
        if (PhotoViewer.f43275i9 == null) {
            PhotoViewer.f43275i9 = new DecelerateInterpolator(1.5f);
            Paint paint = new Paint(1);
            PhotoViewer.f43276j9 = paint;
            paint.setStyle(Paint.Style.STROKE);
            PhotoViewer.f43276j9.setStrokeCap(Paint.Cap.ROUND);
            PhotoViewer.f43276j9.setStrokeWidth(org.telegram.messenger.g0.L(3.0f));
            PhotoViewer.f43276j9.setColor(-1);
        }
        this.f53001i = view;
        int i7 = 0;
        while (true) {
            float[] fArr = this.f53006n;
            if (i7 < fArr.length) {
                this.f53005m[i7] = 1.0f;
                fArr[i7] = 1.0f;
                i7++;
            } else {
                a();
                org.telegram.ui.Components.ve0 ve0Var = new org.telegram.ui.Components.ve0(28);
                this.f53010r = ve0Var;
                ve0Var.h = 200;
                this.f53009q = new org.telegram.ui.Components.lq(photoViewer.E.getDrawable(2131231008).mutate(), ve0Var);
                return;
            }
        }
    }

    public final void a() {
        boolean z10;
        int i7 = 0;
        while (true) {
            float[] fArr = this.f53006n;
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
        if (z10 != this.f53008p) {
            this.f53008p = z10;
            PhotoViewer photoViewer = this.f53012t;
            if (this == photoViewer.X0[0]) {
                photoViewer.q3();
            }
        }
    }

    public final int b() {
        int i7;
        int i10 = org.telegram.messenger.g0.f24226q.y;
        PhotoViewer photoViewer = this.f53011s;
        if (!photoViewer.f43446s) {
            i7 = org.telegram.messenger.g0.f24220m;
        } else {
            i7 = 0;
        }
        photoViewer.getClass();
        int i11 = (int) ((((i10 + i7) - ((int) (this.f53002j * this.f53007o))) / 2) + 0.0f);
        if (photoViewer.d2 == 1) {
            return i11 - org.telegram.messenger.g0.L(38.0f);
        }
        return i11;
    }

    public final void c(Canvas canvas) {
        int i7;
        Drawable drawable;
        float f10 = this.f53002j;
        int i10 = (int) (this.f53007o * f10);
        int width = (this.f53011s.f43334f0.getWidth() - ((int) (f10 * this.f53007o))) / 2;
        int b10 = b();
        float f11 = 1.0f;
        int i11 = 0;
        while (true) {
            float[] fArr = this.f53005m;
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
        int i12 = this.f53003k;
        Drawable drawable2 = this.f53009q;
        if (i12 >= 0) {
            Drawable[] drawableArr = PhotoViewer.f43272f9;
            if (i12 < drawableArr.length + 2) {
                if (i12 < drawableArr.length) {
                    drawable = drawableArr[i12];
                } else {
                    drawable = drawable2;
                }
                if (drawable != null) {
                    drawable.setAlpha((int) (this.f53004l * 255.0f * f11));
                    drawable.setBounds(width, b10, width + i10, b10 + i10);
                    drawable.draw(canvas);
                }
            }
        }
        int i13 = this.h;
        if (i13 >= 0) {
            Drawable[] drawableArr2 = PhotoViewer.f43272f9;
            if (i13 < drawableArr2.length + 2) {
                if (i13 < drawableArr2.length) {
                    drawable2 = drawableArr2[i13];
                }
                if (drawable2 != null) {
                    if (this.f53003k != -2) {
                        drawable2.setAlpha((int) org.telegram.messenger.f3.A(1.0f, this.f53004l, 255.0f, f11));
                    } else {
                        drawable2.setAlpha((int) (f11 * 255.0f));
                    }
                    drawable2.setBounds(width, b10, width + i10, b10 + i10);
                    drawable2.draw(canvas);
                }
            }
        }
        int i14 = this.h;
        if (i14 != 0 && i14 != 1 && (i7 = this.f53003k) != 0 && i7 != 1) {
            g(false);
            return;
        }
        int L = org.telegram.messenger.g0.L(4.0f);
        if (this.f53003k != -2) {
            PhotoViewer.f43276j9.setAlpha((int) (this.f53004l * 255.0f * f11));
        } else {
            PhotoViewer.f43276j9.setAlpha((int) (f11 * 255.0f));
        }
        RectF rectF = this.f53000g;
        rectF.set(width + L, b10 + L, (width + i10) - L, (b10 + i10) - L);
        canvas.drawArc(rectF, this.f52996b - 90.0f, Math.max(4.0f, this.f52999f * 360.0f), false, PhotoViewer.f43276j9);
        g(true);
    }

    public final void d(int i7, boolean z10, boolean z11) {
        int i10;
        boolean z12;
        int i11 = this.h;
        if (i11 == i7) {
            return;
        }
        View view = this.f53001i;
        org.telegram.ui.Components.ve0 ve0Var = this.f53010r;
        if (ve0Var != null) {
            if (z11 && (i11 == 3 || i11 == 4)) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (i7 == 3) {
                ve0Var.a(false, z12);
            } else if (i7 == 4) {
                ve0Var.a(true, z12);
            }
            ve0Var.f40671f = view;
            ve0Var.invalidateSelf();
        }
        this.f52995a = System.currentTimeMillis();
        if (z10 && (i10 = this.h) != i7) {
            this.f53003k = i10;
            this.f53004l = 1.0f;
        } else {
            this.f53003k = -2;
        }
        this.h = i7;
        PhotoViewer photoViewer = this.f53012t;
        if (this == photoViewer.X0[0]) {
            photoViewer.q3();
        }
        view.invalidate();
    }

    public final void e(int i7, float f10, boolean z10) {
        float[] fArr = this.f53006n;
        if (fArr[i7] != f10) {
            fArr[i7] = f10;
            if (!z10) {
                this.f53005m[i7] = f10;
            }
            a();
            this.f53001i.invalidate();
        }
    }

    public final void f(boolean z10, float f10) {
        if (!z10) {
            this.f52999f = f10;
            this.d = f10;
        } else {
            this.d = this.f52999f;
        }
        this.f52997c = f10;
        this.f52998e = 0L;
        this.f53001i.invalidate();
    }

    public final void g(boolean z10) {
        boolean z11;
        long currentTimeMillis = System.currentTimeMillis();
        long j3 = currentTimeMillis - this.f52995a;
        if (j3 > 18) {
            j3 = 18;
        }
        this.f52995a = currentTimeMillis;
        int i7 = 0;
        if (z10) {
            if (this.f52999f == 1.0f && this.f52997c == 1.0f) {
                z11 = false;
            } else {
                this.f52996b = (((float) (360 * j3)) / 3000.0f) + this.f52996b;
                float f10 = this.f52997c - this.d;
                if (Math.abs(f10) > 0.0f) {
                    long j10 = this.f52998e + j3;
                    this.f52998e = j10;
                    if (j10 >= 300) {
                        float f11 = this.f52997c;
                        this.f52999f = f11;
                        this.d = f11;
                        this.f52998e = 0L;
                    } else {
                        this.f52999f = (PhotoViewer.f43275i9.getInterpolation(((float) j10) / 300.0f) * f10) + this.d;
                    }
                }
                z11 = true;
            }
            float f12 = this.f53004l;
            if (f12 > 0.0f && this.f53003k != -2) {
                float f13 = f12 - (((float) j3) / 200.0f);
                this.f53004l = f13;
                if (f13 <= 0.0f) {
                    this.f53004l = 0.0f;
                    this.f53003k = -2;
                }
                z11 = true;
            }
        } else {
            z11 = false;
        }
        while (true) {
            float[] fArr = this.f53006n;
            if (i7 >= fArr.length) {
                break;
            }
            float f14 = fArr[i7];
            float[] fArr2 = this.f53005m;
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
            this.f53001i.postInvalidateOnAnimation();
        }
    }
}
