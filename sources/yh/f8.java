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
import org.telegram.ui.Components.bd;
import org.telegram.ui.Components.is;
import org.telegram.ui.Components.j9;
import org.telegram.ui.Components.n11;
public final class f8 {
    public int f52620a;
    public final RectF f52621b;
    public final org.telegram.ui.Components.g6 f52622c;
    public final org.telegram.ui.Components.g6 d;
    public final org.telegram.ui.Components.g6 f52623e;
    public LinearGradient f52624f;
    public final Matrix f52625g;
    public final Paint h;
    public final boolean f52626i;
    public long f52627j;
    public final ImageReceiver f52628k;
    public final j9 f52629l;
    public final j9 f52630m;
    public n11 f52631n;
    public n11 f52632o;
    public boolean f52633p;
    public final bd f52634q;
    public int f52635r;
    public Drawable f52636s;
    public Drawable f52637t;
    public n11 f52638u;
    public int v;
    public final g8 f52639w;

    public f8(g8 g8Var, boolean z10, long j3) {
        String str;
        h8 h8Var = g8Var.f52686r;
        this.f52639w = g8Var;
        this.f52621b = new RectF();
        is isVar = is.h;
        this.f52622c = new org.telegram.ui.Components.g6(g8Var, 0L, 600L, isVar);
        this.d = new org.telegram.ui.Components.g6(g8Var, 0L, 200L, isVar);
        this.f52623e = new org.telegram.ui.Components.g6(g8Var, 0L, 350L, isVar);
        this.f52624f = null;
        this.f52625g = new Matrix();
        this.h = new Paint(1);
        ImageReceiver imageReceiver = new ImageReceiver(g8Var);
        this.f52628k = imageReceiver;
        j9 j9Var = new j9((org.telegram.ui.ActionBar.d6) null);
        this.f52629l = j9Var;
        j9 j9Var2 = new j9((org.telegram.ui.ActionBar.d6) null);
        this.f52630m = j9Var2;
        this.f52634q = new bd(g8Var);
        this.f52626i = z10;
        this.f52627j = j3;
        if (j3 >= 0) {
            TLRPC.User user = MessagesController.getInstance(h8Var.f52737c).getUser(Long.valueOf(j3));
            str = UserObject.getForcedFirstName(user);
            j9Var.r(user);
            imageReceiver.setForUserOrChat(user, j9Var);
        } else {
            TLRPC.Chat chat = MessagesController.getInstance(h8Var.f52737c).getChat(Long.valueOf(-j3));
            if (chat == null) {
                str = "";
            } else {
                str = chat.title;
            }
            j9Var.q(chat);
            imageReceiver.setForUserOrChat(chat, j9Var);
        }
        imageReceiver.setRoundRadius(AndroidUtilities.dp(56.0f));
        imageReceiver.onAttachedToWindow();
        imageReceiver.setCrossfadeWithOldImage(true);
        j9Var2.g(21);
        j9Var2.h(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20771c8, h8Var.f52736b));
        this.f52631n = new n11(str, 12.0f, null);
    }

    public final void a(Canvas canvas) {
        float f7;
        float f10;
        float f11;
        boolean z10 = false;
        float d = this.f52622c.d(this.f52620a, false);
        int i10 = this.f52620a;
        g8 g8Var = this.f52639w;
        if (i10 >= 0 && i10 < g8Var.f52681b.size()) {
            z10 = true;
        }
        float e7 = this.d.e(z10);
        canvas.save();
        float width = (g8Var.getWidth() - AndroidUtilities.dp(80.0f)) / Math.max(1.0f, g8Var.f52684f);
        float dp = ((g8Var.f52684f - (d + 0.5f)) * width) + AndroidUtilities.dp(40.0f);
        float dp2 = AndroidUtilities.dp(40.0f);
        float f12 = width / 2.0f;
        this.f52621b.set(dp - f12, dp2 - AndroidUtilities.dp(50.0f), f12 + dp, AndroidUtilities.dp(50.0f) + dp2);
        float f13 = (0.3f * e7) + 0.7f;
        canvas.scale(f13, f13, dp, dp2);
        float a2 = this.f52634q.a(0.04f);
        canvas.scale(a2, a2, dp, dp2);
        if (e7 > 0.0f) {
            float e10 = this.f52623e.e(this.f52633p);
            if (e10 < 1.0f) {
                f11 = 255.0f;
                f7 = 40.0f;
                f10 = 2.0f;
                ImageReceiver imageReceiver = this.f52628k;
                imageReceiver.setImageCoords(dp - (AndroidUtilities.dp(56.0f) / 2.0f), dp2 - (AndroidUtilities.dp(56.0f) / 2.0f), AndroidUtilities.dp(56.0f), AndroidUtilities.dp(56.0f));
                imageReceiver.setAlpha(e7);
                imageReceiver.draw(canvas);
                imageReceiver.setAlpha(1.0f);
            } else {
                f7 = 40.0f;
                f10 = 2.0f;
                f11 = 255.0f;
            }
            if (e10 > 0.0f) {
                int i11 = (int) dp;
                int dp3 = i11 - (AndroidUtilities.dp(56.0f) / 2);
                int i12 = (int) dp2;
                int dp4 = i12 - (AndroidUtilities.dp(56.0f) / 2);
                int dp5 = (AndroidUtilities.dp(56.0f) / 2) + i11;
                int dp6 = (AndroidUtilities.dp(56.0f) / 2) + i12;
                j9 j9Var = this.f52630m;
                j9Var.setBounds(dp3, dp4, dp5, dp6);
                j9Var.f27625y = (int) (e7 * f11 * e10);
                j9Var.draw(canvas);
                j9Var.f27625y = 255;
            }
        } else {
            f7 = 40.0f;
            f10 = 2.0f;
            f11 = 255.0f;
        }
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set((dp - (this.f52632o.f28902c / f10)) - AndroidUtilities.dp(5.66f), (AndroidUtilities.dp(23.0f) + dp2) - (AndroidUtilities.dp(16.0f) / f10), (this.f52632o.f28902c / f10) + dp + AndroidUtilities.dp(5.66f), (AndroidUtilities.dp(16.0f) / f10) + AndroidUtilities.dp(23.0f) + dp2);
        canvas.drawRoundRect(rectF, rectF.height() / f10, rectF.height() / f10, g8Var.d);
        int i13 = (int) (e7 * f11);
        Paint paint = this.h;
        paint.setAlpha(i13);
        if (this.f52624f != null) {
            Matrix matrix = this.f52625g;
            matrix.reset();
            matrix.postTranslate(0.0f, rectF.top);
            this.f52624f.setLocalMatrix(matrix);
        }
        canvas.drawRoundRect(rectF, rectF.height() / f10, rectF.height() / f10, paint);
        n11 n11Var = this.f52632o;
        n11Var.c(dp - (n11Var.f28902c / f10), AndroidUtilities.dp(23.0f) + dp2, e7, -1, canvas);
        n11 n11Var2 = this.f52631n;
        n11Var2.f28913p = width - AndroidUtilities.dp(4.0f);
        n11Var2.c(dp - (this.f52631n.l() / f10), AndroidUtilities.dp(42.0f) + dp2, e7, org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.G6, g8Var.f52686r.f52736b), canvas);
        if (this.v > 0) {
            int i14 = (int) dp;
            int i15 = (int) dp2;
            this.f52637t.setBounds(i14 - AndroidUtilities.dp(12.0f), i15 - AndroidUtilities.dp(f7), AndroidUtilities.dp(12.0f) + i14, i15 - AndroidUtilities.dp(16.0f));
            this.f52636s.setBounds(i14 - AndroidUtilities.dp(12.0f), i15 - AndroidUtilities.dp(f7), AndroidUtilities.dp(12.0f) + i14, i15 - AndroidUtilities.dp(16.0f));
            this.f52637t.setAlpha(i13);
            this.f52636s.setAlpha(i13);
            this.f52637t.draw(canvas);
            this.f52636s.draw(canvas);
            n11 n11Var3 = this.f52638u;
            n11Var3.c(dp - (n11Var3.f28902c / f10), dp2 - AndroidUtilities.dp(27.0f), e7, -1, canvas);
        }
        canvas.restore();
    }

    public final void b(long j3) {
        long j10;
        boolean z10;
        String str;
        String str2;
        g8 g8Var = this.f52639w;
        h8 h8Var = g8Var.f52686r;
        if (this.f52626i) {
            if (this.f52633p) {
                j10 = 2666000;
            } else if (this.f52627j == UserConfig.getInstance(h8Var.f52737c).getClientUserId()) {
                j10 = 0;
            } else {
                j10 = this.f52627j;
            }
            if (j10 != j3) {
                int i10 = (j3 > 2666000L ? 1 : (j3 == 2666000L ? 0 : -1));
                if (i10 == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.f52633p = z10;
                if (j3 == 0 || i10 == 0) {
                    j3 = UserConfig.getInstance(h8Var.f52737c).getClientUserId();
                }
                this.f52627j = j3;
                if (this.f52633p) {
                    str2 = LocaleController.getString(R.string.StarsReactionAnonymous);
                } else {
                    int i11 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
                    ImageReceiver imageReceiver = this.f52628k;
                    j9 j9Var = this.f52629l;
                    if (i11 >= 0) {
                        TLRPC.User user = MessagesController.getInstance(h8Var.f52737c).getUser(Long.valueOf(this.f52627j));
                        str = UserObject.getForcedFirstName(user);
                        j9Var.r(user);
                        imageReceiver.setForUserOrChat(user, j9Var);
                    } else {
                        TLRPC.Chat chat = MessagesController.getInstance(h8Var.f52737c).getChat(Long.valueOf(-this.f52627j));
                        if (chat == null) {
                            str = "";
                        } else {
                            str = chat.title;
                        }
                        j9Var.q(chat);
                        imageReceiver.setForUserOrChat(chat, j9Var);
                    }
                    str2 = str;
                }
                this.f52631n = new n11(str2, 12.0f, null);
                g8Var.invalidate();
            }
        }
    }
}
