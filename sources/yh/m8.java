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
import org.telegram.ui.Components.h9;
import org.telegram.ui.Components.tr;
import org.telegram.ui.Components.w01;
import org.telegram.ui.Components.zc;
public final class m8 {
    public int f47841a;
    public final RectF f47842b;
    public final org.telegram.ui.Components.e6 f47843c;
    public final org.telegram.ui.Components.e6 d;
    public final org.telegram.ui.Components.e6 e;
    public LinearGradient f47844f;
    public final Matrix f47845g;
    public final Paint h;
    public final boolean f47846i;
    public long f47847j;
    public final ImageReceiver f47848k;
    public final h9 f47849l;
    public final h9 f47850m;
    public w01 f47851n;
    public w01 f47852o;
    public boolean f47853p;
    public final zc f47854q;
    public int f47855r;
    public Drawable f47856s;
    public Drawable f47857t;
    public w01 f47858u;
    public int v;
    public final n8 f47859w;

    public m8(n8 n8Var, boolean z10, long j3) {
        String str;
        o8 o8Var = n8Var.f47889r;
        this.f47859w = n8Var;
        this.f47842b = new RectF();
        tr trVar = tr.h;
        this.f47843c = new org.telegram.ui.Components.e6(n8Var, 0L, 600L, trVar);
        this.d = new org.telegram.ui.Components.e6(n8Var, 0L, 200L, trVar);
        this.e = new org.telegram.ui.Components.e6(n8Var, 0L, 350L, trVar);
        this.f47844f = null;
        this.f47845g = new Matrix();
        this.h = new Paint(1);
        ImageReceiver imageReceiver = new ImageReceiver(n8Var);
        this.f47848k = imageReceiver;
        h9 h9Var = new h9((org.telegram.ui.ActionBar.d6) null);
        this.f47849l = h9Var;
        h9 h9Var2 = new h9((org.telegram.ui.ActionBar.d6) null);
        this.f47850m = h9Var2;
        this.f47854q = new zc(n8Var);
        this.f47846i = z10;
        this.f47847j = j3;
        if (j3 >= 0) {
            TLRPC.User user = MessagesController.getInstance(o8Var.f47954c).getUser(Long.valueOf(j3));
            str = UserObject.getForcedFirstName(user);
            h9Var.r(user);
            imageReceiver.setForUserOrChat(user, h9Var);
        } else {
            TLRPC.Chat chat = MessagesController.getInstance(o8Var.f47954c).getChat(Long.valueOf(-j3));
            if (chat == null) {
                str = "";
            } else {
                str = chat.title;
            }
            h9Var.q(chat);
            imageReceiver.setForUserOrChat(chat, h9Var);
        }
        imageReceiver.setRoundRadius(AndroidUtilities.dp(56.0f));
        imageReceiver.onAttachedToWindow();
        imageReceiver.setCrossfadeWithOldImage(true);
        h9Var2.g(21);
        h9Var2.h(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19060c8, o8Var.f47953b));
        this.f47851n = new w01(str, 12.0f, null);
    }

    public final void a(Canvas canvas) {
        float f7;
        float f10;
        float f11;
        boolean z10 = false;
        float d = this.f47843c.d(this.f47841a, false);
        int i10 = this.f47841a;
        n8 n8Var = this.f47859w;
        if (i10 >= 0 && i10 < n8Var.f47885b.size()) {
            z10 = true;
        }
        float e = this.d.e(z10);
        canvas.save();
        float width = (n8Var.getWidth() - AndroidUtilities.dp(80.0f)) / Math.max(1.0f, n8Var.f47887f);
        float dp = ((n8Var.f47887f - (d + 0.5f)) * width) + AndroidUtilities.dp(40.0f);
        float dp2 = AndroidUtilities.dp(40.0f);
        float f12 = width / 2.0f;
        this.f47842b.set(dp - f12, dp2 - AndroidUtilities.dp(50.0f), f12 + dp, AndroidUtilities.dp(50.0f) + dp2);
        float f13 = (0.3f * e) + 0.7f;
        canvas.scale(f13, f13, dp, dp2);
        float a2 = this.f47854q.a(0.04f);
        canvas.scale(a2, a2, dp, dp2);
        if (e > 0.0f) {
            float e7 = this.e.e(this.f47853p);
            if (e7 < 1.0f) {
                f7 = 255.0f;
                f10 = 40.0f;
                f11 = 2.0f;
                ImageReceiver imageReceiver = this.f47848k;
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
                h9 h9Var = this.f47850m;
                h9Var.setBounds(dp3, dp4, dp5, dp6);
                h9Var.f24792y = (int) (e * f7 * e7);
                h9Var.draw(canvas);
                h9Var.f24792y = 255;
            }
        } else {
            f7 = 255.0f;
            f10 = 40.0f;
            f11 = 2.0f;
        }
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set((dp - (this.f47852o.f29768c / f11)) - AndroidUtilities.dp(5.66f), (AndroidUtilities.dp(23.0f) + dp2) - (AndroidUtilities.dp(16.0f) / f11), (this.f47852o.f29768c / f11) + dp + AndroidUtilities.dp(5.66f), (AndroidUtilities.dp(16.0f) / f11) + AndroidUtilities.dp(23.0f) + dp2);
        canvas.drawRoundRect(rectF, rectF.height() / f11, rectF.height() / f11, n8Var.d);
        int i13 = (int) (e * f7);
        Paint paint = this.h;
        paint.setAlpha(i13);
        if (this.f47844f != null) {
            Matrix matrix = this.f47845g;
            matrix.reset();
            matrix.postTranslate(0.0f, rectF.top);
            this.f47844f.setLocalMatrix(matrix);
        }
        canvas.drawRoundRect(rectF, rectF.height() / f11, rectF.height() / f11, paint);
        w01 w01Var = this.f47852o;
        w01Var.c(dp - (w01Var.f29768c / f11), AndroidUtilities.dp(23.0f) + dp2, e, -1, canvas);
        w01 w01Var2 = this.f47851n;
        w01Var2.f29778p = width - AndroidUtilities.dp(4.0f);
        w01Var2.c(dp - (this.f47851n.l() / f11), AndroidUtilities.dp(42.0f) + dp2, e, org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.G6, n8Var.f47889r.f47953b), canvas);
        if (this.v > 0) {
            int i14 = (int) dp;
            int i15 = (int) dp2;
            this.f47857t.setBounds(i14 - AndroidUtilities.dp(12.0f), i15 - AndroidUtilities.dp(f10), AndroidUtilities.dp(12.0f) + i14, i15 - AndroidUtilities.dp(16.0f));
            this.f47856s.setBounds(i14 - AndroidUtilities.dp(12.0f), i15 - AndroidUtilities.dp(f10), AndroidUtilities.dp(12.0f) + i14, i15 - AndroidUtilities.dp(16.0f));
            this.f47857t.setAlpha(i13);
            this.f47856s.setAlpha(i13);
            this.f47857t.draw(canvas);
            this.f47856s.draw(canvas);
            w01 w01Var3 = this.f47858u;
            w01Var3.c(dp - (w01Var3.f29768c / f11), dp2 - AndroidUtilities.dp(27.0f), e, -1, canvas);
        }
        canvas.restore();
    }

    public final void b(long j3) {
        long j10;
        boolean z10;
        String str;
        String str2;
        n8 n8Var = this.f47859w;
        o8 o8Var = n8Var.f47889r;
        if (this.f47846i) {
            if (this.f47853p) {
                j10 = 2666000;
            } else if (this.f47847j == UserConfig.getInstance(o8Var.f47954c).getClientUserId()) {
                j10 = 0;
            } else {
                j10 = this.f47847j;
            }
            if (j10 != j3) {
                int i10 = (j3 > 2666000L ? 1 : (j3 == 2666000L ? 0 : -1));
                if (i10 == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.f47853p = z10;
                if (j3 == 0 || i10 == 0) {
                    j3 = UserConfig.getInstance(o8Var.f47954c).getClientUserId();
                }
                this.f47847j = j3;
                if (this.f47853p) {
                    str2 = LocaleController.getString(R.string.StarsReactionAnonymous);
                } else {
                    ImageReceiver imageReceiver = this.f47848k;
                    h9 h9Var = this.f47849l;
                    if (j3 >= 0) {
                        TLRPC.User user = MessagesController.getInstance(o8Var.f47954c).getUser(Long.valueOf(this.f47847j));
                        str = UserObject.getForcedFirstName(user);
                        h9Var.r(user);
                        imageReceiver.setForUserOrChat(user, h9Var);
                    } else {
                        TLRPC.Chat chat = MessagesController.getInstance(o8Var.f47954c).getChat(Long.valueOf(-this.f47847j));
                        if (chat == null) {
                            str = "";
                        } else {
                            str = chat.title;
                        }
                        h9Var.q(chat);
                        imageReceiver.setForUserOrChat(chat, h9Var);
                    }
                    str2 = str;
                }
                this.f47851n = new w01(str2, 12.0f, null);
                n8Var.invalidate();
            }
        }
    }
}
