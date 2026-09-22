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
import org.telegram.ui.Components.f9;
import org.telegram.ui.Components.g01;
import org.telegram.ui.Components.qr;
import org.telegram.ui.Components.wc;
public final class n8 {
    public int f47479a;
    public final RectF f47480b;
    public final org.telegram.ui.Components.c6 f47481c;
    public final org.telegram.ui.Components.c6 d;
    public final org.telegram.ui.Components.c6 e;
    public LinearGradient f47482f;
    public final Matrix f47483g;
    public final Paint h;
    public final boolean f47484i;
    public long f47485j;
    public final ImageReceiver f47486k;
    public final f9 f47487l;
    public final f9 f47488m;
    public g01 f47489n;
    public g01 f47490o;
    public boolean f47491p;
    public final wc f47492q;
    public int f47493r;
    public Drawable f47494s;
    public Drawable f47495t;
    public g01 f47496u;
    public int v;
    public final o8 f47497w;

    public n8(o8 o8Var, boolean z10, long j3) {
        String str;
        p8 p8Var = o8Var.f47548r;
        this.f47497w = o8Var;
        this.f47480b = new RectF();
        qr qrVar = qr.h;
        this.f47481c = new org.telegram.ui.Components.c6(o8Var, 0L, 600L, qrVar);
        this.d = new org.telegram.ui.Components.c6(o8Var, 0L, 200L, qrVar);
        this.e = new org.telegram.ui.Components.c6(o8Var, 0L, 350L, qrVar);
        this.f47482f = null;
        this.f47483g = new Matrix();
        this.h = new Paint(1);
        ImageReceiver imageReceiver = new ImageReceiver(o8Var);
        this.f47486k = imageReceiver;
        f9 f9Var = new f9((org.telegram.ui.ActionBar.e6) null);
        this.f47487l = f9Var;
        f9 f9Var2 = new f9((org.telegram.ui.ActionBar.e6) null);
        this.f47488m = f9Var2;
        this.f47492q = new wc(o8Var);
        this.f47484i = z10;
        this.f47485j = j3;
        if (j3 >= 0) {
            TLRPC.User user = MessagesController.getInstance(p8Var.f47581c).getUser(Long.valueOf(j3));
            str = UserObject.getForcedFirstName(user);
            f9Var.r(user);
            imageReceiver.setForUserOrChat(user, f9Var);
        } else {
            TLRPC.Chat chat = MessagesController.getInstance(p8Var.f47581c).getChat(Long.valueOf(-j3));
            if (chat == null) {
                str = "";
            } else {
                str = chat.title;
            }
            f9Var.q(chat);
            imageReceiver.setForUserOrChat(chat, f9Var);
        }
        imageReceiver.setRoundRadius(AndroidUtilities.dp(56.0f));
        imageReceiver.onAttachedToWindow();
        imageReceiver.setCrossfadeWithOldImage(true);
        f9Var2.g(21);
        f9Var2.h(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f18818c8, p8Var.f47580b));
        this.f47489n = new g01(str, 12.0f, null);
    }

    public final void a(Canvas canvas) {
        float f7;
        float f10;
        float f11;
        boolean z10 = false;
        float d = this.f47481c.d(this.f47479a, false);
        int i10 = this.f47479a;
        o8 o8Var = this.f47497w;
        if (i10 >= 0 && i10 < o8Var.f47544b.size()) {
            z10 = true;
        }
        float e = this.d.e(z10);
        canvas.save();
        float width = (o8Var.getWidth() - AndroidUtilities.dp(80.0f)) / Math.max(1.0f, o8Var.f47546f);
        float dp = ((o8Var.f47546f - (d + 0.5f)) * width) + AndroidUtilities.dp(40.0f);
        float dp2 = AndroidUtilities.dp(40.0f);
        float f12 = width / 2.0f;
        this.f47480b.set(dp - f12, dp2 - AndroidUtilities.dp(50.0f), f12 + dp, AndroidUtilities.dp(50.0f) + dp2);
        float f13 = (0.3f * e) + 0.7f;
        canvas.scale(f13, f13, dp, dp2);
        float a2 = this.f47492q.a(0.04f);
        canvas.scale(a2, a2, dp, dp2);
        if (e > 0.0f) {
            float e7 = this.e.e(this.f47491p);
            if (e7 < 1.0f) {
                f7 = 255.0f;
                f10 = 40.0f;
                f11 = 2.0f;
                ImageReceiver imageReceiver = this.f47486k;
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
                f9 f9Var = this.f47488m;
                f9Var.setBounds(dp3, dp4, dp5, dp6);
                f9Var.f23874y = (int) (e * f7 * e7);
                f9Var.draw(canvas);
                f9Var.f23874y = 255;
            }
        } else {
            f7 = 255.0f;
            f10 = 40.0f;
            f11 = 2.0f;
        }
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set((dp - (this.f47490o.f24146c / f11)) - AndroidUtilities.dp(5.66f), (AndroidUtilities.dp(23.0f) + dp2) - (AndroidUtilities.dp(16.0f) / f11), (this.f47490o.f24146c / f11) + dp + AndroidUtilities.dp(5.66f), (AndroidUtilities.dp(16.0f) / f11) + AndroidUtilities.dp(23.0f) + dp2);
        canvas.drawRoundRect(rectF, rectF.height() / f11, rectF.height() / f11, o8Var.d);
        int i13 = (int) (e * f7);
        Paint paint = this.h;
        paint.setAlpha(i13);
        if (this.f47482f != null) {
            Matrix matrix = this.f47483g;
            matrix.reset();
            matrix.postTranslate(0.0f, rectF.top);
            this.f47482f.setLocalMatrix(matrix);
        }
        canvas.drawRoundRect(rectF, rectF.height() / f11, rectF.height() / f11, paint);
        g01 g01Var = this.f47490o;
        g01Var.c(dp - (g01Var.f24146c / f11), AndroidUtilities.dp(23.0f) + dp2, e, -1, canvas);
        g01 g01Var2 = this.f47489n;
        g01Var2.f24156p = width - AndroidUtilities.dp(4.0f);
        g01Var2.c(dp - (this.f47489n.l() / f11), AndroidUtilities.dp(42.0f) + dp2, e, org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.G6, o8Var.f47548r.f47580b), canvas);
        if (this.v > 0) {
            int i14 = (int) dp;
            int i15 = (int) dp2;
            this.f47495t.setBounds(i14 - AndroidUtilities.dp(12.0f), i15 - AndroidUtilities.dp(f10), AndroidUtilities.dp(12.0f) + i14, i15 - AndroidUtilities.dp(16.0f));
            this.f47494s.setBounds(i14 - AndroidUtilities.dp(12.0f), i15 - AndroidUtilities.dp(f10), AndroidUtilities.dp(12.0f) + i14, i15 - AndroidUtilities.dp(16.0f));
            this.f47495t.setAlpha(i13);
            this.f47494s.setAlpha(i13);
            this.f47495t.draw(canvas);
            this.f47494s.draw(canvas);
            g01 g01Var3 = this.f47496u;
            g01Var3.c(dp - (g01Var3.f24146c / f11), dp2 - AndroidUtilities.dp(27.0f), e, -1, canvas);
        }
        canvas.restore();
    }

    public final void b(long j3) {
        long j10;
        boolean z10;
        String str;
        String str2;
        o8 o8Var = this.f47497w;
        p8 p8Var = o8Var.f47548r;
        if (this.f47484i) {
            if (this.f47491p) {
                j10 = 2666000;
            } else if (this.f47485j == UserConfig.getInstance(p8Var.f47581c).getClientUserId()) {
                j10 = 0;
            } else {
                j10 = this.f47485j;
            }
            if (j10 != j3) {
                int i10 = (j3 > 2666000L ? 1 : (j3 == 2666000L ? 0 : -1));
                if (i10 == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.f47491p = z10;
                if (j3 == 0 || i10 == 0) {
                    j3 = UserConfig.getInstance(p8Var.f47581c).getClientUserId();
                }
                this.f47485j = j3;
                if (this.f47491p) {
                    str2 = LocaleController.getString(R.string.StarsReactionAnonymous);
                } else {
                    ImageReceiver imageReceiver = this.f47486k;
                    f9 f9Var = this.f47487l;
                    if (j3 >= 0) {
                        TLRPC.User user = MessagesController.getInstance(p8Var.f47581c).getUser(Long.valueOf(this.f47485j));
                        str = UserObject.getForcedFirstName(user);
                        f9Var.r(user);
                        imageReceiver.setForUserOrChat(user, f9Var);
                    } else {
                        TLRPC.Chat chat = MessagesController.getInstance(p8Var.f47581c).getChat(Long.valueOf(-this.f47485j));
                        if (chat == null) {
                            str = "";
                        } else {
                            str = chat.title;
                        }
                        f9Var.q(chat);
                        imageReceiver.setForUserOrChat(chat, f9Var);
                    }
                    str2 = str;
                }
                this.f47489n = new g01(str2, 12.0f, null);
                o8Var.invalidate();
            }
        }
    }
}
