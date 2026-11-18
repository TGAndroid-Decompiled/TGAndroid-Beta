package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
public final class wo0 {
    public final View f53474i;
    public boolean f53481p;
    public final org.telegram.ui.Components.mq f53482q;
    public final org.telegram.ui.Components.ue0 f53483r;
    public final PhotoViewer f53484s;
    public final PhotoViewer f53485t;
    public long f53468a = 0;
    public float f53469b = 0.0f;
    public float f53470c = 0.0f;
    public float d = 0.0f;
    public long f53471e = 0;
    public float f53472f = 0.0f;
    public final RectF f53473g = new RectF();
    public int h = -1;
    public final int f53475j = org.telegram.messenger.g0.L(64.0f);
    public int f53476k = -2;
    public float f53477l = 1.0f;
    public final float[] f53478m = new float[3];
    public final float[] f53479n = new float[3];
    public float f53480o = 1.0f;

    public wo0(PhotoViewer photoViewer, View view) {
        this.f53485t = photoViewer;
        this.f53484s = photoViewer;
        if (PhotoViewer.f43154c9 == null) {
            PhotoViewer.f43154c9 = new DecelerateInterpolator(1.5f);
            Paint paint = new Paint(1);
            PhotoViewer.f43155d9 = paint;
            paint.setStyle(Paint.Style.STROKE);
            PhotoViewer.f43155d9.setStrokeCap(Paint.Cap.ROUND);
            PhotoViewer.f43155d9.setStrokeWidth(org.telegram.messenger.g0.L(3.0f));
            PhotoViewer.f43155d9.setColor(-1);
        }
        this.f53474i = view;
        int i7 = 0;
        while (true) {
            float[] fArr = this.f53479n;
            if (i7 < fArr.length) {
                this.f53478m[i7] = 1.0f;
                fArr[i7] = 1.0f;
                i7++;
            } else {
                a();
                org.telegram.ui.Components.ue0 ue0Var = new org.telegram.ui.Components.ue0(28);
                this.f53483r = ue0Var;
                ue0Var.h = 200;
                this.f53482q = new org.telegram.ui.Components.mq(photoViewer.E.getDrawable(2131231006).mutate(), ue0Var);
                return;
            }
        }
    }

    public final void a() {
        boolean z10;
        int i7 = 0;
        while (true) {
            float[] fArr = this.f53479n;
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
        if (z10 != this.f53481p) {
            this.f53481p = z10;
            PhotoViewer photoViewer = this.f53485t;
            if (this == photoViewer.X0[0]) {
                photoViewer.p3();
            }
        }
    }

    public final int b() {
        int i7;
        int i10 = org.telegram.messenger.g0.f24121q.y;
        PhotoViewer photoViewer = this.f53484s;
        if (!photoViewer.f43320s) {
            i7 = org.telegram.messenger.g0.f24115m;
        } else {
            i7 = 0;
        }
        photoViewer.getClass();
        int i11 = (int) ((((i10 + i7) - ((int) (this.f53475j * this.f53480o))) / 2) + 0.0f);
        if (photoViewer.d2 == 1) {
            return i11 - org.telegram.messenger.g0.L(38.0f);
        }
        return i11;
    }

    public final void c(Canvas canvas) {
        int i7;
        Drawable drawable;
        float f10 = this.f53475j;
        int i10 = (int) (this.f53480o * f10);
        int width = (this.f53484s.f43208f0.getWidth() - ((int) (f10 * this.f53480o))) / 2;
        int b10 = b();
        float f11 = 1.0f;
        int i11 = 0;
        while (true) {
            float[] fArr = this.f53478m;
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
        int i12 = this.f53476k;
        Drawable drawable2 = this.f53482q;
        if (i12 >= 0) {
            Drawable[] drawableArr = PhotoViewer.Z8;
            if (i12 < drawableArr.length + 2) {
                if (i12 < drawableArr.length) {
                    drawable = drawableArr[i12];
                } else {
                    drawable = drawable2;
                }
                if (drawable != null) {
                    drawable.setAlpha((int) (this.f53477l * 255.0f * f11));
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
                    if (this.f53476k != -2) {
                        drawable2.setAlpha((int) org.telegram.messenger.f3.A(1.0f, this.f53477l, 255.0f, f11));
                    } else {
                        drawable2.setAlpha((int) (f11 * 255.0f));
                    }
                    drawable2.setBounds(width, b10, width + i10, b10 + i10);
                    drawable2.draw(canvas);
                }
            }
        }
        int i14 = this.h;
        if (i14 != 0 && i14 != 1 && (i7 = this.f53476k) != 0 && i7 != 1) {
            g(false);
            return;
        }
        int L = org.telegram.messenger.g0.L(4.0f);
        if (this.f53476k != -2) {
            PhotoViewer.f43155d9.setAlpha((int) (this.f53477l * 255.0f * f11));
        } else {
            PhotoViewer.f43155d9.setAlpha((int) (f11 * 255.0f));
        }
        RectF rectF = this.f53473g;
        rectF.set(width + L, b10 + L, (width + i10) - L, (b10 + i10) - L);
        canvas.drawArc(rectF, this.f53469b - 90.0f, Math.max(4.0f, this.f53472f * 360.0f), false, PhotoViewer.f43155d9);
        g(true);
    }

    public final void d(int i7, boolean z10, boolean z11) {
        int i10;
        boolean z12;
        int i11 = this.h;
        if (i11 == i7) {
            return;
        }
        View view = this.f53474i;
        org.telegram.ui.Components.ue0 ue0Var = this.f53483r;
        if (ue0Var != null) {
            if (z11 && (i11 == 3 || i11 == 4)) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (i7 == 3) {
                ue0Var.a(false, z12);
            } else if (i7 == 4) {
                ue0Var.a(true, z12);
            }
            ue0Var.f40322f = view;
            ue0Var.invalidateSelf();
        }
        this.f53468a = System.currentTimeMillis();
        if (z10 && (i10 = this.h) != i7) {
            this.f53476k = i10;
            this.f53477l = 1.0f;
        } else {
            this.f53476k = -2;
        }
        this.h = i7;
        PhotoViewer photoViewer = this.f53485t;
        if (this == photoViewer.X0[0]) {
            photoViewer.p3();
        }
        view.invalidate();
    }

    public final void e(int i7, float f10, boolean z10) {
        float[] fArr = this.f53479n;
        if (fArr[i7] != f10) {
            fArr[i7] = f10;
            if (!z10) {
                this.f53478m[i7] = f10;
            }
            a();
            this.f53474i.invalidate();
        }
    }

    public final void f(boolean z10, float f10) {
        if (!z10) {
            this.f53472f = f10;
            this.d = f10;
        } else {
            this.d = this.f53472f;
        }
        this.f53470c = f10;
        this.f53471e = 0L;
        this.f53474i.invalidate();
    }

    public final void g(boolean z10) {
        boolean z11;
        long currentTimeMillis = System.currentTimeMillis();
        long j3 = currentTimeMillis - this.f53468a;
        if (j3 > 18) {
            j3 = 18;
        }
        this.f53468a = currentTimeMillis;
        int i7 = 0;
        if (z10) {
            if (this.f53472f == 1.0f && this.f53470c == 1.0f) {
                z11 = false;
            } else {
                this.f53469b = (((float) (360 * j3)) / 3000.0f) + this.f53469b;
                float f10 = this.f53470c - this.d;
                if (Math.abs(f10) > 0.0f) {
                    long j10 = this.f53471e + j3;
                    this.f53471e = j10;
                    if (j10 >= 300) {
                        float f11 = this.f53470c;
                        this.f53472f = f11;
                        this.d = f11;
                        this.f53471e = 0L;
                    } else {
                        this.f53472f = (PhotoViewer.f43154c9.getInterpolation(((float) j10) / 300.0f) * f10) + this.d;
                    }
                }
                z11 = true;
            }
            float f12 = this.f53477l;
            if (f12 > 0.0f && this.f53476k != -2) {
                float f13 = f12 - (((float) j3) / 200.0f);
                this.f53477l = f13;
                if (f13 <= 0.0f) {
                    this.f53477l = 0.0f;
                    this.f53476k = -2;
                }
                z11 = true;
            }
        } else {
            z11 = false;
        }
        while (true) {
            float[] fArr = this.f53479n;
            if (i7 >= fArr.length) {
                break;
            }
            float f14 = fArr[i7];
            float[] fArr2 = this.f53478m;
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
            this.f53474i.postInvalidateOnAnimation();
        }
    }
}
