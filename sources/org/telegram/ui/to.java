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
public final class to implements org.telegram.messenger.cs {
    public int E;
    public int F;
    public final ImageReceiver G;
    public TLRPC.Chat H;
    public TLRPC.TL_forumTopic I;
    public long J;
    public AnimatorSet K;
    public float L;
    public float M;
    public boolean N;
    public boolean O;
    public float P;
    public long Q;
    public float R;
    public boolean S;
    public float T;
    public final View U;
    public long V;
    public boolean W;
    public boolean X;
    public final boolean Y;
    public xg Z;
    public int f49836a;
    public long f49837a0;
    public int f49838b;
    public View f49839b0;
    public int f49840c;
    public boolean f49841c0;
    public float d;
    public final org.telegram.ui.Components.cq f49842d0;
    public final Paint f49843e;
    public final int[] f49844e0;
    public final TextPaint f49845f;
    public final int f49846f0;
    public final int f49847g0;
    public final TextPaint h;
    public final int f49848h0;
    public final long f49849i0;
    public final long f49850j0;
    public final org.telegram.ui.ActionBar.e6 f49851k0;
    public org.telegram.ui.Components.g5 f49852l0;
    public rg.b m0;
    public final Paint f49853n;
    public int f49854n0;
    public int f49855o0;
    public final Path f49856r;
    public StaticLayout f49857s;
    public StaticLayout f49858w;
    public StaticLayout f49859x;
    public int f49860y;

    public to(int i3, View view, long j10, int i10, int i11, long j11, org.telegram.ui.ActionBar.e6 e6Var) {
        Paint paint = new Paint(1);
        this.f49843e = paint;
        TextPaint textPaint = new TextPaint(1);
        this.f49845f = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.h = textPaint2;
        Paint paint2 = new Paint(1);
        this.f49853n = paint2;
        this.f49856r = new Path();
        this.J = 0L;
        this.f49841c0 = true;
        org.telegram.ui.Components.cq cqVar = new org.telegram.ui.Components.cq(null, true, null);
        this.f49842d0 = cqVar;
        this.f49844e0 = new int[3];
        this.U = view;
        this.f49846f0 = i3;
        this.f49850j0 = j10;
        this.f49847g0 = i10;
        this.f49848h0 = i11;
        this.f49849i0 = j11;
        this.Y = org.telegram.messenger.hp.s1(i3).t2(j10);
        this.f49851k0 = e6Var;
        this.G = new ImageReceiver(view);
        paint.setStrokeWidth(org.telegram.messenger.g0.N(2.8f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        cqVar.f32818z = 3;
        cqVar.I = 1;
        cqVar.f32801g = true;
        cqVar.d = d("paintChatActionBackground");
        cqVar.f32799e = textPaint;
        textPaint.setTextSize(org.telegram.messenger.g0.L(13.0f));
        textPaint.setTypeface(org.telegram.messenger.g0.o());
        textPaint2.setTextSize(org.telegram.messenger.g0.L(14.0f));
        paint2.setColor(-16777216);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }

    public static TLRPC.Dialog c(long j10, int i3, int i10, boolean z10, int[] iArr) {
        ArrayList W0;
        TLRPC.Dialog c2;
        TLRPC.Dialog c10;
        org.telegram.messenger.hp s12 = org.telegram.messenger.hp.s1(org.telegram.messenger.c.a(org.telegram.messenger.h10.f22829t0).f21919a);
        SparseArray sparseArray = s12.f23149w;
        if (iArr != null) {
            iArr[0] = 0;
            iArr[1] = i3;
            iArr[2] = i10;
        }
        if (i10 != 0) {
            org.telegram.messenger.mo moVar = (org.telegram.messenger.mo) s12.T0.get(i10);
            if (moVar != null) {
                W0 = moVar.f24245k;
            } else {
                return null;
            }
        } else {
            W0 = s12.W0(i3);
        }
        if (W0 != null) {
            for (int i11 = 0; i11 < W0.size(); i11++) {
                TLRPC.Dialog dialog = (TLRPC.Dialog) W0.get(i11);
                TLRPC.Chat M0 = s12.M0(Long.valueOf(-dialog.f27005id));
                if (M0 != null && dialog.f27005id != j10 && dialog.unread_count > 0 && org.telegram.messenger.m5.y(dialog) && !M0.megagroup && !s12.C2(dialog.f27005id, false) && s12.F1(M0.restriction_reason) == null) {
                    return dialog;
                }
            }
            if (z10) {
                if (i10 != 0) {
                    for (int i12 = 0; i12 < s12.Q0.size(); i12++) {
                        int i13 = ((org.telegram.messenger.mo) s12.Q0.get(i12)).f24237a;
                        if (i10 != i13 && (c10 = c(j10, i3, i13, false, iArr)) != null) {
                            if (iArr != null) {
                                iArr[0] = 1;
                            }
                            return c10;
                        }
                    }
                }
                for (int i14 = 0; i14 < sparseArray.size(); i14++) {
                    int keyAt = sparseArray.keyAt(i14);
                    if (i3 != keyAt && (c2 = c(j10, keyAt, 0, false, iArr)) != null) {
                        if (iArr != null) {
                            iArr[0] = 1;
                        }
                        return c2;
                    }
                }
                return null;
            }
            return null;
        }
        return null;
    }

    public final void a(android.graphics.Canvas r43, org.telegram.ui.wi r44, float r45, float r46) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.to.a(android.graphics.Canvas, org.telegram.ui.wi, float, float):void");
    }

    public final void b(Canvas canvas, int i3, int i10) {
        int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Ll, this.f49851k0);
        TextPaint textPaint = this.h;
        textPaint.setColor(w02);
        Paint d = d("paintChatComposeBackground");
        int alpha = d.getAlpha();
        int alpha2 = textPaint.getAlpha();
        d.setAlpha((int) (alpha * this.T));
        if (this.f49858w != null) {
            float f10 = this.L;
            if (f10 < 1.0f) {
                textPaint.setAlpha((int) ((1.0f - f10) * alpha2 * this.T));
                float height = ((((i10 - i3) - this.f49858w.getHeight()) / 2.0f) + i3) - (org.telegram.messenger.g0.L(10.0f) * this.L);
                canvas.save();
                canvas.translate((this.f49840c - this.E) / 2.0f, height);
                this.f49858w.draw(canvas);
                canvas.restore();
            }
        }
        if (this.f49859x != null) {
            float f11 = this.L;
            if (f11 > 0.0f) {
                textPaint.setAlpha((int) (alpha2 * f11 * this.T));
                float L = ((1.0f - this.L) * org.telegram.messenger.g0.L(10.0f)) + (((i10 - i3) - this.f49859x.getHeight()) / 2.0f) + i3;
                canvas.save();
                canvas.translate((this.f49840c - this.F) / 2.0f, L);
                this.f49859x.draw(canvas);
                canvas.restore();
            }
        }
        textPaint.setAlpha(alpha2);
        d.setAlpha(alpha);
    }

    public final Paint d(String str) {
        Paint paint;
        org.telegram.ui.ActionBar.e6 e6Var = this.f49851k0;
        if (e6Var != null) {
            paint = e6Var.d(str);
        } else {
            paint = null;
        }
        if (paint != null) {
            return paint;
        }
        return org.telegram.ui.ActionBar.k6.V0(str);
    }

    @Override
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        TLRPC.Dialog dialog;
        if (this.f49837a0 != 0 && (dialog = (TLRPC.Dialog) org.telegram.messenger.hp.s1(this.f49846f0).R.f(this.f49837a0)) != null) {
            int i11 = dialog.unread_count;
            boolean z10 = true;
            this.f49842d0.c(i11, true);
            if (i11 <= 0) {
                z10 = false;
            }
            this.f49841c0 = z10;
            View view = this.f49839b0;
            if (view != null) {
                view.invalidate();
            }
        }
    }

    public final void e(final View view, boolean z10) {
        AnimatorSet animatorSet = this.K;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
            this.K.cancel();
        }
        if (z10) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.L, 1.0f);
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                public final to f49250b;

                {
                    this.f49250b = this;
                }

                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    switch (r3) {
                        case 0:
                            to toVar = this.f49250b;
                            toVar.getClass();
                            toVar.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            view.invalidate();
                            toVar.U.invalidate();
                            return;
                        case 1:
                            to toVar2 = this.f49250b;
                            toVar2.getClass();
                            toVar2.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            view.invalidate();
                            return;
                        case 2:
                            to toVar3 = this.f49250b;
                            toVar3.getClass();
                            toVar3.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            view.invalidate();
                            return;
                        case 3:
                            to toVar4 = this.f49250b;
                            toVar4.getClass();
                            toVar4.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            view.invalidate();
                            return;
                        default:
                            to toVar5 = this.f49250b;
                            toVar5.getClass();
                            toVar5.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            toVar5.U.invalidate();
                            view.invalidate();
                            return;
                    }
                }
            });
            ofFloat.setInterpolator(org.telegram.ui.Components.xq.h);
            ofFloat.setDuration(250L);
            this.M = 0.0f;
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                public final to f49250b;

                {
                    this.f49250b = this;
                }

                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    switch (r3) {
                        case 0:
                            to toVar = this.f49250b;
                            toVar.getClass();
                            toVar.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            view.invalidate();
                            toVar.U.invalidate();
                            return;
                        case 1:
                            to toVar2 = this.f49250b;
                            toVar2.getClass();
                            toVar2.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            view.invalidate();
                            return;
                        case 2:
                            to toVar3 = this.f49250b;
                            toVar3.getClass();
                            toVar3.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            view.invalidate();
                            return;
                        case 3:
                            to toVar4 = this.f49250b;
                            toVar4.getClass();
                            toVar4.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            view.invalidate();
                            return;
                        default:
                            to toVar5 = this.f49250b;
                            toVar5.getClass();
                            toVar5.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            toVar5.U.invalidate();
                            view.invalidate();
                            return;
                    }
                }
            });
            org.telegram.ui.Components.xq xqVar = org.telegram.ui.Components.xq.f40455j;
            ofFloat2.setInterpolator(xqVar);
            ofFloat2.setDuration(180L);
            ValueAnimator ofFloat3 = ValueAnimator.ofFloat(1.0f, -0.5f);
            ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                public final to f49250b;

                {
                    this.f49250b = this;
                }

                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    switch (r3) {
                        case 0:
                            to toVar = this.f49250b;
                            toVar.getClass();
                            toVar.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            view.invalidate();
                            toVar.U.invalidate();
                            return;
                        case 1:
                            to toVar2 = this.f49250b;
                            toVar2.getClass();
                            toVar2.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            view.invalidate();
                            return;
                        case 2:
                            to toVar3 = this.f49250b;
                            toVar3.getClass();
                            toVar3.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            view.invalidate();
                            return;
                        case 3:
                            to toVar4 = this.f49250b;
                            toVar4.getClass();
                            toVar4.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            view.invalidate();
                            return;
                        default:
                            to toVar5 = this.f49250b;
                            toVar5.getClass();
                            toVar5.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            toVar5.U.invalidate();
                            view.invalidate();
                            return;
                    }
                }
            });
            ofFloat3.setInterpolator(xqVar);
            ofFloat3.setDuration(120L);
            ValueAnimator ofFloat4 = ValueAnimator.ofFloat(-0.5f, 0.0f);
            ofFloat4.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                public final to f49250b;

                {
                    this.f49250b = this;
                }

                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    switch (r3) {
                        case 0:
                            to toVar = this.f49250b;
                            toVar.getClass();
                            toVar.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            view.invalidate();
                            toVar.U.invalidate();
                            return;
                        case 1:
                            to toVar2 = this.f49250b;
                            toVar2.getClass();
                            toVar2.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            view.invalidate();
                            return;
                        case 2:
                            to toVar3 = this.f49250b;
                            toVar3.getClass();
                            toVar3.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            view.invalidate();
                            return;
                        case 3:
                            to toVar4 = this.f49250b;
                            toVar4.getClass();
                            toVar4.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            view.invalidate();
                            return;
                        default:
                            to toVar5 = this.f49250b;
                            toVar5.getClass();
                            toVar5.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            toVar5.U.invalidate();
                            view.invalidate();
                            return;
                    }
                }
            });
            ofFloat4.setInterpolator(xqVar);
            ofFloat4.setDuration(100L);
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.K = animatorSet2;
            animatorSet2.addListener(new bh.j(17, this, view));
            AnimatorSet animatorSet3 = new AnimatorSet();
            animatorSet3.playSequentially(ofFloat2, ofFloat3, ofFloat4);
            this.K.playTogether(ofFloat, animatorSet3);
            this.K.start();
            return;
        }
        ValueAnimator ofFloat5 = ValueAnimator.ofFloat(this.L, 0.0f);
        ofFloat5.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
            public final to f49250b;

            {
                this.f49250b = this;
            }

            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (r3) {
                    case 0:
                        to toVar = this.f49250b;
                        toVar.getClass();
                        toVar.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        view.invalidate();
                        toVar.U.invalidate();
                        return;
                    case 1:
                        to toVar2 = this.f49250b;
                        toVar2.getClass();
                        toVar2.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        view.invalidate();
                        return;
                    case 2:
                        to toVar3 = this.f49250b;
                        toVar3.getClass();
                        toVar3.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        view.invalidate();
                        return;
                    case 3:
                        to toVar4 = this.f49250b;
                        toVar4.getClass();
                        toVar4.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        view.invalidate();
                        return;
                    default:
                        to toVar5 = this.f49250b;
                        toVar5.getClass();
                        toVar5.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        toVar5.U.invalidate();
                        view.invalidate();
                        return;
                }
            }
        });
        ofFloat5.setInterpolator(org.telegram.ui.Components.xq.f40452f);
        ofFloat5.setDuration(220L);
        AnimatorSet animatorSet4 = new AnimatorSet();
        this.K = animatorSet4;
        animatorSet4.playTogether(ofFloat5);
        this.K.start();
    }

    public final void f() {
        boolean z10;
        boolean z11 = false;
        this.W = false;
        this.I = null;
        TLRPC.Dialog c2 = c(this.f49850j0, this.f49847g0, this.f49848h0, true, this.f49844e0);
        if (c2 != null) {
            this.f49837a0 = c2.f27005id;
            int[] iArr = this.f49844e0;
            if (iArr[0] == 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.X = z10;
            this.f49836a = iArr[1];
            this.f49838b = iArr[2];
            this.S = false;
            int i3 = this.f49846f0;
            TLRPC.Chat M0 = org.telegram.messenger.hp.s1(i3).M0(Long.valueOf(-c2.f27005id));
            this.H = M0;
            if (M0 == null) {
                this.H = org.telegram.messenger.hp.s1(i3).M0(Long.valueOf(c2.f27005id));
            }
            org.telegram.ui.Components.u8 u8Var = new org.telegram.ui.Components.u8((org.telegram.ui.ActionBar.e6) null);
            u8Var.q(this.H);
            this.G.q0(org.telegram.messenger.ac.a(1, this.H), "50_50", u8Var, null, org.telegram.messenger.h10.i(0).f(), 0);
            org.telegram.messenger.hp.s1(i3).s0(c2.f27005id, 0, null);
            int i10 = c2.unread_count;
            this.f49842d0.c(i10, false);
            if (i10 > 0) {
                z11 = true;
            }
            this.f49841c0 = z11;
            return;
        }
        this.H = null;
        this.X = false;
        this.S = true;
    }

    public final void g(TLRPC.Chat chat) {
        boolean z10;
        int i3;
        if (chat == null) {
            f();
            return;
        }
        this.f49837a0 = -chat.f27001id;
        int[] iArr = this.f49844e0;
        boolean z11 = false;
        if (iArr[0] == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.X = z10;
        this.f49836a = iArr[1];
        this.f49838b = iArr[2];
        this.S = false;
        this.H = chat;
        org.telegram.ui.Components.u8 u8Var = new org.telegram.ui.Components.u8((org.telegram.ui.ActionBar.e6) null);
        u8Var.q(this.H);
        this.G.q0(org.telegram.messenger.ac.a(1, this.H), "50_50", u8Var, null, org.telegram.messenger.h10.i(0).f(), 0);
        int i10 = this.f49846f0;
        org.telegram.messenger.hp.s1(i10).s0(-chat.f27001id, 0, null);
        TLRPC.Dialog S0 = org.telegram.messenger.hp.s1(i10).S0(-chat.f27001id);
        if (S0 == null) {
            i3 = 0;
        } else {
            i3 = S0.unread_count;
        }
        this.f49842d0.c(i3, false);
        if (i3 > 0) {
            z11 = true;
        }
        this.f49841c0 = z11;
        this.W = true;
        this.I = null;
    }

    public final void h() {
        TLRPC.TL_forumTopic tL_forumTopic;
        org.telegram.ui.Components.g5 g5Var;
        View view;
        View view2;
        org.telegram.ui.Components.g5 g5Var2;
        TLRPC.Message message;
        TLRPC.Message message2;
        boolean z10 = false;
        this.W = false;
        this.X = false;
        rg.b bVar = null;
        this.H = null;
        this.f49837a0 = 0L;
        ImageReceiver imageReceiver = this.G;
        imageReceiver.f();
        int i3 = this.f49846f0;
        ArrayList l10 = org.telegram.messenger.hp.s1(i3).f23102q7.l(-this.f49850j0);
        if (l10 != null && l10.size() > 1) {
            tL_forumTopic = null;
            for (int i10 = 0; i10 < l10.size(); i10++) {
                TLRPC.TL_forumTopic tL_forumTopic2 = (TLRPC.TL_forumTopic) l10.get(i10);
                if (tL_forumTopic2.f27053id != this.f49849i0 && !tL_forumTopic2.hidden && tL_forumTopic2.unread_count > 0 && (tL_forumTopic == null || ((message = tL_forumTopic2.topMessage) != null && (message2 = tL_forumTopic.topMessage) != null && message.date > message2.date))) {
                    tL_forumTopic = tL_forumTopic2;
                }
            }
        } else {
            tL_forumTopic = null;
        }
        if (tL_forumTopic != null) {
            this.S = false;
            this.I = tL_forumTopic;
            int i11 = tL_forumTopic.f27053id;
            org.telegram.ui.ActionBar.e6 e6Var = this.f49851k0;
            if (i11 == 1) {
                View view3 = this.f49839b0;
                if (view3 != null && (g5Var2 = this.f49852l0) != null) {
                    g5Var2.n(view3);
                }
                this.f49852l0 = null;
                Context context = this.U.getContext();
                int i12 = org.telegram.ui.ActionBar.k6.f28088od;
                rg.b c2 = rg.c.c(context, 1.0f, org.telegram.ui.ActionBar.k6.w0(i12, e6Var), true);
                if (c2 != null) {
                    bVar = c2;
                }
                this.m0 = bVar;
                this.f49854n0 = org.telegram.ui.ActionBar.k6.w0(i12, e6Var);
                imageReceiver.w0(c2);
            } else if (tL_forumTopic.icon_emoji_id != 0) {
                org.telegram.ui.Components.g5 g5Var3 = this.f49852l0;
                if (g5Var3 == null || g5Var3.h() != tL_forumTopic.icon_emoji_id) {
                    org.telegram.ui.Components.g5 g5Var4 = this.f49852l0;
                    if (g5Var4 != null && (view = this.f49839b0) != null) {
                        g5Var4.n(view);
                    }
                    org.telegram.ui.Components.g5 g5Var5 = new org.telegram.ui.Components.g5(22, i3, tL_forumTopic.icon_emoji_id);
                    this.f49852l0 = g5Var5;
                    int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Wc, e6Var);
                    this.f49855o0 = w02;
                    g5Var5.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
                }
                org.telegram.ui.Components.g5 g5Var6 = this.f49852l0;
                if (g5Var6 != null && (view2 = this.f49839b0) != null) {
                    g5Var6.a(view2);
                }
                imageReceiver.w0(null);
            } else {
                View view4 = this.f49839b0;
                if (view4 != null && (g5Var = this.f49852l0) != null) {
                    g5Var.n(view4);
                }
                this.f49852l0 = null;
                imageReceiver.w0(rg.c.e(tL_forumTopic));
            }
            int i13 = tL_forumTopic.unread_count;
            this.f49842d0.c(i13, false);
            if (i13 > 0) {
                z10 = true;
            }
            this.f49841c0 = z10;
            return;
        }
        this.I = null;
        this.S = true;
    }
}
