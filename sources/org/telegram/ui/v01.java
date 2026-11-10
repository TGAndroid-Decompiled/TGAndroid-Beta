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
import org.telegram.messenger.ImageReceiver;
public final class v01 extends org.telegram.ui.Components.hs {
    public int M;
    public int N;
    public ArrayList O;
    public final ArrayList P = new ArrayList();
    public float Q = 1.0f;
    public final boolean R = org.telegram.messenger.sc.e(8200);
    public final OvershootInterpolator S = new OvershootInterpolator(3.0f);
    public final w01 T;

    public v01(w01 w01Var) {
        this.T = w01Var;
    }

    @Override
    public final void a(android.graphics.Canvas r12, long r13, int r15, int r16, float r17) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.v01.a(android.graphics.Canvas, long, int, int, float):void");
    }

    @Override
    public final void b(Canvas canvas, Bitmap bitmap, Paint paint) {
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
    }

    @Override
    public final void c(Canvas canvas) {
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.P;
            if (i7 < arrayList.size()) {
                d11 d11Var = (d11) arrayList.get(i7);
                if (!d11Var.f44872b) {
                    if (d11Var.f44871a) {
                        d11Var.E.setBounds(d11Var.F);
                        d11Var.E.draw(canvas);
                    } else {
                        ImageReceiver imageReceiver = d11Var.f44877r;
                        if (imageReceiver != null) {
                            imageReceiver.h(canvas, d11Var.f44875f[this.K]);
                        }
                    }
                }
                i7++;
            } else {
                return;
            }
        }
    }

    @Override
    public final void d(Canvas canvas, float f10) {
        float f11;
        int i7;
        Drawable drawable;
        int i10;
        t11 t11Var = this.T.f50862l3;
        if (this.O != null) {
            canvas.save();
            canvas.translate(-this.N, 0.0f);
            int i11 = 0;
            float f12 = f10;
            int i12 = 0;
            while (i12 < this.O.size()) {
                d11 d11Var = (d11) this.O.get(i12);
                if (!d11Var.f44872b) {
                    float scaleX = d11Var.getScaleX();
                    int i13 = t11Var.W;
                    if (i13 == 13) {
                        scaleX *= 0.87f;
                    }
                    float f13 = d11Var.N;
                    if (f13 != 0.0f || (d11Var.S > 0.0f && i13 != 3 && i13 != 4)) {
                        if (i13 != 3 && i13 != 4) {
                            f11 = d11Var.S * 0.7f;
                        } else {
                            f11 = 1.0f;
                        }
                        scaleX *= ((1.0f - Math.max(f11, f13)) * 0.2f) + 0.8f;
                    }
                    if (t11Var.Q1 > 0 && SystemClock.elapsedRealtime() - t11Var.Q1 < t11Var.g()) {
                        i7 = 1;
                    } else {
                        i7 = i11;
                    }
                    if (i7 != 0 && t11Var.O1 >= 0 && t11Var.P1 >= 0 && t11Var.Q1 > 0) {
                        int R = RecyclerView.R(d11Var);
                        int i14 = t11Var.O1;
                        int i15 = R - i14;
                        int i16 = t11Var.P1 - i14;
                        if (i15 >= 0 && i15 < i16) {
                            float a10 = c8.j9.a(((float) (SystemClock.elapsedRealtime() - t11Var.Q1)) / ((float) t11Var.f()), 0.0f, 1.0f);
                            float f14 = i15;
                            float f15 = i16;
                            float f16 = f15 / 4.0f;
                            float s5 = org.telegram.messenger.g0.s(a10, f14, f15, f16);
                            scaleX *= (this.S.getInterpolation(org.telegram.messenger.g0.s(a10, f14, f15, f16)) * 0.5f) + 0.5f;
                            f12 = s5;
                        }
                    } else {
                        f12 *= d11Var.getAlpha();
                    }
                    Rect rect = org.telegram.messenger.g0.Q;
                    rect.set(d11Var.getPaddingLeft() + ((int) d11Var.getX()), d11Var.getPaddingTop(), (d11Var.getWidth() + ((int) d11Var.getX())) - d11Var.getPaddingRight(), d11Var.getHeight() - d11Var.getPaddingBottom());
                    if (!t11Var.f50071x1 && i7 == 0) {
                        rect.offset(i11, (int) d11Var.getTranslationY());
                    }
                    if (d11Var.f44871a) {
                        drawable = t11Var.getPremiumStar();
                        int i17 = t11Var.W;
                        if (i17 == 5 || i17 == 10 || i17 == 9 || i17 == 7) {
                            rect.inset((int) ((-rect.width()) * 0.15f), (int) ((-rect.height()) * 0.15f));
                        }
                        drawable.setBounds(rect);
                        drawable.setAlpha(255);
                    } else if (!d11Var.f44878s && !d11Var.Q) {
                        if ((d11Var.f44874e != null || t11Var.W == 13) && !d11Var.f44872b && (drawable = d11Var.E) != null) {
                            drawable.setAlpha(255);
                            drawable.setBounds(rect);
                        }
                    } else {
                        ImageReceiver imageReceiver = d11Var.h;
                        if (imageReceiver != null) {
                            imageReceiver.z0(rect);
                        }
                        drawable = null;
                    }
                    PorterDuffColorFilter porterDuffColorFilter = t11Var.f50043k1;
                    if (porterDuffColorFilter != null) {
                        Drawable drawable2 = d11Var.E;
                        if (drawable2 instanceof org.telegram.ui.Components.h5) {
                            drawable2.setColorFilter(porterDuffColorFilter);
                        }
                    }
                    float f17 = this.Q;
                    d11Var.O = f17;
                    d11Var.P = i12;
                    if (scaleX == 1.0f && f17 >= 1.0f) {
                        m(canvas, drawable, d11Var, f12);
                    } else {
                        canvas.save();
                        float f18 = d11Var.S;
                        if (f18 > 1.0f && (i10 = t11Var.W) != 3 && i10 != 4 && i10 != 6) {
                            float T1 = org.telegram.messenger.g0.T1(1.0f, 0.85f, f18);
                            canvas.scale(T1, T1, rect.centerX(), rect.centerY());
                        }
                        int i18 = t11Var.W;
                        if (i18 != 6 && i18 != 13 && i18 != 14) {
                            d11Var.getHeight();
                            float f19 = this.Q;
                            if (f19 < 1.0f) {
                                canvas.scale(1.0f, f19, 0.0f, 0.0f);
                                canvas.skew((1.0f - this.Q) * (1.0f - ((i12 * 2.0f) / this.O.size())), 0.0f);
                            }
                        } else {
                            canvas.scale(scaleX, scaleX, rect.centerX(), rect.centerY());
                        }
                        m(canvas, drawable, d11Var, f12);
                        canvas.restore();
                    }
                }
                i12++;
                i11 = 0;
            }
            canvas.restore();
        }
    }

    @Override
    public final void g() {
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.P;
            if (i7 < arrayList.size()) {
                org.telegram.messenger.ic icVar = ((d11) arrayList.get(i7)).f44875f[this.K];
                if (icVar != null) {
                    icVar.a();
                }
                i7++;
            } else {
                this.T.f50862l3.f50036h0.invalidate();
                return;
            }
        }
    }

    @Override
    public final void i(long r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.v01.i(long):void");
    }

    public final void m(Canvas canvas, Drawable drawable, d11 d11Var, float f10) {
        if (drawable != null) {
            drawable.setAlpha((int) (f10 * 255.0f));
            drawable.draw(canvas);
            drawable.setColorFilter(this.T.f50862l3.f50043k1);
        } else if ((d11Var.f44878s || d11Var.Q) && d11Var.h != null) {
            canvas.save();
            ImageReceiver imageReceiver = d11Var.h;
            canvas.clipRect(imageReceiver.K0, imageReceiver.L0, imageReceiver.y(), d11Var.h.A());
            d11Var.h.setAlpha(f10);
            d11Var.h.h(canvas, null);
            canvas.restore();
        }
    }
}
