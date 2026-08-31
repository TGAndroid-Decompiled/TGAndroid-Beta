package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.view.animation.OvershootInterpolator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LiteMode;
public final class s51 extends org.telegram.ui.Components.gt {
    public int J;
    public int K;
    public ArrayList L;
    public final ArrayList M = new ArrayList();
    public float N = 1.0f;
    public final boolean O = LiteMode.isEnabled(8200);
    public final OvershootInterpolator P = new OvershootInterpolator(3.0f);
    public final t51 Q;

    public s51(t51 t51Var) {
        this.Q = t51Var;
    }

    @Override
    public final void a(android.graphics.Canvas r12, long r13, int r15, int r16, float r17) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.s51.a(android.graphics.Canvas, long, int, int, float):void");
    }

    @Override
    public final void b(Canvas canvas, Bitmap bitmap, Paint paint) {
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
    }

    @Override
    public final void c(Canvas canvas) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.M;
            if (i10 < arrayList.size()) {
                a61 a61Var = (a61) arrayList.get(i10);
                if (!a61Var.f35038b) {
                    if (a61Var.f35037a) {
                        a61Var.B.setBounds(a61Var.C);
                        a61Var.B.draw(canvas);
                    } else {
                        ImageReceiver imageReceiver = a61Var.f35043r;
                        if (imageReceiver != null) {
                            imageReceiver.draw(canvas, a61Var.f35041f[this.H]);
                        }
                    }
                }
                i10++;
            } else {
                return;
            }
        }
    }

    @Override
    public final void d(Canvas canvas, float f10) {
        float f11;
        boolean z4;
        Drawable drawable;
        int i10;
        r61 r61Var = this.Q.f41502b3;
        if (this.L != null) {
            canvas.save();
            float f12 = 0.0f;
            canvas.translate(-this.K, 0.0f);
            float f13 = f10;
            int i11 = 0;
            while (i11 < this.L.size()) {
                a61 a61Var = (a61) this.L.get(i11);
                if (!a61Var.f35038b) {
                    float scaleX = a61Var.getScaleX();
                    int i12 = r61Var.T;
                    if (i12 == 13) {
                        scaleX *= 0.87f;
                    }
                    float f14 = a61Var.K;
                    if (f14 != f12 || (a61Var.P > f12 && i12 != 3 && i12 != 4)) {
                        if (i12 != 3 && i12 != 4) {
                            f11 = a61Var.P * 0.7f;
                        } else {
                            f11 = 1.0f;
                        }
                        scaleX *= ((1.0f - Math.max(f11, f14)) * 0.2f) + 0.8f;
                    }
                    if (r61Var.M1 > 0 && SystemClock.elapsedRealtime() - r61Var.M1 < r61Var.g()) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (z4 && r61Var.K1 >= 0 && r61Var.L1 >= 0 && r61Var.M1 > 0) {
                        int R = RecyclerView.R(a61Var);
                        int i13 = r61Var.K1;
                        int i14 = R - i13;
                        int i15 = r61Var.L1 - i13;
                        if (i14 >= 0 && i14 < i15) {
                            float a2 = k7.o.a(((float) (SystemClock.elapsedRealtime() - r61Var.M1)) / ((float) r61Var.f()), 0.0f, 1.0f);
                            float f15 = i14;
                            float f16 = i15;
                            float f17 = f16 / 4.0f;
                            float cascade = AndroidUtilities.cascade(a2, f15, f16, f17);
                            scaleX *= (this.P.getInterpolation(AndroidUtilities.cascade(a2, f15, f16, f17)) * 0.5f) + 0.5f;
                            f13 = cascade;
                        }
                    } else {
                        f13 *= a61Var.getAlpha();
                    }
                    Rect rect = AndroidUtilities.rectTmp2;
                    rect.set(a61Var.getPaddingLeft() + ((int) a61Var.getX()), a61Var.getPaddingTop(), (a61Var.getWidth() + ((int) a61Var.getX())) - a61Var.getPaddingRight(), a61Var.getHeight() - a61Var.getPaddingBottom());
                    if (!r61Var.f40824t1 && !z4) {
                        rect.offset(0, (int) a61Var.getTranslationY());
                    }
                    if (a61Var.f35037a) {
                        drawable = r61Var.getPremiumStar();
                        int i16 = r61Var.T;
                        if (i16 == 5 || i16 == 10 || i16 == 9 || i16 == 7) {
                            rect.inset((int) ((-rect.width()) * 0.15f), (int) ((-rect.height()) * 0.15f));
                        }
                        drawable.setBounds(rect);
                        drawable.setAlpha(255);
                    } else if (!a61Var.f35044s && !a61Var.N) {
                        if ((a61Var.f35040e != null || r61Var.T == 13) && !a61Var.f35038b && (drawable = a61Var.B) != null) {
                            drawable.setAlpha(255);
                            drawable.setBounds(rect);
                        }
                    } else {
                        ImageReceiver imageReceiver = a61Var.h;
                        if (imageReceiver != null) {
                            imageReceiver.setImageCoords(rect);
                        }
                        drawable = null;
                    }
                    PorterDuffColorFilter porterDuffColorFilter = r61Var.f40799h1;
                    if (porterDuffColorFilter != null) {
                        Drawable drawable2 = a61Var.B;
                        if (drawable2 instanceof org.telegram.ui.Components.l5) {
                            drawable2.setColorFilter(porterDuffColorFilter);
                        }
                    }
                    float f18 = this.N;
                    a61Var.L = f18;
                    a61Var.M = i11;
                    if (scaleX == 1.0f && f18 >= 1.0f) {
                        m(canvas, drawable, a61Var, f13);
                    } else {
                        canvas.save();
                        float f19 = a61Var.P;
                        if (f19 > 1.0f && (i10 = r61Var.T) != 3 && i10 != 4 && i10 != 6) {
                            float lerp = AndroidUtilities.lerp(1.0f, 0.85f, f19);
                            canvas.scale(lerp, lerp, rect.centerX(), rect.centerY());
                        }
                        int i17 = r61Var.T;
                        if (i17 != 6 && i17 != 13 && i17 != 14) {
                            a61Var.getHeight();
                            float f20 = this.N;
                            if (f20 < 1.0f) {
                                canvas.scale(1.0f, f20, 0.0f, 0.0f);
                                canvas.skew((1.0f - this.N) * (1.0f - ((i11 * 2.0f) / this.L.size())), 0.0f);
                            }
                        } else {
                            canvas.scale(scaleX, scaleX, rect.centerX(), rect.centerY());
                        }
                        m(canvas, drawable, a61Var, f13);
                        canvas.restore();
                    }
                }
                i11++;
                f12 = 0.0f;
            }
            canvas.restore();
        }
    }

    @Override
    public final void g() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.M;
            if (i10 < arrayList.size()) {
                ImageReceiver.BackgroundThreadDrawHolder backgroundThreadDrawHolder = ((a61) arrayList.get(i10)).f35041f[this.H];
                if (backgroundThreadDrawHolder != null) {
                    backgroundThreadDrawHolder.release();
                }
                i10++;
            } else {
                this.Q.f41502b3.f40791e0.invalidate();
                return;
            }
        }
    }

    @Override
    public final void i(long r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.s51.i(long):void");
    }

    public final void m(Canvas canvas, Drawable drawable, a61 a61Var, float f10) {
        if (drawable != null) {
            drawable.setAlpha((int) (f10 * 255.0f));
            drawable.draw(canvas);
            drawable.setColorFilter(this.Q.f41502b3.f40799h1);
        } else if ((a61Var.f35044s || a61Var.N) && a61Var.h != null) {
            canvas.save();
            canvas.clipRect(a61Var.h.getImageX(), a61Var.h.getImageY(), a61Var.h.getImageX2(), a61Var.h.getImageY2());
            a61Var.h.setAlpha(f10);
            a61Var.h.draw(canvas);
            canvas.restore();
        }
    }
}
