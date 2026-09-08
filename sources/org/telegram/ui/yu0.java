package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
public abstract class yu0 {
    public final View f43241i;
    public boolean f43248p;
    public final org.telegram.ui.Components.oq f43249q;
    public final org.telegram.ui.Components.fg0 f43250r;
    public final PhotoViewer f43251s;
    public long f43235a = 0;
    public float f43236b = 0.0f;
    public float f43237c = 0.0f;
    public float d = 0.0f;
    public long f43238e = 0;
    public float f43239f = 0.0f;
    public final RectF f43240g = new RectF();
    public int h = -1;
    public final int f43242j = AndroidUtilities.dp(64.0f);
    public int f43243k = -2;
    public float f43244l = 1.0f;
    public final float[] f43245m = new float[3];
    public final float[] f43246n = new float[3];
    public float f43247o = 1.0f;

    public yu0(PhotoViewer photoViewer, View view) {
        this.f43251s = photoViewer;
        if (PhotoViewer.W8 == null) {
            PhotoViewer.W8 = new DecelerateInterpolator(1.5f);
            Paint paint = new Paint(1);
            PhotoViewer.X8 = paint;
            paint.setStyle(Paint.Style.STROKE);
            PhotoViewer.X8.setStrokeCap(Paint.Cap.ROUND);
            PhotoViewer.X8.setStrokeWidth(AndroidUtilities.dp(3.0f));
            PhotoViewer.X8.setColor(-1);
        }
        this.f43241i = view;
        int i10 = 0;
        while (true) {
            float[] fArr = this.f43246n;
            if (i10 < fArr.length) {
                this.f43245m[i10] = 1.0f;
                fArr[i10] = 1.0f;
                i10++;
            } else {
                a();
                org.telegram.ui.Components.fg0 fg0Var = new org.telegram.ui.Components.fg0(28);
                this.f43250r = fg0Var;
                fg0Var.h = 200;
                this.f43249q = new org.telegram.ui.Components.oq(photoViewer.f33754y.getDrawable(R.drawable.circle_big).mutate(), fg0Var);
                return;
            }
        }
    }

    public final void a() {
        boolean z10;
        int i10 = 0;
        while (true) {
            float[] fArr = this.f43246n;
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
        if (z10 != this.f43248p) {
            this.f43248p = z10;
            ws0 ws0Var = (ws0) this;
            PhotoViewer photoViewer = ws0Var.f42501t;
            if (ws0Var == photoViewer.W0[0]) {
                photoViewer.r3();
            }
        }
    }

    public final int b() {
        int i10;
        int i11 = AndroidUtilities.displaySize.y;
        PhotoViewer photoViewer = this.f43251s;
        if (!photoViewer.f33697s) {
            i10 = AndroidUtilities.statusBarHeight;
        } else {
            i10 = 0;
        }
        photoViewer.getClass();
        int i12 = (int) ((((i11 + i10) - ((int) (this.f43242j * this.f43247o))) / 2) + 0.0f);
        if (photoViewer.f33559c2 == 1) {
            return i12 - AndroidUtilities.dp(38.0f);
        }
        return i12;
    }

    public final void c(Canvas canvas) {
        int i10;
        Drawable drawable;
        float f7 = this.f43242j;
        int i11 = (int) (this.f43247o * f7);
        int width = (this.f43251s.f33576e0.getWidth() - ((int) (f7 * this.f43247o))) / 2;
        int b10 = b();
        int i12 = 0;
        float f10 = 1.0f;
        while (true) {
            float[] fArr = this.f43245m;
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
        int i13 = this.f43243k;
        Drawable drawable2 = this.f43249q;
        if (i13 >= 0) {
            Drawable[] drawableArr = PhotoViewer.T8;
            if (i13 < drawableArr.length + 2) {
                if (i13 < drawableArr.length) {
                    drawable = drawableArr[i13];
                } else {
                    drawable = drawable2;
                }
                if (drawable != null) {
                    drawable.setAlpha((int) (this.f43244l * 255.0f * f10));
                    drawable.setBounds(width, b10, width + i11, b10 + i11);
                    drawable.draw(canvas);
                }
            }
        }
        int i14 = this.h;
        if (i14 >= 0) {
            Drawable[] drawableArr2 = PhotoViewer.T8;
            if (i14 < drawableArr2.length + 2) {
                if (i14 < drawableArr2.length) {
                    drawable2 = drawableArr2[i14];
                }
                if (drawable2 != null) {
                    if (this.f43243k != -2) {
                        drawable2.setAlpha((int) org.telegram.messenger.w1.A(1.0f, this.f43244l, 255.0f, f10));
                    } else {
                        drawable2.setAlpha((int) (f10 * 255.0f));
                    }
                    drawable2.setBounds(width, b10, width + i11, b10 + i11);
                    drawable2.draw(canvas);
                }
            }
        }
        int i15 = this.h;
        if (i15 != 0 && i15 != 1 && (i10 = this.f43243k) != 0 && i10 != 1) {
            g(false);
            return;
        }
        int dp = AndroidUtilities.dp(4.0f);
        if (this.f43243k != -2) {
            PhotoViewer.X8.setAlpha((int) (this.f43244l * 255.0f * f10));
        } else {
            PhotoViewer.X8.setAlpha((int) (f10 * 255.0f));
        }
        RectF rectF = this.f43240g;
        rectF.set(width + dp, b10 + dp, (width + i11) - dp, (b10 + i11) - dp);
        canvas.drawArc(rectF, this.f43236b - 90.0f, Math.max(4.0f, this.f43239f * 360.0f), false, PhotoViewer.X8);
        g(true);
    }

    public final void d(int i10, boolean z10, boolean z11) {
        int i11;
        boolean z12;
        int i12 = this.h;
        if (i12 == i10) {
            return;
        }
        View view = this.f43241i;
        org.telegram.ui.Components.fg0 fg0Var = this.f43250r;
        if (fg0Var != null) {
            if (z11 && (i12 == 3 || i12 == 4)) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (i10 == 3) {
                fg0Var.a(false, z12);
            } else if (i10 == 4) {
                fg0Var.a(true, z12);
            }
            fg0Var.f26068f = view;
            fg0Var.invalidateSelf();
        }
        this.f43235a = System.currentTimeMillis();
        if (z10 && (i11 = this.h) != i10) {
            this.f43243k = i11;
            this.f43244l = 1.0f;
        } else {
            this.f43243k = -2;
        }
        this.h = i10;
        ws0 ws0Var = (ws0) this;
        PhotoViewer photoViewer = ws0Var.f42501t;
        if (ws0Var == photoViewer.W0[0]) {
            photoViewer.r3();
        }
        view.invalidate();
    }

    public final void e(int i10, float f7, boolean z10) {
        float[] fArr = this.f43246n;
        if (fArr[i10] != f7) {
            fArr[i10] = f7;
            if (!z10) {
                this.f43245m[i10] = f7;
            }
            a();
            this.f43241i.invalidate();
        }
    }

    public final void f(float f7, boolean z10) {
        if (!z10) {
            this.f43239f = f7;
            this.d = f7;
        } else {
            this.d = this.f43239f;
        }
        this.f43237c = f7;
        this.f43238e = 0L;
        this.f43241i.invalidate();
    }

    public final void g(boolean z10) {
        boolean z11;
        long currentTimeMillis = System.currentTimeMillis();
        long j3 = currentTimeMillis - this.f43235a;
        if (j3 > 18) {
            j3 = 18;
        }
        this.f43235a = currentTimeMillis;
        int i10 = 0;
        if (z10) {
            if (this.f43239f == 1.0f && this.f43237c == 1.0f) {
                z11 = false;
            } else {
                this.f43236b = (((float) (360 * j3)) / 3000.0f) + this.f43236b;
                float f7 = this.f43237c - this.d;
                if (Math.abs(f7) > 0.0f) {
                    long j10 = this.f43238e + j3;
                    this.f43238e = j10;
                    if (j10 >= 300) {
                        float f10 = this.f43237c;
                        this.f43239f = f10;
                        this.d = f10;
                        this.f43238e = 0L;
                    } else {
                        this.f43239f = (PhotoViewer.W8.getInterpolation(((float) j10) / 300.0f) * f7) + this.d;
                    }
                }
                z11 = true;
            }
            float f11 = this.f43244l;
            if (f11 > 0.0f && this.f43243k != -2) {
                float f12 = f11 - (((float) j3) / 200.0f);
                this.f43244l = f12;
                if (f12 <= 0.0f) {
                    this.f43244l = 0.0f;
                    this.f43243k = -2;
                }
                z11 = true;
            }
        } else {
            z11 = false;
        }
        while (true) {
            float[] fArr = this.f43246n;
            if (i10 >= fArr.length) {
                break;
            }
            float f13 = fArr[i10];
            float[] fArr2 = this.f43245m;
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
            this.f43241i.postInvalidateOnAnimation();
        }
    }
}
