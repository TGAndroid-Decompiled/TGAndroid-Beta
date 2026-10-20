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
public final class y41 extends org.telegram.ui.Components.qt {
    public int M;
    public int N;
    public ArrayList O;
    public final ArrayList P = new ArrayList();
    public float Q = 1.0f;
    public final boolean R = LiteMode.isEnabled(8200);
    public final OvershootInterpolator S = new OvershootInterpolator(3.0f);
    public final z41 T;

    public y41(z41 z41Var) {
        this.T = z41Var;
    }

    @Override
    public final void a(android.graphics.Canvas r12, long r13, int r15, int r16, float r17) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.y41.a(android.graphics.Canvas, long, int, int, float):void");
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
                g51 g51Var = (g51) arrayList.get(i10);
                if (!g51Var.f37189b) {
                    if (g51Var.f37188a) {
                        g51Var.E.setBounds(g51Var.F);
                        g51Var.E.draw(canvas);
                    } else {
                        ImageReceiver imageReceiver = g51Var.f37193r;
                        if (imageReceiver != null) {
                            imageReceiver.draw(canvas, g51Var.f37191f[this.K]);
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
        x51 x51Var = this.T.f43630c3;
        if (this.O != null) {
            canvas.save();
            canvas.translate(-this.N, 0.0f);
            int i12 = 0;
            float f11 = f7;
            int i13 = 0;
            while (i13 < this.O.size()) {
                g51 g51Var = (g51) this.O.get(i13);
                if (!g51Var.f37189b) {
                    float scaleX = g51Var.getScaleX();
                    int i14 = x51Var.W;
                    if (i14 == 13) {
                        scaleX *= 0.87f;
                    }
                    float f12 = g51Var.N;
                    if (f12 != 0.0f || (g51Var.S > 0.0f && i14 != 3 && i14 != 4)) {
                        if (i14 != 3 && i14 != 4) {
                            f10 = g51Var.S * 0.7f;
                        } else {
                            f10 = 1.0f;
                        }
                        scaleX *= ((1.0f - Math.max(f10, f12)) * 0.2f) + 0.8f;
                    }
                    if (x51Var.P1 > 0 && SystemClock.elapsedRealtime() - x51Var.P1 < x51Var.g()) {
                        i10 = 1;
                    } else {
                        i10 = i12;
                    }
                    if (i10 != 0 && x51Var.N1 >= 0 && x51Var.O1 >= 0 && x51Var.P1 > 0) {
                        int R = RecyclerView.R(g51Var);
                        int i15 = x51Var.N1;
                        int i16 = R - i15;
                        int i17 = x51Var.O1 - i15;
                        if (i16 >= 0 && i16 < i17) {
                            float a2 = w7.r.a(((float) (SystemClock.elapsedRealtime() - x51Var.P1)) / ((float) x51Var.f()), 0.0f, 1.0f);
                            float f13 = i16;
                            float f14 = i17;
                            float f15 = f14 / 4.0f;
                            float cascade = AndroidUtilities.cascade(a2, f13, f14, f15);
                            scaleX *= (this.S.getInterpolation(AndroidUtilities.cascade(a2, f13, f14, f15)) * 0.5f) + 0.5f;
                            f11 = cascade;
                        }
                    } else {
                        f11 *= g51Var.getAlpha();
                    }
                    Rect rect = AndroidUtilities.rectTmp2;
                    rect.set(g51Var.getPaddingLeft() + ((int) g51Var.getX()), g51Var.getPaddingTop(), (g51Var.getWidth() + ((int) g51Var.getX())) - g51Var.getPaddingRight(), g51Var.getHeight() - g51Var.getPaddingBottom());
                    if (!x51Var.f43094w1 && i10 == 0) {
                        rect.offset(i12, (int) g51Var.getTranslationY());
                    }
                    if (g51Var.f37188a) {
                        drawable = x51Var.getPremiumStar();
                        int i18 = x51Var.W;
                        if (i18 == 5 || i18 == 10 || i18 == 9 || i18 == 7) {
                            rect.inset((int) ((-rect.width()) * 0.15f), (int) ((-rect.height()) * 0.15f));
                        }
                        drawable.setBounds(rect);
                        drawable.setAlpha(255);
                    } else if (!g51Var.f37194s && !g51Var.Q) {
                        if ((g51Var.e != null || x51Var.W == 13) && !g51Var.f37189b && (drawable = g51Var.E) != null) {
                            drawable.setAlpha(255);
                            drawable.setBounds(rect);
                        }
                    } else {
                        ImageReceiver imageReceiver = g51Var.h;
                        if (imageReceiver != null) {
                            imageReceiver.setImageCoords(rect);
                        }
                        drawable = null;
                    }
                    PorterDuffColorFilter porterDuffColorFilter = x51Var.f43068k1;
                    if (porterDuffColorFilter != null) {
                        Drawable drawable2 = g51Var.E;
                        if (drawable2 instanceof org.telegram.ui.Components.r5) {
                            drawable2.setColorFilter(porterDuffColorFilter);
                        }
                    }
                    float f16 = this.Q;
                    g51Var.O = f16;
                    g51Var.P = i13;
                    if (scaleX == 1.0f && f16 >= 1.0f) {
                        m(canvas, drawable, g51Var, f11);
                    } else {
                        canvas.save();
                        float f17 = g51Var.S;
                        if (f17 > 1.0f && (i11 = x51Var.W) != 3 && i11 != 4 && i11 != 6) {
                            float lerp = AndroidUtilities.lerp(1.0f, 0.85f, f17);
                            canvas.scale(lerp, lerp, rect.centerX(), rect.centerY());
                        }
                        int i19 = x51Var.W;
                        if (i19 != 6 && i19 != 13 && i19 != 14) {
                            g51Var.getHeight();
                            float f18 = this.Q;
                            if (f18 < 1.0f) {
                                canvas.scale(1.0f, f18, 0.0f, 0.0f);
                                canvas.skew((1.0f - this.Q) * (1.0f - ((i13 * 2.0f) / this.O.size())), 0.0f);
                            }
                        } else {
                            canvas.scale(scaleX, scaleX, rect.centerX(), rect.centerY());
                        }
                        m(canvas, drawable, g51Var, f11);
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
                ImageReceiver.BackgroundThreadDrawHolder backgroundThreadDrawHolder = ((g51) arrayList.get(i10)).f37191f[this.K];
                if (backgroundThreadDrawHolder != null) {
                    backgroundThreadDrawHolder.release();
                }
                i10++;
            } else {
                this.T.f43630c3.f43061h0.invalidate();
                return;
            }
        }
    }

    @Override
    public final void i(long r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.y41.i(long):void");
    }

    public final void m(Canvas canvas, Drawable drawable, g51 g51Var, float f7) {
        if (drawable != null) {
            drawable.setAlpha((int) (f7 * 255.0f));
            drawable.draw(canvas);
            drawable.setColorFilter(this.T.f43630c3.f43068k1);
        } else if ((g51Var.f37194s || g51Var.Q) && g51Var.h != null) {
            canvas.save();
            canvas.clipRect(g51Var.h.getImageX(), g51Var.h.getImageY(), g51Var.h.getImageX2(), g51Var.h.getImageY2());
            g51Var.h.setAlpha(f7);
            g51Var.h.draw(canvas);
            canvas.restore();
        }
    }
}
