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
public final class xo implements org.telegram.messenger.fs {
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
    public ch Z;
    public int f54011a;
    public long f54012a0;
    public int f54013b;
    public View f54014b0;
    public int f54015c;
    public boolean f54016c0;
    public float d;
    public final org.telegram.ui.Components.pq f54017d0;
    public final Paint f54018e;
    public final int[] f54019e0;
    public final TextPaint f54020f;
    public final int f54021f0;
    public final int f54022g0;
    public final TextPaint h;
    public final int f54023h0;
    public final long f54024i0;
    public final long f54025j0;
    public final org.telegram.ui.ActionBar.i6 f54026k0;
    public org.telegram.ui.Components.o5 f54027l0;
    public qg.b m0;
    public final Paint f54028n;
    public int f54029n0;
    public int f54030o0;
    public final Path f54031r;
    public StaticLayout f54032s;
    public StaticLayout f54033w;
    public StaticLayout f54034x;
    public int f54035y;

    public xo(int i7, View view, long j3, int i10, int i11, long j10, org.telegram.ui.ActionBar.i6 i6Var) {
        Paint paint = new Paint(1);
        this.f54018e = paint;
        TextPaint textPaint = new TextPaint(1);
        this.f54020f = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.h = textPaint2;
        Paint paint2 = new Paint(1);
        this.f54028n = paint2;
        this.f54031r = new Path();
        this.J = 0L;
        this.f54016c0 = true;
        org.telegram.ui.Components.pq pqVar = new org.telegram.ui.Components.pq(null, true, null);
        this.f54017d0 = pqVar;
        this.f54019e0 = new int[3];
        this.U = view;
        this.f54021f0 = i7;
        this.f54025j0 = j3;
        this.f54022g0 = i10;
        this.f54023h0 = i11;
        this.f54024i0 = j10;
        this.Y = org.telegram.messenger.mp.u1(i7).y2(j3);
        this.f54026k0 = i6Var;
        this.G = new ImageReceiver(view);
        paint.setStrokeWidth(org.telegram.messenger.g0.N(2.8f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        pqVar.f38563z = 3;
        pqVar.I = 1;
        pqVar.f38546g = true;
        pqVar.d = d("paintChatActionBackground");
        pqVar.f38544e = textPaint;
        textPaint.setTextSize(org.telegram.messenger.g0.L(13.0f));
        textPaint.setTypeface(org.telegram.messenger.g0.o());
        textPaint2.setTextSize(org.telegram.messenger.g0.L(14.0f));
        paint2.setColor(-16777216);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }

    public static TLRPC.Dialog c(long j3, int i7, int i10, boolean z10, int[] iArr) {
        ArrayList Y0;
        TLRPC.Dialog c10;
        TLRPC.Dialog c11;
        org.telegram.messenger.mp u12 = org.telegram.messenger.mp.u1(org.telegram.messenger.c.a(org.telegram.messenger.i10.f24637t0).f23343a);
        SparseArray sparseArray = u12.f25884w;
        if (iArr != null) {
            iArr[0] = 0;
            iArr[1] = i7;
            iArr[2] = i10;
        }
        if (i10 != 0) {
            org.telegram.messenger.ro roVar = (org.telegram.messenger.ro) u12.T0.get(i10);
            if (roVar != null) {
                Y0 = roVar.f26781k;
            } else {
                return null;
            }
        } else {
            Y0 = u12.Y0(i7);
        }
        if (Y0 != null) {
            for (int i11 = 0; i11 < Y0.size(); i11++) {
                TLRPC.Dialog dialog = (TLRPC.Dialog) Y0.get(i11);
                TLRPC.Chat O0 = u12.O0(Long.valueOf(-dialog.f28496id));
                if (O0 != null && dialog.f28496id != j3 && dialog.unread_count > 0 && org.telegram.messenger.n5.y(dialog) && !O0.megagroup && !u12.I2(dialog.f28496id, false) && u12.H1(O0.restriction_reason) == null) {
                    return dialog;
                }
            }
            if (z10) {
                if (i10 != 0) {
                    for (int i12 = 0; i12 < u12.Q0.size(); i12++) {
                        int i13 = ((org.telegram.messenger.ro) u12.Q0.get(i12)).f26773a;
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

    public final void a(android.graphics.Canvas r43, org.telegram.ui.bj r44, float r45, float r46) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.xo.a(android.graphics.Canvas, org.telegram.ui.bj, float, float):void");
    }

    public final void b(Canvas canvas, int i7, int i10) {
        int w02 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Ol, this.f54026k0);
        TextPaint textPaint = this.h;
        textPaint.setColor(w02);
        Paint d = d("paintChatComposeBackground");
        int alpha = d.getAlpha();
        int alpha2 = textPaint.getAlpha();
        d.setAlpha((int) (alpha * this.T));
        if (this.f54033w != null) {
            float f10 = this.L;
            if (f10 < 1.0f) {
                textPaint.setAlpha((int) ((1.0f - f10) * alpha2 * this.T));
                float height = ((((i10 - i7) - this.f54033w.getHeight()) / 2.0f) + i7) - (org.telegram.messenger.g0.L(10.0f) * this.L);
                canvas.save();
                canvas.translate((this.f54015c - this.E) / 2.0f, height);
                this.f54033w.draw(canvas);
                canvas.restore();
            }
        }
        if (this.f54034x != null) {
            float f11 = this.L;
            if (f11 > 0.0f) {
                textPaint.setAlpha((int) (alpha2 * f11 * this.T));
                float L = ((1.0f - this.L) * org.telegram.messenger.g0.L(10.0f)) + (((i10 - i7) - this.f54034x.getHeight()) / 2.0f) + i7;
                canvas.save();
                canvas.translate((this.f54015c - this.F) / 2.0f, L);
                this.f54034x.draw(canvas);
                canvas.restore();
            }
        }
        textPaint.setAlpha(alpha2);
        d.setAlpha(alpha);
    }

    public final Paint d(String str) {
        Paint paint;
        org.telegram.ui.ActionBar.i6 i6Var = this.f54026k0;
        if (i6Var != null) {
            paint = i6Var.e(str);
        } else {
            paint = null;
        }
        if (paint != null) {
            return paint;
        }
        return org.telegram.ui.ActionBar.n6.V0(str);
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        TLRPC.Dialog dialog;
        if (this.f54012a0 != 0 && (dialog = (TLRPC.Dialog) org.telegram.messenger.mp.u1(this.f54021f0).R.f(this.f54012a0)) != null) {
            int i11 = dialog.unread_count;
            boolean z10 = true;
            this.f54017d0.c(i11, true);
            if (i11 <= 0) {
                z10 = false;
            }
            this.f54016c0 = z10;
            View view = this.f54014b0;
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
                public final xo f52993b;

                {
                    this.f52993b = this;
                }

                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    switch (r3) {
                        case 0:
                            xo xoVar = this.f52993b;
                            xoVar.getClass();
                            xoVar.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            view.invalidate();
                            xoVar.U.invalidate();
                            return;
                        case 1:
                            xo xoVar2 = this.f52993b;
                            xoVar2.getClass();
                            xoVar2.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            view.invalidate();
                            return;
                        case 2:
                            xo xoVar3 = this.f52993b;
                            xoVar3.getClass();
                            xoVar3.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            view.invalidate();
                            return;
                        case 3:
                            xo xoVar4 = this.f52993b;
                            xoVar4.getClass();
                            xoVar4.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            view.invalidate();
                            return;
                        default:
                            xo xoVar5 = this.f52993b;
                            xoVar5.getClass();
                            xoVar5.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            xoVar5.U.invalidate();
                            view.invalidate();
                            return;
                    }
                }
            });
            ofFloat.setInterpolator(org.telegram.ui.Components.kr.h);
            ofFloat.setDuration(250L);
            this.M = 0.0f;
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                public final xo f52993b;

                {
                    this.f52993b = this;
                }

                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    switch (r3) {
                        case 0:
                            xo xoVar = this.f52993b;
                            xoVar.getClass();
                            xoVar.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            view.invalidate();
                            xoVar.U.invalidate();
                            return;
                        case 1:
                            xo xoVar2 = this.f52993b;
                            xoVar2.getClass();
                            xoVar2.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            view.invalidate();
                            return;
                        case 2:
                            xo xoVar3 = this.f52993b;
                            xoVar3.getClass();
                            xoVar3.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            view.invalidate();
                            return;
                        case 3:
                            xo xoVar4 = this.f52993b;
                            xoVar4.getClass();
                            xoVar4.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            view.invalidate();
                            return;
                        default:
                            xo xoVar5 = this.f52993b;
                            xoVar5.getClass();
                            xoVar5.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            xoVar5.U.invalidate();
                            view.invalidate();
                            return;
                    }
                }
            });
            org.telegram.ui.Components.kr krVar = org.telegram.ui.Components.kr.f36861j;
            ofFloat2.setInterpolator(krVar);
            ofFloat2.setDuration(180L);
            ValueAnimator ofFloat3 = ValueAnimator.ofFloat(1.0f, -0.5f);
            ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                public final xo f52993b;

                {
                    this.f52993b = this;
                }

                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    switch (r3) {
                        case 0:
                            xo xoVar = this.f52993b;
                            xoVar.getClass();
                            xoVar.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            view.invalidate();
                            xoVar.U.invalidate();
                            return;
                        case 1:
                            xo xoVar2 = this.f52993b;
                            xoVar2.getClass();
                            xoVar2.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            view.invalidate();
                            return;
                        case 2:
                            xo xoVar3 = this.f52993b;
                            xoVar3.getClass();
                            xoVar3.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            view.invalidate();
                            return;
                        case 3:
                            xo xoVar4 = this.f52993b;
                            xoVar4.getClass();
                            xoVar4.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            view.invalidate();
                            return;
                        default:
                            xo xoVar5 = this.f52993b;
                            xoVar5.getClass();
                            xoVar5.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            xoVar5.U.invalidate();
                            view.invalidate();
                            return;
                    }
                }
            });
            ofFloat3.setInterpolator(krVar);
            ofFloat3.setDuration(120L);
            ValueAnimator ofFloat4 = ValueAnimator.ofFloat(-0.5f, 0.0f);
            ofFloat4.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                public final xo f52993b;

                {
                    this.f52993b = this;
                }

                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    switch (r3) {
                        case 0:
                            xo xoVar = this.f52993b;
                            xoVar.getClass();
                            xoVar.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            view.invalidate();
                            xoVar.U.invalidate();
                            return;
                        case 1:
                            xo xoVar2 = this.f52993b;
                            xoVar2.getClass();
                            xoVar2.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            view.invalidate();
                            return;
                        case 2:
                            xo xoVar3 = this.f52993b;
                            xoVar3.getClass();
                            xoVar3.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            view.invalidate();
                            return;
                        case 3:
                            xo xoVar4 = this.f52993b;
                            xoVar4.getClass();
                            xoVar4.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            view.invalidate();
                            return;
                        default:
                            xo xoVar5 = this.f52993b;
                            xoVar5.getClass();
                            xoVar5.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            xoVar5.U.invalidate();
                            view.invalidate();
                            return;
                    }
                }
            });
            ofFloat4.setInterpolator(krVar);
            ofFloat4.setDuration(100L);
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.K = animatorSet2;
            animatorSet2.addListener(new ah.l(18, this, view));
            AnimatorSet animatorSet3 = new AnimatorSet();
            animatorSet3.playSequentially(ofFloat2, ofFloat3, ofFloat4);
            this.K.playTogether(ofFloat, animatorSet3);
            this.K.start();
            return;
        }
        ValueAnimator ofFloat5 = ValueAnimator.ofFloat(this.L, 0.0f);
        ofFloat5.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
            public final xo f52993b;

            {
                this.f52993b = this;
            }

            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (r3) {
                    case 0:
                        xo xoVar = this.f52993b;
                        xoVar.getClass();
                        xoVar.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        view.invalidate();
                        xoVar.U.invalidate();
                        return;
                    case 1:
                        xo xoVar2 = this.f52993b;
                        xoVar2.getClass();
                        xoVar2.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        view.invalidate();
                        return;
                    case 2:
                        xo xoVar3 = this.f52993b;
                        xoVar3.getClass();
                        xoVar3.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        view.invalidate();
                        return;
                    case 3:
                        xo xoVar4 = this.f52993b;
                        xoVar4.getClass();
                        xoVar4.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        view.invalidate();
                        return;
                    default:
                        xo xoVar5 = this.f52993b;
                        xoVar5.getClass();
                        xoVar5.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        xoVar5.U.invalidate();
                        view.invalidate();
                        return;
                }
            }
        });
        ofFloat5.setInterpolator(org.telegram.ui.Components.kr.f36858f);
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
        TLRPC.Dialog c10 = c(this.f54025j0, this.f54022g0, this.f54023h0, true, this.f54019e0);
        if (c10 != null) {
            this.f54012a0 = c10.f28496id;
            int[] iArr = this.f54019e0;
            if (iArr[0] == 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.X = z10;
            this.f54011a = iArr[1];
            this.f54013b = iArr[2];
            this.S = false;
            int i7 = this.f54021f0;
            TLRPC.Chat O0 = org.telegram.messenger.mp.u1(i7).O0(Long.valueOf(-c10.f28496id));
            this.H = O0;
            if (O0 == null) {
                this.H = org.telegram.messenger.mp.u1(i7).O0(Long.valueOf(c10.f28496id));
            }
            org.telegram.ui.Components.a9 a9Var = new org.telegram.ui.Components.a9((org.telegram.ui.ActionBar.i6) null);
            a9Var.q(this.H);
            this.G.r0(org.telegram.messenger.fc.a(1, this.H), "50_50", a9Var, null, org.telegram.messenger.i10.i(0).f(), 0);
            org.telegram.messenger.mp.u1(i7).t0(c10.f28496id, 0, null);
            int i10 = c10.unread_count;
            this.f54017d0.c(i10, false);
            if (i10 > 0) {
                z11 = true;
            }
            this.f54016c0 = z11;
            return;
        }
        this.H = null;
        this.X = false;
        this.S = true;
    }

    public final void g(TLRPC.Chat chat) {
        boolean z10;
        int i7;
        if (chat == null) {
            f();
            return;
        }
        this.f54012a0 = -chat.f28492id;
        int[] iArr = this.f54019e0;
        boolean z11 = false;
        if (iArr[0] == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.X = z10;
        this.f54011a = iArr[1];
        this.f54013b = iArr[2];
        this.S = false;
        this.H = chat;
        org.telegram.ui.Components.a9 a9Var = new org.telegram.ui.Components.a9((org.telegram.ui.ActionBar.i6) null);
        a9Var.q(this.H);
        this.G.r0(org.telegram.messenger.fc.a(1, this.H), "50_50", a9Var, null, org.telegram.messenger.i10.i(0).f(), 0);
        int i10 = this.f54021f0;
        org.telegram.messenger.mp.u1(i10).t0(-chat.f28492id, 0, null);
        TLRPC.Dialog U0 = org.telegram.messenger.mp.u1(i10).U0(-chat.f28492id);
        if (U0 == null) {
            i7 = 0;
        } else {
            i7 = U0.unread_count;
        }
        this.f54017d0.c(i7, false);
        if (i7 > 0) {
            z11 = true;
        }
        this.f54016c0 = z11;
        this.W = true;
        this.I = null;
    }

    public final void h() {
        TLRPC.TL_forumTopic tL_forumTopic;
        org.telegram.ui.Components.o5 o5Var;
        View view;
        View view2;
        org.telegram.ui.Components.o5 o5Var2;
        TLRPC.Message message;
        TLRPC.Message message2;
        boolean z10 = false;
        this.W = false;
        this.X = false;
        qg.b bVar = null;
        this.H = null;
        this.f54012a0 = 0L;
        ImageReceiver imageReceiver = this.G;
        imageReceiver.f();
        int i7 = this.f54021f0;
        ArrayList l10 = org.telegram.messenger.mp.u1(i7).f25864t7.l(-this.f54025j0);
        if (l10 != null && l10.size() > 1) {
            tL_forumTopic = null;
            for (int i10 = 0; i10 < l10.size(); i10++) {
                TLRPC.TL_forumTopic tL_forumTopic2 = (TLRPC.TL_forumTopic) l10.get(i10);
                if (tL_forumTopic2.f28544id != this.f54024i0 && !tL_forumTopic2.hidden && tL_forumTopic2.unread_count > 0 && (tL_forumTopic == null || ((message = tL_forumTopic2.topMessage) != null && (message2 = tL_forumTopic.topMessage) != null && message.date > message2.date))) {
                    tL_forumTopic = tL_forumTopic2;
                }
            }
        } else {
            tL_forumTopic = null;
        }
        if (tL_forumTopic != null) {
            this.S = false;
            this.I = tL_forumTopic;
            int i11 = tL_forumTopic.f28544id;
            org.telegram.ui.ActionBar.i6 i6Var = this.f54026k0;
            if (i11 == 1) {
                View view3 = this.f54014b0;
                if (view3 != null && (o5Var2 = this.f54027l0) != null) {
                    o5Var2.n(view3);
                }
                this.f54027l0 = null;
                Context context = this.U.getContext();
                int i12 = org.telegram.ui.ActionBar.n6.f29717rd;
                qg.b d = qg.c.d(context, 1.0f, org.telegram.ui.ActionBar.n6.w0(i12, i6Var), true);
                if (d != null) {
                    bVar = d;
                }
                this.m0 = bVar;
                this.f54029n0 = org.telegram.ui.ActionBar.n6.w0(i12, i6Var);
                imageReceiver.x0(d);
            } else if (tL_forumTopic.icon_emoji_id != 0) {
                org.telegram.ui.Components.o5 o5Var3 = this.f54027l0;
                if (o5Var3 == null || o5Var3.h() != tL_forumTopic.icon_emoji_id) {
                    org.telegram.ui.Components.o5 o5Var4 = this.f54027l0;
                    if (o5Var4 != null && (view = this.f54014b0) != null) {
                        o5Var4.n(view);
                    }
                    org.telegram.ui.Components.o5 o5Var5 = new org.telegram.ui.Components.o5(22, i7, tL_forumTopic.icon_emoji_id);
                    this.f54027l0 = o5Var5;
                    int w02 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Zc, i6Var);
                    this.f54030o0 = w02;
                    o5Var5.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
                }
                org.telegram.ui.Components.o5 o5Var6 = this.f54027l0;
                if (o5Var6 != null && (view2 = this.f54014b0) != null) {
                    o5Var6.a(view2);
                }
                imageReceiver.x0(null);
            } else {
                View view4 = this.f54014b0;
                if (view4 != null && (o5Var = this.f54027l0) != null) {
                    o5Var.n(view4);
                }
                this.f54027l0 = null;
                imageReceiver.x0(qg.c.f(tL_forumTopic));
            }
            int i13 = tL_forumTopic.unread_count;
            this.f54017d0.c(i13, false);
            if (i13 > 0) {
                z10 = true;
            }
            this.f54016c0 = z10;
            return;
        }
        this.I = null;
        this.S = true;
    }
}
