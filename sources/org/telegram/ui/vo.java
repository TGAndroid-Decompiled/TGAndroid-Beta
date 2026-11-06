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
public final class vo implements org.telegram.messenger.ls {
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
    public bh Y;
    public long Z;
    public int f50756a;
    public View f50757a0;
    public int f50758b;
    public boolean f50759b0;
    public int f50760c;
    public final org.telegram.ui.Components.bq f50761c0;
    public float d;
    public final int[] f50762d0;
    public final Paint f50763e;
    public final int f50764e0;
    public final TextPaint f50765f;
    public final int f50766f0;
    public final int f50767g0;
    public final TextPaint h;
    public final long f50768h0;
    public final long f50769i0;
    public final org.telegram.ui.ActionBar.f6 f50770j0;
    public org.telegram.ui.Components.i5 f50771k0;
    public qg.c f50772l0;
    public int m0;
    public final Paint f50773n;
    public int f50774n0;
    public final Path f50775r;
    public StaticLayout f50776s;
    public StaticLayout f50777w;
    public StaticLayout f50778x;
    public int f50779y;

    public vo(int i7, View view, long j3, int i10, int i11, long j10, org.telegram.ui.ActionBar.f6 f6Var) {
        Paint paint = new Paint(1);
        this.f50763e = paint;
        TextPaint textPaint = new TextPaint(1);
        this.f50765f = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.h = textPaint2;
        Paint paint2 = new Paint(1);
        this.f50773n = paint2;
        this.f50775r = new Path();
        this.I = 0L;
        this.f50759b0 = true;
        org.telegram.ui.Components.bq bqVar = new org.telegram.ui.Components.bq(null, true, null);
        this.f50761c0 = bqVar;
        this.f50762d0 = new int[3];
        this.T = view;
        this.f50764e0 = i7;
        this.f50769i0 = j3;
        this.f50766f0 = i10;
        this.f50767g0 = i11;
        this.f50768h0 = j10;
        this.X = org.telegram.messenger.qp.s1(i7).t2(j3);
        this.f50770j0 = f6Var;
        this.F = new ImageReceiver(view);
        paint.setStrokeWidth(org.telegram.messenger.g0.N(2.8f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        bqVar.f32278z = 3;
        bqVar.I = 1;
        bqVar.f32261g = true;
        bqVar.d = d("paintChatActionBackground");
        bqVar.f32259e = textPaint;
        textPaint.setTextSize(org.telegram.messenger.g0.L(13.0f));
        textPaint.setTypeface(org.telegram.messenger.g0.o());
        textPaint2.setTextSize(org.telegram.messenger.g0.L(14.0f));
        paint2.setColor(-16777216);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }

    public static TLRPC.Dialog c(long j3, int i7, int i10, boolean z9, int[] iArr) {
        ArrayList W0;
        TLRPC.Dialog c10;
        TLRPC.Dialog c11;
        org.telegram.messenger.qp s12 = org.telegram.messenger.qp.s1(org.telegram.messenger.c.a(org.telegram.messenger.p10.f24459s0).f21723a);
        SparseArray sparseArray = s12.f24909w;
        if (iArr != null) {
            iArr[0] = 0;
            iArr[1] = i7;
            iArr[2] = i10;
        }
        if (i10 != 0) {
            org.telegram.messenger.vo voVar = (org.telegram.messenger.vo) s12.S0.get(i10);
            if (voVar != null) {
                W0 = voVar.f26064k;
            } else {
                return null;
            }
        } else {
            W0 = s12.W0(i7);
        }
        if (W0 != null) {
            for (int i11 = 0; i11 < W0.size(); i11++) {
                TLRPC.Dialog dialog = (TLRPC.Dialog) W0.get(i11);
                TLRPC.Chat M0 = s12.M0(Long.valueOf(-dialog.f26956id));
                if (M0 != null && dialog.f26956id != j3 && dialog.unread_count > 0 && org.telegram.messenger.m5.y(dialog) && !M0.megagroup && !s12.C2(dialog.f26956id, false) && s12.F1(M0.restriction_reason) == null) {
                    return dialog;
                }
            }
            if (z9) {
                if (i10 != 0) {
                    for (int i12 = 0; i12 < s12.P0.size(); i12++) {
                        int i13 = ((org.telegram.messenger.vo) s12.P0.get(i12)).f26056a;
                        if (i10 != i13 && (c11 = c(j3, i7, i13, false, iArr)) != null) {
                            if (iArr != null) {
                                iArr[0] = 1;
                            }
                            return c11;
                        }
                    }
                }
                for (int i14 = 0; i14 < sparseArray.size(); i14++) {
                    int keyAt = sparseArray.keyAt(i14);
                    if (i7 != keyAt && (c10 = c(j3, keyAt, 0, false, iArr)) != null) {
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

    public final void a(android.graphics.Canvas r43, org.telegram.ui.aj r44, float r45, float r46) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.vo.a(android.graphics.Canvas, org.telegram.ui.aj, float, float):void");
    }

    public final void b(Canvas canvas, int i7, int i10) {
        int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Ll, this.f50770j0);
        TextPaint textPaint = this.h;
        textPaint.setColor(w02);
        Paint d = d("paintChatComposeBackground");
        int alpha = d.getAlpha();
        int alpha2 = textPaint.getAlpha();
        d.setAlpha((int) (alpha * this.S));
        if (this.f50777w != null) {
            float f10 = this.K;
            if (f10 < 1.0f) {
                textPaint.setAlpha((int) ((1.0f - f10) * alpha2 * this.S));
                float height = ((((i10 - i7) - this.f50777w.getHeight()) / 2.0f) + i7) - (org.telegram.messenger.g0.L(10.0f) * this.K);
                canvas.save();
                canvas.translate((this.f50760c - this.D) / 2.0f, height);
                this.f50777w.draw(canvas);
                canvas.restore();
            }
        }
        if (this.f50778x != null) {
            float f11 = this.K;
            if (f11 > 0.0f) {
                textPaint.setAlpha((int) (alpha2 * f11 * this.S));
                float L = ((1.0f - this.K) * org.telegram.messenger.g0.L(10.0f)) + (((i10 - i7) - this.f50778x.getHeight()) / 2.0f) + i7;
                canvas.save();
                canvas.translate((this.f50760c - this.E) / 2.0f, L);
                this.f50778x.draw(canvas);
                canvas.restore();
            }
        }
        textPaint.setAlpha(alpha2);
        d.setAlpha(alpha);
    }

    public final Paint d(String str) {
        Paint paint;
        org.telegram.ui.ActionBar.f6 f6Var = this.f50770j0;
        if (f6Var != null) {
            paint = f6Var.d(str);
        } else {
            paint = null;
        }
        if (paint != null) {
            return paint;
        }
        return org.telegram.ui.ActionBar.k6.V0(str);
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        TLRPC.Dialog dialog;
        if (this.Z != 0 && (dialog = (TLRPC.Dialog) org.telegram.messenger.qp.s1(this.f50764e0).Q.f(this.Z)) != null) {
            int i11 = dialog.unread_count;
            boolean z9 = true;
            this.f50761c0.c(i11, true);
            if (i11 <= 0) {
                z9 = false;
            }
            this.f50759b0 = z9;
            View view = this.f50757a0;
            if (view != null) {
                view.invalidate();
            }
        }
    }

    public final void e(final View view, boolean z9) {
        AnimatorSet animatorSet = this.J;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
            this.J.cancel();
        }
        if (z9) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.K, 1.0f);
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                public final vo f50085b;

                {
                    this.f50085b = this;
                }

                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    switch (r3) {
                        case 0:
                            vo voVar = this.f50085b;
                            voVar.getClass();
                            voVar.K = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            view.invalidate();
                            voVar.T.invalidate();
                            return;
                        case 1:
                            vo voVar2 = this.f50085b;
                            voVar2.getClass();
                            voVar2.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            view.invalidate();
                            return;
                        case 2:
                            vo voVar3 = this.f50085b;
                            voVar3.getClass();
                            voVar3.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            view.invalidate();
                            return;
                        case 3:
                            vo voVar4 = this.f50085b;
                            voVar4.getClass();
                            voVar4.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            view.invalidate();
                            return;
                        default:
                            vo voVar5 = this.f50085b;
                            voVar5.getClass();
                            voVar5.K = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            voVar5.T.invalidate();
                            view.invalidate();
                            return;
                    }
                }
            });
            ofFloat.setInterpolator(org.telegram.ui.Components.xq.h);
            ofFloat.setDuration(250L);
            this.L = 0.0f;
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                public final vo f50085b;

                {
                    this.f50085b = this;
                }

                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    switch (r3) {
                        case 0:
                            vo voVar = this.f50085b;
                            voVar.getClass();
                            voVar.K = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            view.invalidate();
                            voVar.T.invalidate();
                            return;
                        case 1:
                            vo voVar2 = this.f50085b;
                            voVar2.getClass();
                            voVar2.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            view.invalidate();
                            return;
                        case 2:
                            vo voVar3 = this.f50085b;
                            voVar3.getClass();
                            voVar3.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            view.invalidate();
                            return;
                        case 3:
                            vo voVar4 = this.f50085b;
                            voVar4.getClass();
                            voVar4.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            view.invalidate();
                            return;
                        default:
                            vo voVar5 = this.f50085b;
                            voVar5.getClass();
                            voVar5.K = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            voVar5.T.invalidate();
                            view.invalidate();
                            return;
                    }
                }
            });
            org.telegram.ui.Components.xq xqVar = org.telegram.ui.Components.xq.f40313j;
            ofFloat2.setInterpolator(xqVar);
            ofFloat2.setDuration(180L);
            ValueAnimator ofFloat3 = ValueAnimator.ofFloat(1.0f, -0.5f);
            ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                public final vo f50085b;

                {
                    this.f50085b = this;
                }

                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    switch (r3) {
                        case 0:
                            vo voVar = this.f50085b;
                            voVar.getClass();
                            voVar.K = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            view.invalidate();
                            voVar.T.invalidate();
                            return;
                        case 1:
                            vo voVar2 = this.f50085b;
                            voVar2.getClass();
                            voVar2.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            view.invalidate();
                            return;
                        case 2:
                            vo voVar3 = this.f50085b;
                            voVar3.getClass();
                            voVar3.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            view.invalidate();
                            return;
                        case 3:
                            vo voVar4 = this.f50085b;
                            voVar4.getClass();
                            voVar4.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            view.invalidate();
                            return;
                        default:
                            vo voVar5 = this.f50085b;
                            voVar5.getClass();
                            voVar5.K = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            voVar5.T.invalidate();
                            view.invalidate();
                            return;
                    }
                }
            });
            ofFloat3.setInterpolator(xqVar);
            ofFloat3.setDuration(120L);
            ValueAnimator ofFloat4 = ValueAnimator.ofFloat(-0.5f, 0.0f);
            ofFloat4.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                public final vo f50085b;

                {
                    this.f50085b = this;
                }

                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    switch (r3) {
                        case 0:
                            vo voVar = this.f50085b;
                            voVar.getClass();
                            voVar.K = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            view.invalidate();
                            voVar.T.invalidate();
                            return;
                        case 1:
                            vo voVar2 = this.f50085b;
                            voVar2.getClass();
                            voVar2.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            view.invalidate();
                            return;
                        case 2:
                            vo voVar3 = this.f50085b;
                            voVar3.getClass();
                            voVar3.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            view.invalidate();
                            return;
                        case 3:
                            vo voVar4 = this.f50085b;
                            voVar4.getClass();
                            voVar4.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            view.invalidate();
                            return;
                        default:
                            vo voVar5 = this.f50085b;
                            voVar5.getClass();
                            voVar5.K = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            voVar5.T.invalidate();
                            view.invalidate();
                            return;
                    }
                }
            });
            ofFloat4.setInterpolator(xqVar);
            ofFloat4.setDuration(100L);
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.J = animatorSet2;
            animatorSet2.addListener(new ah.l(18, this, view));
            AnimatorSet animatorSet3 = new AnimatorSet();
            animatorSet3.playSequentially(ofFloat2, ofFloat3, ofFloat4);
            this.J.playTogether(ofFloat, animatorSet3);
            this.J.start();
            return;
        }
        ValueAnimator ofFloat5 = ValueAnimator.ofFloat(this.K, 0.0f);
        ofFloat5.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
            public final vo f50085b;

            {
                this.f50085b = this;
            }

            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (r3) {
                    case 0:
                        vo voVar = this.f50085b;
                        voVar.getClass();
                        voVar.K = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        view.invalidate();
                        voVar.T.invalidate();
                        return;
                    case 1:
                        vo voVar2 = this.f50085b;
                        voVar2.getClass();
                        voVar2.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        view.invalidate();
                        return;
                    case 2:
                        vo voVar3 = this.f50085b;
                        voVar3.getClass();
                        voVar3.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        view.invalidate();
                        return;
                    case 3:
                        vo voVar4 = this.f50085b;
                        voVar4.getClass();
                        voVar4.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        view.invalidate();
                        return;
                    default:
                        vo voVar5 = this.f50085b;
                        voVar5.getClass();
                        voVar5.K = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        voVar5.T.invalidate();
                        view.invalidate();
                        return;
                }
            }
        });
        ofFloat5.setInterpolator(org.telegram.ui.Components.xq.f40310f);
        ofFloat5.setDuration(220L);
        AnimatorSet animatorSet4 = new AnimatorSet();
        this.J = animatorSet4;
        animatorSet4.playTogether(ofFloat5);
        this.J.start();
    }

    public final void f() {
        boolean z9;
        boolean z10 = false;
        this.V = false;
        this.H = null;
        TLRPC.Dialog c10 = c(this.f50769i0, this.f50766f0, this.f50767g0, true, this.f50762d0);
        if (c10 != null) {
            this.Z = c10.f26956id;
            int[] iArr = this.f50762d0;
            if (iArr[0] == 1) {
                z9 = true;
            } else {
                z9 = false;
            }
            this.W = z9;
            this.f50756a = iArr[1];
            this.f50758b = iArr[2];
            this.R = false;
            int i7 = this.f50764e0;
            TLRPC.Chat M0 = org.telegram.messenger.qp.s1(i7).M0(Long.valueOf(-c10.f26956id));
            this.G = M0;
            if (M0 == null) {
                this.G = org.telegram.messenger.qp.s1(i7).M0(Long.valueOf(c10.f26956id));
            }
            org.telegram.ui.Components.w8 w8Var = new org.telegram.ui.Components.w8((org.telegram.ui.ActionBar.f6) null);
            w8Var.q(this.G);
            this.F.q0(org.telegram.messenger.hc.a(1, this.G), "50_50", w8Var, null, org.telegram.messenger.p10.i(0).f(), 0);
            org.telegram.messenger.qp.s1(i7).s0(c10.f26956id, 0, null);
            int i10 = c10.unread_count;
            this.f50761c0.c(i10, false);
            if (i10 > 0) {
                z10 = true;
            }
            this.f50759b0 = z10;
            return;
        }
        this.G = null;
        this.W = false;
        this.R = true;
    }

    public final void g(TLRPC.Chat chat) {
        boolean z9;
        int i7;
        if (chat == null) {
            f();
            return;
        }
        this.Z = -chat.f26952id;
        int[] iArr = this.f50762d0;
        boolean z10 = false;
        if (iArr[0] == 1) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.W = z9;
        this.f50756a = iArr[1];
        this.f50758b = iArr[2];
        this.R = false;
        this.G = chat;
        org.telegram.ui.Components.w8 w8Var = new org.telegram.ui.Components.w8((org.telegram.ui.ActionBar.f6) null);
        w8Var.q(this.G);
        this.F.q0(org.telegram.messenger.hc.a(1, this.G), "50_50", w8Var, null, org.telegram.messenger.p10.i(0).f(), 0);
        int i10 = this.f50764e0;
        org.telegram.messenger.qp.s1(i10).s0(-chat.f26952id, 0, null);
        TLRPC.Dialog S0 = org.telegram.messenger.qp.s1(i10).S0(-chat.f26952id);
        if (S0 == null) {
            i7 = 0;
        } else {
            i7 = S0.unread_count;
        }
        this.f50761c0.c(i7, false);
        if (i7 > 0) {
            z10 = true;
        }
        this.f50759b0 = z10;
        this.V = true;
        this.H = null;
    }

    public final void h() {
        TLRPC.TL_forumTopic tL_forumTopic;
        org.telegram.ui.Components.i5 i5Var;
        View view;
        View view2;
        org.telegram.ui.Components.i5 i5Var2;
        TLRPC.Message message;
        TLRPC.Message message2;
        boolean z9 = false;
        this.V = false;
        this.W = false;
        qg.c cVar = null;
        this.G = null;
        this.Z = 0L;
        ImageReceiver imageReceiver = this.F;
        imageReceiver.f();
        int i7 = this.f50764e0;
        ArrayList l10 = org.telegram.messenger.qp.s1(i7).f24862q7.l(-this.f50769i0);
        if (l10 != null && l10.size() > 1) {
            tL_forumTopic = null;
            for (int i10 = 0; i10 < l10.size(); i10++) {
                TLRPC.TL_forumTopic tL_forumTopic2 = (TLRPC.TL_forumTopic) l10.get(i10);
                if (tL_forumTopic2.f27004id != this.f50768h0 && !tL_forumTopic2.hidden && tL_forumTopic2.unread_count > 0 && (tL_forumTopic == null || ((message = tL_forumTopic2.topMessage) != null && (message2 = tL_forumTopic.topMessage) != null && message.date > message2.date))) {
                    tL_forumTopic = tL_forumTopic2;
                }
            }
        } else {
            tL_forumTopic = null;
        }
        if (tL_forumTopic != null) {
            this.R = false;
            this.H = tL_forumTopic;
            int i11 = tL_forumTopic.f27004id;
            org.telegram.ui.ActionBar.f6 f6Var = this.f50770j0;
            if (i11 == 1) {
                View view3 = this.f50757a0;
                if (view3 != null && (i5Var2 = this.f50771k0) != null) {
                    i5Var2.n(view3);
                }
                this.f50771k0 = null;
                Context context = this.T.getContext();
                int i12 = org.telegram.ui.ActionBar.k6.f28055od;
                qg.c c10 = qg.d.c(context, 1.0f, org.telegram.ui.ActionBar.k6.w0(i12, f6Var), true);
                if (c10 != null) {
                    cVar = c10;
                }
                this.f50772l0 = cVar;
                this.m0 = org.telegram.ui.ActionBar.k6.w0(i12, f6Var);
                imageReceiver.w0(c10);
            } else if (tL_forumTopic.icon_emoji_id != 0) {
                org.telegram.ui.Components.i5 i5Var3 = this.f50771k0;
                if (i5Var3 == null || i5Var3.h() != tL_forumTopic.icon_emoji_id) {
                    org.telegram.ui.Components.i5 i5Var4 = this.f50771k0;
                    if (i5Var4 != null && (view = this.f50757a0) != null) {
                        i5Var4.n(view);
                    }
                    org.telegram.ui.Components.i5 i5Var5 = new org.telegram.ui.Components.i5(22, i7, tL_forumTopic.icon_emoji_id);
                    this.f50771k0 = i5Var5;
                    int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Wc, f6Var);
                    this.f50774n0 = w02;
                    i5Var5.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
                }
                org.telegram.ui.Components.i5 i5Var6 = this.f50771k0;
                if (i5Var6 != null && (view2 = this.f50757a0) != null) {
                    i5Var6.a(view2);
                }
                imageReceiver.w0(null);
            } else {
                View view4 = this.f50757a0;
                if (view4 != null && (i5Var = this.f50771k0) != null) {
                    i5Var.n(view4);
                }
                this.f50771k0 = null;
                imageReceiver.w0(qg.d.e(tL_forumTopic));
            }
            int i13 = tL_forumTopic.unread_count;
            this.f50761c0.c(i13, false);
            if (i13 > 0) {
                z9 = true;
            }
            this.f50759b0 = z9;
            return;
        }
        this.H = null;
        this.R = true;
    }
}
