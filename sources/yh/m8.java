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
import org.telegram.ui.Components.rr;
import org.telegram.ui.Components.t01;
import org.telegram.ui.Components.yc;
public final class m8 {
    public int f47734a;
    public final RectF f47735b;
    public final org.telegram.ui.Components.e6 f47736c;
    public final org.telegram.ui.Components.e6 d;
    public final org.telegram.ui.Components.e6 e;
    public LinearGradient f47737f;
    public final Matrix f47738g;
    public final Paint h;
    public final boolean f47739i;
    public long f47740j;
    public final ImageReceiver f47741k;
    public final h9 f47742l;
    public final h9 f47743m;
    public t01 f47744n;
    public t01 f47745o;
    public boolean f47746p;
    public final yc f47747q;
    public int f47748r;
    public Drawable f47749s;
    public Drawable f47750t;
    public t01 f47751u;
    public int v;
    public final n8 f47752w;

    public m8(n8 n8Var, boolean z10, long j3) {
        String str;
        o8 o8Var = n8Var.f47782r;
        this.f47752w = n8Var;
        this.f47735b = new RectF();
        rr rrVar = rr.h;
        this.f47736c = new org.telegram.ui.Components.e6(n8Var, 0L, 600L, rrVar);
        this.d = new org.telegram.ui.Components.e6(n8Var, 0L, 200L, rrVar);
        this.e = new org.telegram.ui.Components.e6(n8Var, 0L, 350L, rrVar);
        this.f47737f = null;
        this.f47738g = new Matrix();
        this.h = new Paint(1);
        ImageReceiver imageReceiver = new ImageReceiver(n8Var);
        this.f47741k = imageReceiver;
        h9 h9Var = new h9((org.telegram.ui.ActionBar.d6) null);
        this.f47742l = h9Var;
        h9 h9Var2 = new h9((org.telegram.ui.ActionBar.d6) null);
        this.f47743m = h9Var2;
        this.f47747q = new yc(n8Var);
        this.f47739i = z10;
        this.f47740j = j3;
        if (j3 >= 0) {
            TLRPC.User user = MessagesController.getInstance(o8Var.f47847c).getUser(Long.valueOf(j3));
            str = UserObject.getForcedFirstName(user);
            h9Var.r(user);
            imageReceiver.setForUserOrChat(user, h9Var);
        } else {
            TLRPC.Chat chat = MessagesController.getInstance(o8Var.f47847c).getChat(Long.valueOf(-j3));
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
        h9Var2.h(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19044c8, o8Var.f47846b));
        this.f47744n = new t01(str, 12.0f, null);
    }

    public final void a(Canvas canvas) {
        float f7;
        float f10;
        float f11;
        boolean z10 = false;
        float d = this.f47736c.d(this.f47734a, false);
        int i10 = this.f47734a;
        n8 n8Var = this.f47752w;
        if (i10 >= 0 && i10 < n8Var.f47778b.size()) {
            z10 = true;
        }
        float e = this.d.e(z10);
        canvas.save();
        float width = (n8Var.getWidth() - AndroidUtilities.dp(80.0f)) / Math.max(1.0f, n8Var.f47780f);
        float dp = ((n8Var.f47780f - (d + 0.5f)) * width) + AndroidUtilities.dp(40.0f);
        float dp2 = AndroidUtilities.dp(40.0f);
        float f12 = width / 2.0f;
        this.f47735b.set(dp - f12, dp2 - AndroidUtilities.dp(50.0f), f12 + dp, AndroidUtilities.dp(50.0f) + dp2);
        float f13 = (0.3f * e) + 0.7f;
        canvas.scale(f13, f13, dp, dp2);
        float a2 = this.f47747q.a(0.04f);
        canvas.scale(a2, a2, dp, dp2);
        if (e > 0.0f) {
            float e7 = this.e.e(this.f47746p);
            if (e7 < 1.0f) {
                f7 = 255.0f;
                f10 = 40.0f;
                f11 = 2.0f;
                ImageReceiver imageReceiver = this.f47741k;
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
                h9 h9Var = this.f47743m;
                h9Var.setBounds(dp3, dp4, dp5, dp6);
                h9Var.f24692y = (int) (e * f7 * e7);
                h9Var.draw(canvas);
                h9Var.f24692y = 255;
            }
        } else {
            f7 = 255.0f;
            f10 = 40.0f;
            f11 = 2.0f;
        }
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set((dp - (this.f47745o.f28364c / f11)) - AndroidUtilities.dp(5.66f), (AndroidUtilities.dp(23.0f) + dp2) - (AndroidUtilities.dp(16.0f) / f11), (this.f47745o.f28364c / f11) + dp + AndroidUtilities.dp(5.66f), (AndroidUtilities.dp(16.0f) / f11) + AndroidUtilities.dp(23.0f) + dp2);
        canvas.drawRoundRect(rectF, rectF.height() / f11, rectF.height() / f11, n8Var.d);
        int i13 = (int) (e * f7);
        Paint paint = this.h;
        paint.setAlpha(i13);
        if (this.f47737f != null) {
            Matrix matrix = this.f47738g;
            matrix.reset();
            matrix.postTranslate(0.0f, rectF.top);
            this.f47737f.setLocalMatrix(matrix);
        }
        canvas.drawRoundRect(rectF, rectF.height() / f11, rectF.height() / f11, paint);
        t01 t01Var = this.f47745o;
        t01Var.c(dp - (t01Var.f28364c / f11), AndroidUtilities.dp(23.0f) + dp2, e, -1, canvas);
        t01 t01Var2 = this.f47744n;
        t01Var2.f28374p = width - AndroidUtilities.dp(4.0f);
        t01Var2.c(dp - (this.f47744n.l() / f11), AndroidUtilities.dp(42.0f) + dp2, e, org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.G6, n8Var.f47782r.f47846b), canvas);
        if (this.v > 0) {
            int i14 = (int) dp;
            int i15 = (int) dp2;
            this.f47750t.setBounds(i14 - AndroidUtilities.dp(12.0f), i15 - AndroidUtilities.dp(f10), AndroidUtilities.dp(12.0f) + i14, i15 - AndroidUtilities.dp(16.0f));
            this.f47749s.setBounds(i14 - AndroidUtilities.dp(12.0f), i15 - AndroidUtilities.dp(f10), AndroidUtilities.dp(12.0f) + i14, i15 - AndroidUtilities.dp(16.0f));
            this.f47750t.setAlpha(i13);
            this.f47749s.setAlpha(i13);
            this.f47750t.draw(canvas);
            this.f47749s.draw(canvas);
            t01 t01Var3 = this.f47751u;
            t01Var3.c(dp - (t01Var3.f28364c / f11), dp2 - AndroidUtilities.dp(27.0f), e, -1, canvas);
        }
        canvas.restore();
    }

    public final void b(long j3) {
        long j10;
        boolean z10;
        String str;
        String str2;
        n8 n8Var = this.f47752w;
        o8 o8Var = n8Var.f47782r;
        if (this.f47739i) {
            if (this.f47746p) {
                j10 = 2666000;
            } else if (this.f47740j == UserConfig.getInstance(o8Var.f47847c).getClientUserId()) {
                j10 = 0;
            } else {
                j10 = this.f47740j;
            }
            if (j10 != j3) {
                int i10 = (j3 > 2666000L ? 1 : (j3 == 2666000L ? 0 : -1));
                if (i10 == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.f47746p = z10;
                if (j3 == 0 || i10 == 0) {
                    j3 = UserConfig.getInstance(o8Var.f47847c).getClientUserId();
                }
                this.f47740j = j3;
                if (this.f47746p) {
                    str2 = LocaleController.getString(R.string.StarsReactionAnonymous);
                } else {
                    ImageReceiver imageReceiver = this.f47741k;
                    h9 h9Var = this.f47742l;
                    if (j3 >= 0) {
                        TLRPC.User user = MessagesController.getInstance(o8Var.f47847c).getUser(Long.valueOf(this.f47740j));
                        str = UserObject.getForcedFirstName(user);
                        h9Var.r(user);
                        imageReceiver.setForUserOrChat(user, h9Var);
                    } else {
                        TLRPC.Chat chat = MessagesController.getInstance(o8Var.f47847c).getChat(Long.valueOf(-this.f47740j));
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
                this.f47744n = new t01(str2, 12.0f, null);
                n8Var.invalidate();
            }
        }
    }
}
