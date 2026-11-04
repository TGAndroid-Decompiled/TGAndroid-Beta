package ug;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.ac;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.l10;
import org.telegram.messenger.w7;
import org.telegram.messenger.wo;
import org.telegram.messenger.xo;
import org.telegram.messenger.zi;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.ly0;
import org.telegram.ui.Components.u5;
import org.telegram.ui.Components.xq;
public class h0 extends View {
    public final Drawable E;
    public final Paint F;
    public boolean G;
    public ly0 H;
    public final Paint I;
    public boolean J;
    public ly0 K;
    public boolean L;
    public ly0 M;
    public boolean N;
    public final TextPaint O;
    public StaticLayout P;
    public float Q;
    public float R;
    public boolean S;
    public boolean T;
    public final ImageReceiver U;
    public boolean V;
    public int W;
    public int f56024a;
    public g0 f56025a0;
    public int f56026b;
    public float f56027b0;
    public boolean f56028c;
    public float f56029c0;
    public boolean d;
    public float f56030d0;
    public final float f56031e;
    public float f56032e0;
    public final int f56033f;
    public int f56034f0;
    public final RectF f56035g0;
    public final int h;
    public final RectF f56036h0;
    public final Path f56037i0;
    public final Path f56038j0;
    public final RectF f56039k0;
    public final RectF f56040l0;
    public final u5 m0;
    public float f56041n;
    public final u5 f56042n0;
    public final u5 f56043o0;
    public final u5 f56044p0;
    public final u5 f56045q0;
    public final TextPaint f56046r;
    public final u5 f56047r0;
    public StaticLayout f56048s;
    public final u5 f56049s0;
    public final u5 f56050t0;
    public float f56051w;
    public float f56052x;
    public final RectF f56053y;

    public h0(Context context, float f10) {
        super(context);
        this.f56028c = true;
        this.f56041n = 1.0f;
        TextPaint textPaint = new TextPaint(1);
        this.f56046r = textPaint;
        this.f56053y = new RectF(4.0f, 4.33f, 7.66f, 3.0f);
        this.F = new Paint(1);
        this.I = new Paint(1);
        this.O = new TextPaint(1);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.U = imageReceiver;
        this.f56035g0 = new RectF();
        this.f56036h0 = new RectF();
        this.f56037i0 = new Path();
        this.f56038j0 = new Path();
        this.f56039k0 = new RectF();
        this.f56040l0 = new RectF();
        xq xqVar = xq.h;
        this.m0 = new u5(this, 0L, 350L, xqVar);
        this.f56042n0 = new u5(this, 0L, 350L, xqVar);
        this.f56043o0 = new u5(this, 0L, 350L, xqVar);
        this.f56044p0 = new u5(this, 0L, 350L, xqVar);
        this.f56045q0 = new u5(this, 0L, 350L, xqVar);
        this.f56047r0 = new u5(this, 0L, 350L, xqVar);
        this.f56049s0 = new u5(this, 0L, 350L, xqVar);
        this.f56050t0 = new u5(this, 0L, 350L, xqVar);
        this.f56031e = f10;
        imageReceiver.K0 = true;
        this.f56033f = (int) (f10 * 3.0f);
        this.h = (int) (f10 * 1.0f);
        this.E = k2.p1.g(context, 2131232764);
        textPaint.setTextSize(24.0f * f10);
        textPaint.setTypeface(org.telegram.messenger.g0.o1("fonts/rcondensedbold.ttf"));
    }

    public final void a(android.graphics.Canvas r27) {
        throw new UnsupportedOperationException("Method not decompiled: ug.h0.a(android.graphics.Canvas):void");
    }

    public final void b(int i3, g0 g0Var, boolean z10) {
        this.f56024a = i3;
        if (this.f56025a0 == g0Var && !z10) {
            return;
        }
        this.f56025a0 = g0Var;
        this.f56028c = true;
        this.d = z10;
        requestLayout();
    }

    public final void c(int i3, int i10) {
        int i11 = -16777216;
        Drawable drawable = this.E;
        TextPaint textPaint = this.f56046r;
        if (i3 == 0) {
            this.f56034f0 = i10;
            if (org.telegram.messenger.g0.B(i10) < 0.721f) {
                i11 = -1;
            }
            textPaint.setColor(i11);
            drawable.setColorFilter(new PorterDuffColorFilter(i11, PorterDuff.Mode.SRC_IN));
        } else if (i3 == 1) {
            this.f56034f0 = -16777216;
            textPaint.setColor(-1);
            drawable.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        } else if (i3 == 2) {
            this.f56034f0 = 1275068416;
            textPaint.setColor(-1);
            drawable.setColorFilter(null);
        } else {
            this.f56034f0 = -1;
            textPaint.setColor(-13397548);
            drawable.setColorFilter(new PorterDuffColorFilter(-13397548, PorterDuff.Mode.SRC_IN));
        }
        invalidate();
    }

    public final void d() {
        String str;
        double d;
        String str2;
        wo woVar;
        int f10;
        boolean z10;
        float f11;
        int i3;
        float f12;
        int i10;
        int i11;
        ac c2;
        int i12;
        float f13;
        float f14;
        int i13;
        boolean z11;
        float f15;
        float f16;
        float f17;
        float f18;
        float f19;
        ac i14;
        if (this.f56028c && this.f56025a0 != null) {
            boolean e10 = e();
            int i15 = this.f56033f;
            float f20 = this.f56031e;
            if (e10) {
                if (TextUtils.isEmpty(this.f56025a0.f56009b)) {
                    str2 = this.f56025a0.f56010c;
                } else {
                    str2 = this.f56025a0.f56009b;
                }
                TLRPC.WebPage webPage = this.f56025a0.d;
                float f21 = (this.f56026b - i15) - i15;
                this.f56029c0 = 0.0f;
                this.f56027b0 = 0.0f;
                this.f56030d0 = 0.0f;
                int e11 = l10.e(h10.i(this.f56024a).f());
                xo xoVar = hp.s1(this.f56024a).f23099q4;
                String str3 = null;
                if (xoVar != null && e11 >= 7) {
                    woVar = xoVar.d(e11);
                } else {
                    woVar = null;
                }
                if (woVar == null) {
                    int[] iArr = k6.f28142r8;
                    f10 = k6.x0(null, iArr[e11 % iArr.length], false);
                } else {
                    f10 = woVar.f();
                }
                this.I.setColor(f10);
                this.f56029c0 = (7.33f * f20) + this.f56029c0;
                this.G = this.f56025a0.f56012f;
                ly0 ly0Var = new ly0(str2, 16.0f, null);
                ly0Var.f35916a.setTextSize(16.0f * f20);
                float f22 = 20.0f * f20;
                ly0Var.p(f21 - f22);
                this.H = ly0Var;
                this.f56027b0 = Math.max(this.f56027b0, Math.min(f22 + ly0Var.f35918c, f21));
                float f23 = 7.0f * f20;
                this.f56029c0 = this.H.i() + this.f56029c0 + f23;
                if (webPage.photo == null && !zi.L4(webPage.document)) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                this.S = z10;
                g0 g0Var = this.f56025a0;
                boolean z12 = g0Var.f56011e;
                this.T = !z12;
                if (this.V && (g0Var.f56008a & 4) != 0) {
                    i3 = g0Var.f56013i;
                } else {
                    if (!z12) {
                        f11 = 48.0f;
                    } else {
                        f11 = (f21 / f20) - 40.0f;
                    }
                    i3 = 2 * ((int) f11);
                }
                ImageReceiver imageReceiver = this.U;
                imageReceiver.J0((int) (4.0f * f20));
                TLRPC.Photo photo = webPage.photo;
                if (photo != null) {
                    TLRPC.PhotoSize w10 = w7.w(photo.sizes, 1, false, null, false);
                    f12 = 48.0f;
                    TLRPC.PhotoSize w11 = w7.w(webPage.photo.sizes, (int) (i3 * f20), false, w10, false);
                    if (w11 != null) {
                        i11 = w11.f27026w;
                        i10 = w11.h;
                    } else {
                        i10 = 0;
                        i11 = 0;
                    }
                    ac i16 = ac.i(w11, webPage.photo);
                    String i17 = com.google.android.recaptcha.internal.a.i(i3, "_", i3);
                    if (this.V) {
                        i14 = null;
                    } else {
                        i14 = ac.i(w10, webPage.photo);
                    }
                    if (!this.V) {
                        str3 = com.google.android.recaptcha.internal.a.i(i3, "_", i3);
                    }
                    imageReceiver.r0(i16, i17, i14, str3, null, 0L, null, null, 0);
                } else {
                    f12 = 48.0f;
                    TLRPC.Document document = webPage.document;
                    if (document != null) {
                        TLRPC.PhotoSize w12 = w7.w(document.thumbs, 1, false, null, false);
                        TLRPC.PhotoSize w13 = w7.w(webPage.document.thumbs, (int) (i3 * f20), false, w12, false);
                        if (w13 != null) {
                            i11 = w13.f27026w;
                            i10 = w13.h;
                        } else {
                            i10 = 0;
                            i11 = 0;
                        }
                        ac c10 = ac.c(w13, webPage.document);
                        String i18 = com.google.android.recaptcha.internal.a.i(i3, "_", i3);
                        if (this.V) {
                            c2 = null;
                        } else {
                            c2 = ac.c(w12, webPage.document);
                        }
                        if (!this.V) {
                            str3 = com.google.android.recaptcha.internal.a.i(i3, "_", i3);
                        }
                        imageReceiver.r0(c10, i18, c2, str3, null, 0L, null, null, 0);
                    } else {
                        i10 = 0;
                        i11 = 0;
                    }
                }
                this.f56030d0 = (5.66f * f20) + this.f56030d0;
                boolean isEmpty = TextUtils.isEmpty(webPage.site_name);
                this.L = !isEmpty;
                if (!isEmpty) {
                    ly0 ly0Var2 = new ly0(webPage.site_name, 14.0f, org.telegram.messenger.g0.o());
                    ly0Var2.f35916a.setTextSize(f20 * 14.0f);
                    float f24 = f20 * 40.0f;
                    float f25 = f21 - f24;
                    if (this.S && this.T) {
                        f18 = f20 * 60.0f;
                    } else {
                        f18 = 0.0f;
                    }
                    ly0Var2.p((int) Math.ceil(f25 - f18));
                    this.M = ly0Var2;
                    float f26 = this.f56027b0;
                    float f27 = f24 + ly0Var2.f35918c;
                    if (this.S && this.T) {
                        f19 = f20 * 60.0f;
                    } else {
                        f19 = 0.0f;
                    }
                    this.f56027b0 = Math.max(f26, Math.min(f27 + f19, f21));
                    this.f56030d0 = (f20 * 2.66f) + this.M.i() + this.f56030d0;
                    i12 = this.M.f35917b.getLineCount();
                } else {
                    i12 = 0;
                }
                boolean isEmpty2 = TextUtils.isEmpty(webPage.title);
                this.J = !isEmpty2;
                if (!isEmpty2) {
                    ly0 ly0Var3 = new ly0(webPage.title, 14.0f, org.telegram.messenger.g0.o());
                    ly0Var3.f35916a.setTextSize(f20 * 14.0f);
                    float f28 = f20 * 40.0f;
                    float f29 = f21 - f28;
                    f13 = 2.66f;
                    if (this.S && this.T) {
                        f16 = f20 * 60.0f;
                    } else {
                        f16 = 0.0f;
                    }
                    f14 = f20;
                    ly0Var3.p((int) Math.ceil(f29 - f16));
                    this.K = ly0Var3;
                    float f30 = this.f56027b0;
                    float f31 = f28 + ly0Var3.f35918c;
                    if (this.S && this.T) {
                        f17 = 60.0f * f14;
                    } else {
                        f17 = 0.0f;
                    }
                    this.f56027b0 = Math.max(f30, Math.min(f31 + f17, f21));
                    this.f56030d0 = (f14 * 2.66f) + this.K.i() + this.f56030d0;
                    i12 += this.K.f35917b.getLineCount();
                } else {
                    f13 = 2.66f;
                    f14 = f20;
                }
                boolean isEmpty3 = TextUtils.isEmpty(webPage.description);
                this.N = !isEmpty3;
                if (!isEmpty3) {
                    TextPaint textPaint = this.O;
                    textPaint.setTextSize(f14 * 14.0f);
                    String str4 = webPage.description;
                    float f32 = f14 * 40.0f;
                    int ceil = (int) Math.ceil(Math.max(1.0f, f21 - f32));
                    if (this.S && this.T) {
                        i13 = 60;
                    } else {
                        i13 = 0;
                    }
                    int i19 = 3 - i12;
                    this.P = org.telegram.ui.Cells.q1.H1(str4, textPaint, ceil, (int) Math.ceil(Math.max(1.0f, f21 - ((40 + i13) * f14))), i19, 4);
                    this.Q = 0.0f;
                    this.R = Float.MAX_VALUE;
                    for (int i20 = 0; i20 < this.P.getLineCount(); i20++) {
                        if (this.S && this.T && i20 < i19) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        float f33 = this.Q;
                        float lineWidth = this.P.getLineWidth(i20);
                        if (z11) {
                            f15 = f14 * f12;
                        } else {
                            f15 = 0.0f;
                        }
                        this.Q = Math.max(f33, lineWidth + f15);
                        this.R = Math.min(this.R, this.P.getLineLeft(i20));
                    }
                    this.f56027b0 = Math.max(this.f56027b0, Math.min(f32 + this.Q, f21));
                    this.f56030d0 = (f14 * f13) + this.f56030d0 + this.P.getHeight();
                }
                if (this.S && !this.T) {
                    if (i11 > 0 && i10 > 0) {
                        this.f56032e0 = Math.min((Math.max(0.0f, this.f56027b0 - (f14 * 40.0f)) / i11) * i10, f14 * 200.0f);
                    } else {
                        this.f56032e0 = f14 * 120.0f;
                    }
                    this.f56030d0 = (f14 * f13) + this.f56030d0 + this.f56032e0;
                }
                float f34 = f23 + this.f56030d0;
                this.f56030d0 = f34;
                this.f56029c0 = (f14 * 11.0f) + this.f56029c0 + f34;
            } else {
                if (TextUtils.isEmpty(this.f56025a0.f56009b)) {
                    String str5 = this.f56025a0.f56010c;
                    if (str5.startsWith("https://")) {
                        str5 = str5.substring(8);
                    }
                    str = str5.toUpperCase();
                } else {
                    str = this.f56025a0.f56009b;
                }
                RectF rectF = this.f56053y;
                float f35 = ((this.f56026b - i15) - i15) - ((((rectF.left + 30.0f) + 3.25f) + rectF.right) * f20);
                this.f56041n = 1.0f;
                TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                TextPaint textPaint2 = this.f56046r;
                this.f56048s = new StaticLayout(TextUtils.ellipsize(str, textPaint2, (int) Math.ceil(d), truncateAt), textPaint2, (int) Math.ceil(f35), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                this.f56051w = 0.0f;
                this.f56052x = Float.MAX_VALUE;
                for (int i21 = 0; i21 < this.f56048s.getLineCount(); i21++) {
                    this.f56051w = Math.max(this.f56051w, this.f56048s.getLineWidth(i21));
                    this.f56052x = Math.min(this.f56052x, this.f56048s.getLineLeft(i21));
                }
                if (this.f56048s.getLineCount() > 2) {
                    this.f56041n = 0.3f;
                } else {
                    this.f56041n = Math.min(1.0f, f35 / this.f56051w);
                }
                this.f56027b0 = (this.f56051w * this.f56041n) + ((rectF.left + 30.0f + 3.25f + rectF.right) * f20);
                this.f56029c0 = Math.max(f20 * 30.0f, this.f56048s.getHeight() * this.f56041n) + ((rectF.top + rectF.bottom) * f20);
            }
            if (!this.d) {
                this.m0.f(this.G, true);
                this.f56043o0.f(this.T, true);
                this.f56042n0.f(this.S, true);
                this.f56047r0.e(true, this.f56030d0);
            } else {
                invalidate();
            }
            this.f56028c = false;
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        a(canvas);
    }

    public final boolean e() {
        g0 g0Var = this.f56025a0;
        if (g0Var != null && g0Var.d != null) {
            return true;
        }
        return false;
    }

    public int getPhotoSide() {
        float f10;
        if (this.T) {
            f10 = 48.0f;
        } else {
            int i3 = this.f56026b;
            int i10 = this.f56033f;
            f10 = (((i3 - i10) - i10) / this.f56031e) - 40.0f;
        }
        return ((int) f10) * 2;
    }

    public int getPreviewType() {
        return this.W;
    }

    public float getRadius() {
        float f10;
        float f11;
        if (e()) {
            f10 = 16.66f;
            f11 = this.f56031e;
        } else {
            f10 = 0.2f;
            f11 = this.f56029c0;
        }
        return f11 * f10;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.U.P();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.U.R();
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        d();
        int i11 = this.f56033f;
        int ceil = ((int) Math.ceil(this.f56027b0)) + i11 + i11;
        int ceil2 = (int) Math.ceil(this.f56029c0);
        int i12 = this.h;
        setMeasuredDimension(ceil, ceil2 + i12 + i12);
    }

    public void setMaxWidth(int i3) {
        this.f56026b = i3;
        this.f56028c = true;
    }

    public void setPreviewType(int i3) {
        this.W = i3;
        invalidate();
    }
}
