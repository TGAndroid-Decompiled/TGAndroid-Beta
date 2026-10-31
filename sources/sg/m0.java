package sg;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import bi.s0;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.cd;
import org.telegram.messenger.ic;
import org.telegram.messenger.jc;
import org.telegram.messenger.k6;
import org.telegram.messenger.sc;
import org.telegram.messenger.tz;
import org.telegram.messenger.ui;
import org.telegram.messenger.v5;
import org.telegram.messenger.vp;
import org.telegram.messenger.w0;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.c5;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Cells.q1;
import org.telegram.ui.Components.bi0;
import org.telegram.ui.Components.dc;
import org.telegram.ui.Components.e6;
import org.telegram.ui.Components.f5;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.kq;
import org.telegram.ui.Components.pm0;
import org.telegram.ui.Components.s5;
import org.telegram.ui.Components.t8;
import rh.s8;
public abstract class m0 {
    public int A;
    public final ImageReceiver B;
    public final f5 C;
    public int D;
    public final kq E;
    public final e6 F;
    public final e6 G;
    public boolean H;
    public int I;
    public int J;
    public int K;
    public int L;
    public int M;
    public int N;
    public int O;
    public final boolean P;
    public boolean Q;
    public boolean R;
    public t8 S;
    public ArrayList T;
    public final int U;
    public final View V;
    public final p6 W;
    public final dc X;
    public final s8 Y;
    public final bi0 Z;
    public final TLRPC.ReactionCount f48391a;
    public int f48393b;
    public int f48395c;
    public int d;
    public boolean f48397d0;
    public int e;
    public ImageReceiver f48398e0;
    public int f48399f;
    public f5 f48400f0;
    public int f48401g;
    public int h;
    public final int f48402i;
    public final int f48403j;
    public final boolean f48405l;
    public boolean f48406m;
    public final String f48407n;
    public boolean f48408o;
    public boolean f48409p;
    public final TLRPC.Reaction f48410q;
    public final o0 f48411r;
    public boolean f48413t;
    public final String f48414u;
    public int v;
    public int f48415w;
    public int f48416x;
    public int f48417y;
    public int f48418z;
    public boolean f48404k = true;
    public final Rect f48412s = new Rect();
    public final RectF f48392a0 = new RectF();
    public final RectF f48394b0 = new RectF();
    public final Path f48396c0 = new Path();

    public m0(m0 m0Var, int i10, View view, TLRPC.ReactionCount reactionCount, boolean z10, p6 p6Var) {
        s8 s8Var;
        int i11;
        bi0 bi0Var;
        s0 s0Var = new s0(this, 9);
        this.U = i10;
        this.V = view;
        this.X = new dc(view);
        this.W = p6Var;
        this.R = z10;
        if (m0Var != null) {
            this.E = m0Var.E;
        }
        if (this.B == null) {
            this.B = new ImageReceiver(null);
        }
        if (this.E == null) {
            this.E = new kq(view, false, null);
        }
        if (this.F == null) {
            e6 e6Var = new e6(true, true, true);
            this.F = e6Var;
            e6Var.K = true;
            e6Var.n(0.4f, 320L, gr.h);
            e6Var.w(org.telegram.messenger.i0.L(13.0f));
            e6Var.setCallback(s0Var);
            e6Var.x(org.telegram.messenger.i0.o());
            e6Var.M = org.telegram.messenger.i0.f16026q.x;
        }
        if (this.G == null) {
            e6 e6Var2 = new e6(false, false, false, true, false);
            this.G = e6Var2;
            e6Var2.w(org.telegram.messenger.i0.L(12.0f));
            e6Var2.setCallback(s0Var);
            e6Var2.x(org.telegram.messenger.i0.o());
            e6Var2.M = org.telegram.messenger.i0.f16026q.x;
            e6Var2.A = 0.35f;
        }
        this.f48391a = reactionCount;
        TLRPC.Reaction reaction = reactionCount.reaction;
        this.f48410q = reaction;
        o0 d = o0.d(reaction);
        this.f48411r = d;
        int i12 = reactionCount.count;
        this.v = i12;
        this.f48408o = reactionCount.chosen;
        this.f48402i = i12;
        this.f48403j = reactionCount.chosen_order;
        if (reaction instanceof TLRPC.TL_reactionPaid) {
            this.f48407n = "stars";
        } else if (reaction instanceof TLRPC.TL_reactionEmoji) {
            this.f48407n = ((TLRPC.TL_reactionEmoji) reaction).emoticon;
        } else if (reaction instanceof TLRPC.TL_reactionCustomEmoji) {
            this.f48407n = Long.toString(((TLRPC.TL_reactionCustomEmoji) reaction).document_id);
        } else {
            throw new RuntimeException("unsupported");
        }
        this.B.H0(view);
        this.P = reactionCount.chosen;
        kq kqVar = this.E;
        kqVar.G = false;
        kqVar.f27867a = true;
        if (reaction != null) {
            if (d.f48431a) {
                this.f48405l = true;
                if (sc.e(8200)) {
                    if (m0Var != null && (bi0Var = m0Var.Z) != null) {
                        this.Z = bi0Var;
                    } else {
                        this.Z = new bi0(2131624216, org.telegram.messenger.i0.L(40.0f), org.telegram.messenger.i0.L(40.0f));
                    }
                    this.B.w0(this.Z);
                } else {
                    this.B.w0(w0.f19025b.getResources().getDrawable(2131232748).mutate());
                }
                if (m0Var == null || (s8Var = m0Var.Y) == null) {
                    if (tz.o() == 2) {
                        i11 = 18;
                    } else {
                        i11 = 8;
                    }
                    s8Var = new s8(1, i11);
                }
                this.Y = s8Var;
            } else if (d.f48434f != null) {
                TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) ui.b0(i10).f18341r.get(d.f48434f);
                if (tL_availableReaction != null) {
                    this.B.q0(ic.b(tL_availableReaction.center_icon), "40_40_lastreactframe", v5.f(tL_availableReaction.static_icon, t6.f20872a7, 1.0f, null), "webp", tL_availableReaction, 1);
                }
            } else if (d.f48435g != 0) {
                this.C = new f5(i(), i10, d.f48435g);
            }
        }
        this.E.d(org.telegram.messenger.i0.L(26.0f), org.telegram.messenger.i0.L(100.0f));
        this.E.e = p0.V;
        if (z10) {
            String J1 = vp.r1(i10).J1(reaction);
            this.f48414u = J1;
            this.f48413t = !TextUtils.isEmpty(J1);
        }
        if (this.f48413t) {
            e6 e6Var3 = this.F;
            e6Var3.t(k6.m(this.f48414u, e6Var3.f25693a.getFontMetricsInt(), false, null, 0), !cd.X, true);
            if (this instanceof pm0) {
                Integer.toString(reactionCount.count);
                this.E.c(this.v, false);
            } else {
                this.E.c(0, false);
            }
        } else {
            e6 e6Var4 = this.F;
            if (e6Var4 != null) {
                e6Var4.t("", false, true);
            }
            Integer.toString(reactionCount.count);
            this.E.c(this.v, false);
        }
        kq kqVar2 = this.E;
        kqVar2.I = 2;
        kqVar2.f27888z = 3;
    }

    public final void a() {
        this.f48397d0 = true;
        ImageReceiver imageReceiver = this.B;
        if (imageReceiver != null) {
            imageReceiver.P();
        }
        t8 t8Var = this.S;
        if (t8Var != null) {
            t8Var.e();
        }
        f5 f5Var = this.C;
        if (f5Var != null) {
            f5Var.a(this.V);
        }
    }

    public final void b() {
        this.f48397d0 = false;
        ImageReceiver imageReceiver = this.B;
        if (imageReceiver != null) {
            imageReceiver.R();
        }
        t8 t8Var = this.S;
        if (t8Var != null) {
            t8Var.f();
        }
        f5 f5Var = this.C;
        if (f5Var != null) {
            f5Var.n(this.V);
        }
        c();
    }

    public final void c() {
        ImageReceiver imageReceiver = this.f48398e0;
        if (imageReceiver != null || this.f48400f0 != null) {
            if (imageReceiver != null) {
                imageReceiver.R();
                this.f48398e0 = null;
            } else if (this.f48400f0 != null) {
                View view = this.V;
                if (view != null && (view.getParent() instanceof View)) {
                    view = (View) view.getParent();
                }
                this.f48400f0.n(view);
                this.f48400f0 = null;
            }
        }
    }

    public final void d(Canvas canvas, float f7, float f10, float f11, float f12, boolean z10, boolean z11, float f13) {
        ImageReceiver imageReceiver;
        kq kqVar;
        ImageReceiver imageReceiver2;
        e6 e6Var;
        p6 p6Var;
        View view;
        float f14;
        float f15;
        float f16;
        boolean z12;
        float f17;
        float f18;
        e6 e6Var2;
        float f19;
        float f20;
        float f21;
        int L;
        int L2;
        ImageReceiver imageReceiver3;
        jc jcVar;
        Paint paint;
        c5 J1;
        int w02;
        kq kqVar2 = this.E;
        View view2 = this.V;
        boolean z13 = this.f48405l;
        Rect rect = this.f48412s;
        e6 e6Var3 = this.F;
        e6 e6Var4 = this.G;
        p6 p6Var2 = this.W;
        f5 f5Var = this.C;
        if (f5Var != null) {
            imageReceiver = f5Var.f25975k;
        } else {
            imageReceiver = this.B;
        }
        if (this.f48408o) {
            if (z13) {
                this.I = -1529086;
                this.J = -1;
                this.L = -1;
                this.K = -1529086;
            } else {
                this.I = t6.w0(l() ? t6.Gc : t6.qk, p6Var2);
                this.J = t6.w0(l() ? t6.uk : t6.tk, p6Var2);
                if (view2 instanceof org.telegram.ui.Cells.s0) {
                    this.L = t6.w0(t6.wk, p6Var2);
                    this.K = t6.w0(t6.vk, p6Var2);
                } else {
                    this.L = t6.w0(l() ? t6.Gc : t6.qk, p6Var2);
                    this.K = t6.w0(l() ? t6.f21139ob : t6.f21190ra, p6Var2);
                }
            }
        } else if (z13) {
            this.J = -1529086;
            this.I = 1088989954;
            this.L = -1;
            this.K = 0;
        } else {
            this.J = t6.w0(l() ? t6.rk : t6.sk, p6Var2);
            int w03 = t6.w0(l() ? t6.Gc : t6.qk, p6Var2);
            this.I = w03;
            this.I = i0.b.o(w03, (int) (Color.alpha(w03) * 0.156f));
            this.L = t6.w0(t6.Wc, p6Var2);
            this.K = 0;
        }
        if (!z13 && (view2 instanceof q1) && ((q1) view2).t2()) {
            if (this.f48408o) {
                this.I = t6.w0(t6.gb, p6Var2);
                this.J = t6.w0(t6.f21006hb, p6Var2);
            } else {
                if (l()) {
                    w02 = i0.b.k(t6.w0(t6.La, p6Var2), t6.w0(t6.ua, p6Var2));
                } else {
                    w02 = t6.w0(t6.ua, p6Var2);
                }
                this.I = i0.b.k(t6.w0(t6.eb, p6Var2), w02);
                this.J = t6.w0(t6.f20970fb, p6Var2);
            }
            this.L = this.J;
            this.K = this.I;
        }
        if (this.f48409p) {
            this.I = 0;
            this.K = 0;
        }
        r(f11);
        TextPaint textPaint = p0.V;
        textPaint.setColor(this.M);
        if (e6Var3 != null) {
            e6Var3.u(this.M);
        }
        Paint paint2 = p0.S;
        paint2.setColor(this.N);
        boolean z14 = this.R && h() && Color.alpha(this.O) == 0;
        if (f12 != 1.0f) {
            textPaint.setAlpha((int) (textPaint.getAlpha() * f12));
            paint2.setAlpha((int) (paint2.getAlpha() * f12));
        }
        if (imageReceiver != null) {
            imageReceiver.setAlpha(f12);
        }
        float f22 = 0.0f;
        int i10 = (f13 > 0.0f ? 1 : (f13 == 0.0f ? 0 : -1));
        if (i10 <= 0 || this.H == z11) {
            kqVar = kqVar2;
            imageReceiver2 = imageReceiver;
            e6Var = e6Var4;
            p6Var = p6Var2;
            view = view2;
        } else {
            if (z11) {
                e6Var = e6Var4;
                kqVar = kqVar2;
                p6Var = p6Var2;
                imageReceiver2 = imageReceiver;
                e6Var.m(0.6f, 650L, 1.6f, gr.f26499k);
                e6Var.t(org.telegram.messenger.i0.o0(this.v, 0), false, true);
                view = view2;
                e6Var.t(cd.E(this.v, ','), true, true);
            } else {
                kqVar = kqVar2;
                imageReceiver2 = imageReceiver;
                e6Var = e6Var4;
                p6Var = p6Var2;
                view = view2;
                e6Var.m(0.6f, 320L, 1.6f, gr.h);
                e6Var.t(org.telegram.messenger.i0.o0(this.v, 0), true, true);
            }
            this.H = z11;
        }
        float a2 = this.X.a(0.1f);
        int i11 = this.f48418z;
        if (i10 <= 0 || this.R || e6Var == null || this.S != null) {
            f14 = 1.0f;
            if (f11 != 1.0f) {
                f16 = 6.0f;
                f15 = 8.0f;
                if (this.f48393b == 3) {
                    i11 = (int) c3.i0.z(1.0f, f11, this.e, i11 * f11);
                }
            } else {
                f15 = 8.0f;
                f16 = 6.0f;
            }
        } else {
            i11 = (int) (e6Var.c() + org.telegram.messenger.i0.L(f5Var != null ? 6.0f : 4.0f) + org.telegram.messenger.i0.L(20.0f) + org.telegram.messenger.i0.L(8.0f) + org.telegram.messenger.i0.L(8.0f));
            e6Var.u(this.M);
            f15 = 8.0f;
            f16 = 6.0f;
            f14 = 1.0f;
        }
        RectF rectF = org.telegram.messenger.i0.P;
        float f23 = i11;
        float f24 = f14;
        rectF.set(f7, f10, f7 + f23, this.A + f10);
        if (a2 != f24) {
            canvas.save();
            canvas.scale(a2, a2, (f23 / 2.0f) + f7, (this.A / 2.0f) + f10);
            z12 = true;
        } else {
            z12 = false;
        }
        float f25 = this.A / 2.0f;
        if (j() <= 0.0f || this.f48409p) {
            f17 = 2.0f;
            f18 = 4.0f;
        } else {
            p6 p6Var3 = p6Var;
            Paint W0 = t6.W0("paintChatActionBackground", p6Var3);
            f17 = 2.0f;
            Paint W02 = t6.W0("paintChatActionBackgroundDarken", p6Var3);
            f18 = 4.0f;
            int alpha = W0.getAlpha();
            int alpha2 = W02.getAlpha();
            W0.setAlpha((int) (alpha * f12 * j()));
            W02.setAlpha((int) (alpha2 * f12 * j()));
            g(canvas, rectF, f25, W0);
            if (p6Var == null ? t6.d1() : p6Var.g()) {
                g(canvas, rectF, f25, W02);
            }
            W0.setAlpha(alpha);
            W02.setAlpha(alpha2);
        }
        if (z10 && j() < f24) {
            View view3 = view;
            if ((view3 instanceof q1) && (J1 = ((q1) view3).J1(false)) != null && !this.R) {
                canvas.drawRoundRect(rectF, f25, f25, J1.f20212c);
            }
        }
        if (z14) {
            rectF.right += org.telegram.messenger.i0.L(f18);
            canvas.saveLayerAlpha(rectF, 255, 31);
            rectF.right -= org.telegram.messenger.i0.L(f18);
        }
        if (this.Y != null) {
            sc.e(8200);
        }
        g(canvas, rectF, f25, paint2);
        if (this.R && h()) {
            if (z14) {
                paint = p0.U;
            } else {
                paint = p0.T;
                paint.setColor(this.O);
                paint.setAlpha((int) (paint.getAlpha() * f12));
            }
            canvas.drawCircle(rectF.right - org.telegram.messenger.i0.L(8.4f), rectF.centerY(), org.telegram.messenger.i0.L(2.66f), paint);
        }
        if (z14) {
            canvas.restore();
        }
        ImageReceiver imageReceiver4 = imageReceiver2;
        if (imageReceiver4 != null) {
            if (z13) {
                L = org.telegram.messenger.i0.L(22.0f);
                L2 = org.telegram.messenger.i0.L(f18);
            } else if (f5Var != null) {
                L = org.telegram.messenger.i0.L(24.0f);
                L2 = org.telegram.messenger.i0.L(f16);
                imageReceiver4.J0(org.telegram.messenger.i0.L(f16));
            } else {
                L = org.telegram.messenger.i0.L(20.0f);
                L2 = org.telegram.messenger.i0.L(f15);
                imageReceiver4.J0(0);
            }
            int i12 = (int) ((this.A - L) / f17);
            if (this.R) {
                L2 -= org.telegram.messenger.i0.L(f17);
            }
            int i13 = ((int) f7) + L2;
            int i14 = ((int) f10) + i12;
            rect.set(i13, i14, i13 + L, L + i14);
            f5 f5Var2 = this.C;
            if (f5Var2 == null || (imageReceiver3 = f5Var2.f25975k) == null) {
                imageReceiver3 = this.B;
            }
            if (imageReceiver3 != null && rect != null) {
                imageReceiver3.z0(rect);
            }
            f5 f5Var3 = this.C;
            if (f5Var3 != null && this.D != this.M) {
                int i15 = this.M;
                this.D = i15;
                f5Var3.setColorFilter(new PorterDuffColorFilter(i15, PorterDuff.Mode.SRC_IN));
            }
            boolean z15 = false;
            if (this.f48404k && (this.f48405l || this.f48402i > 1 || !m() || !this.P)) {
                ImageReceiver k10 = k();
                if (k10 != null) {
                    if (k10.B() == null || !k10.B().u()) {
                        z15 = true;
                    }
                    if (f12 != 1.0f) {
                        k10.setAlpha(f12);
                        if (f12 <= 0.0f) {
                            k10.R();
                            n();
                        }
                    } else if (k10.B() != null && !k10.B().f24765k0) {
                        float alpha3 = k10.getAlpha() - 0.08f;
                        if (alpha3 <= 0.0f) {
                            k10.R();
                            n();
                        } else {
                            k10.setAlpha(alpha3);
                        }
                        this.V.invalidate();
                        z15 = true;
                    }
                    float f26 = imageReceiver3.K0 - (imageReceiver3.M0 / 2.0f);
                    float f27 = imageReceiver3.L0 - (imageReceiver3.N0 / 2.0f);
                    e6Var2 = e6Var3;
                    float floor = (int) Math.floor(f26);
                    float floor2 = (int) Math.floor(f27);
                    k10.y0(floor, floor2, imageReceiver3.M0 * 2.0f, imageReceiver3.N0 * 2.0f);
                    canvas.save();
                    canvas.translate(f26 - floor, f27 - floor2);
                    jcVar = null;
                    k10.h(canvas, null);
                    canvas.restore();
                } else {
                    e6Var2 = e6Var3;
                    jcVar = null;
                    z15 = true;
                }
                if (z15) {
                    imageReceiver3.h(canvas, jcVar);
                }
                this.f48406m = true;
            } else {
                e6Var2 = e6Var3;
                imageReceiver3.setAlpha(0.0f);
                imageReceiver3.h(canvas, null);
                this.f48406m = false;
            }
        } else {
            e6Var2 = e6Var3;
        }
        if (e6Var2 != null && e6Var2.i() > 0.0f) {
            canvas.save();
            if (!this.f48413t || h()) {
                f21 = this.f48413t ? 9 : 8;
            } else {
                f21 = 10.0f;
            }
            canvas.translate(org.telegram.messenger.i0.L(f21) + f7 + org.telegram.messenger.i0.L(20.0f) + org.telegram.messenger.i0.L(f17), f10);
            e6Var2.setBounds(0, 0, this.f48418z, this.A);
            e6Var2.draw(canvas);
            e6Var2.B = (int) (f12 * 255.0f);
            canvas.restore();
            f22 = (e6Var2.i() * org.telegram.messenger.i0.L(f18)) + e6Var2.c();
        }
        if (i10 > 0 && !this.R && e6Var != null && this.S == null) {
            canvas.save();
            if (!this.f48413t || h()) {
                f20 = this.f48413t ? 9 : 8;
            } else {
                f20 = 10.0f;
            }
            canvas.translate(org.telegram.messenger.i0.L(f20) + f7 + org.telegram.messenger.i0.L(20.0f) + org.telegram.messenger.i0.L(f5Var == null ? f17 : 5.0f), f10 - org.telegram.messenger.i0.L(f24));
            e6Var.setBounds(0, 0, this.f48418z, this.A);
            e6Var.draw(canvas);
            e6Var.B = (int) (255.0f * f12);
            canvas.restore();
        } else if (kqVar != null && e()) {
            canvas.save();
            if (!this.f48413t || h()) {
                f19 = this.f48413t ? 9 : 8;
            } else {
                f19 = 10.0f;
            }
            canvas.translate(org.telegram.messenger.i0.L(f19) + f7 + org.telegram.messenger.i0.L(20.0f) + org.telegram.messenger.i0.L(f5Var == null ? f17 : 5.0f) + f22 + (z13 ? -org.telegram.messenger.i0.L(f24) : 0), f10);
            kqVar.a(canvas);
            canvas.restore();
        }
        if (!this.R && this.S != null) {
            canvas.save();
            canvas.translate(f7 + org.telegram.messenger.i0.L(10.0f) + org.telegram.messenger.i0.L(20.0f) + org.telegram.messenger.i0.L(f17), f10);
            t8 t8Var = this.S;
            t8Var.f30496u = f12;
            if (t8Var.f30497w && t8Var.e != f11) {
                t8Var.e = f11;
                if (f11 == f24) {
                    t8Var.k();
                    t8Var.f30497w = false;
                }
            }
            this.S.g(canvas);
            canvas.restore();
        }
        if (z12) {
            canvas.restore();
        }
    }

    public boolean e() {
        int i10 = this.v;
        if ((i10 != 0 && (!this.R || this.f48413t || i10 != 1)) || this.E.f27875l != 1.0f) {
            return true;
        }
        return false;
    }

    public final boolean f(Canvas canvas, float f7, float f10) {
        s8 s8Var = this.Y;
        if (s8Var != null) {
            RectF rectF = s8Var.f47460c;
            if (sc.e(8200) && sc.e(131072)) {
                RectF rectF2 = org.telegram.messenger.i0.P;
                rectF2.set(f7, f10, this.f48418z + f7, this.A + f10);
                float f11 = this.A / 2.0f;
                rectF.set(rectF2);
                rectF.inset(-org.telegram.messenger.i0.L(4.0f), -org.telegram.messenger.i0.L(4.0f));
                s8Var.g(rectF);
                boolean d = s8Var.d();
                s8Var.a(canvas, i0.b.f(j(), i0.b.o(this.I, 255), i0.b.f(0.4f, this.L, i0.b.o(this.I, 255))));
                if (this.P) {
                    Path path = this.f48396c0;
                    path.rewind();
                    path.addRoundRect(rectF2, f11, f11, Path.Direction.CW);
                    canvas.save();
                    canvas.clipPath(path);
                    s8Var.a(canvas, this.J);
                    canvas.restore();
                }
                return d;
            }
            return false;
        }
        return false;
    }

    public final void g(Canvas canvas, RectF rectF, float f7, Paint paint) {
        if (this.R) {
            RectF rectF2 = this.f48392a0;
            int i10 = (rectF2.left > rectF.left ? 1 : (rectF2.left == rectF.left ? 0 : -1));
            Path path = this.f48396c0;
            if (i10 != 0 || rectF2.top != rectF.top || rectF2.right != rectF.right || rectF2.bottom != rectF.bottom) {
                rectF2.set(rectF);
                p0.h(rectF2, this.f48394b0, path);
            }
            canvas.drawPath(path, paint);
            return;
        }
        canvas.drawRoundRect(rectF, f7, f7, paint);
    }

    public boolean h() {
        return true;
    }

    public int i() {
        if (this.R) {
            return 18;
        }
        return 3;
    }

    public float j() {
        return 0.0f;
    }

    public ImageReceiver k() {
        return null;
    }

    public boolean l() {
        return false;
    }

    public boolean m() {
        return false;
    }

    public final void o(ArrayList arrayList) {
        this.T = arrayList;
        if (arrayList != null) {
            Collections.sort(arrayList, p0.Z);
            if (this.S == null) {
                t8 t8Var = new t8(this.V, false);
                this.S = t8Var;
                t8Var.v = 250L;
                gr grVar = ci.o.V;
                t8Var.f30494s = org.telegram.messenger.i0.L(20.0f);
                this.S.f30491p = org.telegram.messenger.i0.L(100.0f);
                t8 t8Var2 = this.S;
                t8Var2.f30490o = this.A;
                t8Var2.h(org.telegram.messenger.i0.L(22.0f));
            }
            if (this.f48397d0) {
                this.S.e();
            }
            for (int i10 = 0; i10 < arrayList.size() && i10 != 3; i10++) {
                this.S.j(i10, this.U, (TLObject) arrayList.get(i10));
            }
            this.S.a(false, true);
        }
    }

    public final void p() {
        ImageReceiver imageReceiver;
        f5 f5Var = this.C;
        if (f5Var == null || (imageReceiver = f5Var.f25975k) == null) {
            imageReceiver = this.B;
        }
        if (imageReceiver != null) {
            bi0 B = imageReceiver.B();
            if (B != null) {
                B.H(true);
                return;
            }
            s5 m10 = imageReceiver.m();
            if (m10 != null) {
                m10.start();
            }
        }
    }

    public final void q() {
        ImageReceiver imageReceiver;
        f5 f5Var = this.C;
        if (f5Var == null || (imageReceiver = f5Var.f25975k) == null) {
            imageReceiver = this.B;
        }
        if (imageReceiver != null) {
            bi0 B = imageReceiver.B();
            if (B != null) {
                B.stop();
                return;
            }
            s5 m10 = imageReceiver.m();
            if (m10 != null) {
                m10.stop();
            }
        }
    }

    public void r(float f7) {
        int i10;
        this.M = i0.b.f(f7, this.h, i0.b.f(j(), this.J, this.L));
        int f10 = i0.b.f(f7, this.f48399f, i0.b.f(j(), this.I, this.K));
        this.N = f10;
        int i11 = this.f48401g;
        if (org.telegram.messenger.i0.B(f10) > 0.8f) {
            i10 = 0;
        } else {
            i10 = 1526726655;
        }
        this.O = i0.b.f(f7, i11, i10);
    }

    public void n() {
    }
}
