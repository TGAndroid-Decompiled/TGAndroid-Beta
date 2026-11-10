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
public final class xo implements org.telegram.messenger.ls {
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
    public dh Y;
    public long Z;
    public int f51753a;
    public View f51754a0;
    public int f51755b;
    public boolean f51756b0;
    public int f51757c;
    public final org.telegram.ui.Components.bq f51758c0;
    public float d;
    public final int[] f51759d0;
    public final Paint f51760e;
    public final int f51761e0;
    public final TextPaint f51762f;
    public final int f51763f0;
    public final int f51764g0;
    public final TextPaint h;
    public final long f51765h0;
    public final long f51766i0;
    public final org.telegram.ui.ActionBar.h6 f51767j0;
    public org.telegram.ui.Components.h5 f51768k0;
    public qg.c f51769l0;
    public int m0;
    public final Paint f51770n;
    public int f51771n0;
    public final Path f51772r;
    public StaticLayout f51773s;
    public StaticLayout f51774w;
    public StaticLayout f51775x;
    public int f51776y;

    public xo(int i7, View view, long j3, int i10, int i11, long j10, org.telegram.ui.ActionBar.h6 h6Var) {
        Paint paint = new Paint(1);
        this.f51760e = paint;
        TextPaint textPaint = new TextPaint(1);
        this.f51762f = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.h = textPaint2;
        Paint paint2 = new Paint(1);
        this.f51770n = paint2;
        this.f51772r = new Path();
        this.I = 0L;
        this.f51756b0 = true;
        org.telegram.ui.Components.bq bqVar = new org.telegram.ui.Components.bq(null, true, null);
        this.f51758c0 = bqVar;
        this.f51759d0 = new int[3];
        this.T = view;
        this.f51761e0 = i7;
        this.f51766i0 = j3;
        this.f51763f0 = i10;
        this.f51764g0 = i11;
        this.f51765h0 = j10;
        this.X = org.telegram.messenger.qp.s1(i7).t2(j3);
        this.f51767j0 = h6Var;
        this.F = new ImageReceiver(view);
        paint.setStrokeWidth(org.telegram.messenger.g0.N(2.8f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        bqVar.f32343z = 3;
        bqVar.I = 1;
        bqVar.f32326g = true;
        bqVar.d = d("paintChatActionBackground");
        bqVar.f32324e = textPaint;
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
        org.telegram.messenger.qp s12 = org.telegram.messenger.qp.s1(org.telegram.messenger.c.a(org.telegram.messenger.p10.f24474s0).f21770a);
        SparseArray sparseArray = s12.f24928w;
        if (iArr != null) {
            iArr[0] = 0;
            iArr[1] = i7;
            iArr[2] = i10;
        }
        if (i10 != 0) {
            org.telegram.messenger.vo voVar = (org.telegram.messenger.vo) s12.S0.get(i10);
            if (voVar != null) {
                W0 = voVar.f26082k;
            } else {
                return null;
            }
        } else {
            W0 = s12.W0(i7);
        }
        if (W0 != null) {
            for (int i11 = 0; i11 < W0.size(); i11++) {
                TLRPC.Dialog dialog = (TLRPC.Dialog) W0.get(i11);
                TLRPC.Chat M0 = s12.M0(Long.valueOf(-dialog.f26964id));
                if (M0 != null && dialog.f26964id != j3 && dialog.unread_count > 0 && org.telegram.messenger.m5.y(dialog) && !M0.megagroup && !s12.C2(dialog.f26964id, false) && s12.F1(M0.restriction_reason) == null) {
                    return dialog;
                }
            }
            if (z9) {
                if (i10 != 0) {
                    for (int i12 = 0; i12 < s12.P0.size(); i12++) {
                        int i13 = ((org.telegram.messenger.vo) s12.P0.get(i12)).f26074a;
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

    public final void a(android.graphics.Canvas r43, org.telegram.ui.cj r44, float r45, float r46) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.xo.a(android.graphics.Canvas, org.telegram.ui.cj, float, float):void");
    }

    public final void b(Canvas canvas, int i7, int i10) {
        int w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Ll, this.f51767j0);
        TextPaint textPaint = this.h;
        textPaint.setColor(w02);
        Paint d = d("paintChatComposeBackground");
        int alpha = d.getAlpha();
        int alpha2 = textPaint.getAlpha();
        d.setAlpha((int) (alpha * this.S));
        if (this.f51774w != null) {
            float f10 = this.K;
            if (f10 < 1.0f) {
                textPaint.setAlpha((int) ((1.0f - f10) * alpha2 * this.S));
                float height = ((((i10 - i7) - this.f51774w.getHeight()) / 2.0f) + i7) - (org.telegram.messenger.g0.L(10.0f) * this.K);
                canvas.save();
                canvas.translate((this.f51757c - this.D) / 2.0f, height);
                this.f51774w.draw(canvas);
                canvas.restore();
            }
        }
        if (this.f51775x != null) {
            float f11 = this.K;
            if (f11 > 0.0f) {
                textPaint.setAlpha((int) (alpha2 * f11 * this.S));
                float L = ((1.0f - this.K) * org.telegram.messenger.g0.L(10.0f)) + (((i10 - i7) - this.f51775x.getHeight()) / 2.0f) + i7;
                canvas.save();
                canvas.translate((this.f51757c - this.E) / 2.0f, L);
                this.f51775x.draw(canvas);
                canvas.restore();
            }
        }
        textPaint.setAlpha(alpha2);
        d.setAlpha(alpha);
    }

    public final Paint d(String str) {
        Paint paint;
        org.telegram.ui.ActionBar.h6 h6Var = this.f51767j0;
        if (h6Var != null) {
            paint = h6Var.d(str);
        } else {
            paint = null;
        }
        if (paint != null) {
            return paint;
        }
        return org.telegram.ui.ActionBar.m6.V0(str);
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        TLRPC.Dialog dialog;
        if (this.Z != 0 && (dialog = (TLRPC.Dialog) org.telegram.messenger.qp.s1(this.f51761e0).Q.f(this.Z)) != null) {
            int i11 = dialog.unread_count;
            boolean z9 = true;
            this.f51758c0.c(i11, true);
            if (i11 <= 0) {
                z9 = false;
            }
            this.f51756b0 = z9;
            View view = this.f51754a0;
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
                public final xo f50766b;

                {
                    this.f50766b = this;
                }

                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    switch (r3) {
                        case 0:
                            xo xoVar = this.f50766b;
                            xoVar.getClass();
                            xoVar.K = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            view.invalidate();
                            xoVar.T.invalidate();
                            return;
                        case 1:
                            xo xoVar2 = this.f50766b;
                            xoVar2.getClass();
                            xoVar2.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            view.invalidate();
                            return;
                        case 2:
                            xo xoVar3 = this.f50766b;
                            xoVar3.getClass();
                            xoVar3.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            view.invalidate();
                            return;
                        case 3:
                            xo xoVar4 = this.f50766b;
                            xoVar4.getClass();
                            xoVar4.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            view.invalidate();
                            return;
                        default:
                            xo xoVar5 = this.f50766b;
                            xoVar5.getClass();
                            xoVar5.K = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            xoVar5.T.invalidate();
                            view.invalidate();
                            return;
                    }
                }
            });
            ofFloat.setInterpolator(org.telegram.ui.Components.wq.h);
            ofFloat.setDuration(250L);
            this.L = 0.0f;
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                public final xo f50766b;

                {
                    this.f50766b = this;
                }

                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    switch (r3) {
                        case 0:
                            xo xoVar = this.f50766b;
                            xoVar.getClass();
                            xoVar.K = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            view.invalidate();
                            xoVar.T.invalidate();
                            return;
                        case 1:
                            xo xoVar2 = this.f50766b;
                            xoVar2.getClass();
                            xoVar2.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            view.invalidate();
                            return;
                        case 2:
                            xo xoVar3 = this.f50766b;
                            xoVar3.getClass();
                            xoVar3.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            view.invalidate();
                            return;
                        case 3:
                            xo xoVar4 = this.f50766b;
                            xoVar4.getClass();
                            xoVar4.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            view.invalidate();
                            return;
                        default:
                            xo xoVar5 = this.f50766b;
                            xoVar5.getClass();
                            xoVar5.K = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            xoVar5.T.invalidate();
                            view.invalidate();
                            return;
                    }
                }
            });
            org.telegram.ui.Components.wq wqVar = org.telegram.ui.Components.wq.f40049j;
            ofFloat2.setInterpolator(wqVar);
            ofFloat2.setDuration(180L);
            ValueAnimator ofFloat3 = ValueAnimator.ofFloat(1.0f, -0.5f);
            ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                public final xo f50766b;

                {
                    this.f50766b = this;
                }

                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    switch (r3) {
                        case 0:
                            xo xoVar = this.f50766b;
                            xoVar.getClass();
                            xoVar.K = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            view.invalidate();
                            xoVar.T.invalidate();
                            return;
                        case 1:
                            xo xoVar2 = this.f50766b;
                            xoVar2.getClass();
                            xoVar2.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            view.invalidate();
                            return;
                        case 2:
                            xo xoVar3 = this.f50766b;
                            xoVar3.getClass();
                            xoVar3.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            view.invalidate();
                            return;
                        case 3:
                            xo xoVar4 = this.f50766b;
                            xoVar4.getClass();
                            xoVar4.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            view.invalidate();
                            return;
                        default:
                            xo xoVar5 = this.f50766b;
                            xoVar5.getClass();
                            xoVar5.K = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            xoVar5.T.invalidate();
                            view.invalidate();
                            return;
                    }
                }
            });
            ofFloat3.setInterpolator(wqVar);
            ofFloat3.setDuration(120L);
            ValueAnimator ofFloat4 = ValueAnimator.ofFloat(-0.5f, 0.0f);
            ofFloat4.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                public final xo f50766b;

                {
                    this.f50766b = this;
                }

                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    switch (r3) {
                        case 0:
                            xo xoVar = this.f50766b;
                            xoVar.getClass();
                            xoVar.K = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            view.invalidate();
                            xoVar.T.invalidate();
                            return;
                        case 1:
                            xo xoVar2 = this.f50766b;
                            xoVar2.getClass();
                            xoVar2.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            view.invalidate();
                            return;
                        case 2:
                            xo xoVar3 = this.f50766b;
                            xoVar3.getClass();
                            xoVar3.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            view.invalidate();
                            return;
                        case 3:
                            xo xoVar4 = this.f50766b;
                            xoVar4.getClass();
                            xoVar4.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            view.invalidate();
                            return;
                        default:
                            xo xoVar5 = this.f50766b;
                            xoVar5.getClass();
                            xoVar5.K = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            xoVar5.T.invalidate();
                            view.invalidate();
                            return;
                    }
                }
            });
            ofFloat4.setInterpolator(wqVar);
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
            public final xo f50766b;

            {
                this.f50766b = this;
            }

            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (r3) {
                    case 0:
                        xo xoVar = this.f50766b;
                        xoVar.getClass();
                        xoVar.K = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        view.invalidate();
                        xoVar.T.invalidate();
                        return;
                    case 1:
                        xo xoVar2 = this.f50766b;
                        xoVar2.getClass();
                        xoVar2.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        view.invalidate();
                        return;
                    case 2:
                        xo xoVar3 = this.f50766b;
                        xoVar3.getClass();
                        xoVar3.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        view.invalidate();
                        return;
                    case 3:
                        xo xoVar4 = this.f50766b;
                        xoVar4.getClass();
                        xoVar4.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        view.invalidate();
                        return;
                    default:
                        xo xoVar5 = this.f50766b;
                        xoVar5.getClass();
                        xoVar5.K = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        xoVar5.T.invalidate();
                        view.invalidate();
                        return;
                }
            }
        });
        ofFloat5.setInterpolator(org.telegram.ui.Components.wq.f40046f);
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
        TLRPC.Dialog c10 = c(this.f51766i0, this.f51763f0, this.f51764g0, true, this.f51759d0);
        if (c10 != null) {
            this.Z = c10.f26964id;
            int[] iArr = this.f51759d0;
            if (iArr[0] == 1) {
                z9 = true;
            } else {
                z9 = false;
            }
            this.W = z9;
            this.f51753a = iArr[1];
            this.f51755b = iArr[2];
            this.R = false;
            int i7 = this.f51761e0;
            TLRPC.Chat M0 = org.telegram.messenger.qp.s1(i7).M0(Long.valueOf(-c10.f26964id));
            this.G = M0;
            if (M0 == null) {
                this.G = org.telegram.messenger.qp.s1(i7).M0(Long.valueOf(c10.f26964id));
            }
            org.telegram.ui.Components.v8 v8Var = new org.telegram.ui.Components.v8((org.telegram.ui.ActionBar.h6) null);
            v8Var.q(this.G);
            this.F.q0(org.telegram.messenger.hc.a(1, this.G), "50_50", v8Var, null, org.telegram.messenger.p10.i(0).f(), 0);
            org.telegram.messenger.qp.s1(i7).s0(c10.f26964id, 0, null);
            int i10 = c10.unread_count;
            this.f51758c0.c(i10, false);
            if (i10 > 0) {
                z10 = true;
            }
            this.f51756b0 = z10;
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
        this.Z = -chat.f26960id;
        int[] iArr = this.f51759d0;
        boolean z10 = false;
        if (iArr[0] == 1) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.W = z9;
        this.f51753a = iArr[1];
        this.f51755b = iArr[2];
        this.R = false;
        this.G = chat;
        org.telegram.ui.Components.v8 v8Var = new org.telegram.ui.Components.v8((org.telegram.ui.ActionBar.h6) null);
        v8Var.q(this.G);
        this.F.q0(org.telegram.messenger.hc.a(1, this.G), "50_50", v8Var, null, org.telegram.messenger.p10.i(0).f(), 0);
        int i10 = this.f51761e0;
        org.telegram.messenger.qp.s1(i10).s0(-chat.f26960id, 0, null);
        TLRPC.Dialog S0 = org.telegram.messenger.qp.s1(i10).S0(-chat.f26960id);
        if (S0 == null) {
            i7 = 0;
        } else {
            i7 = S0.unread_count;
        }
        this.f51758c0.c(i7, false);
        if (i7 > 0) {
            z10 = true;
        }
        this.f51756b0 = z10;
        this.V = true;
        this.H = null;
    }

    public final void h() {
        TLRPC.TL_forumTopic tL_forumTopic;
        org.telegram.ui.Components.h5 h5Var;
        View view;
        View view2;
        org.telegram.ui.Components.h5 h5Var2;
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
        int i7 = this.f51761e0;
        ArrayList l10 = org.telegram.messenger.qp.s1(i7).f24881q7.l(-this.f51766i0);
        if (l10 != null && l10.size() > 1) {
            tL_forumTopic = null;
            for (int i10 = 0; i10 < l10.size(); i10++) {
                TLRPC.TL_forumTopic tL_forumTopic2 = (TLRPC.TL_forumTopic) l10.get(i10);
                if (tL_forumTopic2.f27012id != this.f51765h0 && !tL_forumTopic2.hidden && tL_forumTopic2.unread_count > 0 && (tL_forumTopic == null || ((message = tL_forumTopic2.topMessage) != null && (message2 = tL_forumTopic.topMessage) != null && message.date > message2.date))) {
                    tL_forumTopic = tL_forumTopic2;
                }
            }
        } else {
            tL_forumTopic = null;
        }
        if (tL_forumTopic != null) {
            this.R = false;
            this.H = tL_forumTopic;
            int i11 = tL_forumTopic.f27012id;
            org.telegram.ui.ActionBar.h6 h6Var = this.f51767j0;
            if (i11 == 1) {
                View view3 = this.f51754a0;
                if (view3 != null && (h5Var2 = this.f51768k0) != null) {
                    h5Var2.n(view3);
                }
                this.f51768k0 = null;
                Context context = this.T.getContext();
                int i12 = org.telegram.ui.ActionBar.m6.f28097od;
                qg.c c10 = qg.d.c(context, 1.0f, org.telegram.ui.ActionBar.m6.w0(i12, h6Var), true);
                if (c10 != null) {
                    cVar = c10;
                }
                this.f51769l0 = cVar;
                this.m0 = org.telegram.ui.ActionBar.m6.w0(i12, h6Var);
                imageReceiver.w0(c10);
            } else if (tL_forumTopic.icon_emoji_id != 0) {
                org.telegram.ui.Components.h5 h5Var3 = this.f51768k0;
                if (h5Var3 == null || h5Var3.h() != tL_forumTopic.icon_emoji_id) {
                    org.telegram.ui.Components.h5 h5Var4 = this.f51768k0;
                    if (h5Var4 != null && (view = this.f51754a0) != null) {
                        h5Var4.n(view);
                    }
                    org.telegram.ui.Components.h5 h5Var5 = new org.telegram.ui.Components.h5(22, i7, tL_forumTopic.icon_emoji_id);
                    this.f51768k0 = h5Var5;
                    int w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Wc, h6Var);
                    this.f51771n0 = w02;
                    h5Var5.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
                }
                org.telegram.ui.Components.h5 h5Var6 = this.f51768k0;
                if (h5Var6 != null && (view2 = this.f51754a0) != null) {
                    h5Var6.a(view2);
                }
                imageReceiver.w0(null);
            } else {
                View view4 = this.f51754a0;
                if (view4 != null && (h5Var = this.f51768k0) != null) {
                    h5Var.n(view4);
                }
                this.f51768k0 = null;
                imageReceiver.w0(qg.d.e(tL_forumTopic));
            }
            int i13 = tL_forumTopic.unread_count;
            this.f51758c0.c(i13, false);
            if (i13 > 0) {
                z9 = true;
            }
            this.f51756b0 = z9;
            return;
        }
        this.H = null;
        this.R = true;
    }
}
