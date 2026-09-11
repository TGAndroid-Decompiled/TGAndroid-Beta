package zh;

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
import org.telegram.ui.Components.f01;
import org.telegram.ui.Components.i9;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.zc;
public final class l8 {
    public int f52220a;
    public final RectF f52221b;
    public final org.telegram.ui.Components.e6 f52222c;
    public final org.telegram.ui.Components.e6 d;
    public final org.telegram.ui.Components.e6 f52223e;
    public LinearGradient f52224f;
    public final Matrix f52225g;
    public final Paint h;
    public final boolean f52226i;
    public long f52227j;
    public final ImageReceiver f52228k;
    public final i9 f52229l;
    public final i9 f52230m;
    public f01 f52231n;
    public f01 f52232o;
    public boolean f52233p;
    public final zc f52234q;
    public int f52235r;
    public Drawable f52236s;
    public Drawable f52237t;
    public f01 f52238u;
    public int v;
    public final m8 f52239w;

    public l8(m8 m8Var, boolean z10, long j3) {
        String str;
        n8 n8Var = m8Var.f52284r;
        this.f52239w = m8Var;
        this.f52221b = new RectF();
        pr prVar = pr.h;
        this.f52222c = new org.telegram.ui.Components.e6(m8Var, 0L, 600L, prVar);
        this.d = new org.telegram.ui.Components.e6(m8Var, 0L, 200L, prVar);
        this.f52223e = new org.telegram.ui.Components.e6(m8Var, 0L, 350L, prVar);
        this.f52224f = null;
        this.f52225g = new Matrix();
        this.h = new Paint(1);
        ImageReceiver imageReceiver = new ImageReceiver(m8Var);
        this.f52228k = imageReceiver;
        i9 i9Var = new i9((org.telegram.ui.ActionBar.f6) null);
        this.f52229l = i9Var;
        i9 i9Var2 = new i9((org.telegram.ui.ActionBar.f6) null);
        this.f52230m = i9Var2;
        this.f52234q = new zc(m8Var);
        this.f52226i = z10;
        this.f52227j = j3;
        if (j3 >= 0) {
            TLRPC.User user = MessagesController.getInstance(n8Var.f52337c).getUser(Long.valueOf(j3));
            str = UserObject.getForcedFirstName(user);
            i9Var.r(user);
            imageReceiver.setForUserOrChat(user, i9Var);
        } else {
            TLRPC.Chat chat = MessagesController.getInstance(n8Var.f52337c).getChat(Long.valueOf(-j3));
            if (chat == null) {
                str = "";
            } else {
                str = chat.title;
            }
            i9Var.q(chat);
            imageReceiver.setForUserOrChat(chat, i9Var);
        }
        imageReceiver.setRoundRadius(AndroidUtilities.dp(56.0f));
        imageReceiver.onAttachedToWindow();
        imageReceiver.setCrossfadeWithOldImage(true);
        i9Var2.g(21);
        i9Var2.h(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20647c8, n8Var.f52336b));
        this.f52231n = new f01(str, 12.0f, null);
    }

    public final void a(Canvas canvas) {
        float f7;
        float f10;
        float f11;
        boolean z10 = false;
        float d = this.f52222c.d(this.f52220a, false);
        int i10 = this.f52220a;
        m8 m8Var = this.f52239w;
        if (i10 >= 0 && i10 < m8Var.f52279b.size()) {
            z10 = true;
        }
        float e7 = this.d.e(z10);
        canvas.save();
        float width = (m8Var.getWidth() - AndroidUtilities.dp(80.0f)) / Math.max(1.0f, m8Var.f52282f);
        float dp = ((m8Var.f52282f - (d + 0.5f)) * width) + AndroidUtilities.dp(40.0f);
        float dp2 = AndroidUtilities.dp(40.0f);
        float f12 = width / 2.0f;
        this.f52221b.set(dp - f12, dp2 - AndroidUtilities.dp(50.0f), f12 + dp, AndroidUtilities.dp(50.0f) + dp2);
        float f13 = (0.3f * e7) + 0.7f;
        canvas.scale(f13, f13, dp, dp2);
        float a2 = this.f52234q.a(0.04f);
        canvas.scale(a2, a2, dp, dp2);
        if (e7 > 0.0f) {
            float e10 = this.f52223e.e(this.f52233p);
            if (e10 < 1.0f) {
                f7 = 255.0f;
                f10 = 40.0f;
                f11 = 2.0f;
                ImageReceiver imageReceiver = this.f52228k;
                imageReceiver.setImageCoords(dp - (AndroidUtilities.dp(56.0f) / 2.0f), dp2 - (AndroidUtilities.dp(56.0f) / 2.0f), AndroidUtilities.dp(56.0f), AndroidUtilities.dp(56.0f));
                imageReceiver.setAlpha(e7);
                imageReceiver.draw(canvas);
                imageReceiver.setAlpha(1.0f);
            } else {
                f7 = 255.0f;
                f10 = 40.0f;
                f11 = 2.0f;
            }
            if (e10 > 0.0f) {
                int i11 = (int) dp;
                int dp3 = i11 - (AndroidUtilities.dp(56.0f) / 2);
                int i12 = (int) dp2;
                int dp4 = i12 - (AndroidUtilities.dp(56.0f) / 2);
                int dp5 = (AndroidUtilities.dp(56.0f) / 2) + i11;
                int dp6 = (AndroidUtilities.dp(56.0f) / 2) + i12;
                i9 i9Var = this.f52230m;
                i9Var.setBounds(dp3, dp4, dp5, dp6);
                i9Var.f27046y = (int) (e7 * f7 * e10);
                i9Var.draw(canvas);
                i9Var.f27046y = 255;
            }
        } else {
            f7 = 255.0f;
            f10 = 40.0f;
            f11 = 2.0f;
        }
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set((dp - (this.f52232o.f25847c / f11)) - AndroidUtilities.dp(5.66f), (AndroidUtilities.dp(23.0f) + dp2) - (AndroidUtilities.dp(16.0f) / f11), (this.f52232o.f25847c / f11) + dp + AndroidUtilities.dp(5.66f), (AndroidUtilities.dp(16.0f) / f11) + AndroidUtilities.dp(23.0f) + dp2);
        canvas.drawRoundRect(rectF, rectF.height() / f11, rectF.height() / f11, m8Var.d);
        int i13 = (int) (e7 * f7);
        Paint paint = this.h;
        paint.setAlpha(i13);
        if (this.f52224f != null) {
            Matrix matrix = this.f52225g;
            matrix.reset();
            matrix.postTranslate(0.0f, rectF.top);
            this.f52224f.setLocalMatrix(matrix);
        }
        canvas.drawRoundRect(rectF, rectF.height() / f11, rectF.height() / f11, paint);
        f01 f01Var = this.f52232o;
        f01Var.c(dp - (f01Var.f25847c / f11), AndroidUtilities.dp(23.0f) + dp2, e7, -1, canvas);
        f01 f01Var2 = this.f52231n;
        f01Var2.f25858p = width - AndroidUtilities.dp(4.0f);
        f01Var2.c(dp - (this.f52231n.l() / f11), AndroidUtilities.dp(42.0f) + dp2, e7, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G6, m8Var.f52284r.f52336b), canvas);
        if (this.v > 0) {
            int i14 = (int) dp;
            int i15 = (int) dp2;
            this.f52237t.setBounds(i14 - AndroidUtilities.dp(12.0f), i15 - AndroidUtilities.dp(f10), AndroidUtilities.dp(12.0f) + i14, i15 - AndroidUtilities.dp(16.0f));
            this.f52236s.setBounds(i14 - AndroidUtilities.dp(12.0f), i15 - AndroidUtilities.dp(f10), AndroidUtilities.dp(12.0f) + i14, i15 - AndroidUtilities.dp(16.0f));
            this.f52237t.setAlpha(i13);
            this.f52236s.setAlpha(i13);
            this.f52237t.draw(canvas);
            this.f52236s.draw(canvas);
            f01 f01Var3 = this.f52238u;
            f01Var3.c(dp - (f01Var3.f25847c / f11), dp2 - AndroidUtilities.dp(27.0f), e7, -1, canvas);
        }
        canvas.restore();
    }

    public final void b(long j3) {
        long j10;
        boolean z10;
        String str;
        String str2;
        m8 m8Var = this.f52239w;
        n8 n8Var = m8Var.f52284r;
        if (this.f52226i) {
            if (this.f52233p) {
                j10 = 2666000;
            } else if (this.f52227j == UserConfig.getInstance(n8Var.f52337c).getClientUserId()) {
                j10 = 0;
            } else {
                j10 = this.f52227j;
            }
            if (j10 != j3) {
                int i10 = (j3 > 2666000L ? 1 : (j3 == 2666000L ? 0 : -1));
                if (i10 == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.f52233p = z10;
                if (j3 == 0 || i10 == 0) {
                    j3 = UserConfig.getInstance(n8Var.f52337c).getClientUserId();
                }
                this.f52227j = j3;
                if (this.f52233p) {
                    str2 = LocaleController.getString(R.string.StarsReactionAnonymous);
                } else {
                    ImageReceiver imageReceiver = this.f52228k;
                    i9 i9Var = this.f52229l;
                    if (j3 >= 0) {
                        TLRPC.User user = MessagesController.getInstance(n8Var.f52337c).getUser(Long.valueOf(this.f52227j));
                        str = UserObject.getForcedFirstName(user);
                        i9Var.r(user);
                        imageReceiver.setForUserOrChat(user, i9Var);
                    } else {
                        TLRPC.Chat chat = MessagesController.getInstance(n8Var.f52337c).getChat(Long.valueOf(-this.f52227j));
                        if (chat == null) {
                            str = "";
                        } else {
                            str = chat.title;
                        }
                        i9Var.q(chat);
                        imageReceiver.setForUserOrChat(chat, i9Var);
                    }
                    str2 = str;
                }
                this.f52231n = new f01(str2, 12.0f, null);
                m8Var.invalidate();
            }
        }
    }
}
