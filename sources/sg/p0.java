package sg;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.d00;
import org.telegram.messenger.e20;
import org.telegram.messenger.jc;
import org.telegram.messenger.kj;
import org.telegram.messenger.m5;
import org.telegram.messenger.tc;
import org.telegram.messenger.v5;
import org.telegram.messenger.vi;
import org.telegram.messenger.w0;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Cells.q1;
import org.telegram.ui.Cells.r4;
import org.telegram.ui.Cells.s0;
import org.telegram.ui.Components.e6;
import org.telegram.ui.Components.f5;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.kq;
import org.telegram.ui.Components.t8;
import org.telegram.ui.dx0;
import org.telegram.ui.km;
public final class p0 {
    public static int W;
    public float A;
    public boolean B;
    public int C;
    public boolean D;
    public int F;
    public int G;
    public boolean H;
    public boolean I;
    public boolean J;
    public float N;
    public float O;
    public m0 P;
    public boolean Q;
    public rh.n R;
    public float f48449a;
    public int f48450b;
    public int f48451c;
    public float d;
    public float e;
    public float f48452f;
    public float f48453g;
    public boolean h;
    public boolean f48454i;
    public boolean f48455j;
    public int f48456k;
    public int f48458m;
    public int f48459n;
    public int f48460o;
    public boolean f48461p;
    public final float f48462q;
    public int f48463r;
    public final org.telegram.ui.Cells.z f48467w;
    public kj f48468x;
    public p6 f48469y;
    public Integer f48470z;
    public static final Paint S = new Paint(1);
    public static final Paint T = new Paint(1);
    public static final Paint U = new Paint(1);
    public static final TextPaint V = new TextPaint(1);
    public static final l0 X = new Object();
    public static int Y = 1;
    public static final dx0 Z = new dx0(16);
    public final ArrayList f48464s = new ArrayList();
    public final ArrayList f48465t = new ArrayList();
    public final HashMap f48466u = new HashMap();
    public final HashMap v = new HashMap();
    public final HashMap E = new HashMap();
    public final ArrayList K = new ArrayList();
    public final RectF L = new RectF();
    public final Rect M = new Rect();
    public final int f48457l = e20.f15506s0;

    public p0(org.telegram.ui.Cells.z zVar) {
        this.f48467w = zVar;
        n(this.f48469y);
        this.f48462q = ViewConfiguration.get(w0.f18945b).getScaledTouchSlop();
    }

    public static boolean g(TLRPC.Reaction reaction, TLRPC.Reaction reaction2) {
        if ((reaction instanceof TLRPC.TL_reactionEmoji) && (reaction2 instanceof TLRPC.TL_reactionEmoji)) {
            return TextUtils.equals(((TLRPC.TL_reactionEmoji) reaction).emoticon, ((TLRPC.TL_reactionEmoji) reaction2).emoticon);
        }
        if (!(reaction instanceof TLRPC.TL_reactionCustomEmoji) || !(reaction2 instanceof TLRPC.TL_reactionCustomEmoji) || ((TLRPC.TL_reactionCustomEmoji) reaction).document_id != ((TLRPC.TL_reactionCustomEmoji) reaction2).document_id) {
            return false;
        }
        return true;
    }

    public static void h(RectF rectF, RectF rectF2, Path path) {
        float f7;
        path.rewind();
        float f10 = rectF.left;
        rectF2.set(f10, rectF.top, org.telegram.messenger.i0.L(12.0f) + f10, rectF.top + org.telegram.messenger.i0.L(12.0f));
        path.arcTo(rectF2, -90.0f, -90.0f, false);
        rectF2.set(rectF.left, rectF.bottom - org.telegram.messenger.i0.L(12.0f), rectF.left + org.telegram.messenger.i0.L(12.0f), rectF.bottom);
        path.arcTo(rectF2, -180.0f, -90.0f, false);
        if (rectF.height() > org.telegram.messenger.i0.L(26.0f)) {
            f7 = 1.4f;
        } else {
            f7 = 0.0f;
        }
        float N = rectF.right - org.telegram.messenger.i0.N(9.09f);
        float N2 = N - org.telegram.messenger.i0.N(0.056f);
        float N3 = org.telegram.messenger.i0.N(1.22f) + N;
        float N4 = org.telegram.messenger.i0.N(3.07f) + N;
        float N5 = org.telegram.messenger.i0.N(2.406f) + N;
        float N6 = org.telegram.messenger.i0.N(8.27f + f7) + N;
        float N7 = org.telegram.messenger.i0.N(8.923f + f7) + N;
        float N8 = org.telegram.messenger.i0.N(1.753f) + rectF.top;
        float N9 = rectF.bottom - org.telegram.messenger.i0.N(1.753f);
        float N10 = org.telegram.messenger.i0.N(0.663f) + rectF.top;
        float N11 = rectF.bottom - org.telegram.messenger.i0.N(0.663f);
        float f11 = 10.263f + f7;
        float N12 = org.telegram.messenger.i0.N(f11) + rectF.top;
        float N13 = rectF.bottom - org.telegram.messenger.i0.N(f11);
        float f12 = f7 + 11.333f;
        float N14 = org.telegram.messenger.i0.N(f12) + rectF.top;
        float N15 = rectF.bottom - org.telegram.messenger.i0.N(f12);
        path.lineTo(N2, rectF.bottom);
        path.cubicTo(N3, rectF.bottom, N5, N11, N4, N9);
        path.lineTo(N6, N13);
        path.cubicTo(N7, N15, N7, N14, N6, N12);
        path.lineTo(N4, N8);
        float f13 = rectF.top;
        path.cubicTo(N5, N10, N3, f13, N2, f13);
        path.close();
    }

    public static long j(TLObject tLObject) {
        if (tLObject instanceof TLRPC.User) {
            return ((TLRPC.User) tLObject).f19943id;
        }
        if (tLObject instanceof TLRPC.Chat) {
            return ((TLRPC.Chat) tLObject).f19794id;
        }
        return 0L;
    }

    public static void n(p6 p6Var) {
        S.setColor(t6.w0(t6.We, p6Var));
        int w02 = t6.w0(t6.Gi, p6Var);
        TextPaint textPaint = V;
        textPaint.setColor(w02);
        textPaint.setTextSize(org.telegram.messenger.i0.L(12.0f));
        textPaint.setTypeface(org.telegram.messenger.i0.o());
        U.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }

    public final boolean a() {
        ArrayList arrayList;
        t8 t8Var;
        int i10;
        if (this.f48468x == null) {
            return false;
        }
        HashMap hashMap = this.v;
        hashMap.clear();
        int i11 = 0;
        while (true) {
            arrayList = this.f48465t;
            if (i11 >= arrayList.size()) {
                break;
            }
            ((m0) arrayList.get(i11)).b();
            i11++;
        }
        arrayList.clear();
        hashMap.putAll(this.f48466u);
        int i12 = 0;
        boolean z10 = false;
        while (true) {
            ArrayList arrayList2 = this.f48464s;
            if (i12 >= arrayList2.size()) {
                break;
            }
            m0 m0Var = (m0) arrayList2.get(i12);
            String str = m0Var.f48418n;
            kq kqVar = m0Var.E;
            m0 m0Var2 = (m0) hashMap.get(str);
            if (m0Var2 != null) {
                hashMap.remove(m0Var.f48418n);
                int i13 = m0Var.f48426w;
                int i14 = m0Var2.f48426w;
                if (i13 == i14 && m0Var.f48427x == m0Var2.f48427x && m0Var.f48429z == m0Var2.f48429z && m0Var.v == m0Var2.v && m0Var.f48419o == m0Var2.f48419o && m0Var.S == null && m0Var2.S == null) {
                    m0Var.f48404b = 0;
                    i12++;
                } else {
                    m0Var.f48406c = i14;
                    m0Var.d = m0Var2.f48427x;
                    m0Var.e = m0Var2.f48429z;
                    m0Var.h = m0Var2.M;
                    m0Var.f48410f = m0Var2.N;
                    m0Var.f48412g = m0Var2.O;
                    m0Var.f48404b = 3;
                    int i15 = m0Var.v;
                    int i16 = m0Var2.v;
                    if (i15 != i16 && kqVar != null) {
                        kqVar.c(i16, false);
                        kqVar.c(m0Var.v, true);
                    }
                    t8 t8Var2 = m0Var.S;
                    if (t8Var2 != null || m0Var2.S != null) {
                        if (t8Var2 == null) {
                            m0Var.o(new ArrayList());
                        }
                        if (m0Var2.S == null) {
                            m0Var2.o(new ArrayList());
                        }
                        ArrayList arrayList3 = m0Var2.T;
                        ArrayList arrayList4 = m0Var.T;
                        if (arrayList3 != null && arrayList4 != null && arrayList3.size() == arrayList4.size()) {
                            for (int i17 = 0; i17 < arrayList3.size(); i17++) {
                                TLObject tLObject = (TLObject) arrayList3.get(i17);
                                TLObject tLObject2 = (TLObject) arrayList4.get(i17);
                                if (tLObject != null && tLObject2 != null && j(tLObject) == j(tLObject2)) {
                                }
                            }
                        }
                        t8 t8Var3 = m0Var.S;
                        if (t8Var3 != null && (t8Var = m0Var2.S) != null) {
                            ValueAnimator valueAnimator = t8Var.f30554f;
                            if (valueAnimator != null) {
                                valueAnimator.cancel();
                                if (t8Var3.f30569w) {
                                    t8Var3.f30569w = false;
                                    t8Var3.k();
                                }
                            }
                            TLObject[] tLObjectArr = new TLObject[3];
                            int i18 = 0;
                            while (true) {
                                i10 = this.f48457l;
                                if (i18 >= 3) {
                                    break;
                                }
                                tLObjectArr[i18] = t8Var3.f30552b[i18].h;
                                t8Var3.j(i18, i10, t8Var.f30552b[i18].h);
                                i18++;
                            }
                            t8Var3.a(false, true);
                            for (int i19 = 0; i19 < 3; i19++) {
                                t8Var3.j(i19, i10, tLObjectArr[i19]);
                            }
                            t8Var3.d = true;
                            t8Var3.a(true, false);
                        }
                    }
                }
            } else {
                m0Var.f48404b = 1;
            }
            z10 = true;
            i12++;
        }
        if (!hashMap.isEmpty()) {
            arrayList.addAll(hashMap.values());
            for (int i20 = 0; i20 < arrayList.size(); i20++) {
                ((m0) arrayList.get(i20)).f48415k = ((m0) arrayList.get(i20)).f48417m;
                ((m0) arrayList.get(i20)).a();
            }
            z10 = true;
        }
        if (this.h) {
            float f7 = this.f48452f;
            if (f7 != this.f48450b || this.f48453g != this.f48451c) {
                this.f48454i = true;
                this.d = f7;
                this.e = this.f48453g;
                z10 = true;
            }
        }
        if (this.C != this.f48460o) {
            z10 = true;
        }
        int i21 = this.F;
        if (i21 != this.f48459n) {
            this.f48455j = true;
            this.G = i21;
            return true;
        }
        return z10;
    }

    public final void b(o0 o0Var) {
        int i10 = 0;
        if (o0Var.f48446g == 0) {
            HashMap hashMap = this.E;
            if (hashMap.get(o0Var) == null) {
                ImageReceiver imageReceiver = new ImageReceiver(null);
                imageReceiver.H0(this.f48467w);
                int i11 = W;
                W = i11 + 1;
                imageReceiver.f14414v1 = Integer.toString(i11);
                TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) vi.b0(this.f48457l).f18670r.get(o0Var.f48445f);
                if (tL_availableReaction != null) {
                    imageReceiver.q0(jc.b(tL_availableReaction.center_icon), "40_40_nolimit", null, "tgs", tL_availableReaction, 1);
                }
                imageReceiver.W(0);
                imageReceiver.P();
                hashMap.put(o0Var, imageReceiver);
                return;
            }
        }
        if (!this.J || o0Var.f48446g == 0) {
            return;
        }
        while (true) {
            ArrayList arrayList = this.f48464s;
            if (i10 < arrayList.size()) {
                if (o0Var.f(((m0) arrayList.get(i10)).f48421q)) {
                    ((m0) arrayList.get(i10)).p();
                    return;
                }
                i10++;
            } else {
                return;
            }
        }
    }

    public final boolean c(MotionEvent motionEvent) {
        kj kjVar;
        TLRPC.Message message;
        int i10 = 0;
        if (this.f48461p || (kjVar = this.f48468x) == null || (message = kjVar.f16690k) == null || message.reactions == null) {
            return false;
        }
        float x10 = motionEvent.getX();
        float y3 = motionEvent.getY();
        org.telegram.ui.Cells.z zVar = this.f48467w;
        if (c3.i0.t(zVar)) {
            y3 -= zVar.getPaddingTop();
            if (zVar instanceof s0) {
                x10 -= ((s0) zVar).f22919j0 / 2.0f;
            }
        }
        float f7 = x10 - this.f48450b;
        float f10 = y3 - this.f48451c;
        if (motionEvent.getAction() == 0) {
            ArrayList arrayList = this.f48464s;
            int size = arrayList.size();
            while (true) {
                if (i10 >= size) {
                    break;
                } else if (f7 > ((m0) arrayList.get(i10)).f48426w && f7 < ((m0) arrayList.get(i10)).f48426w + ((m0) arrayList.get(i10)).f48429z && f10 > ((m0) arrayList.get(i10)).f48427x && f10 < ((m0) arrayList.get(i10)).f48427x + ((m0) arrayList.get(i10)).A) {
                    this.N = motionEvent.getX();
                    this.O = y3;
                    this.P = (m0) arrayList.get(i10);
                    rh.n nVar = this.R;
                    if (nVar != null) {
                        org.telegram.messenger.i0.r(nVar);
                        this.R = null;
                    }
                    this.P.X.c(true);
                    rh.n nVar2 = new rh.n(26, this, this.P);
                    this.R = nVar2;
                    org.telegram.messenger.i0.h3(nVar2, ViewConfiguration.getLongPressTimeout());
                    this.Q = true;
                } else {
                    i10++;
                }
            }
        } else if (motionEvent.getAction() == 2) {
            boolean z10 = this.Q;
            float f11 = this.f48462q;
            if ((z10 && Math.abs(motionEvent.getX() - this.N) > f11) || Math.abs(y3 - this.O) > f11) {
                this.Q = false;
                m0 m0Var = this.P;
                if (m0Var != null) {
                    m0Var.X.c(false);
                }
                this.P = null;
                rh.n nVar3 = this.R;
                if (nVar3 != null) {
                    org.telegram.messenger.i0.r(nVar3);
                    this.R = null;
                }
            }
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            rh.n nVar4 = this.R;
            if (nVar4 != null) {
                org.telegram.messenger.i0.r(nVar4);
                this.R = null;
            }
            if (this.Q && this.P != null && motionEvent.getAction() == 1) {
                TLRPC.ReactionCount reactionCount = this.P.f48402a;
                float x11 = motionEvent.getX();
                if (c3.i0.t(zVar)) {
                    ((r4) zVar).e(reactionCount, false, x11, y3);
                }
            }
            this.Q = false;
            m0 m0Var2 = this.P;
            if (m0Var2 != null) {
                m0Var2.X.c(false);
            }
            this.P = null;
        }
        return this.Q;
    }

    public final void d(Canvas canvas, float f7, Integer num) {
        float f10;
        float f11;
        float f12;
        boolean z10;
        Canvas canvas2 = canvas;
        boolean z11 = this.f48461p;
        ArrayList arrayList = this.f48465t;
        if (!z11 || !arrayList.isEmpty()) {
            float f13 = this.f48450b;
            float f14 = this.f48451c;
            if (this.f48461p) {
                f13 = this.f48452f;
                f14 = this.f48453g;
            } else if (this.f48454i) {
                float f15 = 1.0f - f7;
                f13 = (f13 * f7) + (this.d * f15);
                f14 = (f14 * f7) + (this.e * f15);
            }
            float f16 = f13;
            float f17 = f14;
            int i10 = 0;
            int i11 = 0;
            while (true) {
                ArrayList arrayList2 = this.f48464s;
                if (i11 >= arrayList2.size()) {
                    break;
                }
                m0 m0Var = (m0) arrayList2.get(i11);
                if (this.f48470z == null && num == null && this.A < 0.5f) {
                    m0Var.c();
                }
                if (!Integer.valueOf(m0Var.f48421q.hashCode()).equals(this.f48470z) && (num == null || m0Var.f48421q.hashCode() == num.intValue())) {
                    canvas2.save();
                    float f18 = m0Var.f48426w;
                    float f19 = m0Var.f48427x;
                    int i12 = (f7 > 1.0f ? 1 : (f7 == 1.0f ? 0 : -1));
                    if (i12 != 0 && m0Var.f48404b == 3) {
                        float f20 = 1.0f - f7;
                        f18 = (f18 * f7) + (m0Var.f48406c * f20);
                        f19 = (f19 * f7) + (m0Var.d * f20);
                    }
                    if (i12 != 0 && m0Var.f48404b == 1) {
                        float f21 = (f7 * 0.5f) + 0.5f;
                        canvas2.scale(f21, f21, (m0Var.f48429z / 2.0f) + f16 + f18, (m0Var.A / 2.0f) + f17 + f19);
                        f10 = f7;
                    } else {
                        f10 = 1.0f;
                    }
                    float f22 = f18 + f16;
                    float f23 = f19 + f17;
                    if (m0Var.f48404b == 3) {
                        f11 = f10;
                        f12 = f7;
                    } else {
                        f11 = f10;
                        f12 = 1.0f;
                    }
                    if (num != null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    m0Var.d(canvas2, f22, f23, f12, f11, z10, this.B, this.A);
                    canvas2.restore();
                }
                i11++;
            }
            while (i10 < arrayList.size()) {
                m0 m0Var2 = (m0) arrayList.get(i10);
                float f24 = 1.0f - f7;
                float f25 = (f24 * 0.5f) + 0.5f;
                canvas2.save();
                canvas2.scale(f25, f25, (m0Var2.f48429z / 2.0f) + m0Var2.f48426w + f16, (m0Var2.A / 2.0f) + m0Var2.f48427x + f17);
                ((m0) arrayList.get(i10)).d(canvas2, m0Var2.f48426w + f16, m0Var2.f48427x + f17, 1.0f, f24, false, this.B, this.A);
                canvas.restore();
                i10++;
                canvas2 = canvas;
            }
        }
    }

    public final void e(Canvas canvas, float f7) {
        m0 m0Var;
        boolean z10;
        float f10;
        boolean z11 = this.f48461p;
        ArrayList arrayList = this.f48465t;
        if (!z11 || !arrayList.isEmpty()) {
            float f11 = this.f48450b;
            float f12 = this.f48451c;
            float f13 = 1.0f;
            if (this.f48461p) {
                f11 = this.f48452f;
                f12 = this.f48453g;
            } else if (this.f48454i) {
                float f14 = 1.0f - f7;
                f11 = (f11 * f7) + (this.d * f14);
                f12 = (f12 * f7) + (this.e * f14);
            }
            int i10 = 0;
            boolean z12 = false;
            while (true) {
                ArrayList arrayList2 = this.f48464s;
                if (i10 >= arrayList2.size()) {
                    break;
                }
                m0 m0Var2 = (m0) arrayList2.get(i10);
                if (!m0Var2.f48416l) {
                    f10 = f13;
                } else {
                    canvas.save();
                    float f15 = m0Var2.f48426w;
                    float f16 = m0Var2.f48427x;
                    int i11 = (f7 > f13 ? 1 : (f7 == f13 ? 0 : -1));
                    if (i11 != 0) {
                        f10 = f13;
                        if (m0Var2.f48404b == 3) {
                            float f17 = f10 - f7;
                            f15 = (f15 * f7) + (m0Var2.f48406c * f17);
                            f16 = (f16 * f7) + (m0Var2.d * f17);
                        }
                    } else {
                        f10 = f13;
                    }
                    if (i11 != 0 && m0Var2.f48404b == 1) {
                        float f18 = (f7 * 0.5f) + 0.5f;
                        canvas.scale(f18, f18, (m0Var2.f48429z / 2.0f) + f11 + f15, (m0Var2.A / 2.0f) + f12 + f16);
                    }
                    if (!z12 && !m0Var2.f(canvas, f15 + f11, f16 + f12)) {
                        z12 = false;
                    } else {
                        z12 = true;
                    }
                    canvas.restore();
                }
                i10++;
                f13 = f10;
            }
            float f19 = f13;
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                if (((m0) arrayList.get(i12)).f48416l) {
                    float f20 = ((f19 - f7) * 0.5f) + 0.5f;
                    canvas.save();
                    canvas.scale(f20, f20, (m0Var.f48429z / 2.0f) + m0Var.f48426w + f11, (m0Var.A / 2.0f) + m0Var.f48427x + f12);
                    if (!z12 && !((m0) arrayList.get(i12)).f(canvas, m0Var.f48426w + f11, m0Var.f48427x + f12)) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    canvas.restore();
                    z12 = z10;
                }
            }
        }
    }

    public final void f(km kmVar, Canvas canvas, int i10, Integer num) {
        int i11;
        if (!this.f48461p || !this.f48465t.isEmpty()) {
            int i12 = 0;
            while (true) {
                ArrayList arrayList = this.f48464s;
                if (i12 < arrayList.size()) {
                    m0 m0Var = (m0) arrayList.get(i12);
                    if ((num == null || m0Var.f48421q.hashCode() == num.intValue()) && num != null) {
                        RectF rectF = org.telegram.messenger.i0.P;
                        rectF.set(m0Var.f48423s);
                        float L = org.telegram.messenger.i0.L(140.0f);
                        float L2 = org.telegram.messenger.i0.L(14.0f);
                        org.telegram.ui.Cells.z zVar = this.f48467w;
                        if (zVar instanceof q1) {
                            i11 = ((q1) zVar).getParentWidth();
                        } else {
                            i11 = org.telegram.messenger.i0.f16172q.x;
                        }
                        float i13 = Utilities.i(rectF.left - org.telegram.messenger.i0.L(12.0f), (i11 - L) - org.telegram.messenger.i0.L(24.0f), org.telegram.messenger.i0.L(24.0f));
                        float f7 = rectF.top - L2;
                        float f10 = i10;
                        float f11 = f7 + f10;
                        RectF rectF2 = this.L;
                        rectF2.set(i13, (f7 - L) + f10, L + i13, f11);
                        float interpolation = gr.h.getInterpolation(this.A);
                        org.telegram.messenger.i0.Z1(rectF, rectF2, interpolation, rectF2);
                        int i14 = m0Var.U;
                        o0 o0Var = m0Var.f48422r;
                        View view = m0Var.V;
                        if (m0Var.f48409e0 == null && m0Var.f48411f0 == null) {
                            if (view != null && (view.getParent() instanceof View)) {
                                view = (View) view.getParent();
                            }
                            if (m0Var.f48421q != null && !o0Var.f48442a) {
                                if (o0Var.f48445f != null) {
                                    TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) vi.b0(i14).f18670r.get(o0Var.f48445f);
                                    if (tL_availableReaction != null && tL_availableReaction.activate_animation != null) {
                                        d00 f12 = v5.f(tL_availableReaction.static_icon, t6.f20873a7, 1.0f, null);
                                        ImageReceiver imageReceiver = new ImageReceiver(view);
                                        m0Var.f48409e0 = imageReceiver;
                                        imageReceiver.E0(7);
                                        m0Var.f48409e0.P();
                                        m0Var.f48409e0.J0(org.telegram.messenger.i0.L(14.0f));
                                        ImageReceiver imageReceiver2 = m0Var.f48409e0;
                                        imageReceiver2.f14411u0 = true;
                                        imageReceiver2.f14409t0 = true;
                                        imageReceiver2.W(1);
                                        ImageReceiver imageReceiver3 = m0Var.f48409e0;
                                        imageReceiver3.f14416w0 = true;
                                        imageReceiver3.q0(jc.b(tL_availableReaction.activate_animation), "140_140", f12, null, tL_availableReaction, 1);
                                    }
                                } else if (o0Var.f48446g != 0) {
                                    f5 f5Var = new f5(24, i14, o0Var.f48446g);
                                    m0Var.f48411f0 = f5Var;
                                    f5Var.a(view);
                                }
                            }
                        }
                        this.M.set((int) rectF2.left, (int) rectF2.top, (int) rectF2.right, (int) rectF2.bottom);
                        if (interpolation > 0.0f) {
                            ImageReceiver imageReceiver4 = m0Var.f48409e0;
                            if (imageReceiver4 != null) {
                                imageReceiver4.A0(rectF2);
                                m0Var.f48409e0.setAlpha(interpolation);
                                m0Var.f48409e0.h(canvas, null);
                            } else {
                                f5 f5Var2 = m0Var.f48411f0;
                                if (f5Var2 != null) {
                                    f5Var2.setBounds((int) rectF2.left, (int) rectF2.top, (int) rectF2.right, (int) rectF2.bottom);
                                    m0Var.f48411f0.setAlpha((int) (interpolation * 255.0f));
                                    m0Var.f48411f0.draw(canvas);
                                }
                            }
                            kmVar.invalidate();
                        }
                    }
                    i12++;
                } else {
                    return;
                }
            }
        }
    }

    public final float i(float f7) {
        if (this.f48455j) {
            return (this.f48459n * f7) + ((1.0f - f7) * this.G);
        }
        return this.f48459n;
    }

    public final m0 k(String str) {
        return (m0) this.f48466u.get(str);
    }

    public final m0 l(o0 o0Var) {
        String l4;
        if (o0Var.f48442a) {
            l4 = "stars";
        } else {
            String str = o0Var.f48445f;
            if (str != null) {
                l4 = str;
            } else {
                l4 = Long.toString(o0Var.f48446g);
            }
        }
        return k(l4);
    }

    public final boolean m() {
        if (this.I) {
            if ((!this.f48461p || !this.f48465t.isEmpty()) && tc.e(8200) && tc.e(131072)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void o(int i10, int i11) {
        ArrayList arrayList;
        float f7;
        int L;
        float f10;
        int i12;
        this.f48458m = 0;
        this.f48460o = 0;
        this.f48456k = 0;
        this.f48459n = 0;
        if (this.f48461p) {
            return;
        }
        ArrayList arrayList2 = this.K;
        arrayList2.clear();
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        while (true) {
            arrayList = this.f48464s;
            if (i13 >= arrayList.size()) {
                break;
            }
            m0 m0Var = (m0) arrayList.get(i13);
            m0Var.getClass();
            e6 e6Var = m0Var.F;
            kq kqVar = m0Var.E;
            if (m0Var.R) {
                m0Var.f48429z = org.telegram.messenger.i0.L(42.0f);
                m0Var.A = org.telegram.messenger.i0.L(26.0f);
                if (m0Var.f48424t) {
                    m0Var.f48429z = (int) (e6Var.d + org.telegram.messenger.i0.L(8.0f) + m0Var.f48429z);
                } else if (kqVar != null && m0Var.v > 1) {
                    m0Var.f48429z = m5.C(8.0f, (int) Math.ceil(kqVar.f27929m), m0Var.f48429z);
                }
            } else {
                int L2 = org.telegram.messenger.i0.L(20.0f) + org.telegram.messenger.i0.L(8.0f);
                if (m0Var.C != null) {
                    f10 = 6.0f;
                } else {
                    f10 = 4.0f;
                }
                m0Var.f48429z = org.telegram.messenger.i0.L(f10) + L2;
                if (m0Var.S != null && m0Var.T.size() > 0) {
                    m0Var.T.size();
                    if (m0Var.T.size() > 1) {
                        i12 = m0Var.T.size() - 1;
                    } else {
                        i12 = 0;
                    }
                    m0Var.f48429z = (int) ((org.telegram.messenger.i0.L(20.0f) * i12 * 0.8f) + org.telegram.messenger.i0.L(20.0f) + org.telegram.messenger.i0.L(2.0f) + org.telegram.messenger.i0.L(1.0f) + m0Var.f48429z);
                    m0Var.S.f30562o = org.telegram.messenger.i0.L(26.0f);
                } else if (m0Var.f48424t) {
                    m0Var.f48429z = (int) (e6Var.d + org.telegram.messenger.i0.L(8.0f) + m0Var.f48429z);
                } else if (((int) Math.ceil(kqVar.f27929m)) > 0) {
                    m0Var.f48429z = m5.C(8.0f, (int) Math.ceil(kqVar.f27929m), m0Var.f48429z);
                } else {
                    m0Var.f48429z -= org.telegram.messenger.i0.L(1.0f);
                }
                m0Var.A = org.telegram.messenger.i0.L(26.0f);
            }
            if (m0Var.f48429z + i14 > i10) {
                arrayList2.add(Integer.valueOf(i14));
                i16 = m5.C(4.0f, m0Var.A, i16);
                i17++;
                i14 = 0;
            }
            m0Var.f48426w = i14;
            m0Var.f48427x = i16;
            m0Var.f48428y = i17;
            i14 = m5.C(4.0f, m0Var.f48429z, i14);
            if (i14 > i15) {
                i15 = i14;
            }
            i13++;
        }
        arrayList2.add(Integer.valueOf(i14));
        if (i11 == 5 && !arrayList.isEmpty()) {
            int i18 = ((m0) arrayList.get(0)).f48427x;
            int i19 = 0;
            for (int i20 = 0; i20 < arrayList.size(); i20++) {
                if (((m0) arrayList.get(i20)).f48427x != i18) {
                    int i21 = i20 - 1;
                    int i22 = i10 - (((m0) arrayList.get(i21)).f48426w + ((m0) arrayList.get(i21)).f48429z);
                    while (i19 < i20) {
                        ((m0) arrayList.get(i19)).f48426w += i22;
                        i19++;
                    }
                    i19 = i20;
                }
            }
            int size = arrayList.size() - 1;
            int i23 = i10 - (((m0) arrayList.get(size)).f48426w + ((m0) arrayList.get(size)).f48429z);
            while (i19 <= size) {
                ((m0) arrayList.get(i19)).f48426w += i23;
                i19++;
            }
        } else if (i11 == 1 && !arrayList.isEmpty()) {
            for (int i24 = 0; i24 < arrayList.size(); i24++) {
                m0 m0Var2 = (m0) arrayList.get(i24);
                int i25 = m0Var2.f48428y;
                if (i25 >= 0 && i25 < arrayList2.size()) {
                    f7 = ((Integer) arrayList2.get(m0Var2.f48428y)).intValue();
                } else {
                    f7 = 0.0f;
                }
                m0Var2.f48426w = (int) c3.i0.B(i10, f7, 2.0f, m0Var2.f48426w);
            }
        }
        this.f48463r = i14;
        if (i11 != 5 && i11 != 1) {
            this.f48460o = i15;
        } else {
            this.f48460o = i10;
        }
        if (arrayList.size() == 0) {
            L = 0;
        } else {
            L = org.telegram.messenger.i0.L(26.0f);
        }
        this.f48458m = i16 + L;
        this.f48449a = 0.0f;
    }

    public final void p() {
        int i10 = 0;
        this.D = false;
        while (true) {
            ArrayList arrayList = this.f48464s;
            if (i10 >= arrayList.size()) {
                break;
            }
            ((m0) arrayList.get(i10)).b();
            i10++;
        }
        HashMap hashMap = this.E;
        if (!hashMap.isEmpty()) {
            for (ImageReceiver imageReceiver : hashMap.values()) {
                imageReceiver.R();
            }
        }
        hashMap.clear();
    }

    public final void q() {
        HashMap hashMap = this.f48466u;
        hashMap.clear();
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f48464s;
            if (i10 < arrayList.size()) {
                hashMap.put(((m0) arrayList.get(i10)).f48418n, (m0) arrayList.get(i10));
                i10++;
            } else {
                this.h = !this.f48461p;
                this.f48452f = this.f48450b;
                this.f48453g = this.f48451c;
                this.C = this.f48460o;
                this.F = this.f48459n;
                return;
            }
        }
    }

    public final void r(org.telegram.messenger.kj r21, boolean r22, org.telegram.ui.ActionBar.p6 r23) {
        throw new UnsupportedOperationException("Method not decompiled: sg.p0.r(org.telegram.messenger.kj, boolean, org.telegram.ui.ActionBar.p6):void");
    }
}
