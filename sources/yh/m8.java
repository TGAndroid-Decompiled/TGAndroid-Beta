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
import org.telegram.ui.Components.sr;
import org.telegram.ui.Components.v01;
import org.telegram.ui.Components.zc;
public final class m8 {
    public int f47735a;
    public final RectF f47736b;
    public final org.telegram.ui.Components.e6 f47737c;
    public final org.telegram.ui.Components.e6 d;
    public final org.telegram.ui.Components.e6 e;
    public LinearGradient f47738f;
    public final Matrix f47739g;
    public final Paint h;
    public final boolean f47740i;
    public long f47741j;
    public final ImageReceiver f47742k;
    public final h9 f47743l;
    public final h9 f47744m;
    public v01 f47745n;
    public v01 f47746o;
    public boolean f47747p;
    public final zc f47748q;
    public int f47749r;
    public Drawable f47750s;
    public Drawable f47751t;
    public v01 f47752u;
    public int v;
    public final n8 f47753w;

    public m8(n8 n8Var, boolean z10, long j3) {
        String str;
        o8 o8Var = n8Var.f47783r;
        this.f47753w = n8Var;
        this.f47736b = new RectF();
        sr srVar = sr.h;
        this.f47737c = new org.telegram.ui.Components.e6(n8Var, 0L, 600L, srVar);
        this.d = new org.telegram.ui.Components.e6(n8Var, 0L, 200L, srVar);
        this.e = new org.telegram.ui.Components.e6(n8Var, 0L, 350L, srVar);
        this.f47738f = null;
        this.f47739g = new Matrix();
        this.h = new Paint(1);
        ImageReceiver imageReceiver = new ImageReceiver(n8Var);
        this.f47742k = imageReceiver;
        h9 h9Var = new h9((org.telegram.ui.ActionBar.d6) null);
        this.f47743l = h9Var;
        h9 h9Var2 = new h9((org.telegram.ui.ActionBar.d6) null);
        this.f47744m = h9Var2;
        this.f47748q = new zc(n8Var);
        this.f47740i = z10;
        this.f47741j = j3;
        if (j3 >= 0) {
            TLRPC.User user = MessagesController.getInstance(o8Var.f47848c).getUser(Long.valueOf(j3));
            str = UserObject.getForcedFirstName(user);
            h9Var.r(user);
            imageReceiver.setForUserOrChat(user, h9Var);
        } else {
            TLRPC.Chat chat = MessagesController.getInstance(o8Var.f47848c).getChat(Long.valueOf(-j3));
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
        h9Var2.h(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19045c8, o8Var.f47847b));
        this.f47745n = new v01(str, 12.0f, null);
    }

    public final void a(Canvas canvas) {
        float f7;
        float f10;
        float f11;
        boolean z10 = false;
        float d = this.f47737c.d(this.f47735a, false);
        int i10 = this.f47735a;
        n8 n8Var = this.f47753w;
        if (i10 >= 0 && i10 < n8Var.f47779b.size()) {
            z10 = true;
        }
        float e = this.d.e(z10);
        canvas.save();
        float width = (n8Var.getWidth() - AndroidUtilities.dp(80.0f)) / Math.max(1.0f, n8Var.f47781f);
        float dp = ((n8Var.f47781f - (d + 0.5f)) * width) + AndroidUtilities.dp(40.0f);
        float dp2 = AndroidUtilities.dp(40.0f);
        float f12 = width / 2.0f;
        this.f47736b.set(dp - f12, dp2 - AndroidUtilities.dp(50.0f), f12 + dp, AndroidUtilities.dp(50.0f) + dp2);
        float f13 = (0.3f * e) + 0.7f;
        canvas.scale(f13, f13, dp, dp2);
        float a2 = this.f47748q.a(0.04f);
        canvas.scale(a2, a2, dp, dp2);
        if (e > 0.0f) {
            float e7 = this.e.e(this.f47747p);
            if (e7 < 1.0f) {
                f7 = 255.0f;
                f10 = 40.0f;
                f11 = 2.0f;
                ImageReceiver imageReceiver = this.f47742k;
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
                h9 h9Var = this.f47744m;
                h9Var.setBounds(dp3, dp4, dp5, dp6);
                h9Var.f24748y = (int) (e * f7 * e7);
                h9Var.draw(canvas);
                h9Var.f24748y = 255;
            }
        } else {
            f7 = 255.0f;
            f10 = 40.0f;
            f11 = 2.0f;
        }
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set((dp - (this.f47746o.f28922c / f11)) - AndroidUtilities.dp(5.66f), (AndroidUtilities.dp(23.0f) + dp2) - (AndroidUtilities.dp(16.0f) / f11), (this.f47746o.f28922c / f11) + dp + AndroidUtilities.dp(5.66f), (AndroidUtilities.dp(16.0f) / f11) + AndroidUtilities.dp(23.0f) + dp2);
        canvas.drawRoundRect(rectF, rectF.height() / f11, rectF.height() / f11, n8Var.d);
        int i13 = (int) (e * f7);
        Paint paint = this.h;
        paint.setAlpha(i13);
        if (this.f47738f != null) {
            Matrix matrix = this.f47739g;
            matrix.reset();
            matrix.postTranslate(0.0f, rectF.top);
            this.f47738f.setLocalMatrix(matrix);
        }
        canvas.drawRoundRect(rectF, rectF.height() / f11, rectF.height() / f11, paint);
        v01 v01Var = this.f47746o;
        v01Var.c(dp - (v01Var.f28922c / f11), AndroidUtilities.dp(23.0f) + dp2, e, -1, canvas);
        v01 v01Var2 = this.f47745n;
        v01Var2.f28932p = width - AndroidUtilities.dp(4.0f);
        v01Var2.c(dp - (this.f47745n.l() / f11), AndroidUtilities.dp(42.0f) + dp2, e, org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.G6, n8Var.f47783r.f47847b), canvas);
        if (this.v > 0) {
            int i14 = (int) dp;
            int i15 = (int) dp2;
            this.f47751t.setBounds(i14 - AndroidUtilities.dp(12.0f), i15 - AndroidUtilities.dp(f10), AndroidUtilities.dp(12.0f) + i14, i15 - AndroidUtilities.dp(16.0f));
            this.f47750s.setBounds(i14 - AndroidUtilities.dp(12.0f), i15 - AndroidUtilities.dp(f10), AndroidUtilities.dp(12.0f) + i14, i15 - AndroidUtilities.dp(16.0f));
            this.f47751t.setAlpha(i13);
            this.f47750s.setAlpha(i13);
            this.f47751t.draw(canvas);
            this.f47750s.draw(canvas);
            v01 v01Var3 = this.f47752u;
            v01Var3.c(dp - (v01Var3.f28922c / f11), dp2 - AndroidUtilities.dp(27.0f), e, -1, canvas);
        }
        canvas.restore();
    }

    public final void b(long j3) {
        long j10;
        boolean z10;
        String str;
        String str2;
        n8 n8Var = this.f47753w;
        o8 o8Var = n8Var.f47783r;
        if (this.f47740i) {
            if (this.f47747p) {
                j10 = 2666000;
            } else if (this.f47741j == UserConfig.getInstance(o8Var.f47848c).getClientUserId()) {
                j10 = 0;
            } else {
                j10 = this.f47741j;
            }
            if (j10 != j3) {
                int i10 = (j3 > 2666000L ? 1 : (j3 == 2666000L ? 0 : -1));
                if (i10 == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.f47747p = z10;
                if (j3 == 0 || i10 == 0) {
                    j3 = UserConfig.getInstance(o8Var.f47848c).getClientUserId();
                }
                this.f47741j = j3;
                if (this.f47747p) {
                    str2 = LocaleController.getString(R.string.StarsReactionAnonymous);
                } else {
                    ImageReceiver imageReceiver = this.f47742k;
                    h9 h9Var = this.f47743l;
                    if (j3 >= 0) {
                        TLRPC.User user = MessagesController.getInstance(o8Var.f47848c).getUser(Long.valueOf(this.f47741j));
                        str = UserObject.getForcedFirstName(user);
                        h9Var.r(user);
                        imageReceiver.setForUserOrChat(user, h9Var);
                    } else {
                        TLRPC.Chat chat = MessagesController.getInstance(o8Var.f47848c).getChat(Long.valueOf(-this.f47741j));
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
                this.f47745n = new v01(str2, 12.0f, null);
                n8Var.invalidate();
            }
        }
    }
}
