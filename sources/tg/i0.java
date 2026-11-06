package tg;

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
import org.telegram.messenger.fp;
import org.telegram.messenger.gp;
import org.telegram.messenger.hc;
import org.telegram.messenger.ij;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.messenger.t10;
import org.telegram.messenger.w7;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.ly0;
import org.telegram.ui.Components.w5;
import org.telegram.ui.Components.xq;
public class i0 extends View {
    public final Drawable D;
    public final Paint E;
    public boolean F;
    public ly0 G;
    public final Paint H;
    public boolean I;
    public ly0 J;
    public boolean K;
    public ly0 L;
    public boolean M;
    public final TextPaint N;
    public StaticLayout O;
    public float P;
    public float Q;
    public boolean R;
    public boolean S;
    public final ImageReceiver T;
    public boolean U;
    public int V;
    public h0 W;
    public int f55635a;
    public float f55636a0;
    public int f55637b;
    public float f55638b0;
    public boolean f55639c;
    public float f55640c0;
    public boolean d;
    public float f55641d0;
    public final float f55642e;
    public int f55643e0;
    public final int f55644f;
    public final RectF f55645f0;
    public final RectF f55646g0;
    public final int h;
    public final Path f55647h0;
    public final Path f55648i0;
    public final RectF f55649j0;
    public final RectF f55650k0;
    public final w5 f55651l0;
    public final w5 m0;
    public float f55652n;
    public final w5 f55653n0;
    public final w5 f55654o0;
    public final w5 f55655p0;
    public final w5 f55656q0;
    public final TextPaint f55657r;
    public final w5 f55658r0;
    public StaticLayout f55659s;
    public final w5 f55660s0;
    public float f55661w;
    public float f55662x;
    public final RectF f55663y;

    public i0(Context context, float f10) {
        super(context);
        this.f55639c = true;
        this.f55652n = 1.0f;
        TextPaint textPaint = new TextPaint(1);
        this.f55657r = textPaint;
        this.f55663y = new RectF(4.0f, 4.33f, 7.66f, 3.0f);
        this.E = new Paint(1);
        this.H = new Paint(1);
        this.N = new TextPaint(1);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.T = imageReceiver;
        this.f55645f0 = new RectF();
        this.f55646g0 = new RectF();
        this.f55647h0 = new Path();
        this.f55648i0 = new Path();
        this.f55649j0 = new RectF();
        this.f55650k0 = new RectF();
        xq xqVar = xq.h;
        this.f55651l0 = new w5(this, 0L, 350L, xqVar);
        this.m0 = new w5(this, 0L, 350L, xqVar);
        this.f55653n0 = new w5(this, 0L, 350L, xqVar);
        this.f55654o0 = new w5(this, 0L, 350L, xqVar);
        this.f55655p0 = new w5(this, 0L, 350L, xqVar);
        this.f55656q0 = new w5(this, 0L, 350L, xqVar);
        this.f55658r0 = new w5(this, 0L, 350L, xqVar);
        this.f55660s0 = new w5(this, 0L, 350L, xqVar);
        this.f55642e = f10;
        imageReceiver.J0 = true;
        this.f55644f = (int) (f10 * 3.0f);
        this.h = (int) (f10 * 1.0f);
        this.D = jg.g.h(context, 2131232766);
        textPaint.setTextSize(24.0f * f10);
        textPaint.setTypeface(org.telegram.messenger.g0.o1("fonts/rcondensedbold.ttf"));
    }

    public final void a(android.graphics.Canvas r27) {
        throw new UnsupportedOperationException("Method not decompiled: tg.i0.a(android.graphics.Canvas):void");
    }

    public final void b(int i7, h0 h0Var, boolean z9) {
        this.f55635a = i7;
        if (this.W == h0Var && !z9) {
            return;
        }
        this.W = h0Var;
        this.f55639c = true;
        this.d = z9;
        requestLayout();
    }

    public final void c(int i7, int i10) {
        int i11 = -16777216;
        Drawable drawable = this.D;
        TextPaint textPaint = this.f55657r;
        if (i7 == 0) {
            this.f55643e0 = i10;
            if (org.telegram.messenger.g0.B(i10) < 0.721f) {
                i11 = -1;
            }
            textPaint.setColor(i11);
            drawable.setColorFilter(new PorterDuffColorFilter(i11, PorterDuff.Mode.SRC_IN));
        } else if (i7 == 1) {
            this.f55643e0 = -16777216;
            textPaint.setColor(-1);
            drawable.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        } else if (i7 == 2) {
            this.f55643e0 = 1275068416;
            textPaint.setColor(-1);
            drawable.setColorFilter(null);
        } else {
            this.f55643e0 = -1;
            textPaint.setColor(-13397548);
            drawable.setColorFilter(new PorterDuffColorFilter(-13397548, PorterDuff.Mode.SRC_IN));
        }
        invalidate();
    }

    public final void d() {
        String str;
        double d;
        String str2;
        fp fpVar;
        int f10;
        boolean z9;
        float f11;
        int i7;
        float f12;
        int i10;
        int i11;
        hc c10;
        int i12;
        float f13;
        float f14;
        int i13;
        boolean z10;
        float f15;
        float f16;
        float f17;
        float f18;
        float f19;
        hc i14;
        if (this.f55639c && this.W != null) {
            boolean e10 = e();
            int i15 = this.f55644f;
            float f20 = this.f55642e;
            if (e10) {
                if (TextUtils.isEmpty(this.W.f55617b)) {
                    str2 = this.W.f55618c;
                } else {
                    str2 = this.W.f55617b;
                }
                TLRPC.WebPage webPage = this.W.d;
                float f21 = (this.f55637b - i15) - i15;
                this.f55638b0 = 0.0f;
                this.f55636a0 = 0.0f;
                this.f55640c0 = 0.0f;
                int e11 = t10.e(p10.i(this.f55635a).f());
                gp gpVar = qp.s1(this.f55635a).f24859q4;
                String str3 = null;
                if (gpVar != null && e11 >= 7) {
                    fpVar = gpVar.d(e11);
                } else {
                    fpVar = null;
                }
                if (fpVar == null) {
                    int[] iArr = k6.f28109r8;
                    f10 = k6.x0(null, iArr[e11 % iArr.length], false);
                } else {
                    f10 = fpVar.f();
                }
                this.H.setColor(f10);
                this.f55638b0 = (7.33f * f20) + this.f55638b0;
                this.F = this.W.f55620f;
                ly0 ly0Var = new ly0(str2, 16.0f, null);
                ly0Var.f35780a.setTextSize(16.0f * f20);
                float f22 = 20.0f * f20;
                ly0Var.p(f21 - f22);
                this.G = ly0Var;
                this.f55636a0 = Math.max(this.f55636a0, Math.min(f22 + ly0Var.f35782c, f21));
                float f23 = 7.0f * f20;
                this.f55638b0 = this.G.i() + this.f55638b0 + f23;
                if (webPage.photo == null && !ij.L4(webPage.document)) {
                    z9 = false;
                } else {
                    z9 = true;
                }
                this.R = z9;
                h0 h0Var = this.W;
                boolean z11 = h0Var.f55619e;
                this.S = !z11;
                if (this.U && (h0Var.f55616a & 4) != 0) {
                    i7 = h0Var.f55621i;
                } else {
                    if (!z11) {
                        f11 = 48.0f;
                    } else {
                        f11 = (f21 / f20) - 40.0f;
                    }
                    i7 = 2 * ((int) f11);
                }
                ImageReceiver imageReceiver = this.T;
                imageReceiver.J0((int) (4.0f * f20));
                TLRPC.Photo photo = webPage.photo;
                if (photo != null) {
                    TLRPC.PhotoSize w10 = w7.w(photo.sizes, 1, false, null, false);
                    f12 = 48.0f;
                    TLRPC.PhotoSize w11 = w7.w(webPage.photo.sizes, (int) (i7 * f20), false, w10, false);
                    if (w11 != null) {
                        i11 = w11.f26977w;
                        i10 = w11.h;
                    } else {
                        i10 = 0;
                        i11 = 0;
                    }
                    hc i16 = hc.i(w11, webPage.photo);
                    String j3 = com.google.android.recaptcha.internal.a.j(i7, "_", i7);
                    if (this.U) {
                        i14 = null;
                    } else {
                        i14 = hc.i(w10, webPage.photo);
                    }
                    if (!this.U) {
                        str3 = com.google.android.recaptcha.internal.a.j(i7, "_", i7);
                    }
                    imageReceiver.r0(i16, j3, i14, str3, null, 0L, null, null, 0);
                } else {
                    f12 = 48.0f;
                    TLRPC.Document document = webPage.document;
                    if (document != null) {
                        TLRPC.PhotoSize w12 = w7.w(document.thumbs, 1, false, null, false);
                        TLRPC.PhotoSize w13 = w7.w(webPage.document.thumbs, (int) (i7 * f20), false, w12, false);
                        if (w13 != null) {
                            i11 = w13.f26977w;
                            i10 = w13.h;
                        } else {
                            i10 = 0;
                            i11 = 0;
                        }
                        hc c11 = hc.c(w13, webPage.document);
                        String j10 = com.google.android.recaptcha.internal.a.j(i7, "_", i7);
                        if (this.U) {
                            c10 = null;
                        } else {
                            c10 = hc.c(w12, webPage.document);
                        }
                        if (!this.U) {
                            str3 = com.google.android.recaptcha.internal.a.j(i7, "_", i7);
                        }
                        imageReceiver.r0(c11, j10, c10, str3, null, 0L, null, null, 0);
                    } else {
                        i10 = 0;
                        i11 = 0;
                    }
                }
                this.f55640c0 = (5.66f * f20) + this.f55640c0;
                boolean isEmpty = TextUtils.isEmpty(webPage.site_name);
                this.K = !isEmpty;
                if (!isEmpty) {
                    ly0 ly0Var2 = new ly0(webPage.site_name, 14.0f, org.telegram.messenger.g0.o());
                    ly0Var2.f35780a.setTextSize(f20 * 14.0f);
                    float f24 = f20 * 40.0f;
                    float f25 = f21 - f24;
                    if (this.R && this.S) {
                        f18 = f20 * 60.0f;
                    } else {
                        f18 = 0.0f;
                    }
                    ly0Var2.p((int) Math.ceil(f25 - f18));
                    this.L = ly0Var2;
                    float f26 = this.f55636a0;
                    float f27 = f24 + ly0Var2.f35782c;
                    if (this.R && this.S) {
                        f19 = f20 * 60.0f;
                    } else {
                        f19 = 0.0f;
                    }
                    this.f55636a0 = Math.max(f26, Math.min(f27 + f19, f21));
                    this.f55640c0 = (f20 * 2.66f) + this.L.i() + this.f55640c0;
                    i12 = this.L.f35781b.getLineCount();
                } else {
                    i12 = 0;
                }
                boolean isEmpty2 = TextUtils.isEmpty(webPage.title);
                this.I = !isEmpty2;
                if (!isEmpty2) {
                    ly0 ly0Var3 = new ly0(webPage.title, 14.0f, org.telegram.messenger.g0.o());
                    ly0Var3.f35780a.setTextSize(f20 * 14.0f);
                    float f28 = f20 * 40.0f;
                    float f29 = f21 - f28;
                    f13 = 2.66f;
                    if (this.R && this.S) {
                        f16 = f20 * 60.0f;
                    } else {
                        f16 = 0.0f;
                    }
                    f14 = f20;
                    ly0Var3.p((int) Math.ceil(f29 - f16));
                    this.J = ly0Var3;
                    float f30 = this.f55636a0;
                    float f31 = f28 + ly0Var3.f35782c;
                    if (this.R && this.S) {
                        f17 = 60.0f * f14;
                    } else {
                        f17 = 0.0f;
                    }
                    this.f55636a0 = Math.max(f30, Math.min(f31 + f17, f21));
                    this.f55640c0 = (f14 * 2.66f) + this.J.i() + this.f55640c0;
                    i12 += this.J.f35781b.getLineCount();
                } else {
                    f13 = 2.66f;
                    f14 = f20;
                }
                boolean isEmpty3 = TextUtils.isEmpty(webPage.description);
                this.M = !isEmpty3;
                if (!isEmpty3) {
                    TextPaint textPaint = this.N;
                    textPaint.setTextSize(f14 * 14.0f);
                    String str4 = webPage.description;
                    float f32 = f14 * 40.0f;
                    int ceil = (int) Math.ceil(Math.max(1.0f, f21 - f32));
                    if (this.R && this.S) {
                        i13 = 60;
                    } else {
                        i13 = 0;
                    }
                    int i17 = 3 - i12;
                    this.O = org.telegram.ui.Cells.q1.H1(str4, textPaint, ceil, (int) Math.ceil(Math.max(1.0f, f21 - ((40 + i13) * f14))), i17, 4);
                    this.P = 0.0f;
                    this.Q = Float.MAX_VALUE;
                    for (int i18 = 0; i18 < this.O.getLineCount(); i18++) {
                        if (this.R && this.S && i18 < i17) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        float f33 = this.P;
                        float lineWidth = this.O.getLineWidth(i18);
                        if (z10) {
                            f15 = f14 * f12;
                        } else {
                            f15 = 0.0f;
                        }
                        this.P = Math.max(f33, lineWidth + f15);
                        this.Q = Math.min(this.Q, this.O.getLineLeft(i18));
                    }
                    this.f55636a0 = Math.max(this.f55636a0, Math.min(f32 + this.P, f21));
                    this.f55640c0 = (f14 * f13) + this.f55640c0 + this.O.getHeight();
                }
                if (this.R && !this.S) {
                    if (i11 > 0 && i10 > 0) {
                        this.f55641d0 = Math.min((Math.max(0.0f, this.f55636a0 - (f14 * 40.0f)) / i11) * i10, f14 * 200.0f);
                    } else {
                        this.f55641d0 = f14 * 120.0f;
                    }
                    this.f55640c0 = (f14 * f13) + this.f55640c0 + this.f55641d0;
                }
                float f34 = f23 + this.f55640c0;
                this.f55640c0 = f34;
                this.f55638b0 = (f14 * 11.0f) + this.f55638b0 + f34;
            } else {
                if (TextUtils.isEmpty(this.W.f55617b)) {
                    String str5 = this.W.f55618c;
                    if (str5.startsWith("https://")) {
                        str5 = str5.substring(8);
                    }
                    str = str5.toUpperCase();
                } else {
                    str = this.W.f55617b;
                }
                RectF rectF = this.f55663y;
                float f35 = ((this.f55637b - i15) - i15) - ((((rectF.left + 30.0f) + 3.25f) + rectF.right) * f20);
                this.f55652n = 1.0f;
                TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                TextPaint textPaint2 = this.f55657r;
                this.f55659s = new StaticLayout(TextUtils.ellipsize(str, textPaint2, (int) Math.ceil(d), truncateAt), textPaint2, (int) Math.ceil(f35), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                this.f55661w = 0.0f;
                this.f55662x = Float.MAX_VALUE;
                for (int i19 = 0; i19 < this.f55659s.getLineCount(); i19++) {
                    this.f55661w = Math.max(this.f55661w, this.f55659s.getLineWidth(i19));
                    this.f55662x = Math.min(this.f55662x, this.f55659s.getLineLeft(i19));
                }
                if (this.f55659s.getLineCount() > 2) {
                    this.f55652n = 0.3f;
                } else {
                    this.f55652n = Math.min(1.0f, f35 / this.f55661w);
                }
                this.f55636a0 = (this.f55661w * this.f55652n) + ((rectF.left + 30.0f + 3.25f + rectF.right) * f20);
                this.f55638b0 = Math.max(f20 * 30.0f, this.f55659s.getHeight() * this.f55652n) + ((rectF.top + rectF.bottom) * f20);
            }
            if (!this.d) {
                this.f55651l0.f(this.F, true);
                this.f55653n0.f(this.S, true);
                this.m0.f(this.R, true);
                this.f55656q0.e(true, this.f55640c0);
            } else {
                invalidate();
            }
            this.f55639c = false;
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        a(canvas);
    }

    public final boolean e() {
        h0 h0Var = this.W;
        if (h0Var != null && h0Var.d != null) {
            return true;
        }
        return false;
    }

    public int getPhotoSide() {
        float f10;
        if (this.S) {
            f10 = 48.0f;
        } else {
            int i7 = this.f55637b;
            int i10 = this.f55644f;
            f10 = (((i7 - i10) - i10) / this.f55642e) - 40.0f;
        }
        return ((int) f10) * 2;
    }

    public int getPreviewType() {
        return this.V;
    }

    public float getRadius() {
        float f10;
        float f11;
        if (e()) {
            f10 = 16.66f;
            f11 = this.f55642e;
        } else {
            f10 = 0.2f;
            f11 = this.f55638b0;
        }
        return f11 * f10;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.T.P();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.T.R();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        d();
        int i11 = this.f55644f;
        int ceil = ((int) Math.ceil(this.f55636a0)) + i11 + i11;
        int ceil2 = (int) Math.ceil(this.f55638b0);
        int i12 = this.h;
        setMeasuredDimension(ceil, ceil2 + i12 + i12);
    }

    public void setMaxWidth(int i7) {
        this.f55637b = i7;
        this.f55639c = true;
    }

    public void setPreviewType(int i7) {
        this.V = i7;
        invalidate();
    }
}
