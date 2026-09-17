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
import org.telegram.ui.Components.h01;
import org.telegram.ui.Components.qr;
import org.telegram.ui.Components.wc;
public final class o8 {
    public int f47606a;
    public final RectF f47607b;
    public final org.telegram.ui.Components.c6 f47608c;
    public final org.telegram.ui.Components.c6 d;
    public final org.telegram.ui.Components.c6 e;
    public LinearGradient f47609f;
    public final Matrix f47610g;
    public final Paint h;
    public final boolean f47611i;
    public long f47612j;
    public final ImageReceiver f47613k;
    public final f9 f47614l;
    public final f9 f47615m;
    public h01 f47616n;
    public h01 f47617o;
    public boolean f47618p;
    public final wc f47619q;
    public int f47620r;
    public Drawable f47621s;
    public Drawable f47622t;
    public h01 f47623u;
    public int v;
    public final p8 f47624w;

    public o8(p8 p8Var, boolean z10, long j3) {
        String str;
        q8 q8Var = p8Var.f47662r;
        this.f47624w = p8Var;
        this.f47607b = new RectF();
        qr qrVar = qr.h;
        this.f47608c = new org.telegram.ui.Components.c6(p8Var, 0L, 600L, qrVar);
        this.d = new org.telegram.ui.Components.c6(p8Var, 0L, 200L, qrVar);
        this.e = new org.telegram.ui.Components.c6(p8Var, 0L, 350L, qrVar);
        this.f47609f = null;
        this.f47610g = new Matrix();
        this.h = new Paint(1);
        ImageReceiver imageReceiver = new ImageReceiver(p8Var);
        this.f47613k = imageReceiver;
        f9 f9Var = new f9((org.telegram.ui.ActionBar.f6) null);
        this.f47614l = f9Var;
        f9 f9Var2 = new f9((org.telegram.ui.ActionBar.f6) null);
        this.f47615m = f9Var2;
        this.f47619q = new wc(p8Var);
        this.f47611i = z10;
        this.f47612j = j3;
        if (j3 >= 0) {
            TLRPC.User user = MessagesController.getInstance(q8Var.f47701c).getUser(Long.valueOf(j3));
            str = UserObject.getForcedFirstName(user);
            f9Var.r(user);
            imageReceiver.setForUserOrChat(user, f9Var);
        } else {
            TLRPC.Chat chat = MessagesController.getInstance(q8Var.f47701c).getChat(Long.valueOf(-j3));
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
        f9Var2.h(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18846c8, q8Var.f47700b));
        this.f47616n = new h01(str, 12.0f, null);
    }

    public final void a(Canvas canvas) {
        float f7;
        float f10;
        float f11;
        boolean z10 = false;
        float d = this.f47608c.d(this.f47606a, false);
        int i10 = this.f47606a;
        p8 p8Var = this.f47624w;
        if (i10 >= 0 && i10 < p8Var.f47658b.size()) {
            z10 = true;
        }
        float e = this.d.e(z10);
        canvas.save();
        float width = (p8Var.getWidth() - AndroidUtilities.dp(80.0f)) / Math.max(1.0f, p8Var.f47660f);
        float dp = ((p8Var.f47660f - (d + 0.5f)) * width) + AndroidUtilities.dp(40.0f);
        float dp2 = AndroidUtilities.dp(40.0f);
        float f12 = width / 2.0f;
        this.f47607b.set(dp - f12, dp2 - AndroidUtilities.dp(50.0f), f12 + dp, AndroidUtilities.dp(50.0f) + dp2);
        float f13 = (0.3f * e) + 0.7f;
        canvas.scale(f13, f13, dp, dp2);
        float a2 = this.f47619q.a(0.04f);
        canvas.scale(a2, a2, dp, dp2);
        if (e > 0.0f) {
            float e7 = this.e.e(this.f47618p);
            if (e7 < 1.0f) {
                f7 = 255.0f;
                f10 = 40.0f;
                f11 = 2.0f;
                ImageReceiver imageReceiver = this.f47613k;
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
                f9 f9Var = this.f47615m;
                f9Var.setBounds(dp3, dp4, dp5, dp6);
                f9Var.f23844y = (int) (e * f7 * e7);
                f9Var.draw(canvas);
                f9Var.f23844y = 255;
            }
        } else {
            f7 = 255.0f;
            f10 = 40.0f;
            f11 = 2.0f;
        }
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set((dp - (this.f47617o.f24439c / f11)) - AndroidUtilities.dp(5.66f), (AndroidUtilities.dp(23.0f) + dp2) - (AndroidUtilities.dp(16.0f) / f11), (this.f47617o.f24439c / f11) + dp + AndroidUtilities.dp(5.66f), (AndroidUtilities.dp(16.0f) / f11) + AndroidUtilities.dp(23.0f) + dp2);
        canvas.drawRoundRect(rectF, rectF.height() / f11, rectF.height() / f11, p8Var.d);
        int i13 = (int) (e * f7);
        Paint paint = this.h;
        paint.setAlpha(i13);
        if (this.f47609f != null) {
            Matrix matrix = this.f47610g;
            matrix.reset();
            matrix.postTranslate(0.0f, rectF.top);
            this.f47609f.setLocalMatrix(matrix);
        }
        canvas.drawRoundRect(rectF, rectF.height() / f11, rectF.height() / f11, paint);
        h01 h01Var = this.f47617o;
        h01Var.c(dp - (h01Var.f24439c / f11), AndroidUtilities.dp(23.0f) + dp2, e, -1, canvas);
        h01 h01Var2 = this.f47616n;
        h01Var2.f24449p = width - AndroidUtilities.dp(4.0f);
        h01Var2.c(dp - (this.f47616n.l() / f11), AndroidUtilities.dp(42.0f) + dp2, e, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G6, p8Var.f47662r.f47700b), canvas);
        if (this.v > 0) {
            int i14 = (int) dp;
            int i15 = (int) dp2;
            this.f47622t.setBounds(i14 - AndroidUtilities.dp(12.0f), i15 - AndroidUtilities.dp(f10), AndroidUtilities.dp(12.0f) + i14, i15 - AndroidUtilities.dp(16.0f));
            this.f47621s.setBounds(i14 - AndroidUtilities.dp(12.0f), i15 - AndroidUtilities.dp(f10), AndroidUtilities.dp(12.0f) + i14, i15 - AndroidUtilities.dp(16.0f));
            this.f47622t.setAlpha(i13);
            this.f47621s.setAlpha(i13);
            this.f47622t.draw(canvas);
            this.f47621s.draw(canvas);
            h01 h01Var3 = this.f47623u;
            h01Var3.c(dp - (h01Var3.f24439c / f11), dp2 - AndroidUtilities.dp(27.0f), e, -1, canvas);
        }
        canvas.restore();
    }

    public final void b(long j3) {
        long j10;
        boolean z10;
        String str;
        String str2;
        p8 p8Var = this.f47624w;
        q8 q8Var = p8Var.f47662r;
        if (this.f47611i) {
            if (this.f47618p) {
                j10 = 2666000;
            } else if (this.f47612j == UserConfig.getInstance(q8Var.f47701c).getClientUserId()) {
                j10 = 0;
            } else {
                j10 = this.f47612j;
            }
            if (j10 != j3) {
                int i10 = (j3 > 2666000L ? 1 : (j3 == 2666000L ? 0 : -1));
                if (i10 == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.f47618p = z10;
                if (j3 == 0 || i10 == 0) {
                    j3 = UserConfig.getInstance(q8Var.f47701c).getClientUserId();
                }
                this.f47612j = j3;
                if (this.f47618p) {
                    str2 = LocaleController.getString(R.string.StarsReactionAnonymous);
                } else {
                    ImageReceiver imageReceiver = this.f47613k;
                    f9 f9Var = this.f47614l;
                    if (j3 >= 0) {
                        TLRPC.User user = MessagesController.getInstance(q8Var.f47701c).getUser(Long.valueOf(this.f47612j));
                        str = UserObject.getForcedFirstName(user);
                        f9Var.r(user);
                        imageReceiver.setForUserOrChat(user, f9Var);
                    } else {
                        TLRPC.Chat chat = MessagesController.getInstance(q8Var.f47701c).getChat(Long.valueOf(-this.f47612j));
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
                this.f47616n = new h01(str2, 12.0f, null);
                p8Var.invalidate();
            }
        }
    }
}
