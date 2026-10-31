package rh;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.cd;
import org.telegram.messenger.d20;
import org.telegram.messenger.h20;
import org.telegram.messenger.jj;
import org.telegram.messenger.vp;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.dc;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.qz0;
public final class g4 {
    public float A;
    public float B;
    public qz0 C;
    public final RectF D;
    public final Path E;
    public final Paint F;
    public final s8 G;
    public final dc H;
    public final dc I;
    public final dc J;
    public final RectF K;
    public boolean L;
    public int M;
    public boolean N;
    public int O;
    public int P;
    public TLRPC.TL_messageActionStarGiftUnique Q;
    public jj R;
    public boolean S;
    public final fe.f T;
    public ph.e0 U;
    public ph.e0 V;
    public final int f46953a;
    public final View f46954b;
    public final org.telegram.ui.ActionBar.p6 f46955c;
    public final ImageReceiver d;
    public final org.telegram.ui.Components.d5 e;
    public int f46957g;
    public RadialGradient h;
    public final ph.f1 f46959j;
    public TL_stars.starGiftAttributeBackdrop f46960k;
    public TL_stars.starGiftAttributePattern f46961l;
    public TL_stars.starGiftAttributeModel f46962m;
    public boolean f46965p;
    public float f46966q;
    public qz0 f46967r;
    public float f46968s;
    public qz0 f46969t;
    public float f46970u;
    public float v;
    public float f46972x;
    public final ph.l0 f46973y;
    public boolean f46974z;
    public final Paint f46956f = new Paint(1);
    public final Matrix f46958i = new Matrix();
    public final RectF f46963n = new RectF();
    public final Path f46964o = new Path();
    public final ArrayList f46971w = new ArrayList();

    public g4(int i10, View view, org.telegram.ui.ActionBar.p6 p6Var) {
        ph.l0 l0Var = new ph.l0();
        this.f46973y = l0Var;
        this.D = new RectF();
        this.E = new Path();
        this.F = new Paint();
        this.G = new s8(1, 25);
        this.K = new RectF();
        this.T = new fe.f(0, new d0(this, 3), gr.h, 320L);
        this.f46953a = i10;
        this.f46954b = view;
        this.f46955c = p6Var;
        this.f46959j = new ph.f1(view);
        this.H = new dc(view);
        this.I = new dc(view);
        this.J = new dc(view);
        this.d = new ImageReceiver(view);
        this.e = new org.telegram.ui.Components.d5(org.telegram.messenger.i0.L(28.0f), view);
        l0Var.f45189r = view;
        l0Var.d.H0(view);
    }

    public final void a() {
        this.S = true;
        if (this.Q != null) {
            this.d.P();
            this.e.a();
            this.f46973y.d.P();
        }
    }

    public final void b(Canvas canvas) {
        boolean z10 = this.L;
        ph.f1 f1Var = this.f46959j;
        if (z10 && f1Var != null) {
            int i10 = this.M;
            int i11 = org.telegram.ui.ActionBar.a7.f20158b;
            if (i10 != i11) {
                this.M = i11;
                try {
                    int w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21170q7, this.f46955c);
                    Paint paint = (Paint) f1Var.f26491b;
                    paint.setShader(null);
                    paint.setColor(w02);
                } catch (Exception e) {
                    org.telegram.messenger.f8.g(e, true);
                }
            }
        }
        fe.f fVar = this.T;
        float f7 = fVar.f7031f;
        float f10 = f7 / 2.0f;
        RectF rectF = this.f46963n;
        rectF.set(0.0f, 0.0f, f7, this.P);
        int height = ((int) (rectF.height() + rectF.width())) / 2;
        if (this.f46960k != null && (this.h == null || this.f46957g != height)) {
            this.f46957g = height;
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = this.f46960k;
            this.h = new RadialGradient(0.0f, 0.0f, height, new int[]{stargiftattributebackdrop.center_color | (-16777216), stargiftattributebackdrop.edge_color | (-16777216)}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        }
        RadialGradient radialGradient = this.h;
        Paint paint2 = this.f46956f;
        if (radialGradient != null) {
            Matrix matrix = this.f46958i;
            matrix.reset();
            matrix.postTranslate(f10, f10);
            this.h.setLocalMatrix(matrix);
            paint2.setShader(this.h);
        }
        Path path = this.f46964o;
        path.rewind();
        path.addRoundRect(rectF, org.telegram.messenger.i0.L(14.0f), org.telegram.messenger.i0.L(14.0f), Path.Direction.CW);
        canvas.save();
        float a2 = this.I.a(0.0125f);
        canvas.scale(a2, a2, rectF.centerX(), rectF.centerY());
        canvas.save();
        canvas.clipPath(path);
        canvas.drawPaint(paint2);
        canvas.save();
        canvas.translate(f10, org.telegram.messenger.i0.L(65.0f));
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop2 = this.f46960k;
        org.telegram.ui.Components.d5 d5Var = this.e;
        if (stargiftattributebackdrop2 != null) {
            d5Var.k(Integer.valueOf(stargiftattributebackdrop2.pattern_color | (-16777216)));
        }
        j0.a(canvas, 1, d5Var, rectF.width(), rectF.height(), 1.0f, 1.1f);
        canvas.restore();
        ImageReceiver imageReceiver = this.d;
        imageReceiver.y0(f10 - (org.telegram.messenger.i0.L(110.0f) / 2.0f), org.telegram.messenger.i0.L(10.0f), org.telegram.messenger.i0.L(110.0f), org.telegram.messenger.i0.L(110.0f));
        imageReceiver.h(canvas, null);
        int r12 = org.telegram.ui.ActionBar.t6.r1(0.6f, -1);
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop3 = this.f46960k;
        if (stargiftattributebackdrop3 != null) {
            r12 = stargiftattributebackdrop3.text_color | (-16777216);
        }
        int i12 = r12;
        this.f46967r.f29784p = fVar.f7031f - org.telegram.messenger.i0.L(12.0f);
        qz0 qz0Var = this.f46967r;
        qz0Var.c(f10 - (qz0Var.f29774c / 2.0f), this.f46966q, 1.0f, -1, canvas);
        this.f46969t.f29784p = fVar.f7031f - org.telegram.messenger.i0.L(12.0f);
        qz0 qz0Var2 = this.f46969t;
        Canvas canvas2 = canvas;
        int i13 = i12;
        qz0Var2.c(f10 - (qz0Var2.f29774c / 2.0f), this.f46968s, 1.0f, i13, canvas2);
        if (this.f46974z) {
            ph.l0 l0Var = this.f46973y;
            int i14 = l0Var.f45191t;
            int i15 = l0Var.f45192u;
            int i16 = (int) (f10 - (i14 / 2.0f));
            int i17 = (int) this.f46972x;
            int i18 = i14 + i16;
            l0Var.setBounds(i16, i17, i18, i17 + i15);
            float f11 = this.f46972x;
            RectF rectF2 = this.K;
            rectF2.set(i16, f11, i18, i15 + f11);
            float a10 = this.J.a(0.04f);
            canvas2.save();
            canvas2.scale(a10, a10, rectF2.centerX(), rectF2.centerY());
            l0Var.draw(canvas2);
            canvas2.restore();
        } else {
            float f12 = 9.0f;
            float L = this.f46970u + org.telegram.messenger.i0.L(9.0f) + this.v;
            ArrayList arrayList = this.f46971w;
            int size = arrayList.size();
            int i19 = 0;
            while (i19 < size) {
                int i20 = i19 + 1;
                f4 f4Var = (f4) arrayList.get(i19);
                qz0 qz0Var3 = f4Var.f46898b;
                float f13 = f10 - (L / 2.0f);
                float f14 = f12;
                qz0Var3.c((f13 + this.f46970u) - qz0Var3.f29774c, f4Var.f46897a, 1.0f, i13, canvas2);
                canvas2 = canvas;
                f4Var.f46899c.c(f13 + this.f46970u + org.telegram.messenger.i0.L(f14), f4Var.f46897a, 1.0f, -1, canvas2);
                i13 = i13;
                i19 = i20;
                f12 = f14;
            }
        }
        int i21 = i13;
        if (!this.f46965p) {
            float f15 = this.A;
            float a11 = org.telegram.messenger.m5.a(this.C.f29774c, org.telegram.messenger.i0.L(30.0f), 2.0f, f10);
            float f16 = this.A + this.B;
            RectF rectF3 = this.D;
            rectF3.set(f10 - ((this.C.f29774c + org.telegram.messenger.i0.L(30.0f)) / 2.0f), f15, a11, f16);
            Path path2 = this.E;
            path2.rewind();
            float f17 = this.B / 2.0f;
            path2.addRoundRect(rectF3, f17, f17, Path.Direction.CW);
            int r13 = org.telegram.ui.ActionBar.t6.r1(0.13f, -16777216);
            Paint paint3 = this.F;
            paint3.setColor(r13);
            float a12 = this.H.a(0.075f);
            canvas2.scale(a12, a12, rectF3.centerX(), rectF3.centerY());
            canvas2.drawPath(path2, paint3);
            canvas2.restore();
            f1Var.setBounds(((int) rectF.right) - org.telegram.messenger.i0.L(46.67f), ((int) rectF.top) - org.telegram.messenger.i0.L(1.33f), org.telegram.messenger.i0.L(1.33f) + ((int) rectF.right), org.telegram.messenger.i0.L(46.67f) + ((int) rectF.top));
            f1Var.f45041y = i21;
            f1Var.draw(canvas2);
        }
        canvas2.restore();
    }

    public final void c(Canvas canvas) {
        if (this.f46965p) {
            return;
        }
        canvas.save();
        float a2 = this.I.a(0.0125f);
        RectF rectF = this.f46963n;
        canvas.scale(a2, a2, rectF.centerX(), rectF.centerY());
        float a10 = this.H.a(0.075f);
        RectF rectF2 = this.D;
        canvas.scale(a10, a10, rectF2.centerX(), rectF2.centerY());
        canvas.clipPath(this.E);
        s8 s8Var = this.G;
        s8Var.g(rectF2);
        s8Var.d();
        s8Var.a(canvas, org.telegram.ui.ActionBar.t6.r1(0.7f, -1));
        this.C.c(rectF2.left + org.telegram.messenger.i0.L(15.0f), rectF2.centerY(), 1.0f, -1, canvas);
        canvas.restore();
        View view = this.f46954b;
        if (view instanceof org.telegram.ui.Cells.s0) {
            ((org.telegram.ui.Cells.s0) view).U();
        } else {
            view.invalidate();
        }
    }

    public final float d() {
        return this.T.f7031f;
    }

    public final boolean e(float r18, float r19, android.view.MotionEvent r20) {
        throw new UnsupportedOperationException("Method not decompiled: rh.g4.e(float, float, android.view.MotionEvent):boolean");
    }

    public final void f(org.telegram.messenger.jj r12, boolean r13) {
        throw new UnsupportedOperationException("Method not decompiled: rh.g4.f(org.telegram.messenger.jj, boolean):void");
    }

    public final void g(jj jjVar, TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        long B0;
        float f7;
        int i10;
        float f10;
        int L;
        TLObject d22;
        int i11;
        float f11 = this.O;
        boolean P3 = jjVar.P3();
        boolean z10 = !tL_messageActionStarGiftUnique.upgrade;
        int i12 = this.f46953a;
        if (z10 == P3) {
            B0 = d20.i(i12).e();
        } else {
            B0 = jj.B0(jjVar.f16337k);
        }
        TLRPC.Peer peer = tL_messageActionStarGiftUnique.from_id;
        if (peer != null) {
            B0 = org.telegram.messenger.o5.o(peer);
        }
        String t10 = org.telegram.messenger.o5.t(B0);
        float L2 = org.telegram.messenger.i0.L(10.0f) + 0.0f + org.telegram.messenger.i0.L(110.0f) + org.telegram.messenger.i0.L(9.33f);
        int i13 = 0;
        if (this.f46965p) {
            this.f46967r = new qz0(tL_starGiftUnique.title, 14.0f, org.telegram.messenger.i0.o());
        } else if (tL_messageActionStarGiftUnique.peer == null && !h20.A(jj.B0(jjVar.f16337k))) {
            if (jj.B0(jjVar.f16337k) == d20.i(i12).e()) {
                if (tL_starGiftUnique.crafted) {
                    this.f46967r = new qz0(cd.L0(2131750470, null), 14.0f, org.telegram.messenger.i0.o());
                } else if (tL_messageActionStarGiftUnique.resale_amount != null) {
                    this.f46967r = new qz0(cd.L0(2131750457, null), 14.0f, org.telegram.messenger.i0.o());
                } else {
                    this.f46967r = new qz0(cd.L0(2131750435, null), 14.0f, org.telegram.messenger.i0.o());
                }
            } else {
                this.f46967r = new qz0(cd.a0(null, null, 2131749901, t10), 14.0f, org.telegram.messenger.i0.o());
            }
        } else {
            this.f46967r = new qz0(cd.L0(2131749900, null), 14.0f, org.telegram.messenger.i0.o());
        }
        this.f46966q = (this.f46967r.i() / 2.0f) + L2;
        float i14 = this.f46967r.i() + L2 + org.telegram.messenger.i0.L(3.0f);
        if (this.f46965p) {
            f7 = 2.0f;
            this.f46969t = new qz0(cd.H(',', "Gift2CollectionNumber", tL_starGiftUnique.num), 12.0f, org.telegram.messenger.i0.o());
            i10 = i12;
        } else {
            f7 = 2.0f;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(tL_starGiftUnique.title);
            sb2.append(" #");
            i10 = i12;
            this.f46969t = new qz0(i0.a.k(tL_starGiftUnique.num, ',', sb2), 12.0f, null);
        }
        this.f46968s = (this.f46969t.i() / f7) + i14;
        float i15 = this.f46969t.i() + i14;
        if (this.f46965p) {
            f10 = 14.0f;
        } else {
            f10 = 11.0f;
        }
        float L3 = i15 + org.telegram.messenger.i0.L(f10);
        ArrayList arrayList = this.f46971w;
        arrayList.clear();
        this.f46970u = 0.0f;
        this.v = 0.0f;
        TLRPC.TL_textWithEntities tL_textWithEntities = tL_messageActionStarGiftUnique.message;
        ph.l0 l0Var = this.f46973y;
        if (tL_textWithEntities != null) {
            TextPaint textPaint = l0Var.f45177c;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tL_textWithEntities.text);
            jj.b(spannableStringBuilder, tL_textWithEntities.entities, false, false, false, false, 0);
            Spannable A5 = jj.A5(org.telegram.messenger.k6.m(spannableStringBuilder, textPaint.getFontMetricsInt(), false, null, 0), tL_textWithEntities.entities, textPaint.getFontMetricsInt(), false);
            if (tL_messageActionStarGiftUnique.name_hidden) {
                d22 = null;
            } else if (tL_messageActionStarGiftUnique.from_id != null) {
                d22 = vp.r1(i10).d2(org.telegram.messenger.o5.o(tL_messageActionStarGiftUnique.from_id));
            } else {
                d22 = vp.r1(i10).d2(jjVar.Z0());
            }
            this.f46974z = true;
            l0Var.c(d22);
            l0Var.f45184m = A5;
            l0Var.f45190s = -1;
            l0Var.b(((int) f11) - org.telegram.messenger.i0.L(24.0f));
            if (!this.N) {
                StaticLayout staticLayout = l0Var.f45185n;
                if (staticLayout != null) {
                    i11 = staticLayout.getLineCount();
                } else {
                    i11 = 0;
                }
                if (i11 > 3) {
                    this.N = true;
                    StaticLayout staticLayout2 = l0Var.f45185n;
                    if (staticLayout2 != null) {
                        i13 = staticLayout2.getLineCount();
                    }
                    this.O = (int) ((Math.min(0.4f, (i13 - 3) * 0.1f) + 1.0f) * this.O);
                    g(jjVar, tL_messageActionStarGiftUnique, tL_starGiftUnique);
                    return;
                }
            }
            float L4 = L3 + org.telegram.messenger.i0.L(4.0f);
            this.f46972x = L4;
            L3 = L4 + l0Var.f45192u + org.telegram.messenger.i0.L(3.0f);
        } else {
            this.f46974z = false;
            l0Var.c(null);
            l0Var.f45184m = null;
            l0Var.f45190s = -1;
            if (this.f46962m != null) {
                if (!arrayList.isEmpty()) {
                    L3 += org.telegram.messenger.i0.L(6.0f);
                }
                f4 f4Var = new f4(L3, cd.L0(2131750396, null), this.f46962m.name);
                arrayList.add(f4Var);
                float f12 = f11 * 0.5f;
                qz0 qz0Var = f4Var.f46898b;
                qz0Var.f29784p = f12;
                this.f46970u = Math.max(this.f46970u, qz0Var.f29774c);
                qz0 qz0Var2 = f4Var.f46899c;
                qz0Var2.f29784p = f12;
                this.v = Math.max(this.v, qz0Var2.f29774c);
                L3 += f4Var.a();
            }
            if (this.f46960k != null) {
                if (!arrayList.isEmpty()) {
                    L3 += org.telegram.messenger.i0.L(6.0f);
                }
                f4 f4Var2 = new f4(L3, cd.L0(2131750397, null), this.f46960k.name);
                arrayList.add(f4Var2);
                float f13 = f11 * 0.5f;
                qz0 qz0Var3 = f4Var2.f46898b;
                qz0Var3.f29784p = f13;
                this.f46970u = Math.max(this.f46970u, qz0Var3.f29774c);
                qz0 qz0Var4 = f4Var2.f46899c;
                qz0Var4.f29784p = f13;
                this.v = Math.max(this.v, qz0Var4.f29774c);
                L3 = f4Var2.a() + L3;
            }
            if (this.f46961l != null) {
                if (!arrayList.isEmpty()) {
                    L3 += org.telegram.messenger.i0.L(6.0f);
                }
                f4 f4Var3 = new f4(L3, cd.L0(2131750389, null), this.f46961l.name);
                arrayList.add(f4Var3);
                float f14 = f11 * 0.5f;
                qz0 qz0Var5 = f4Var3.f46898b;
                qz0Var5.f29784p = f14;
                this.f46970u = Math.max(this.f46970u, qz0Var5.f29774c);
                qz0 qz0Var6 = f4Var3.f46899c;
                qz0Var6.f29784p = f14;
                this.v = Math.max(this.v, qz0Var6.f29774c);
                L3 += f4Var3.a();
            }
        }
        float L5 = L3 + org.telegram.messenger.i0.L(11.66f);
        if (!this.f46965p) {
            this.A = L5;
            this.C = new qz0(cd.L0(2131749897, null), 14.0f, org.telegram.messenger.i0.o());
            float L6 = org.telegram.messenger.i0.L(30.0f);
            this.B = L6;
            L5 += L6;
            L = org.telegram.messenger.i0.L(11.0f);
        } else {
            L = org.telegram.messenger.i0.L(10.0f);
        }
        this.P = (int) (L5 + L);
    }

    public final void h(TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10, TLRPC.TL_textWithEntities tL_textWithEntities, String str) {
        Spanned spanned;
        int i10;
        float f7 = this.O;
        float L = org.telegram.messenger.i0.L(10.0f) + 0.0f + org.telegram.messenger.i0.L(110.0f) + org.telegram.messenger.i0.L(9.33f);
        int i11 = 0;
        TLObject tLObject = null;
        qz0 qz0Var = new qz0(cd.a0(null, null, 2131749901, org.telegram.messenger.o5.t(j10)), 14.0f, org.telegram.messenger.i0.o());
        this.f46967r = qz0Var;
        this.f46966q = (qz0Var.i() / 2.0f) + L;
        float i12 = this.f46967r.i() + L + org.telegram.messenger.i0.L(3.0f);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(tL_starGiftUnique.title);
        sb2.append(" #");
        qz0 qz0Var2 = new qz0(i0.a.k(tL_starGiftUnique.num, ',', sb2), 12.0f, null);
        this.f46969t = qz0Var2;
        this.f46968s = (qz0Var2.i() / 2.0f) + i12;
        float i13 = this.f46969t.i() + i12 + org.telegram.messenger.i0.L(11.0f);
        this.f46971w.clear();
        this.f46970u = 0.0f;
        this.v = 0.0f;
        ph.l0 l0Var = this.f46973y;
        TextPaint textPaint = l0Var.f45177c;
        if (tL_textWithEntities != null && !TextUtils.isEmpty(tL_textWithEntities.text)) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tL_textWithEntities.text);
            jj.b(spannableStringBuilder, tL_textWithEntities.entities, false, false, false, false, 0);
            spanned = jj.A5(org.telegram.messenger.k6.m(spannableStringBuilder, textPaint.getFontMetricsInt(), false, null, 0), tL_textWithEntities.entities, textPaint.getFontMetricsInt(), false);
        } else {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(cd.L0(2131749757, null));
            spannableStringBuilder2.setSpan(new ForegroundColorSpan(-1593835521), 0, spannableStringBuilder2.length(), 33);
            spanned = spannableStringBuilder2;
        }
        if (j10 != 0) {
            tLObject = vp.r1(this.f46953a).d2(j10);
        }
        this.f46974z = true;
        l0Var.c(tLObject);
        l0Var.f45184m = spanned;
        l0Var.f45190s = -1;
        l0Var.b(((int) f7) - org.telegram.messenger.i0.L(24.0f));
        if (!this.N) {
            StaticLayout staticLayout = l0Var.f45185n;
            if (staticLayout != null) {
                i10 = staticLayout.getLineCount();
            } else {
                i10 = 0;
            }
            if (i10 > 3) {
                this.N = true;
                StaticLayout staticLayout2 = l0Var.f45185n;
                if (staticLayout2 != null) {
                    i11 = staticLayout2.getLineCount();
                }
                this.O = (int) ((Math.min(0.4f, (i11 - 3) * 0.1f) + 1.0f) * this.O);
                h(tL_starGiftUnique, j10, tL_textWithEntities, str);
                return;
            }
        }
        float L2 = i13 + org.telegram.messenger.i0.L(4.0f);
        this.f46972x = L2;
        float L3 = L2 + l0Var.f45192u + org.telegram.messenger.i0.L(3.0f) + org.telegram.messenger.i0.L(11.66f);
        this.A = L3;
        this.C = new qz0(str, 14.0f, org.telegram.messenger.i0.o());
        float L4 = org.telegram.messenger.i0.L(30.0f);
        this.B = L4;
        this.P = (int) (L3 + L4 + org.telegram.messenger.i0.L(11.0f));
    }
}
