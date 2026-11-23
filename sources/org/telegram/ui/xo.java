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
public final class xo implements org.telegram.messenger.gs {
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
    public bh Z;
    public int f53840a;
    public long f53841a0;
    public int f53842b;
    public View f53843b0;
    public int f53844c;
    public boolean f53845c0;
    public float d;
    public final org.telegram.ui.Components.sq f53846d0;
    public final Paint f53847e;
    public final int[] f53848e0;
    public final TextPaint f53849f;
    public final int f53850f0;
    public final int f53851g0;
    public final TextPaint h;
    public final int f53852h0;
    public final long f53853i0;
    public final long f53854j0;
    public final org.telegram.ui.ActionBar.h6 f53855k0;
    public org.telegram.ui.Components.p5 f53856l0;
    public qg.b m0;
    public final Paint f53857n;
    public int f53858n0;
    public int f53859o0;
    public final Path f53860r;
    public StaticLayout f53861s;
    public StaticLayout f53862w;
    public StaticLayout f53863x;
    public int f53864y;

    public xo(int i7, View view, long j3, int i10, int i11, long j10, org.telegram.ui.ActionBar.h6 h6Var) {
        Paint paint = new Paint(1);
        this.f53847e = paint;
        TextPaint textPaint = new TextPaint(1);
        this.f53849f = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.h = textPaint2;
        Paint paint2 = new Paint(1);
        this.f53857n = paint2;
        this.f53860r = new Path();
        this.J = 0L;
        this.f53845c0 = true;
        org.telegram.ui.Components.sq sqVar = new org.telegram.ui.Components.sq(null, true, null);
        this.f53846d0 = sqVar;
        this.f53848e0 = new int[3];
        this.U = view;
        this.f53850f0 = i7;
        this.f53854j0 = j3;
        this.f53851g0 = i10;
        this.f53852h0 = i11;
        this.f53853i0 = j10;
        this.Y = org.telegram.messenger.np.u1(i7).y2(j3);
        this.f53855k0 = h6Var;
        this.G = new ImageReceiver(view);
        paint.setStrokeWidth(org.telegram.messenger.g0.N(2.8f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        sqVar.f39629z = 3;
        sqVar.I = 1;
        sqVar.f39612g = true;
        sqVar.d = d("paintChatActionBackground");
        sqVar.f39610e = textPaint;
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
        org.telegram.messenger.np u12 = org.telegram.messenger.np.u1(org.telegram.messenger.c.a(org.telegram.messenger.k10.f24932t0).f23166a);
        SparseArray sparseArray = u12.f25952w;
        if (iArr != null) {
            iArr[0] = 0;
            iArr[1] = i7;
            iArr[2] = i10;
        }
        if (i10 != 0) {
            org.telegram.messenger.so soVar = (org.telegram.messenger.so) u12.T0.get(i10);
            if (soVar != null) {
                Y0 = soVar.f26858k;
            } else {
                return null;
            }
        } else {
            Y0 = u12.Y0(i7);
        }
        if (Y0 != null) {
            for (int i11 = 0; i11 < Y0.size(); i11++) {
                TLRPC.Dialog dialog = (TLRPC.Dialog) Y0.get(i11);
                TLRPC.Chat O0 = u12.O0(Long.valueOf(-dialog.f28402id));
                if (O0 != null && dialog.f28402id != j3 && dialog.unread_count > 0 && org.telegram.messenger.n5.y(dialog) && !O0.megagroup && !u12.I2(dialog.f28402id, false) && u12.H1(O0.restriction_reason) == null) {
                    return dialog;
                }
            }
            if (z10) {
                if (i10 != 0) {
                    for (int i12 = 0; i12 < u12.Q0.size(); i12++) {
                        int i13 = ((org.telegram.messenger.so) u12.Q0.get(i12)).f26850a;
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
        int w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Ol, this.f53855k0);
        TextPaint textPaint = this.h;
        textPaint.setColor(w02);
        Paint d = d("paintChatComposeBackground");
        int alpha = d.getAlpha();
        int alpha2 = textPaint.getAlpha();
        d.setAlpha((int) (alpha * this.T));
        if (this.f53862w != null) {
            float f10 = this.L;
            if (f10 < 1.0f) {
                textPaint.setAlpha((int) ((1.0f - f10) * alpha2 * this.T));
                float height = ((((i10 - i7) - this.f53862w.getHeight()) / 2.0f) + i7) - (org.telegram.messenger.g0.L(10.0f) * this.L);
                canvas.save();
                canvas.translate((this.f53844c - this.E) / 2.0f, height);
                this.f53862w.draw(canvas);
                canvas.restore();
            }
        }
        if (this.f53863x != null) {
            float f11 = this.L;
            if (f11 > 0.0f) {
                textPaint.setAlpha((int) (alpha2 * f11 * this.T));
                float L = ((1.0f - this.L) * org.telegram.messenger.g0.L(10.0f)) + (((i10 - i7) - this.f53863x.getHeight()) / 2.0f) + i7;
                canvas.save();
                canvas.translate((this.f53844c - this.F) / 2.0f, L);
                this.f53863x.draw(canvas);
                canvas.restore();
            }
        }
        textPaint.setAlpha(alpha2);
        d.setAlpha(alpha);
    }

    public final Paint d(String str) {
        Paint paint;
        org.telegram.ui.ActionBar.h6 h6Var = this.f53855k0;
        if (h6Var != null) {
            paint = h6Var.g(str);
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
        if (this.f53841a0 != 0 && (dialog = (TLRPC.Dialog) org.telegram.messenger.np.u1(this.f53850f0).R.f(this.f53841a0)) != null) {
            int i11 = dialog.unread_count;
            boolean z10 = true;
            this.f53846d0.c(i11, true);
            if (i11 <= 0) {
                z10 = false;
            }
            this.f53845c0 = z10;
            View view = this.f53843b0;
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
                public final xo f52840b;

                {
                    this.f52840b = this;
                }

                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    switch (r3) {
                        case 0:
                            xo xoVar = this.f52840b;
                            xoVar.getClass();
                            xoVar.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            view.invalidate();
                            xoVar.U.invalidate();
                            return;
                        case 1:
                            xo xoVar2 = this.f52840b;
                            xoVar2.getClass();
                            xoVar2.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            view.invalidate();
                            return;
                        case 2:
                            xo xoVar3 = this.f52840b;
                            xoVar3.getClass();
                            xoVar3.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            view.invalidate();
                            return;
                        case 3:
                            xo xoVar4 = this.f52840b;
                            xoVar4.getClass();
                            xoVar4.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            view.invalidate();
                            return;
                        default:
                            xo xoVar5 = this.f52840b;
                            xoVar5.getClass();
                            xoVar5.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            xoVar5.U.invalidate();
                            view.invalidate();
                            return;
                    }
                }
            });
            ofFloat.setInterpolator(org.telegram.ui.Components.nr.h);
            ofFloat.setDuration(250L);
            this.M = 0.0f;
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                public final xo f52840b;

                {
                    this.f52840b = this;
                }

                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    switch (r3) {
                        case 0:
                            xo xoVar = this.f52840b;
                            xoVar.getClass();
                            xoVar.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            view.invalidate();
                            xoVar.U.invalidate();
                            return;
                        case 1:
                            xo xoVar2 = this.f52840b;
                            xoVar2.getClass();
                            xoVar2.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            view.invalidate();
                            return;
                        case 2:
                            xo xoVar3 = this.f52840b;
                            xoVar3.getClass();
                            xoVar3.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            view.invalidate();
                            return;
                        case 3:
                            xo xoVar4 = this.f52840b;
                            xoVar4.getClass();
                            xoVar4.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            view.invalidate();
                            return;
                        default:
                            xo xoVar5 = this.f52840b;
                            xoVar5.getClass();
                            xoVar5.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            xoVar5.U.invalidate();
                            view.invalidate();
                            return;
                    }
                }
            });
            org.telegram.ui.Components.nr nrVar = org.telegram.ui.Components.nr.f37920j;
            ofFloat2.setInterpolator(nrVar);
            ofFloat2.setDuration(180L);
            ValueAnimator ofFloat3 = ValueAnimator.ofFloat(1.0f, -0.5f);
            ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                public final xo f52840b;

                {
                    this.f52840b = this;
                }

                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    switch (r3) {
                        case 0:
                            xo xoVar = this.f52840b;
                            xoVar.getClass();
                            xoVar.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            view.invalidate();
                            xoVar.U.invalidate();
                            return;
                        case 1:
                            xo xoVar2 = this.f52840b;
                            xoVar2.getClass();
                            xoVar2.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            view.invalidate();
                            return;
                        case 2:
                            xo xoVar3 = this.f52840b;
                            xoVar3.getClass();
                            xoVar3.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            view.invalidate();
                            return;
                        case 3:
                            xo xoVar4 = this.f52840b;
                            xoVar4.getClass();
                            xoVar4.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            view.invalidate();
                            return;
                        default:
                            xo xoVar5 = this.f52840b;
                            xoVar5.getClass();
                            xoVar5.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            xoVar5.U.invalidate();
                            view.invalidate();
                            return;
                    }
                }
            });
            ofFloat3.setInterpolator(nrVar);
            ofFloat3.setDuration(120L);
            ValueAnimator ofFloat4 = ValueAnimator.ofFloat(-0.5f, 0.0f);
            ofFloat4.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                public final xo f52840b;

                {
                    this.f52840b = this;
                }

                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    switch (r3) {
                        case 0:
                            xo xoVar = this.f52840b;
                            xoVar.getClass();
                            xoVar.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            view.invalidate();
                            xoVar.U.invalidate();
                            return;
                        case 1:
                            xo xoVar2 = this.f52840b;
                            xoVar2.getClass();
                            xoVar2.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            view.invalidate();
                            return;
                        case 2:
                            xo xoVar3 = this.f52840b;
                            xoVar3.getClass();
                            xoVar3.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            view.invalidate();
                            return;
                        case 3:
                            xo xoVar4 = this.f52840b;
                            xoVar4.getClass();
                            xoVar4.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            view.invalidate();
                            return;
                        default:
                            xo xoVar5 = this.f52840b;
                            xoVar5.getClass();
                            xoVar5.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            xoVar5.U.invalidate();
                            view.invalidate();
                            return;
                    }
                }
            });
            ofFloat4.setInterpolator(nrVar);
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
            public final xo f52840b;

            {
                this.f52840b = this;
            }

            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (r3) {
                    case 0:
                        xo xoVar = this.f52840b;
                        xoVar.getClass();
                        xoVar.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        view.invalidate();
                        xoVar.U.invalidate();
                        return;
                    case 1:
                        xo xoVar2 = this.f52840b;
                        xoVar2.getClass();
                        xoVar2.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        view.invalidate();
                        return;
                    case 2:
                        xo xoVar3 = this.f52840b;
                        xoVar3.getClass();
                        xoVar3.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        view.invalidate();
                        return;
                    case 3:
                        xo xoVar4 = this.f52840b;
                        xoVar4.getClass();
                        xoVar4.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        view.invalidate();
                        return;
                    default:
                        xo xoVar5 = this.f52840b;
                        xoVar5.getClass();
                        xoVar5.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        xoVar5.U.invalidate();
                        view.invalidate();
                        return;
                }
            }
        });
        ofFloat5.setInterpolator(org.telegram.ui.Components.nr.f37917f);
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
        TLRPC.Dialog c10 = c(this.f53854j0, this.f53851g0, this.f53852h0, true, this.f53848e0);
        if (c10 != null) {
            this.f53841a0 = c10.f28402id;
            int[] iArr = this.f53848e0;
            if (iArr[0] == 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.X = z10;
            this.f53840a = iArr[1];
            this.f53842b = iArr[2];
            this.S = false;
            int i7 = this.f53850f0;
            TLRPC.Chat O0 = org.telegram.messenger.np.u1(i7).O0(Long.valueOf(-c10.f28402id));
            this.H = O0;
            if (O0 == null) {
                this.H = org.telegram.messenger.np.u1(i7).O0(Long.valueOf(c10.f28402id));
            }
            org.telegram.ui.Components.b9 b9Var = new org.telegram.ui.Components.b9((org.telegram.ui.ActionBar.h6) null);
            b9Var.q(this.H);
            this.G.q0(org.telegram.messenger.gc.a(1, this.H), "50_50", b9Var, null, org.telegram.messenger.k10.i(0).f(), 0);
            org.telegram.messenger.np.u1(i7).t0(c10.f28402id, 0, null);
            int i10 = c10.unread_count;
            this.f53846d0.c(i10, false);
            if (i10 > 0) {
                z11 = true;
            }
            this.f53845c0 = z11;
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
        this.f53841a0 = -chat.f28398id;
        int[] iArr = this.f53848e0;
        boolean z11 = false;
        if (iArr[0] == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.X = z10;
        this.f53840a = iArr[1];
        this.f53842b = iArr[2];
        this.S = false;
        this.H = chat;
        org.telegram.ui.Components.b9 b9Var = new org.telegram.ui.Components.b9((org.telegram.ui.ActionBar.h6) null);
        b9Var.q(this.H);
        this.G.q0(org.telegram.messenger.gc.a(1, this.H), "50_50", b9Var, null, org.telegram.messenger.k10.i(0).f(), 0);
        int i10 = this.f53850f0;
        org.telegram.messenger.np.u1(i10).t0(-chat.f28398id, 0, null);
        TLRPC.Dialog U0 = org.telegram.messenger.np.u1(i10).U0(-chat.f28398id);
        if (U0 == null) {
            i7 = 0;
        } else {
            i7 = U0.unread_count;
        }
        this.f53846d0.c(i7, false);
        if (i7 > 0) {
            z11 = true;
        }
        this.f53845c0 = z11;
        this.W = true;
        this.I = null;
    }

    public final void h() {
        TLRPC.TL_forumTopic tL_forumTopic;
        org.telegram.ui.Components.p5 p5Var;
        View view;
        View view2;
        org.telegram.ui.Components.p5 p5Var2;
        TLRPC.Message message;
        TLRPC.Message message2;
        boolean z10 = false;
        this.W = false;
        this.X = false;
        qg.b bVar = null;
        this.H = null;
        this.f53841a0 = 0L;
        ImageReceiver imageReceiver = this.G;
        imageReceiver.f();
        int i7 = this.f53850f0;
        ArrayList l10 = org.telegram.messenger.np.u1(i7).f25932t7.l(-this.f53854j0);
        if (l10 != null && l10.size() > 1) {
            tL_forumTopic = null;
            for (int i10 = 0; i10 < l10.size(); i10++) {
                TLRPC.TL_forumTopic tL_forumTopic2 = (TLRPC.TL_forumTopic) l10.get(i10);
                if (tL_forumTopic2.f28450id != this.f53853i0 && !tL_forumTopic2.hidden && tL_forumTopic2.unread_count > 0 && (tL_forumTopic == null || ((message = tL_forumTopic2.topMessage) != null && (message2 = tL_forumTopic.topMessage) != null && message.date > message2.date))) {
                    tL_forumTopic = tL_forumTopic2;
                }
            }
        } else {
            tL_forumTopic = null;
        }
        if (tL_forumTopic != null) {
            this.S = false;
            this.I = tL_forumTopic;
            int i11 = tL_forumTopic.f28450id;
            org.telegram.ui.ActionBar.h6 h6Var = this.f53855k0;
            if (i11 == 1) {
                View view3 = this.f53843b0;
                if (view3 != null && (p5Var2 = this.f53856l0) != null) {
                    p5Var2.n(view3);
                }
                this.f53856l0 = null;
                Context context = this.U.getContext();
                int i12 = org.telegram.ui.ActionBar.m6.f29613rd;
                qg.b d = qg.c.d(context, 1.0f, org.telegram.ui.ActionBar.m6.w0(i12, h6Var), true);
                if (d != null) {
                    bVar = d;
                }
                this.m0 = bVar;
                this.f53858n0 = org.telegram.ui.ActionBar.m6.w0(i12, h6Var);
                imageReceiver.w0(d);
            } else if (tL_forumTopic.icon_emoji_id != 0) {
                org.telegram.ui.Components.p5 p5Var3 = this.f53856l0;
                if (p5Var3 == null || p5Var3.h() != tL_forumTopic.icon_emoji_id) {
                    org.telegram.ui.Components.p5 p5Var4 = this.f53856l0;
                    if (p5Var4 != null && (view = this.f53843b0) != null) {
                        p5Var4.n(view);
                    }
                    org.telegram.ui.Components.p5 p5Var5 = new org.telegram.ui.Components.p5(22, i7, tL_forumTopic.icon_emoji_id);
                    this.f53856l0 = p5Var5;
                    int w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Zc, h6Var);
                    this.f53859o0 = w02;
                    p5Var5.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
                }
                org.telegram.ui.Components.p5 p5Var6 = this.f53856l0;
                if (p5Var6 != null && (view2 = this.f53843b0) != null) {
                    p5Var6.a(view2);
                }
                imageReceiver.w0(null);
            } else {
                View view4 = this.f53843b0;
                if (view4 != null && (p5Var = this.f53856l0) != null) {
                    p5Var.n(view4);
                }
                this.f53856l0 = null;
                imageReceiver.w0(qg.c.f(tL_forumTopic));
            }
            int i13 = tL_forumTopic.unread_count;
            this.f53846d0.c(i13, false);
            if (i13 > 0) {
                z10 = true;
            }
            this.f53845c0 = z10;
            return;
        }
        this.I = null;
        this.S = true;
    }
}
