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
public final class s61 extends org.telegram.ui.Components.vt {
    public int M;
    public int N;
    public ArrayList O;
    public final ArrayList P = new ArrayList();
    public float Q = 1.0f;
    public final boolean R = LiteMode.isEnabled(8200);
    public final OvershootInterpolator S = new OvershootInterpolator(3.0f);
    public final t61 T;

    public s61(t61 t61Var) {
        this.T = t61Var;
    }

    @Override
    public final void a(android.graphics.Canvas r12, long r13, int r15, int r16, float r17) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.s61.a(android.graphics.Canvas, long, int, int, float):void");
    }

    @Override
    public final void b(Canvas canvas, Bitmap bitmap, Paint paint) {
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
    }

    @Override
    public final void c(Canvas canvas) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.P;
            if (i10 < arrayList.size()) {
                a71 a71Var = (a71) arrayList.get(i10);
                if (!a71Var.f33767b) {
                    if (a71Var.f33766a) {
                        a71Var.E.setBounds(a71Var.F);
                        a71Var.E.draw(canvas);
                    } else {
                        ImageReceiver imageReceiver = a71Var.f33771r;
                        if (imageReceiver != null) {
                            imageReceiver.draw(canvas, a71Var.f33769f[this.K]);
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
    public final void d(Canvas canvas, float f7) {
        float f10;
        int i10;
        Drawable drawable;
        int i11;
        r71 r71Var = this.T.f40014c3;
        if (this.O != null) {
            canvas.save();
            canvas.translate(-this.N, 0.0f);
            int i12 = 0;
            float f11 = f7;
            int i13 = 0;
            while (i13 < this.O.size()) {
                a71 a71Var = (a71) this.O.get(i13);
                if (!a71Var.f33767b) {
                    float scaleX = a71Var.getScaleX();
                    int i14 = r71Var.W;
                    if (i14 == 13) {
                        scaleX *= 0.87f;
                    }
                    float f12 = a71Var.N;
                    if (f12 != 0.0f || (a71Var.S > 0.0f && i14 != 3 && i14 != 4)) {
                        if (i14 != 3 && i14 != 4) {
                            f10 = a71Var.S * 0.7f;
                        } else {
                            f10 = 1.0f;
                        }
                        scaleX *= ((1.0f - Math.max(f10, f12)) * 0.2f) + 0.8f;
                    }
                    if (r71Var.P1 > 0 && SystemClock.elapsedRealtime() - r71Var.P1 < r71Var.g()) {
                        i10 = 1;
                    } else {
                        i10 = i12;
                    }
                    if (i10 != 0 && r71Var.N1 >= 0 && r71Var.O1 >= 0 && r71Var.P1 > 0) {
                        int R = RecyclerView.R(a71Var);
                        int i15 = r71Var.N1;
                        int i16 = R - i15;
                        int i17 = r71Var.O1 - i15;
                        if (i16 >= 0 && i16 < i17) {
                            float a2 = w7.r.a(((float) (SystemClock.elapsedRealtime() - r71Var.P1)) / ((float) r71Var.f()), 0.0f, 1.0f);
                            float f13 = i16;
                            float f14 = i17;
                            float f15 = f14 / 4.0f;
                            float cascade = AndroidUtilities.cascade(a2, f13, f14, f15);
                            scaleX *= (this.S.getInterpolation(AndroidUtilities.cascade(a2, f13, f14, f15)) * 0.5f) + 0.5f;
                            f11 = cascade;
                        }
                    } else {
                        f11 *= a71Var.getAlpha();
                    }
                    Rect rect = AndroidUtilities.rectTmp2;
                    rect.set(a71Var.getPaddingLeft() + ((int) a71Var.getX()), a71Var.getPaddingTop(), (a71Var.getWidth() + ((int) a71Var.getX())) - a71Var.getPaddingRight(), a71Var.getHeight() - a71Var.getPaddingBottom());
                    if (!r71Var.f39363w1 && i10 == 0) {
                        rect.offset(i12, (int) a71Var.getTranslationY());
                    }
                    if (a71Var.f33766a) {
                        drawable = r71Var.getPremiumStar();
                        int i18 = r71Var.W;
                        if (i18 == 5 || i18 == 10 || i18 == 9 || i18 == 7) {
                            rect.inset((int) ((-rect.width()) * 0.15f), (int) ((-rect.height()) * 0.15f));
                        }
                        drawable.setBounds(rect);
                        drawable.setAlpha(255);
                    } else if (!a71Var.f33772s && !a71Var.Q) {
                        if ((a71Var.e != null || r71Var.W == 13) && !a71Var.f33767b && (drawable = a71Var.E) != null) {
                            drawable.setAlpha(255);
                            drawable.setBounds(rect);
                        }
                    } else {
                        ImageReceiver imageReceiver = a71Var.h;
                        if (imageReceiver != null) {
                            imageReceiver.setImageCoords(rect);
                        }
                        drawable = null;
                    }
                    PorterDuffColorFilter porterDuffColorFilter = r71Var.f39337k1;
                    if (porterDuffColorFilter != null) {
                        Drawable drawable2 = a71Var.E;
                        if (drawable2 instanceof org.telegram.ui.Components.s5) {
                            drawable2.setColorFilter(porterDuffColorFilter);
                        }
                    }
                    float f16 = this.Q;
                    a71Var.O = f16;
                    a71Var.P = i13;
                    if (scaleX == 1.0f && f16 >= 1.0f) {
                        m(canvas, drawable, a71Var, f11);
                    } else {
                        canvas.save();
                        float f17 = a71Var.S;
                        if (f17 > 1.0f && (i11 = r71Var.W) != 3 && i11 != 4 && i11 != 6) {
                            float lerp = AndroidUtilities.lerp(1.0f, 0.85f, f17);
                            canvas.scale(lerp, lerp, rect.centerX(), rect.centerY());
                        }
                        int i19 = r71Var.W;
                        if (i19 != 6 && i19 != 13 && i19 != 14) {
                            a71Var.getHeight();
                            float f18 = this.Q;
                            if (f18 < 1.0f) {
                                canvas.scale(1.0f, f18, 0.0f, 0.0f);
                                canvas.skew((1.0f - this.Q) * (1.0f - ((i13 * 2.0f) / this.O.size())), 0.0f);
                            }
                        } else {
                            canvas.scale(scaleX, scaleX, rect.centerX(), rect.centerY());
                        }
                        m(canvas, drawable, a71Var, f11);
                        canvas.restore();
                    }
                }
                i13++;
                i12 = 0;
            }
            canvas.restore();
        }
    }

    @Override
    public final void g() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.P;
            if (i10 < arrayList.size()) {
                ImageReceiver.BackgroundThreadDrawHolder backgroundThreadDrawHolder = ((a71) arrayList.get(i10)).f33769f[this.K];
                if (backgroundThreadDrawHolder != null) {
                    backgroundThreadDrawHolder.release();
                }
                i10++;
            } else {
                this.T.f40014c3.f39330h0.invalidate();
                return;
            }
        }
    }

    @Override
    public final void i(long r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.s61.i(long):void");
    }

    public final void m(Canvas canvas, Drawable drawable, a71 a71Var, float f7) {
        if (drawable != null) {
            drawable.setAlpha((int) (f7 * 255.0f));
            drawable.draw(canvas);
            drawable.setColorFilter(this.T.f40014c3.f39337k1);
        } else if ((a71Var.f33772s || a71Var.Q) && a71Var.h != null) {
            canvas.save();
            canvas.clipRect(a71Var.h.getImageX(), a71Var.h.getImageY(), a71Var.h.getImageX2(), a71Var.h.getImageY2());
            a71Var.h.setAlpha(f7);
            a71Var.h.draw(canvas);
            canvas.restore();
        }
    }
}
