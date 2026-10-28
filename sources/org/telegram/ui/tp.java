package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
public final class tp implements NotificationCenter.NotificationCenterDelegate {
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
    public xi Y;
    public long Z;
    public int f43688a;
    public View f43689a0;
    public int f43690b;
    public boolean f43691b0;
    public int f43692c;
    public final org.telegram.ui.Components.gr f43693c0;
    public float d;
    public final int[] f43694d0;
    public final Paint e;
    public final int f43695e0;
    public final TextPaint f43696f;
    public final int f43697f0;
    public final int f43698g0;
    public final TextPaint h;
    public final long f43699h0;
    public final long f43700i0;
    public final org.telegram.ui.ActionBar.u6 f43701j0;
    public org.telegram.ui.Components.t5 f43702k0;
    public pg.c f43703l0;
    public int m0;
    public final Paint f43704n;
    public int f43705n0;
    public final Path f43706r;
    public StaticLayout f43707s;
    public StaticLayout v;
    public StaticLayout f43708w;
    public int f43709x;
    public int f43710y;

    public tp(int i10, View view, long j10, int i11, int i12, long j11, org.telegram.ui.ActionBar.u6 u6Var) {
        Paint paint = new Paint(1);
        this.e = paint;
        TextPaint textPaint = new TextPaint(1);
        this.f43696f = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.h = textPaint2;
        Paint paint2 = new Paint(1);
        this.f43704n = paint2;
        this.f43706r = new Path();
        this.I = 0L;
        this.f43691b0 = true;
        org.telegram.ui.Components.gr grVar = new org.telegram.ui.Components.gr(null, true, null);
        this.f43693c0 = grVar;
        this.f43694d0 = new int[3];
        this.T = view;
        this.f43695e0 = i10;
        this.f43700i0 = j10;
        this.f43697f0 = i11;
        this.f43698g0 = i12;
        this.f43699h0 = j11;
        this.X = MessagesController.getInstance(i10).isForum(j10);
        this.f43701j0 = u6Var;
        this.F = new ImageReceiver(view);
        paint.setStrokeWidth(AndroidUtilities.dpf2(2.8f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        grVar.f28742z = 3;
        grVar.I = 1;
        grVar.f28725g = true;
        grVar.d = d("paintChatActionBackground");
        grVar.e = textPaint;
        textPaint.setTextSize(AndroidUtilities.dp(13.0f));
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint2.setTextSize(AndroidUtilities.dp(14.0f));
        paint2.setColor(-16777216);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }

    public static TLRPC.Dialog c(long j10, int i10, int i11, boolean z10, int[] iArr) {
        ArrayList<TLRPC.Dialog> dialogs;
        TLRPC.Dialog c10;
        long j11;
        int i12;
        int[] iArr2;
        MessagesController messagesController = AccountInstance.getInstance(UserConfig.selectedAccount).getMessagesController();
        if (iArr != null) {
            iArr[0] = 0;
            iArr[1] = i10;
            iArr[2] = i11;
        }
        if (i11 != 0) {
            MessagesController.DialogFilter dialogFilter = messagesController.dialogFiltersById.get(i11);
            if (dialogFilter != null) {
                dialogs = dialogFilter.dialogs;
            } else {
                return null;
            }
        } else {
            dialogs = messagesController.getDialogs(i10);
        }
        if (dialogs != null) {
            for (int i13 = 0; i13 < dialogs.size(); i13++) {
                TLRPC.Dialog dialog = dialogs.get(i13);
                TLRPC.Chat chat = messagesController.getChat(Long.valueOf(-dialog.f22032id));
                if (chat != null && dialog.f22032id != j10 && dialog.unread_count > 0 && DialogObject.isChannel(dialog) && !chat.megagroup && !messagesController.isPromoDialog(dialog.f22032id, false) && messagesController.getRestrictionReason(chat.restriction_reason) == null) {
                    return dialog;
                }
            }
            if (z10) {
                if (i11 != 0) {
                    int i14 = 0;
                    while (i14 < messagesController.dialogFilters.size()) {
                        int i15 = messagesController.dialogFilters.get(i14).f19548id;
                        if (i11 != i15) {
                            long j12 = j10;
                            int i16 = i10;
                            int[] iArr3 = iArr;
                            TLRPC.Dialog c11 = c(j12, i16, i15, false, iArr3);
                            j11 = j12;
                            i12 = i16;
                            iArr2 = iArr3;
                            if (c11 != null) {
                                if (iArr2 != null) {
                                    iArr2[0] = 1;
                                }
                                return c11;
                            }
                        } else {
                            j11 = j10;
                            i12 = i10;
                            iArr2 = iArr;
                        }
                        i14++;
                        i10 = i12;
                        j10 = j11;
                        iArr = iArr2;
                    }
                }
                long j13 = j10;
                int i17 = i10;
                int[] iArr4 = iArr;
                for (int i18 = 0; i18 < messagesController.dialogsByFolder.size(); i18++) {
                    int keyAt = messagesController.dialogsByFolder.keyAt(i18);
                    if (i17 != keyAt && (c10 = c(j13, keyAt, 0, false, iArr4)) != null) {
                        if (iArr4 != null) {
                            iArr4[0] = 1;
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

    public final void a(android.graphics.Canvas r43, org.telegram.ui.rj r44, float r45, float r46) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.tp.a(android.graphics.Canvas, org.telegram.ui.rj, float, float):void");
    }

    public final void b(Canvas canvas, int i10, int i11) {
        int w02 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.Xk, this.f43701j0);
        TextPaint textPaint = this.h;
        textPaint.setColor(w02);
        Paint d = d("paintChatComposeBackground");
        int alpha = d.getAlpha();
        int alpha2 = textPaint.getAlpha();
        d.setAlpha((int) (alpha * this.S));
        if (this.v != null) {
            float f7 = this.K;
            if (f7 < 1.0f) {
                textPaint.setAlpha((int) ((1.0f - f7) * alpha2 * this.S));
                float height = ((((i11 - i10) - this.v.getHeight()) / 2.0f) + i10) - (AndroidUtilities.dp(10.0f) * this.K);
                canvas.save();
                canvas.translate((this.f43692c - this.f43710y) / 2.0f, height);
                this.v.draw(canvas);
                canvas.restore();
            }
        }
        if (this.f43708w != null) {
            float f10 = this.K;
            if (f10 > 0.0f) {
                textPaint.setAlpha((int) (alpha2 * f10 * this.S));
                float dp = ((1.0f - this.K) * AndroidUtilities.dp(10.0f)) + (((i11 - i10) - this.f43708w.getHeight()) / 2.0f) + i10;
                canvas.save();
                canvas.translate((this.f43692c - this.E) / 2.0f, dp);
                this.f43708w.draw(canvas);
                canvas.restore();
            }
        }
        textPaint.setAlpha(alpha2);
        d.setAlpha(alpha);
    }

    public final Paint d(String str) {
        Paint paint;
        org.telegram.ui.ActionBar.u6 u6Var = this.f43701j0;
        if (u6Var != null) {
            paint = u6Var.d(str);
        } else {
            paint = null;
        }
        if (paint != null) {
            return paint;
        }
        return org.telegram.ui.ActionBar.y6.U0(str);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        TLRPC.Dialog dialog;
        if (this.Z != 0 && (dialog = (TLRPC.Dialog) MessagesController.getInstance(this.f43695e0).dialogs_dict.f(this.Z)) != null) {
            int i12 = dialog.unread_count;
            boolean z10 = true;
            this.f43693c0.c(i12, true);
            if (i12 <= 0) {
                z10 = false;
            }
            this.f43691b0 = z10;
            View view = this.f43689a0;
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

    public final void f() {
        View view;
        this.F.onAttachedToWindow();
        org.telegram.ui.Components.t5 t5Var = this.f43702k0;
        if (t5Var != null && (view = this.f43689a0) != null) {
            t5Var.a(view);
        }
        NotificationCenter.getInstance(this.f43695e0).addWeakObserver(this, NotificationCenter.updateInterfaces);
    }

    public final void g(final View view, boolean z10) {
        AnimatorSet animatorSet = this.J;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
            this.J.cancel();
        }
        if (z10) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.K, 1.0f);
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                public final tp f42759b;

                {
                    this.f42759b = this;
                }

                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    switch (r3) {
                        case 0:
                            tp tpVar = this.f42759b;
                            tpVar.getClass();
                            tpVar.K = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            view.invalidate();
                            tpVar.T.invalidate();
                            return;
                        case 1:
                            tp tpVar2 = this.f42759b;
                            tpVar2.getClass();
                            tpVar2.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            view.invalidate();
                            return;
                        case 2:
                            tp tpVar3 = this.f42759b;
                            tpVar3.getClass();
                            tpVar3.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            view.invalidate();
                            return;
                        case 3:
                            tp tpVar4 = this.f42759b;
                            tpVar4.getClass();
                            tpVar4.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            view.invalidate();
                            return;
                        default:
                            tp tpVar5 = this.f42759b;
                            tpVar5.getClass();
                            tpVar5.K = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            tpVar5.T.invalidate();
                            view.invalidate();
                            return;
                    }
                }
            });
            ofFloat.setInterpolator(org.telegram.ui.Components.ds.h);
            ofFloat.setDuration(250L);
            this.L = 0.0f;
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                public final tp f42759b;

                {
                    this.f42759b = this;
                }

                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    switch (r3) {
                        case 0:
                            tp tpVar = this.f42759b;
                            tpVar.getClass();
                            tpVar.K = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            view.invalidate();
                            tpVar.T.invalidate();
                            return;
                        case 1:
                            tp tpVar2 = this.f42759b;
                            tpVar2.getClass();
                            tpVar2.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            view.invalidate();
                            return;
                        case 2:
                            tp tpVar3 = this.f42759b;
                            tpVar3.getClass();
                            tpVar3.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            view.invalidate();
                            return;
                        case 3:
                            tp tpVar4 = this.f42759b;
                            tpVar4.getClass();
                            tpVar4.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            view.invalidate();
                            return;
                        default:
                            tp tpVar5 = this.f42759b;
                            tpVar5.getClass();
                            tpVar5.K = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            tpVar5.T.invalidate();
                            view.invalidate();
                            return;
                    }
                }
            });
            org.telegram.ui.Components.ds dsVar = org.telegram.ui.Components.ds.f27533j;
            ofFloat2.setInterpolator(dsVar);
            ofFloat2.setDuration(180L);
            ValueAnimator ofFloat3 = ValueAnimator.ofFloat(1.0f, -0.5f);
            ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                public final tp f42759b;

                {
                    this.f42759b = this;
                }

                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    switch (r3) {
                        case 0:
                            tp tpVar = this.f42759b;
                            tpVar.getClass();
                            tpVar.K = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            view.invalidate();
                            tpVar.T.invalidate();
                            return;
                        case 1:
                            tp tpVar2 = this.f42759b;
                            tpVar2.getClass();
                            tpVar2.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            view.invalidate();
                            return;
                        case 2:
                            tp tpVar3 = this.f42759b;
                            tpVar3.getClass();
                            tpVar3.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            view.invalidate();
                            return;
                        case 3:
                            tp tpVar4 = this.f42759b;
                            tpVar4.getClass();
                            tpVar4.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            view.invalidate();
                            return;
                        default:
                            tp tpVar5 = this.f42759b;
                            tpVar5.getClass();
                            tpVar5.K = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            tpVar5.T.invalidate();
                            view.invalidate();
                            return;
                    }
                }
            });
            ofFloat3.setInterpolator(dsVar);
            ofFloat3.setDuration(120L);
            ValueAnimator ofFloat4 = ValueAnimator.ofFloat(-0.5f, 0.0f);
            ofFloat4.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                public final tp f42759b;

                {
                    this.f42759b = this;
                }

                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    switch (r3) {
                        case 0:
                            tp tpVar = this.f42759b;
                            tpVar.getClass();
                            tpVar.K = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            view.invalidate();
                            tpVar.T.invalidate();
                            return;
                        case 1:
                            tp tpVar2 = this.f42759b;
                            tpVar2.getClass();
                            tpVar2.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            view.invalidate();
                            return;
                        case 2:
                            tp tpVar3 = this.f42759b;
                            tpVar3.getClass();
                            tpVar3.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            view.invalidate();
                            return;
                        case 3:
                            tp tpVar4 = this.f42759b;
                            tpVar4.getClass();
                            tpVar4.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            view.invalidate();
                            return;
                        default:
                            tp tpVar5 = this.f42759b;
                            tpVar5.getClass();
                            tpVar5.K = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            tpVar5.T.invalidate();
                            view.invalidate();
                            return;
                    }
                }
            });
            ofFloat4.setInterpolator(dsVar);
            ofFloat4.setDuration(100L);
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.J = animatorSet2;
            animatorSet2.addListener(new bi.ce(16, this, view));
            AnimatorSet animatorSet3 = new AnimatorSet();
            animatorSet3.playSequentially(ofFloat2, ofFloat3, ofFloat4);
            this.J.playTogether(ofFloat, animatorSet3);
            this.J.start();
            return;
        }
        ValueAnimator ofFloat5 = ValueAnimator.ofFloat(this.K, 0.0f);
        ofFloat5.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
            public final tp f42759b;

            {
                this.f42759b = this;
            }

            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (r3) {
                    case 0:
                        tp tpVar = this.f42759b;
                        tpVar.getClass();
                        tpVar.K = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        view.invalidate();
                        tpVar.T.invalidate();
                        return;
                    case 1:
                        tp tpVar2 = this.f42759b;
                        tpVar2.getClass();
                        tpVar2.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        view.invalidate();
                        return;
                    case 2:
                        tp tpVar3 = this.f42759b;
                        tpVar3.getClass();
                        tpVar3.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        view.invalidate();
                        return;
                    case 3:
                        tp tpVar4 = this.f42759b;
                        tpVar4.getClass();
                        tpVar4.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        view.invalidate();
                        return;
                    default:
                        tp tpVar5 = this.f42759b;
                        tpVar5.getClass();
                        tpVar5.K = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        tpVar5.T.invalidate();
                        view.invalidate();
                        return;
                }
            }
        });
        ofFloat5.setInterpolator(org.telegram.ui.Components.ds.f27530f);
        ofFloat5.setDuration(220L);
        AnimatorSet animatorSet4 = new AnimatorSet();
        this.J = animatorSet4;
        animatorSet4.playTogether(ofFloat5);
        this.J.start();
    }

    public final void h() {
        boolean z10;
        boolean z11 = false;
        this.V = false;
        this.H = null;
        TLRPC.Dialog c10 = c(this.f43700i0, this.f43697f0, this.f43698g0, true, this.f43694d0);
        if (c10 != null) {
            this.Z = c10.f22032id;
            int[] iArr = this.f43694d0;
            if (iArr[0] == 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.W = z10;
            this.f43688a = iArr[1];
            this.f43690b = iArr[2];
            this.R = false;
            int i10 = this.f43695e0;
            TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-c10.f22032id));
            this.G = chat;
            if (chat == null) {
                this.G = MessagesController.getInstance(i10).getChat(Long.valueOf(c10.f22032id));
            }
            org.telegram.ui.Components.j9 j9Var = new org.telegram.ui.Components.j9((org.telegram.ui.ActionBar.u6) null);
            j9Var.k(i10, this.G);
            this.F.setImage(ImageLocation.getForChat(this.G, 1), "50_50", j9Var, null, UserConfig.getInstance(0).getCurrentUser(), 0);
            MessagesController.getInstance(i10).ensureMessagesLoaded(c10.f22032id, 0, null);
            int i11 = c10.unread_count;
            this.f43693c0.c(i11, false);
            if (i11 > 0) {
                z11 = true;
            }
            this.f43691b0 = z11;
            return;
        }
        this.G = null;
        this.W = false;
        this.R = true;
    }

    public final void i(TLRPC.Chat chat) {
        boolean z10;
        int i10;
        if (chat == null) {
            h();
            return;
        }
        this.Z = -chat.f22028id;
        int[] iArr = this.f43694d0;
        boolean z11 = false;
        if (iArr[0] == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.W = z10;
        this.f43688a = iArr[1];
        this.f43690b = iArr[2];
        this.R = false;
        this.G = chat;
        org.telegram.ui.Components.j9 j9Var = new org.telegram.ui.Components.j9((org.telegram.ui.ActionBar.u6) null);
        TLRPC.Chat chat2 = this.G;
        int i11 = this.f43695e0;
        j9Var.k(i11, chat2);
        this.F.setImage(ImageLocation.getForChat(this.G, 1), "50_50", j9Var, null, UserConfig.getInstance(0).getCurrentUser(), 0);
        MessagesController.getInstance(i11).ensureMessagesLoaded(-chat.f22028id, 0, null);
        TLRPC.Dialog dialog = MessagesController.getInstance(i11).getDialog(-chat.f22028id);
        if (dialog == null) {
            i10 = 0;
        } else {
            i10 = dialog.unread_count;
        }
        this.f43693c0.c(i10, false);
        if (i10 > 0) {
            z11 = true;
        }
        this.f43691b0 = z11;
        this.V = true;
        this.H = null;
    }

    public final void j() {
        TLRPC.TL_forumTopic tL_forumTopic;
        org.telegram.ui.Components.t5 t5Var;
        View view;
        View view2;
        org.telegram.ui.Components.t5 t5Var2;
        TLRPC.Message message;
        TLRPC.Message message2;
        boolean z10 = false;
        this.V = false;
        this.W = false;
        pg.c cVar = null;
        this.G = null;
        this.Z = 0L;
        ImageReceiver imageReceiver = this.F;
        imageReceiver.clearImage();
        int i10 = this.f43695e0;
        ArrayList<TLRPC.TL_forumTopic> topics = MessagesController.getInstance(i10).getTopicsController().getTopics(-this.f43700i0);
        if (topics != null && topics.size() > 1) {
            tL_forumTopic = null;
            for (int i11 = 0; i11 < topics.size(); i11++) {
                TLRPC.TL_forumTopic tL_forumTopic2 = topics.get(i11);
                if (tL_forumTopic2.f22080id != this.f43699h0 && !tL_forumTopic2.hidden && tL_forumTopic2.unread_count > 0 && (tL_forumTopic == null || ((message = tL_forumTopic2.topMessage) != null && (message2 = tL_forumTopic.topMessage) != null && message.date > message2.date))) {
                    tL_forumTopic = tL_forumTopic2;
                }
            }
        } else {
            tL_forumTopic = null;
        }
        if (tL_forumTopic != null) {
            this.R = false;
            this.H = tL_forumTopic;
            int i12 = tL_forumTopic.f22080id;
            org.telegram.ui.ActionBar.u6 u6Var = this.f43701j0;
            if (i12 == 1) {
                View view3 = this.f43689a0;
                if (view3 != null && (t5Var2 = this.f43702k0) != null) {
                    t5Var2.o(view3);
                }
                this.f43702k0 = null;
                Context context = this.T.getContext();
                int i13 = org.telegram.ui.ActionBar.y6.Ac;
                pg.c c10 = pg.d.c(context, 1.0f, org.telegram.ui.ActionBar.y6.w0(i13, u6Var), true);
                if (c10 != null) {
                    cVar = c10;
                }
                this.f43703l0 = cVar;
                this.m0 = org.telegram.ui.ActionBar.y6.w0(i13, u6Var);
                imageReceiver.setImageBitmap(c10);
            } else if (tL_forumTopic.icon_emoji_id != 0) {
                org.telegram.ui.Components.t5 t5Var3 = this.f43702k0;
                if (t5Var3 == null || t5Var3.i() != tL_forumTopic.icon_emoji_id) {
                    org.telegram.ui.Components.t5 t5Var4 = this.f43702k0;
                    if (t5Var4 != null && (view = this.f43689a0) != null) {
                        t5Var4.o(view);
                    }
                    org.telegram.ui.Components.t5 t5Var5 = new org.telegram.ui.Components.t5(22, i10, tL_forumTopic.icon_emoji_id);
                    this.f43702k0 = t5Var5;
                    int w02 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23454ic, u6Var);
                    this.f43705n0 = w02;
                    t5Var5.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
                }
                org.telegram.ui.Components.t5 t5Var6 = this.f43702k0;
                if (t5Var6 != null && (view2 = this.f43689a0) != null) {
                    t5Var6.a(view2);
                }
                imageReceiver.setImageBitmap((Bitmap) null);
            } else {
                View view4 = this.f43689a0;
                if (view4 != null && (t5Var = this.f43702k0) != null) {
                    t5Var.o(view4);
                }
                this.f43702k0 = null;
                imageReceiver.setImageBitmap(pg.d.e(tL_forumTopic));
            }
            int i14 = tL_forumTopic.unread_count;
            this.f43693c0.c(i14, false);
            if (i14 > 0) {
                z10 = true;
            }
            this.f43691b0 = z10;
            return;
        }
        this.H = null;
        this.R = true;
    }
}
