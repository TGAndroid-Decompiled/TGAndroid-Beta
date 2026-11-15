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
import org.telegram.messenger.cp;
import org.telegram.messenger.dp;
import org.telegram.messenger.gc;
import org.telegram.messenger.gj;
import org.telegram.messenger.m10;
import org.telegram.messenger.np;
import org.telegram.messenger.q10;
import org.telegram.messenger.w7;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.oy0;
import org.telegram.ui.Components.u5;
public class i0 extends View {
    public final Drawable E;
    public final Paint F;
    public boolean G;
    public oy0 H;
    public final Paint I;
    public boolean J;
    public oy0 K;
    public boolean L;
    public oy0 M;
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
    public int f57340a;
    public h0 f57341a0;
    public int f57342b;
    public float f57343b0;
    public boolean f57344c;
    public float f57345c0;
    public boolean d;
    public float f57346d0;
    public final float f57347e;
    public float f57348e0;
    public final int f57349f;
    public int f57350f0;
    public final RectF f57351g0;
    public final int h;
    public final RectF f57352h0;
    public final Path f57353i0;
    public final Path f57354j0;
    public final RectF f57355k0;
    public final RectF f57356l0;
    public final u5 m0;
    public float f57357n;
    public final u5 f57358n0;
    public final u5 f57359o0;
    public final u5 f57360p0;
    public final u5 f57361q0;
    public final TextPaint f57362r;
    public final u5 f57363r0;
    public StaticLayout f57364s;
    public final u5 f57365s0;
    public final u5 f57366t0;
    public float f57367w;
    public float f57368x;
    public final RectF f57369y;

    public i0(Context context, float f10) {
        super(context);
        this.f57344c = true;
        this.f57357n = 1.0f;
        TextPaint textPaint = new TextPaint(1);
        this.f57362r = textPaint;
        this.f57369y = new RectF(4.0f, 4.33f, 7.66f, 3.0f);
        this.F = new Paint(1);
        this.I = new Paint(1);
        this.O = new TextPaint(1);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.U = imageReceiver;
        this.f57351g0 = new RectF();
        this.f57352h0 = new RectF();
        this.f57353i0 = new Path();
        this.f57354j0 = new Path();
        this.f57355k0 = new RectF();
        this.f57356l0 = new RectF();
        er erVar = er.h;
        this.m0 = new u5(this, 0L, 350L, erVar);
        this.f57358n0 = new u5(this, 0L, 350L, erVar);
        this.f57359o0 = new u5(this, 0L, 350L, erVar);
        this.f57360p0 = new u5(this, 0L, 350L, erVar);
        this.f57361q0 = new u5(this, 0L, 350L, erVar);
        this.f57363r0 = new u5(this, 0L, 350L, erVar);
        this.f57365s0 = new u5(this, 0L, 350L, erVar);
        this.f57366t0 = new u5(this, 0L, 350L, erVar);
        this.f57347e = f10;
        imageReceiver.K0 = true;
        this.f57349f = (int) (f10 * 3.0f);
        this.h = (int) (f10 * 1.0f);
        this.E = i5.c.g(context, 2131232767);
        textPaint.setTextSize(24.0f * f10);
        textPaint.setTypeface(org.telegram.messenger.g0.o1("fonts/rcondensedbold.ttf"));
    }

    public final void a(android.graphics.Canvas r27) {
        throw new UnsupportedOperationException("Method not decompiled: tg.i0.a(android.graphics.Canvas):void");
    }

    public final void b(int i7, h0 h0Var, boolean z10) {
        this.f57340a = i7;
        if (this.f57341a0 == h0Var && !z10) {
            return;
        }
        this.f57341a0 = h0Var;
        this.f57344c = true;
        this.d = z10;
        requestLayout();
    }

    public final void c(int i7, int i10) {
        int i11 = -16777216;
        Drawable drawable = this.E;
        TextPaint textPaint = this.f57362r;
        if (i7 == 0) {
            this.f57350f0 = i10;
            if (org.telegram.messenger.g0.B(i10) < 0.721f) {
                i11 = -1;
            }
            textPaint.setColor(i11);
            drawable.setColorFilter(new PorterDuffColorFilter(i11, PorterDuff.Mode.SRC_IN));
        } else if (i7 == 1) {
            this.f57350f0 = -16777216;
            textPaint.setColor(-1);
            drawable.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        } else if (i7 == 2) {
            this.f57350f0 = 1275068416;
            textPaint.setColor(-1);
            drawable.setColorFilter(null);
        } else {
            this.f57350f0 = -1;
            textPaint.setColor(-13397548);
            drawable.setColorFilter(new PorterDuffColorFilter(-13397548, PorterDuff.Mode.SRC_IN));
        }
        invalidate();
    }

    public final void d() {
        String str;
        double d;
        String str2;
        cp cpVar;
        int f10;
        boolean z10;
        float f11;
        int i7;
        float f12;
        int i10;
        int i11;
        gc c10;
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
        gc i14;
        if (this.f57344c && this.f57341a0 != null) {
            boolean e10 = e();
            int i15 = this.f57349f;
            float f20 = this.f57347e;
            if (e10) {
                if (TextUtils.isEmpty(this.f57341a0.f57321b)) {
                    str2 = this.f57341a0.f57322c;
                } else {
                    str2 = this.f57341a0.f57321b;
                }
                TLRPC.WebPage webPage = this.f57341a0.d;
                float f21 = (this.f57342b - i15) - i15;
                this.f57345c0 = 0.0f;
                this.f57343b0 = 0.0f;
                this.f57346d0 = 0.0f;
                int e11 = q10.e(m10.i(this.f57340a).f());
                dp dpVar = np.s1(this.f57340a).f25383r4;
                String str3 = null;
                if (dpVar != null && e11 >= 7) {
                    cpVar = dpVar.d(e11);
                } else {
                    cpVar = null;
                }
                if (cpVar == null) {
                    int[] iArr = j6.f29110r8;
                    f10 = j6.x0(null, iArr[e11 % iArr.length], false);
                } else {
                    f10 = cpVar.f();
                }
                this.I.setColor(f10);
                this.f57345c0 = (7.33f * f20) + this.f57345c0;
                this.G = this.f57341a0.f57324f;
                oy0 oy0Var = new oy0(str2, 16.0f, null);
                oy0Var.f38101a.setTextSize(16.0f * f20);
                float f22 = 20.0f * f20;
                oy0Var.p(f21 - f22);
                this.H = oy0Var;
                this.f57343b0 = Math.max(this.f57343b0, Math.min(f22 + oy0Var.f38103c, f21));
                float f23 = 7.0f * f20;
                this.f57345c0 = this.H.i() + this.f57345c0 + f23;
                if (webPage.photo == null && !gj.K4(webPage.document)) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                this.S = z10;
                h0 h0Var = this.f57341a0;
                boolean z12 = h0Var.f57323e;
                this.T = !z12;
                if (this.V && (h0Var.f57320a & 4) != 0) {
                    i7 = h0Var.f57325i;
                } else {
                    if (!z12) {
                        f11 = 48.0f;
                    } else {
                        f11 = (f21 / f20) - 40.0f;
                    }
                    i7 = 2 * ((int) f11);
                }
                ImageReceiver imageReceiver = this.U;
                imageReceiver.J0((int) (4.0f * f20));
                TLRPC.Photo photo = webPage.photo;
                if (photo != null) {
                    TLRPC.PhotoSize w10 = w7.w(photo.sizes, 1, false, null, false);
                    f12 = 48.0f;
                    TLRPC.PhotoSize w11 = w7.w(webPage.photo.sizes, (int) (i7 * f20), false, w10, false);
                    if (w11 != null) {
                        i11 = w11.f28076w;
                        i10 = w11.h;
                    } else {
                        i10 = 0;
                        i11 = 0;
                    }
                    gc i16 = gc.i(w11, webPage.photo);
                    String j3 = com.google.android.gms.internal.vision.e2.j(i7, "_", i7);
                    if (this.V) {
                        i14 = null;
                    } else {
                        i14 = gc.i(w10, webPage.photo);
                    }
                    if (!this.V) {
                        str3 = com.google.android.gms.internal.vision.e2.j(i7, "_", i7);
                    }
                    imageReceiver.r0(i16, j3, i14, str3, null, 0L, null, null, 0);
                } else {
                    f12 = 48.0f;
                    TLRPC.Document document = webPage.document;
                    if (document != null) {
                        TLRPC.PhotoSize w12 = w7.w(document.thumbs, 1, false, null, false);
                        TLRPC.PhotoSize w13 = w7.w(webPage.document.thumbs, (int) (i7 * f20), false, w12, false);
                        if (w13 != null) {
                            i11 = w13.f28076w;
                            i10 = w13.h;
                        } else {
                            i10 = 0;
                            i11 = 0;
                        }
                        gc c11 = gc.c(w13, webPage.document);
                        String j10 = com.google.android.gms.internal.vision.e2.j(i7, "_", i7);
                        if (this.V) {
                            c10 = null;
                        } else {
                            c10 = gc.c(w12, webPage.document);
                        }
                        if (!this.V) {
                            str3 = com.google.android.gms.internal.vision.e2.j(i7, "_", i7);
                        }
                        imageReceiver.r0(c11, j10, c10, str3, null, 0L, null, null, 0);
                    } else {
                        i10 = 0;
                        i11 = 0;
                    }
                }
                this.f57346d0 = (5.66f * f20) + this.f57346d0;
                boolean isEmpty = TextUtils.isEmpty(webPage.site_name);
                this.L = !isEmpty;
                if (!isEmpty) {
                    oy0 oy0Var2 = new oy0(webPage.site_name, 14.0f, org.telegram.messenger.g0.o());
                    oy0Var2.f38101a.setTextSize(f20 * 14.0f);
                    float f24 = f20 * 40.0f;
                    float f25 = f21 - f24;
                    if (this.S && this.T) {
                        f18 = f20 * 60.0f;
                    } else {
                        f18 = 0.0f;
                    }
                    oy0Var2.p((int) Math.ceil(f25 - f18));
                    this.M = oy0Var2;
                    float f26 = this.f57343b0;
                    float f27 = f24 + oy0Var2.f38103c;
                    if (this.S && this.T) {
                        f19 = f20 * 60.0f;
                    } else {
                        f19 = 0.0f;
                    }
                    this.f57343b0 = Math.max(f26, Math.min(f27 + f19, f21));
                    this.f57346d0 = (f20 * 2.66f) + this.M.i() + this.f57346d0;
                    i12 = this.M.f38102b.getLineCount();
                } else {
                    i12 = 0;
                }
                boolean isEmpty2 = TextUtils.isEmpty(webPage.title);
                this.J = !isEmpty2;
                if (!isEmpty2) {
                    oy0 oy0Var3 = new oy0(webPage.title, 14.0f, org.telegram.messenger.g0.o());
                    oy0Var3.f38101a.setTextSize(f20 * 14.0f);
                    float f28 = f20 * 40.0f;
                    float f29 = f21 - f28;
                    f13 = 2.66f;
                    if (this.S && this.T) {
                        f16 = f20 * 60.0f;
                    } else {
                        f16 = 0.0f;
                    }
                    f14 = f20;
                    oy0Var3.p((int) Math.ceil(f29 - f16));
                    this.K = oy0Var3;
                    float f30 = this.f57343b0;
                    float f31 = f28 + oy0Var3.f38103c;
                    if (this.S && this.T) {
                        f17 = 60.0f * f14;
                    } else {
                        f17 = 0.0f;
                    }
                    this.f57343b0 = Math.max(f30, Math.min(f31 + f17, f21));
                    this.f57346d0 = (f14 * 2.66f) + this.K.i() + this.f57346d0;
                    i12 += this.K.f38102b.getLineCount();
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
                    int i17 = 3 - i12;
                    this.P = org.telegram.ui.Cells.q1.I1(str4, textPaint, ceil, (int) Math.ceil(Math.max(1.0f, f21 - ((40 + i13) * f14))), i17, 4);
                    this.Q = 0.0f;
                    this.R = Float.MAX_VALUE;
                    for (int i18 = 0; i18 < this.P.getLineCount(); i18++) {
                        if (this.S && this.T && i18 < i17) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        float f33 = this.Q;
                        float lineWidth = this.P.getLineWidth(i18);
                        if (z11) {
                            f15 = f14 * f12;
                        } else {
                            f15 = 0.0f;
                        }
                        this.Q = Math.max(f33, lineWidth + f15);
                        this.R = Math.min(this.R, this.P.getLineLeft(i18));
                    }
                    this.f57343b0 = Math.max(this.f57343b0, Math.min(f32 + this.Q, f21));
                    this.f57346d0 = (f14 * f13) + this.f57346d0 + this.P.getHeight();
                }
                if (this.S && !this.T) {
                    if (i11 > 0 && i10 > 0) {
                        this.f57348e0 = Math.min((Math.max(0.0f, this.f57343b0 - (f14 * 40.0f)) / i11) * i10, f14 * 200.0f);
                    } else {
                        this.f57348e0 = f14 * 120.0f;
                    }
                    this.f57346d0 = (f14 * f13) + this.f57346d0 + this.f57348e0;
                }
                float f34 = f23 + this.f57346d0;
                this.f57346d0 = f34;
                this.f57345c0 = (f14 * 11.0f) + this.f57345c0 + f34;
            } else {
                if (TextUtils.isEmpty(this.f57341a0.f57321b)) {
                    String str5 = this.f57341a0.f57322c;
                    if (str5.startsWith("https://")) {
                        str5 = str5.substring(8);
                    }
                    str = str5.toUpperCase();
                } else {
                    str = this.f57341a0.f57321b;
                }
                RectF rectF = this.f57369y;
                float f35 = ((this.f57342b - i15) - i15) - ((((rectF.left + 30.0f) + 3.25f) + rectF.right) * f20);
                this.f57357n = 1.0f;
                TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                TextPaint textPaint2 = this.f57362r;
                this.f57364s = new StaticLayout(TextUtils.ellipsize(str, textPaint2, (int) Math.ceil(d), truncateAt), textPaint2, (int) Math.ceil(f35), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                this.f57367w = 0.0f;
                this.f57368x = Float.MAX_VALUE;
                for (int i19 = 0; i19 < this.f57364s.getLineCount(); i19++) {
                    this.f57367w = Math.max(this.f57367w, this.f57364s.getLineWidth(i19));
                    this.f57368x = Math.min(this.f57368x, this.f57364s.getLineLeft(i19));
                }
                if (this.f57364s.getLineCount() > 2) {
                    this.f57357n = 0.3f;
                } else {
                    this.f57357n = Math.min(1.0f, f35 / this.f57367w);
                }
                this.f57343b0 = (this.f57367w * this.f57357n) + ((rectF.left + 30.0f + 3.25f + rectF.right) * f20);
                this.f57345c0 = Math.max(f20 * 30.0f, this.f57364s.getHeight() * this.f57357n) + ((rectF.top + rectF.bottom) * f20);
            }
            if (!this.d) {
                this.m0.f(this.G, true);
                this.f57359o0.f(this.T, true);
                this.f57358n0.f(this.S, true);
                this.f57363r0.e(true, this.f57346d0);
            } else {
                invalidate();
            }
            this.f57344c = false;
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        a(canvas);
    }

    public final boolean e() {
        h0 h0Var = this.f57341a0;
        if (h0Var != null && h0Var.d != null) {
            return true;
        }
        return false;
    }

    public int getPhotoSide() {
        float f10;
        if (this.T) {
            f10 = 48.0f;
        } else {
            int i7 = this.f57342b;
            int i10 = this.f57349f;
            f10 = (((i7 - i10) - i10) / this.f57347e) - 40.0f;
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
            f11 = this.f57347e;
        } else {
            f10 = 0.2f;
            f11 = this.f57345c0;
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
    public final void onMeasure(int i7, int i10) {
        d();
        int i11 = this.f57349f;
        int ceil = ((int) Math.ceil(this.f57343b0)) + i11 + i11;
        int ceil2 = (int) Math.ceil(this.f57345c0);
        int i12 = this.h;
        setMeasuredDimension(ceil, ceil2 + i12 + i12);
    }

    public void setMaxWidth(int i7) {
        this.f57342b = i7;
        this.f57344c = true;
    }

    public void setPreviewType(int i7) {
        this.W = i7;
        invalidate();
    }
}
