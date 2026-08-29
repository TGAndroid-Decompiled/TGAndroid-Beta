package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
public abstract class vt0 {
    public final View f43739i;
    public boolean f43746p;
    public final org.telegram.ui.Components.jq f43747q;
    public final org.telegram.ui.Components.cg0 f43748r;
    public final PhotoViewer f43749s;
    public long f43733a = 0;
    public float f43734b = 0.0f;
    public float f43735c = 0.0f;
    public float d = 0.0f;
    public long f43736e = 0;
    public float f43737f = 0.0f;
    public final RectF f43738g = new RectF();
    public int h = -1;
    public final int f43740j = AndroidUtilities.dp(64.0f);
    public int f43741k = -2;
    public float f43742l = 1.0f;
    public final float[] f43743m = new float[3];
    public final float[] f43744n = new float[3];
    public float f43745o = 1.0f;

    public vt0(PhotoViewer photoViewer, View view) {
        this.f43749s = photoViewer;
        if (PhotoViewer.S8 == null) {
            PhotoViewer.S8 = new DecelerateInterpolator(1.5f);
            Paint paint = new Paint(1);
            PhotoViewer.T8 = paint;
            paint.setStyle(Paint.Style.STROKE);
            PhotoViewer.T8.setStrokeCap(Paint.Cap.ROUND);
            PhotoViewer.T8.setStrokeWidth(AndroidUtilities.dp(3.0f));
            PhotoViewer.T8.setColor(-1);
        }
        this.f43739i = view;
        int i10 = 0;
        while (true) {
            float[] fArr = this.f43744n;
            if (i10 < fArr.length) {
                this.f43743m[i10] = 1.0f;
                fArr[i10] = 1.0f;
                i10++;
            } else {
                a();
                org.telegram.ui.Components.cg0 cg0Var = new org.telegram.ui.Components.cg0(28);
                this.f43748r = cg0Var;
                cg0Var.h = 200;
                this.f43747q = new org.telegram.ui.Components.jq(photoViewer.f35864y.getDrawable(R.drawable.circle_big).mutate(), cg0Var);
                return;
            }
        }
    }

    public final void a() {
        boolean z10;
        int i10 = 0;
        while (true) {
            float[] fArr = this.f43744n;
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
        if (z10 != this.f43746p) {
            this.f43746p = z10;
            tr0 tr0Var = (tr0) this;
            PhotoViewer photoViewer = tr0Var.f43091t;
            if (tr0Var == photoViewer.S0[0]) {
                photoViewer.r3();
            }
        }
    }

    public final int b() {
        int i10;
        int i11 = AndroidUtilities.displaySize.y;
        PhotoViewer photoViewer = this.f43749s;
        if (!photoViewer.f35808s) {
            i10 = AndroidUtilities.statusBarHeight;
        } else {
            i10 = 0;
        }
        photoViewer.getClass();
        int i12 = (int) ((((i11 + i10) - ((int) (this.f43740j * this.f43745o))) / 2) + 0.0f);
        if (photoViewer.Y1 == 1) {
            return i12 - AndroidUtilities.dp(38.0f);
        }
        return i12;
    }

    public final void c(Canvas canvas) {
        int i10;
        Drawable drawable;
        float f9 = this.f43740j;
        int i11 = (int) (this.f43745o * f9);
        int width = (this.f43749s.f35647a0.getWidth() - ((int) (f9 * this.f43745o))) / 2;
        int b10 = b();
        int i12 = 0;
        float f10 = 1.0f;
        while (true) {
            float[] fArr = this.f43743m;
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
        int i13 = this.f43741k;
        Drawable drawable2 = this.f43747q;
        if (i13 >= 0) {
            Drawable[] drawableArr = PhotoViewer.P8;
            if (i13 < drawableArr.length + 2) {
                if (i13 < drawableArr.length) {
                    drawable = drawableArr[i13];
                } else {
                    drawable = drawable2;
                }
                if (drawable != null) {
                    drawable.setAlpha((int) (this.f43742l * 255.0f * f10));
                    drawable.setBounds(width, b10, width + i11, b10 + i11);
                    drawable.draw(canvas);
                }
            }
        }
        int i14 = this.h;
        if (i14 >= 0) {
            Drawable[] drawableArr2 = PhotoViewer.P8;
            if (i14 < drawableArr2.length + 2) {
                if (i14 < drawableArr2.length) {
                    drawable2 = drawableArr2[i14];
                }
                if (drawable2 != null) {
                    if (this.f43741k != -2) {
                        drawable2.setAlpha((int) org.telegram.messenger.x3.y(1.0f, this.f43742l, 255.0f, f10));
                    } else {
                        drawable2.setAlpha((int) (f10 * 255.0f));
                    }
                    drawable2.setBounds(width, b10, width + i11, b10 + i11);
                    drawable2.draw(canvas);
                }
            }
        }
        int i15 = this.h;
        if (i15 != 0 && i15 != 1 && (i10 = this.f43741k) != 0 && i10 != 1) {
            g(false);
            return;
        }
        int dp = AndroidUtilities.dp(4.0f);
        if (this.f43741k != -2) {
            PhotoViewer.T8.setAlpha((int) (this.f43742l * 255.0f * f10));
        } else {
            PhotoViewer.T8.setAlpha((int) (f10 * 255.0f));
        }
        RectF rectF = this.f43738g;
        rectF.set(width + dp, b10 + dp, (width + i11) - dp, (b10 + i11) - dp);
        canvas.drawArc(rectF, this.f43734b - 90.0f, Math.max(4.0f, this.f43737f * 360.0f), false, PhotoViewer.T8);
        g(true);
    }

    public final void d(int i10, boolean z10, boolean z11) {
        int i11;
        boolean z12;
        int i12 = this.h;
        if (i12 == i10) {
            return;
        }
        View view = this.f43739i;
        org.telegram.ui.Components.cg0 cg0Var = this.f43748r;
        if (cg0Var != null) {
            if (z11 && (i12 == 3 || i12 == 4)) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (i10 == 3) {
                cg0Var.a(false, z12);
            } else if (i10 == 4) {
                cg0Var.a(true, z12);
            }
            cg0Var.f27482f = view;
            cg0Var.invalidateSelf();
        }
        this.f43733a = System.currentTimeMillis();
        if (z10 && (i11 = this.h) != i10) {
            this.f43741k = i11;
            this.f43742l = 1.0f;
        } else {
            this.f43741k = -2;
        }
        this.h = i10;
        tr0 tr0Var = (tr0) this;
        PhotoViewer photoViewer = tr0Var.f43091t;
        if (tr0Var == photoViewer.S0[0]) {
            photoViewer.r3();
        }
        view.invalidate();
    }

    public final void e(int i10, float f9, boolean z10) {
        float[] fArr = this.f43744n;
        if (fArr[i10] != f9) {
            fArr[i10] = f9;
            if (!z10) {
                this.f43743m[i10] = f9;
            }
            a();
            this.f43739i.invalidate();
        }
    }

    public final void f(float f9, boolean z10) {
        if (!z10) {
            this.f43737f = f9;
            this.d = f9;
        } else {
            this.d = this.f43737f;
        }
        this.f43735c = f9;
        this.f43736e = 0L;
        this.f43739i.invalidate();
    }

    public final void g(boolean z10) {
        boolean z11;
        long currentTimeMillis = System.currentTimeMillis();
        long j10 = currentTimeMillis - this.f43733a;
        if (j10 > 18) {
            j10 = 18;
        }
        this.f43733a = currentTimeMillis;
        int i10 = 0;
        if (z10) {
            if (this.f43737f == 1.0f && this.f43735c == 1.0f) {
                z11 = false;
            } else {
                this.f43734b = (((float) (360 * j10)) / 3000.0f) + this.f43734b;
                float f9 = this.f43735c - this.d;
                if (Math.abs(f9) > 0.0f) {
                    long j11 = this.f43736e + j10;
                    this.f43736e = j11;
                    if (j11 >= 300) {
                        float f10 = this.f43735c;
                        this.f43737f = f10;
                        this.d = f10;
                        this.f43736e = 0L;
                    } else {
                        this.f43737f = (PhotoViewer.S8.getInterpolation(((float) j11) / 300.0f) * f9) + this.d;
                    }
                }
                z11 = true;
            }
            float f11 = this.f43742l;
            if (f11 > 0.0f && this.f43741k != -2) {
                float f12 = f11 - (((float) j10) / 200.0f);
                this.f43742l = f12;
                if (f12 <= 0.0f) {
                    this.f43742l = 0.0f;
                    this.f43741k = -2;
                }
                z11 = true;
            }
        } else {
            z11 = false;
        }
        while (true) {
            float[] fArr = this.f43744n;
            if (i10 >= fArr.length) {
                break;
            }
            float f13 = fArr[i10];
            float[] fArr2 = this.f43743m;
            float f14 = fArr2[i10];
            if (f13 > f14) {
                fArr2[i10] = Math.min(1.0f, (((float) j10) / 200.0f) + f14);
            } else if (f13 < f14) {
                fArr2[i10] = Math.max(0.0f, f14 - (((float) j10) / 200.0f));
            } else {
                i10++;
            }
            z11 = true;
            i10++;
        }
        if (z11) {
            this.f43739i.postInvalidateOnAnimation();
        }
    }
}
