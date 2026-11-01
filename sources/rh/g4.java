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
import org.telegram.messenger.dd;
import org.telegram.messenger.e20;
import org.telegram.messenger.i20;
import org.telegram.messenger.kj;
import org.telegram.messenger.wp;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.dc;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.rz0;
public final class g4 {
    public float A;
    public float B;
    public rz0 C;
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
    public kj R;
    public boolean S;
    public final fe.f T;
    public ph.e0 U;
    public ph.e0 V;
    public final int f46967a;
    public final View f46968b;
    public final org.telegram.ui.ActionBar.p6 f46969c;
    public final ImageReceiver d;
    public final org.telegram.ui.Components.d5 e;
    public int f46971g;
    public RadialGradient h;
    public final ph.f1 f46973j;
    public TL_stars.starGiftAttributeBackdrop f46974k;
    public TL_stars.starGiftAttributePattern f46975l;
    public TL_stars.starGiftAttributeModel f46976m;
    public boolean f46979p;
    public float f46980q;
    public rz0 f46981r;
    public float f46982s;
    public rz0 f46983t;
    public float f46984u;
    public float v;
    public float f46986x;
    public final ph.l0 f46987y;
    public boolean f46988z;
    public final Paint f46970f = new Paint(1);
    public final Matrix f46972i = new Matrix();
    public final RectF f46977n = new RectF();
    public final Path f46978o = new Path();
    public final ArrayList f46985w = new ArrayList();

    public g4(int i10, View view, org.telegram.ui.ActionBar.p6 p6Var) {
        ph.l0 l0Var = new ph.l0();
        this.f46987y = l0Var;
        this.D = new RectF();
        this.E = new Path();
        this.F = new Paint();
        this.G = new s8(1, 25);
        this.K = new RectF();
        this.T = new fe.f(0, new d0(this, 3), gr.h, 320L);
        this.f46967a = i10;
        this.f46968b = view;
        this.f46969c = p6Var;
        this.f46973j = new ph.f1(view);
        this.H = new dc(view);
        this.I = new dc(view);
        this.J = new dc(view);
        this.d = new ImageReceiver(view);
        this.e = new org.telegram.ui.Components.d5(org.telegram.messenger.i0.L(28.0f), view);
        l0Var.f45200r = view;
        l0Var.d.H0(view);
    }

    public final void a() {
        this.S = true;
        if (this.Q != null) {
            this.d.P();
            this.e.a();
            this.f46987y.d.P();
        }
    }

    public final void b(Canvas canvas) {
        boolean z10 = this.L;
        ph.f1 f1Var = this.f46973j;
        if (z10 && f1Var != null) {
            int i10 = this.M;
            int i11 = org.telegram.ui.ActionBar.a7.f20159b;
            if (i10 != i11) {
                this.M = i11;
                try {
                    int w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21171q7, this.f46969c);
                    Paint paint = (Paint) f1Var.f26519b;
                    paint.setShader(null);
                    paint.setColor(w02);
                } catch (Exception e) {
                    org.telegram.messenger.f8.g(e, true);
                }
            }
        }
        fe.f fVar = this.T;
        float f7 = fVar.f7032f;
        float f10 = f7 / 2.0f;
        RectF rectF = this.f46977n;
        rectF.set(0.0f, 0.0f, f7, this.P);
        int height = ((int) (rectF.height() + rectF.width())) / 2;
        if (this.f46974k != null && (this.h == null || this.f46971g != height)) {
            this.f46971g = height;
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = this.f46974k;
            this.h = new RadialGradient(0.0f, 0.0f, height, new int[]{stargiftattributebackdrop.center_color | (-16777216), stargiftattributebackdrop.edge_color | (-16777216)}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        }
        RadialGradient radialGradient = this.h;
        Paint paint2 = this.f46970f;
        if (radialGradient != null) {
            Matrix matrix = this.f46972i;
            matrix.reset();
            matrix.postTranslate(f10, f10);
            this.h.setLocalMatrix(matrix);
            paint2.setShader(this.h);
        }
        Path path = this.f46978o;
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
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop2 = this.f46974k;
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
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop3 = this.f46974k;
        if (stargiftattributebackdrop3 != null) {
            r12 = stargiftattributebackdrop3.text_color | (-16777216);
        }
        int i12 = r12;
        this.f46981r.f30136p = fVar.f7032f - org.telegram.messenger.i0.L(12.0f);
        rz0 rz0Var = this.f46981r;
        rz0Var.c(f10 - (rz0Var.f30126c / 2.0f), this.f46980q, 1.0f, -1, canvas);
        this.f46983t.f30136p = fVar.f7032f - org.telegram.messenger.i0.L(12.0f);
        rz0 rz0Var2 = this.f46983t;
        Canvas canvas2 = canvas;
        int i13 = i12;
        rz0Var2.c(f10 - (rz0Var2.f30126c / 2.0f), this.f46982s, 1.0f, i13, canvas2);
        if (this.f46988z) {
            ph.l0 l0Var = this.f46987y;
            int i14 = l0Var.f45202t;
            int i15 = l0Var.f45203u;
            int i16 = (int) (f10 - (i14 / 2.0f));
            int i17 = (int) this.f46986x;
            int i18 = i14 + i16;
            l0Var.setBounds(i16, i17, i18, i17 + i15);
            float f11 = this.f46986x;
            RectF rectF2 = this.K;
            rectF2.set(i16, f11, i18, i15 + f11);
            float a10 = this.J.a(0.04f);
            canvas2.save();
            canvas2.scale(a10, a10, rectF2.centerX(), rectF2.centerY());
            l0Var.draw(canvas2);
            canvas2.restore();
        } else {
            float f12 = 9.0f;
            float L = this.f46984u + org.telegram.messenger.i0.L(9.0f) + this.v;
            ArrayList arrayList = this.f46985w;
            int size = arrayList.size();
            int i19 = 0;
            while (i19 < size) {
                int i20 = i19 + 1;
                f4 f4Var = (f4) arrayList.get(i19);
                rz0 rz0Var3 = f4Var.f46912b;
                float f13 = f10 - (L / 2.0f);
                float f14 = f12;
                rz0Var3.c((f13 + this.f46984u) - rz0Var3.f30126c, f4Var.f46911a, 1.0f, i13, canvas2);
                canvas2 = canvas;
                f4Var.f46913c.c(f13 + this.f46984u + org.telegram.messenger.i0.L(f14), f4Var.f46911a, 1.0f, -1, canvas2);
                i13 = i13;
                i19 = i20;
                f12 = f14;
            }
        }
        int i21 = i13;
        if (!this.f46979p) {
            float f15 = this.A;
            float a11 = org.telegram.messenger.m5.a(this.C.f30126c, org.telegram.messenger.i0.L(30.0f), 2.0f, f10);
            float f16 = this.A + this.B;
            RectF rectF3 = this.D;
            rectF3.set(f10 - ((this.C.f30126c + org.telegram.messenger.i0.L(30.0f)) / 2.0f), f15, a11, f16);
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
            f1Var.f45052y = i21;
            f1Var.draw(canvas2);
        }
        canvas2.restore();
    }

    public final void c(Canvas canvas) {
        if (this.f46979p) {
            return;
        }
        canvas.save();
        float a2 = this.I.a(0.0125f);
        RectF rectF = this.f46977n;
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
        View view = this.f46968b;
        if (view instanceof org.telegram.ui.Cells.s0) {
            ((org.telegram.ui.Cells.s0) view).U();
        } else {
            view.invalidate();
        }
    }

    public final float d() {
        return this.T.f7032f;
    }

    public final boolean e(float r18, float r19, android.view.MotionEvent r20) {
        throw new UnsupportedOperationException("Method not decompiled: rh.g4.e(float, float, android.view.MotionEvent):boolean");
    }

    public final void f(org.telegram.messenger.kj r12, boolean r13) {
        throw new UnsupportedOperationException("Method not decompiled: rh.g4.f(org.telegram.messenger.kj, boolean):void");
    }

    public final void g(kj kjVar, TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        long B0;
        float f7;
        int i10;
        float f10;
        int L;
        TLObject d22;
        int i11;
        float f11 = this.O;
        boolean P3 = kjVar.P3();
        boolean z10 = !tL_messageActionStarGiftUnique.upgrade;
        int i12 = this.f46967a;
        if (z10 == P3) {
            B0 = e20.i(i12).e();
        } else {
            B0 = kj.B0(kjVar.f16690k);
        }
        TLRPC.Peer peer = tL_messageActionStarGiftUnique.from_id;
        if (peer != null) {
            B0 = org.telegram.messenger.o5.o(peer);
        }
        String t10 = org.telegram.messenger.o5.t(B0);
        float L2 = org.telegram.messenger.i0.L(10.0f) + 0.0f + org.telegram.messenger.i0.L(110.0f) + org.telegram.messenger.i0.L(9.33f);
        int i13 = 0;
        if (this.f46979p) {
            this.f46981r = new rz0(tL_starGiftUnique.title, 14.0f, org.telegram.messenger.i0.o());
        } else if (tL_messageActionStarGiftUnique.peer == null && !i20.A(kj.B0(kjVar.f16690k))) {
            if (kj.B0(kjVar.f16690k) == e20.i(i12).e()) {
                if (tL_starGiftUnique.crafted) {
                    this.f46981r = new rz0(dd.L0(2131750470, null), 14.0f, org.telegram.messenger.i0.o());
                } else if (tL_messageActionStarGiftUnique.resale_amount != null) {
                    this.f46981r = new rz0(dd.L0(2131750457, null), 14.0f, org.telegram.messenger.i0.o());
                } else {
                    this.f46981r = new rz0(dd.L0(2131750435, null), 14.0f, org.telegram.messenger.i0.o());
                }
            } else {
                this.f46981r = new rz0(dd.a0(null, null, 2131749901, t10), 14.0f, org.telegram.messenger.i0.o());
            }
        } else {
            this.f46981r = new rz0(dd.L0(2131749900, null), 14.0f, org.telegram.messenger.i0.o());
        }
        this.f46980q = (this.f46981r.i() / 2.0f) + L2;
        float i14 = this.f46981r.i() + L2 + org.telegram.messenger.i0.L(3.0f);
        if (this.f46979p) {
            f7 = 2.0f;
            this.f46983t = new rz0(dd.H(',', "Gift2CollectionNumber", tL_starGiftUnique.num), 12.0f, org.telegram.messenger.i0.o());
            i10 = i12;
        } else {
            f7 = 2.0f;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(tL_starGiftUnique.title);
            sb2.append(" #");
            i10 = i12;
            this.f46983t = new rz0(i0.a.k(tL_starGiftUnique.num, ',', sb2), 12.0f, null);
        }
        this.f46982s = (this.f46983t.i() / f7) + i14;
        float i15 = this.f46983t.i() + i14;
        if (this.f46979p) {
            f10 = 14.0f;
        } else {
            f10 = 11.0f;
        }
        float L3 = i15 + org.telegram.messenger.i0.L(f10);
        ArrayList arrayList = this.f46985w;
        arrayList.clear();
        this.f46984u = 0.0f;
        this.v = 0.0f;
        TLRPC.TL_textWithEntities tL_textWithEntities = tL_messageActionStarGiftUnique.message;
        ph.l0 l0Var = this.f46987y;
        if (tL_textWithEntities != null) {
            TextPaint textPaint = l0Var.f45188c;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tL_textWithEntities.text);
            kj.b(spannableStringBuilder, tL_textWithEntities.entities, false, false, false, false, 0);
            Spannable A5 = kj.A5(org.telegram.messenger.k6.m(spannableStringBuilder, textPaint.getFontMetricsInt(), false, null, 0), tL_textWithEntities.entities, textPaint.getFontMetricsInt(), false);
            if (tL_messageActionStarGiftUnique.name_hidden) {
                d22 = null;
            } else if (tL_messageActionStarGiftUnique.from_id != null) {
                d22 = wp.r1(i10).d2(org.telegram.messenger.o5.o(tL_messageActionStarGiftUnique.from_id));
            } else {
                d22 = wp.r1(i10).d2(kjVar.Z0());
            }
            this.f46988z = true;
            l0Var.c(d22);
            l0Var.f45195m = A5;
            l0Var.f45201s = -1;
            l0Var.b(((int) f11) - org.telegram.messenger.i0.L(24.0f));
            if (!this.N) {
                StaticLayout staticLayout = l0Var.f45196n;
                if (staticLayout != null) {
                    i11 = staticLayout.getLineCount();
                } else {
                    i11 = 0;
                }
                if (i11 > 3) {
                    this.N = true;
                    StaticLayout staticLayout2 = l0Var.f45196n;
                    if (staticLayout2 != null) {
                        i13 = staticLayout2.getLineCount();
                    }
                    this.O = (int) ((Math.min(0.4f, (i13 - 3) * 0.1f) + 1.0f) * this.O);
                    g(kjVar, tL_messageActionStarGiftUnique, tL_starGiftUnique);
                    return;
                }
            }
            float L4 = L3 + org.telegram.messenger.i0.L(4.0f);
            this.f46986x = L4;
            L3 = L4 + l0Var.f45203u + org.telegram.messenger.i0.L(3.0f);
        } else {
            this.f46988z = false;
            l0Var.c(null);
            l0Var.f45195m = null;
            l0Var.f45201s = -1;
            if (this.f46976m != null) {
                if (!arrayList.isEmpty()) {
                    L3 += org.telegram.messenger.i0.L(6.0f);
                }
                f4 f4Var = new f4(L3, dd.L0(2131750396, null), this.f46976m.name);
                arrayList.add(f4Var);
                float f12 = f11 * 0.5f;
                rz0 rz0Var = f4Var.f46912b;
                rz0Var.f30136p = f12;
                this.f46984u = Math.max(this.f46984u, rz0Var.f30126c);
                rz0 rz0Var2 = f4Var.f46913c;
                rz0Var2.f30136p = f12;
                this.v = Math.max(this.v, rz0Var2.f30126c);
                L3 += f4Var.a();
            }
            if (this.f46974k != null) {
                if (!arrayList.isEmpty()) {
                    L3 += org.telegram.messenger.i0.L(6.0f);
                }
                f4 f4Var2 = new f4(L3, dd.L0(2131750397, null), this.f46974k.name);
                arrayList.add(f4Var2);
                float f13 = f11 * 0.5f;
                rz0 rz0Var3 = f4Var2.f46912b;
                rz0Var3.f30136p = f13;
                this.f46984u = Math.max(this.f46984u, rz0Var3.f30126c);
                rz0 rz0Var4 = f4Var2.f46913c;
                rz0Var4.f30136p = f13;
                this.v = Math.max(this.v, rz0Var4.f30126c);
                L3 = f4Var2.a() + L3;
            }
            if (this.f46975l != null) {
                if (!arrayList.isEmpty()) {
                    L3 += org.telegram.messenger.i0.L(6.0f);
                }
                f4 f4Var3 = new f4(L3, dd.L0(2131750389, null), this.f46975l.name);
                arrayList.add(f4Var3);
                float f14 = f11 * 0.5f;
                rz0 rz0Var5 = f4Var3.f46912b;
                rz0Var5.f30136p = f14;
                this.f46984u = Math.max(this.f46984u, rz0Var5.f30126c);
                rz0 rz0Var6 = f4Var3.f46913c;
                rz0Var6.f30136p = f14;
                this.v = Math.max(this.v, rz0Var6.f30126c);
                L3 += f4Var3.a();
            }
        }
        float L5 = L3 + org.telegram.messenger.i0.L(11.66f);
        if (!this.f46979p) {
            this.A = L5;
            this.C = new rz0(dd.L0(2131749897, null), 14.0f, org.telegram.messenger.i0.o());
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
        rz0 rz0Var = new rz0(dd.a0(null, null, 2131749901, org.telegram.messenger.o5.t(j10)), 14.0f, org.telegram.messenger.i0.o());
        this.f46981r = rz0Var;
        this.f46980q = (rz0Var.i() / 2.0f) + L;
        float i12 = this.f46981r.i() + L + org.telegram.messenger.i0.L(3.0f);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(tL_starGiftUnique.title);
        sb2.append(" #");
        rz0 rz0Var2 = new rz0(i0.a.k(tL_starGiftUnique.num, ',', sb2), 12.0f, null);
        this.f46983t = rz0Var2;
        this.f46982s = (rz0Var2.i() / 2.0f) + i12;
        float i13 = this.f46983t.i() + i12 + org.telegram.messenger.i0.L(11.0f);
        this.f46985w.clear();
        this.f46984u = 0.0f;
        this.v = 0.0f;
        ph.l0 l0Var = this.f46987y;
        TextPaint textPaint = l0Var.f45188c;
        if (tL_textWithEntities != null && !TextUtils.isEmpty(tL_textWithEntities.text)) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tL_textWithEntities.text);
            kj.b(spannableStringBuilder, tL_textWithEntities.entities, false, false, false, false, 0);
            spanned = kj.A5(org.telegram.messenger.k6.m(spannableStringBuilder, textPaint.getFontMetricsInt(), false, null, 0), tL_textWithEntities.entities, textPaint.getFontMetricsInt(), false);
        } else {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(dd.L0(2131749757, null));
            spannableStringBuilder2.setSpan(new ForegroundColorSpan(-1593835521), 0, spannableStringBuilder2.length(), 33);
            spanned = spannableStringBuilder2;
        }
        if (j10 != 0) {
            tLObject = wp.r1(this.f46967a).d2(j10);
        }
        this.f46988z = true;
        l0Var.c(tLObject);
        l0Var.f45195m = spanned;
        l0Var.f45201s = -1;
        l0Var.b(((int) f7) - org.telegram.messenger.i0.L(24.0f));
        if (!this.N) {
            StaticLayout staticLayout = l0Var.f45196n;
            if (staticLayout != null) {
                i10 = staticLayout.getLineCount();
            } else {
                i10 = 0;
            }
            if (i10 > 3) {
                this.N = true;
                StaticLayout staticLayout2 = l0Var.f45196n;
                if (staticLayout2 != null) {
                    i11 = staticLayout2.getLineCount();
                }
                this.O = (int) ((Math.min(0.4f, (i11 - 3) * 0.1f) + 1.0f) * this.O);
                h(tL_starGiftUnique, j10, tL_textWithEntities, str);
                return;
            }
        }
        float L2 = i13 + org.telegram.messenger.i0.L(4.0f);
        this.f46986x = L2;
        float L3 = L2 + l0Var.f45203u + org.telegram.messenger.i0.L(3.0f) + org.telegram.messenger.i0.L(11.66f);
        this.A = L3;
        this.C = new rz0(str, 14.0f, org.telegram.messenger.i0.o());
        float L4 = org.telegram.messenger.i0.L(30.0f);
        this.B = L4;
        this.P = (int) (L3 + L4 + org.telegram.messenger.i0.L(11.0f));
    }
}
