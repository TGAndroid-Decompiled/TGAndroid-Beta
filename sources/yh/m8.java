package yh;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.g9;
import org.telegram.ui.Components.qr;
import org.telegram.ui.Components.u01;
import org.telegram.ui.Components.yc;
public final class m8 {
    public int f47766a;
    public final RectF f47767b;
    public final org.telegram.ui.Components.d6 f47768c;
    public final org.telegram.ui.Components.d6 d;
    public final org.telegram.ui.Components.d6 e;
    public LinearGradient f47769f;
    public final Matrix f47770g;
    public final Paint h;
    public final boolean f47771i;
    public long f47772j;
    public final ImageReceiver f47773k;
    public final g9 f47774l;
    public final g9 f47775m;
    public u01 f47776n;
    public u01 f47777o;
    public boolean f47778p;
    public final yc f47779q;
    public int f47780r;
    public Drawable f47781s;
    public Drawable f47782t;
    public u01 f47783u;
    public int v;
    public final n8 f47784w;

    public m8(n8 n8Var, boolean z10, long j3) {
        String str;
        o8 o8Var = n8Var.f47824r;
        this.f47784w = n8Var;
        this.f47767b = new RectF();
        qr qrVar = qr.h;
        this.f47768c = new org.telegram.ui.Components.d6(n8Var, 0L, 600L, qrVar);
        this.d = new org.telegram.ui.Components.d6(n8Var, 0L, 200L, qrVar);
        this.e = new org.telegram.ui.Components.d6(n8Var, 0L, 350L, qrVar);
        this.f47769f = null;
        this.f47770g = new Matrix();
        this.h = new Paint(1);
        ImageReceiver imageReceiver = new ImageReceiver(n8Var);
        this.f47773k = imageReceiver;
        g9 g9Var = new g9((org.telegram.ui.ActionBar.f6) null);
        this.f47774l = g9Var;
        g9 g9Var2 = new g9((org.telegram.ui.ActionBar.f6) null);
        this.f47775m = g9Var2;
        this.f47779q = new yc(n8Var);
        this.f47771i = z10;
        this.f47772j = j3;
        if (j3 >= 0) {
            TLRPC.User user = MessagesController.getInstance(o8Var.f47868c).getUser(Long.valueOf(j3));
            str = UserObject.getForcedFirstName(user);
            g9Var.r(user);
            imageReceiver.setForUserOrChat(user, g9Var);
        } else {
            TLRPC.Chat chat = MessagesController.getInstance(o8Var.f47868c).getChat(Long.valueOf(-j3));
            if (chat == null) {
                str = "";
            } else {
                str = chat.title;
            }
            g9Var.q(chat);
            imageReceiver.setForUserOrChat(chat, g9Var);
        }
        imageReceiver.setRoundRadius(AndroidUtilities.dp(56.0f));
        imageReceiver.onAttachedToWindow();
        imageReceiver.setCrossfadeWithOldImage(true);
        g9Var2.g(21);
        g9Var2.h(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19078c8, o8Var.f47867b));
        this.f47776n = new u01(str, 12.0f, null);
    }

    public final void a(Canvas canvas) {
        float f7;
        float f10;
        float f11;
        boolean z10 = false;
        float d = this.f47768c.d(this.f47766a, false);
        int i10 = this.f47766a;
        n8 n8Var = this.f47784w;
        if (i10 >= 0 && i10 < n8Var.f47820b.size()) {
            z10 = true;
        }
        float e = this.d.e(z10);
        canvas.save();
        float width = (n8Var.getWidth() - AndroidUtilities.dp(80.0f)) / Math.max(1.0f, n8Var.f47822f);
        float dp = ((n8Var.f47822f - (d + 0.5f)) * width) + AndroidUtilities.dp(40.0f);
        float dp2 = AndroidUtilities.dp(40.0f);
        float f12 = width / 2.0f;
        this.f47767b.set(dp - f12, dp2 - AndroidUtilities.dp(50.0f), f12 + dp, AndroidUtilities.dp(50.0f) + dp2);
        float f13 = (0.3f * e) + 0.7f;
        canvas.scale(f13, f13, dp, dp2);
        float a2 = this.f47779q.a(0.04f);
        canvas.scale(a2, a2, dp, dp2);
        if (e > 0.0f) {
            float e7 = this.e.e(this.f47778p);
            if (e7 < 1.0f) {
                f7 = 255.0f;
                f10 = 40.0f;
                f11 = 2.0f;
                ImageReceiver imageReceiver = this.f47773k;
                imageReceiver.setImageCoords(dp - (AndroidUtilities.dp(56.0f) / 2.0f), dp2 - (AndroidUtilities.dp(56.0f) / 2.0f), AndroidUtilities.dp(56.0f), AndroidUtilities.dp(56.0f));
                imageReceiver.setAlpha(e);
                imageReceiver.draw(canvas);
                imageReceiver.setAlpha(1.0f);
            } else {
                f7 = 255.0f;
                f10 = 40.0f;
                f11 = 2.0f;
            }
            if (e7 > 0.0f) {
                int i11 = (int) dp;
                int dp3 = i11 - (AndroidUtilities.dp(56.0f) / 2);
                int i12 = (int) dp2;
                int dp4 = i12 - (AndroidUtilities.dp(56.0f) / 2);
                int dp5 = (AndroidUtilities.dp(56.0f) / 2) + i11;
                int dp6 = (AndroidUtilities.dp(56.0f) / 2) + i12;
                g9 g9Var = this.f47775m;
                g9Var.setBounds(dp3, dp4, dp5, dp6);
                g9Var.f24310y = (int) (e * f7 * e7);
                g9Var.draw(canvas);
                g9Var.f24310y = 255;
            }
        } else {
            f7 = 255.0f;
            f10 = 40.0f;
            f11 = 2.0f;
        }
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set((dp - (this.f47777o.f28493c / f11)) - AndroidUtilities.dp(5.66f), (AndroidUtilities.dp(23.0f) + dp2) - (AndroidUtilities.dp(16.0f) / f11), (this.f47777o.f28493c / f11) + dp + AndroidUtilities.dp(5.66f), (AndroidUtilities.dp(16.0f) / f11) + AndroidUtilities.dp(23.0f) + dp2);
        canvas.drawRoundRect(rectF, rectF.height() / f11, rectF.height() / f11, n8Var.d);
        int i13 = (int) (e * f7);
        Paint paint = this.h;
        paint.setAlpha(i13);
        if (this.f47769f != null) {
            Matrix matrix = this.f47770g;
            matrix.reset();
            matrix.postTranslate(0.0f, rectF.top);
            this.f47769f.setLocalMatrix(matrix);
        }
        canvas.drawRoundRect(rectF, rectF.height() / f11, rectF.height() / f11, paint);
        u01 u01Var = this.f47777o;
        u01Var.c(dp - (u01Var.f28493c / f11), AndroidUtilities.dp(23.0f) + dp2, e, -1, canvas);
        u01 u01Var2 = this.f47776n;
        u01Var2.f28503p = width - AndroidUtilities.dp(4.0f);
        u01Var2.c(dp - (this.f47776n.l() / f11), AndroidUtilities.dp(42.0f) + dp2, e, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G6, n8Var.f47824r.f47867b), canvas);
        if (this.v > 0) {
            int i14 = (int) dp;
            int i15 = (int) dp2;
            this.f47782t.setBounds(i14 - AndroidUtilities.dp(12.0f), i15 - AndroidUtilities.dp(f10), AndroidUtilities.dp(12.0f) + i14, i15 - AndroidUtilities.dp(16.0f));
            this.f47781s.setBounds(i14 - AndroidUtilities.dp(12.0f), i15 - AndroidUtilities.dp(f10), AndroidUtilities.dp(12.0f) + i14, i15 - AndroidUtilities.dp(16.0f));
            this.f47782t.setAlpha(i13);
            this.f47781s.setAlpha(i13);
            this.f47782t.draw(canvas);
            this.f47781s.draw(canvas);
            u01 u01Var3 = this.f47783u;
            u01Var3.c(dp - (u01Var3.f28493c / f11), dp2 - AndroidUtilities.dp(27.0f), e, -1, canvas);
        }
        canvas.restore();
    }

    public final void b(long j3) {
        long j10;
        boolean z10;
        String str;
        String str2;
        n8 n8Var = this.f47784w;
        o8 o8Var = n8Var.f47824r;
        if (this.f47771i) {
            if (this.f47778p) {
                j10 = 2666000;
            } else if (this.f47772j == UserConfig.getInstance(o8Var.f47868c).getClientUserId()) {
                j10 = 0;
            } else {
                j10 = this.f47772j;
            }
            if (j10 != j3) {
                int i10 = (j3 > 2666000L ? 1 : (j3 == 2666000L ? 0 : -1));
                if (i10 == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.f47778p = z10;
                if (j3 == 0 || i10 == 0) {
                    j3 = UserConfig.getInstance(o8Var.f47868c).getClientUserId();
                }
                this.f47772j = j3;
                if (this.f47778p) {
                    str2 = LocaleController.getString(R.string.StarsReactionAnonymous);
                } else {
                    ImageReceiver imageReceiver = this.f47773k;
                    g9 g9Var = this.f47774l;
                    if (j3 >= 0) {
                        TLRPC.User user = MessagesController.getInstance(o8Var.f47868c).getUser(Long.valueOf(this.f47772j));
                        str = UserObject.getForcedFirstName(user);
                        g9Var.r(user);
                        imageReceiver.setForUserOrChat(user, g9Var);
                    } else {
                        TLRPC.Chat chat = MessagesController.getInstance(o8Var.f47868c).getChat(Long.valueOf(-this.f47772j));
                        if (chat == null) {
                            str = "";
                        } else {
                            str = chat.title;
                        }
                        g9Var.q(chat);
                        imageReceiver.setForUserOrChat(chat, g9Var);
                    }
                    str2 = str;
                }
                this.f47776n = new u01(str2, 12.0f, null);
                n8Var.invalidate();
            }
        }
    }
}
