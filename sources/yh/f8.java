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
import org.telegram.ui.Components.m11;
public final class f8 {
    public int f52654a;
    public final RectF f52655b;
    public final org.telegram.ui.Components.g6 f52656c;
    public final org.telegram.ui.Components.g6 d;
    public final org.telegram.ui.Components.g6 f52657e;
    public LinearGradient f52658f;
    public final Matrix f52659g;
    public final Paint h;
    public final boolean f52660i;
    public long f52661j;
    public final ImageReceiver f52662k;
    public final j9 f52663l;
    public final j9 f52664m;
    public m11 f52665n;
    public m11 f52666o;
    public boolean f52667p;
    public final bd f52668q;
    public int f52669r;
    public Drawable f52670s;
    public Drawable f52671t;
    public m11 f52672u;
    public int v;
    public final g8 f52673w;

    public f8(g8 g8Var, boolean z10, long j3) {
        String str;
        h8 h8Var = g8Var.f52720r;
        this.f52673w = g8Var;
        this.f52655b = new RectF();
        is isVar = is.h;
        this.f52656c = new org.telegram.ui.Components.g6(g8Var, 0L, 600L, isVar);
        this.d = new org.telegram.ui.Components.g6(g8Var, 0L, 200L, isVar);
        this.f52657e = new org.telegram.ui.Components.g6(g8Var, 0L, 350L, isVar);
        this.f52658f = null;
        this.f52659g = new Matrix();
        this.h = new Paint(1);
        ImageReceiver imageReceiver = new ImageReceiver(g8Var);
        this.f52662k = imageReceiver;
        j9 j9Var = new j9((org.telegram.ui.ActionBar.d6) null);
        this.f52663l = j9Var;
        j9 j9Var2 = new j9((org.telegram.ui.ActionBar.d6) null);
        this.f52664m = j9Var2;
        this.f52668q = new bd(g8Var);
        this.f52660i = z10;
        this.f52661j = j3;
        if (j3 >= 0) {
            TLRPC.User user = MessagesController.getInstance(h8Var.f52771c).getUser(Long.valueOf(j3));
            str = UserObject.getForcedFirstName(user);
            j9Var.r(user);
            imageReceiver.setForUserOrChat(user, j9Var);
        } else {
            TLRPC.Chat chat = MessagesController.getInstance(h8Var.f52771c).getChat(Long.valueOf(-j3));
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
        j9Var2.h(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20807c8, h8Var.f52770b));
        this.f52665n = new m11(str, 12.0f, null);
    }

    public final void a(Canvas canvas) {
        float f7;
        float f10;
        float f11;
        boolean z10 = false;
        float d = this.f52656c.d(this.f52654a, false);
        int i10 = this.f52654a;
        g8 g8Var = this.f52673w;
        if (i10 >= 0 && i10 < g8Var.f52715b.size()) {
            z10 = true;
        }
        float e7 = this.d.e(z10);
        canvas.save();
        float width = (g8Var.getWidth() - AndroidUtilities.dp(80.0f)) / Math.max(1.0f, g8Var.f52718f);
        float dp = ((g8Var.f52718f - (d + 0.5f)) * width) + AndroidUtilities.dp(40.0f);
        float dp2 = AndroidUtilities.dp(40.0f);
        float f12 = width / 2.0f;
        this.f52655b.set(dp - f12, dp2 - AndroidUtilities.dp(50.0f), f12 + dp, AndroidUtilities.dp(50.0f) + dp2);
        float f13 = (0.3f * e7) + 0.7f;
        canvas.scale(f13, f13, dp, dp2);
        float a2 = this.f52668q.a(0.04f);
        canvas.scale(a2, a2, dp, dp2);
        if (e7 > 0.0f) {
            float e10 = this.f52657e.e(this.f52667p);
            if (e10 < 1.0f) {
                f11 = 255.0f;
                f7 = 40.0f;
                f10 = 2.0f;
                ImageReceiver imageReceiver = this.f52662k;
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
                j9 j9Var = this.f52664m;
                j9Var.setBounds(dp3, dp4, dp5, dp6);
                j9Var.f27674y = (int) (e7 * f11 * e10);
                j9Var.draw(canvas);
                j9Var.f27674y = 255;
            }
        } else {
            f7 = 40.0f;
            f10 = 2.0f;
            f11 = 255.0f;
        }
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set((dp - (this.f52666o.f28678c / f10)) - AndroidUtilities.dp(5.66f), (AndroidUtilities.dp(23.0f) + dp2) - (AndroidUtilities.dp(16.0f) / f10), (this.f52666o.f28678c / f10) + dp + AndroidUtilities.dp(5.66f), (AndroidUtilities.dp(16.0f) / f10) + AndroidUtilities.dp(23.0f) + dp2);
        canvas.drawRoundRect(rectF, rectF.height() / f10, rectF.height() / f10, g8Var.d);
        int i13 = (int) (e7 * f11);
        Paint paint = this.h;
        paint.setAlpha(i13);
        if (this.f52658f != null) {
            Matrix matrix = this.f52659g;
            matrix.reset();
            matrix.postTranslate(0.0f, rectF.top);
            this.f52658f.setLocalMatrix(matrix);
        }
        canvas.drawRoundRect(rectF, rectF.height() / f10, rectF.height() / f10, paint);
        m11 m11Var = this.f52666o;
        m11Var.c(dp - (m11Var.f28678c / f10), AndroidUtilities.dp(23.0f) + dp2, e7, -1, canvas);
        m11 m11Var2 = this.f52665n;
        m11Var2.f28689p = width - AndroidUtilities.dp(4.0f);
        m11Var2.c(dp - (this.f52665n.l() / f10), AndroidUtilities.dp(42.0f) + dp2, e7, org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.G6, g8Var.f52720r.f52770b), canvas);
        if (this.v > 0) {
            int i14 = (int) dp;
            int i15 = (int) dp2;
            this.f52671t.setBounds(i14 - AndroidUtilities.dp(12.0f), i15 - AndroidUtilities.dp(f7), AndroidUtilities.dp(12.0f) + i14, i15 - AndroidUtilities.dp(16.0f));
            this.f52670s.setBounds(i14 - AndroidUtilities.dp(12.0f), i15 - AndroidUtilities.dp(f7), AndroidUtilities.dp(12.0f) + i14, i15 - AndroidUtilities.dp(16.0f));
            this.f52671t.setAlpha(i13);
            this.f52670s.setAlpha(i13);
            this.f52671t.draw(canvas);
            this.f52670s.draw(canvas);
            m11 m11Var3 = this.f52672u;
            m11Var3.c(dp - (m11Var3.f28678c / f10), dp2 - AndroidUtilities.dp(27.0f), e7, -1, canvas);
        }
        canvas.restore();
    }

    public final void b(long j3) {
        long j10;
        boolean z10;
        String str;
        String str2;
        g8 g8Var = this.f52673w;
        h8 h8Var = g8Var.f52720r;
        if (this.f52660i) {
            if (this.f52667p) {
                j10 = 2666000;
            } else if (this.f52661j == UserConfig.getInstance(h8Var.f52771c).getClientUserId()) {
                j10 = 0;
            } else {
                j10 = this.f52661j;
            }
            if (j10 != j3) {
                int i10 = (j3 > 2666000L ? 1 : (j3 == 2666000L ? 0 : -1));
                if (i10 == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.f52667p = z10;
                if (j3 == 0 || i10 == 0) {
                    j3 = UserConfig.getInstance(h8Var.f52771c).getClientUserId();
                }
                this.f52661j = j3;
                if (this.f52667p) {
                    str2 = LocaleController.getString(R.string.StarsReactionAnonymous);
                } else {
                    int i11 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
                    ImageReceiver imageReceiver = this.f52662k;
                    j9 j9Var = this.f52663l;
                    if (i11 >= 0) {
                        TLRPC.User user = MessagesController.getInstance(h8Var.f52771c).getUser(Long.valueOf(this.f52661j));
                        str = UserObject.getForcedFirstName(user);
                        j9Var.r(user);
                        imageReceiver.setForUserOrChat(user, j9Var);
                    } else {
                        TLRPC.Chat chat = MessagesController.getInstance(h8Var.f52771c).getChat(Long.valueOf(-this.f52661j));
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
                this.f52665n = new m11(str2, 12.0f, null);
                g8Var.invalidate();
            }
        }
    }
}
