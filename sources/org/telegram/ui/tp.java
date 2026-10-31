package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.SparseArray;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class tp implements org.telegram.messenger.us {
    public int D;
    public int E;
    public final ImageReceiver F;
    public TLRPC.Chat G;
    public TLRPC.TL_forumTopic H;
    public long I;
    public AnimatorSet J;
    public float K;
    public float L;
    public boolean M;
    public boolean N;
    public float O;
    public long P;
    public float Q;
    public boolean R;
    public float S;
    public final View T;
    public long U;
    public boolean V;
    public boolean W;
    public final boolean X;
    public rh Y;
    public long Z;
    public int f41887a;
    public View f41888a0;
    public int f41889b;
    public boolean f41890b0;
    public int f41891c;
    public final org.telegram.ui.Components.kq f41892c0;
    public float d;
    public final int[] f41893d0;
    public final Paint e;
    public final int f41894e0;
    public final TextPaint f41895f;
    public final int f41896f0;
    public final int f41897g0;
    public final TextPaint h;
    public final long f41898h0;
    public final long f41899i0;
    public final org.telegram.ui.ActionBar.p6 f41900j0;
    public org.telegram.ui.Components.f5 f41901k0;
    public gg.d f41902l0;
    public int m0;
    public final Paint f41903n;
    public int f41904n0;
    public final Path f41905r;
    public StaticLayout f41906s;
    public StaticLayout f41907w;
    public StaticLayout f41908x;
    public int f41909y;

    public tp(int i10, View view, long j10, int i11, int i12, long j11, org.telegram.ui.ActionBar.p6 p6Var) {
        Paint paint = new Paint(1);
        this.e = paint;
        TextPaint textPaint = new TextPaint(1);
        this.f41895f = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.h = textPaint2;
        Paint paint2 = new Paint(1);
        this.f41903n = paint2;
        this.f41905r = new Path();
        this.I = 0L;
        this.f41890b0 = true;
        org.telegram.ui.Components.kq kqVar = new org.telegram.ui.Components.kq(null, true, null);
        this.f41892c0 = kqVar;
        this.f41893d0 = new int[3];
        this.T = view;
        this.f41894e0 = i10;
        this.f41899i0 = j10;
        this.f41896f0 = i11;
        this.f41897g0 = i12;
        this.f41898h0 = j11;
        this.X = org.telegram.messenger.vp.r1(i10).s2(j10);
        this.f41900j0 = p6Var;
        this.F = new ImageReceiver(view);
        paint.setStrokeWidth(org.telegram.messenger.i0.N(2.8f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        kqVar.f27888z = 3;
        kqVar.I = 1;
        kqVar.f27871g = true;
        kqVar.d = d("paintChatActionBackground");
        kqVar.e = textPaint;
        textPaint.setTextSize(org.telegram.messenger.i0.L(13.0f));
        textPaint.setTypeface(org.telegram.messenger.i0.o());
        textPaint2.setTextSize(org.telegram.messenger.i0.L(14.0f));
        paint2.setColor(-16777216);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }

    public static TLRPC.Dialog c(long j10, int i10, int i11, boolean z10, int[] iArr) {
        ArrayList V0;
        TLRPC.Dialog c10;
        TLRPC.Dialog c11;
        org.telegram.messenger.vp r12 = org.telegram.messenger.vp.r1(org.telegram.messenger.c.a(org.telegram.messenger.d20.f15147s0).f14863a);
        SparseArray sparseArray = r12.f18930w;
        if (iArr != null) {
            iArr[0] = 0;
            iArr[1] = i10;
            iArr[2] = i11;
        }
        if (i11 != 0) {
            org.telegram.messenger.ap apVar = (org.telegram.messenger.ap) r12.S0.get(i11);
            if (apVar != null) {
                V0 = apVar.f14652k;
            } else {
                return null;
            }
        } else {
            V0 = r12.V0(i10);
        }
        if (V0 != null) {
            for (int i12 = 0; i12 < V0.size(); i12++) {
                TLRPC.Dialog dialog = (TLRPC.Dialog) V0.get(i12);
                TLRPC.Chat L0 = r12.L0(Long.valueOf(-dialog.f19797id));
                if (L0 != null && dialog.f19797id != j10 && dialog.unread_count > 0 && org.telegram.messenger.o5.y(dialog) && !L0.megagroup && !r12.B2(dialog.f19797id, false) && r12.E1(L0.restriction_reason) == null) {
                    return dialog;
                }
            }
            if (z10) {
                if (i11 != 0) {
                    for (int i13 = 0; i13 < r12.P0.size(); i13++) {
                        int i14 = ((org.telegram.messenger.ap) r12.P0.get(i13)).f14645a;
                        if (i11 != i14 && (c11 = c(j10, i10, i14, false, iArr)) != null) {
                            if (iArr != null) {
                                iArr[0] = 1;
                            }
                            return c11;
                        }
                    }
                }
                for (int i15 = 0; i15 < sparseArray.size(); i15++) {
                    int keyAt = sparseArray.keyAt(i15);
                    if (i10 != keyAt && (c10 = c(j10, keyAt, 0, false, iArr)) != null) {
                        if (iArr != null) {
                            iArr[0] = 1;
                        }
                        return c10;
                    }
                }
                return null;
            }
            return null;
        }
        return null;
    }

    public final void a(android.graphics.Canvas r43, org.telegram.ui.vj r44, float r45, float r46) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.tp.a(android.graphics.Canvas, org.telegram.ui.vj, float, float):void");
    }

    public final void b(Canvas canvas, int i10, int i11) {
        int w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Ll, this.f41900j0);
        TextPaint textPaint = this.h;
        textPaint.setColor(w02);
        Paint d = d("paintChatComposeBackground");
        int alpha = d.getAlpha();
        int alpha2 = textPaint.getAlpha();
        d.setAlpha((int) (alpha * this.S));
        if (this.f41907w != null) {
            float f7 = this.K;
            if (f7 < 1.0f) {
                textPaint.setAlpha((int) ((1.0f - f7) * alpha2 * this.S));
                float height = ((((i11 - i10) - this.f41907w.getHeight()) / 2.0f) + i10) - (org.telegram.messenger.i0.L(10.0f) * this.K);
                canvas.save();
                canvas.translate((this.f41891c - this.D) / 2.0f, height);
                this.f41907w.draw(canvas);
                canvas.restore();
            }
        }
        if (this.f41908x != null) {
            float f10 = this.K;
            if (f10 > 0.0f) {
                textPaint.setAlpha((int) (alpha2 * f10 * this.S));
                float L = ((1.0f - this.K) * org.telegram.messenger.i0.L(10.0f)) + (((i11 - i10) - this.f41908x.getHeight()) / 2.0f) + i10;
                canvas.save();
                canvas.translate((this.f41891c - this.E) / 2.0f, L);
                this.f41908x.draw(canvas);
                canvas.restore();
            }
        }
        textPaint.setAlpha(alpha2);
        d.setAlpha(alpha);
    }

    public final Paint d(String str) {
        Paint paint;
        org.telegram.ui.ActionBar.p6 p6Var = this.f41900j0;
        if (p6Var != null) {
            paint = p6Var.d(str);
        } else {
            paint = null;
        }
        if (paint != null) {
            return paint;
        }
        return org.telegram.ui.ActionBar.t6.V0(str);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        TLRPC.Dialog dialog;
        if (this.Z != 0 && (dialog = (TLRPC.Dialog) org.telegram.messenger.vp.r1(this.f41894e0).Q.f(this.Z)) != null) {
            int i12 = dialog.unread_count;
            boolean z10 = true;
            this.f41892c0.c(i12, true);
            if (i12 <= 0) {
                z10 = false;
            }
            this.f41890b0 = z10;
            View view = this.f41888a0;
            if (view != null) {
                view.invalidate();
            }
        }
    }

    public final boolean e() {
        if (this.S > 0.0f && !this.R) {
            return true;
        }
        return false;
    }

    public final void f(final View view, boolean z10) {
        AnimatorSet animatorSet = this.J;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
            this.J.cancel();
        }
        if (z10) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.K, 1.0f);
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                public final tp f41264b;

                {
                    this.f41264b = this;
                }

                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    switch (r3) {
                        case 0:
                            tp tpVar = this.f41264b;
                            tpVar.getClass();
                            tpVar.K = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            view.invalidate();
                            tpVar.T.invalidate();
                            return;
                        case 1:
                            tp tpVar2 = this.f41264b;
                            tpVar2.getClass();
                            tpVar2.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            view.invalidate();
                            return;
                        case 2:
                            tp tpVar3 = this.f41264b;
                            tpVar3.getClass();
                            tpVar3.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            view.invalidate();
                            return;
                        case 3:
                            tp tpVar4 = this.f41264b;
                            tpVar4.getClass();
                            tpVar4.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            view.invalidate();
                            return;
                        default:
                            tp tpVar5 = this.f41264b;
                            tpVar5.getClass();
                            tpVar5.K = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            tpVar5.T.invalidate();
                            view.invalidate();
                            return;
                    }
                }
            });
            ofFloat.setInterpolator(org.telegram.ui.Components.gr.h);
            ofFloat.setDuration(250L);
            this.L = 0.0f;
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                public final tp f41264b;

                {
                    this.f41264b = this;
                }

                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    switch (r3) {
                        case 0:
                            tp tpVar = this.f41264b;
                            tpVar.getClass();
                            tpVar.K = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            view.invalidate();
                            tpVar.T.invalidate();
                            return;
                        case 1:
                            tp tpVar2 = this.f41264b;
                            tpVar2.getClass();
                            tpVar2.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            view.invalidate();
                            return;
                        case 2:
                            tp tpVar3 = this.f41264b;
                            tpVar3.getClass();
                            tpVar3.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            view.invalidate();
                            return;
                        case 3:
                            tp tpVar4 = this.f41264b;
                            tpVar4.getClass();
                            tpVar4.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            view.invalidate();
                            return;
                        default:
                            tp tpVar5 = this.f41264b;
                            tpVar5.getClass();
                            tpVar5.K = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            tpVar5.T.invalidate();
                            view.invalidate();
                            return;
                    }
                }
            });
            org.telegram.ui.Components.gr grVar = org.telegram.ui.Components.gr.f26498j;
            ofFloat2.setInterpolator(grVar);
            ofFloat2.setDuration(180L);
            ValueAnimator ofFloat3 = ValueAnimator.ofFloat(1.0f, -0.5f);
            ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                public final tp f41264b;

                {
                    this.f41264b = this;
                }

                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    switch (r3) {
                        case 0:
                            tp tpVar = this.f41264b;
                            tpVar.getClass();
                            tpVar.K = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            view.invalidate();
                            tpVar.T.invalidate();
                            return;
                        case 1:
                            tp tpVar2 = this.f41264b;
                            tpVar2.getClass();
                            tpVar2.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            view.invalidate();
                            return;
                        case 2:
                            tp tpVar3 = this.f41264b;
                            tpVar3.getClass();
                            tpVar3.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            view.invalidate();
                            return;
                        case 3:
                            tp tpVar4 = this.f41264b;
                            tpVar4.getClass();
                            tpVar4.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            view.invalidate();
                            return;
                        default:
                            tp tpVar5 = this.f41264b;
                            tpVar5.getClass();
                            tpVar5.K = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            tpVar5.T.invalidate();
                            view.invalidate();
                            return;
                    }
                }
            });
            ofFloat3.setInterpolator(grVar);
            ofFloat3.setDuration(120L);
            ValueAnimator ofFloat4 = ValueAnimator.ofFloat(-0.5f, 0.0f);
            ofFloat4.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                public final tp f41264b;

                {
                    this.f41264b = this;
                }

                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    switch (r3) {
                        case 0:
                            tp tpVar = this.f41264b;
                            tpVar.getClass();
                            tpVar.K = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            view.invalidate();
                            tpVar.T.invalidate();
                            return;
                        case 1:
                            tp tpVar2 = this.f41264b;
                            tpVar2.getClass();
                            tpVar2.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            view.invalidate();
                            return;
                        case 2:
                            tp tpVar3 = this.f41264b;
                            tpVar3.getClass();
                            tpVar3.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            view.invalidate();
                            return;
                        case 3:
                            tp tpVar4 = this.f41264b;
                            tpVar4.getClass();
                            tpVar4.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            view.invalidate();
                            return;
                        default:
                            tp tpVar5 = this.f41264b;
                            tpVar5.getClass();
                            tpVar5.K = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            tpVar5.T.invalidate();
                            view.invalidate();
                            return;
                    }
                }
            });
            ofFloat4.setInterpolator(grVar);
            ofFloat4.setDuration(100L);
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.J = animatorSet2;
            animatorSet2.addListener(new bg.f(13, this, view));
            AnimatorSet animatorSet3 = new AnimatorSet();
            animatorSet3.playSequentially(ofFloat2, ofFloat3, ofFloat4);
            this.J.playTogether(ofFloat, animatorSet3);
            this.J.start();
            return;
        }
        ValueAnimator ofFloat5 = ValueAnimator.ofFloat(this.K, 0.0f);
        ofFloat5.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
            public final tp f41264b;

            {
                this.f41264b = this;
            }

            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (r3) {
                    case 0:
                        tp tpVar = this.f41264b;
                        tpVar.getClass();
                        tpVar.K = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        view.invalidate();
                        tpVar.T.invalidate();
                        return;
                    case 1:
                        tp tpVar2 = this.f41264b;
                        tpVar2.getClass();
                        tpVar2.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        view.invalidate();
                        return;
                    case 2:
                        tp tpVar3 = this.f41264b;
                        tpVar3.getClass();
                        tpVar3.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        view.invalidate();
                        return;
                    case 3:
                        tp tpVar4 = this.f41264b;
                        tpVar4.getClass();
                        tpVar4.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        view.invalidate();
                        return;
                    default:
                        tp tpVar5 = this.f41264b;
                        tpVar5.getClass();
                        tpVar5.K = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        tpVar5.T.invalidate();
                        view.invalidate();
                        return;
                }
            }
        });
        ofFloat5.setInterpolator(org.telegram.ui.Components.gr.f26495f);
        ofFloat5.setDuration(220L);
        AnimatorSet animatorSet4 = new AnimatorSet();
        this.J = animatorSet4;
        animatorSet4.playTogether(ofFloat5);
        this.J.start();
    }

    public final void g() {
        boolean z10;
        boolean z11 = false;
        this.V = false;
        this.H = null;
        TLRPC.Dialog c10 = c(this.f41899i0, this.f41896f0, this.f41897g0, true, this.f41893d0);
        if (c10 != null) {
            this.Z = c10.f19797id;
            int[] iArr = this.f41893d0;
            if (iArr[0] == 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.W = z10;
            this.f41887a = iArr[1];
            this.f41889b = iArr[2];
            this.R = false;
            int i10 = this.f41894e0;
            TLRPC.Chat L0 = org.telegram.messenger.vp.r1(i10).L0(Long.valueOf(-c10.f19797id));
            this.G = L0;
            if (L0 == null) {
                this.G = org.telegram.messenger.vp.r1(i10).L0(Long.valueOf(c10.f19797id));
            }
            org.telegram.ui.Components.r8 r8Var = new org.telegram.ui.Components.r8((org.telegram.ui.ActionBar.p6) null);
            r8Var.q(this.G);
            this.F.q0(org.telegram.messenger.ic.a(1, this.G), "50_50", r8Var, null, org.telegram.messenger.d20.i(0).f(), 0);
            org.telegram.messenger.vp.r1(i10).s0(c10.f19797id, 0, null);
            int i11 = c10.unread_count;
            this.f41892c0.c(i11, false);
            if (i11 > 0) {
                z11 = true;
            }
            this.f41890b0 = z11;
            return;
        }
        this.G = null;
        this.W = false;
        this.R = true;
    }

    public final void h(TLRPC.Chat chat) {
        boolean z10;
        int i10;
        if (chat == null) {
            g();
            return;
        }
        this.Z = -chat.f19793id;
        int[] iArr = this.f41893d0;
        boolean z11 = false;
        if (iArr[0] == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.W = z10;
        this.f41887a = iArr[1];
        this.f41889b = iArr[2];
        this.R = false;
        this.G = chat;
        org.telegram.ui.Components.r8 r8Var = new org.telegram.ui.Components.r8((org.telegram.ui.ActionBar.p6) null);
        r8Var.q(this.G);
        this.F.q0(org.telegram.messenger.ic.a(1, this.G), "50_50", r8Var, null, org.telegram.messenger.d20.i(0).f(), 0);
        int i11 = this.f41894e0;
        org.telegram.messenger.vp.r1(i11).s0(-chat.f19793id, 0, null);
        TLRPC.Dialog R0 = org.telegram.messenger.vp.r1(i11).R0(-chat.f19793id);
        if (R0 == null) {
            i10 = 0;
        } else {
            i10 = R0.unread_count;
        }
        this.f41892c0.c(i10, false);
        if (i10 > 0) {
            z11 = true;
        }
        this.f41890b0 = z11;
        this.V = true;
        this.H = null;
    }

    public final void i() {
        TLRPC.TL_forumTopic tL_forumTopic;
        org.telegram.ui.Components.f5 f5Var;
        View view;
        View view2;
        org.telegram.ui.Components.f5 f5Var2;
        TLRPC.Message message;
        TLRPC.Message message2;
        boolean z10 = false;
        this.V = false;
        this.W = false;
        gg.d dVar = null;
        this.G = null;
        this.Z = 0L;
        ImageReceiver imageReceiver = this.F;
        imageReceiver.f();
        int i10 = this.f41894e0;
        ArrayList l4 = org.telegram.messenger.vp.r1(i10).f18891r7.l(-this.f41899i0);
        if (l4 != null && l4.size() > 1) {
            tL_forumTopic = null;
            for (int i11 = 0; i11 < l4.size(); i11++) {
                TLRPC.TL_forumTopic tL_forumTopic2 = (TLRPC.TL_forumTopic) l4.get(i11);
                if (tL_forumTopic2.f19845id != this.f41898h0 && !tL_forumTopic2.hidden && tL_forumTopic2.unread_count > 0 && (tL_forumTopic == null || ((message = tL_forumTopic2.topMessage) != null && (message2 = tL_forumTopic.topMessage) != null && message.date > message2.date))) {
                    tL_forumTopic = tL_forumTopic2;
                }
            }
        } else {
            tL_forumTopic = null;
        }
        if (tL_forumTopic != null) {
            this.R = false;
            this.H = tL_forumTopic;
            int i12 = tL_forumTopic.f19845id;
            org.telegram.ui.ActionBar.p6 p6Var = this.f41900j0;
            if (i12 == 1) {
                View view3 = this.f41888a0;
                if (view3 != null && (f5Var2 = this.f41901k0) != null) {
                    f5Var2.n(view3);
                }
                this.f41901k0 = null;
                Context context = this.T.getContext();
                int i13 = org.telegram.ui.ActionBar.t6.f21141od;
                gg.d c10 = gg.e.c(context, 1.0f, org.telegram.ui.ActionBar.t6.w0(i13, p6Var), true);
                if (c10 != null) {
                    dVar = c10;
                }
                this.f41902l0 = dVar;
                this.m0 = org.telegram.ui.ActionBar.t6.w0(i13, p6Var);
                imageReceiver.w0(c10);
            } else if (tL_forumTopic.icon_emoji_id != 0) {
                org.telegram.ui.Components.f5 f5Var3 = this.f41901k0;
                if (f5Var3 == null || f5Var3.h() != tL_forumTopic.icon_emoji_id) {
                    org.telegram.ui.Components.f5 f5Var4 = this.f41901k0;
                    if (f5Var4 != null && (view = this.f41888a0) != null) {
                        f5Var4.n(view);
                    }
                    org.telegram.ui.Components.f5 f5Var5 = new org.telegram.ui.Components.f5(22, i10, tL_forumTopic.icon_emoji_id);
                    this.f41901k0 = f5Var5;
                    int w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Wc, p6Var);
                    this.f41904n0 = w02;
                    f5Var5.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
                }
                org.telegram.ui.Components.f5 f5Var6 = this.f41901k0;
                if (f5Var6 != null && (view2 = this.f41888a0) != null) {
                    f5Var6.a(view2);
                }
                imageReceiver.w0(null);
            } else {
                View view4 = this.f41888a0;
                if (view4 != null && (f5Var = this.f41901k0) != null) {
                    f5Var.n(view4);
                }
                this.f41901k0 = null;
                imageReceiver.w0(gg.e.e(tL_forumTopic));
            }
            int i14 = tL_forumTopic.unread_count;
            this.f41892c0.c(i14, false);
            if (i14 > 0) {
                z10 = true;
            }
            this.f41890b0 = z10;
            return;
        }
        this.H = null;
        this.R = true;
    }
}
