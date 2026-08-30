package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
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
    public int B;
    public final ImageReceiver C;
    public TLRPC.Chat D;
    public TLRPC.TL_forumTopic E;
    public long F;
    public AnimatorSet G;
    public float H;
    public float I;
    public boolean J;
    public boolean K;
    public float L;
    public long M;
    public float N;
    public boolean O;
    public float P;
    public final View Q;
    public long R;
    public boolean S;
    public boolean T;
    public final boolean U;
    public zi V;
    public long W;
    public View X;
    public boolean Y;
    public final org.telegram.ui.Components.tq Z;
    public int f38693a;
    public final int[] f38694a0;
    public int f38695b;
    public final int f38696b0;
    public int f38697c;
    public final int f38698c0;
    public float d;
    public final int f38699d0;
    public final Paint e;
    public final long f38700e0;
    public final TextPaint f38701f;
    public final long f38702f0;
    public final org.telegram.ui.ActionBar.f6 f38703g0;
    public final TextPaint h;
    public org.telegram.ui.Components.l5 f38704h0;
    public final Paint f38705n;
    public final Path f38706r;
    public StaticLayout f38707s;
    public StaticLayout v;
    public StaticLayout f38708w;
    public int f38709x;
    public int f38710y;

    public tp(int i10, View view, long j10, int i11, int i12, long j11, org.telegram.ui.ActionBar.f6 f6Var) {
        Paint paint = new Paint(1);
        this.e = paint;
        TextPaint textPaint = new TextPaint(1);
        this.f38701f = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.h = textPaint2;
        Paint paint2 = new Paint(1);
        this.f38705n = paint2;
        this.f38706r = new Path();
        this.F = 0L;
        this.Y = true;
        org.telegram.ui.Components.tq tqVar = new org.telegram.ui.Components.tq(null, true, null);
        this.Z = tqVar;
        this.f38694a0 = new int[3];
        this.Q = view;
        this.f38696b0 = i10;
        this.f38702f0 = j10;
        this.f38698c0 = i11;
        this.f38699d0 = i12;
        this.f38700e0 = j11;
        this.U = MessagesController.getInstance(i10).isForum(j10);
        this.f38703g0 = f6Var;
        this.C = new ImageReceiver(view);
        paint.setStrokeWidth(AndroidUtilities.dpf2(2.8f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        tqVar.f29024z = 3;
        tqVar.I = 1;
        tqVar.f29007g = true;
        tqVar.d = d("paintChatActionBackground");
        tqVar.e = textPaint;
        textPaint.setTextSize(AndroidUtilities.dp(13.0f));
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint2.setTextSize(AndroidUtilities.dp(14.0f));
        paint2.setColor(-16777216);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }

    public static TLRPC.Dialog c(long j10, int i10, int i11, boolean z4, int[] iArr) {
        ArrayList<TLRPC.Dialog> dialogs;
        TLRPC.Dialog c3;
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
                TLRPC.Chat chat = messagesController.getChat(Long.valueOf(-dialog.f19188id));
                if (chat != null && dialog.f19188id != j10 && dialog.unread_count > 0 && DialogObject.isChannel(dialog) && !chat.megagroup && !messagesController.isPromoDialog(dialog.f19188id, false) && messagesController.getRestrictionReason(chat.restriction_reason) == null) {
                    return dialog;
                }
            }
            if (z4) {
                if (i11 != 0) {
                    int i14 = 0;
                    while (i14 < messagesController.dialogFilters.size()) {
                        int i15 = messagesController.dialogFilters.get(i14).f16669id;
                        if (i11 != i15) {
                            long j12 = j10;
                            int i16 = i10;
                            int[] iArr3 = iArr;
                            TLRPC.Dialog c10 = c(j12, i16, i15, false, iArr3);
                            j11 = j12;
                            i12 = i16;
                            iArr2 = iArr3;
                            if (c10 != null) {
                                if (iArr2 != null) {
                                    iArr2[0] = 1;
                                }
                                return c10;
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
                    if (i17 != keyAt && (c3 = c(j13, keyAt, 0, false, iArr4)) != null) {
                        if (iArr4 != null) {
                            iArr4[0] = 1;
                        }
                        return c3;
                    }
                }
                return null;
            }
            return null;
        }
        return null;
    }

    public final void a(Canvas canvas, qj qjVar, float f10, float f11) {
        float f12;
        int i10;
        int i11;
        RectF rectF;
        int i12;
        float f13;
        float f14;
        float f15;
        float f16;
        org.telegram.ui.Components.tq tqVar;
        float f17;
        float f18;
        TextPaint textPaint;
        boolean a12;
        float f19;
        int i13;
        float f20;
        float f21;
        int i14;
        int i15;
        Paint paint;
        float f22;
        float f23;
        boolean a13;
        TextPaint textPaint2;
        ImageReceiver imageReceiver;
        RectF rectF2;
        float f24;
        float f25;
        float w10;
        int i16;
        boolean a14;
        Canvas canvas2 = canvas;
        if (this.X != qjVar) {
            this.X = qjVar;
            org.telegram.ui.Components.l5 l5Var = this.f38704h0;
            if (l5Var != null) {
                l5Var.a(qjVar);
            }
        }
        org.telegram.ui.Components.tq tqVar2 = this.Z;
        tqVar2.H = qjVar;
        RectF rectF3 = tqVar2.f29006f;
        float dp = AndroidUtilities.dp(110.0f) * f10;
        if (dp < AndroidUtilities.dp(8.0f)) {
            return;
        }
        if (f10 < 0.2f) {
            f12 = 5.0f * f10 * f11;
        } else {
            f12 = f11;
        }
        org.telegram.ui.ActionBar.j6.q(0.0f, qjVar.getMeasuredHeight() - dp, this.f38697c, qjVar.getMeasuredHeight());
        int i17 = org.telegram.ui.ActionBar.j6.ic;
        org.telegram.ui.ActionBar.f6 f6Var = this.f38703g0;
        int v02 = org.telegram.ui.ActionBar.j6.v0(i17, f6Var);
        TextPaint textPaint3 = this.f38701f;
        textPaint3.setColor(v02);
        int v03 = org.telegram.ui.ActionBar.j6.v0(i17, f6Var);
        Paint paint2 = this.e;
        paint2.setColor(v03);
        this.h.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Vd, f6Var));
        int alpha = d("paintChatActionBackground").getAlpha();
        int alpha2 = org.telegram.ui.ActionBar.j6.f19974h2.getAlpha();
        int alpha3 = textPaint3.getAlpha();
        int alpha4 = paint2.getAlpha();
        org.telegram.ui.ActionBar.j6.f19974h2.setAlpha((int) (alpha2 * f12));
        int i18 = (int) (alpha * f12);
        d("paintChatActionBackground").setAlpha(i18);
        int i19 = (int) (alpha3 * f12);
        textPaint3.setAlpha(i19);
        int i20 = (f10 > 1.0f ? 1 : (f10 == 1.0f ? 0 : -1));
        if ((i20 >= 0 && this.N < 1.0f) || (f10 < 1.0f && this.N == 1.0f)) {
            i10 = i19;
            i11 = i18;
            long currentTimeMillis = System.currentTimeMillis();
            rectF = rectF3;
            i12 = alpha2;
            if (currentTimeMillis - this.M > 100) {
                try {
                    qjVar.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                this.M = currentTimeMillis;
            }
            this.N = f10;
        } else {
            i10 = i19;
            i11 = i18;
            rectF = rectF3;
            i12 = alpha2;
        }
        if (i20 == 0 && !this.J) {
            this.J = true;
            this.K = true;
            g(qjVar, true);
            this.R = System.currentTimeMillis();
        } else if (i20 != 0 && this.J) {
            this.J = false;
            g(qjVar, false);
        }
        float f26 = this.f38697c / 2.0f;
        float f27 = this.I * (-AndroidUtilities.dp(4.0f));
        if (this.O) {
            f13 = dp - f27;
        } else {
            f13 = dp;
        }
        float f28 = f13 / 2.0f;
        float max = Math.max(0.0f, Math.min(this.d, (f28 - (AndroidUtilities.dp(16.0f) * f10)) - AndroidUtilities.dp(4.0f)));
        float max2 = (1.0f - this.H) * ((Math.max(0.0f, Math.min(this.d * f10, f28 - (AndroidUtilities.dp(8.0f) * f10))) * 2.0f) - AndroidUtilities.dp2(16.0f));
        float f29 = this.H;
        float dp2 = (AndroidUtilities.dp(56.0f) * f29) + max2;
        if (f29 >= 1.0f && !this.O) {
            paint = paint2;
            tqVar = tqVar2;
            f17 = dp2;
            f18 = f12;
            textPaint = textPaint3;
            i13 = i10;
            f20 = f27;
            f14 = 36.0f;
            f19 = f26;
            i15 = alpha;
            i14 = i11;
            f21 = f13;
        } else {
            f14 = 36.0f;
            float f30 = -f13;
            float f31 = f13;
            float dp3 = (this.H * (AndroidUtilities.dp(56.0f) + f30)) + ((1.0f - this.H) * (-AndroidUtilities.dp(8.0f)));
            RectF rectF4 = AndroidUtilities.rectTmp;
            int i21 = i11;
            rectF4.set(f26 - max, f30, f26 + max, dp3);
            if (this.H > 0.0f && !this.O) {
                float dp4 = AndroidUtilities.dp(16.0f) * this.H;
                rectF4.inset(dp4, dp4);
                f15 = 1.0f - this.H;
            } else {
                f15 = 1.0f;
            }
            if (this.T) {
                Path path = this.f38706r;
                path.reset();
                float width = rectF4.width() * 0.2f;
                float width2 = rectF4.width() * 0.1f;
                float width3 = rectF4.width() * 0.03f;
                f16 = f30;
                float f32 = width2 / 2.0f;
                float height = rectF4.height() - width2;
                tqVar = tqVar2;
                f17 = dp2;
                path.moveTo(rectF4.right, rectF4.top + width + width2);
                float f33 = -width;
                path.rQuadTo(0.0f, f33, f33, f33);
                float f34 = width * 2.0f;
                float f35 = f32 * 2.0f;
                f18 = f12;
                path.rLineTo((((-(rectF4.width() - f34)) / 2.0f) + f35) - width3, 0.0f);
                float f36 = -f32;
                float f37 = f36 / 2.0f;
                float f38 = f36 * 2.0f;
                textPaint = textPaint3;
                float f39 = (-width2) / 2.0f;
                path.rQuadTo(f37, 0.0f, f38, f39);
                path.rQuadTo(f37, f39, f38, f39);
                path.rLineTo(((-(rectF4.width() - f34)) / 2.0f) + f35 + width3, 0.0f);
                path.rQuadTo(f33, 0.0f, f33, width);
                path.rLineTo(0.0f, (height + width2) - f34);
                path.rQuadTo(0.0f, width, width, width);
                path.rLineTo(rectF4.width() - f34, 0.0f);
                path.rQuadTo(width, 0.0f, width, f33);
                path.rLineTo(0.0f, -(height - f34));
                path.close();
                canvas2.drawPath(path, d("paintChatActionBackground"));
                if (f6Var != null) {
                    a13 = f6Var.m0();
                } else {
                    a13 = org.telegram.ui.ActionBar.j6.a1();
                }
                if (a13) {
                    canvas2.drawPath(path, org.telegram.ui.ActionBar.j6.f19974h2);
                }
            } else {
                f16 = f30;
                tqVar = tqVar2;
                f17 = dp2;
                f18 = f12;
                textPaint = textPaint3;
                int alpha5 = d("paintChatActionBackground").getAlpha();
                d("paintChatActionBackground").setAlpha((int) (alpha5 * f15));
                float f40 = this.d;
                canvas2.drawRoundRect(rectF4, f40, f40, d("paintChatActionBackground"));
                d("paintChatActionBackground").setAlpha(alpha5);
                if (f6Var != null) {
                    a12 = f6Var.m0();
                } else {
                    a12 = org.telegram.ui.ActionBar.j6.a1();
                }
                if (a12) {
                    int alpha6 = org.telegram.ui.ActionBar.j6.f19974h2.getAlpha();
                    org.telegram.ui.ActionBar.j6.f19974h2.setAlpha((int) (alpha6 * f15));
                    float f41 = this.d;
                    canvas2.drawRoundRect(rectF4, f41, f41, org.telegram.ui.ActionBar.j6.f19974h2);
                    org.telegram.ui.ActionBar.j6.f19974h2.setAlpha(alpha6);
                }
            }
            float w11 = e2.c.w(1.0f, f10, AndroidUtilities.dp(8.0f), f16 + AndroidUtilities.dp(24.0f)) - (AndroidUtilities.dp(36.0f) * this.H);
            canvas2.save();
            rectF4.inset(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f));
            canvas2.clipRect(rectF4);
            float f42 = this.H;
            if (f42 > 0.0f) {
                paint2.setAlpha((int) ((1.0f - f42) * 255.0f));
            }
            canvas2.save();
            float dp5 = (AndroidUtilities.dp(24.0f) * f10) / AndroidUtilities.dpf2(24.0f);
            canvas2.scale(dp5, dp5, f26, w11 - AndroidUtilities.dp(20.0f));
            canvas2.translate(f26 - AndroidUtilities.dp2(12.0f), w11 - AndroidUtilities.dp(12.0f));
            f19 = f26;
            i13 = i10;
            f20 = f27;
            f21 = f31;
            i14 = i21;
            i15 = alpha;
            canvas2.drawLine(AndroidUtilities.dpf2(12.5f), AndroidUtilities.dpf2(4.0f), AndroidUtilities.dpf2(12.5f), AndroidUtilities.dpf2(22.0f), paint2);
            canvas.drawLine(AndroidUtilities.dpf2(3.5f), AndroidUtilities.dpf2(12.0f), AndroidUtilities.dpf2(12.5f), AndroidUtilities.dpf2(3.5f), paint2);
            canvas2 = canvas;
            canvas2.drawLine(AndroidUtilities.dpf2(21.5f), AndroidUtilities.dpf2(12.0f), AndroidUtilities.dpf2(12.5f), AndroidUtilities.dpf2(3.5f), paint2);
            canvas2.restore();
            if (this.O) {
                float A = e2.c.A(f16 - AndroidUtilities.dp(2.0f), this.H, (1.0f - this.H) * (((-AndroidUtilities.dp(8.0f)) - (AndroidUtilities.dp2(8.0f) * f10)) - f17), f20);
                paint2.setAlpha(alpha4);
                canvas2.save();
                canvas2.scale(f10, f10, f19, AndroidUtilities.dp(28.0f) + A);
                float dp6 = A + AndroidUtilities.dp(28.0f);
                if (!this.K) {
                    paint = paint2;
                } else {
                    float f43 = this.L;
                    if (f43 < 1.0f) {
                        float f44 = f43 + 0.07272727f;
                        this.L = f44;
                        if (f44 > 1.0f) {
                            this.L = 1.0f;
                        }
                    }
                    float f45 = this.L;
                    if (f45 > 0.5f) {
                        f22 = 1.0f;
                    } else {
                        f22 = f45 / 0.5f;
                    }
                    if (f45 < 0.5f) {
                        f23 = 0.0f;
                    } else {
                        f23 = (f45 - 0.5f) / 0.5f;
                    }
                    canvas2.save();
                    canvas2.clipRect(rectF4);
                    canvas2.translate(f19 - AndroidUtilities.dp(24.0f), dp6 - AndroidUtilities.dp(24.0f));
                    float dp7 = AndroidUtilities.dp(16.0f);
                    float dp8 = AndroidUtilities.dp(26.0f);
                    float dp9 = AndroidUtilities.dp(22.0f);
                    float dp10 = AndroidUtilities.dp(32.0f);
                    float dp11 = AndroidUtilities.dp(32.0f);
                    float dp12 = AndroidUtilities.dp(20.0f);
                    float f46 = 1.0f - f22;
                    canvas.drawLine(dp7, dp8, (dp9 * f22) + (dp7 * f46), (f22 * dp10) + (f46 * dp8), paint2);
                    if (f23 > 0.0f) {
                        float f47 = 1.0f - f23;
                        float f48 = (dp11 * f23) + (dp9 * f47);
                        float f49 = (dp12 * f23) + (f47 * dp10);
                        canvas2 = canvas;
                        canvas2.drawLine(dp9, dp10, f48, f49, paint2);
                    } else {
                        canvas2 = canvas;
                    }
                    paint = paint2;
                    canvas2.restore();
                }
                canvas2.restore();
            } else {
                paint = paint2;
            }
            canvas2.restore();
        }
        if (this.f38707s != null && this.H > 0.0f) {
            d("paintChatActionBackground").setAlpha(i14);
            textPaint2 = textPaint;
            textPaint2.setAlpha(i13);
            float dp13 = (((1.0f - this.H) * AndroidUtilities.dp(20.0f)) - (AndroidUtilities.dp(f14) * this.H)) + f20;
            RectF rectF5 = AndroidUtilities.rectTmp;
            float f50 = (i16 - this.f38709x) / 2.0f;
            rectF5.set(f50, dp13, this.f38697c - f50, this.f38707s.getHeight() + dp13);
            rectF5.inset(-AndroidUtilities.dp(8.0f), -AndroidUtilities.dp(4.0f));
            canvas2.drawRoundRect(rectF5, AndroidUtilities.dp(15.0f), AndroidUtilities.dp(15.0f), d("paintChatActionBackground"));
            if (f6Var != null) {
                a14 = f6Var.m0();
            } else {
                a14 = org.telegram.ui.ActionBar.j6.a1();
            }
            if (a14) {
                canvas2.drawRoundRect(rectF5, AndroidUtilities.dp(15.0f), AndroidUtilities.dp(15.0f), org.telegram.ui.ActionBar.j6.f19974h2);
            }
            canvas2.save();
            canvas2.translate((this.f38697c - this.f38709x) / 2.0f, dp13);
            this.f38707s.draw(canvas2);
            canvas2.restore();
        } else {
            textPaint2 = textPaint;
        }
        if (!this.O && f17 > 0.0f) {
            float A2 = e2.c.A((-f21) + AndroidUtilities.dp(4.0f), this.H, (1.0f - this.H) * (((-AndroidUtilities.dp(8.0f)) - (AndroidUtilities.dp2(8.0f) * f10)) - f17), f20);
            org.telegram.ui.Components.l5 l5Var2 = this.f38704h0;
            if (l5Var2 == null || (imageReceiver = l5Var2.f26569k) == null) {
                imageReceiver = this.C;
            }
            ImageReceiver imageReceiver2 = imageReceiver;
            imageReceiver2.setAlpha(f18);
            float f51 = f17 / 2.0f;
            imageReceiver2.setRoundRadius((int) f51);
            float f52 = f17;
            imageReceiver2.setImageCoords(f19 - f51, A2, f52, f52);
            if (this.U && imageReceiver2.getDrawable() != null && (imageReceiver2.getDrawable() instanceof org.telegram.ui.Components.nq) && (((org.telegram.ui.Components.nq) imageReceiver2.getDrawable()).f27336b instanceof org.telegram.ui.Components.n80)) {
                ((org.telegram.ui.Components.n80) ((org.telegram.ui.Components.nq) imageReceiver2.getDrawable()).f27336b).f27224i = f10;
            }
            if (this.H > 0.0f && this.Y) {
                canvas2.saveLayerAlpha(imageReceiver2.getImageX(), imageReceiver2.getImageY(), imageReceiver2.getImageX() + imageReceiver2.getImageWidth(), imageReceiver2.getImageY() + imageReceiver2.getImageHeight(), 255, 31);
                imageReceiver2.draw(canvas2);
                float f53 = this.H;
                org.telegram.ui.Components.tq tqVar3 = tqVar;
                tqVar3.e(tqVar3.f29018s);
                canvas2.scale(f53, f53, (tqVar3.f29018s / 2.0f) + tqVar3.A + AndroidUtilities.dp(12.0f) + f19, (A2 - AndroidUtilities.dp(6.0f)) + AndroidUtilities.dp(14.0f));
                canvas2.translate(AndroidUtilities.dp(12.0f) + f19, A2 - AndroidUtilities.dp(6.0f));
                float f54 = tqVar3.C;
                float f55 = tqVar3.f29011l;
                if (f55 != 1.0f) {
                    f24 = 6.0f;
                    int i22 = tqVar3.f29005c;
                    if (i22 == 0 || i22 == 1) {
                        rectF2 = rectF;
                        f25 = 14.0f;
                        tqVar3.e(tqVar3.f29018s);
                        float dp14 = (tqVar3.f29022x - AndroidUtilities.dp(f54 * 2.0f)) / 2.0f;
                        float f56 = tqVar3.B;
                        rectF2.set(f56, dp14, tqVar3.f29018s + f56 + AndroidUtilities.dp(11.0f), AndroidUtilities.dp(23.0f) + dp14);
                    } else {
                        float f57 = f55 * 2.0f;
                        if (f57 > 1.0f) {
                            f57 = 1.0f;
                        }
                        float dp15 = (tqVar3.f29022x - AndroidUtilities.dp(f54 * 2.0f)) / 2.0f;
                        int i23 = tqVar3.f29018s;
                        int i24 = tqVar3.f29017r;
                        if (i23 == i24) {
                            w10 = i23;
                            f25 = 14.0f;
                        } else {
                            f25 = 14.0f;
                            w10 = e2.c.w(1.0f, f57, i24, i23 * f57);
                        }
                        tqVar3.e(w10);
                        float f58 = tqVar3.B;
                        rectF2 = rectF;
                        rectF2.set(f58, dp15, w10 + f58 + AndroidUtilities.dp(11.0f), AndroidUtilities.dp(23.0f) + dp15);
                    }
                } else {
                    rectF2 = rectF;
                    f24 = 6.0f;
                    f25 = 14.0f;
                    tqVar3.e(tqVar3.f29018s);
                    float dp16 = (tqVar3.f29022x - AndroidUtilities.dp(f54 * 2.0f)) / 2.0f;
                    float f59 = tqVar3.B;
                    rectF2.set(f59, dp16, tqVar3.f29018s + f59 + AndroidUtilities.dp(11.0f), AndroidUtilities.dp(23.0f) + dp16);
                }
                rectF2.inset(-AndroidUtilities.dp(2.0f), -AndroidUtilities.dp(2.0f));
                canvas2.drawRoundRect(rectF2, rectF2.height() / 2.0f, rectF2.height() / 2.0f, this.f38705n);
                canvas2.restore();
                canvas2.save();
                float f60 = this.H;
                tqVar3.e(tqVar3.f29018s);
                canvas2.scale(f60, f60, (tqVar3.f29018s / 2.0f) + tqVar3.A + AndroidUtilities.dp(12.0f) + f19, (A2 - AndroidUtilities.dp(f24)) + AndroidUtilities.dp(f25));
                canvas2.translate(AndroidUtilities.dp(12.0f) + f19, A2 - AndroidUtilities.dp(f24));
                tqVar3.a(canvas2);
                canvas2.restore();
            } else {
                imageReceiver2.draw(canvas2);
            }
            imageReceiver2.setAlpha(1.0f);
        }
        d("paintChatActionBackground").setAlpha(i15);
        org.telegram.ui.ActionBar.j6.f19974h2.setAlpha(i12);
        textPaint2.setAlpha(alpha3);
        paint.setAlpha(alpha4);
    }

    public final void b(Canvas canvas, int i10, int i11) {
        int v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Xk, this.f38703g0);
        TextPaint textPaint = this.h;
        textPaint.setColor(v02);
        Paint d = d("paintChatComposeBackground");
        int alpha = d.getAlpha();
        int alpha2 = textPaint.getAlpha();
        d.setAlpha((int) (alpha * this.P));
        if (this.v != null) {
            float f10 = this.H;
            if (f10 < 1.0f) {
                textPaint.setAlpha((int) ((1.0f - f10) * alpha2 * this.P));
                float height = ((((i11 - i10) - this.v.getHeight()) / 2.0f) + i10) - (AndroidUtilities.dp(10.0f) * this.H);
                canvas.save();
                canvas.translate((this.f38697c - this.f38710y) / 2.0f, height);
                this.v.draw(canvas);
                canvas.restore();
            }
        }
        if (this.f38708w != null) {
            float f11 = this.H;
            if (f11 > 0.0f) {
                textPaint.setAlpha((int) (alpha2 * f11 * this.P));
                float dp = ((1.0f - this.H) * AndroidUtilities.dp(10.0f)) + (((i11 - i10) - this.f38708w.getHeight()) / 2.0f) + i10;
                canvas.save();
                canvas.translate((this.f38697c - this.B) / 2.0f, dp);
                this.f38708w.draw(canvas);
                canvas.restore();
            }
        }
        textPaint.setAlpha(alpha2);
        d.setAlpha(alpha);
    }

    public final Paint d(String str) {
        Paint paint;
        org.telegram.ui.ActionBar.f6 f6Var = this.f38703g0;
        if (f6Var != null) {
            paint = f6Var.G(str);
        } else {
            paint = null;
        }
        if (paint != null) {
            return paint;
        }
        return org.telegram.ui.ActionBar.j6.S0(str);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        TLRPC.Dialog dialog;
        if (this.W != 0 && (dialog = (TLRPC.Dialog) MessagesController.getInstance(this.f38696b0).dialogs_dict.f(this.W)) != null) {
            int i12 = dialog.unread_count;
            boolean z4 = true;
            this.Z.c(i12, true);
            if (i12 <= 0) {
                z4 = false;
            }
            this.Y = z4;
            View view = this.X;
            if (view != null) {
                view.invalidate();
            }
        }
    }

    public final boolean e() {
        if (this.P > 0.0f && !this.O) {
            return true;
        }
        return false;
    }

    public final void f() {
        View view;
        this.C.onAttachedToWindow();
        org.telegram.ui.Components.l5 l5Var = this.f38704h0;
        if (l5Var != null && (view = this.X) != null) {
            l5Var.a(view);
        }
        NotificationCenter.getInstance(this.f38696b0).addObserver(this, NotificationCenter.updateInterfaces);
    }

    public final void g(final View view, boolean z4) {
        AnimatorSet animatorSet = this.G;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
            this.G.cancel();
        }
        if (z4) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.H, 1.0f);
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                public final tp f38096b;

                {
                    this.f38096b = this;
                }

                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    switch (r3) {
                        case 0:
                            tp tpVar = this.f38096b;
                            tpVar.getClass();
                            tpVar.H = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            view.invalidate();
                            tpVar.Q.invalidate();
                            return;
                        case 1:
                            tp tpVar2 = this.f38096b;
                            tpVar2.getClass();
                            tpVar2.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            view.invalidate();
                            return;
                        case 2:
                            tp tpVar3 = this.f38096b;
                            tpVar3.getClass();
                            tpVar3.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            view.invalidate();
                            return;
                        case 3:
                            tp tpVar4 = this.f38096b;
                            tpVar4.getClass();
                            tpVar4.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            view.invalidate();
                            return;
                        default:
                            tp tpVar5 = this.f38096b;
                            tpVar5.getClass();
                            tpVar5.H = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            tpVar5.Q.invalidate();
                            view.invalidate();
                            return;
                    }
                }
            });
            ofFloat.setInterpolator(org.telegram.ui.Components.nr.h);
            ofFloat.setDuration(250L);
            this.I = 0.0f;
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                public final tp f38096b;

                {
                    this.f38096b = this;
                }

                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    switch (r3) {
                        case 0:
                            tp tpVar = this.f38096b;
                            tpVar.getClass();
                            tpVar.H = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            view.invalidate();
                            tpVar.Q.invalidate();
                            return;
                        case 1:
                            tp tpVar2 = this.f38096b;
                            tpVar2.getClass();
                            tpVar2.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            view.invalidate();
                            return;
                        case 2:
                            tp tpVar3 = this.f38096b;
                            tpVar3.getClass();
                            tpVar3.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            view.invalidate();
                            return;
                        case 3:
                            tp tpVar4 = this.f38096b;
                            tpVar4.getClass();
                            tpVar4.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            view.invalidate();
                            return;
                        default:
                            tp tpVar5 = this.f38096b;
                            tpVar5.getClass();
                            tpVar5.H = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            tpVar5.Q.invalidate();
                            view.invalidate();
                            return;
                    }
                }
            });
            org.telegram.ui.Components.nr nrVar = org.telegram.ui.Components.nr.f27349j;
            ofFloat2.setInterpolator(nrVar);
            ofFloat2.setDuration(180L);
            ValueAnimator ofFloat3 = ValueAnimator.ofFloat(1.0f, -0.5f);
            ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                public final tp f38096b;

                {
                    this.f38096b = this;
                }

                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    switch (r3) {
                        case 0:
                            tp tpVar = this.f38096b;
                            tpVar.getClass();
                            tpVar.H = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            view.invalidate();
                            tpVar.Q.invalidate();
                            return;
                        case 1:
                            tp tpVar2 = this.f38096b;
                            tpVar2.getClass();
                            tpVar2.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            view.invalidate();
                            return;
                        case 2:
                            tp tpVar3 = this.f38096b;
                            tpVar3.getClass();
                            tpVar3.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            view.invalidate();
                            return;
                        case 3:
                            tp tpVar4 = this.f38096b;
                            tpVar4.getClass();
                            tpVar4.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            view.invalidate();
                            return;
                        default:
                            tp tpVar5 = this.f38096b;
                            tpVar5.getClass();
                            tpVar5.H = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            tpVar5.Q.invalidate();
                            view.invalidate();
                            return;
                    }
                }
            });
            ofFloat3.setInterpolator(nrVar);
            ofFloat3.setDuration(120L);
            ValueAnimator ofFloat4 = ValueAnimator.ofFloat(-0.5f, 0.0f);
            ofFloat4.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                public final tp f38096b;

                {
                    this.f38096b = this;
                }

                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    switch (r3) {
                        case 0:
                            tp tpVar = this.f38096b;
                            tpVar.getClass();
                            tpVar.H = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            view.invalidate();
                            tpVar.Q.invalidate();
                            return;
                        case 1:
                            tp tpVar2 = this.f38096b;
                            tpVar2.getClass();
                            tpVar2.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            view.invalidate();
                            return;
                        case 2:
                            tp tpVar3 = this.f38096b;
                            tpVar3.getClass();
                            tpVar3.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            view.invalidate();
                            return;
                        case 3:
                            tp tpVar4 = this.f38096b;
                            tpVar4.getClass();
                            tpVar4.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            view.invalidate();
                            return;
                        default:
                            tp tpVar5 = this.f38096b;
                            tpVar5.getClass();
                            tpVar5.H = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            tpVar5.Q.invalidate();
                            view.invalidate();
                            return;
                    }
                }
            });
            ofFloat4.setInterpolator(nrVar);
            ofFloat4.setDuration(100L);
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.G = animatorSet2;
            animatorSet2.addListener(new dg.y2(12, this, view));
            AnimatorSet animatorSet3 = new AnimatorSet();
            animatorSet3.playSequentially(ofFloat2, ofFloat3, ofFloat4);
            this.G.playTogether(ofFloat, animatorSet3);
            this.G.start();
            return;
        }
        ValueAnimator ofFloat5 = ValueAnimator.ofFloat(this.H, 0.0f);
        ofFloat5.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
            public final tp f38096b;

            {
                this.f38096b = this;
            }

            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (r3) {
                    case 0:
                        tp tpVar = this.f38096b;
                        tpVar.getClass();
                        tpVar.H = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        view.invalidate();
                        tpVar.Q.invalidate();
                        return;
                    case 1:
                        tp tpVar2 = this.f38096b;
                        tpVar2.getClass();
                        tpVar2.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        view.invalidate();
                        return;
                    case 2:
                        tp tpVar3 = this.f38096b;
                        tpVar3.getClass();
                        tpVar3.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        view.invalidate();
                        return;
                    case 3:
                        tp tpVar4 = this.f38096b;
                        tpVar4.getClass();
                        tpVar4.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        view.invalidate();
                        return;
                    default:
                        tp tpVar5 = this.f38096b;
                        tpVar5.getClass();
                        tpVar5.H = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        tpVar5.Q.invalidate();
                        view.invalidate();
                        return;
                }
            }
        });
        ofFloat5.setInterpolator(org.telegram.ui.Components.nr.f27346f);
        ofFloat5.setDuration(220L);
        AnimatorSet animatorSet4 = new AnimatorSet();
        this.G = animatorSet4;
        animatorSet4.playTogether(ofFloat5);
        this.G.start();
    }

    public final void h() {
        boolean z4;
        boolean z10 = false;
        this.S = false;
        this.E = null;
        TLRPC.Dialog c3 = c(this.f38702f0, this.f38698c0, this.f38699d0, true, this.f38694a0);
        if (c3 != null) {
            this.W = c3.f19188id;
            int[] iArr = this.f38694a0;
            if (iArr[0] == 1) {
                z4 = true;
            } else {
                z4 = false;
            }
            this.T = z4;
            this.f38693a = iArr[1];
            this.f38695b = iArr[2];
            this.O = false;
            int i10 = this.f38696b0;
            TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-c3.f19188id));
            this.D = chat;
            if (chat == null) {
                this.D = MessagesController.getInstance(i10).getChat(Long.valueOf(c3.f19188id));
            }
            org.telegram.ui.Components.z8 z8Var = new org.telegram.ui.Components.z8((org.telegram.ui.ActionBar.f6) null);
            z8Var.k(i10, this.D);
            this.C.setImage(ImageLocation.getForChat(this.D, 1), "50_50", z8Var, null, UserConfig.getInstance(0).getCurrentUser(), 0);
            MessagesController.getInstance(i10).ensureMessagesLoaded(c3.f19188id, 0, null);
            int i11 = c3.unread_count;
            this.Z.c(i11, false);
            if (i11 > 0) {
                z10 = true;
            }
            this.Y = z10;
            return;
        }
        this.D = null;
        this.T = false;
        this.O = true;
    }

    public final void i(TLRPC.Chat chat) {
        boolean z4;
        int i10;
        if (chat == null) {
            h();
            return;
        }
        this.W = -chat.f19184id;
        int[] iArr = this.f38694a0;
        boolean z10 = false;
        if (iArr[0] == 1) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.T = z4;
        this.f38693a = iArr[1];
        this.f38695b = iArr[2];
        this.O = false;
        this.D = chat;
        org.telegram.ui.Components.z8 z8Var = new org.telegram.ui.Components.z8((org.telegram.ui.ActionBar.f6) null);
        TLRPC.Chat chat2 = this.D;
        int i11 = this.f38696b0;
        z8Var.k(i11, chat2);
        this.C.setImage(ImageLocation.getForChat(this.D, 1), "50_50", z8Var, null, UserConfig.getInstance(0).getCurrentUser(), 0);
        MessagesController.getInstance(i11).ensureMessagesLoaded(-chat.f19184id, 0, null);
        TLRPC.Dialog dialog = MessagesController.getInstance(i11).getDialog(-chat.f19184id);
        if (dialog == null) {
            i10 = 0;
        } else {
            i10 = dialog.unread_count;
        }
        this.Z.c(i10, false);
        if (i10 > 0) {
            z10 = true;
        }
        this.Y = z10;
        this.S = true;
        this.E = null;
    }

    public final void j() {
        TLRPC.TL_forumTopic tL_forumTopic;
        org.telegram.ui.Components.l5 l5Var;
        View view;
        View view2;
        org.telegram.ui.Components.l5 l5Var2;
        TLRPC.Message message;
        TLRPC.Message message2;
        boolean z4 = false;
        this.S = false;
        this.T = false;
        this.D = null;
        this.W = 0L;
        ImageReceiver imageReceiver = this.C;
        imageReceiver.clearImage();
        int i10 = this.f38696b0;
        ArrayList<TLRPC.TL_forumTopic> topics = MessagesController.getInstance(i10).getTopicsController().getTopics(-this.f38702f0);
        if (topics != null && topics.size() > 1) {
            tL_forumTopic = null;
            for (int i11 = 0; i11 < topics.size(); i11++) {
                TLRPC.TL_forumTopic tL_forumTopic2 = topics.get(i11);
                if (tL_forumTopic2.f19236id != this.f38700e0 && !tL_forumTopic2.hidden && tL_forumTopic2.unread_count > 0 && (tL_forumTopic == null || ((message = tL_forumTopic2.topMessage) != null && (message2 = tL_forumTopic.topMessage) != null && message.date > message2.date))) {
                    tL_forumTopic = tL_forumTopic2;
                }
            }
        } else {
            tL_forumTopic = null;
        }
        if (tL_forumTopic != null) {
            this.O = false;
            this.E = tL_forumTopic;
            int i12 = tL_forumTopic.f19236id;
            org.telegram.ui.ActionBar.f6 f6Var = this.f38703g0;
            if (i12 == 1) {
                View view3 = this.X;
                if (view3 != null && (l5Var2 = this.f38704h0) != null) {
                    l5Var2.o(view3);
                }
                this.f38704h0 = null;
                imageReceiver.setImageBitmap(ag.f.c(this.Q.getContext(), 1.0f, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Ac, f6Var), true));
            } else if (tL_forumTopic.icon_emoji_id != 0) {
                org.telegram.ui.Components.l5 l5Var3 = this.f38704h0;
                if (l5Var3 == null || l5Var3.i() != tL_forumTopic.icon_emoji_id) {
                    org.telegram.ui.Components.l5 l5Var4 = this.f38704h0;
                    if (l5Var4 != null && (view = this.X) != null) {
                        l5Var4.o(view);
                    }
                    org.telegram.ui.Components.l5 l5Var5 = new org.telegram.ui.Components.l5(22, i10, tL_forumTopic.icon_emoji_id);
                    this.f38704h0 = l5Var5;
                    l5Var5.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.ic, f6Var), PorterDuff.Mode.SRC_IN));
                }
                org.telegram.ui.Components.l5 l5Var6 = this.f38704h0;
                if (l5Var6 != null && (view2 = this.X) != null) {
                    l5Var6.a(view2);
                }
                imageReceiver.setImageBitmap((Bitmap) null);
            } else {
                View view4 = this.X;
                if (view4 != null && (l5Var = this.f38704h0) != null) {
                    l5Var.o(view4);
                }
                this.f38704h0 = null;
                imageReceiver.setImageBitmap(ag.f.e(tL_forumTopic));
            }
            int i13 = tL_forumTopic.unread_count;
            this.Z.c(i13, false);
            if (i13 > 0) {
                z4 = true;
            }
            this.Y = z4;
            return;
        }
        this.E = null;
        this.O = true;
    }
}
