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
public final class zp implements NotificationCenter.NotificationCenterDelegate {
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
    public ej Y;
    public long Z;
    public int f40298a;
    public View f40299a0;
    public int f40300b;
    public boolean f40301b0;
    public int f40302c;
    public final org.telegram.ui.Components.vq f40303c0;
    public float d;
    public final int[] f40304d0;
    public final Paint e;
    public final int f40305e0;
    public final TextPaint f40306f;
    public final int f40307f0;
    public final int f40308g0;
    public final TextPaint h;
    public final long f40309h0;
    public final long f40310i0;
    public final org.telegram.ui.ActionBar.f6 f40311j0;
    public org.telegram.ui.Components.o5 f40312k0;
    public final Paint f40313n;
    public final Path f40314r;
    public StaticLayout f40315s;
    public StaticLayout v;
    public StaticLayout f40316w;
    public int f40317x;
    public int f40318y;

    public zp(int i10, View view, long j3, int i11, int i12, long j10, org.telegram.ui.ActionBar.f6 f6Var) {
        Paint paint = new Paint(1);
        this.e = paint;
        TextPaint textPaint = new TextPaint(1);
        this.f40306f = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.h = textPaint2;
        Paint paint2 = new Paint(1);
        this.f40313n = paint2;
        this.f40314r = new Path();
        this.I = 0L;
        this.f40301b0 = true;
        org.telegram.ui.Components.vq vqVar = new org.telegram.ui.Components.vq(null, true, null);
        this.f40303c0 = vqVar;
        this.f40304d0 = new int[3];
        this.T = view;
        this.f40305e0 = i10;
        this.f40310i0 = j3;
        this.f40307f0 = i11;
        this.f40308g0 = i12;
        this.f40309h0 = j10;
        this.X = MessagesController.getInstance(i10).isForum(j3);
        this.f40311j0 = f6Var;
        this.F = new ImageReceiver(view);
        paint.setStrokeWidth(AndroidUtilities.dpf2(2.8f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        vqVar.f29392z = 3;
        vqVar.I = 1;
        vqVar.f29375g = true;
        vqVar.d = d("paintChatActionBackground");
        vqVar.e = textPaint;
        textPaint.setTextSize(AndroidUtilities.dp(13.0f));
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint2.setTextSize(AndroidUtilities.dp(14.0f));
        paint2.setColor(-16777216);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }

    public static TLRPC.Dialog c(long j3, int i10, int i11, boolean z10, int[] iArr) {
        ArrayList<TLRPC.Dialog> dialogs;
        TLRPC.Dialog c10;
        long j10;
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
                TLRPC.Chat chat = messagesController.getChat(Long.valueOf(-dialog.f18125id));
                if (chat != null && dialog.f18125id != j3 && dialog.unread_count > 0 && DialogObject.isChannel(dialog) && !chat.megagroup && !messagesController.isPromoDialog(dialog.f18125id, false) && messagesController.getRestrictionReason(chat.restriction_reason) == null) {
                    return dialog;
                }
            }
            if (z10) {
                if (i11 != 0) {
                    int i14 = 0;
                    while (i14 < messagesController.dialogFilters.size()) {
                        int i15 = messagesController.dialogFilters.get(i14).f15613id;
                        if (i11 != i15) {
                            long j11 = j3;
                            int i16 = i10;
                            int[] iArr3 = iArr;
                            TLRPC.Dialog c11 = c(j11, i16, i15, false, iArr3);
                            j10 = j11;
                            i12 = i16;
                            iArr2 = iArr3;
                            if (c11 != null) {
                                if (iArr2 != null) {
                                    iArr2[0] = 1;
                                }
                                return c11;
                            }
                        } else {
                            j10 = j3;
                            i12 = i10;
                            iArr2 = iArr;
                        }
                        i14++;
                        i10 = i12;
                        j3 = j10;
                        iArr = iArr2;
                    }
                }
                long j12 = j3;
                int i17 = i10;
                int[] iArr4 = iArr;
                for (int i18 = 0; i18 < messagesController.dialogsByFolder.size(); i18++) {
                    int keyAt = messagesController.dialogsByFolder.keyAt(i18);
                    if (i17 != keyAt && (c10 = c(j12, keyAt, 0, false, iArr4)) != null) {
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

    public final void a(Canvas canvas, vj vjVar, float f7, float f10) {
        float f11;
        int i10;
        int i11;
        RectF rectF;
        int i12;
        float f12;
        float f13;
        float f14;
        float f15;
        org.telegram.ui.Components.vq vqVar;
        float f16;
        float f17;
        TextPaint textPaint;
        boolean a12;
        float f18;
        int i13;
        float f19;
        float f20;
        int i14;
        int i15;
        Paint paint;
        float f21;
        float f22;
        boolean a13;
        TextPaint textPaint2;
        ImageReceiver imageReceiver;
        RectF rectF2;
        float f23;
        float f24;
        float z10;
        int i16;
        boolean a14;
        Canvas canvas2 = canvas;
        if (this.f40299a0 != vjVar) {
            this.f40299a0 = vjVar;
            org.telegram.ui.Components.o5 o5Var = this.f40312k0;
            if (o5Var != null) {
                o5Var.a(vjVar);
            }
        }
        org.telegram.ui.Components.vq vqVar2 = this.f40303c0;
        vqVar2.H = vjVar;
        RectF rectF3 = vqVar2.f29374f;
        float dp = AndroidUtilities.dp(110.0f) * f7;
        if (dp < AndroidUtilities.dp(8.0f)) {
            return;
        }
        if (f7 < 0.2f) {
            f11 = 5.0f * f7 * f10;
        } else {
            f11 = f10;
        }
        org.telegram.ui.ActionBar.j6.q(0.0f, vjVar.getMeasuredHeight() - dp, this.f40302c, vjVar.getMeasuredHeight());
        int i17 = org.telegram.ui.ActionBar.j6.f18959ic;
        org.telegram.ui.ActionBar.f6 f6Var = this.f40311j0;
        int v02 = org.telegram.ui.ActionBar.j6.v0(i17, f6Var);
        TextPaint textPaint3 = this.f40306f;
        textPaint3.setColor(v02);
        int v03 = org.telegram.ui.ActionBar.j6.v0(i17, f6Var);
        Paint paint2 = this.e;
        paint2.setColor(v03);
        this.h.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Vd, f6Var));
        int alpha = d("paintChatActionBackground").getAlpha();
        int alpha2 = org.telegram.ui.ActionBar.j6.f18931h2.getAlpha();
        int alpha3 = textPaint3.getAlpha();
        int alpha4 = paint2.getAlpha();
        org.telegram.ui.ActionBar.j6.f18931h2.setAlpha((int) (alpha2 * f11));
        int i18 = (int) (alpha * f11);
        d("paintChatActionBackground").setAlpha(i18);
        int i19 = (int) (alpha3 * f11);
        textPaint3.setAlpha(i19);
        int i20 = (f7 > 1.0f ? 1 : (f7 == 1.0f ? 0 : -1));
        if ((i20 >= 0 && this.Q < 1.0f) || (f7 < 1.0f && this.Q == 1.0f)) {
            i10 = i19;
            i11 = i18;
            long currentTimeMillis = System.currentTimeMillis();
            rectF = rectF3;
            i12 = alpha2;
            if (currentTimeMillis - this.P > 100) {
                try {
                    vjVar.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                this.P = currentTimeMillis;
            }
            this.Q = f7;
        } else {
            i10 = i19;
            i11 = i18;
            rectF = rectF3;
            i12 = alpha2;
        }
        if (i20 == 0 && !this.M) {
            this.M = true;
            this.N = true;
            g(vjVar, true);
            this.U = System.currentTimeMillis();
        } else if (i20 != 0 && this.M) {
            this.M = false;
            g(vjVar, false);
        }
        float f25 = this.f40302c / 2.0f;
        float f26 = this.L * (-AndroidUtilities.dp(4.0f));
        if (this.R) {
            f12 = dp - f26;
        } else {
            f12 = dp;
        }
        float f27 = f12 / 2.0f;
        float max = Math.max(0.0f, Math.min(this.d, (f27 - (AndroidUtilities.dp(16.0f) * f7)) - AndroidUtilities.dp(4.0f)));
        float max2 = (1.0f - this.K) * ((Math.max(0.0f, Math.min(this.d * f7, f27 - (AndroidUtilities.dp(8.0f) * f7))) * 2.0f) - AndroidUtilities.dp2(16.0f));
        float f28 = this.K;
        float dp2 = (AndroidUtilities.dp(56.0f) * f28) + max2;
        if (f28 >= 1.0f && !this.R) {
            paint = paint2;
            vqVar = vqVar2;
            f16 = dp2;
            f17 = f11;
            textPaint = textPaint3;
            i13 = i10;
            f19 = f26;
            f13 = 36.0f;
            f18 = f25;
            i15 = alpha;
            i14 = i11;
            f20 = f12;
        } else {
            f13 = 36.0f;
            float f29 = -f12;
            float f30 = f12;
            float dp3 = (this.K * (AndroidUtilities.dp(56.0f) + f29)) + ((1.0f - this.K) * (-AndroidUtilities.dp(8.0f)));
            RectF rectF4 = AndroidUtilities.rectTmp;
            int i21 = i11;
            rectF4.set(f25 - max, f29, f25 + max, dp3);
            if (this.K > 0.0f && !this.R) {
                float dp4 = AndroidUtilities.dp(16.0f) * this.K;
                rectF4.inset(dp4, dp4);
                f14 = 1.0f - this.K;
            } else {
                f14 = 1.0f;
            }
            if (this.W) {
                Path path = this.f40314r;
                path.reset();
                float width = rectF4.width() * 0.2f;
                float width2 = rectF4.width() * 0.1f;
                float width3 = rectF4.width() * 0.03f;
                f15 = f29;
                float f31 = width2 / 2.0f;
                float height = rectF4.height() - width2;
                vqVar = vqVar2;
                f16 = dp2;
                path.moveTo(rectF4.right, rectF4.top + width + width2);
                float f32 = -width;
                path.rQuadTo(0.0f, f32, f32, f32);
                float f33 = width * 2.0f;
                float f34 = f31 * 2.0f;
                f17 = f11;
                path.rLineTo((((-(rectF4.width() - f33)) / 2.0f) + f34) - width3, 0.0f);
                float f35 = -f31;
                float f36 = f35 / 2.0f;
                float f37 = f35 * 2.0f;
                textPaint = textPaint3;
                float f38 = (-width2) / 2.0f;
                path.rQuadTo(f36, 0.0f, f37, f38);
                path.rQuadTo(f36, f38, f37, f38);
                path.rLineTo(((-(rectF4.width() - f33)) / 2.0f) + f34 + width3, 0.0f);
                path.rQuadTo(f32, 0.0f, f32, width);
                path.rLineTo(0.0f, (height + width2) - f33);
                path.rQuadTo(0.0f, width, width, width);
                path.rLineTo(rectF4.width() - f33, 0.0f);
                path.rQuadTo(width, 0.0f, width, f32);
                path.rLineTo(0.0f, -(height - f33));
                path.close();
                canvas2.drawPath(path, d("paintChatActionBackground"));
                if (f6Var != null) {
                    a13 = f6Var.p0();
                } else {
                    a13 = org.telegram.ui.ActionBar.j6.a1();
                }
                if (a13) {
                    canvas2.drawPath(path, org.telegram.ui.ActionBar.j6.f18931h2);
                }
            } else {
                f15 = f29;
                vqVar = vqVar2;
                f16 = dp2;
                f17 = f11;
                textPaint = textPaint3;
                int alpha5 = d("paintChatActionBackground").getAlpha();
                d("paintChatActionBackground").setAlpha((int) (alpha5 * f14));
                float f39 = this.d;
                canvas2.drawRoundRect(rectF4, f39, f39, d("paintChatActionBackground"));
                d("paintChatActionBackground").setAlpha(alpha5);
                if (f6Var != null) {
                    a12 = f6Var.p0();
                } else {
                    a12 = org.telegram.ui.ActionBar.j6.a1();
                }
                if (a12) {
                    int alpha6 = org.telegram.ui.ActionBar.j6.f18931h2.getAlpha();
                    org.telegram.ui.ActionBar.j6.f18931h2.setAlpha((int) (alpha6 * f14));
                    float f40 = this.d;
                    canvas2.drawRoundRect(rectF4, f40, f40, org.telegram.ui.ActionBar.j6.f18931h2);
                    org.telegram.ui.ActionBar.j6.f18931h2.setAlpha(alpha6);
                }
            }
            float z11 = com.google.android.gms.internal.vision.e2.z(1.0f, f7, AndroidUtilities.dp(8.0f), f15 + AndroidUtilities.dp(24.0f)) - (AndroidUtilities.dp(36.0f) * this.K);
            canvas2.save();
            rectF4.inset(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f));
            canvas2.clipRect(rectF4);
            float f41 = this.K;
            if (f41 > 0.0f) {
                paint2.setAlpha((int) ((1.0f - f41) * 255.0f));
            }
            canvas2.save();
            float dp5 = (AndroidUtilities.dp(24.0f) * f7) / AndroidUtilities.dpf2(24.0f);
            canvas2.scale(dp5, dp5, f25, z11 - AndroidUtilities.dp(20.0f));
            canvas2.translate(f25 - AndroidUtilities.dp2(12.0f), z11 - AndroidUtilities.dp(12.0f));
            f18 = f25;
            i13 = i10;
            f19 = f26;
            f20 = f30;
            i14 = i21;
            i15 = alpha;
            canvas2.drawLine(AndroidUtilities.dpf2(12.5f), AndroidUtilities.dpf2(4.0f), AndroidUtilities.dpf2(12.5f), AndroidUtilities.dpf2(22.0f), paint2);
            canvas.drawLine(AndroidUtilities.dpf2(3.5f), AndroidUtilities.dpf2(12.0f), AndroidUtilities.dpf2(12.5f), AndroidUtilities.dpf2(3.5f), paint2);
            canvas2 = canvas;
            canvas2.drawLine(AndroidUtilities.dpf2(21.5f), AndroidUtilities.dpf2(12.0f), AndroidUtilities.dpf2(12.5f), AndroidUtilities.dpf2(3.5f), paint2);
            canvas2.restore();
            if (this.R) {
                float a2 = org.telegram.ui.Cells.p6.a(f15 - AndroidUtilities.dp(2.0f), this.K, (1.0f - this.K) * (((-AndroidUtilities.dp(8.0f)) - (AndroidUtilities.dp2(8.0f) * f7)) - f16), f19);
                paint2.setAlpha(alpha4);
                canvas2.save();
                canvas2.scale(f7, f7, f18, AndroidUtilities.dp(28.0f) + a2);
                float dp6 = a2 + AndroidUtilities.dp(28.0f);
                if (!this.N) {
                    paint = paint2;
                } else {
                    float f42 = this.O;
                    if (f42 < 1.0f) {
                        float f43 = f42 + 0.07272727f;
                        this.O = f43;
                        if (f43 > 1.0f) {
                            this.O = 1.0f;
                        }
                    }
                    float f44 = this.O;
                    if (f44 > 0.5f) {
                        f21 = 1.0f;
                    } else {
                        f21 = f44 / 0.5f;
                    }
                    if (f44 < 0.5f) {
                        f22 = 0.0f;
                    } else {
                        f22 = (f44 - 0.5f) / 0.5f;
                    }
                    canvas2.save();
                    canvas2.clipRect(rectF4);
                    canvas2.translate(f18 - AndroidUtilities.dp(24.0f), dp6 - AndroidUtilities.dp(24.0f));
                    float dp7 = AndroidUtilities.dp(16.0f);
                    float dp8 = AndroidUtilities.dp(26.0f);
                    float dp9 = AndroidUtilities.dp(22.0f);
                    float dp10 = AndroidUtilities.dp(32.0f);
                    float dp11 = AndroidUtilities.dp(32.0f);
                    float dp12 = AndroidUtilities.dp(20.0f);
                    float f45 = 1.0f - f21;
                    canvas.drawLine(dp7, dp8, (dp9 * f21) + (dp7 * f45), (f21 * dp10) + (f45 * dp8), paint2);
                    if (f22 > 0.0f) {
                        float f46 = 1.0f - f22;
                        float f47 = (dp11 * f22) + (dp9 * f46);
                        float f48 = (dp12 * f22) + (f46 * dp10);
                        canvas2 = canvas;
                        canvas2.drawLine(dp9, dp10, f47, f48, paint2);
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
        if (this.f40315s != null && this.K > 0.0f) {
            d("paintChatActionBackground").setAlpha(i14);
            textPaint2 = textPaint;
            textPaint2.setAlpha(i13);
            float dp13 = (((1.0f - this.K) * AndroidUtilities.dp(20.0f)) - (AndroidUtilities.dp(f13) * this.K)) + f19;
            RectF rectF5 = AndroidUtilities.rectTmp;
            float f49 = (i16 - this.f40317x) / 2.0f;
            rectF5.set(f49, dp13, this.f40302c - f49, this.f40315s.getHeight() + dp13);
            rectF5.inset(-AndroidUtilities.dp(8.0f), -AndroidUtilities.dp(4.0f));
            canvas2.drawRoundRect(rectF5, AndroidUtilities.dp(15.0f), AndroidUtilities.dp(15.0f), d("paintChatActionBackground"));
            if (f6Var != null) {
                a14 = f6Var.p0();
            } else {
                a14 = org.telegram.ui.ActionBar.j6.a1();
            }
            if (a14) {
                canvas2.drawRoundRect(rectF5, AndroidUtilities.dp(15.0f), AndroidUtilities.dp(15.0f), org.telegram.ui.ActionBar.j6.f18931h2);
            }
            canvas2.save();
            canvas2.translate((this.f40302c - this.f40317x) / 2.0f, dp13);
            this.f40315s.draw(canvas2);
            canvas2.restore();
        } else {
            textPaint2 = textPaint;
        }
        if (!this.R && f16 > 0.0f) {
            float a10 = org.telegram.ui.Cells.p6.a((-f20) + AndroidUtilities.dp(4.0f), this.K, (1.0f - this.K) * (((-AndroidUtilities.dp(8.0f)) - (AndroidUtilities.dp2(8.0f) * f7)) - f16), f19);
            org.telegram.ui.Components.o5 o5Var2 = this.f40312k0;
            if (o5Var2 == null || (imageReceiver = o5Var2.f26639k) == null) {
                imageReceiver = this.F;
            }
            ImageReceiver imageReceiver2 = imageReceiver;
            imageReceiver2.setAlpha(f17);
            float f50 = f16 / 2.0f;
            imageReceiver2.setRoundRadius((int) f50);
            float f51 = f16;
            imageReceiver2.setImageCoords(f18 - f50, a10, f51, f51);
            if (this.X && imageReceiver2.getDrawable() != null && (imageReceiver2.getDrawable() instanceof org.telegram.ui.Components.pq) && (((org.telegram.ui.Components.pq) imageReceiver2.getDrawable()).f27110b instanceof org.telegram.ui.Components.l80)) {
                ((org.telegram.ui.Components.l80) ((org.telegram.ui.Components.pq) imageReceiver2.getDrawable()).f27110b).f25861i = f7;
            }
            if (this.K > 0.0f && this.f40301b0) {
                canvas2.saveLayerAlpha(imageReceiver2.getImageX(), imageReceiver2.getImageY(), imageReceiver2.getImageX() + imageReceiver2.getImageWidth(), imageReceiver2.getImageY() + imageReceiver2.getImageHeight(), 255, 31);
                imageReceiver2.draw(canvas2);
                float f52 = this.K;
                org.telegram.ui.Components.vq vqVar3 = vqVar;
                vqVar3.e(vqVar3.f29386s);
                canvas2.scale(f52, f52, (vqVar3.f29386s / 2.0f) + vqVar3.A + AndroidUtilities.dp(12.0f) + f18, (a10 - AndroidUtilities.dp(6.0f)) + AndroidUtilities.dp(14.0f));
                canvas2.translate(AndroidUtilities.dp(12.0f) + f18, a10 - AndroidUtilities.dp(6.0f));
                float f53 = vqVar3.C;
                float f54 = vqVar3.f29379l;
                if (f54 != 1.0f) {
                    f23 = 6.0f;
                    int i22 = vqVar3.f29373c;
                    if (i22 == 0 || i22 == 1) {
                        rectF2 = rectF;
                        f24 = 14.0f;
                        vqVar3.e(vqVar3.f29386s);
                        float dp14 = (vqVar3.f29390x - AndroidUtilities.dp(f53 * 2.0f)) / 2.0f;
                        float f55 = vqVar3.B;
                        rectF2.set(f55, dp14, vqVar3.f29386s + f55 + AndroidUtilities.dp(11.0f), AndroidUtilities.dp(23.0f) + dp14);
                    } else {
                        float f56 = f54 * 2.0f;
                        if (f56 > 1.0f) {
                            f56 = 1.0f;
                        }
                        float dp15 = (vqVar3.f29390x - AndroidUtilities.dp(f53 * 2.0f)) / 2.0f;
                        int i23 = vqVar3.f29386s;
                        int i24 = vqVar3.f29385r;
                        if (i23 == i24) {
                            z10 = i23;
                            f24 = 14.0f;
                        } else {
                            f24 = 14.0f;
                            z10 = com.google.android.gms.internal.vision.e2.z(1.0f, f56, i24, i23 * f56);
                        }
                        vqVar3.e(z10);
                        float f57 = vqVar3.B;
                        rectF2 = rectF;
                        rectF2.set(f57, dp15, z10 + f57 + AndroidUtilities.dp(11.0f), AndroidUtilities.dp(23.0f) + dp15);
                    }
                } else {
                    rectF2 = rectF;
                    f23 = 6.0f;
                    f24 = 14.0f;
                    vqVar3.e(vqVar3.f29386s);
                    float dp16 = (vqVar3.f29390x - AndroidUtilities.dp(f53 * 2.0f)) / 2.0f;
                    float f58 = vqVar3.B;
                    rectF2.set(f58, dp16, vqVar3.f29386s + f58 + AndroidUtilities.dp(11.0f), AndroidUtilities.dp(23.0f) + dp16);
                }
                rectF2.inset(-AndroidUtilities.dp(2.0f), -AndroidUtilities.dp(2.0f));
                canvas2.drawRoundRect(rectF2, rectF2.height() / 2.0f, rectF2.height() / 2.0f, this.f40313n);
                canvas2.restore();
                canvas2.save();
                float f59 = this.K;
                vqVar3.e(vqVar3.f29386s);
                canvas2.scale(f59, f59, (vqVar3.f29386s / 2.0f) + vqVar3.A + AndroidUtilities.dp(12.0f) + f18, (a10 - AndroidUtilities.dp(f23)) + AndroidUtilities.dp(f24));
                canvas2.translate(AndroidUtilities.dp(12.0f) + f18, a10 - AndroidUtilities.dp(f23));
                vqVar3.a(canvas2);
                canvas2.restore();
            } else {
                imageReceiver2.draw(canvas2);
            }
            imageReceiver2.setAlpha(1.0f);
        }
        d("paintChatActionBackground").setAlpha(i15);
        org.telegram.ui.ActionBar.j6.f18931h2.setAlpha(i12);
        textPaint2.setAlpha(alpha3);
        paint.setAlpha(alpha4);
    }

    public final void b(Canvas canvas, int i10, int i11) {
        int v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Xk, this.f40311j0);
        TextPaint textPaint = this.h;
        textPaint.setColor(v02);
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
                canvas.translate((this.f40302c - this.f40318y) / 2.0f, height);
                this.v.draw(canvas);
                canvas.restore();
            }
        }
        if (this.f40316w != null) {
            float f10 = this.K;
            if (f10 > 0.0f) {
                textPaint.setAlpha((int) (alpha2 * f10 * this.S));
                float dp = ((1.0f - this.K) * AndroidUtilities.dp(10.0f)) + (((i11 - i10) - this.f40316w.getHeight()) / 2.0f) + i10;
                canvas.save();
                canvas.translate((this.f40302c - this.E) / 2.0f, dp);
                this.f40316w.draw(canvas);
                canvas.restore();
            }
        }
        textPaint.setAlpha(alpha2);
        d.setAlpha(alpha);
    }

    public final Paint d(String str) {
        Paint paint;
        org.telegram.ui.ActionBar.f6 f6Var = this.f40311j0;
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
        if (this.Z != 0 && (dialog = (TLRPC.Dialog) MessagesController.getInstance(this.f40305e0).dialogs_dict.f(this.Z)) != null) {
            int i12 = dialog.unread_count;
            boolean z10 = true;
            this.f40303c0.c(i12, true);
            if (i12 <= 0) {
                z10 = false;
            }
            this.f40301b0 = z10;
            View view = this.f40299a0;
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
        org.telegram.ui.Components.o5 o5Var = this.f40312k0;
        if (o5Var != null && (view = this.f40299a0) != null) {
            o5Var.a(view);
        }
        NotificationCenter.getInstance(this.f40305e0).addObserver(this, NotificationCenter.updateInterfaces);
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
                public final zp f39682b;

                {
                    this.f39682b = this;
                }

                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    switch (r3) {
                        case 0:
                            zp zpVar = this.f39682b;
                            zpVar.getClass();
                            zpVar.K = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            view.invalidate();
                            zpVar.T.invalidate();
                            return;
                        case 1:
                            zp zpVar2 = this.f39682b;
                            zpVar2.getClass();
                            zpVar2.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            view.invalidate();
                            return;
                        case 2:
                            zp zpVar3 = this.f39682b;
                            zpVar3.getClass();
                            zpVar3.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            view.invalidate();
                            return;
                        case 3:
                            zp zpVar4 = this.f39682b;
                            zpVar4.getClass();
                            zpVar4.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            view.invalidate();
                            return;
                        default:
                            zp zpVar5 = this.f39682b;
                            zpVar5.getClass();
                            zpVar5.K = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            zpVar5.T.invalidate();
                            view.invalidate();
                            return;
                    }
                }
            });
            ofFloat.setInterpolator(org.telegram.ui.Components.qr.h);
            ofFloat.setDuration(250L);
            this.L = 0.0f;
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                public final zp f39682b;

                {
                    this.f39682b = this;
                }

                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    switch (r3) {
                        case 0:
                            zp zpVar = this.f39682b;
                            zpVar.getClass();
                            zpVar.K = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            view.invalidate();
                            zpVar.T.invalidate();
                            return;
                        case 1:
                            zp zpVar2 = this.f39682b;
                            zpVar2.getClass();
                            zpVar2.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            view.invalidate();
                            return;
                        case 2:
                            zp zpVar3 = this.f39682b;
                            zpVar3.getClass();
                            zpVar3.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            view.invalidate();
                            return;
                        case 3:
                            zp zpVar4 = this.f39682b;
                            zpVar4.getClass();
                            zpVar4.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            view.invalidate();
                            return;
                        default:
                            zp zpVar5 = this.f39682b;
                            zpVar5.getClass();
                            zpVar5.K = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            zpVar5.T.invalidate();
                            view.invalidate();
                            return;
                    }
                }
            });
            org.telegram.ui.Components.qr qrVar = org.telegram.ui.Components.qr.f27386j;
            ofFloat2.setInterpolator(qrVar);
            ofFloat2.setDuration(180L);
            ValueAnimator ofFloat3 = ValueAnimator.ofFloat(1.0f, -0.5f);
            ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                public final zp f39682b;

                {
                    this.f39682b = this;
                }

                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    switch (r3) {
                        case 0:
                            zp zpVar = this.f39682b;
                            zpVar.getClass();
                            zpVar.K = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            view.invalidate();
                            zpVar.T.invalidate();
                            return;
                        case 1:
                            zp zpVar2 = this.f39682b;
                            zpVar2.getClass();
                            zpVar2.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            view.invalidate();
                            return;
                        case 2:
                            zp zpVar3 = this.f39682b;
                            zpVar3.getClass();
                            zpVar3.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            view.invalidate();
                            return;
                        case 3:
                            zp zpVar4 = this.f39682b;
                            zpVar4.getClass();
                            zpVar4.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            view.invalidate();
                            return;
                        default:
                            zp zpVar5 = this.f39682b;
                            zpVar5.getClass();
                            zpVar5.K = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            zpVar5.T.invalidate();
                            view.invalidate();
                            return;
                    }
                }
            });
            ofFloat3.setInterpolator(qrVar);
            ofFloat3.setDuration(120L);
            ValueAnimator ofFloat4 = ValueAnimator.ofFloat(-0.5f, 0.0f);
            ofFloat4.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                public final zp f39682b;

                {
                    this.f39682b = this;
                }

                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    switch (r3) {
                        case 0:
                            zp zpVar = this.f39682b;
                            zpVar.getClass();
                            zpVar.K = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            view.invalidate();
                            zpVar.T.invalidate();
                            return;
                        case 1:
                            zp zpVar2 = this.f39682b;
                            zpVar2.getClass();
                            zpVar2.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            view.invalidate();
                            return;
                        case 2:
                            zp zpVar3 = this.f39682b;
                            zpVar3.getClass();
                            zpVar3.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            view.invalidate();
                            return;
                        case 3:
                            zp zpVar4 = this.f39682b;
                            zpVar4.getClass();
                            zpVar4.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            view.invalidate();
                            return;
                        default:
                            zp zpVar5 = this.f39682b;
                            zpVar5.getClass();
                            zpVar5.K = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            zpVar5.T.invalidate();
                            view.invalidate();
                            return;
                    }
                }
            });
            ofFloat4.setInterpolator(qrVar);
            ofFloat4.setDuration(100L);
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.J = animatorSet2;
            animatorSet2.addListener(new ai.z(15, this, view));
            AnimatorSet animatorSet3 = new AnimatorSet();
            animatorSet3.playSequentially(ofFloat2, ofFloat3, ofFloat4);
            this.J.playTogether(ofFloat, animatorSet3);
            this.J.start();
            return;
        }
        ValueAnimator ofFloat5 = ValueAnimator.ofFloat(this.K, 0.0f);
        ofFloat5.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
            public final zp f39682b;

            {
                this.f39682b = this;
            }

            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (r3) {
                    case 0:
                        zp zpVar = this.f39682b;
                        zpVar.getClass();
                        zpVar.K = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        view.invalidate();
                        zpVar.T.invalidate();
                        return;
                    case 1:
                        zp zpVar2 = this.f39682b;
                        zpVar2.getClass();
                        zpVar2.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        view.invalidate();
                        return;
                    case 2:
                        zp zpVar3 = this.f39682b;
                        zpVar3.getClass();
                        zpVar3.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        view.invalidate();
                        return;
                    case 3:
                        zp zpVar4 = this.f39682b;
                        zpVar4.getClass();
                        zpVar4.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        view.invalidate();
                        return;
                    default:
                        zp zpVar5 = this.f39682b;
                        zpVar5.getClass();
                        zpVar5.K = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        zpVar5.T.invalidate();
                        view.invalidate();
                        return;
                }
            }
        });
        ofFloat5.setInterpolator(org.telegram.ui.Components.qr.f27383f);
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
        TLRPC.Dialog c10 = c(this.f40310i0, this.f40307f0, this.f40308g0, true, this.f40304d0);
        if (c10 != null) {
            this.Z = c10.f18125id;
            int[] iArr = this.f40304d0;
            if (iArr[0] == 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.W = z10;
            this.f40298a = iArr[1];
            this.f40300b = iArr[2];
            this.R = false;
            int i10 = this.f40305e0;
            TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-c10.f18125id));
            this.G = chat;
            if (chat == null) {
                this.G = MessagesController.getInstance(i10).getChat(Long.valueOf(c10.f18125id));
            }
            org.telegram.ui.Components.f9 f9Var = new org.telegram.ui.Components.f9((org.telegram.ui.ActionBar.f6) null);
            f9Var.k(i10, this.G);
            this.F.setImage(ImageLocation.getForChat(this.G, 1), "50_50", f9Var, null, UserConfig.getInstance(0).getCurrentUser(), 0);
            MessagesController.getInstance(i10).ensureMessagesLoaded(c10.f18125id, 0, null);
            int i11 = c10.unread_count;
            this.f40303c0.c(i11, false);
            if (i11 > 0) {
                z11 = true;
            }
            this.f40301b0 = z11;
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
        this.Z = -chat.f18121id;
        int[] iArr = this.f40304d0;
        boolean z11 = false;
        if (iArr[0] == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.W = z10;
        this.f40298a = iArr[1];
        this.f40300b = iArr[2];
        this.R = false;
        this.G = chat;
        org.telegram.ui.Components.f9 f9Var = new org.telegram.ui.Components.f9((org.telegram.ui.ActionBar.f6) null);
        TLRPC.Chat chat2 = this.G;
        int i11 = this.f40305e0;
        f9Var.k(i11, chat2);
        this.F.setImage(ImageLocation.getForChat(this.G, 1), "50_50", f9Var, null, UserConfig.getInstance(0).getCurrentUser(), 0);
        MessagesController.getInstance(i11).ensureMessagesLoaded(-chat.f18121id, 0, null);
        TLRPC.Dialog dialog = MessagesController.getInstance(i11).getDialog(-chat.f18121id);
        if (dialog == null) {
            i10 = 0;
        } else {
            i10 = dialog.unread_count;
        }
        this.f40303c0.c(i10, false);
        if (i10 > 0) {
            z11 = true;
        }
        this.f40301b0 = z11;
        this.V = true;
        this.H = null;
    }

    public final void j() {
        TLRPC.TL_forumTopic tL_forumTopic;
        org.telegram.ui.Components.o5 o5Var;
        View view;
        View view2;
        org.telegram.ui.Components.o5 o5Var2;
        TLRPC.Message message;
        TLRPC.Message message2;
        boolean z10 = false;
        this.V = false;
        this.W = false;
        this.G = null;
        this.Z = 0L;
        ImageReceiver imageReceiver = this.F;
        imageReceiver.clearImage();
        int i10 = this.f40305e0;
        ArrayList<TLRPC.TL_forumTopic> topics = MessagesController.getInstance(i10).getTopicsController().getTopics(-this.f40310i0);
        if (topics != null && topics.size() > 1) {
            tL_forumTopic = null;
            for (int i11 = 0; i11 < topics.size(); i11++) {
                TLRPC.TL_forumTopic tL_forumTopic2 = topics.get(i11);
                if (tL_forumTopic2.f18173id != this.f40309h0 && !tL_forumTopic2.hidden && tL_forumTopic2.unread_count > 0 && (tL_forumTopic == null || ((message = tL_forumTopic2.topMessage) != null && (message2 = tL_forumTopic.topMessage) != null && message.date > message2.date))) {
                    tL_forumTopic = tL_forumTopic2;
                }
            }
        } else {
            tL_forumTopic = null;
        }
        if (tL_forumTopic != null) {
            this.R = false;
            this.H = tL_forumTopic;
            int i12 = tL_forumTopic.f18173id;
            org.telegram.ui.ActionBar.f6 f6Var = this.f40311j0;
            if (i12 == 1) {
                View view3 = this.f40299a0;
                if (view3 != null && (o5Var2 = this.f40312k0) != null) {
                    o5Var2.o(view3);
                }
                this.f40312k0 = null;
                imageReceiver.setImageBitmap(ng.d.c(this.T.getContext(), 1.0f, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Ac, f6Var), true));
            } else if (tL_forumTopic.icon_emoji_id != 0) {
                org.telegram.ui.Components.o5 o5Var3 = this.f40312k0;
                if (o5Var3 == null || o5Var3.i() != tL_forumTopic.icon_emoji_id) {
                    org.telegram.ui.Components.o5 o5Var4 = this.f40312k0;
                    if (o5Var4 != null && (view = this.f40299a0) != null) {
                        o5Var4.o(view);
                    }
                    org.telegram.ui.Components.o5 o5Var5 = new org.telegram.ui.Components.o5(22, i10, tL_forumTopic.icon_emoji_id);
                    this.f40312k0 = o5Var5;
                    o5Var5.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18959ic, f6Var), PorterDuff.Mode.SRC_IN));
                }
                org.telegram.ui.Components.o5 o5Var6 = this.f40312k0;
                if (o5Var6 != null && (view2 = this.f40299a0) != null) {
                    o5Var6.a(view2);
                }
                imageReceiver.setImageBitmap((Bitmap) null);
            } else {
                View view4 = this.f40299a0;
                if (view4 != null && (o5Var = this.f40312k0) != null) {
                    o5Var.o(view4);
                }
                this.f40312k0 = null;
                imageReceiver.setImageBitmap(ng.d.e(tL_forumTopic));
            }
            int i13 = tL_forumTopic.unread_count;
            this.f40303c0.c(i13, false);
            if (i13 > 0) {
                z10 = true;
            }
            this.f40301b0 = z10;
            return;
        }
        this.H = null;
        this.R = true;
    }
}
