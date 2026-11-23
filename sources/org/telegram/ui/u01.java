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
public final class u01 extends org.telegram.ui.Components.xs {
    public int N;
    public int O;
    public ArrayList P;
    public final ArrayList Q = new ArrayList();
    public float R = 1.0f;
    public final boolean S = org.telegram.messenger.qc.e(8200);
    public final OvershootInterpolator T = new OvershootInterpolator(3.0f);
    public final v01 U;

    public u01(v01 v01Var) {
        this.U = v01Var;
    }

    @Override
    public final void a(android.graphics.Canvas r12, long r13, int r15, int r16, float r17) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.u01.a(android.graphics.Canvas, long, int, int, float):void");
    }

    @Override
    public final void b(Canvas canvas, Bitmap bitmap, Paint paint) {
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
    }

    @Override
    public final void c(Canvas canvas) {
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.Q;
            if (i7 < arrayList.size()) {
                c11 c11Var = (c11) arrayList.get(i7);
                if (!c11Var.f46382b) {
                    if (c11Var.f46381a) {
                        c11Var.F.setBounds(c11Var.G);
                        c11Var.F.draw(canvas);
                    } else {
                        ImageReceiver imageReceiver = c11Var.f46387r;
                        if (imageReceiver != null) {
                            imageReceiver.h(canvas, c11Var.f46385f[this.L]);
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
        s11 s11Var = this.U.f52687m3;
        if (this.P != null) {
            canvas.save();
            canvas.translate(-this.O, 0.0f);
            int i11 = 0;
            float f12 = f10;
            int i12 = 0;
            while (i12 < this.P.size()) {
                c11 c11Var = (c11) this.P.get(i12);
                if (!c11Var.f46382b) {
                    float scaleX = c11Var.getScaleX();
                    int i13 = s11Var.f51823a0;
                    if (i13 == 13) {
                        scaleX *= 0.87f;
                    }
                    float f13 = c11Var.O;
                    if (f13 != 0.0f || (c11Var.T > 0.0f && i13 != 3 && i13 != 4)) {
                        if (i13 != 3 && i13 != 4) {
                            f11 = c11Var.T * 0.7f;
                        } else {
                            f11 = 1.0f;
                        }
                        scaleX *= ((1.0f - Math.max(f11, f13)) * 0.2f) + 0.8f;
                    }
                    if (s11Var.R1 > 0 && SystemClock.elapsedRealtime() - s11Var.R1 < s11Var.g()) {
                        i7 = 1;
                    } else {
                        i7 = i11;
                    }
                    if (i7 != 0 && s11Var.P1 >= 0 && s11Var.Q1 >= 0 && s11Var.R1 > 0) {
                        int R = RecyclerView.R(c11Var);
                        int i14 = s11Var.P1;
                        int i15 = R - i14;
                        int i16 = s11Var.Q1 - i14;
                        if (i15 >= 0 && i15 < i16) {
                            float a10 = c8.l9.a(((float) (SystemClock.elapsedRealtime() - s11Var.R1)) / ((float) s11Var.f()), 0.0f, 1.0f);
                            float f14 = i15;
                            float f15 = i16;
                            float f16 = f15 / 4.0f;
                            float s5 = org.telegram.messenger.g0.s(a10, f14, f15, f16);
                            scaleX *= (this.T.getInterpolation(org.telegram.messenger.g0.s(a10, f14, f15, f16)) * 0.5f) + 0.5f;
                            f12 = s5;
                        }
                    } else {
                        f12 *= c11Var.getAlpha();
                    }
                    Rect rect = org.telegram.messenger.g0.Q;
                    rect.set(c11Var.getPaddingLeft() + ((int) c11Var.getX()), c11Var.getPaddingTop(), (c11Var.getWidth() + ((int) c11Var.getX())) - c11Var.getPaddingRight(), c11Var.getHeight() - c11Var.getPaddingBottom());
                    if (!s11Var.f51880y1 && i7 == 0) {
                        rect.offset(i11, (int) c11Var.getTranslationY());
                    }
                    if (c11Var.f46381a) {
                        drawable = s11Var.getPremiumStar();
                        int i17 = s11Var.f51823a0;
                        if (i17 == 5 || i17 == 10 || i17 == 9 || i17 == 7) {
                            rect.inset((int) ((-rect.width()) * 0.15f), (int) ((-rect.height()) * 0.15f));
                        }
                        drawable.setBounds(rect);
                        drawable.setAlpha(255);
                    } else if (!c11Var.f46388s && !c11Var.R) {
                        if ((c11Var.f46384e != null || s11Var.f51823a0 == 13) && !c11Var.f46382b && (drawable = c11Var.F) != null) {
                            drawable.setAlpha(255);
                            drawable.setBounds(rect);
                        }
                    } else {
                        ImageReceiver imageReceiver = c11Var.h;
                        if (imageReceiver != null) {
                            imageReceiver.z0(rect);
                        }
                        drawable = null;
                    }
                    PorterDuffColorFilter porterDuffColorFilter = s11Var.l1;
                    if (porterDuffColorFilter != null) {
                        Drawable drawable2 = c11Var.F;
                        if (drawable2 instanceof org.telegram.ui.Components.p5) {
                            drawable2.setColorFilter(porterDuffColorFilter);
                        }
                    }
                    float f17 = this.R;
                    c11Var.P = f17;
                    c11Var.Q = i12;
                    if (scaleX == 1.0f && f17 >= 1.0f) {
                        m(canvas, drawable, c11Var, f12);
                    } else {
                        canvas.save();
                        float f18 = c11Var.T;
                        if (f18 > 1.0f && (i10 = s11Var.f51823a0) != 3 && i10 != 4 && i10 != 6) {
                            float T1 = org.telegram.messenger.g0.T1(1.0f, 0.85f, f18);
                            canvas.scale(T1, T1, rect.centerX(), rect.centerY());
                        }
                        int i18 = s11Var.f51823a0;
                        if (i18 != 6 && i18 != 13 && i18 != 14) {
                            c11Var.getHeight();
                            float f19 = this.R;
                            if (f19 < 1.0f) {
                                canvas.scale(1.0f, f19, 0.0f, 0.0f);
                                canvas.skew((1.0f - this.R) * (1.0f - ((i12 * 2.0f) / this.P.size())), 0.0f);
                            }
                        } else {
                            canvas.scale(scaleX, scaleX, rect.centerX(), rect.centerY());
                        }
                        m(canvas, drawable, c11Var, f12);
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
            ArrayList arrayList = this.Q;
            if (i7 < arrayList.size()) {
                org.telegram.messenger.hc hcVar = ((c11) arrayList.get(i7)).f46385f[this.L];
                if (hcVar != null) {
                    hcVar.a();
                }
                i7++;
            } else {
                this.U.f52687m3.f51844i0.invalidate();
                return;
            }
        }
    }

    @Override
    public final void i(long r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.u01.i(long):void");
    }

    public final void m(Canvas canvas, Drawable drawable, c11 c11Var, float f10) {
        if (drawable != null) {
            drawable.setAlpha((int) (f10 * 255.0f));
            drawable.draw(canvas);
            drawable.setColorFilter(this.U.f52687m3.l1);
        } else if ((c11Var.f46388s || c11Var.R) && c11Var.h != null) {
            canvas.save();
            ImageReceiver imageReceiver = c11Var.h;
            canvas.clipRect(imageReceiver.L0, imageReceiver.M0, imageReceiver.y(), c11Var.h.A());
            c11Var.h.setAlpha(f10);
            c11Var.h.h(canvas, null);
            canvas.restore();
        }
    }
}
