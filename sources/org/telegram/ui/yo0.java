package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
public final class yo0 {
    public final View f52083i;
    public boolean f52090p;
    public final org.telegram.ui.Components.xp f52091q;
    public final org.telegram.ui.Components.he0 f52092r;
    public final PhotoViewer f52093s;
    public final PhotoViewer f52094t;
    public long f52077a = 0;
    public float f52078b = 0.0f;
    public float f52079c = 0.0f;
    public float d = 0.0f;
    public long f52080e = 0;
    public float f52081f = 0.0f;
    public final RectF f52082g = new RectF();
    public int h = -1;
    public final int f52084j = org.telegram.messenger.g0.L(64.0f);
    public int f52085k = -2;
    public float f52086l = 1.0f;
    public final float[] f52087m = new float[3];
    public final float[] f52088n = new float[3];
    public float f52089o = 1.0f;

    public yo0(PhotoViewer photoViewer, View view) {
        this.f52094t = photoViewer;
        this.f52093s = photoViewer;
        if (PhotoViewer.f41338b9 == null) {
            PhotoViewer.f41338b9 = new DecelerateInterpolator(1.5f);
            Paint paint = new Paint(1);
            PhotoViewer.f41339c9 = paint;
            paint.setStyle(Paint.Style.STROKE);
            PhotoViewer.f41339c9.setStrokeCap(Paint.Cap.ROUND);
            PhotoViewer.f41339c9.setStrokeWidth(org.telegram.messenger.g0.L(3.0f));
            PhotoViewer.f41339c9.setColor(-1);
        }
        this.f52083i = view;
        int i7 = 0;
        while (true) {
            float[] fArr = this.f52088n;
            if (i7 < fArr.length) {
                this.f52087m[i7] = 1.0f;
                fArr[i7] = 1.0f;
                i7++;
            } else {
                a();
                org.telegram.ui.Components.he0 he0Var = new org.telegram.ui.Components.he0(28);
                this.f52092r = he0Var;
                he0Var.h = 200;
                this.f52091q = new org.telegram.ui.Components.xp(photoViewer.D.getDrawable(2131231006).mutate(), he0Var);
                return;
            }
        }
    }

    public final void a() {
        boolean z9;
        int i7 = 0;
        while (true) {
            float[] fArr = this.f52088n;
            if (i7 < fArr.length) {
                if (fArr[i7] != 1.0f) {
                    z9 = false;
                    break;
                }
                i7++;
            } else {
                z9 = true;
                break;
            }
        }
        if (z9 != this.f52090p) {
            this.f52090p = z9;
            PhotoViewer photoViewer = this.f52094t;
            if (this == photoViewer.W0[0]) {
                photoViewer.o3();
            }
        }
    }

    public final int b() {
        int i7;
        int i10 = org.telegram.messenger.g0.f22567q.y;
        PhotoViewer photoViewer = this.f52093s;
        if (!photoViewer.f41504s) {
            i7 = org.telegram.messenger.g0.f22561m;
        } else {
            i7 = 0;
        }
        photoViewer.getClass();
        int i11 = (int) ((((i10 + i7) - ((int) (this.f52084j * this.f52089o))) / 2) + 0.0f);
        if (photoViewer.f41366c2 == 1) {
            return i11 - org.telegram.messenger.g0.L(38.0f);
        }
        return i11;
    }

    public final void c(Canvas canvas) {
        int i7;
        Drawable drawable;
        float f10 = this.f52084j;
        int i10 = (int) (this.f52089o * f10);
        int width = (this.f52093s.f41382e0.getWidth() - ((int) (f10 * this.f52089o))) / 2;
        int b10 = b();
        float f11 = 1.0f;
        int i11 = 0;
        while (true) {
            float[] fArr = this.f52087m;
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
        int i12 = this.f52085k;
        Drawable drawable2 = this.f52091q;
        if (i12 >= 0) {
            Drawable[] drawableArr = PhotoViewer.Y8;
            if (i12 < drawableArr.length + 2) {
                if (i12 < drawableArr.length) {
                    drawable = drawableArr[i12];
                } else {
                    drawable = drawable2;
                }
                if (drawable != null) {
                    drawable.setAlpha((int) (this.f52086l * 255.0f * f11));
                    drawable.setBounds(width, b10, width + i10, b10 + i10);
                    drawable.draw(canvas);
                }
            }
        }
        int i13 = this.h;
        if (i13 >= 0) {
            Drawable[] drawableArr2 = PhotoViewer.Y8;
            if (i13 < drawableArr2.length + 2) {
                if (i13 < drawableArr2.length) {
                    drawable2 = drawableArr2[i13];
                }
                if (drawable2 != null) {
                    if (this.f52085k != -2) {
                        drawable2.setAlpha((int) org.telegram.messenger.k5.A(1.0f, this.f52086l, 255.0f, f11));
                    } else {
                        drawable2.setAlpha((int) (f11 * 255.0f));
                    }
                    drawable2.setBounds(width, b10, width + i10, b10 + i10);
                    drawable2.draw(canvas);
                }
            }
        }
        int i14 = this.h;
        if (i14 != 0 && i14 != 1 && (i7 = this.f52085k) != 0 && i7 != 1) {
            g(false);
            return;
        }
        int L = org.telegram.messenger.g0.L(4.0f);
        if (this.f52085k != -2) {
            PhotoViewer.f41339c9.setAlpha((int) (this.f52086l * 255.0f * f11));
        } else {
            PhotoViewer.f41339c9.setAlpha((int) (f11 * 255.0f));
        }
        RectF rectF = this.f52082g;
        rectF.set(width + L, b10 + L, (width + i10) - L, (b10 + i10) - L);
        canvas.drawArc(rectF, this.f52078b - 90.0f, Math.max(4.0f, this.f52081f * 360.0f), false, PhotoViewer.f41339c9);
        g(true);
    }

    public final void d(int i7, boolean z9, boolean z10) {
        int i10;
        boolean z11;
        int i11 = this.h;
        if (i11 == i7) {
            return;
        }
        View view = this.f52083i;
        org.telegram.ui.Components.he0 he0Var = this.f52092r;
        if (he0Var != null) {
            if (z10 && (i11 == 3 || i11 == 4)) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (i7 == 3) {
                he0Var.a(false, z11);
            } else if (i7 == 4) {
                he0Var.a(true, z11);
            }
            he0Var.f34325f = view;
            he0Var.invalidateSelf();
        }
        this.f52077a = System.currentTimeMillis();
        if (z9 && (i10 = this.h) != i7) {
            this.f52085k = i10;
            this.f52086l = 1.0f;
        } else {
            this.f52085k = -2;
        }
        this.h = i7;
        PhotoViewer photoViewer = this.f52094t;
        if (this == photoViewer.W0[0]) {
            photoViewer.o3();
        }
        view.invalidate();
    }

    public final void e(int i7, float f10, boolean z9) {
        float[] fArr = this.f52088n;
        if (fArr[i7] != f10) {
            fArr[i7] = f10;
            if (!z9) {
                this.f52087m[i7] = f10;
            }
            a();
            this.f52083i.invalidate();
        }
    }

    public final void f(boolean z9, float f10) {
        if (!z9) {
            this.f52081f = f10;
            this.d = f10;
        } else {
            this.d = this.f52081f;
        }
        this.f52079c = f10;
        this.f52080e = 0L;
        this.f52083i.invalidate();
    }

    public final void g(boolean z9) {
        boolean z10;
        long currentTimeMillis = System.currentTimeMillis();
        long j3 = currentTimeMillis - this.f52077a;
        if (j3 > 18) {
            j3 = 18;
        }
        this.f52077a = currentTimeMillis;
        int i7 = 0;
        if (z9) {
            if (this.f52081f == 1.0f && this.f52079c == 1.0f) {
                z10 = false;
            } else {
                this.f52078b = (((float) (360 * j3)) / 3000.0f) + this.f52078b;
                float f10 = this.f52079c - this.d;
                if (Math.abs(f10) > 0.0f) {
                    long j10 = this.f52080e + j3;
                    this.f52080e = j10;
                    if (j10 >= 300) {
                        float f11 = this.f52079c;
                        this.f52081f = f11;
                        this.d = f11;
                        this.f52080e = 0L;
                    } else {
                        this.f52081f = (PhotoViewer.f41338b9.getInterpolation(((float) j10) / 300.0f) * f10) + this.d;
                    }
                }
                z10 = true;
            }
            float f12 = this.f52086l;
            if (f12 > 0.0f && this.f52085k != -2) {
                float f13 = f12 - (((float) j3) / 200.0f);
                this.f52086l = f13;
                if (f13 <= 0.0f) {
                    this.f52086l = 0.0f;
                    this.f52085k = -2;
                }
                z10 = true;
            }
        } else {
            z10 = false;
        }
        while (true) {
            float[] fArr = this.f52088n;
            if (i7 >= fArr.length) {
                break;
            }
            float f14 = fArr[i7];
            float[] fArr2 = this.f52087m;
            float f15 = fArr2[i7];
            if (f14 > f15) {
                fArr2[i7] = org.telegram.ui.Cells.f1.e((float) j3, 200.0f, f15, 1.0f);
            } else if (f14 < f15) {
                fArr2[i7] = org.telegram.ui.Cells.f1.v((float) j3, 200.0f, f15, 0.0f);
            } else {
                i7++;
            }
            z10 = true;
            i7++;
        }
        if (z10) {
            this.f52083i.postInvalidateOnAnimation();
        }
    }
}
