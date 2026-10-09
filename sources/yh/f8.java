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
import org.telegram.ui.Components.hs;
import org.telegram.ui.Components.j9;
import org.telegram.ui.Components.l11;
public final class f8 {
    public int f52528a;
    public final RectF f52529b;
    public final org.telegram.ui.Components.g6 f52530c;
    public final org.telegram.ui.Components.g6 d;
    public final org.telegram.ui.Components.g6 f52531e;
    public LinearGradient f52532f;
    public final Matrix f52533g;
    public final Paint h;
    public final boolean f52534i;
    public long f52535j;
    public final ImageReceiver f52536k;
    public final j9 f52537l;
    public final j9 f52538m;
    public l11 f52539n;
    public l11 f52540o;
    public boolean f52541p;
    public final bd f52542q;
    public int f52543r;
    public Drawable f52544s;
    public Drawable f52545t;
    public l11 f52546u;
    public int v;
    public final g8 f52547w;

    public f8(g8 g8Var, boolean z10, long j3) {
        String str;
        h8 h8Var = g8Var.f52596r;
        this.f52547w = g8Var;
        this.f52529b = new RectF();
        hs hsVar = hs.h;
        this.f52530c = new org.telegram.ui.Components.g6(g8Var, 0L, 600L, hsVar);
        this.d = new org.telegram.ui.Components.g6(g8Var, 0L, 200L, hsVar);
        this.f52531e = new org.telegram.ui.Components.g6(g8Var, 0L, 350L, hsVar);
        this.f52532f = null;
        this.f52533g = new Matrix();
        this.h = new Paint(1);
        ImageReceiver imageReceiver = new ImageReceiver(g8Var);
        this.f52536k = imageReceiver;
        j9 j9Var = new j9((org.telegram.ui.ActionBar.e6) null);
        this.f52537l = j9Var;
        j9 j9Var2 = new j9((org.telegram.ui.ActionBar.e6) null);
        this.f52538m = j9Var2;
        this.f52542q = new bd(g8Var);
        this.f52534i = z10;
        this.f52535j = j3;
        if (j3 >= 0) {
            TLRPC.User user = MessagesController.getInstance(h8Var.f52647c).getUser(Long.valueOf(j3));
            str = UserObject.getForcedFirstName(user);
            j9Var.r(user);
            imageReceiver.setForUserOrChat(user, j9Var);
        } else {
            TLRPC.Chat chat = MessagesController.getInstance(h8Var.f52647c).getChat(Long.valueOf(-j3));
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
        j9Var2.h(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f20782c8, h8Var.f52646b));
        this.f52539n = new l11(str, 12.0f, null);
    }

    public final void a(Canvas canvas) {
        float f7;
        float f10;
        float f11;
        boolean z10 = false;
        float d = this.f52530c.d(this.f52528a, false);
        int i10 = this.f52528a;
        g8 g8Var = this.f52547w;
        if (i10 >= 0 && i10 < g8Var.f52591b.size()) {
            z10 = true;
        }
        float e7 = this.d.e(z10);
        canvas.save();
        float width = (g8Var.getWidth() - AndroidUtilities.dp(80.0f)) / Math.max(1.0f, g8Var.f52594f);
        float dp = ((g8Var.f52594f - (d + 0.5f)) * width) + AndroidUtilities.dp(40.0f);
        float dp2 = AndroidUtilities.dp(40.0f);
        float f12 = width / 2.0f;
        this.f52529b.set(dp - f12, dp2 - AndroidUtilities.dp(50.0f), f12 + dp, AndroidUtilities.dp(50.0f) + dp2);
        float f13 = (0.3f * e7) + 0.7f;
        canvas.scale(f13, f13, dp, dp2);
        float a2 = this.f52542q.a(0.04f);
        canvas.scale(a2, a2, dp, dp2);
        if (e7 > 0.0f) {
            float e10 = this.f52531e.e(this.f52541p);
            if (e10 < 1.0f) {
                f11 = 255.0f;
                f7 = 40.0f;
                f10 = 2.0f;
                ImageReceiver imageReceiver = this.f52536k;
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
                j9 j9Var = this.f52538m;
                j9Var.setBounds(dp3, dp4, dp5, dp6);
                j9Var.f27660y = (int) (e7 * f11 * e10);
                j9Var.draw(canvas);
                j9Var.f27660y = 255;
            }
        } else {
            f7 = 40.0f;
            f10 = 2.0f;
            f11 = 255.0f;
        }
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set((dp - (this.f52540o.f28222c / f10)) - AndroidUtilities.dp(5.66f), (AndroidUtilities.dp(23.0f) + dp2) - (AndroidUtilities.dp(16.0f) / f10), (this.f52540o.f28222c / f10) + dp + AndroidUtilities.dp(5.66f), (AndroidUtilities.dp(16.0f) / f10) + AndroidUtilities.dp(23.0f) + dp2);
        canvas.drawRoundRect(rectF, rectF.height() / f10, rectF.height() / f10, g8Var.d);
        int i13 = (int) (e7 * f11);
        Paint paint = this.h;
        paint.setAlpha(i13);
        if (this.f52532f != null) {
            Matrix matrix = this.f52533g;
            matrix.reset();
            matrix.postTranslate(0.0f, rectF.top);
            this.f52532f.setLocalMatrix(matrix);
        }
        canvas.drawRoundRect(rectF, rectF.height() / f10, rectF.height() / f10, paint);
        l11 l11Var = this.f52540o;
        l11Var.c(dp - (l11Var.f28222c / f10), AndroidUtilities.dp(23.0f) + dp2, e7, -1, canvas);
        l11 l11Var2 = this.f52539n;
        l11Var2.f28233p = width - AndroidUtilities.dp(4.0f);
        l11Var2.c(dp - (this.f52539n.l() / f10), AndroidUtilities.dp(42.0f) + dp2, e7, org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.G6, g8Var.f52596r.f52646b), canvas);
        if (this.v > 0) {
            int i14 = (int) dp;
            int i15 = (int) dp2;
            this.f52545t.setBounds(i14 - AndroidUtilities.dp(12.0f), i15 - AndroidUtilities.dp(f7), AndroidUtilities.dp(12.0f) + i14, i15 - AndroidUtilities.dp(16.0f));
            this.f52544s.setBounds(i14 - AndroidUtilities.dp(12.0f), i15 - AndroidUtilities.dp(f7), AndroidUtilities.dp(12.0f) + i14, i15 - AndroidUtilities.dp(16.0f));
            this.f52545t.setAlpha(i13);
            this.f52544s.setAlpha(i13);
            this.f52545t.draw(canvas);
            this.f52544s.draw(canvas);
            l11 l11Var3 = this.f52546u;
            l11Var3.c(dp - (l11Var3.f28222c / f10), dp2 - AndroidUtilities.dp(27.0f), e7, -1, canvas);
        }
        canvas.restore();
    }

    public final void b(long j3) {
        long j10;
        boolean z10;
        String str;
        String str2;
        g8 g8Var = this.f52547w;
        h8 h8Var = g8Var.f52596r;
        if (this.f52534i) {
            if (this.f52541p) {
                j10 = 2666000;
            } else if (this.f52535j == UserConfig.getInstance(h8Var.f52647c).getClientUserId()) {
                j10 = 0;
            } else {
                j10 = this.f52535j;
            }
            if (j10 != j3) {
                int i10 = (j3 > 2666000L ? 1 : (j3 == 2666000L ? 0 : -1));
                if (i10 == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.f52541p = z10;
                if (j3 == 0 || i10 == 0) {
                    j3 = UserConfig.getInstance(h8Var.f52647c).getClientUserId();
                }
                this.f52535j = j3;
                if (this.f52541p) {
                    str2 = LocaleController.getString(R.string.StarsReactionAnonymous);
                } else {
                    int i11 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
                    ImageReceiver imageReceiver = this.f52536k;
                    j9 j9Var = this.f52537l;
                    if (i11 >= 0) {
                        TLRPC.User user = MessagesController.getInstance(h8Var.f52647c).getUser(Long.valueOf(this.f52535j));
                        str = UserObject.getForcedFirstName(user);
                        j9Var.r(user);
                        imageReceiver.setForUserOrChat(user, j9Var);
                    } else {
                        TLRPC.Chat chat = MessagesController.getInstance(h8Var.f52647c).getChat(Long.valueOf(-this.f52535j));
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
                this.f52539n = new l11(str2, 12.0f, null);
                g8Var.invalidate();
            }
        }
    }
}
