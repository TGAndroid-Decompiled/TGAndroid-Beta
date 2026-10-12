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
import org.telegram.ui.Components.ad;
import org.telegram.ui.Components.es;
import org.telegram.ui.Components.h11;
import org.telegram.ui.Components.k9;
public final class f8 {
    public int f50522a;
    public final RectF f50523b;
    public final org.telegram.ui.Components.g6 f50524c;
    public final org.telegram.ui.Components.g6 d;
    public final org.telegram.ui.Components.g6 e;
    public LinearGradient f50525f;
    public final Matrix f50526g;
    public final Paint h;
    public final boolean f50527i;
    public long f50528j;
    public final ImageReceiver f50529k;
    public final k9 f50530l;
    public final k9 f50531m;
    public h11 f50532n;
    public h11 f50533o;
    public boolean f50534p;
    public final ad f50535q;
    public int f50536r;
    public Drawable f50537s;
    public Drawable f50538t;
    public h11 f50539u;
    public int v;
    public final g8 f50540w;

    public f8(g8 g8Var, boolean z10, long j10) {
        String str;
        h8 h8Var = g8Var.f50591r;
        this.f50540w = g8Var;
        this.f50523b = new RectF();
        es esVar = es.h;
        this.f50524c = new org.telegram.ui.Components.g6(g8Var, 0L, 600L, esVar);
        this.d = new org.telegram.ui.Components.g6(g8Var, 0L, 200L, esVar);
        this.e = new org.telegram.ui.Components.g6(g8Var, 0L, 350L, esVar);
        this.f50525f = null;
        this.f50526g = new Matrix();
        this.h = new Paint(1);
        ImageReceiver imageReceiver = new ImageReceiver(g8Var);
        this.f50529k = imageReceiver;
        k9 k9Var = new k9((org.telegram.ui.ActionBar.c6) null);
        this.f50530l = k9Var;
        k9 k9Var2 = new k9((org.telegram.ui.ActionBar.c6) null);
        this.f50531m = k9Var2;
        this.f50535q = new ad(g8Var);
        this.f50527i = z10;
        this.f50528j = j10;
        if (j10 >= 0) {
            TLRPC.User user = MessagesController.getInstance(h8Var.f50641c).getUser(Long.valueOf(j10));
            str = UserObject.getForcedFirstName(user);
            k9Var.r(user);
            imageReceiver.setForUserOrChat(user, k9Var);
        } else {
            TLRPC.Chat chat = MessagesController.getInstance(h8Var.f50641c).getChat(Long.valueOf(-j10));
            if (chat == null) {
                str = "";
            } else {
                str = chat.title;
            }
            k9Var.q(chat);
            imageReceiver.setForUserOrChat(chat, k9Var);
        }
        imageReceiver.setRoundRadius(AndroidUtilities.dp(56.0f));
        imageReceiver.onAttachedToWindow();
        imageReceiver.setCrossfadeWithOldImage(true);
        k9Var2.g(21);
        k9Var2.h(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19884c8, h8Var.f50640b));
        this.f50532n = new h11(str, 12.0f, null);
    }

    public final void a(Canvas canvas) {
        float f7;
        float f10;
        float f11;
        boolean z10 = false;
        float d = this.f50524c.d(this.f50522a, false);
        int i10 = this.f50522a;
        g8 g8Var = this.f50540w;
        if (i10 >= 0 && i10 < g8Var.f50587b.size()) {
            z10 = true;
        }
        float e = this.d.e(z10);
        canvas.save();
        float width = (g8Var.getWidth() - AndroidUtilities.dp(80.0f)) / Math.max(1.0f, g8Var.f50589f);
        float dp = ((g8Var.f50589f - (d + 0.5f)) * width) + AndroidUtilities.dp(40.0f);
        float dp2 = AndroidUtilities.dp(40.0f);
        float f12 = width / 2.0f;
        this.f50523b.set(dp - f12, dp2 - AndroidUtilities.dp(50.0f), f12 + dp, AndroidUtilities.dp(50.0f) + dp2);
        float f13 = (0.3f * e) + 0.7f;
        canvas.scale(f13, f13, dp, dp2);
        float a2 = this.f50535q.a(0.04f);
        canvas.scale(a2, a2, dp, dp2);
        if (e > 0.0f) {
            float e7 = this.e.e(this.f50534p);
            if (e7 < 1.0f) {
                f11 = 255.0f;
                f7 = 40.0f;
                f10 = 2.0f;
                ImageReceiver imageReceiver = this.f50529k;
                imageReceiver.setImageCoords(dp - (AndroidUtilities.dp(56.0f) / 2.0f), dp2 - (AndroidUtilities.dp(56.0f) / 2.0f), AndroidUtilities.dp(56.0f), AndroidUtilities.dp(56.0f));
                imageReceiver.setAlpha(e);
                imageReceiver.draw(canvas);
                imageReceiver.setAlpha(1.0f);
            } else {
                f7 = 40.0f;
                f10 = 2.0f;
                f11 = 255.0f;
            }
            if (e7 > 0.0f) {
                int i11 = (int) dp;
                int dp3 = i11 - (AndroidUtilities.dp(56.0f) / 2);
                int i12 = (int) dp2;
                int dp4 = i12 - (AndroidUtilities.dp(56.0f) / 2);
                int dp5 = (AndroidUtilities.dp(56.0f) / 2) + i11;
                int dp6 = (AndroidUtilities.dp(56.0f) / 2) + i12;
                k9 k9Var = this.f50531m;
                k9Var.setBounds(dp3, dp4, dp5, dp6);
                k9Var.f26635y = (int) (e * f11 * e7);
                k9Var.draw(canvas);
                k9Var.f26635y = 255;
            }
        } else {
            f7 = 40.0f;
            f10 = 2.0f;
            f11 = 255.0f;
        }
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set((dp - (this.f50533o.f25473c / f10)) - AndroidUtilities.dp(5.66f), (AndroidUtilities.dp(23.0f) + dp2) - (AndroidUtilities.dp(16.0f) / f10), (this.f50533o.f25473c / f10) + dp + AndroidUtilities.dp(5.66f), (AndroidUtilities.dp(16.0f) / f10) + AndroidUtilities.dp(23.0f) + dp2);
        canvas.drawRoundRect(rectF, rectF.height() / f10, rectF.height() / f10, g8Var.d);
        int i13 = (int) (e * f11);
        Paint paint = this.h;
        paint.setAlpha(i13);
        if (this.f50525f != null) {
            Matrix matrix = this.f50526g;
            matrix.reset();
            matrix.postTranslate(0.0f, rectF.top);
            this.f50525f.setLocalMatrix(matrix);
        }
        canvas.drawRoundRect(rectF, rectF.height() / f10, rectF.height() / f10, paint);
        h11 h11Var = this.f50533o;
        h11Var.c(dp - (h11Var.f25473c / f10), AndroidUtilities.dp(23.0f) + dp2, e, -1, canvas);
        h11 h11Var2 = this.f50532n;
        h11Var2.f25483p = width - AndroidUtilities.dp(4.0f);
        h11Var2.c(dp - (this.f50532n.l() / f10), AndroidUtilities.dp(42.0f) + dp2, e, org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.G6, g8Var.f50591r.f50640b), canvas);
        if (this.v > 0) {
            int i14 = (int) dp;
            int i15 = (int) dp2;
            this.f50538t.setBounds(i14 - AndroidUtilities.dp(12.0f), i15 - AndroidUtilities.dp(f7), AndroidUtilities.dp(12.0f) + i14, i15 - AndroidUtilities.dp(16.0f));
            this.f50537s.setBounds(i14 - AndroidUtilities.dp(12.0f), i15 - AndroidUtilities.dp(f7), AndroidUtilities.dp(12.0f) + i14, i15 - AndroidUtilities.dp(16.0f));
            this.f50538t.setAlpha(i13);
            this.f50537s.setAlpha(i13);
            this.f50538t.draw(canvas);
            this.f50537s.draw(canvas);
            h11 h11Var3 = this.f50539u;
            h11Var3.c(dp - (h11Var3.f25473c / f10), dp2 - AndroidUtilities.dp(27.0f), e, -1, canvas);
        }
        canvas.restore();
    }

    public final void b(long j10) {
        long j11;
        boolean z10;
        String str;
        String str2;
        g8 g8Var = this.f50540w;
        h8 h8Var = g8Var.f50591r;
        if (this.f50527i) {
            if (this.f50534p) {
                j11 = 2666000;
            } else if (this.f50528j == UserConfig.getInstance(h8Var.f50641c).getClientUserId()) {
                j11 = 0;
            } else {
                j11 = this.f50528j;
            }
            if (j11 != j10) {
                int i10 = (j10 > 2666000L ? 1 : (j10 == 2666000L ? 0 : -1));
                if (i10 == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.f50534p = z10;
                if (j10 == 0 || i10 == 0) {
                    j10 = UserConfig.getInstance(h8Var.f50641c).getClientUserId();
                }
                this.f50528j = j10;
                if (this.f50534p) {
                    str2 = LocaleController.getString(R.string.StarsReactionAnonymous);
                } else {
                    int i11 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
                    ImageReceiver imageReceiver = this.f50529k;
                    k9 k9Var = this.f50530l;
                    if (i11 >= 0) {
                        TLRPC.User user = MessagesController.getInstance(h8Var.f50641c).getUser(Long.valueOf(this.f50528j));
                        str = UserObject.getForcedFirstName(user);
                        k9Var.r(user);
                        imageReceiver.setForUserOrChat(user, k9Var);
                    } else {
                        TLRPC.Chat chat = MessagesController.getInstance(h8Var.f50641c).getChat(Long.valueOf(-this.f50528j));
                        if (chat == null) {
                            str = "";
                        } else {
                            str = chat.title;
                        }
                        k9Var.q(chat);
                        imageReceiver.setForUserOrChat(chat, k9Var);
                    }
                    str2 = str;
                }
                this.f50532n = new h11(str2, 12.0f, null);
                g8Var.invalidate();
            }
        }
    }
}
