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
import org.telegram.messenger.k10;
import org.telegram.messenger.np;
import org.telegram.messenger.p10;
import org.telegram.messenger.w7;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.Components.d6;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.xy0;
public class j0 extends View {
    public final Drawable E;
    public final Paint F;
    public boolean G;
    public xy0 H;
    public final Paint I;
    public boolean J;
    public xy0 K;
    public boolean L;
    public xy0 M;
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
    public int f57998a;
    public i0 f57999a0;
    public int f58000b;
    public float f58001b0;
    public boolean f58002c;
    public float f58003c0;
    public boolean d;
    public float f58004d0;
    public final float f58005e;
    public float f58006e0;
    public final int f58007f;
    public int f58008f0;
    public final RectF f58009g0;
    public final int h;
    public final RectF f58010h0;
    public final Path f58011i0;
    public final Path f58012j0;
    public final RectF f58013k0;
    public final RectF f58014l0;
    public final d6 m0;
    public float f58015n;
    public final d6 f58016n0;
    public final d6 f58017o0;
    public final d6 f58018p0;
    public final d6 f58019q0;
    public final TextPaint f58020r;
    public final d6 f58021r0;
    public StaticLayout f58022s;
    public final d6 f58023s0;
    public final d6 f58024t0;
    public float f58025w;
    public float f58026x;
    public final RectF f58027y;

    public j0(Context context, float f10) {
        super(context);
        this.f58002c = true;
        this.f58015n = 1.0f;
        TextPaint textPaint = new TextPaint(1);
        this.f58020r = textPaint;
        this.f58027y = new RectF(4.0f, 4.33f, 7.66f, 3.0f);
        this.F = new Paint(1);
        this.I = new Paint(1);
        this.O = new TextPaint(1);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.U = imageReceiver;
        this.f58009g0 = new RectF();
        this.f58010h0 = new RectF();
        this.f58011i0 = new Path();
        this.f58012j0 = new Path();
        this.f58013k0 = new RectF();
        this.f58014l0 = new RectF();
        nr nrVar = nr.h;
        this.m0 = new d6(this, 0L, 350L, nrVar);
        this.f58016n0 = new d6(this, 0L, 350L, nrVar);
        this.f58017o0 = new d6(this, 0L, 350L, nrVar);
        this.f58018p0 = new d6(this, 0L, 350L, nrVar);
        this.f58019q0 = new d6(this, 0L, 350L, nrVar);
        this.f58021r0 = new d6(this, 0L, 350L, nrVar);
        this.f58023s0 = new d6(this, 0L, 350L, nrVar);
        this.f58024t0 = new d6(this, 0L, 350L, nrVar);
        this.f58005e = f10;
        imageReceiver.K0 = true;
        this.f58007f = (int) (f10 * 3.0f);
        this.h = (int) (f10 * 1.0f);
        this.E = i5.c.g(context, 2131232768);
        textPaint.setTextSize(24.0f * f10);
        textPaint.setTypeface(org.telegram.messenger.g0.o1("fonts/rcondensedbold.ttf"));
    }

    public final void a(android.graphics.Canvas r27) {
        throw new UnsupportedOperationException("Method not decompiled: tg.j0.a(android.graphics.Canvas):void");
    }

    public final void b(int i7, i0 i0Var, boolean z10) {
        this.f57998a = i7;
        if (this.f57999a0 == i0Var && !z10) {
            return;
        }
        this.f57999a0 = i0Var;
        this.f58002c = true;
        this.d = z10;
        requestLayout();
    }

    public final void c(int i7, int i10) {
        int i11 = -16777216;
        Drawable drawable = this.E;
        TextPaint textPaint = this.f58020r;
        if (i7 == 0) {
            this.f58008f0 = i10;
            if (org.telegram.messenger.g0.B(i10) < 0.721f) {
                i11 = -1;
            }
            textPaint.setColor(i11);
            drawable.setColorFilter(new PorterDuffColorFilter(i11, PorterDuff.Mode.SRC_IN));
        } else if (i7 == 1) {
            this.f58008f0 = -16777216;
            textPaint.setColor(-1);
            drawable.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        } else if (i7 == 2) {
            this.f58008f0 = 1275068416;
            textPaint.setColor(-1);
            drawable.setColorFilter(null);
        } else {
            this.f58008f0 = -1;
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
        if (this.f58002c && this.f57999a0 != null) {
            boolean e10 = e();
            int i15 = this.f58007f;
            float f20 = this.f58005e;
            if (e10) {
                if (TextUtils.isEmpty(this.f57999a0.f57956b)) {
                    str2 = this.f57999a0.f57957c;
                } else {
                    str2 = this.f57999a0.f57956b;
                }
                TLRPC.WebPage webPage = this.f57999a0.d;
                float f21 = (this.f58000b - i15) - i15;
                this.f58003c0 = 0.0f;
                this.f58001b0 = 0.0f;
                this.f58004d0 = 0.0f;
                int f22 = p10.f(k10.i(this.f57998a).f());
                dp dpVar = np.u1(this.f57998a).f25966t4;
                String str3 = null;
                if (dpVar != null && f22 >= 7) {
                    cpVar = dpVar.d(f22);
                } else {
                    cpVar = null;
                }
                if (cpVar == null) {
                    int[] iArr = m6.f29642r8;
                    f10 = m6.x0(null, iArr[f22 % iArr.length], false);
                } else {
                    f10 = cpVar.f();
                }
                this.I.setColor(f10);
                this.f58003c0 = (7.33f * f20) + this.f58003c0;
                this.G = this.f57999a0.f57959f;
                xy0 xy0Var = new xy0(str2, 16.0f, null);
                xy0Var.f42244a.setTextSize(16.0f * f20);
                float f23 = 20.0f * f20;
                xy0Var.p(f21 - f23);
                this.H = xy0Var;
                this.f58001b0 = Math.max(this.f58001b0, Math.min(f23 + xy0Var.f42246c, f21));
                float f24 = 7.0f * f20;
                this.f58003c0 = this.H.i() + this.f58003c0 + f24;
                if (webPage.photo == null && !gj.K4(webPage.document)) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                this.S = z10;
                i0 i0Var = this.f57999a0;
                boolean z12 = i0Var.f57958e;
                this.T = !z12;
                if (this.V && (i0Var.f57955a & 4) != 0) {
                    i7 = i0Var.f57960i;
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
                        i11 = w11.f28459w;
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
                            i11 = w13.f28459w;
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
                this.f58004d0 = (5.66f * f20) + this.f58004d0;
                boolean isEmpty = TextUtils.isEmpty(webPage.site_name);
                this.L = !isEmpty;
                if (!isEmpty) {
                    xy0 xy0Var2 = new xy0(webPage.site_name, 14.0f, org.telegram.messenger.g0.o());
                    xy0Var2.f42244a.setTextSize(f20 * 14.0f);
                    float f25 = f20 * 40.0f;
                    float f26 = f21 - f25;
                    if (this.S && this.T) {
                        f18 = f20 * 60.0f;
                    } else {
                        f18 = 0.0f;
                    }
                    xy0Var2.p((int) Math.ceil(f26 - f18));
                    this.M = xy0Var2;
                    float f27 = this.f58001b0;
                    float f28 = f25 + xy0Var2.f42246c;
                    if (this.S && this.T) {
                        f19 = f20 * 60.0f;
                    } else {
                        f19 = 0.0f;
                    }
                    this.f58001b0 = Math.max(f27, Math.min(f28 + f19, f21));
                    this.f58004d0 = (f20 * 2.66f) + this.M.i() + this.f58004d0;
                    i12 = this.M.f42245b.getLineCount();
                } else {
                    i12 = 0;
                }
                boolean isEmpty2 = TextUtils.isEmpty(webPage.title);
                this.J = !isEmpty2;
                if (!isEmpty2) {
                    xy0 xy0Var3 = new xy0(webPage.title, 14.0f, org.telegram.messenger.g0.o());
                    xy0Var3.f42244a.setTextSize(f20 * 14.0f);
                    float f29 = f20 * 40.0f;
                    float f30 = f21 - f29;
                    f13 = 2.66f;
                    if (this.S && this.T) {
                        f16 = f20 * 60.0f;
                    } else {
                        f16 = 0.0f;
                    }
                    f14 = f20;
                    xy0Var3.p((int) Math.ceil(f30 - f16));
                    this.K = xy0Var3;
                    float f31 = this.f58001b0;
                    float f32 = f29 + xy0Var3.f42246c;
                    if (this.S && this.T) {
                        f17 = 60.0f * f14;
                    } else {
                        f17 = 0.0f;
                    }
                    this.f58001b0 = Math.max(f31, Math.min(f32 + f17, f21));
                    this.f58004d0 = (f14 * 2.66f) + this.K.i() + this.f58004d0;
                    i12 += this.K.f42245b.getLineCount();
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
                    float f33 = f14 * 40.0f;
                    int ceil = (int) Math.ceil(Math.max(1.0f, f21 - f33));
                    if (this.S && this.T) {
                        i13 = 60;
                    } else {
                        i13 = 0;
                    }
                    int i17 = 3 - i12;
                    this.P = org.telegram.ui.Cells.r1.I1(str4, textPaint, ceil, (int) Math.ceil(Math.max(1.0f, f21 - ((40 + i13) * f14))), i17, 4);
                    this.Q = 0.0f;
                    this.R = Float.MAX_VALUE;
                    for (int i18 = 0; i18 < this.P.getLineCount(); i18++) {
                        if (this.S && this.T && i18 < i17) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        float f34 = this.Q;
                        float lineWidth = this.P.getLineWidth(i18);
                        if (z11) {
                            f15 = f14 * f12;
                        } else {
                            f15 = 0.0f;
                        }
                        this.Q = Math.max(f34, lineWidth + f15);
                        this.R = Math.min(this.R, this.P.getLineLeft(i18));
                    }
                    this.f58001b0 = Math.max(this.f58001b0, Math.min(f33 + this.Q, f21));
                    this.f58004d0 = (f14 * f13) + this.f58004d0 + this.P.getHeight();
                }
                if (this.S && !this.T) {
                    if (i11 > 0 && i10 > 0) {
                        this.f58006e0 = Math.min((Math.max(0.0f, this.f58001b0 - (f14 * 40.0f)) / i11) * i10, f14 * 200.0f);
                    } else {
                        this.f58006e0 = f14 * 120.0f;
                    }
                    this.f58004d0 = (f14 * f13) + this.f58004d0 + this.f58006e0;
                }
                float f35 = f24 + this.f58004d0;
                this.f58004d0 = f35;
                this.f58003c0 = (f14 * 11.0f) + this.f58003c0 + f35;
            } else {
                if (TextUtils.isEmpty(this.f57999a0.f57956b)) {
                    String str5 = this.f57999a0.f57957c;
                    if (str5.startsWith("https://")) {
                        str5 = str5.substring(8);
                    }
                    str = str5.toUpperCase();
                } else {
                    str = this.f57999a0.f57956b;
                }
                RectF rectF = this.f58027y;
                float f36 = ((this.f58000b - i15) - i15) - ((((rectF.left + 30.0f) + 3.25f) + rectF.right) * f20);
                this.f58015n = 1.0f;
                TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                TextPaint textPaint2 = this.f58020r;
                this.f58022s = new StaticLayout(TextUtils.ellipsize(str, textPaint2, (int) Math.ceil(d), truncateAt), textPaint2, (int) Math.ceil(f36), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                this.f58025w = 0.0f;
                this.f58026x = Float.MAX_VALUE;
                for (int i19 = 0; i19 < this.f58022s.getLineCount(); i19++) {
                    this.f58025w = Math.max(this.f58025w, this.f58022s.getLineWidth(i19));
                    this.f58026x = Math.min(this.f58026x, this.f58022s.getLineLeft(i19));
                }
                if (this.f58022s.getLineCount() > 2) {
                    this.f58015n = 0.3f;
                } else {
                    this.f58015n = Math.min(1.0f, f36 / this.f58025w);
                }
                this.f58001b0 = (this.f58025w * this.f58015n) + ((rectF.left + 30.0f + 3.25f + rectF.right) * f20);
                this.f58003c0 = Math.max(f20 * 30.0f, this.f58022s.getHeight() * this.f58015n) + ((rectF.top + rectF.bottom) * f20);
            }
            if (!this.d) {
                this.m0.f(this.G, true);
                this.f58017o0.f(this.T, true);
                this.f58016n0.f(this.S, true);
                this.f58021r0.e(true, this.f58004d0);
            } else {
                invalidate();
            }
            this.f58002c = false;
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        a(canvas);
    }

    public final boolean e() {
        i0 i0Var = this.f57999a0;
        if (i0Var != null && i0Var.d != null) {
            return true;
        }
        return false;
    }

    public int getPhotoSide() {
        float f10;
        if (this.T) {
            f10 = 48.0f;
        } else {
            int i7 = this.f58000b;
            int i10 = this.f58007f;
            f10 = (((i7 - i10) - i10) / this.f58005e) - 40.0f;
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
            f11 = this.f58005e;
        } else {
            f10 = 0.2f;
            f11 = this.f58003c0;
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
        int i11 = this.f58007f;
        int ceil = ((int) Math.ceil(this.f58001b0)) + i11 + i11;
        int ceil2 = (int) Math.ceil(this.f58003c0);
        int i12 = this.h;
        setMeasuredDimension(ceil, ceil2 + i12 + i12);
    }

    public void setMaxWidth(int i7) {
        this.f58000b = i7;
        this.f58002c = true;
    }

    public void setPreviewType(int i7) {
        this.W = i7;
        invalidate();
    }
}
